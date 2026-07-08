package X;

/* JADX INFO: renamed from: X.0vdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749940vdg {
    public static final C1749940vdg LIZ = new C1749940vdg();

    public static void LIZ(String str, String str2, boolean z) {
        String str3;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logFpParentClickRemoveAppServicePopup, scene:");
        sbLIZ.append(str);
        sbLIZ.append(", permissionAppName:");
        sbLIZ.append(str2);
        sbLIZ.append(", actionRemove:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (str == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str3 = "remove";
        } else {
            str3 = "cancel";
        }
        c2344009Gk.LJIIIIZZ("action", str3);
        if (str2 == null) {
            str2 = "";
        }
        c2344009Gk.LJIIIIZZ("item", str2);
        C20684815ws.LJIILLIIL("fp_parent_click_remove_app_service_popup", c2344009Gk.LIZ);
    }
}
