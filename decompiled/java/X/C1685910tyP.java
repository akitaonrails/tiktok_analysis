package X;

/* JADX INFO: renamed from: X.0tyP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685910tyP {
    public static final long LIZIZ;
    public static final long LIZJ;
    public static final long LIZLLL;
    public static final long LJ;
    public static final long LJFF;
    public static final long LJI;
    public static final long LJII;
    public static final long LJIIIIZZ;
    public static final long LJIIIZ;
    public static final long LJIIJ;
    public static final /* synthetic */ int LJIIJJI = 0;
    public final long LIZ;

    public static final /* synthetic */ C1685910tyP LIZ(long j) {
        return new C1685910tyP(j);
    }

    public static final boolean LJ(long j, long j2) {
        return j == j2;
    }

    public final boolean equals(Object obj) {
        return LIZLLL(this.LIZ, obj);
    }

    public final int hashCode() {
        return LJIIJ(this.LIZ);
    }

    static {
        new C1685830tyH();
        LIZIZ = C1685850tyJ.LIZLLL(4278190080L);
        C1685850tyJ.LIZLLL(4282664004L);
        LIZJ = C1685850tyJ.LIZLLL(4287137928L);
        LIZLLL = C1685850tyJ.LIZLLL(4291611852L);
        LJ = C1685850tyJ.LIZLLL(4294967295L);
        LJFF = C1685850tyJ.LIZLLL(4294901760L);
        LJI = C1685850tyJ.LIZLLL(4278255360L);
        LJII = C1685850tyJ.LIZLLL(4278190335L);
        LJIIIIZZ = C1685850tyJ.LIZLLL(4294967040L);
        C1685850tyJ.LIZLLL(4278255615L);
        C1685850tyJ.LIZLLL(4294902015L);
        LJIIIZ = C1685850tyJ.LIZIZ(0);
        LJIIJ = C1685850tyJ.LIZ(0.0f, 0.0f, 0.0f, 0.0f, C1E04.LJIJJ);
    }

    public final String toString() {
        return LJIIJJI(this.LIZ);
    }

    public /* synthetic */ C1685910tyP(long j) {
        this.LIZ = j;
    }

    public static final float LJFF(long j) {
        float fLIZ;
        float f;
        if ((63 & j) == 0) {
            fLIZ = (float) C1385770mAJ.LIZ((j >>> 56) & 255);
            f = 255.0f;
        } else {
            fLIZ = (float) C1385770mAJ.LIZ((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return fLIZ / f;
    }

    public static final float LJI(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) C1385770mAJ.LIZ((j >>> 32) & 255)) / 255.0f;
        }
        int i3 = ((short) ((j >>> 16) & 65535)) & 65535;
        int i4 = 32768 & i3;
        int i5 = (i3 >>> 10) & 31;
        int i6 = i3 & 1023;
        if (i5 == 0) {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - C1685920tyQ.LIZ;
                if (i4 == 0) {
                    return fIntBitsToFloat;
                }
                return -fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            i = i6 << 13;
            if (i5 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = (i5 - 15) + 127;
            }
        }
        return Float.intBitsToFloat((i2 << 23) | (i4 << 16) | i);
    }

    public static final AbstractC1685860tyK LJII(long j) {
        float[] fArr = C1E04.LIZ;
        return C1E04.LJJI[(int) (j & 63)];
    }

    public static final float LJIIIIZZ(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) C1385770mAJ.LIZ((j >>> 40) & 255)) / 255.0f;
        }
        int i3 = ((short) ((j >>> 32) & 65535)) & 65535;
        int i4 = 32768 & i3;
        int i5 = (i3 >>> 10) & 31;
        int i6 = i3 & 1023;
        if (i5 == 0) {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - C1685920tyQ.LIZ;
                if (i4 == 0) {
                    return fIntBitsToFloat;
                }
                return -fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            i = i6 << 13;
            if (i5 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = (i5 - 15) + 127;
            }
        }
        return Float.intBitsToFloat((i2 << 23) | (i4 << 16) | i);
    }

    public static final float LJIIIZ(long j) {
        int i;
        int i2;
        if ((63 & j) == 0) {
            return ((float) C1385770mAJ.LIZ((j >>> 48) & 255)) / 255.0f;
        }
        int i3 = ((short) ((j >>> 48) & 65535)) & 65535;
        int i4 = 32768 & i3;
        int i5 = (i3 >>> 10) & 31;
        int i6 = i3 & 1023;
        if (i5 == 0) {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - C1685920tyQ.LIZ;
                if (i4 == 0) {
                    return fIntBitsToFloat;
                }
                return -fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        } else {
            i = i6 << 13;
            if (i5 == 31) {
                i2 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i2 = (i5 - 15) + 127;
            }
        }
        return Float.intBitsToFloat((i2 << 23) | (i4 << 16) | i);
    }

    public static int LJIIJ(long j) {
        return C786410Ut5.Y2(j);
    }

    public static String LJIIJJI(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Color(");
        sbLIZ.append(LJIIIZ(j));
        sbLIZ.append(", ");
        sbLIZ.append(LJIIIIZZ(j));
        sbLIZ.append(", ");
        sbLIZ.append(LJI(j));
        sbLIZ.append(", ");
        sbLIZ.append(LJFF(j));
        sbLIZ.append(", ");
        sbLIZ.append(LJII(j).LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final long LIZIZ(long j, AbstractC1685860tyK abstractC1685860tyK) {
        C1685930tyR c1685930tyRLIZLLL;
        AbstractC1685860tyK abstractC1685860tyKLJII = LJII(j);
        int i = abstractC1685860tyKLJII.LIZJ;
        int i2 = abstractC1685860tyK.LIZJ;
        if ((i | i2) < 0) {
            c1685930tyRLIZLLL = C1E05.LIZLLL(abstractC1685860tyKLJII, abstractC1685860tyK, 0);
        } else {
            C20029713Yp<C1685930tyR> c20029713Yp = C1685980tyW.LIZ;
            int i3 = i | (i2 << 6);
            C1685930tyR c1685930tyRLIZIZ = c20029713Yp.LIZIZ(i3);
            if (c1685930tyRLIZIZ == null) {
                c1685930tyRLIZIZ = C1E05.LIZLLL(abstractC1685860tyKLJII, abstractC1685860tyK, 0);
                c20029713Yp.LJII(i3, c1685930tyRLIZIZ);
            }
            c1685930tyRLIZLLL = c1685930tyRLIZIZ;
        }
        return c1685930tyRLIZLLL.LIZ(j);
    }

    public static long LIZJ(float f, long j) {
        return C1685850tyJ.LIZ(LJIIIZ(j), LJIIIIZZ(j), LJI(j), f, LJII(j));
    }

    public static boolean LIZLLL(long j, Object obj) {
        if (!(obj instanceof C1685910tyP) || j != ((C1685910tyP) obj).LIZ) {
            return false;
        }
        return true;
    }
}
