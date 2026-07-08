package X;

/* JADX INFO: renamed from: X.0tiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1675860tiC {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZ(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (j2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (j2 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static void LJFF(InterfaceC1675870tiD interfaceC1675870tiD, InterfaceC1680820tqC interfaceC1680820tqC, C1685400txa c1685400txa, int i) {
        float f;
        C1695700uEC c1695700uEC;
        int i2;
        int i3 = i & 2;
        if ((i & 4) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        C1685400txa c1685400txa2 = null;
        if ((i & 8) != 0) {
            c1695700uEC = C1695700uEC.LIZ;
        } else {
            c1695700uEC = null;
        }
        if ((i & 16) == 0) {
            c1685400txa2 = c1685400txa;
        }
        if ((i & 32) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i2 = C1668240tVu.LIZIZ;
        } else {
            i2 = 0;
        }
        interfaceC1675870tiD.LJJIII(interfaceC1680820tqC, 0L, f, c1695700uEC, c1685400txa2, i2);
    }

    public static void LJII(InterfaceC1675870tiD interfaceC1675870tiD, InterfaceC1680960tqQ interfaceC1680960tqQ, AbstractC1668700tWe abstractC1668700tWe, float f, C1695210uDP c1695210uDP, int i) {
        int i2;
        AbstractC1695860uES abstractC1695860uES = c1695210uDP;
        float f2 = f;
        if ((i & 4) != 0) {
            f2 = 1.0f;
        }
        if ((i & 8) != 0) {
            abstractC1695860uES = C1695700uEC.LIZ;
        }
        if ((i & 32) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i2 = C1668240tVu.LIZIZ;
        } else {
            i2 = 0;
        }
        interfaceC1675870tiD.LJJIJIIJI(interfaceC1680960tqQ, abstractC1668700tWe, f2, abstractC1695860uES, null, i2);
    }

    public static void LJIIIIZZ(InterfaceC1675870tiD interfaceC1675870tiD, InterfaceC1680960tqQ interfaceC1680960tqQ, long j, float f, AbstractC1695860uES abstractC1695860uES, int i) {
        int i2;
        AbstractC1695860uES abstractC1695860uES2 = abstractC1695860uES;
        float f2 = f;
        if ((i & 4) != 0) {
            f2 = 1.0f;
        }
        if ((i & 8) != 0) {
            abstractC1695860uES2 = C1695700uEC.LIZ;
        }
        if ((i & 32) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i2 = C1668240tVu.LIZIZ;
        } else {
            i2 = 0;
        }
        interfaceC1675870tiD.LLILL(interfaceC1680960tqQ, j, f2, abstractC1695860uES2, null, i2);
    }

    public static void LIZJ(InterfaceC1675870tiD interfaceC1675870tiD, AbstractC1668700tWe abstractC1668700tWe, float f, long j, float f2, C1695700uEC c1695700uEC, int i) {
        int i2;
        C1695700uEC c1695700uEC2 = c1695700uEC;
        float f3 = f2;
        long jLJIJI = j;
        float fLIZJ = f;
        if ((i & 2) != 0) {
            fLIZJ = C1680770tq7.LIZJ(interfaceC1675870tiD.LIZIZ()) / 2.0f;
        }
        if ((i & 4) != 0) {
            jLJIJI = interfaceC1675870tiD.LJIJI();
        }
        if ((i & 8) != 0) {
            f3 = 1.0f;
        }
        if ((i & 16) != 0) {
            c1695700uEC2 = C1695700uEC.LIZ;
        }
        if ((i & 64) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i2 = C1668240tVu.LIZIZ;
        } else {
            i2 = 0;
        }
        interfaceC1675870tiD.LLII(abstractC1668700tWe, fLIZJ, jLJIJI, f3, c1695700uEC2, null, i2);
    }

    public static void LIZLLL(InterfaceC1675870tiD interfaceC1675870tiD, long j, float f, long j2, float f2, AbstractC1695860uES abstractC1695860uES, int i) {
        int i2;
        AbstractC1695860uES abstractC1695860uES2 = abstractC1695860uES;
        float f3 = f2;
        long jLJIJI = j2;
        float fLIZJ = f;
        if ((i & 2) != 0) {
            fLIZJ = C1680770tq7.LIZJ(interfaceC1675870tiD.LIZIZ()) / 2.0f;
        }
        if ((i & 4) != 0) {
            jLJIJI = interfaceC1675870tiD.LJIJI();
        }
        if ((i & 8) != 0) {
            f3 = 1.0f;
        }
        if ((i & 16) != 0) {
            abstractC1695860uES2 = C1695700uEC.LIZ;
        }
        if ((i & 64) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i2 = C1668240tVu.LIZIZ;
        } else {
            i2 = 0;
        }
        interfaceC1675870tiD.LJJIIJ(j, fLIZJ, jLJIJI, f3, abstractC1695860uES2, null, i2);
    }

    public static void LJI(InterfaceC1675870tiD interfaceC1675870tiD, long j, long j2, long j3, float f, int i, int i2) {
        int i3;
        int i4 = i;
        float f2 = f;
        float f3 = 0.0f;
        if ((i2 & 8) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            i4 = 0;
        }
        if ((i2 & 64) != 0) {
            f3 = 1.0f;
        }
        if ((i2 & 256) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i3 = C1668240tVu.LIZIZ;
        } else {
            i3 = 0;
        }
        interfaceC1675870tiD.LJLZ(j, j2, j3, f2, i4, null, f3, null, i3);
    }

    public static void LJIIJJI(InterfaceC1675870tiD interfaceC1675870tiD, AbstractC1668700tWe abstractC1668700tWe, long j, long j2, long j3, C1695210uDP c1695210uDP, int i) {
        float f;
        int i2;
        long j4 = j3;
        long jLIZ = j2;
        AbstractC1695860uES abstractC1695860uES = c1695210uDP;
        long j5 = j;
        if ((i & 2) != 0) {
            j5 = 0;
        }
        if ((i & 4) != 0) {
            jLIZ = LIZ(interfaceC1675870tiD.LIZIZ(), j5);
        }
        if ((i & 8) != 0) {
            j4 = 0;
        }
        if ((i & 16) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if ((i & 32) != 0) {
            abstractC1695860uES = C1695700uEC.LIZ;
        }
        if ((i & 128) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i2 = C1668240tVu.LIZIZ;
        } else {
            i2 = 0;
        }
        interfaceC1675870tiD.LJJJJI(abstractC1668700tWe, j5, jLIZ, j4, f, abstractC1695860uES, null, i2);
    }

    public static void LJIIIZ(InterfaceC1675870tiD interfaceC1675870tiD, AbstractC1668700tWe abstractC1668700tWe, long j, long j2, float f, AbstractC1695860uES abstractC1695860uES, int i, int i2) {
        float f2 = f;
        int i3 = i;
        AbstractC1695860uES abstractC1695860uES2 = abstractC1695860uES;
        long jLIZ = j2;
        long j3 = j;
        if ((i2 & 2) != 0) {
            j3 = 0;
        }
        if ((i2 & 4) != 0) {
            jLIZ = LIZ(interfaceC1675870tiD.LIZIZ(), j3);
        }
        if ((i2 & 8) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 16) != 0) {
            abstractC1695860uES2 = C1695700uEC.LIZ;
        }
        if ((i2 & 64) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i3 = C1668240tVu.LIZIZ;
        }
        interfaceC1675870tiD.LJLIIIL(abstractC1668700tWe, j3, jLIZ, f2, abstractC1695860uES2, null, i3);
    }

    public static void LJIIL(InterfaceC1675870tiD interfaceC1675870tiD, long j, long j2, long j3, long j4, C1695210uDP c1695210uDP, int i, int i2) {
        float f;
        AbstractC1695860uES abstractC1695860uES = c1695210uDP;
        long jLIZ = j3;
        long j5 = j4;
        int i3 = i;
        long j6 = j2;
        if ((i2 & 2) != 0) {
            j6 = 0;
        }
        if ((i2 & 4) != 0) {
            jLIZ = LIZ(interfaceC1675870tiD.LIZIZ(), j6);
        }
        if ((i2 & 8) != 0) {
            j5 = 0;
        }
        if ((i2 & 16) != 0) {
            abstractC1695860uES = C1695700uEC.LIZ;
        }
        if ((i2 & 32) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if ((i2 & 128) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i3 = C1668240tVu.LIZIZ;
        }
        interfaceC1675870tiD.LJLLILLLL(j, j6, jLIZ, j5, abstractC1695860uES, f, null, i3);
    }

    public static void LIZIZ(InterfaceC1675870tiD interfaceC1675870tiD, long j, float f, float f2, boolean z, long j2, long j3, C1695210uDP c1695210uDP, int i) {
        float f3;
        int i2;
        long jLIZ = j3;
        AbstractC1695860uES abstractC1695860uES = c1695210uDP;
        long j4 = j2;
        if ((i & 16) != 0) {
            j4 = 0;
        }
        if ((i & 32) != 0) {
            jLIZ = LIZ(interfaceC1675870tiD.LIZIZ(), j4);
        }
        if ((i & 64) != 0) {
            f3 = 1.0f;
        } else {
            f3 = 0.0f;
        }
        if ((i & 128) != 0) {
            abstractC1695860uES = C1695700uEC.LIZ;
        }
        if ((i & 512) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i2 = C1668240tVu.LIZIZ;
        } else {
            i2 = 0;
        }
        interfaceC1675870tiD.LJJIZ(j, f, f2, z, j4, jLIZ, f3, abstractC1695860uES, null, i2);
    }

    public static void LJ(InterfaceC1675870tiD interfaceC1675870tiD, InterfaceC1680820tqC interfaceC1680820tqC, long j, long j2, long j3, float f, C1685400txa c1685400txa, int i, int i2) {
        C1695700uEC c1695700uEC;
        int i3;
        long j4 = j3;
        int i4 = i;
        float f2 = f;
        long height = j2;
        long j5 = j;
        if ((i2 & 2) != 0) {
            j5 = 0;
        }
        if ((i2 & 4) != 0) {
            height = (((long) interfaceC1680820tqC.getHeight()) & 4294967295L) | (((long) interfaceC1680820tqC.getWidth()) << 32);
        }
        int i5 = i2 & 8;
        if ((i2 & 16) != 0) {
            j4 = height;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        }
        C1685400txa c1685400txa2 = null;
        if ((i2 & 64) != 0) {
            c1695700uEC = C1695700uEC.LIZ;
        } else {
            c1695700uEC = null;
        }
        if ((i2 & 128) == 0) {
            c1685400txa2 = c1685400txa;
        }
        if ((i2 & 256) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i3 = C1668240tVu.LIZIZ;
        } else {
            i3 = 0;
        }
        if ((i2 & 512) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i4 = C1668240tVu.LIZJ;
        }
        interfaceC1675870tiD.LJLJLLL(interfaceC1680820tqC, j5, height, 0L, j4, f2, c1695700uEC, c1685400txa2, i3, i4);
    }

    public static void LJIIJ(InterfaceC1675870tiD interfaceC1675870tiD, long j, long j2, long j3, float f, C1695210uDP c1695210uDP, C1685400txa c1685400txa, int i, int i2) {
        if ((i2 & 2) != 0) {
            j2 = 0;
        }
        if ((i2 & 4) != 0) {
            j3 = LIZ(interfaceC1675870tiD.LIZIZ(), j2);
        }
        if ((i2 & 8) != 0) {
            f = 1.0f;
        }
        AbstractC1695860uES abstractC1695860uES = c1695210uDP;
        if ((i2 & 16) != 0) {
            abstractC1695860uES = C1695700uEC.LIZ;
        }
        if ((i2 & 32) != 0) {
            c1685400txa = null;
        }
        if ((i2 & 64) != 0) {
            InterfaceC1675870tiD.LLILL.getClass();
            i = C1668240tVu.LIZIZ;
        }
        interfaceC1675870tiD.LLIFFJFJJ(j, j2, j3, f, abstractC1695860uES, c1685400txa, i);
    }
}
