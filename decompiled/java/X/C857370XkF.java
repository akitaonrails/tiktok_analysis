package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0XkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857370XkF {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(327));

    public static InterfaceC2257101DWa LIZ() {
        return C0CHQ.LIZ().getAccountService().getCurrentUser();
    }

    public static boolean LIZIZ(String str) {
        SettingsManager.LIZLLL().getClass();
        int iLJ = SettingsManager.LJ("exit_camera_privacy_dialog_threshold_times", -1);
        Keva keva = (Keva) LIZ.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_post_to_friends_times");
        int i = keva.getInt(C2188811AlT.LIZIZ(sbLIZ), 0);
        C385220F8m c385220F8m = C385220F8m.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("isShowPrivatePopView limit:");
        sbLIZ2.append(iLJ);
        sbLIZ2.append(",lastClickPostF:");
        sbLIZ2.append(i);
        C201955140j.LIZJ(c385220F8m, C2188811AlT.LIZIZ(sbLIZ2));
        if (iLJ == 0) {
            return true;
        }
        if (iLJ <= 0 || i >= iLJ) {
            return false;
        }
        return true;
    }
}
