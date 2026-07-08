package X;

/* JADX INFO: renamed from: X.1Cxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2247361Cxi {
    public static final /* synthetic */ int LJFF = 0;
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;

    public final C2247361Cxi LJI(float f) {
        return new C2247361Cxi((f * 2) - this.LIZ, this.LIZIZ, -this.LIZJ, this.LIZLLL);
    }

    public final C2247361Cxi LIZJ(C2247361Cxi c2247361Cxi, EnumC2247411Cxn enumC2247411Cxn) {
        EnumC2247411Cxn enumC2247411Cxn2;
        EnumC2247411Cxn enumC2247411Cxn3;
        int i = C2247391Cxl.LIZ[enumC2247411Cxn.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (c2247361Cxi.LJ >= this.LJ) {
                            enumC2247411Cxn3 = EnumC2247411Cxn.X;
                        } else {
                            enumC2247411Cxn3 = EnumC2247411Cxn.Y;
                        }
                        return LIZJ(c2247361Cxi, enumC2247411Cxn3);
                    }
                    throw new C1954807lC();
                }
                if (c2247361Cxi.LJ < this.LJ) {
                    enumC2247411Cxn2 = EnumC2247411Cxn.X;
                } else {
                    enumC2247411Cxn2 = EnumC2247411Cxn.Y;
                }
                return LIZJ(c2247361Cxi, enumC2247411Cxn2);
            }
            float f = c2247361Cxi.LIZLLL / this.LIZLLL;
            return LJFF(f, f).LIZ(c2247361Cxi, enumC2247411Cxn, EnumC2247421Cxo.Start);
        }
        float f2 = c2247361Cxi.LIZJ / this.LIZJ;
        return LJFF(f2, f2).LIZ(c2247361Cxi, enumC2247411Cxn, EnumC2247421Cxo.Start);
    }

    public final C2247361Cxi LIZLLL(float f, float f2) {
        return new C2247361Cxi(this.LIZ + f, this.LIZIZ + f2, this.LIZJ, this.LIZLLL);
    }

    public final C2247361Cxi LJ(float f, float f2) {
        return new C2247361Cxi(this.LIZ / f, this.LIZIZ / f2, this.LIZJ / f, this.LIZLLL / f2);
    }

    public final C2247361Cxi LJFF(float f, float f2) {
        return new C2247361Cxi(this.LIZ, this.LIZIZ, this.LIZJ * f, this.LIZLLL * f2);
    }

    public final C2247361Cxi LIZ(C2247361Cxi c2247361Cxi, EnumC2247411Cxn enumC2247411Cxn, EnumC2247421Cxo enumC2247421Cxo) {
        EnumC2247411Cxn enumC2247411Cxn2;
        EnumC2247411Cxn enumC2247411Cxn3;
        int i = C2247391Cxl.LIZ[enumC2247411Cxn.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (c2247361Cxi.LJ >= this.LJ) {
                            enumC2247411Cxn3 = EnumC2247411Cxn.X;
                        } else {
                            enumC2247411Cxn3 = EnumC2247411Cxn.Y;
                        }
                        return LIZ(c2247361Cxi, enumC2247411Cxn3, enumC2247421Cxo);
                    }
                    throw new C1954807lC();
                }
                if (c2247361Cxi.LJ < this.LJ) {
                    enumC2247411Cxn2 = EnumC2247411Cxn.X;
                } else {
                    enumC2247411Cxn2 = EnumC2247411Cxn.Y;
                }
                return LIZ(c2247361Cxi, enumC2247411Cxn2, enumC2247421Cxo);
            }
            int i2 = C2247391Cxl.LIZIZ[enumC2247421Cxo.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return LIZLLL(0.0f, (-this.LIZIZ) + c2247361Cxi.LIZIZ + ((c2247361Cxi.LIZLLL - this.LIZLLL) / 2));
                    }
                    throw new C1954807lC();
                }
                return LIZLLL(0.0f, (-this.LIZIZ) + c2247361Cxi.LIZIZ + (c2247361Cxi.LIZLLL - this.LIZLLL));
            }
            return LIZLLL(0.0f, (-this.LIZIZ) + c2247361Cxi.LIZIZ);
        }
        int i3 = C2247391Cxl.LIZIZ[enumC2247421Cxo.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    return LIZLLL((-this.LIZ) + c2247361Cxi.LIZ + ((c2247361Cxi.LIZJ - this.LIZJ) / 2), 0.0f);
                }
                throw new C1954807lC();
            }
            return LIZLLL((-this.LIZ) + c2247361Cxi.LIZ + (c2247361Cxi.LIZJ - this.LIZJ), 0.0f);
        }
        return LIZLLL((-this.LIZ) + c2247361Cxi.LIZ, 0.0f);
    }

    public C2247361Cxi(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = f3 / f4;
    }

    public final C2247361Cxi LIZIZ(float f, float f2, float f3, float f4) {
        float f5 = this.LIZ;
        float f6 = this.LIZJ;
        float f7 = this.LIZIZ;
        float f8 = this.LIZLLL;
        float f9 = 1;
        return new C2247361Cxi(f5 + (f6 * f), f7 + (f8 * f3), f6 * ((f9 - f) - f2), f8 * ((f9 - f3) - f4));
    }
}
