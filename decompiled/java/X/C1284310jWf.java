package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0jWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1284310jWf {
    public static boolean LIZJ(char c) {
        return c >= 128 && c <= 255;
    }

    public static boolean LIZLLL(char c) {
        return c == '\r' || c == '*' || c == '>' || c == ' ' || (c >= '0' && (c <= '9' || (c >= 'A' && c <= 'Z')));
    }

    public static void LIZIZ(char c) {
        String hexString = Integer.toHexString(c);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("0000".substring(0, 4 - hexString.length()));
        sbLIZ.append(hexString);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + C2188811AlT.LIZIZ(sbLIZ) + ')');
    }

    public static int LIZ(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        do {
            int iCeil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = iCeil;
            if (i > iCeil) {
                Arrays.fill(bArr, (byte) 0);
                i = iCeil;
            }
            if (i == iCeil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
            i2++;
        } while (i2 < 6);
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x01dd, code lost:
    
        return 5;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0018 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJ(int r16, int r17, java.lang.CharSequence r18) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1284310jWf.LJ(int, int, java.lang.CharSequence):int");
    }
}
