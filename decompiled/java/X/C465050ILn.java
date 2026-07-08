package X;

/* JADX INFO: renamed from: X.0ILn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465050ILn {
    public static C20182313y1 LIZIZ;
    public static C20182313y1 LIZJ;
    public static C20182313y1 LIZLLL;
    public static C20182413y2 LJFF;
    public static C20182413y2 LJI;
    public static C20182413y2 LJII;
    public static C20182413y2 LJIIIIZZ;
    public static C20182413y2 LJIIIZ;
    public static final C465050ILn LIZ = new C465050ILn();
    public static long LJ = -1;

    public static C20182413y2 LJIIIZ() {
        if (LIZIZ == null) {
            LIZIZ = C20182313y1.LIZJ("scene_FirstLive_Prepare");
        }
        C20182413y2 c20182413y2 = LJFF;
        if (c20182413y2 != null) {
            return c20182413y2;
        }
        C20182313y1 c20182313y1 = LIZIZ;
        if (c20182313y1 != null) {
            LJFF = c20182313y1.LIZ("prepare_live_data");
        }
        return LJFF;
    }

    public static final void LIZLLL(String str) {
        LIZ.getClass();
        C20182413y2 c20182413y2LJIIIZ = LJIIIZ();
        if (c20182413y2LJIIIZ != null) {
            c20182413y2LJIIIZ.LIZ(str);
        }
    }

    public static final void LJI(long j) {
        LIZ.getClass();
        C20182413y2 c20182413y2LJIIIIZZ = LJIIIIZZ(j);
        if (c20182413y2LJIIIIZZ != null) {
            c20182413y2LJIIIIZZ.LIZIZ();
        }
        LJIIIIZZ = null;
        LJIIJJI(j);
    }

    public static C20182413y2 LJII(long j) {
        C20182313y1 c20182313y1 = LIZIZ;
        if (c20182313y1 == null || j <= 0) {
            return null;
        }
        long j2 = LJ;
        if (j2 < 0) {
            LJ = j;
        } else if (j != j2) {
            return null;
        }
        C20182413y2 c20182413y2 = LJII;
        if (c20182413y2 != null) {
            return c20182413y2;
        }
        C20182413y2 c20182413y2LIZ = c20182313y1.LIZ("create_live_container");
        LJII = c20182413y2LIZ;
        return c20182413y2LIZ;
    }

    public static C20182413y2 LJIIIIZZ(long j) {
        if (LIZJ == null) {
            LIZJ = C20182313y1.LIZJ("scene_FirstLive_EnterRoom");
        }
        if (j <= 0) {
            return null;
        }
        long j2 = LJ;
        if (j2 < 0) {
            LJ = j;
        } else if (j != j2) {
            return null;
        }
        C20182413y2 c20182413y2 = LJIIIIZZ;
        if (c20182413y2 != null) {
            return c20182413y2;
        }
        C20182313y1 c20182313y1 = LIZJ;
        if (c20182313y1 != null) {
            LJIIIIZZ = c20182313y1.LIZ("enter_room");
        }
        return LJIIIIZZ;
    }

    public static C20182413y2 LJIIJ(long j) {
        if (LIZLLL == null) {
            LIZLLL = C20182313y1.LIZJ("scene_FirstLive_PullStream");
        }
        if (j <= 0) {
            return null;
        }
        long j2 = LJ;
        if (j2 < 0) {
            LJ = j;
        } else if (j != j2) {
            return null;
        }
        C20182413y2 c20182413y2 = LJIIIZ;
        if (c20182413y2 != null) {
            return c20182413y2;
        }
        C20182313y1 c20182313y1 = LIZLLL;
        if (c20182313y1 != null) {
            LJIIIZ = c20182313y1.LIZ("pull_stream");
        }
        return LJIIIZ;
    }

    public static void LJIIJJI(long j) {
        C20182313y1 c20182313y1;
        C20182313y1 c20182313y12;
        C20182313y1 c20182313y13;
        if (j != LJ) {
            return;
        }
        if (LJII == null && (c20182313y13 = LIZIZ) != null) {
            c20182313y13.LJFF();
            C20182313y1 c20182313y14 = LIZIZ;
            if (c20182313y14 != null) {
                c20182313y14.LJII();
            }
            LIZIZ = null;
        }
        if (LJIIIIZZ == null && (c20182313y12 = LIZJ) != null) {
            c20182313y12.LJFF();
            C20182313y1 c20182313y15 = LIZJ;
            if (c20182313y15 != null) {
                c20182313y15.LJII();
            }
            LIZJ = null;
        }
        if (LJIIIZ == null && (c20182313y1 = LIZLLL) != null) {
            c20182313y1.LJFF();
            C20182313y1 c20182313y16 = LIZLLL;
            if (c20182313y16 != null) {
                c20182313y16.LJII();
            }
            LIZLLL = null;
        }
        if (LIZIZ == null && LIZJ == null && LIZLLL == null) {
            LJ = -1L;
        }
    }

    public static final void LIZ(long j, String str) {
        LIZ.getClass();
        C20182413y2 c20182413y2LJII = LJII(j);
        if (c20182413y2LJII != null) {
            c20182413y2LJII.LIZ(str);
        }
    }

    public static final void LIZIZ(long j, String str) {
        LIZ.getClass();
        C20182413y2 c20182413y2LJIIIIZZ = LJIIIIZZ(j);
        if (c20182413y2LJIIIIZZ != null) {
            c20182413y2LJIIIIZZ.LIZ(str);
        }
    }

    public static final void LIZJ(long j, String str) {
        LIZ.getClass();
        C20182413y2 c20182413y2LJII = LJII(j);
        if (c20182413y2LJII != null) {
            c20182413y2LJII.LIZ(str);
        }
    }

    public static final void LJ(long j, String str) {
        LIZ.getClass();
        C20182413y2 c20182413y2LJIIJ = LJIIJ(j);
        if (c20182413y2LJIIJ != null) {
            c20182413y2LJIIJ.LIZ(str);
        }
    }

    public static final void LJFF(long j, String str) {
        LIZ.getClass();
        C20182413y2 c20182413y2LJII = LJII(j);
        if (c20182413y2LJII != null) {
            c20182413y2LJII.LIZ(str);
        }
    }
}
