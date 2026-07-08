package X;

import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: X.0jba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287360jba {
    public static void LIZ(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (str == null) {
            LIZIZ(byteArrayOutputStream, -1);
            return;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        LIZIZ(byteArrayOutputStream, bytes.length);
        byteArrayOutputStream.write(bytes, 0, bytes.length);
    }

    public static void LIZIZ(ByteArrayOutputStream byteArrayOutputStream, int i) {
        byteArrayOutputStream.write(i & 255);
        byteArrayOutputStream.write((i >>> 8) & 255);
        byteArrayOutputStream.write((i >>> 16) & 255);
        byteArrayOutputStream.write((i >>> 24) & 255);
    }
}
