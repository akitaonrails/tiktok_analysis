package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Qxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C687420Qxo extends SQLiteOpenHelper {
    public C687420Qxo(Context context) {
        super(context, "sug_server_cache.db", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) throws Throwable {
        Cursor cursorRawQuery;
        super.onConfigure(sQLiteDatabase);
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.enableWriteAheadLogging();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PRAGMA cache_size = ");
                sbLIZ.append(5);
                sQLiteDatabase.execSQL(C2188811AlT.LIZIZ(sbLIZ));
                if (sQLiteDatabase != null && (cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*) FROM server_sug_cache", null)) != null) {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            long j = cursorRawQuery.getLong(0);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Server cache Database initialized. Total count: ");
                            sbLIZ2.append(j);
                            C2188811AlT.LIZIZ(sbLIZ2);
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
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("CREATE TABLE server_sug_cache (\n    id INTEGER PRIMARY KEY AUTOINCREMENT,\n    content TEXT UNIQUE,\n    entity TEXT,\n    timestamp INTEGER\n)");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase != null) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS server_sug_cache");
        }
        onCreate(sQLiteDatabase);
    }
}
