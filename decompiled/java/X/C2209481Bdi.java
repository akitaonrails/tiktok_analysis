package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.1Bdi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209481Bdi {
    public static final List<String> LIZJ = Collections.singletonList("ParamsExtractManager");
    public final C0VS6 LIZ;
    public final C1867260ygu LIZIZ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0Qxp] */
    public C2209481Bdi(Context context) {
        final Context contextN3 = C786410Ut5.N3(context);
        this.LIZ = new C0VS6(new SQLiteOpenHelper(contextN3) { // from class: X.0Qxp
            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
                super.onConfigure(sQLiteDatabase);
                try {
                    sQLiteDatabase.enableWriteAheadLogging();
                    sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cp_entries (\n    cp_id TEXT PRIMARY KEY,\n    session_id TEXT NOT NULL,\n    json TEXT NOT NULL,\n    created_at INTEGER NOT NULL\n)");
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                sQLiteDatabase.execSQL("DROP INDEX IF EXISTS idx_cp_entries_session_id");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS cp_entries (\n    cp_id TEXT PRIMARY KEY,\n    session_id TEXT NOT NULL,\n    json TEXT NOT NULL,\n    created_at INTEGER NOT NULL\n)");
            }
        });
        this.LIZIZ = new C1867260ygu();
    }
}
