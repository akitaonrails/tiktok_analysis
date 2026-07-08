package X;

/* JADX INFO: renamed from: X.0p3Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496820p3Q {
    public static final long LIZJ(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final void LIZIZ(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("size=");
        sbLIZ.append(j);
        sbLIZ.append(" offset=");
        sbLIZ.append(j2);
        sbLIZ.append(" byteCount=");
        sbLIZ.append(j3);
        throw new ArrayIndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final boolean LIZ(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }
}
