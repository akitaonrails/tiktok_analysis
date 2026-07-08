package X;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.12x8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19922012x8 {
    public static final Charset LIZ = Charset.forName("UTF-8");
    public static final Charset LIZIZ = Charset.forName("ISO-8859-1");
    public static final byte[] LIZJ;
    public static final ByteBuffer LIZLLL;

    public static int LIZIZ(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int LIZJ(long j) {
        return (int) (j ^ (j >>> 32));
    }

    static {
        byte[] bArr = new byte[0];
        LIZJ = bArr;
        LIZLLL = ByteBuffer.wrap(bArr);
        AbstractC19927312xz.LJIIIIZZ(bArr, 0, 0, false);
    }

    public static void LIZ(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }
}
