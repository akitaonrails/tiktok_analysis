package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creatortools.creatorplus.CPlusSettings;
import com.ss.android.ugc.aweme.creatortools.videogift.GiftSettings;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.10dZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19291110dZ {
    public static final C19291110dZ LIZ = new C19291110dZ();

    static {
        LIZ();
    }

    public static final void LIZ() {
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser != null) {
            curUser.getRegisterTime();
            boolean z = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - curUser.getRegisterTime() < 2592000;
            Keva repo = Keva.getRepo("video_gift_settings_keva_repo");
            LIZ.getClass();
            repo.storeBoolean(LIZIZ("vgv_is_new_user_account"), z);
        }
    }

    public static final boolean LIZJ() {
        CPlusSettings cPlusSettingsLIZIZ = C742380TAe.LIZIZ();
        if (cPlusSettingsLIZIZ != null && cPlusSettingsLIZIZ.allowCreatorPlus) {
            return false;
        }
        Keva repo = Keva.getRepo("video_gift_settings_keva_repo");
        LIZ.getClass();
        boolean z = repo.getBoolean(LIZIZ("vgc_visiting_first_time"), true);
        try {
            SettingsManager.LIZLLL().getClass();
            GiftSettings giftSettings = (GiftSettings) SettingsManager.LJII("nlg_creators", GiftSettings.class);
            return giftSettings != null && giftSettings.allowVideoGift && z;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    public static String LIZIZ(String str) {
        String shortId;
        User curUser = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser();
        if (curUser == null) {
            return str;
        }
        String uniqueId = curUser.getUniqueId();
        if (uniqueId != null && uniqueId.length() != 0) {
            shortId = curUser.getUniqueId();
        } else {
            shortId = curUser.getShortId();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(shortId);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
