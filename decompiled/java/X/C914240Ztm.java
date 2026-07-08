package X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Ztm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C914240Ztm {
    public static long LIZIZ;
    public static long LIZLLL;
    public static long LJFF;
    public static long LJII;
    public static final C914240Ztm LIZ = new C914240Ztm();
    public static final List<Long> LIZJ = new ArrayList();
    public static final List<Long> LJ = new ArrayList();
    public static final List<Long> LJI = new ArrayList();
    public static final List<Long> LJIIIIZZ = new ArrayList();

    public static void LIZ() {
        if (LIZLLL > 0) {
            ((ArrayList) LJ).add(Long.valueOf(System.currentTimeMillis() - LIZLLL));
            LIZLLL = 0L;
        }
    }

    public static void LIZIZ() {
        if (LJII > 0) {
            ((ArrayList) LJIIIIZZ).add(Long.valueOf(System.currentTimeMillis() - LJII));
            LJII = 0L;
        }
    }

    public static void LIZJ() {
        if (LIZIZ > 0) {
            ((ArrayList) LIZJ).add(Long.valueOf(System.currentTimeMillis() - LIZIZ));
            LIZIZ = 0L;
        }
    }

    public static void LIZLLL() {
        if (LJFF > 0) {
            ((ArrayList) LJI).add(Long.valueOf(System.currentTimeMillis() - LJFF));
            LJFF = 0L;
        }
    }

    public static void LJ() {
        LIZIZ = 0L;
        LIZLLL = 0L;
        LJFF = 0L;
        LJII = 0L;
        ((ArrayList) LIZJ).clear();
        ((ArrayList) LJ).clear();
        ((ArrayList) LJI).clear();
        ((ArrayList) LJIIIIZZ).clear();
    }
}
