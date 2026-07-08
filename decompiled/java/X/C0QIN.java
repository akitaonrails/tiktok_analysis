package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QIN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QIN {
    public static AnonymousClass0956 LIZLLL;
    public static volatile C687400Qxm LJFF;
    public static final C0QIN LIZ = new C0QIN();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(15));
    public static final ConcurrentLinkedQueue<Word> LIZJ = new ConcurrentLinkedQueue<>();
    public static final C054G LJ = C2296808zG.LIZ(C0PEM.LIZJ.plus(C2296908zH.LIZ()));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0Qxm] */
    public final C687400Qxm LIZ(Context context) {
        C687400Qxm c687400Qxm = LJFF;
        if (c687400Qxm == 0) {
            synchronized (this) {
                try {
                    C687400Qxm c687400Qxm2 = LJFF;
                    c687400Qxm = c687400Qxm2;
                    if (c687400Qxm2 == null) {
                        final Context contextN3 = C786410Ut5.N3(context);
                        ?? r1 = new SQLiteOpenHelper(contextN3) { // from class: X.0Qxm
                            @Override // android.database.sqlite.SQLiteOpenHelper
                            public final void onConfigure(SQLiteDatabase sQLiteDatabase) throws Throwable {
                                super.onConfigure(sQLiteDatabase);
                                try {
                                    sQLiteDatabase.enableWriteAheadLogging();
                                    sQLiteDatabase.execSQL("PRAGMA cache_size = ?", new Integer[]{5});
                                    Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM sug_hot_search", null);
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            long j = cursorRawQuery.getLong(0);
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append("Hot Sug Database initialized. Total count: ");
                                            sbLIZ.append(j);
                                            C2188811AlT.LIZIZ(sbLIZ);
                                        }
                                        C2107108Nh.LIZ(cursorRawQuery, null);
                                    } catch (Throwable th) {
                                        th = th;
                                        try {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                TryCatchGuardChecker.doCheck(th);
                                                C2107108Nh.LIZ(cursorRawQuery, th);
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            th = null;
                                            TryCatchGuardChecker.doCheck(th);
                                            C2107108Nh.LIZ(cursorRawQuery, th);
                                            throw th;
                                        }
                                    }
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }

                            @Override // android.database.sqlite.SQLiteOpenHelper
                            public final void onCreate(SQLiteDatabase sQLiteDatabase) {
                                sQLiteDatabase.execSQL("CREATE TABLE sug_hot_search (\n    id INTEGER PRIMARY KEY AUTOINCREMENT,\n    content TEXT UNIQUE,\n    entity TEXT,\n    timestamp INTEGER\n)", new Object[0]);
                                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS idx_content_hot ON sug_hot_search(content);", new Object[0]);
                            }

                            @Override // android.database.sqlite.SQLiteOpenHelper
                            public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS sug_hot_search", new Object[0]);
                                onCreate(sQLiteDatabase);
                            }
                        };
                        LJFF = r1;
                        c687400Qxm = r1;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return c687400Qxm;
    }
}
