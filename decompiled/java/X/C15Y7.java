package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingBean;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingMissionStatus;
import com.ss.android.ugc.aweme.compliance.api.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHoursAdditionalSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepStreakStatus;
import com.ss.android.ugc.aweme.compliance.api.model.UserDetailsInfoBean;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.DigitalWellbeingSetting;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Y7, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15Y7 implements InterfaceC20537915Yb, SocialPublishCallback {
    public static final C15Y7 LL = new C15Y7();
    public static final C01GW LLILLJJLI;
    public static DigitalWellbeingSetting LLILLL;
    public static boolean LLILZ;
    public static DigitalWellbeingBean LLILZIL;

    @Override // X.InterfaceC20537915Yb
    public final void LJ() {
        LLILZ = false;
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishProgress(int i, C1434900nRY c1434900nRY) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishStart(PublishModel publishModel) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReadyToCreateAweme(PublishModel publishModel) {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onReportPublish() {
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onSynthesisSuccess(PublishModel publishModel, String str) {
    }

    static {
        String strLIZ;
        DigitalWellbeingSetting digitalWellbeingSetting;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C1944207jU());
        LLILLJJLI = c01gwLIZIZ;
        C15YO c15yo = (C15YO) c01gwLIZIZ.getValue();
        if (c15yo == null || (strLIZ = c15yo.LIZ()) == null) {
            strLIZ = "";
        }
        if (TextUtils.isEmpty(strLIZ)) {
            digitalWellbeingSetting = null;
        } else {
            try {
                digitalWellbeingSetting = (DigitalWellbeingSetting) new Gson().LJII(strLIZ, DigitalWellbeingSetting.class);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                digitalWellbeingSetting = null;
            }
        }
        LLILLL = digitalWellbeingSetting;
        C15Y7 c15y7 = LL;
        c15y7.getClass();
        C15O7.LIZJ(CallableC20536315Xl.LL);
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.Kg(c15y7, new C565120MEk());
        }
    }

    @Override // X.InterfaceC20537915Yb
    public final int LIZ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getTimeLockSelfType();
        }
        return 0;
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LIZIZ() {
        Boolean nonLoginScreenTimeEnable;
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting == null || (nonLoginScreenTimeEnable = digitalWellbeingSetting.getNonLoginScreenTimeEnable()) == null) {
            return false;
        }
        return nonLoginScreenTimeEnable.booleanValue();
    }

    @Override // X.InterfaceC20537915Yb
    public final void LIZJ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setRestrictModeSelf(true);
        }
        C15YE.LIZ.getClass();
        C15YE.LJIILJJIL();
        C15YE.LJIILL(null, "");
        LJJII(LLILLL);
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJII() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        return digitalWellbeingSetting != null && digitalWellbeingSetting.getDwAllNewFeatureHighlight();
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJIIIIZZ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getScreenTimeType();
        }
        return 0;
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJIIIZ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getScreenTimeBreaks();
        }
        return 0;
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJIIJ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setRestrictModeSelf(false);
        }
        C15YE.LIZ.getClass();
        C15YE.LJIILJJIL();
        C15YE.LJIILL(null, "");
        LJJII(LLILLL);
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJIIL() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.isRestrictModeSelf();
        }
        return false;
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJIILIIL() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getTimeLockSelfEnable();
        }
        return 0;
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJIILJJIL() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setRestrictModeSelf(false);
        }
        DigitalWellbeingSetting digitalWellbeingSetting2 = LLILLL;
        if (digitalWellbeingSetting2 != null) {
            digitalWellbeingSetting2.setTimeLockSelfInMin(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting3 = LLILLL;
        if (digitalWellbeingSetting3 != null) {
            digitalWellbeingSetting3.setTimelockEligible(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting4 = LLILLL;
        if (digitalWellbeingSetting4 != null) {
            digitalWellbeingSetting4.setWeeklyUpdate(false);
        }
        DigitalWellbeingSetting digitalWellbeingSetting5 = LLILLL;
        if (digitalWellbeingSetting5 != null) {
            digitalWellbeingSetting5.setScreenTimeBreaks(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting6 = LLILLL;
        if (digitalWellbeingSetting6 != null) {
            digitalWellbeingSetting6.setScreenTimeType(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting7 = LLILLL;
        if (digitalWellbeingSetting7 != null) {
            digitalWellbeingSetting7.setTimeLockSelfEnable(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting8 = LLILLL;
        if (digitalWellbeingSetting8 != null) {
            digitalWellbeingSetting8.setScreenTimeType(0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting9 = LLILLL;
        if (digitalWellbeingSetting9 != null) {
            digitalWellbeingSetting9.setRestrictModeHasPassword(false);
        }
        DigitalWellbeingSetting digitalWellbeingSetting10 = LLILLL;
        if (digitalWellbeingSetting10 != null) {
            digitalWellbeingSetting10.setNonLoginScreenTimeEnable(Boolean.FALSE);
        }
        DigitalWellbeingSetting digitalWellbeingSetting11 = LLILLL;
        if (digitalWellbeingSetting11 != null) {
            digitalWellbeingSetting11.setDwAllNewFeatureHighlight(false);
        }
        LJJII(LLILLL);
        C20536115Xj c20536115Xj = C20536115Xj.LIZ;
        Boolean bool = Boolean.FALSE;
        SleepHourConfigSettings sleepHourConfigSettings = new SleepHourConfigSettings(0, 0, 0, 0, bool, Boolean.FALSE, "", 0, Boolean.FALSE);
        c20536115Xj.getClass();
        C20536115Xj.LJIIJJI(sleepHourConfigSettings);
        Long.valueOf(0L);
        C20536115Xj.LJIIL(new SleepHoursAdditionalSettings(0L, 0L, 0, 0, ""));
        C20536115Xj.LJIILJJIL(new UserDetailsInfoBean(bool, 0));
        C20536115Xj.LJIIIZ(new DigitalWellbeingMissionStatus(new SleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE));
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJIILL() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        return digitalWellbeingSetting != null && digitalWellbeingSetting.getTimelockEligible() == 1;
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJIILLIIL() {
        Integer num;
        List<ScreenTimeManagementDaySetting> list;
        ScreenTimeManagementDaySetting screenTimeManagementDaySetting;
        Integer num2;
        DigitalWellbeingBean digitalWellbeingBean = LLILZIL;
        if (digitalWellbeingBean == null || (num = digitalWellbeingBean.screenTimeManagementRepeatType) == null || num.intValue() != 2) {
            DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
            if (digitalWellbeingSetting != null) {
                return digitalWellbeingSetting.getTimeLockSelfInMin();
            }
            return 0;
        }
        DigitalWellbeingBean digitalWellbeingBean2 = LLILZIL;
        if (digitalWellbeingBean2 == null || (list = digitalWellbeingBean2.screenTimeManagementWeekSettings) == null || (screenTimeManagementDaySetting = (ScreenTimeManagementDaySetting) C13LP.LJJJLZIJ(C20537215Xu.LIZ() - 1, list)) == null || (num2 = screenTimeManagementDaySetting.screenTimeLimitForWeek) == null) {
            return 0;
        }
        return num2.intValue();
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJIIZILJ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getRestrictModeHasPassword();
        }
        return false;
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJIJJ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.isWeeklyUpdate();
        }
        return false;
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJIL() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setTimelockEligible(2);
        }
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJJ() {
        Integer num;
        DigitalWellbeingBean digitalWellbeingBean = LLILZIL;
        if (digitalWellbeingBean == null || (num = digitalWellbeingBean.screenTimeManagementRepeatType) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJJI() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getTimeLockSelfInMin();
        }
        return 0;
    }

    @Override // X.InterfaceC20537915Yb
    public final int getSelfTimelockType() {
        Integer num;
        DigitalWellbeingBean digitalWellbeingBean = LLILZIL;
        if (digitalWellbeingBean == null || (num = digitalWellbeingBean.screenTimeManagementRepeatType) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJIIJJI() {
        DoNotDisturbSettings doNotDisturbSettings;
        Boolean bool;
        C15YD c15yd = C297270Bkz.LIZ() ? FamilyPairingManagerV2.LIZ : FamilyPairingManager.LIZ;
        C15YE.LIZ.getClass();
        String str = "on";
        String str2 = C15YE.LJIIJJI() ? "on" : "off";
        String str3 = C15YE.LJIIJ() ? "on" : "off";
        EnumC20537615Xy enumC20537615XyLIZIZ = c15yd.LIZIZ();
        EnumC20537615Xy enumC20537615Xy = EnumC20537615Xy.CHILD;
        String str4 = (enumC20537615XyLIZIZ == enumC20537615Xy || c15yd.LIZIZ() == EnumC20537615Xy.PARENT) ? "on" : "off";
        EnumC20537615Xy enumC20537615XyLIZIZ2 = c15yd.LIZIZ();
        int[] iArr = C15Y0.LIZ;
        int i = iArr[enumC20537615XyLIZIZ2.ordinal()];
        int i2 = i != 1 ? i != 2 ? 0 : 2 : 1;
        int i3 = iArr[c15yd.LIZIZ().ordinal()];
        String str5 = i3 != 1 ? i3 != 2 ? "" : "teen" : "parent";
        DigitalWellbeingBean digitalWellbeingBean = LLILZIL;
        String str6 = (digitalWellbeingBean == null || (doNotDisturbSettings = digitalWellbeingBean.doNotDisturbSettings) == null || (bool = doNotDisturbSettings.pauseNotificationEnabled) == null || !bool.booleanValue()) ? "off" : "on";
        C20536115Xj.LIZ.getClass();
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
        boolean zLJFF = sleepHourConfigSettingsLIZLLL != null ? Intrinsics.LJFF(sleepHourConfigSettingsLIZLLL.sleepHourEnabled, Boolean.TRUE) : false;
        String str7 = C15YE.LJIIIIZZ() == 2 ? "customize" : "default";
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        c2344009Gk.LJIIIIZZ("type", str7);
        c2344009Gk.LJIIIIZZ("role", str5);
        C20684815ws.LJIILLIIL("time_lock_status", c2344009Gk.LIZ);
        C2344009Gk c2344009Gk2 = new C2344009Gk();
        c2344009Gk2.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str3);
        C20684815ws.LJIILLIIL("teen_mode_status", c2344009Gk2.LIZ);
        C2344009Gk c2344009Gk3 = new C2344009Gk();
        c2344009Gk3.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str4);
        c2344009Gk3.LIZJ(i2, "role");
        C20684815ws.LJIILLIIL("kid_platform_status", c2344009Gk3.LIZ);
        C2344009Gk c2344009Gk4 = new C2344009Gk();
        c2344009Gk4.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LJIIIZ() > 0 ? "on" : "off");
        C20684815ws.LJIILLIIL("screen_time_break_status", c2344009Gk4.LIZ);
        C2344009Gk c2344009Gk5 = new C2344009Gk();
        c2344009Gk5.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, LJIJJ() ? "on" : "off");
        C20684815ws.LJIILLIIL("weekly_screen_time_status", c2344009Gk5.LIZ);
        C2344009Gk c2344009Gk6 = new C2344009Gk();
        c2344009Gk6.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, zLJFF ? "on" : "off");
        C20684815ws.LJIILLIIL("sleep_hour_status", c2344009Gk6.LIZ);
        C2344009Gk c2344009Gk7 = new C2344009Gk();
        c2344009Gk7.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str6);
        C20684815ws.LJIILLIIL("mute_noti_status", c2344009Gk7.LIZ);
        C2344009Gk c2344009Gk8 = new C2344009Gk();
        c2344009Gk8.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, C15YE.LJIIJJI() ? "on" : "off");
        c2344009Gk8.LIZJ(LJIILLIIL(), "time");
        C20684815ws.LJIILLIIL("stm_cooldown_status", c2344009Gk8.LIZ);
        String str8 = c15yd.LIZIZ() != enumC20537615Xy ? c15yd.LIZIZ() == EnumC20537615Xy.PARENT ? (c15yd.getChildCount() != 0 || c15yd.LJIJJ() <= 0) ? "parent" : "pending" : "none" : "teen";
        if (c15yd.LIZIZ() != enumC20537615Xy) {
            if (c15yd.LIZIZ() != EnumC20537615Xy.PARENT) {
                str = c15yd.LIZIZ() == EnumC20537615Xy.UNLINK_LOCKED ? "unlink" : "none";
            } else if (c15yd.getChildCount() == 0 && c15yd.LJIJJ() > 0) {
                str = "pending";
            }
        }
        if (c15yd.LJIJJ() == -1 || c15yd.getChildCount() == -1 || c15yd.LJIILL() == -1) {
            return;
        }
        C2344009Gk c2344009Gk9 = new C2344009Gk();
        c2344009Gk9.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
        c2344009Gk9.LJIIIIZZ("role", str8);
        c2344009Gk9.LIZJ(c15yd.LJJ(), "user_identity");
        c2344009Gk9.LIZJ(c15yd.getChildCount(), "children_count");
        c2344009Gk9.LIZJ(c15yd.LJIJJ(), "link_count");
        c2344009Gk9.LIZLLL(c15yd.LJIILL(), "duration_as_parent");
        C20684815ws.LJIILLIIL("family_pairing_status", c2344009Gk9.LIZ);
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJIJJLI() {
        DigitalWellbeingSetting digitalWellbeingSetting;
        return LJIILLIIL() > 0 && (digitalWellbeingSetting = LLILLL) != null && digitalWellbeingSetting.getTimeLockSelfEnable() == 1;
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJFF() {
        return LLILZ;
    }

    public static void LJJII(DigitalWellbeingSetting digitalWellbeingSetting) {
        int i;
        C15YO c15yo = (C15YO) LLILLJJLI.getValue();
        if (c15yo != null) {
            C1227904rF.LIZ.getClass();
            c15yo.LIZIZ(C1227904rF.LJI(digitalWellbeingSetting));
        }
        Bundle bundle = new Bundle();
        C15YE.LIZ.getClass();
        if (C15YE.LJIIJ()) {
            i = 2;
        } else {
            i = 0;
        }
        bundle.putInt("filter_warn", i);
        AppLog.setCustomerHeader(bundle);
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJIJ(boolean z) {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setRestrictModeHasPassword(z);
        }
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJIJI(boolean z) {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setWeeklyUpdate(z);
        }
    }

    @Override // X.InterfaceC20537915Yb
    public final void LIZLLL(int i, int i2) {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setScreenTimeBreaks(i);
        }
        DigitalWellbeingSetting digitalWellbeingSetting2 = LLILLL;
        if (digitalWellbeingSetting2 != null) {
            digitalWellbeingSetting2.setScreenTimeType(i2);
        }
        LJJII(LLILLL);
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJI(int i, int i2) {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting == null || i != digitalWellbeingSetting.getScreenTimeBreaks()) {
            C1440005kM.LIZ(new C15XT(i));
        }
        DigitalWellbeingSetting digitalWellbeingSetting2 = new DigitalWellbeingSetting(false, 0, 0, 0, 0, false, i, i2, false, false, Boolean.FALSE, false);
        LLILLL = digitalWellbeingSetting2;
        LJJII(digitalWellbeingSetting2);
    }

    @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
    public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
        if (publishModel == null) {
            return;
        }
        C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), null, "WellbeingMissionStoryPublishFinished"));
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJJIFFI(int i, boolean z, int i2, int i3, List list) {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILLL;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setTimeLockSelfInMin(i);
        }
        DigitalWellbeingSetting digitalWellbeingSetting2 = LLILLL;
        if (digitalWellbeingSetting2 != null) {
            digitalWellbeingSetting2.setTimeLockSelfEnable(z ? 1 : 0);
        }
        DigitalWellbeingSetting digitalWellbeingSetting3 = LLILLL;
        if (digitalWellbeingSetting3 != null) {
            digitalWellbeingSetting3.setTimeLockSelfType(i2);
        }
        LJJII(LLILLL);
        C20536115Xj.LIZ.getClass();
        C20536115Xj.LIZIZ.storeInt(C20536115Xj.LJI("screen_time_management_repeat_type"), i3);
        C20536115Xj.LJIIJ(list);
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
        DoNotDisturbSettings doNotDisturbSettingsLJFF = C20536115Xj.LJFF();
        LLILZIL = new DigitalWellbeingBean(0, 0, 0, 0, 0, 0, 0, 0, Boolean.FALSE, sleepHourConfigSettingsLIZLLL, C20536115Xj.LIZ(), doNotDisturbSettingsLJFF, Integer.valueOf(i3), list, new SleepHoursAdditionalSettings(0L, 0L, 0, 0, ""), Boolean.FALSE, Boolean.FALSE, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), Boolean.FALSE, Boolean.FALSE, new DigitalWellbeingMissionStatus(new SleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE));
    }
}
