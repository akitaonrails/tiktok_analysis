package X;

import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C803250Vf9 extends AbstractC801740Vci {
    public static final char[] LIZLLL = {'-', '2', '1', '4', '7', '4', '8', '3', '6', '4', '8'};
    public static final char[] LJ = {'-', '9', '2', '2', '3', '3', '7', '2', '0', '3', '6', '8', '5', '4', '7', '7', '5', '8', '0', '8'};
    public static final int[] LJFF = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
    public static final C803330VfH LJI = new AbstractC803260VfA<char[]>() { // from class: X.0VfH
        @Override // X.AbstractC803260VfA
        public final int LIZJ(char[] cArr) {
            return cArr.length;
        }

        @Override // X.AbstractC803260VfA
        public final void LIZIZ(char[] cArr, int i, char[] cArr2, int i2, int i3) {
            System.arraycopy(cArr, i, cArr2, i2, i3);
        }
    };
    public static final C803340VfI LJII = new AbstractC803260VfA<String>() { // from class: X.0VfI
        @Override // X.AbstractC803260VfA
        public final int LIZJ(String str) {
            return str.length();
        }

        @Override // X.AbstractC803260VfA
        public final void LIZIZ(String str, int i, char[] cArr, int i2, int i3) {
            str.getChars(i, i3 + i, cArr, i2);
        }
    };
    public final char[] LIZIZ;
    public int LIZJ;

    @Override // X.AbstractC801740Vci
    public final void LJFF() {
        int i = this.LIZJ;
        if (i > 0) {
            this.LIZ.LIZLLL(this.LIZIZ, i);
            this.LIZJ = 0;
        }
        this.LIZ.flush();
        this.LIZ.release();
    }

    public C803250Vf9(String str) {
        char[] cArr;
        InterfaceC803370VfL c2225008ng;
        int i = 1024;
        try {
            cArr = new char[1024];
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            i = 128;
            cArr = new char[128];
        }
        this.LIZIZ = cArr;
        this.LIZJ = 0;
        long jLJJLI = NativeBridge.LJJLI(i, str);
        if (jLJJLI != 0) {
            c2225008ng = new C803220Vf6(jLJJLI);
        } else {
            c2225008ng = new C2225008ng(str);
        }
        this.LIZ = c2225008ng;
    }

    @Override // X.AbstractC801740Vci
    public final void LIZ(char c) {
        LJI(c);
    }

    @Override // X.AbstractC801740Vci
    public final void LIZIZ(int i) {
        if (i == Integer.MIN_VALUE) {
            LJ(LIZLLL);
            return;
        }
        if (i < 0) {
            i = -i;
            LJI('-');
        }
        if (i < 100) {
            if (i < 10) {
                LJI((char) (i + 48));
                return;
            }
            int i2 = i / 10;
            LJI((char) (i2 + 48));
            LJI((char) ((i - (i2 * 10)) + 48));
            return;
        }
        int i3 = 0;
        while (true) {
            int i4 = LJFF[i3];
            i3++;
            if (i <= i4) {
                break;
            } else if (i3 >= 10) {
                i3 = 11;
                break;
            }
        }
        int i5 = this.LIZJ;
        int i6 = i5 + i3;
        char[] cArr = this.LIZIZ;
        if (i6 >= cArr.length) {
            this.LIZ.LIZLLL(cArr, i5);
            this.LIZJ = 0;
        }
        int i7 = this.LIZJ + i3;
        this.LIZJ = i7;
        LJII(this.LIZIZ, i, i7);
    }

    @Override // X.AbstractC801740Vci
    public final void LIZJ(long j) {
        if (j == Long.MIN_VALUE) {
            LJ(LJ);
            return;
        }
        if (j < 0) {
            j = -j;
            LJI('-');
        }
        if (j < 100) {
            if (j < 10) {
                LJI((char) (j + 48));
                return;
            }
            long j2 = j / 10;
            LJI((char) (j2 + 48));
            LJI((char) ((j - (10 * j2)) + 48));
            return;
        }
        int i = 1;
        long j3 = 10;
        while (true) {
            if (j < j3) {
                break;
            }
            j3 *= 10;
            i++;
            if (i >= 19) {
                i = 19;
                break;
            }
        }
        int i2 = this.LIZJ;
        int i3 = i2 + i;
        char[] cArr = this.LIZIZ;
        if (i3 >= cArr.length) {
            this.LIZ.LIZLLL(cArr, i2);
            this.LIZJ = 0;
        }
        int i4 = this.LIZJ + i;
        this.LIZJ = i4;
        char[] cArr2 = this.LIZIZ;
        while (j > 2147483647L) {
            long j4 = j / 100;
            int i5 = (int) (j - (((j4 << 6) + (j4 << 5)) + (j4 << 2)));
            int i6 = i5 / 10;
            int i7 = i4 - 1;
            cArr2[i7] = (char) ((i5 - (i6 * 10)) + 48);
            i4 = i7 - 1;
            cArr2[i4] = (char) (i6 + 48);
            j = j4;
        }
        LJII(cArr2, (int) j, i4);
    }

    @Override // X.AbstractC801740Vci
    public final void LIZLLL(String str) {
        LJII.LIZ(this, str);
    }

    @Override // X.AbstractC801740Vci
    public final void LJ(char[] cArr) {
        LJI.LIZ(this, cArr);
    }

    public final void LJI(char c) {
        char[] cArr = this.LIZIZ;
        int i = this.LIZJ;
        cArr[i] = c;
        int i2 = i + 1;
        this.LIZJ = i2;
        if (i2 == cArr.length) {
            this.LIZ.LIZLLL(cArr, cArr.length);
            this.LIZJ = 0;
        }
    }

    public static void LJII(char[] cArr, int i, int i2) {
        while (i >= 65536) {
            int i3 = i / 100;
            int i4 = i - (((i3 << 6) + (i3 << 5)) + (i3 << 2));
            int i5 = i4 / 10;
            int i6 = i2 - 1;
            cArr[i6] = (char) ((i4 - (i5 * 10)) + 48);
            i2 = i6 - 1;
            cArr[i2] = (char) (i5 + 48);
            i = i3;
        }
        while (i != 0) {
            int i7 = (52429 * i) >>> 19;
            i2--;
            cArr[i2] = (char) ((i - ((i7 << 3) + (i7 << 1))) + 48);
            i = i7;
        }
    }
}
