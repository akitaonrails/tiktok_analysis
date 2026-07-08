package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: X.13SZ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public class C13SZ {
    public static final String LIZIZ(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static final void LIZ(Throwable th, Throwable th2) {
        if (th != th2) {
            C19991713Jz.LIZ.LIZ(th, th2);
        }
    }
}
