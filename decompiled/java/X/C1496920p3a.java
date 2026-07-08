package X;

import okio.ByteString;

/* JADX INFO: renamed from: X.0p3a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496920p3a {
    public static final char[] LIZ = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final ByteString LIZIZ;

    static {
        ByteString.Companion.getClass();
        LIZIZ = C1496910p3Z.LIZIZ(new byte[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
    
        if ('F' >= r3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0019, code lost:
    
        return (r3 - r1) + 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x001c, code lost:
    
        if ('f' >= r3) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZIZ(char r3) {
        /*
            r1 = 48
            if (r1 > r3) goto L1f
            r0 = 57
            if (r0 < r3) goto La
            int r3 = r3 - r1
            return r3
        La:
            r1 = 97
            if (r1 <= r3) goto L1a
            r1 = 65
            if (r1 > r3) goto L1f
            r0 = 70
            if (r0 < r3) goto L1f
        L16:
            int r3 = r3 - r1
            int r3 = r3 + 10
            return r3
        L1a:
            r0 = 102(0x66, float:1.43E-43)
            if (r0 < r3) goto L1f
            goto L16
        L1f:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Unexpected hex digit: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496920p3a.LIZIZ(char):int");
    }

    public static final ByteString LIZ(ByteString byteString, int i, int i2) {
        if (i >= 0) {
            if (i2 <= byteString.getData$jvm().length) {
                int i3 = i2 - i;
                if (i3 >= 0) {
                    if (i == 0 && i2 == byteString.getData$jvm().length) {
                        return byteString;
                    }
                    byte[] bArr = new byte[i3];
                    System.arraycopy(byteString.getData$jvm(), i, bArr, 0, i3);
                    return new ByteString(bArr);
                }
                "endIndex < beginIndex".toString();
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("endIndex > length(");
            sbLIZ.append(byteString.getData$jvm().length);
            sbLIZ.append(')');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        "beginIndex < 0".toString();
        throw new IllegalArgumentException("beginIndex < 0");
    }
}
