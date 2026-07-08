package X;

import Y.ARunnableS28S1200000_24;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0rU4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590220rU4 {
    public static final C1590220rU4 LIZ = new C1590220rU4();
    public static C1590320rUE LIZIZ;

    public static final void LIZ(C1590320rUE c1590320rUE, String str) {
        String str2;
        String str3;
        if (!C300620BqO.LIZ()) {
            return;
        }
        String str4 = c1590320rUE.LIZ;
        C1590320rUE c1590320rUE2 = LIZIZ;
        String str5 = null;
        if (c1590320rUE2 != null) {
            str2 = c1590320rUE2.LIZ;
        } else {
            str2 = null;
        }
        if (u.LJIJI(str4, str2, true)) {
            String str6 = c1590320rUE.LIZJ;
            C1590320rUE c1590320rUE3 = LIZIZ;
            if (c1590320rUE3 != null) {
                str5 = c1590320rUE3.LIZJ;
            }
            if (!u.LJIJI(str6, str5, true)) {
                if (!u.LJIJI("enter_skylight", c1590320rUE.LIZJ, true) && !u.LJIJI("hide_skylight", c1590320rUE.LIZJ, true)) {
                    return;
                }
            } else {
                return;
            }
        }
        C1590320rUE c1590320rUE4 = LIZIZ;
        if (c1590320rUE4 != null) {
            C786410Ut5.LJJZZIII(C799570VYd.LIZIZ(), new ARunnableS28S1200000_24(c1590320rUE, str, c1590320rUE4, 0));
        }
        C1590320rUE c1590320rUE5 = LIZIZ;
        if (c1590320rUE5 == null || (str3 = c1590320rUE5.LIZ) == null) {
            str3 = "";
        }
        if (u.LJIJI("video_post_page", str, true)) {
            str3 = "video_post_page";
        }
        c1590320rUE.LIZLLL = System.currentTimeMillis();
        c1590320rUE.LJ = str3;
        LIZIZ = c1590320rUE;
    }
}
