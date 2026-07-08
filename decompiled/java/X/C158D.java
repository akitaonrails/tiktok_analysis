package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.158D, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158D {
    public long LIZ;
    public long LIZIZ;
    public long LIZJ;

    public static long LIZIZ(int i, byte[] bArr) {
        int i2 = bArr[i];
        int i3 = bArr[i + 1];
        int i4 = bArr[i + 2];
        int i5 = bArr[i + 3];
        if ((i2 & 128) == 128) {
            i2 = (i2 & 127) + 128;
        }
        if ((i3 & 128) == 128) {
            i3 = (i3 & 127) + 128;
        }
        if ((i4 & 128) == 128) {
            i4 = (i4 & 127) + 128;
        }
        if ((i5 & 128) == 128) {
            i5 = (i5 & 127) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static long LIZJ(int i, byte[] bArr) {
        long jLIZIZ = LIZIZ(i, bArr);
        long jLIZIZ2 = LIZIZ(i + 4, bArr);
        if (jLIZIZ == 0 && jLIZIZ2 == 0) {
            return 0L;
        }
        return ((jLIZIZ - 2208988800L) * 1000) + ((jLIZIZ2 * 1000) / 4294967296L);
    }

    public static void LIZLLL(byte[] bArr, long j) {
        if (j == 0) {
            Arrays.fill(bArr, 40, 48, (byte) 0);
            return;
        }
        long j2 = j / 1000;
        long j3 = j - (j2 * 1000);
        long j4 = j2 + 2208988800L;
        bArr[40] = (byte) (j4 >> 24);
        bArr[41] = (byte) (j4 >> 16);
        bArr[42] = (byte) (j4 >> 8);
        bArr[43] = (byte) (j4 >> 0);
        long j5 = (j3 * 4294967296L) / 1000;
        bArr[44] = (byte) (j5 >> 24);
        bArr[45] = (byte) (j5 >> 16);
        bArr[46] = (byte) (j5 >> 8);
        bArr[47] = (byte) (Math.random() * 255.0d);
    }

    public static void LIZ(byte b, byte b2, int i, long j) throws Exception {
        if (b != 3) {
            if (b2 != 4 && b2 != 5) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("untrusted mode: ");
                sbLIZ.append((int) b2);
                final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                throw new Exception(strLIZIZ) { // from class: X.158E
                };
            }
            if (i != 0 && i <= 15) {
                if (j != 0) {
                    return;
                }
                final String str = "zero transmitTime";
                throw new Exception(str) { // from class: X.158E
                };
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("untrusted stratum: ");
            sbLIZ2.append(i);
            final String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            throw new Exception(strLIZIZ2) { // from class: X.158E
            };
        }
        final String str2 = "unsynchronized server";
        throw new Exception(str2) { // from class: X.158E
        };
    }
}
