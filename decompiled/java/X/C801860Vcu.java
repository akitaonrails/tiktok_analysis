package X;

import android.os.Process;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.entity.Header;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vcu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801860Vcu {
    public static C801830Vcr LIZ(C802790VeP c802790VeP, String str, long j, String str2, String str3, String str4) {
        C801830Vcr c801830Vcr = new C801830Vcr();
        try {
            c801830Vcr.LIZJ("data", str4);
            c801830Vcr.LIZJ("crash_type", CrashType.GAME.getName());
            c801830Vcr.LIZJ("crash_time", Long.valueOf(j));
            c801830Vcr.LIZJ("crash_name", str2);
            c801830Vcr.LIZJ("crash_reason", str3);
            c801830Vcr.LIZJ("crash_thread_name", str);
            c801830Vcr.LIZJ("process_name", C802270VdZ.LIZJ());
            c801830Vcr.LIZJ("app_start_time", Long.valueOf(C0VX9.LIZJ()));
            c801830Vcr.LIZJ("upload_scene", "direct");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Header headerLIZIZ = Header.LIZIZ(c802790VeP, j, CrashType.GAME, Process.myPid());
        c801830Vcr.LIZJ("header", headerLIZIZ.LIZ);
        c801830Vcr.LIZIZ = headerLIZIZ;
        return c801830Vcr;
    }
}
