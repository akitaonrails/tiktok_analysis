package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: renamed from: X.13Ir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19988313Ir implements C13JF {
    public char[] LIZ = C13JN.LIZJ.LIZ(128);
    public int LIZIZ;

    public final void LJ() {
        C13JN c13jn = C13JN.LIZJ;
        char[] cArr = this.LIZ;
        synchronized (c13jn) {
            try {
                int i = c13jn.LIZIZ;
                if (cArr.length + i < C1225204qo.LIZ) {
                    c13jn.LIZIZ = i + cArr.length;
                    c13jn.LIZ.addLast(cArr);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final String toString() {
        return new String(this.LIZ, 0, this.LIZIZ);
    }

    @Override // X.C13JF
    public final void LIZ(char c) {
        LIZLLL(this.LIZIZ, 1);
        char[] cArr = this.LIZ;
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        cArr[i] = c;
    }

    @Override // X.C13JF
    public final void LIZIZ(String str) {
        int length = str.length();
        if (length == 0) {
            return;
        }
        LIZLLL(this.LIZIZ, length);
        str.getChars(0, str.length(), this.LIZ, this.LIZIZ);
        this.LIZIZ += length;
    }

    @Override // X.C13JF
    public final void LIZJ(String str) {
        byte b;
        LIZLLL(this.LIZIZ, str.length() + 2);
        char[] cArr = this.LIZ;
        int i = this.LIZIZ;
        int i2 = i + 1;
        cArr[i] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i2);
        int i3 = length + i2;
        int length2 = i2;
        while (length2 < i3) {
            char c = cArr[length2];
            byte[] bArr = C2342709Fx.LIZIZ;
            if (c < bArr.length && bArr[c] != 0) {
                int length3 = str.length();
                for (int i4 = length2 - i2; i4 < length3; i4++) {
                    LIZLLL(length2, 2);
                    char cCharAt = str.charAt(i4);
                    byte[] bArr2 = C2342709Fx.LIZIZ;
                    if (cCharAt >= bArr2.length || (b = bArr2[cCharAt]) == 0) {
                        int i5 = length2 + 1;
                        this.LIZ[length2] = cCharAt;
                        length2 = i5;
                    } else {
                        if (b == 1) {
                            String str2 = C2342709Fx.LIZ[cCharAt];
                            LIZLLL(length2, str2.length());
                            str2.getChars(0, str2.length(), this.LIZ, length2);
                            length2 += str2.length();
                            this.LIZIZ = length2;
                        } else {
                            char[] cArr2 = this.LIZ;
                            cArr2[length2] = '\\';
                            cArr2[length2 + 1] = (char) b;
                            length2 += 2;
                            this.LIZIZ = length2;
                        }
                    }
                }
                LIZLLL(length2, 1);
                this.LIZ[length2] = '\"';
                this.LIZIZ = length2 + 1;
                return;
            }
            length2++;
        }
        cArr[i3] = '\"';
        this.LIZIZ = i3 + 1;
    }

    @Override // X.C13JF
    public final void writeLong(long j) {
        LIZIZ(String.valueOf(j));
    }

    public final void LIZLLL(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.LIZ;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.LIZ = Arrays.copyOf(cArr, i3);
        }
    }
}
