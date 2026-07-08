package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.ContentPreferenceVM;

/* JADX INFO: renamed from: X.14YX, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14YX {
    public static void LIZ() {
        DialogC1389620mGW dialogC1389620mGW;
        DialogC1389620mGW dialogC1389620mGW2 = ContentPreferenceVM.LL;
        if (dialogC1389620mGW2 != null && dialogC1389620mGW2.isShowing() && (dialogC1389620mGW = ContentPreferenceVM.LL) != null) {
            dialogC1389620mGW.dismiss();
            C785410UrT.LIZ(dialogC1389620mGW);
        }
        ContentPreferenceVM.LL = null;
    }
}
