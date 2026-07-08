package X;

import Y.ARunnableS119S0100000_19;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.profile.menu.data.ProfileMenuData;
import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S1010100_19;

/* JADX INFO: renamed from: X.0iYF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246850iYF {
    public static ProfileMenuData LIZIZ;
    public static final String LJ;
    public static final C1246850iYF LIZ = new C1246850iYF();
    public static final Keva LIZJ = Keva.getRepo("profile_page_model_file");
    public static volatile Object LIZLLL = new Object();

    static {
        C0XQ7.LJ();
        C0XQ7.LIZ.LJIILL(new InterfaceC586170Myt() { // from class: X.0Yv6
            @Override // X.InterfaceC586170Myt
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                String uid;
                String nickname;
                String uid2;
                String nickname2;
                String uid3 = null;
                if (!z) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("type: ");
                    sbLIZ.append(i);
                    sbLIZ.append(" failed, nickname:");
                    if (user != null) {
                        nickname2 = user.getNickname();
                    } else {
                        nickname2 = null;
                    }
                    sbLIZ.append(nickname2);
                    sbLIZ.append(" , uid:");
                    if (user != null) {
                        uid3 = user.getUid();
                    }
                    sbLIZ.append(uid3);
                    C1720106oR.LJI("Profile.ProfileMemuModelStore", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                if (i == 3) {
                    Keva keva = C1246850iYF.LIZJ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("profile_menu_model_");
                    if (user != null) {
                        uid = user.getUid();
                    } else {
                        uid = null;
                    }
                    sbLIZ2.append(uid);
                    keva.erase(C2188811AlT.LIZIZ(sbLIZ2));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("account logout nickname: ");
                    if (user != null) {
                        nickname = user.getNickname();
                    } else {
                        nickname = null;
                    }
                    sbLIZ3.append(nickname);
                    sbLIZ3.append(", uid:");
                    if (user != null) {
                        uid2 = user.getUid();
                    } else {
                        uid2 = null;
                    }
                    sbLIZ3.append(uid2);
                    C1720106oR.LJI("Profile.ProfileMemuModelStore", C2188811AlT.LIZIZ(sbLIZ3));
                    C1246850iYF.LIZIZ = null;
                    return;
                }
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("type: ");
                sbLIZ4.append(i);
                sbLIZ4.append(", re load profile user, curAccount: ");
                sbLIZ4.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getNickname());
                sbLIZ4.append(", uid:");
                sbLIZ4.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getUid());
                C1720106oR.LJI("Profile.ProfileMemuModelStore", C2188811AlT.LIZIZ(sbLIZ4));
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C859020Xmu(null), 3);
            }
        });
        LJ = "\n        {\n\t\"bottom\": {\n\t\t\"component_id\": \"bottom\",\n\t\t\"components\": [{\n\t\t\t\"biz_data\": {\n\t\t\t\t\"describe\": {\n\t\t\t\t\t\"starling_key\": \"profilePageMenu_menuPage_btn\"\n\t\t\t\t}\n\t\t\t},\n\t\t\t\"component_id\": \"bottom_back_to_profile\",\n\t\t\t\"name\": \"bottom_back_to_profile\"\n\t\t}],\n\t\t\"name\": \"bottom\"\n\t},\n\t\"content_section\": {\n\t\t\"component_id\": \"content_section\",\n\t\t\"components\": [{\n\t\t\t\"component_id\": \"content_section_cell_list\",\n\t\t\t\"components\": [{\n\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\"describe\": {\n\t\t\t\t\t\t\"starling_key\": \"creatorCenter_cCMainScreen_screenHeader_Title\"\n\t\t\t\t\t},\n\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\"icon_key\": \"icon_person_star\"\n\t\t\t\t\t},\n\t\t\t\t\t\"pro_account_update_notification_status\": 0\n\t\t\t\t},\n\t\t\t\t\"component_id\": \"content_section_cell_creator_tools\",\n\t\t\t\n\t\t\t\t\"name\": \"content_section_cell_creator_tools\"\n\t\t\t}],\n\t\t\t\"name\": \"content_section_cell_list_management\"\n\t\t}, {\n\t\t\t\"component_id\": \"content_section_cell_list\",\n\t\t\t\"components\": [{\n\t\t\t\t\"actions\": [{\n\t\t\t\t\t\"router\": {\n\t\t\t\t\t\t\"url\": \"aweme://webview?_pia_=1\\u0026hide_nav_bar=1\\u0026use_spark=1\\u0026show_loading=1\\u0026should_full_screen=1\\u0026allow_webview_gesture=1\\u0026url=https%3A%2F%2Finapp.tiktokv.com%2Ftpp%2Finapp%2Fpns_product_poseidon%2Fwatch_history%3F_pia_%3D1%26hide_nav_bar%3D1%26use_spark%3D1%26show_loading%3D1%26should_full_screen%3D1%26allow_webview_gesture%3D1%26bdhm_bid%3Dtiktok_privacy_product_hybrid%26enable_search_history%3D1%26enter_from%3Dprofile_menu\"\n\t\t\t\t\t},\n\t\t\t\t\t\"type\": \"router\"\n\t\t\t\t}],\n\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\"describe\": {\n\t\t\t\t\t\t\"starling_key\": \"watchhistory_entrance\"\n\t\t\t\t\t},\n\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\"icon_key\": \"icon_clock_fill\"\n\t\t\t\t\t}\n\t\t\t\t},\n\t\t\t\t\"component_id\": \"content_section_cell\",\n\t\t\t\t\n\t\t\t\t\"name\": \"content_section_cell_watch_history\"\n\t\t\t}],\n\t\t\t\"name\": \"content_section_cell_list_contents\"\n\t\t}, {\n\t\t\t\"component_id\": \"content_section_cell_list\",\n\t\t\t\"components\": [{\n\t\t\t\t\"actions\": [{\n\t\t\t\t\t\"router\": {\n\t\t\t\t\t\t\"url\": \"aweme://setting\"\n\t\t\t\t\t},\n\t\t\t\t\t\"type\": \"router\"\n\t\t\t\t}],\n\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\"describe\": {\n\t\t\t\t\t\t\"starling_key\": \"com_setting_title\"\n\t\t\t\t\t},\n\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\"icon_key\": \"icon_gear\"\n\t\t\t\t\t}\n\t\t\t\t},\n\t\t\t\t\"component_id\": \"content_section_cell\",\n\t\t\t\t\"name\": \"content_section_cell_settings_and_privacy\"\n\t\t\t}],\n\t\t\t\"name\": \"content_section_cell_list_compliance\"\n\t\t}],\n\t\t\"name\": \"content_section\"\n\t},\n\t\"nav_bar\": {\n\t\t\"component_id\": \"nav_bar\",\n\t\t\"components\": [{\n\t\t\t\"component_id\": \"nav_bar_start\",\n\t\t\t\"components\": [{\n\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\"icon_key\": \"icon_x_mark\"\n\t\t\t\t\t}\n\t\t\t\t},\n\t\t\t\t\"component_id\": \"nav_bar_start_back\",\n\t\t\t\t\"event_params\": [{\n\t\t\t\t\t\"biz_params\": {\n\t\t\t\t\t\t\"action_type\": \"click_cross\"\n\t\t\t\t\t},\n\t\t\t\t\t\"event\": \"profile_menu_exit\",\n\t\t\t\t\t\"type\": 1\n\t\t\t\t}],\n\t\t\t\t\"name\": \"nav_bar_start_back\"\n\t\t\t}],\n\t\t\t\"name\": \"nav_bar_start\"\n\t\t}, {\n\t\t\t\"component_id\": \"nav_bar_end\",\n\t\t\t\"components\": [{\n\t\t\t\t\"actions\": [{\n\t\t\t\t\t\"router\": {\n\t\t\t\t\t\t\"url\": \"aweme://aweme/scan\"\n\t\t\t\t\t},\n\t\t\t\t\t\"type\": \"router\"\n\t\t\t\t}],\n\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\"icon_key\": \"icon_scan\"\n\t\t\t\t\t}\n\t\t\t\t},\n\t\t\t\t\"component_id\": \"nav_bar_base_item\",\n\t\t\t\t\n\t\t\t\t\"name\": \"nav_bar_end_qr_code_scanner\"\n\t\t\t}, {\n\t\t\t\t\"actions\": [{\n\t\t\t\t\t\"router\": {\n\t\t\t\t\t\t\"url\": \"aweme://setting\"\n\t\t\t\t\t},\n\t\t\t\t\t\"type\": \"router\"\n\t\t\t\t}],\n\t\t\t\t\"biz_data\": {\n\t\t\t\t\t\"icon\": {\n\t\t\t\t\t\t\"icon_key\": \"icon_gear\"\n\t\t\t\t\t}\n\t\t\t\t},\n\t\t\t\t\"component_id\": \"nav_bar_end_settings\",\n\t\t\t\n\t\t\t\t\"name\": \"nav_bar_end_settings\"\n\t\t\t}],\n\t\t\t\"name\": \"nav_bar_end\"\n\t\t}],\n\t\t\"name\": \"nav_bar\"\n\t}\n}\n    ";
    }

    public static void LIZ(String str) {
        Type type;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            synchronized (LIZLLL) {
                try {
                    Keva keva = LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("profile_menu_model_");
                    sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
                    ProfileMenuData profileMenuData = null;
                    String string = keva.getString(C2188811AlT.LIZIZ(sbLIZ), null);
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJ(ProfileMenuData.class));
                        } else {
                            type = new TypeToken<ProfileMenuData>() { // from class: X.0Y2O
                            }.getType();
                        }
                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(string, type);
                        if (!(objLJIIIIZZ instanceof ProfileMenuData)) {
                            objLJIIIIZZ = null;
                        }
                        profileMenuData = (ProfileMenuData) objLJIIIIZZ;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    LIZIZ = profileMenuData;
                    if (profileMenuData == null) {
                        LIZIZ = (ProfileMenuData) C1250210idf.LIZ(LJ, ProfileMenuData.class);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadProfilePageModel exception: ");
            sbLIZ2.append(th2.getMessage());
            C1720106oR.LIZ("Profile.ProfileMemuModelStore", C2188811AlT.LIZIZ(sbLIZ2));
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C1250680ieQ.LIZ.getClass();
        if ((AbstractC19994813Le.Default.nextInt(10) + 1) % 2 == 0) {
            C20684815ws.LJFF().execute(new ARunnableS119S0100000_19((Function0) new AwS0S1010100_19(str, jCurrentTimeMillis2, false, 2), 222));
        }
    }
}
