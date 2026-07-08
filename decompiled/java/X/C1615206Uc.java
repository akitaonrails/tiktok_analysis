package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Uc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1615206Uc {
    public static final C1615206Uc LIZ = new C1615206Uc();
    public static Pair<String, Integer> LIZIZ = new Pair<>("", 0);

    public static boolean LIZ() {
        int iLJIJ;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (Intrinsics.LJFF(curUserId, LIZIZ.getFirst())) {
            iLJIJ = LIZIZ.getSecond().intValue();
        } else {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_highlight_upload_cover", true);
            LIZIZ = new Pair<>(curUserId, Integer.valueOf(iLJIJ));
        }
        C728040Sh8.LIZ.getClass();
        return C728040Sh8.LIZ() && iLJIJ == 1;
    }
}
