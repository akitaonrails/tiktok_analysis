package X;

import java.util.HashSet;

/* JADX INFO: renamed from: X.1CuW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245381CuW {
    public static final C2245381CuW LIZ = new C2245381CuW();
    public static C2245701Cv2 LIZIZ = new C2245701Cv2();
    public static C2245701Cv2 LIZJ = new C2245701Cv2();
    public static final HashSet<String> LIZLLL = new HashSet<>();
    public static C2245701Cv2 LJ = new C2245701Cv2();
    public static final HashSet<String> LJFF = new HashSet<>();

    public final synchronized void LIZ() {
        LJFF.clear();
        LJ = new C2245701Cv2();
        LIZLLL.clear();
        LIZJ = new C2245701Cv2();
        LIZIZ = new C2245701Cv2();
    }

    public final synchronized long LIZIZ() {
        long j;
        j = LJ.LIZ;
        if (j == -1) {
            j = 0;
        }
        return j;
    }

    public final synchronized long LIZJ() {
        long j;
        j = LIZJ.LIZ;
        if (j == -1) {
            j = 0;
        }
        return j;
    }
}
