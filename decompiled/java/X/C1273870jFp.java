package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1273870jFp {
    public final Thread LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StackInfo{thread=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", time='");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", createStack=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1273870jFp(Thread thread, StackTraceElement[] stackTraceElementArr) {
        this.LIZ = thread;
        if (stackTraceElementArr != null) {
            StringBuilder sb = new StringBuilder();
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("    at ");
                sbLIZ.append(stackTraceElement.getClassName());
                sbLIZ.append(e3.d);
                sbLIZ.append(stackTraceElement.getMethodName());
                sbLIZ.append(e3.h);
                sbLIZ.append(stackTraceElement.getFileName());
                sbLIZ.append(" :");
                sbLIZ.append(stackTraceElement.getLineNumber());
                sbLIZ.append(")");
                sb.append(C2188811AlT.LIZIZ(sbLIZ));
                sb.append("\n");
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("\n");
            sbLIZ2.append(sb.toString());
            this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            this.LIZIZ = "none";
        }
        this.LIZJ = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());
    }
}
