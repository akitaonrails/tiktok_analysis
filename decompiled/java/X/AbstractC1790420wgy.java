package X;

/* JADX INFO: renamed from: X.0wgy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1790420wgy {
    public static final byte[] LIZ = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public static final C1790430wgz LIZIZ = new ThreadLocal<byte[]>() { // from class: X.0wgz
        @Override // java.lang.ThreadLocal
        public final byte[] initialValue() {
            return new byte[20];
        }
    };

    public abstract void LIZLLL(byte b);

    public final void LIZ(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            LIZLLL((byte) str.charAt(i));
        }
    }

    public final void LIZIZ(double d) {
        long j = (long) d;
        if (d == j && -9.223372036854776E18d <= d && d <= 9.223372036854776E18d) {
            LIZJ(j);
        } else {
            LIZ(String.valueOf(d));
        }
    }

    public final void LIZJ(long j) {
        boolean z;
        if (j == 0) {
            LIZLLL((byte) 48);
            return;
        }
        if (j == Long.MIN_VALUE) {
            LIZ("-9223372036854775808");
            return;
        }
        C1790430wgz c1790430wgz = LIZIZ;
        byte[] bArr = c1790430wgz.get();
        if (bArr == null) {
            bArr = new byte[20];
            c1790430wgz.set(bArr);
        }
        int i = 0;
        if (j < 0) {
            j = -j;
            z = true;
        } else {
            z = false;
        }
        while (j > 0) {
            long j2 = 10;
            bArr[i] = (byte) (((int) (j % j2)) + 48);
            j /= j2;
            i++;
        }
        if (z) {
            LIZLLL((byte) 45);
        }
        while (true) {
            i--;
            if (i >= 0) {
                LIZLLL(bArr[i]);
            } else {
                return;
            }
        }
    }

    public final void LJ(String str) {
        int i;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\"') {
                LIZLLL((byte) 92);
                LIZLLL((byte) 34);
            } else if (cCharAt == '\\') {
                LIZLLL((byte) 92);
                LIZLLL((byte) 92);
            } else if (cCharAt == '\n') {
                LIZLLL((byte) 92);
                LIZLLL((byte) 110);
            } else if (cCharAt == '\r') {
                LIZLLL((byte) 92);
                LIZLLL((byte) 114);
            } else if (cCharAt == '\t') {
                LIZLLL((byte) 92);
                LIZLLL((byte) 116);
            } else if (cCharAt < ' ') {
                LIZLLL((byte) 92);
                LIZLLL((byte) 117);
                int iLIZ = C0GYY.LIZ(12, 0, -4);
                if (iLIZ <= 12) {
                    while (true) {
                        LIZLLL(LIZ[(cCharAt >> i) & 15]);
                        i = i != iLIZ ? i - 4 : 12;
                    }
                }
            } else if (cCharAt <= 127) {
                LIZLLL((byte) cCharAt);
            } else if (cCharAt <= 2047) {
                LIZLLL((byte) ((cCharAt >> 6) | 192));
                LIZLLL((byte) ((cCharAt & '?') | 128));
            } else {
                LIZLLL((byte) ((cCharAt >> '\f') | 224));
                LIZLLL((byte) (((cCharAt >> 6) & 63) | 128));
                LIZLLL((byte) ((cCharAt & '?') | 128));
            }
        }
    }
}
