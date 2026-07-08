package X;

/* JADX INFO: renamed from: X.12ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19920412ws {
    public static boolean LIZLLL(byte b) {
        return b > -65;
    }

    public static void LIZJ(byte b, byte b2, char[] cArr, int i) throws C19926612xs {
        if (b >= -62 && !LIZLLL(b2)) {
            cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
            return;
        }
        throw C19926612xs.LIZJ();
    }

    public static void LIZIZ(byte b, byte b2, byte b3, char[] cArr, int i) throws C19926612xs {
        if (!LIZLLL(b2) && (b != -32 ? b != -19 || b2 < -96 : b2 >= -96) && !LIZLLL(b3)) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw C19926612xs.LIZJ();
    }

    public static void LIZ(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C19926612xs {
        if (!LIZLLL(b2) && (((b << 28) + (b2 + 112)) >> 30) == 0 && !LIZLLL(b3) && !LIZLLL(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
            return;
        }
        throw C19926612xs.LIZJ();
    }
}
