package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;

/* JADX INFO: renamed from: X.0VOR, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VOR {
    public static SQLiteDatabase LIZ = null;
    public static C0VOR LIZIZ = null;
    public static int LIZJ = 200;

    public C0VOR(Context context) {
        if (context == null) {
            return;
        }
        if (C0VOS.LL == null) {
            synchronized (C0VOS.class) {
                try {
                    if (C0VOS.LL == null) {
                        C0VOS.LL = new C0VOS(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C0VOS c0vos = C0VOS.LL;
        if (c0vos != null) {
            try {
                SQLiteDatabase writableDatabase = c0vos.getWritableDatabase();
                LIZ = writableDatabase;
                if (writableDatabase != null) {
                    LIZ.execSQL(C786410Ut5.j4("CREATE TABLE IF NOT EXISTS %s(vid TEXT PRIMARY KEY,videomodel TEXT,time INTEGER)", new Object[]{"videomodel"}));
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                int i = C2187451AjH.LIZ;
                TTVideoEngineLog.d(th2);
            }
        }
    }

    public static void LIZ(Context context) {
        if (LIZIZ == null) {
            synchronized (C0VOR.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C0VOR(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VOR.LIZIZ(java.lang.String, java.lang.String):void");
    }
}
