package X;

/* JADX INFO: renamed from: X.1DoL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2267031DoL {
    public static final Object LJI = new Object();
    public static final Object LJII = new Object();
    public static final Object LJIIIIZZ = new Object();
    public static final Object LJIIIZ = new Object();
    public static final Object LJIIJ = new Object();
    public static final Object LJIIJJI = new Object();
    public int LIZ;
    public int LIZIZ;
    public float LIZJ;
    public int LIZLLL;
    public Object LJ;
    public boolean LJFF;

    public static C2267031DoL LIZ() {
        Object obj = LJII;
        C2267031DoL c2267031DoL = new C2267031DoL(LJI);
        c2267031DoL.LJ = obj;
        if (obj instanceof Integer) {
            c2267031DoL.LIZLLL = ((Integer) obj).intValue();
            c2267031DoL.LJ = null;
        }
        return c2267031DoL;
    }

    public C2267031DoL() {
        this.LIZIZ = Integer.MAX_VALUE;
        this.LIZJ = 1.0f;
        this.LJ = LJII;
    }

    public C2267031DoL(Object obj) {
        this.LIZIZ = Integer.MAX_VALUE;
        this.LIZJ = 1.0f;
        this.LJ = obj;
    }

    public static C2267031DoL LIZIZ(int i) {
        C2267031DoL c2267031DoL = new C2267031DoL(LJI);
        c2267031DoL.LJ = null;
        c2267031DoL.LIZLLL = i;
        return c2267031DoL;
    }

    public final void LIZJ(C2267081DoQ c2267081DoQ, int i) {
        int i2 = 1;
        int i3 = 0;
        Object obj = LJIIIZ;
        Object obj2 = LJIIJ;
        Object obj3 = LJII;
        if (i == 0) {
            if (this.LJFF) {
                c2267081DoQ.LJJIIJZLJL(EnumC2266981DoG.MATCH_CONSTRAINT);
                Object obj4 = this.LJ;
                if (obj4 != obj3) {
                    if (obj4 == obj2) {
                        i2 = 2;
                    } else {
                        i2 = 0;
                    }
                }
                int i4 = this.LIZ;
                int i5 = this.LIZIZ;
                float f = this.LIZJ;
                c2267081DoQ.LJIJ = i2;
                c2267081DoQ.LJIJJLI = i4;
                if (i5 != Integer.MAX_VALUE) {
                    i3 = i5;
                }
                c2267081DoQ.LJIL = i3;
                c2267081DoQ.LJJ = f;
                if (f > 0.0f && f < 1.0f && i2 == 0) {
                    c2267081DoQ.LJIJ = 2;
                    return;
                }
                return;
            }
            int i6 = this.LIZ;
            if (i6 > 0) {
                c2267081DoQ.LJJJJZI = i6;
            }
            int i7 = this.LIZIZ;
            if (i7 < Integer.MAX_VALUE) {
                c2267081DoQ.LJJIIJZLJL[0] = i7;
            }
            Object obj5 = this.LJ;
            if (obj5 == obj3) {
                c2267081DoQ.LJJIIJZLJL(EnumC2266981DoG.WRAP_CONTENT);
                return;
            }
            if (obj5 == obj) {
                c2267081DoQ.LJJIIJZLJL(EnumC2266981DoG.MATCH_PARENT);
                return;
            } else {
                if (obj5 != null) {
                    return;
                }
                c2267081DoQ.LJJIIJZLJL(EnumC2266981DoG.FIXED);
                c2267081DoQ.LJJIIZI(this.LIZLLL);
                return;
            }
        }
        if (this.LJFF) {
            c2267081DoQ.LJJIIZ(EnumC2266981DoG.MATCH_CONSTRAINT);
            Object obj6 = this.LJ;
            if (obj6 != obj3) {
                if (obj6 == obj2) {
                    i2 = 2;
                } else {
                    i2 = 0;
                }
            }
            int i8 = this.LIZ;
            int i9 = this.LIZIZ;
            float f2 = this.LIZJ;
            c2267081DoQ.LJIJI = i2;
            c2267081DoQ.LJJI = i8;
            if (i9 != Integer.MAX_VALUE) {
                i3 = i9;
            }
            c2267081DoQ.LJJIFFI = i3;
            c2267081DoQ.LJJII = f2;
            if (f2 <= 0.0f || f2 >= 1.0f || i2 != 0) {
                return;
            }
            c2267081DoQ.LJIJI = 2;
            return;
        }
        int i10 = this.LIZ;
        if (i10 > 0) {
            c2267081DoQ.LJJJLIIL = i10;
        }
        int i11 = this.LIZIZ;
        if (i11 < Integer.MAX_VALUE) {
            c2267081DoQ.LJJIIJZLJL[1] = i11;
        }
        Object obj7 = this.LJ;
        if (obj7 == obj3) {
            c2267081DoQ.LJJIIZ(EnumC2266981DoG.WRAP_CONTENT);
            return;
        }
        if (obj7 == obj) {
            c2267081DoQ.LJJIIZ(EnumC2266981DoG.MATCH_PARENT);
        } else {
            if (obj7 != null) {
                return;
            }
            c2267081DoQ.LJJIIZ(EnumC2266981DoG.FIXED);
            c2267081DoQ.LJJIIJ(this.LIZLLL);
        }
    }
}
