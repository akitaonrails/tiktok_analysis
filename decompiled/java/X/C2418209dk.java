package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: renamed from: X.09dk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2418209dk {
    public static String LIZ(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
