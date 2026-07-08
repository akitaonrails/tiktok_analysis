package X;

import android.os.Looper;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import im3.c;
import java.util.HashSet;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VY1, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VY1 {
    public static final int LIZ = ((Number) C0BH2.LIZ.getValue()).intValue();
    public static final int LIZIZ = ((Number) C0BH3.LIZ.getValue()).intValue();
    public static final StackTraceElement LIZJ = new StackTraceElement("dummy", "", "", 0);
    public static final Set<String> LIZLLL;

    static {
        HashSet hashSet = new HashSet();
        LIZLLL = hashSet;
        hashSet.add(C0VY1.class.getName());
    }

    public static void LIZ(long j) {
        boolean z;
        String str;
        if (j == 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
            if (jCurrentTimeMillis < LIZ) {
                return;
            }
        } else {
            z = false;
            if (jCurrentTimeMillis < LIZIZ) {
                return;
            }
        }
        Thread threadU3 = C786410Ut5.u3();
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(threadU3);
        if (stackTrace.length != 0) {
            StringBuilder sb = new StringBuilder((stackTrace.length - 4) * 28);
            for (int i = 0; i < stackTrace.length; i++) {
                if (i >= 4) {
                    if (i > 40) {
                        break;
                    }
                    String className = stackTrace[i].getClassName();
                    if (!((HashSet) LIZLLL).contains(className)) {
                        sb.append("\tat ");
                        sb.append(className);
                        sb.append(e3.d);
                        sb.append(stackTrace[i].getMethodName());
                        sb.append(e3.h);
                        sb.append(stackTrace[i].getFileName());
                        sb.append(":");
                        sb.append(stackTrace[i].getLineNumber());
                        sb.append(")\n");
                    }
                }
            }
            C801800Vco c801800VcoLJ = C801800Vco.LJ(LIZJ, sb.toString(), null, threadU3.getName(), true, "main_json_serialize");
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            c801800VcoLJ.LIZIZ("main_json_serialize", str);
            c801800VcoLJ.LIZJ("log_type", "main_json_serialize");
            c801800VcoLJ.LIZ("duration", String.valueOf(jCurrentTimeMillis));
            c801800VcoLJ.LIZJ("crash_time", Long.valueOf(System.currentTimeMillis()));
            c801800VcoLJ.LIZJ("app_start_time", Long.valueOf(C0VX9.LIZJ()));
            c.LIZ(c801800VcoLJ);
        }
    }
}
