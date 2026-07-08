package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: X.0VY5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VY5 {
    public static final String LIZ(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }
}
