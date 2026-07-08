package X;

/* JADX INFO: renamed from: X.01pI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C451401pI {
    public static boolean LIZ() {
        AbstractC848400XPy abstractC848400XPy = (AbstractC848400XPy) C0XQ7.LJFF();
        if (!abstractC848400XPy.isLogin()) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("@LinkRelation", "not showPrivacyNotice, not login!");
            return false;
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 1, "link_privacy_guide_dialog_enable", true) != 1) {
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LJI("@LinkRelation", "not showPrivacyNotice, experiment not enable!");
            return false;
        }
        String curUserId = abstractC848400XPy.getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        if (!C451201pG.LJII.getValue().getBoolean(curUserId, false)) {
            return true;
        }
        int i3 = C2187451AjH.LIZ;
        C1720106oR.LJI("@LinkRelation", "not showPrivacyNotice, has shown!");
        return false;
    }
}
