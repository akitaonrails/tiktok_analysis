package X;

/* JADX INFO: renamed from: X.0uBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694300uBw {
    public String LIZ;
    public C1694350uC1 LIZIZ;
    public int LIZJ = -1;
    public int LIZLLL = -1;

    public final int LIZ() {
        C1694350uC1 c1694350uC1 = this.LIZIZ;
        return c1694350uC1 == null ? this.LIZ.length() : (this.LIZ.length() - (this.LIZLLL - this.LIZJ)) + (c1694350uC1.LIZ - (c1694350uC1.LIZLLL - c1694350uC1.LIZJ));
    }

    public final String toString() {
        C1694350uC1 c1694350uC1 = this.LIZIZ;
        if (c1694350uC1 == null) {
            return this.LIZ;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) this.LIZ, 0, this.LIZJ);
        sb.append(c1694350uC1.LIZIZ, 0, c1694350uC1.LIZJ);
        char[] cArr = c1694350uC1.LIZIZ;
        int i = c1694350uC1.LIZLLL;
        sb.append(cArr, i, c1694350uC1.LIZ - i);
        String str = this.LIZ;
        sb.append((CharSequence) str, this.LIZLLL, str.length());
        return sb.toString();
    }

    public C1694300uBw(String str) {
        this.LIZ = str;
    }

    public final void LIZIZ(int i, int i2, String str) {
        if (i > i2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start index must be less than or equal to end index: ");
            sbLIZ.append(i);
            sbLIZ.append(" > ");
            sbLIZ.append(i2);
            C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (i < 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("start must be non-negative, but was ");
            sbLIZ2.append(i);
            C1681000tqU.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        C1694350uC1 c1694350uC1 = this.LIZIZ;
        if (c1694350uC1 == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(this.LIZ.length() - i2, 64);
            int i3 = i - iMin;
            this.LIZ.getChars(i3, i, cArr, 0);
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            this.LIZ.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            this.LIZIZ = new C1694350uC1(cArr, iMin + str.length(), i4);
            this.LIZJ = i3;
            this.LIZLLL = i5;
            return;
        }
        int i6 = this.LIZJ;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 >= 0 && i8 <= c1694350uC1.LIZ - (c1694350uC1.LIZLLL - c1694350uC1.LIZJ)) {
            int length = str.length() - (i8 - i7);
            int i9 = c1694350uC1.LIZLLL - c1694350uC1.LIZJ;
            if (length > i9) {
                int i10 = length - i9;
                int i11 = c1694350uC1.LIZ;
                do {
                    i11 *= 2;
                } while (i11 - c1694350uC1.LIZ < i10);
                char[] cArr2 = new char[i11];
                System.arraycopy(c1694350uC1.LIZIZ, 0, cArr2, 0, c1694350uC1.LIZJ);
                int i12 = c1694350uC1.LIZ;
                int i13 = c1694350uC1.LIZLLL;
                int i14 = i12 - i13;
                int i15 = i11 - i14;
                System.arraycopy(c1694350uC1.LIZIZ, i13, cArr2, i15, (i14 + i13) - i13);
                c1694350uC1.LIZIZ = cArr2;
                c1694350uC1.LIZ = i11;
                c1694350uC1.LIZLLL = i15;
            }
            int i16 = c1694350uC1.LIZJ;
            if (i7 < i16 && i8 <= i16) {
                int i17 = i16 - i8;
                char[] cArr3 = c1694350uC1.LIZIZ;
                System.arraycopy(cArr3, i8, cArr3, c1694350uC1.LIZLLL - i17, i17);
                c1694350uC1.LIZJ = i7;
                c1694350uC1.LIZLLL -= i17;
            } else if (i7 < i16 && i8 >= i16) {
                c1694350uC1.LIZLLL = i8 + (c1694350uC1.LIZLLL - i16);
                c1694350uC1.LIZJ = i7;
            } else {
                int i18 = c1694350uC1.LIZLLL;
                int i19 = i18 - i16;
                int i20 = i8 + i19;
                int i21 = (i7 + i19) - i18;
                char[] cArr4 = c1694350uC1.LIZIZ;
                System.arraycopy(cArr4, i18, cArr4, i16, i21);
                c1694350uC1.LIZJ += i21;
                c1694350uC1.LIZLLL = i20;
            }
            str.getChars(0, str.length(), c1694350uC1.LIZIZ, c1694350uC1.LIZJ);
            c1694350uC1.LIZJ += str.length();
            return;
        }
        this.LIZ = toString();
        this.LIZIZ = null;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        LIZIZ(i, i2, str);
    }
}
