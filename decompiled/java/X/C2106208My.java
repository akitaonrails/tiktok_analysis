package X;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.08My, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2106208My {
    public static final byte[] LIZIZ(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        LIZ(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static long LIZ(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }
}
