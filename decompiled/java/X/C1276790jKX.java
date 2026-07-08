package X;

/* JADX INFO: renamed from: X.0jKX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276790jKX {
    public static C1276830jKb LIZ(int i) {
        if (i > 3840) {
            return C1276820jKa.LIZ;
        }
        if (3201 <= i) {
            return C1276820jKa.LIZ;
        }
        if (2241 <= i) {
            if (i < 3201) {
                return C1276820jKa.LIZIZ;
            }
        } else if (1601 <= i) {
            if (i < 2241) {
                return C1276820jKa.LIZJ;
            }
        } else if (1121 <= i) {
            if (i < 1601) {
                return C1276820jKa.LIZLLL;
            }
        } else if (913 <= i) {
            if (i < 1121) {
                return C1276820jKa.LJ;
            }
        } else if (753 <= i) {
            if (i < 913) {
                return C1276820jKa.LJFF;
            }
        } else if (537 <= i && i < 753) {
            return C1276820jKa.LJI;
        }
        return C1276820jKa.LJII;
    }

    public static C1276830jKb LIZIZ(int i) {
        if (i > 2160) {
            return C1276820jKa.LIZ;
        }
        if (1801 <= i) {
            return C1276820jKa.LIZ;
        }
        if (1261 <= i) {
            if (i < 1801) {
                return C1276820jKa.LIZIZ;
            }
        } else if (901 <= i) {
            if (i < 1261) {
                return C1276820jKa.LIZJ;
            }
        } else if (631 <= i) {
            if (i < 901) {
                return C1276820jKa.LIZLLL;
            }
        } else if (511 <= i) {
            if (i < 631) {
                return C1276820jKa.LJ;
            }
        } else if (421 <= i) {
            if (i < 511) {
                return C1276820jKa.LJFF;
            }
        } else if (301 <= i && i < 421) {
            return C1276820jKa.LJI;
        }
        return C1276820jKa.LJII;
    }

    public static C1269760j9C LIZJ(C1269760j9C c1269760j9C, EnumC1276810jKZ enumC1276810jKZ) {
        int i = c1269760j9C.LIZ;
        int i2 = c1269760j9C.LIZIZ;
        float f = (i * 1.0f) / i2;
        int i3 = C1276800jKY.LIZ[enumC1276810jKZ.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                if (i > i2) {
                    return LIZJ(new C1269760j9C(i, i2), EnumC1276810jKZ.HORIZONTAL);
                }
                return LIZJ(new C1269760j9C(i, i2), EnumC1276810jKZ.VERTICAL);
            }
            if (1.0f / f >= 1.78d) {
                C1276830jKb c1276830jKbLIZ = LIZ(i2);
                return new C1269760j9C(c1276830jKbLIZ.LIZIZ, c1276830jKbLIZ.LIZ);
            }
            C1276830jKb c1276830jKbLIZIZ = LIZIZ(i);
            return new C1269760j9C(c1276830jKbLIZIZ.LIZIZ, c1276830jKbLIZIZ.LIZ);
        }
        if (f >= 1.78d) {
            C1276830jKb c1276830jKbLIZ2 = LIZ(i);
            return new C1269760j9C(c1276830jKbLIZ2.LIZ, c1276830jKbLIZ2.LIZIZ);
        }
        C1276830jKb c1276830jKbLIZIZ2 = LIZIZ(i2);
        return new C1269760j9C(c1276830jKbLIZIZ2.LIZ, c1276830jKbLIZIZ2.LIZIZ);
    }
}
