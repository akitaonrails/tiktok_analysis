package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingBean;
import com.ss.android.ugc.aweme.compliance.api.model.DigitalWellbeingMissionStatus;
import com.ss.android.ugc.aweme.compliance.api.model.DoNotDisturbSettings;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHoursAdditionalSettings;
import com.ss.android.ugc.aweme.compliance.api.model.SleepStreakStatus;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity.DigitalWellbeingSetting;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.service.IPNSProtectionDataLayerServiceFactory;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.ss.android.ugc.tiktok.pns.screen.interfaces.PnSDigitalWellbeingSDKService;
import java.util.List;
import kotlin.jvm.internal.AFwS221S0000000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15Y6, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15Y6 implements InterfaceC20537915Yb, SocialPublishCallback {
    public static final C15Y6 LL;
    public static final C01GW LLILLJJLI;
    public static final C01GW LLILLL;
    public static DigitalWellbeingSetting LLILZ;
    public static boolean LLILZIL;
    public static DigitalWellbeingBean LLILZLL;

    @Override // X.InterfaceC20537915Yb
    public final void LJ() {
        LLILZIL = false;
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
        C15Y6 c15y6 = new C15Y6();
        LL = c15y6;
        LLILLJJLI = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(531));
        LLILLL = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(532));
        LLILZ = LJJII();
        C817503Hh c817503Hh = C817503Hh.LL;
        C23250099c.LIZLLL(c817503Hh, null, null, new C20536215Xk(null), 3);
        ISocialPublishBridgeService iSocialPublishBridgeService = (ISocialPublishBridgeService) PluggableExtentionKt.pluggableSpi$default(ISocialPublishBridgeService.class, false, false, false, 14, null);
        if (iSocialPublishBridgeService != null) {
            iSocialPublishBridgeService.Kg(c15y6, new C565120MEk());
        }
        if (C297270Bkz.LIZ()) {
            c15y6.LJJIIJZLJL();
            IPNSProtectionDataLayerServiceFactory iPNSProtectionDataLayerServiceFactory = (IPNSProtectionDataLayerServiceFactory) PluggableExtentionKt.pluggableSpi$default(IPNSProtectionDataLayerServiceFactory.class, false, false, false, 14, null);
            C23250099c.LIZLLL(c817503Hh, C2107508Nl.LIZ, null, new C15XF(iPNSProtectionDataLayerServiceFactory != null ? iPNSProtectionDataLayerServiceFactory.LIZJ() : null, null), 2);
        }
    }

    public static final DigitalWellbeingSetting LJJII() {
        Integer numLIZLLL = LJJIII().LIZLLL(C15Y5.RESTRICT_MODE);
        boolean z = (numLIZLLL != null ? numLIZLLL.intValue() : 0) == 1;
        Integer numLIZLLL2 = LJJIII().LIZLLL(C15Y5.SCREEN_TIME_MANAGEMENT);
        int iIntValue = numLIZLLL2 != null ? numLIZLLL2.intValue() : 0;
        Integer numLIZLLL3 = LJJIII().LIZLLL(C15Y5.SCREEN_TIME_MANAGEMENT_ENABLED);
        int iIntValue2 = numLIZLLL3 != null ? numLIZLLL3.intValue() : 0;
        Integer numLIZLLL4 = LJJIII().LIZLLL(C15Y5.SCREEN_TIME_MANAGEMENT_ELIGIBLE);
        int iIntValue3 = numLIZLLL4 != null ? numLIZLLL4.intValue() : 0;
        Integer numLIZLLL5 = LJJIII().LIZLLL(C15Y5.SCREEN_TIME_MANAGEMENT_TYPE);
        int iIntValue4 = numLIZLLL5 != null ? numLIZLLL5.intValue() : 0;
        Integer numLIZLLL6 = LJJIII().LIZLLL(C15Y5.WEEKLY_UPDATE);
        boolean z2 = numLIZLLL6 != null && numLIZLLL6.intValue() == 1;
        Integer numLIZLLL7 = LJJIII().LIZLLL(C15Y5.SCREEN_TIME_BREAKS);
        int iIntValue5 = numLIZLLL7 != null ? numLIZLLL7.intValue() : 0;
        Integer numLIZLLL8 = LJJIII().LIZLLL(C15Y5.SCREEN_DURATION_TYPE);
        int iIntValue6 = numLIZLLL8 != null ? numLIZLLL8.intValue() : 0;
        Boolean boolLIZ = LJJIII().LIZ(C15Y5.RESTRICT_MODE_HAS_PASSWORD);
        Boolean bool = Boolean.TRUE;
        return new DigitalWellbeingSetting(z, iIntValue, iIntValue2, iIntValue3, iIntValue4, z2, iIntValue5, iIntValue6, Intrinsics.LJFF(boolLIZ, bool), Intrinsics.LJFF(LJJIII().LIZ(C15Y5.DW_NEW_FEATURE_RELEASE_HIGHLIGHT), bool), Boolean.valueOf(Intrinsics.LJFF(LJJIII().LIZ(C15Y5.NON_LOGIN_SCREEN_TIME_ENABLE), bool)), Intrinsics.LJFF(LJJIII().LIZ(C15Y5.DW_ALL_NEW_FEATURE_HIGHLIGHT), bool));
    }

    public static C15XY LJJIII() {
        return (C15XY) LLILLJJLI.getValue();
    }

    public static C15YI LJJIIJ() {
        return (C15YI) LLILLL.getValue();
    }

    @Override // X.InterfaceC20537915Yb
    public final int LIZ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getTimeLockSelfType();
        }
        return 0;
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LIZIZ() {
        Boolean nonLoginScreenTimeEnable;
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting == null || (nonLoginScreenTimeEnable = digitalWellbeingSetting.getNonLoginScreenTimeEnable()) == null) {
            return false;
        }
        return nonLoginScreenTimeEnable.booleanValue();
    }

    @Override // X.InterfaceC20537915Yb
    public final void LIZJ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setRestrictModeSelf(true);
        }
        LJJIIJ().LIZLLL(C15Y5.RESTRICT_MODE, 1);
        C15YE.LIZ.getClass();
        C15YE.LJIILJJIL();
        C15YE.LJIILL(null, "");
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJII() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        return digitalWellbeingSetting != null && digitalWellbeingSetting.getDwAllNewFeatureHighlight();
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJIIIIZZ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getScreenTimeType();
        }
        return 0;
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJIIIZ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getScreenTimeBreaks();
        }
        return 0;
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJIIJ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setRestrictModeSelf(false);
        }
        LJJIIJ().LIZLLL(C15Y5.RESTRICT_MODE, 0);
        C15YE.LIZ.getClass();
        C15YE.LJIILJJIL();
        C15YE.LJIILL(null, "");
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJIIL() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.isRestrictModeSelf();
        }
        return false;
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJIILIIL() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getTimeLockSelfEnable();
        }
        return 0;
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJIILL() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        return digitalWellbeingSetting != null && digitalWellbeingSetting.getTimelockEligible() == 1;
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJIILLIIL() {
        Integer num;
        List<ScreenTimeManagementDaySetting> list;
        ScreenTimeManagementDaySetting screenTimeManagementDaySetting;
        Integer num2;
        DigitalWellbeingBean digitalWellbeingBean = LLILZLL;
        if (digitalWellbeingBean == null || (num = digitalWellbeingBean.screenTimeManagementRepeatType) == null || num.intValue() != 2) {
            DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
            if (digitalWellbeingSetting != null) {
                return digitalWellbeingSetting.getTimeLockSelfInMin();
            }
            return 0;
        }
        DigitalWellbeingBean digitalWellbeingBean2 = LLILZLL;
        if (digitalWellbeingBean2 == null || (list = digitalWellbeingBean2.screenTimeManagementWeekSettings) == null || (screenTimeManagementDaySetting = (ScreenTimeManagementDaySetting) C13LP.LJJJLZIJ(C20537215Xu.LIZ() - 1, list)) == null || (num2 = screenTimeManagementDaySetting.screenTimeLimitForWeek) == null) {
            return 0;
        }
        return num2.intValue();
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJIIZILJ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getRestrictModeHasPassword();
        }
        return false;
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJIJJ() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.isWeeklyUpdate();
        }
        return false;
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJIL() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setTimelockEligible(2);
        }
        LJJIIJ().LIZLLL(C15Y5.SCREEN_TIME_MANAGEMENT_ELIGIBLE, 2);
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJJ() {
        Integer num;
        DigitalWellbeingBean digitalWellbeingBean = LLILZLL;
        if (digitalWellbeingBean == null || (num = digitalWellbeingBean.screenTimeManagementRepeatType) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // X.InterfaceC20537915Yb
    public final int LJJI() {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            return digitalWellbeingSetting.getTimeLockSelfInMin();
        }
        return 0;
    }

    public final void LJJIIJZLJL() {
        DigitalWellbeingSetting digitalWellbeingSetting;
        DigitalWellbeingSetting digitalWellbeingSetting2 = LLILZ;
        boolean zIsRestrictModeSelf = digitalWellbeingSetting2 != null ? digitalWellbeingSetting2.isRestrictModeSelf() : false;
        DigitalWellbeingSetting digitalWellbeingSetting3 = LLILZ;
        Integer numValueOf = digitalWellbeingSetting3 != null ? Integer.valueOf(digitalWellbeingSetting3.getScreenTimeBreaks()) : null;
        LLILZ = LJJII();
        if (LJIIL() != zIsRestrictModeSelf) {
            if (((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().isUserCancelled()) {
                LLILZIL = true;
            } else {
                C15YE.LIZ.getClass();
                C15YE.LJIILJJIL();
                C15YE.LJIILL(null, "");
            }
        }
        DigitalWellbeingSetting digitalWellbeingSetting4 = LLILZ;
        if (!Intrinsics.LJFF(digitalWellbeingSetting4 != null ? Integer.valueOf(digitalWellbeingSetting4.getScreenTimeBreaks()) : null, numValueOf) || ((digitalWellbeingSetting = LLILZ) != null && digitalWellbeingSetting.getScreenTimeBreaks() == 0)) {
            DigitalWellbeingSetting digitalWellbeingSetting5 = LLILZ;
            C1440005kM.LIZ(new C15XT(digitalWellbeingSetting5 != null ? digitalWellbeingSetting5.getScreenTimeBreaks() : 0));
        }
        PnSDigitalWellbeingSDKService pnSDigitalWellbeingSDKService = (PnSDigitalWellbeingSDKService) PluggableExtentionKt.pluggableSpi$default(PnSDigitalWellbeingSDKService.class, false, false, false, 14, null);
        if (pnSDigitalWellbeingSDKService != null) {
            Integer numLIZLLL = LJJIII().LIZLLL(C15Y5.DIGITAL_WELLBEING_INFRA_USAGE_TIME_UPLOAD_FREQUENCY);
            pnSDigitalWellbeingSDKService.LJIIIZ(numLIZLLL != null ? numLIZLLL.intValue() : DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        }
    }

    @Override // X.InterfaceC20537915Yb
    public final int getSelfTimelockType() {
        Integer num;
        DigitalWellbeingBean digitalWellbeingBean = LLILZLL;
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
        int[] iArr = C20537715Xz.LIZ;
        int i = iArr[enumC20537615XyLIZIZ2.ordinal()];
        int i2 = i != 1 ? i != 2 ? 0 : 2 : 1;
        int i3 = iArr[c15yd.LIZIZ().ordinal()];
        String str5 = i3 != 1 ? i3 != 2 ? "" : "teen" : "parent";
        DigitalWellbeingBean digitalWellbeingBean = LLILZLL;
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
    public final void LJIILJJIL() {
        LJJIIJ().LIZ(C15Y5.class);
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJIJJLI() {
        DigitalWellbeingSetting digitalWellbeingSetting;
        return LJIILLIIL() > 0 && (digitalWellbeingSetting = LLILZ) != null && digitalWellbeingSetting.getTimeLockSelfEnable() == 1;
    }

    @Override // X.InterfaceC20537915Yb
    public final boolean LJFF() {
        return LLILZIL;
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJIJ(boolean z) {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setRestrictModeHasPassword(z);
        }
        LJJIIJ().LIZIZ(C15Y5.RESTRICT_MODE_HAS_PASSWORD, Boolean.valueOf(z));
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJIJI(boolean z) {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setWeeklyUpdate(z);
        }
        LJJIIJ().LIZLLL(C15Y5.WEEKLY_UPDATE, Integer.valueOf(z ? 1 : 0));
    }

    @Override // X.InterfaceC20537915Yb
    public final void LIZLLL(int i, int i2) {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setScreenTimeBreaks(i);
        }
        LJJIIJ().LIZLLL(C15Y5.SCREEN_TIME_BREAKS, Integer.valueOf(i));
        DigitalWellbeingSetting digitalWellbeingSetting2 = LLILZ;
        if (digitalWellbeingSetting2 != null) {
            digitalWellbeingSetting2.setScreenTimeType(i2);
        }
        LJJIIJ().LIZLLL(C15Y5.SCREEN_DURATION_TYPE, Integer.valueOf(i2));
    }

    @Override // X.InterfaceC20537915Yb
    public final void LJI(int i, int i2) {
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting == null || i != digitalWellbeingSetting.getScreenTimeBreaks()) {
            C1440005kM.LIZ(new C15XT(i));
        }
        LLILZ = new DigitalWellbeingSetting(false, 0, 0, 0, 0, false, i, i2, false, false, Boolean.FALSE, false);
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
        DigitalWellbeingSetting digitalWellbeingSetting = LLILZ;
        if (digitalWellbeingSetting != null) {
            digitalWellbeingSetting.setTimeLockSelfInMin(i);
        }
        LJJIIJ().LIZLLL(C15Y5.SCREEN_TIME_MANAGEMENT, Integer.valueOf(i));
        DigitalWellbeingSetting digitalWellbeingSetting2 = LLILZ;
        if (digitalWellbeingSetting2 != null) {
            digitalWellbeingSetting2.setTimeLockSelfEnable(z ? 1 : 0);
        }
        LJJIIJ().LIZLLL(C15Y5.SCREEN_TIME_MANAGEMENT_ENABLED, Integer.valueOf(z ? 1 : 0));
        DigitalWellbeingSetting digitalWellbeingSetting3 = LLILZ;
        if (digitalWellbeingSetting3 != null) {
            digitalWellbeingSetting3.setTimeLockSelfType(i2);
        }
        LJJIIJ().LIZLLL(C15Y5.SCREEN_TIME_MANAGEMENT_TYPE, Integer.valueOf(i2));
        LJJIIJ().LIZLLL(C15Y5.SCREEN_TIME_MANAGEMENT_REPEAT_TYPE, Integer.valueOf(i3));
        LJJIIJ().LIZJ(C15Y5.SCREEN_TIME_MANAGEMENT_WEEK_SETTINGS, list);
        C20536115Xj.LIZ.getClass();
        SleepHourConfigSettings sleepHourConfigSettingsLIZLLL = C20536115Xj.LIZLLL();
        DoNotDisturbSettings doNotDisturbSettingsLJFF = C20536115Xj.LJFF();
        LLILZLL = new DigitalWellbeingBean(0, 0, 0, 0, 0, 0, 0, 0, Boolean.FALSE, sleepHourConfigSettingsLIZLLL, C20536115Xj.LIZ(), doNotDisturbSettingsLJFF, Integer.valueOf(i3), list, new SleepHoursAdditionalSettings(0L, 0L, 0, 0, ""), Boolean.FALSE, Boolean.FALSE, Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), Boolean.FALSE, Boolean.FALSE, new DigitalWellbeingMissionStatus(new SleepStreakStatus(0, Boolean.FALSE, Boolean.FALSE), Boolean.FALSE));
    }
}
