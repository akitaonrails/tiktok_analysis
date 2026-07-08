package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: X.0kgF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328690kgF {
    public static boolean LIZ;
    public static final byte[] LIZIZ = LIZ("RIFF");
    public static final byte[] LIZJ = LIZ("WEBP");
    public static final byte[] LIZLLL = LIZ("VP8 ");
    public static final byte[] LJ = LIZ("VP8L");
    public static final byte[] LJFF = LIZ("VP8X");

    public static InterfaceC1328170kfP LIZLLL() {
        InterfaceC1328170kfP interfaceC1328170kfP = null;
        if (LIZ) {
            return null;
        }
        try {
            interfaceC1328170kfP = (InterfaceC1328170kfP) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        LIZ = true;
        return interfaceC1328170kfP;
    }

    public static byte[] LIZ(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static boolean LIZIZ(byte[] bArr) {
        boolean z;
        boolean zLJ = LJ(bArr, 12, LJFF);
        if ((bArr[20] & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        if (zLJ && z) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(byte[] bArr, int i) {
        if (i < 20 || !LJ(bArr, 0, LIZIZ) || !LJ(bArr, 8, LIZJ)) {
            return false;
        }
        return true;
    }

    public static boolean LJ(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
