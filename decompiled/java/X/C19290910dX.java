package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.tcm.service.ITcmService;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CPlusSettings;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.TcmConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.10dX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19290910dX {
    public static boolean LJII() {
        String tcmEntranceSchemaUrl;
        try {
            TcmConfig tcmConfigLJII = ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJII();
            if (tcmConfigLJII != null && (tcmEntranceSchemaUrl = tcmConfigLJII.getTcmEntranceSchemaUrl()) != null) {
                if (tcmEntranceSchemaUrl.length() > 0) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static boolean LIZJ() {
        Keva repo = Keva.getRepo("keva_repo_qa");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_key_red_dot");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static boolean LIZ() {
        CPlusSettings cPlusSettingsLIZIZ = C742380TAe.LIZIZ();
        if (cPlusSettingsLIZIZ != null && cPlusSettingsLIZIZ.allowCreatorPlus) {
            return false;
        }
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(C460020I2e.LIZ, 0, "tcm_pro_account");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tcm_first_dot");
        sbLIZ.append(curUser.getUid());
        return sharedPreferencesLIZJ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static boolean LIZIZ() {
        if (C304900BxI.LIZ()) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_add_yours");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_key_red_dot");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return !repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true) && ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getDisplayAddYoursOnProfile() == 1;
    }

    public static boolean LIZLLL() {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
        if (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || !Intrinsics.LJFF(interfaceC20673515v3K4.LJJLIL(), Boolean.TRUE)) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_live_creator_hub");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_key_red_dot");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static boolean LJ() {
        if (!LJIIJ()) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_subscription_setting_entrance");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_key_red_dot");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static boolean LJFF() {
        if (!C613560O4s.LIZ()) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_sound_on");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_key_red_dot");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static boolean LJI() {
        if (!((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isEnableSubscription()) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_subs");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("keva_key_red_dot");
        sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
        return repo.getBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public static boolean LJIIIIZZ() {
        Integer numValueOf;
        CommerceUserInfo commerceUserInfo = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getCommerceUserInfo();
        return (commerceUserInfo == null || (numValueOf = Integer.valueOf(commerceUserInfo.getStarAtlas())) == null || numValueOf.intValue() != 1) ? false : true;
    }

    public static void LJIIIZ() {
        if (LJ()) {
            Keva repo = Keva.getRepo("keva_repo_subscription_setting_entrance");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("keva_key_red_dot");
            sbLIZ.append(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId());
            repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        }
    }

    public static boolean LJIIJ() {
        JSONObject jSONObject;
        boolean zOptBoolean;
        if (!((Boolean) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ(Boolean.TRUE, "ttlive_show_subscribe")).booleanValue()) {
            return false;
        }
        String str = (String) ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().B4().LIZJ("", "subscription_settings");
        if (TextUtils.isEmpty(str)) {
            zOptBoolean = false;
        } else {
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = new JSONObject();
            }
            zOptBoolean = jSONObject.optBoolean("has_subscription_history");
        }
        return ((AbstractC848400XPy) C0XQ7.LJFF()).isLogin() && zOptBoolean;
    }

    public static boolean LJIIJJI() {
        TcmConfig tcmConfigLJII;
        return LJII() && (tcmConfigLJII = ((ITcmService) ServiceManager.get().getService(ITcmService.class)).LJII()) != null && tcmConfigLJII.getCanUseTcmConsole();
    }
}
