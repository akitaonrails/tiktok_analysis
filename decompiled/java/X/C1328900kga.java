package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: X.0kga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1328900kga {
    public static byte[] LIZ(String str) {
        str.getClass();
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static boolean LIZJ(byte[] bArr, byte[] bArr2) {
        bArr2.getClass();
        if (bArr2.length > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int LIZIZ(byte[] bArr, int i, int i2, byte[] bArr2) {
        bArr2.getClass();
        if (i2 > i) {
            return -1;
        }
        int i3 = 0;
        byte b = bArr2[0];
        int i4 = i - i2;
        while (i3 <= i4) {
            if (bArr[i3] != b) {
                do {
                    i3++;
                    if (i3 > i4) {
                        break;
                    }
                } while (bArr[i3] != b);
            }
            if (i3 <= i4) {
                int i5 = i3 + 1;
                int i6 = (i5 + i2) - 1;
                for (int i7 = 1; i5 < i6 && bArr[i5] == bArr2[i7]; i7++) {
                    i5++;
                }
                if (i5 == i6) {
                    return i3;
                }
            }
            i3++;
        }
        return -1;
    }
}
