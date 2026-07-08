package X;

import android.os.Bundle;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.ur.experiment.GuideUserBindPhoneNumberConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0ihR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1252550ihR {
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJI;
    public static boolean LJII;
    public static final C1252550ihR LIZ = new C1252550ihR();
    public static final ArrayList<C1248170iaN> LIZIZ = new ArrayList<>();
    public static String LIZJ = "output";
    public static String LJFF = "";

    public static ArrayList LIZJ() {
        ArrayList<C1248170iaN> arrayList = LIZIZ;
        arrayList.clear();
        if (!LJIIJ()) {
            arrayList.add(new C1248170iaN(R.raw.icon_camera, 2131836166, 2131836165, 2131836163, true));
        }
        if (!LJIIIIZZ()) {
            arrayList.add(new C1248170iaN(R.raw.icon_person, 2131836162, 2131836161, 2131836159, true));
        }
        if (LJIIL() && !LJIIIZ()) {
            arrayList.add(new C1248170iaN(R.raw.icon_phone, 2131827390, 2131827389, 2131827387, true));
        }
        if (!LIZ()) {
            arrayList.add(new C1248170iaN(R.raw.icon_pen_on_doc, 2131836158, 2131836157, 2131836155, true));
        }
        if (LJIIJ()) {
            arrayList.add(new C1248170iaN(R.raw.icon_camera, 2131836166, 2131836165, 2131836164, false));
        }
        if (LJIIIIZZ()) {
            arrayList.add(new C1248170iaN(R.raw.icon_person, 2131836162, 2131836161, 2131836160, false));
        }
        if (LJIIL() && LJIIIZ()) {
            arrayList.add(new C1248170iaN(R.raw.icon_phone, 2131827390, 2131827389, 2131827388, false));
        }
        if (LIZ()) {
            arrayList.add(new C1248170iaN(R.raw.icon_pen_on_paper, 2131836158, 2131836157, 2131836156, false));
        }
        return arrayList;
    }

    public static boolean LJIILJJIL() {
        int iLJIJ;
        C01GW c01gw = C296520Bjm.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1 || C296520Bjm.LIZ() || !LJIIL() || LJIIIZ()) {
            return false;
        }
        if (((Number) c01gw.getValue()).intValue() == 3) {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 15, "profile_add_phone_banner_frequency_control", true);
        } else {
            SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
            GuideUserBindPhoneNumberConfig guideUserBindPhoneNumberConfig = C1252560ihS.LIZ;
            GuideUserBindPhoneNumberConfig guideUserBindPhoneNumberConfig2 = (GuideUserBindPhoneNumberConfig) settingsManagerLIZLLL.LJIIIIZZ("remind_bar_freq", GuideUserBindPhoneNumberConfig.class, guideUserBindPhoneNumberConfig);
            if (guideUserBindPhoneNumberConfig2 != null) {
                guideUserBindPhoneNumberConfig = guideUserBindPhoneNumberConfig2;
            }
            iLJIJ = guideUserBindPhoneNumberConfig.hideFreqInDay;
        }
        int i = new C1248100iaG().LIZ().LIZLLL.getInt("click_delete_icon_times", 0);
        SettingsManager settingsManagerLIZLLL2 = SettingsManager.LIZLLL();
        GuideUserBindPhoneNumberConfig guideUserBindPhoneNumberConfig3 = C1252560ihS.LIZ;
        GuideUserBindPhoneNumberConfig guideUserBindPhoneNumberConfig4 = (GuideUserBindPhoneNumberConfig) settingsManagerLIZLLL2.LJIIIIZZ("remind_bar_freq", GuideUserBindPhoneNumberConfig.class, guideUserBindPhoneNumberConfig3);
        if (guideUserBindPhoneNumberConfig4 != null) {
            guideUserBindPhoneNumberConfig3 = guideUserBindPhoneNumberConfig4;
        }
        return i < guideUserBindPhoneNumberConfig3.clickDeleteIconMaxTimes && new C1248100iaG().LIZ().LIZLLL.getLong("last_show_time", 0L) + (((long) iLJIJ) * 86400000) < System.currentTimeMillis();
    }

    public static boolean LIZ() {
        User userLJ = LJ();
        return !u.LJIJI(userLJ != null ? userLJ.signature : null, "", false);
    }

    public static int LIZLLL() {
        User userLJ = LJ();
        if (userLJ != null) {
            return userLJ.getCompleteProfileGuideStrategy();
        }
        return 0;
    }

    public static User LJ() {
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (iAccountUserServiceLJFF != null) {
            return ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUser();
        }
        return null;
    }

    public static int LJFF() {
        int i = (LJIIJ() ? 1 : 0) + (LIZ() ? 1 : 0) + (LJIIIIZZ() ? 1 : 0);
        return LJIIL() ? i + (LJIIIZ() ? 1 : 0) : i;
    }

    public static boolean LJII() {
        User userLJ = LJ();
        return userLJ != null && userLJ.getFansCount() >= 1000;
    }

    public static boolean LJIIIIZZ() {
        List<String> list;
        User userLJ = LJ();
        return (userLJ == null || (list = userLJ.boldFields) == null || !list.contains("nickname")) ? false : true;
    }

    public static boolean LJIIIZ() {
        User userLJ = LJ();
        if (userLJ != null) {
            return userLJ.isPhoneBinded();
        }
        return true;
    }

    public static boolean LJIIJ() {
        List<String> list;
        List<String> list2;
        User userLJ = LJ();
        if (userLJ != null && (list2 = userLJ.boldFields) != null && list2.contains("photo")) {
            return true;
        }
        User userLJ2 = LJ();
        return (userLJ2 == null || (list = userLJ2.boldFields) == null || !list.contains("video")) ? false : true;
    }

    public static boolean LJIIL() {
        return LIZLLL() == 4 || LIZLLL() == 5;
    }

    public static boolean LJIILIIL() {
        User userLJ = LJ();
        String str = userLJ != null ? userLJ.signature : null;
        int i = (str == null || str.length() == 0) ? 1 : 0;
        if (!LJIIIIZZ()) {
            i++;
        }
        if (!LJIIJ()) {
            i++;
        }
        return i >= 2;
    }

    public static boolean LJIILL() {
        if (C10EU.LJIIIIZZ() || LIZ() || LJIIIIZZ() || LJIIJ()) {
            return false;
        }
        return LIZLLL() == 1 || LJIIL() || LIZLLL() == 2 || LIZLLL() == 3;
    }

    public static boolean LJIILLIIL() {
        if (C10EU.LJIIIIZZ()) {
            return false;
        }
        if (LIZLLL() == 0) {
            return true;
        }
        if (LIZLLL() != 1 && !LJIIL()) {
            if (LIZLLL() == 2) {
                return LIZ() && LJIIIIZZ() && LJIIJ();
            }
            if (LIZLLL() == 3) {
                return true;
            }
        }
        return false;
    }

    public static String LIZIZ(User user, String... strArr) {
        if (LJIIJJI(user, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            return "edit";
        }
        return "add";
    }

    public static boolean LJIIJJI(User user, String... strArr) {
        for (String str : strArr) {
            if (user != null && user.boldFields != null && user.boldFields.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public static Bundle LJI(User user, String str, String... strArr) {
        Bundle bundle = new Bundle();
        String strLIZIZ = LIZIZ(user, (String[]) Arrays.copyOf(strArr, strArr.length));
        C786410Ut5.LJJJI("enter_method", str, bundle);
        C786410Ut5.LJJJI("btn_name", strLIZIZ, bundle);
        return bundle;
    }
}
