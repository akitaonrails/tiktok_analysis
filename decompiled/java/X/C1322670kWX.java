package X;

import g86.h$b;
import g86.h$c;

/* JADX INFO: renamed from: X.0kWX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1322670kWX {
    public static final h$c LIZ = new h$b() { // from class: g86.h$c
    };

    public static int LIZIZ(int i, byte[] bArr, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    byte b2 = bArr[i];
                    byte b3 = bArr[i + 1];
                    if (b > -12 || b2 > -65 || b3 > -65) {
                        return -1;
                    }
                    return ((b2 << 8) ^ b) ^ (b3 << 16);
                }
                throw new AssertionError();
            }
            byte b4 = bArr[i];
            if (b > -12 || b4 > -65) {
                return -1;
            }
            return b ^ (b4 << 8);
        }
        if (b > -12) {
            return -1;
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1322670kWX.LIZ(java.lang.CharSequence, byte[], int, int):int");
    }
}
