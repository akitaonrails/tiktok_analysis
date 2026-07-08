package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: X.1Bh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2211551Bh3 extends SQLiteOpenHelper {
    public static final String LLILLL;
    public static final int LLILZ;
    public static final List<InterfaceC2211611Bh9> LLILZIL;
    public final int LL;
    public boolean LLILLJJLI;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("INSERT INTO global_log_event_state VALUES (");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(")");
        LLILLL = C2188811AlT.LIZIZ(sbLIZ);
        LLILZ = 5;
        LLILZIL = Arrays.asList(new InterfaceC2211611Bh9() { // from class: X.1Bh6
            @Override // X.InterfaceC2211611Bh9
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
            }
        }, new InterfaceC2211611Bh9() { // from class: X.1Bh7
            @Override // X.InterfaceC2211611Bh9
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
            }
        }, new InterfaceC2211611Bh9() { // from class: X.1Bh8
            @Override // X.InterfaceC2211611Bh9
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        }, new InterfaceC2211611Bh9() { // from class: X.1Bh5
            @Override // X.InterfaceC2211611Bh9
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
            }
        }, new InterfaceC2211611Bh9() { // from class: X.1Bh4
            @Override // X.InterfaceC2211611Bh9
            public final void LIZ(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                sQLiteDatabase.execSQL(C2211551Bh3.LLILLL);
            }
        });
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.LLILLJJLI = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.LL;
        if (!this.LLILLJJLI) {
            onConfigure(sQLiteDatabase);
        }
        LIZ(sQLiteDatabase, 0, i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.LLILLJJLI) {
            onConfigure(sQLiteDatabase);
        }
    }

    public C2211551Bh3(Context context, int i, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.LL = i;
    }

    public static void LIZ(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<InterfaceC2211611Bh9> list = LLILZIL;
        if (i2 > list.size()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Migration from ");
            sbLIZ.append(i);
            sbLIZ.append(" to ");
            sbLIZ.append(i2);
            sbLIZ.append(" was requested, but cannot be performed. Only ");
            sbLIZ.append(list.size());
            sbLIZ.append(" migrations are provided");
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        while (i < i2) {
            ((InterfaceC2211611Bh9) ListProtector.get(LLILZIL, i)).LIZ(sQLiteDatabase);
            i++;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.LLILLJJLI) {
            onConfigure(sQLiteDatabase);
        }
        LIZ(sQLiteDatabase, 0, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.LLILLJJLI) {
            onConfigure(sQLiteDatabase);
        }
        LIZ(sQLiteDatabase, i, i2);
    }
}
