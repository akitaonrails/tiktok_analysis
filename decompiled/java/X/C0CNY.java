package X;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CNY, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CNY {
    public static final C0CNY LIZ = new C0CNY();
    public static Pair<String, Integer> LIZIZ = new Pair<>("", 0);

    public static boolean LIZ() {
        return (LIZIZ() & 1) == 1;
    }

    public static int LIZIZ() {
        if (!C0CNZ.LIZ()) {
            return C0C64.LJIILLIIL().LJIJ(31744, 0, "video_view_history", true);
        }
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (Intrinsics.LJFF(curUserId, LIZIZ.getFirst())) {
            return LIZIZ.getSecond().intValue();
        }
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "video_view_history", true);
        LIZIZ = new Pair<>(curUserId, Integer.valueOf(iLJIJ));
        return iLJIJ;
    }
}
