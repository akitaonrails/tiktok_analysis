package X;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* JADX INFO: renamed from: X.09Ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2337809Ea {
    public static String LIZ(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        th.printStackTrace(new PrintStream(byteArrayOutputStream));
        return byteArrayOutputStream.toString();
    }
}
