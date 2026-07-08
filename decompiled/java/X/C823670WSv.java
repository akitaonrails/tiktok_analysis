package X;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.core.app.JobIntentService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.crash.LaunchProtectService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.Thread;

/* JADX INFO: renamed from: X.0WSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C823670WSv {
    public static Context LIZ;
    public static volatile long LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static volatile boolean LJ;
    public static C823690WSx LJFF;
    public static SharedPreferences LJI;
    public static Thread.UncaughtExceptionHandler LJII;
    public static final C823660WSu LJIIIIZZ = new C823660WSu();

    public static void LIZ() {
        if (LIZ == null) {
            return;
        }
        String string = LIZJ().getString("crash_stack", null);
        if (!TextUtils.isEmpty(string)) {
            LJFF("launch_crash_protect_success");
            C805380Via.LJFF("LaunchProtectException", "LaunchCrashInterceptor", new C823680WSw("LaunchCrashInterceptor", string));
            LJI("crash_stack", null);
            LJII(0, true, false);
        }
        String string2 = LIZJ().getString("native_crash_stack", null);
        if (TextUtils.isEmpty(string2)) {
            return;
        }
        LJFF("launch_crash_protect_success");
        C805380Via.LIZ("LaunchProtectException", string2, null, "LaunchCrashInterceptor");
        LJI("native_crash_stack", null);
        LJII(0, true, true);
    }

    public static SharedPreferences LIZJ() {
        if (LJI == null) {
            LJI = LIZ.getSharedPreferences("launch_crash_intercept_sp", 0);
        }
        return LJI;
    }

    public static C823690WSx LIZLLL() {
        if (LJFF == null) {
            LJFF = new C823690WSx(LIZ);
        }
        return LJFF;
    }

    public static boolean LJ() {
        if (LIZ != null) {
            return System.currentTimeMillis() - LIZIZ <= 30000 || LIZJ || !LJ;
        }
        return false;
    }

    public static void LJFF(String str) {
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("event_name", str);
            C20684815ws.LJIILLIIL("launch_protect_event", c2344009Gk.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C805380Via.LJFF("LaunchProtectException", "LaunchCrashInterceptor", new C823680WSw("LaunchCrashInterceptor", "report event to tea failed" + th));
        }
    }

    public static void LJI(String str, String str2) {
        LIZJ().edit().putString(str, str2).commit();
    }

    public static void LIZIZ(Context context, String str, boolean z) {
        int i;
        if (z) {
            i = LIZJ().getInt("native_crash_count", 0);
        } else {
            i = LIZJ().getInt("crash_count", 0);
        }
        int i2 = i + 1;
        LJII(i2, false, z);
        if (i2 >= 3) {
            if (i2 >= 6) {
                Intent intent = new Intent();
                intent.putExtra("type", "dynamic_clear");
                JobIntentService.enqueueWork(context, (Class<?>) LaunchProtectService.class, LSPassThroughRecordSizeConfig.DEFAULT, intent);
            } else if (i2 >= 4 && !LIZLLL) {
                LIZLLL().LIZIZ();
            } else if (LIZLLL) {
                LIZLLL();
                C810380Vqe.LIZIZ.LIZ().edit().clear().commit();
                C810380Vqe.LIZ.LIZ().edit().putLong("clear_timestamp", System.currentTimeMillis()).apply();
            } else {
                LIZLLL().LIZLLL();
                LIZLLL().getClass();
                C823690WSx.LIZJ(context);
            }
            if (z) {
                LJI("native_crash_stack", str);
            } else {
                LJI("crash_stack", str);
            }
        }
    }

    public static void LJII(int i, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                LIZJ().edit().putInt("native_crash_count", i).apply();
                return;
            } else {
                LIZJ().edit().putInt("crash_count", i).apply();
                return;
            }
        }
        if (z2) {
            LIZJ().edit().putInt("native_crash_count", i).commit();
        } else {
            LIZJ().edit().putInt("crash_count", i).commit();
        }
    }
}
