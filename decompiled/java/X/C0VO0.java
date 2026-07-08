package X;

import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0VO0, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VO0 {
    public static void LIZ(String str) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        if (C2212231Bi9.LJIILLIIL) {
            StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
            for (int i = 1; i < stackTrace.length; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                String className = stackTraceElement.getClassName();
                if (!className.equals(Thread.class.getCanonicalName()) && !className.equals(C0VO0.class.getCanonicalName())) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(e3.h);
                    sbLIZ2.append(stackTraceElement.getFileName());
                    sbLIZ2.append(":");
                    sbLIZ2.append(stackTraceElement.getLineNumber());
                    sbLIZ2.append(")#");
                    sbLIZ2.append(stackTraceElement.getMethodName());
                    sbLIZ2.append(". ");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    break;
                }
            }
            strLIZIZ = "";
        } else {
            strLIZIZ = "";
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
