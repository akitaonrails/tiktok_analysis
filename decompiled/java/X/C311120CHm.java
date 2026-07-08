package X;

/* JADX INFO: renamed from: X.0CHm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C311120CHm {
    public static int LIZ() {
        if (C0CHQ.LIZ().getAccountService().LJIIJJI() || !C311130CHn.LIZ()) {
            return 0;
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_local_extract_feature_for_autocut", true, false)) {
            return 2;
        }
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_autocut_extract_feature_clip128", true, false) ? 1 : 0;
    }

    public static boolean LIZIZ() {
        return C1697810uHb.LJIIJJI(0, 1).contains(Integer.valueOf(LIZ()));
    }
}
