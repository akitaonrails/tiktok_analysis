package X;

/* JADX INFO: renamed from: X.0lCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348610lCN {
    public static final C1348610lCN LIZ = new C1348610lCN();
    public static boolean LIZIZ;

    public static void LIZ(String str) {
        if (!C295030BhN.LIZ() || C294930BhD.LIZ()) {
            return;
        }
        if (LIZIZ) {
            C1440005kM.LIZ(new C1209980ham(11, str));
        }
        LIZIZ = false;
    }

    public static void LIZIZ(EnumC1346360l8k enumC1346360l8k, String str) {
        if (!C295030BhN.LIZ() || C294930BhD.LIZ()) {
            return;
        }
        if (enumC1346360l8k != EnumC1346360l8k.FEED_QUICK_COMMENT && enumC1346360l8k != EnumC1346360l8k.DETAIL_BOTTOM) {
            if (enumC1346360l8k == EnumC1346360l8k.COMMENT_PANEL) {
                LIZIZ = true;
                return;
            }
            return;
        }
        C1440005kM.LIZ(new C1209980ham(11, str));
    }
}
