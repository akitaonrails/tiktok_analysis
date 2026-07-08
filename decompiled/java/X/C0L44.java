package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L44, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L44 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ() {
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        return currentUser != null && currentUser.LJI() && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_sub_only_video", true, false);
    }

    public static boolean LIZIZ(Boolean bool) {
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null && currentUser.LJI() && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_sub_only_video", true, false)) {
            if (bool == null || Intrinsics.LJFF(bool, Boolean.TRUE)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
