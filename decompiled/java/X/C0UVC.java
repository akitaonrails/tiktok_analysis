package X;

import android.os.Process;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UVC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UVC {
    public static final C0UVC LIZ = new C0UVC();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";

    public static void LIZ(String str) {
        StringBuilder sb = new StringBuilder(50);
        sb.append("PID : [");
        sb.append(Process.myTid());
        sb.append("]\n [");
        if (LIZIZ.length() > 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("previous : ");
            sbLIZ.append(LIZIZ);
            sbLIZ.append(", ");
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (LIZJ.length() > 0) {
            sb.append("\n current -> ");
            sb.append(LIZJ);
            if (LIZLLL.length() > 0) {
                sb.append("#{");
                sb.append(LIZLLL);
                sb.append("}");
            }
        }
        sb.append("] ");
        sb.append(str);
        C20441214yg.LIZIZ("LiveMatchLog", sb.toString());
        LIZLLL = "";
    }

    public static void LIZIZ(Throwable th) {
        StackTraceElement[] stackTrace;
        String name = C0UVC.class.getName();
        if (th != null) {
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = null;
        }
        C20441214yg.LJIIJ(6, name, stackTrace);
    }

    public static final void LIZJ(String str) {
        if (!Intrinsics.LJFF(str, LIZJ)) {
            LIZLLL = "";
            LIZIZ = LIZJ;
            LIZJ = str;
        }
    }
}
