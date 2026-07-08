package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: X.0kke, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1331420kke {
    public static String LIZ(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static void LIZIZ(Throwable th) throws Throwable {
        if (!Error.class.isInstance(th)) {
            if (!RuntimeException.class.isInstance(th)) {
                throw new RuntimeException(th);
            }
            throw ((Throwable) RuntimeException.class.cast(th));
        }
        throw ((Throwable) Error.class.cast(th));
    }
}
