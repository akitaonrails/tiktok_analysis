package X;

import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;

/* JADX INFO: renamed from: X.082O, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C082O {
    public static final String LIZ() {
        StackTraceElement[] stackTrace = ThreadMethodProxy.getStackTrace(C786410Ut5.u3());
        StringBuilder sb = new StringBuilder();
        int length = stackTrace.length;
        for (int i = 0; i < length; i++) {
            StackTraceElement stackTraceElement = stackTrace[i];
            if (i >= 10) {
                return sb.toString();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("at ");
            sbLIZ.append(stackTraceElement);
            sbLIZ.append('\n');
            sb.append(C2188811AlT.LIZIZ(sbLIZ));
        }
        return sb.toString();
    }
}
