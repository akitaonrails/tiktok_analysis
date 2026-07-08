package X;

/* JADX INFO: renamed from: X.19ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21622419ji {
    public final C21622219jg LIZ;
    public final int[] LIZIZ;

    public final boolean LIZIZ() {
        return this.LIZIZ[0] == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.LIZIZ.length - 1) * 8);
        int length = this.LIZIZ.length;
        while (true) {
            length--;
            if (length < 0) {
                break;
            }
            int i = this.LIZIZ[(r1.length - 1) - length];
            if (i != 0) {
                if (i < 0) {
                    sb.append(" - ");
                    i = -i;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (length == 0 || i != 1) {
                    C21622219jg c21622219jg = this.LIZ;
                    if (i == 0) {
                        c21622219jg.getClass();
                        throw new IllegalArgumentException();
                    }
                    int i2 = c21622219jg.LIZIZ[i];
                    if (i2 == 0) {
                        sb.append('1');
                    } else if (i2 == 1) {
                        sb.append('a');
                    } else {
                        sb.append("a^");
                        sb.append(i2);
                    }
                    if (length == 0) {
                        break;
                    }
                }
                if (length == 1) {
                    sb.append('x');
                } else {
                    sb.append("x^");
                    sb.append(length);
                }
            }
        }
        return sb.toString();
    }

    public final C21622419ji LIZ(C21622419ji c21622419ji) {
        if (this.LIZ.equals(c21622419ji.LIZ)) {
            if (LIZIZ()) {
                return c21622419ji;
            }
            if (c21622419ji.LIZIZ()) {
                return this;
            }
            int[] iArr = this.LIZIZ;
            int[] iArr2 = c21622419ji.LIZIZ;
            if (iArr.length <= iArr2.length) {
                iArr = iArr2;
                iArr2 = iArr;
            }
            int[] iArr3 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr3, 0, length);
            for (int i = length; i < iArr.length; i++) {
                iArr3[i] = iArr2[i - length] ^ iArr[i];
            }
            return new C21622419ji(this.LIZ, iArr3);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public C21622419ji(C21622219jg c21622219jg, int[] iArr) {
        if (iArr.length != 0) {
            this.LIZ = c21622219jg;
            int length = iArr.length;
            if (length > 1 && iArr[0] == 0) {
                int i = 1;
                while (iArr[i] == 0 && (i = i + 1) < length) {
                }
                if (i == length) {
                    this.LIZIZ = new int[]{0};
                    return;
                }
                int i2 = length - i;
                int[] iArr2 = new int[i2];
                this.LIZIZ = iArr2;
                System.arraycopy(iArr, i, iArr2, 0, i2);
                return;
            }
            this.LIZIZ = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final C21622419ji LIZJ(int i, int i2) {
        if (i >= 0) {
            if (i2 == 0) {
                return this.LIZ.LIZJ;
            }
            int length = this.LIZIZ.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.LIZ.LIZ(this.LIZIZ[i3], i2);
            }
            return new C21622419ji(this.LIZ, iArr);
        }
        throw new IllegalArgumentException();
    }
}
