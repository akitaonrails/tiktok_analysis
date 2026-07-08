package X;

/* JADX INFO: renamed from: X.19jY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21621419jY {
    public static final C21621419jY LJ = new C21621419jY(AbstractC21621519jZ.LIZIZ, 0, 0, 0);
    public final int LIZ;
    public final AbstractC21621519jZ LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final String toString() {
        return C786410Ut5.j4("%s bits=%d bytes=%d", new Object[]{C21621219jW.LIZIZ[this.LIZ], Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LIZJ)});
    }

    public final C21621419jY LIZ(int i) {
        int i2;
        AbstractC21621519jZ c21621719jb = this.LIZIZ;
        int i3 = this.LIZ;
        int i4 = this.LIZLLL;
        if (i3 == 4 || i3 == 2) {
            int i5 = C21621219jW.LIZJ[i3][0];
            int i6 = i5 >> 16;
            c21621719jb.getClass();
            i4 += i6;
            i3 = 0;
            c21621719jb = new C21621719jb(c21621719jb, 65535 & i5, i6);
        }
        int i7 = this.LIZJ;
        if (i7 != 0 && i7 != 31) {
            if (i7 == 62) {
                i2 = 9;
            } else {
                i2 = 8;
            }
        } else {
            i2 = 18;
        }
        int i8 = i7 + 1;
        C21621419jY c21621419jY = new C21621419jY(c21621719jb, i3, i8, i4 + i2);
        if (i8 == 2078) {
            return c21621419jY.LIZIZ(i + 1);
        }
        return c21621419jY;
    }

    public final C21621419jY LIZIZ(int i) {
        final int i2 = this.LIZJ;
        if (i2 == 0) {
            return this;
        }
        final AbstractC21621519jZ abstractC21621519jZ = this.LIZIZ;
        final int i3 = i - i2;
        abstractC21621519jZ.getClass();
        return new C21621419jY(new AbstractC21621519jZ(abstractC21621519jZ, i3, i2) { // from class: X.19ja
            public final short LIZJ;
            public final short LIZLLL;

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append((int) this.LIZJ);
                sb.append("::");
                sb.append((this.LIZJ + this.LIZLLL) - 1);
                sb.append('>');
                return sb.toString();
            }

            @Override // X.AbstractC21621519jZ
            public final void LIZ(C21622019je c21622019je, byte[] bArr) {
                int i4 = 0;
                while (true) {
                    short s = this.LIZLLL;
                    if (i4 < s) {
                        if (i4 == 0 || (i4 == 31 && s <= 62)) {
                            c21622019je.LIZIZ(31, 5);
                            short s2 = this.LIZLLL;
                            if (s2 > 62) {
                                c21622019je.LIZIZ(s2 - 31, 16);
                            } else if (i4 == 0) {
                                c21622019je.LIZIZ(Math.min((int) s2, 31), 5);
                            } else {
                                c21622019je.LIZIZ(s2 - 31, 5);
                            }
                        }
                        c21622019je.LIZIZ(bArr[this.LIZJ + i4], 8);
                        i4++;
                    } else {
                        return;
                    }
                }
            }

            {
                this.LIZJ = (short) i3;
                this.LIZLLL = (short) i2;
            }
        }, this.LIZ, 0, this.LIZLLL);
    }

    public final boolean LIZJ(C21621419jY c21621419jY) {
        int i;
        int i2 = this.LIZLLL + (C21621219jW.LIZJ[this.LIZ][c21621419jY.LIZ] >> 16);
        int i3 = c21621419jY.LIZJ;
        if (i3 > 0 && ((i = this.LIZJ) == 0 || i > i3)) {
            i2 += 10;
        }
        if (i2 <= c21621419jY.LIZLLL) {
            return true;
        }
        return false;
    }

    public final C21621419jY LIZLLL(int i, int i2) {
        int i3;
        int i4 = this.LIZLLL;
        AbstractC21621519jZ c21621719jb = this.LIZIZ;
        int i5 = this.LIZ;
        if (i != i5) {
            int i6 = C21621219jW.LIZJ[i5][i];
            int i7 = i6 >> 16;
            c21621719jb.getClass();
            i4 += i7;
            c21621719jb = new C21621719jb(c21621719jb, 65535 & i6, i7);
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        c21621719jb.getClass();
        return new C21621419jY(new C21621719jb(c21621719jb, i2, i3), i, 0, i4 + i3);
    }

    public final C21621419jY LJ(int i, int i2) {
        int i3;
        AbstractC21621519jZ abstractC21621519jZ = this.LIZIZ;
        int i4 = this.LIZ;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        int i5 = C21621219jW.LJ[i4][i];
        abstractC21621519jZ.getClass();
        return new C21621419jY(new C21621719jb(new C21621719jb(abstractC21621519jZ, i5, i3), i2, 5), this.LIZ, 0, this.LIZLLL + i3 + 5);
    }

    public C21621419jY(AbstractC21621519jZ abstractC21621519jZ, int i, int i2, int i3) {
        this.LIZIZ = abstractC21621519jZ;
        this.LIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
    }
}
