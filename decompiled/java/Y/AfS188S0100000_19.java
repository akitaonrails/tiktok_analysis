package Y;

import X.AbstractC1247090iYd;
import X.AbstractC1604130rqV;
import X.AbstractC1906720ziY;
import X.AbstractC316870CbV;
import X.C086I;
import X.C09JN;
import X.C0HZQ;
import X.C0S1L;
import X.C0XIR;
import X.C0XT7;
import X.C0XZ2;
import X.C0XZJ;
import X.C1075780e6K;
import X.C1211700hdY;
import X.C1211880hdq;
import X.C1233960iDS;
import X.C1234920iF0;
import X.C1235600iG6;
import X.C1236240iH8;
import X.C1236890iIB;
import X.C1237220iIi;
import X.C1238240iKM;
import X.C1238760iLC;
import X.C1238900iLQ;
import X.C1238920iLS;
import X.C1247070iYb;
import X.C1247080iYc;
import X.C1247190iYn;
import X.C1247240iYs;
import X.C1247250iYt;
import X.C1247270iYv;
import X.C1249200ic2;
import X.C1253880ija;
import X.C1255780ime;
import X.C1258970irn;
import X.C1259180is8;
import X.C1259310isL;
import X.C1259360isQ;
import X.C12CY;
import X.C1354920lMY;
import X.C1389890mGx;
import X.C1391190mJ3;
import X.C13LP;
import X.C1450070nq1;
import X.C15438062q;
import X.C1619080sEc;
import X.C1623606Xi;
import X.C1625860sPY;
import X.C1641660sp2;
import X.C1668306g5;
import X.C1720106oR;
import X.C19EG;
import X.C1BVK;
import X.C1C7U;
import X.C20441214yg;
import X.C20600815jK;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2276471E8n;
import X.C2344009Gk;
import X.C281200B0k;
import X.C316640Cb8;
import X.C316650Cb9;
import X.C343970De7;
import X.C491001vg;
import X.C727230Sfp;
import X.C735840Sti;
import X.C786410Ut5;
import X.C849450XTz;
import X.C849600XUo;
import X.C851360XaY;
import X.C851370XaZ;
import X.C852810Xct;
import X.C853660XeG;
import X.C854460XfY;
import X.EnumC1223070hvt;
import X.EnumC1237100iIW;
import X.EnumC1242330iQx;
import X.EnumC1242340iQy;
import X.EnumC1242370iR1;
import X.EnumC323450Cm7;
import X.InterfaceC1209130hZP;
import X.InterfaceC1209750haP;
import X.InterfaceC1232100iAS;
import X.InterfaceC1247720iZe;
import X.InterfaceC1252130igl;
import X.InterfaceC1361890lXn;
import X.InterfaceC1891350zJl;
import X.InterfaceC19716212Ca;
import X.InterfaceC853780XeS;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.account.bind.BindPhoneCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifyEmailFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerifySmsFor2046Fragment;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CreatePasswordSheetFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailBindSheetFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailOTPLoginCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeSheetFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneCodeLoginVerifyOrBindFragment;
import com.ss.android.ugc.aweme.account.ui.SmsConsentPageActivity;
import com.ss.android.ugc.aweme.anchor.AddAnchorViewModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.fragment.TimeUnlockFragment;
import com.ss.android.ugc.aweme.detail.panel.StoryMixedFeedDetailPanel;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.explore.assem.ExploreViewPagerComponent;
import com.ss.android.ugc.aweme.feed.component.FeedRefreshRecoverComponent;
import com.ss.android.ugc.aweme.feed.helper.RecFeedShareComponentController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveStatus;
import com.ss.android.ugc.aweme.model.PaidCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.PaidCollectionListResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.module.NotificationChunkVM;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddSeriesToLiveViewModel;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.series.innerfeed.panel.PaidContentVideoPanel;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.model.RegionStatus;
import com.ss.android.ugc.aweme.shortvideo.page.linkanchor.LinkValidateResult;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.model.StoryArchDetail;
import com.ss.android.ugc.aweme.story.model.StoryArchDetailResponse;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.aweme.unifiedauthapi.service.IPopupInfoService;
import com.ss.android.ugc.profile.business.balance.ContentCellBalanceProtocol;
import com.ss.android.ugc.profile.business.profile.edit.list.ProfileLinksOrderViewModel;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcAvatarViewModel;
import com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcIntroFragmentV2;
import com.ss.android.ugc.profile.business.ur.editprofile.vm.ProfileEditProfileViewModel;
import com.ss.android.ugc.profile.business.ur.entrances.ProfileAddFriendsRedPointsVM;
import com.ss.android.ugc.profile.business.ur.follow.UserProfileFollowVM;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchAssem;
import com.ss.android.ugc.profile.business.ur.following.vm.RelationSearchVM;
import com.ss.android.ugc.profile.platform.business.header.business.advancedfeature.assemble.ProfileHeaderAdvancedFeatureBaseComponent;
import com.ss.android.ugc.tiktok.pns.feedsafety.survey.PNSSurveyService;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS95S0110000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class AfS188S0100000_19 implements C09JN {
    public final int $t;
    public Object l0;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
            case 6:
                accept$6(this, obj);
                break;
            case 7:
                accept$7(this, obj);
                break;
            case 8:
                accept$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                accept$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                accept$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                accept$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                accept$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                accept$13(this, obj);
                break;
            case 14:
                accept$14(this, obj);
                break;
            case 15:
                accept$15(this, obj);
                break;
            case 16:
                accept$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                accept$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                accept$18(this, obj);
                break;
            case 19:
                accept$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                accept$20(this, obj);
                break;
            case 21:
                accept$21(this, obj);
                break;
            case 22:
                accept$22(this, obj);
                break;
            case 23:
                accept$23(this, obj);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                accept$24(this, obj);
                break;
            case 25:
                accept$25(this, obj);
                break;
            case 26:
                accept$26(this, obj);
                break;
            case 27:
                accept$27(this, obj);
                break;
            case 28:
                accept$28(this, obj);
                break;
            case 29:
                accept$29(this, obj);
                break;
            case 30:
                accept$30(this, obj);
                break;
            case 31:
                accept$31(this, obj);
                break;
            case 32:
                accept$32(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                accept$33(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                accept$34(this, obj);
                break;
            case 35:
                accept$35(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                accept$36(this, obj);
                break;
            case 37:
                accept$37(this, obj);
                break;
            case 38:
                accept$38(this, obj);
                break;
            case 39:
                accept$39(this, obj);
                break;
            case 40:
                accept$40(this, obj);
                break;
            case 41:
                accept$41(this, obj);
                break;
            case 42:
                accept$42(this, obj);
                break;
            case 43:
                accept$43(this, obj);
                break;
            case 44:
                accept$44(this, obj);
                break;
            case 45:
                accept$45(this, obj);
                break;
            case 46:
                accept$46(this, obj);
                break;
            case 47:
                accept$47(this, obj);
                break;
            case 48:
                accept$48(this, obj);
                break;
            case 49:
                accept$49(this, obj);
                break;
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                accept$50(this, obj);
                break;
            case 51:
                accept$51(this, obj);
                break;
            case 52:
                accept$52(this, obj);
                break;
            case 53:
                accept$53(this, obj);
                break;
            case 54:
                accept$54(this, obj);
                break;
            case 55:
                accept$55(this, obj);
                break;
            case 56:
                accept$56(this, obj);
                break;
            case 57:
                accept$57(this, obj);
                break;
            case 58:
                accept$58(this, obj);
                break;
            case 59:
                accept$59(this, obj);
                break;
            case 60:
                accept$60(this, obj);
                break;
            case 61:
                accept$61(this, obj);
                break;
            case BaseNotice.CREATOR /* 62 */:
                accept$62(this, obj);
                break;
            case 63:
                accept$63(this, obj);
                break;
            case 64:
                accept$64(this, obj);
                break;
            case 65:
                accept$65(this, obj);
                break;
            case 66:
                accept$66(this, obj);
                break;
            case 67:
                accept$67(this, obj);
                break;
            case 68:
                accept$68(this, obj);
                break;
            case 69:
                accept$69(this, obj);
                break;
            case 70:
                accept$70(this, obj);
                break;
            case 71:
                accept$71(this, obj);
                break;
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                accept$72(this, obj);
                break;
            case 73:
                accept$73(this, obj);
                break;
            case 74:
                accept$74(this, obj);
                break;
            case 75:
                accept$75(this, obj);
                break;
            case 76:
                accept$76(this, obj);
                break;
            case 77:
                accept$77(this, obj);
                break;
            case 78:
                accept$78(this, obj);
                break;
            case 79:
                accept$79(this, obj);
                break;
            case 80:
                accept$80(this, obj);
                break;
            case 81:
                accept$81(this, obj);
                break;
            case 82:
                accept$82(this, obj);
                break;
            case 83:
                accept$83(this, obj);
                break;
            case 84:
                accept$84(this, obj);
                break;
            case 85:
                accept$85(this, obj);
                break;
            case 86:
                accept$86(this, obj);
                break;
            case 87:
                accept$87(this, obj);
                break;
            case 88:
                accept$88(this, obj);
                break;
            case 89:
                accept$89(this, obj);
                break;
        }
    }

    public AfS188S0100000_19(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        List<AbstractC1906720ziY> allChunks;
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("RelationSearchAssem@b7f.initSearchBar$1$1");
        String str = (String) obj;
        C1247240iYs.LIZ.getClass();
        C1247240iYs.LIZLLL++;
        RelationSearchAssem relationSearchAssem = (RelationSearchAssem) afS188S0100000_19.l0;
        relationSearchAssem.getClass();
        if (str.length() > 0 && !Intrinsics.LJFF(str, relationSearchAssem.Go().LLILZ)) {
            relationSearchAssem.Jo(Boolean.TRUE);
            relationSearchAssem.Go().LLILZ = str;
            relationSearchAssem.LLJILJILJ.LLJ.onNext(str);
            AbstractC1247090iYd abstractC1247090iYd = (AbstractC1247090iYd) relationSearchAssem.LLJILLL.getValue();
            abstractC1247090iYd.LLJ.onNext(str);
            abstractC1247090iYd.LJJ().xQ2(true, false);
        } else if (str.length() == 0) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = relationSearchAssem.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state.LJFF(null);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = relationSearchAssem.LLJIJIL;
            if (viewOnAttachStateChangeListenerC20604515jv2 != null && (allChunks = viewOnAttachStateChangeListenerC20604515jv2.getAllChunks()) != null) {
                Iterator<AbstractC1906720ziY> it2 = allChunks.iterator();
                while (it2.hasNext()) {
                    it2.next().LLILZLL.LJFF(null);
                }
            }
        }
        C1C7U.LIZIZ("RelationSearchAssem@b7f.initSearchBar$1$1");
    }

    public static final void accept$1(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("RelationSearchAssem@b7f.initSearchBar$1$3");
        String str = (String) obj;
        RelationSearchAssem relationSearchAssem = (RelationSearchAssem) afS188S0100000_19.l0;
        relationSearchAssem.getClass();
        if (str.length() != 0 && !Intrinsics.LJFF(relationSearchAssem.Go().LLILZ, str)) {
            relationSearchAssem.Jo(Boolean.TRUE);
            relationSearchAssem.Go().LLILZ = str;
            ((PowerPageSource) relationSearchAssem.Go().LLILZIL.getValue()).getOperator().refresh();
        }
        C1C7U.LIZIZ("RelationSearchAssem@b7f.initSearchBar$1$3");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$10(Y.AfS188S0100000_19 r5, java.lang.Object r6) {
        /*
            java.lang.String r4 = "InputCodeFragment@cfdb.onViewCreated$12"
            X.C1C7U.LIZ(r4)
            X.0XT7 r6 = (X.C0XT7) r6
            com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp r0 = com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp.INSTANCE
            boolean r0 = r0.showCheckbox()
            if (r0 == 0) goto L65
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = "InputCodeFragment.sendSmsCode("
            r3.append(r0)     // Catch: java.lang.Exception -> L61
            r3.append(r6)     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = ")@@@["
            r3.append(r0)     // Catch: java.lang.Exception -> L61
            java.lang.String r2 = "has_sms_permission"
            java.lang.String r1 = "data"
            if (r6 == 0) goto L27
            goto L29
        L27:
            r0 = 0
            goto L3d
        L29:
            T extends X.0XTe r0 = r6.LJIIIZ     // Catch: java.lang.Exception -> L61
            X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L27
            org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L27
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.optString(r2)     // Catch: java.lang.Exception -> L61
        L3d:
            r3.append(r0)     // Catch: java.lang.Exception -> L61
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Exception -> L61
            X.C2188811AlT.LIZIZ(r3)     // Catch: java.lang.Exception -> L61
            if (r6 == 0) goto L65
            T extends X.0XTe r0 = r6.LJIIIZ     // Catch: java.lang.Exception -> L61
            X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L65
            org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L65
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L65
            java.lang.String r1 = r0.optString(r2)     // Catch: java.lang.Exception -> L61
            if (r1 != 0) goto L67
            goto L65
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L65:
            java.lang.String r1 = ""
        L67:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment r0 = (com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment) r0
            r0.sT(r1)
            X.C1C7U.LIZIZ(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS188S0100000_19.accept$10(Y.AfS188S0100000_19, java.lang.Object):void");
    }

    public static final void accept$11(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onViewCreated$13");
        C786410Ut5.c(((InputCodeFragment) afS188S0100000_19.l0).jT(), 0);
        ((InputCodeFragment) afS188S0100000_19.l0).sT("");
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onViewCreated$13");
    }

    public static final void accept$12(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.onViewCreated$14");
        C786410Ut5.c(((InputCodeFragment) afS188S0100000_19.l0).jT(), 0);
        ((InputCodeFragment) afS188S0100000_19.l0).sT("");
        ((InputCodeFragment) afS188S0100000_19.l0).getClass();
        C1C7U.LIZIZ("InputCodeFragment@cfdb.onViewCreated$14");
    }

    public static final void accept$13(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.sendLoginSmsCodeWithPassportTicket$1");
        ((InputCodeFragment) afS188S0100000_19.l0).sT("");
        C1C7U.LIZIZ("InputCodeFragment@cfdb.sendLoginSmsCodeWithPassportTicket$1");
    }

    public static final void accept$14(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        String str;
        C1C7U.LIZ("InputCodeSheetFragment@a55.onValidateCode$1");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        InputCodeSheetFragment inputCodeSheetFragment = (InputCodeSheetFragment) afS188S0100000_19.l0;
        EnumC1237100iIW enumC1237100iIW = inputCodeSheetFragment.LLLLLIL;
        boolean z = inputCodeSheetFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        C854460XfY.LIZ.getClass();
        C854460XfY.LJI().put("is_success", "bind_success");
        HashMap mapLJI = C854460XfY.LJI();
        C0HZQ c0hzq = ((InputCodeSheetFragment) afS188S0100000_19.l0).LLLF;
        if (c0hzq != null && c0hzq.isChecked()) {
            str = "is_checked";
        } else {
            str = "";
        }
        mapLJI.put("ocl_checkbox_checked", str);
        C19EG activity = ((InputCodeSheetFragment) afS188S0100000_19.l0).getActivity();
        if (activity != null) {
            InputCodeSheetFragment inputCodeSheetFragment2 = (InputCodeSheetFragment) afS188S0100000_19.l0;
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(inputCodeSheetFragment2.getString(2131836806));
            c1389890mGx.LJIIJJI();
        }
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((InputCodeSheetFragment) afS188S0100000_19.l0, C343970De7.LIZ);
        C1C7U.LIZIZ("InputCodeSheetFragment@a55.onValidateCode$1");
    }

    public static final void accept$15(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        String str;
        C1C7U.LIZ("InputCodeSheetFragment@a55.onValidateCode$3");
        C853660XeG c853660XeG = C853660XeG.LIZ;
        InputCodeSheetFragment inputCodeSheetFragment = (InputCodeSheetFragment) afS188S0100000_19.l0;
        EnumC1237100iIW enumC1237100iIW = inputCodeSheetFragment.LLLLLIL;
        boolean z = inputCodeSheetFragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        C854460XfY.LIZ.getClass();
        C854460XfY.LJI().put("is_success", "bind_success");
        HashMap mapLJI = C854460XfY.LJI();
        C0HZQ c0hzq = ((InputCodeSheetFragment) afS188S0100000_19.l0).LLLF;
        if (c0hzq != null && c0hzq.isChecked()) {
            str = "is_checked";
        } else {
            str = "";
        }
        mapLJI.put("ocl_checkbox_checked", str);
        C19EG activity = ((InputCodeSheetFragment) afS188S0100000_19.l0).getActivity();
        if (activity != null) {
            InputCodeSheetFragment inputCodeSheetFragment2 = (InputCodeSheetFragment) afS188S0100000_19.l0;
            C1389890mGx c1389890mGx = new C1389890mGx(activity);
            c1389890mGx.LJIIJ(inputCodeSheetFragment2.getString(2131836812));
            c1389890mGx.LJIIJJI();
        }
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((InputCodeSheetFragment) afS188S0100000_19.l0, C343970De7.LIZ);
        C1C7U.LIZIZ("InputCodeSheetFragment@a55.onValidateCode$3");
    }

    public static final void accept$16(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("PhoneCodeLoginVerifyOrBindFragment@21a4.sendCode$1");
        ((PhoneCodeLoginVerifyOrBindFragment) afS188S0100000_19.l0).oT();
        C1C7U.LIZIZ("PhoneCodeLoginVerifyOrBindFragment@21a4.sendCode$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$17(Y.AfS188S0100000_19 r15, java.lang.Object r16) {
        /*
            r3 = r16
            java.lang.String r6 = "PhoneLoginFragment@bda3.startSendCode$3"
            X.C1C7U.LIZ(r6)
            X.0XT7 r3 = (X.C0XT7) r3
            X.0XeG r1 = X.C853660XeG.LIZ
            r4 = r15
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment r0 = (com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment) r0
            java.lang.String r8 = r0.getEnterMethod()
            java.lang.String r9 = "sms_verification"
            java.lang.Object r0 = r4.l0
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment r0 = (com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment) r0
            java.lang.String r11 = r0.getEnterFrom()
            r12 = 0
            r10 = 0
            r1.getClass()
            r7 = 1
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            X.C853660XeG.LIZLLL(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp r0 = com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp.INSTANCE
            boolean r0 = r0.showCheckbox()
            if (r0 == 0) goto L8a
            java.lang.StringBuilder r5 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L86
            java.lang.String r0 = "PhoneLoginFragment.sendSmsCode("
            r5.append(r0)     // Catch: java.lang.Exception -> L86
            r5.append(r3)     // Catch: java.lang.Exception -> L86
            java.lang.String r0 = ")@@@["
            r5.append(r0)     // Catch: java.lang.Exception -> L86
            java.lang.String r2 = "has_sms_permission"
            java.lang.String r1 = "data"
            if (r3 == 0) goto L4c
            goto L4e
        L4c:
            r0 = 0
            goto L62
        L4e:
            T extends X.0XTe r0 = r3.LJIIIZ     // Catch: java.lang.Exception -> L86
            X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L86
            if (r0 == 0) goto L4c
            org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L86
            if (r0 == 0) goto L4c
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L86
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.optString(r2)     // Catch: java.lang.Exception -> L86
        L62:
            r5.append(r0)     // Catch: java.lang.Exception -> L86
            r0 = 93
            r5.append(r0)     // Catch: java.lang.Exception -> L86
            X.C2188811AlT.LIZIZ(r5)     // Catch: java.lang.Exception -> L86
            if (r3 == 0) goto L8a
            T extends X.0XTe r0 = r3.LJIIIZ     // Catch: java.lang.Exception -> L86
            X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L86
            if (r0 == 0) goto L8a
            org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L86
            if (r0 == 0) goto L8a
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L86
            if (r0 == 0) goto L8a
            java.lang.String r2 = r0.optString(r2)     // Catch: java.lang.Exception -> L86
            if (r2 != 0) goto L8c
            goto L8a
        L86:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L8a:
            java.lang.String r2 = ""
        L8c:
            X.0XeG r0 = X.C853660XeG.LIZ
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            X.C853660XeG.LIZIZ = r0
            java.lang.Object r1 = r4.l0
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment r1 = (com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment) r1
            T extends X.0XTe r0 = r3.LJIIIZ
            java.lang.Boolean r0 = r0.LJFF
            r1.RS(r2, r7, r0)
            X.C1C7U.LIZIZ(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS188S0100000_19.accept$17(Y.AfS188S0100000_19, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$18(Y.AfS188S0100000_19 r11, java.lang.Object r12) {
        /*
            java.lang.String r4 = "PhoneSignUpFragment@a8be.startSendCode$2"
            X.C1C7U.LIZ(r4)
            X.0XT7 r12 = (X.C0XT7) r12
            r0 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment r0 = (com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment) r0
            java.lang.String r6 = r0.getEnterMethod()
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment r0 = (com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment) r0
            java.lang.String r7 = r0.getEnterFrom()
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment r0 = (com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment) r0
            java.lang.String r8 = r0.PR()
            T extends X.0XTe r0 = r12.LJIIIZ
            java.lang.Boolean r9 = r0.LJFF
            r10 = 32
            X.C851350XaX.LIZ(r5, r6, r7, r8, r9, r10)
            com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp r0 = com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp.INSTANCE
            boolean r0 = r0.showCheckbox()
            if (r0 == 0) goto L87
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = "PhoneSignUpFragment.sendSmsCode("
            r3.append(r0)     // Catch: java.lang.Exception -> L83
            r3.append(r12)     // Catch: java.lang.Exception -> L83
            java.lang.String r0 = ")@@@["
            r3.append(r0)     // Catch: java.lang.Exception -> L83
            T extends X.0XTe r0 = r12.LJIIIZ     // Catch: java.lang.Exception -> L83
            X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L83
            java.lang.String r2 = "has_sms_permission"
            java.lang.String r1 = "data"
            if (r0 == 0) goto L51
            goto L53
        L51:
            r0 = 0
            goto L61
        L53:
            org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L51
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L51
            java.lang.String r0 = r0.optString(r2)     // Catch: java.lang.Exception -> L83
        L61:
            r3.append(r0)     // Catch: java.lang.Exception -> L83
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Exception -> L83
            X.C2188811AlT.LIZIZ(r3)     // Catch: java.lang.Exception -> L83
            T extends X.0XTe r0 = r12.LJIIIZ     // Catch: java.lang.Exception -> L83
            X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L87
            org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L87
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L83
            if (r0 == 0) goto L87
            java.lang.String r3 = r0.optString(r2)     // Catch: java.lang.Exception -> L83
            if (r3 != 0) goto L89
            goto L87
        L83:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L87:
            java.lang.String r3 = ""
        L89:
            X.0XeG r0 = X.C853660XeG.LIZ
            r0.getClass()
            long r0 = java.lang.System.currentTimeMillis()
            X.C853660XeG.LIZIZ = r0
            java.lang.Object r2 = r11.l0
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment r2 = (com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment) r2
            T extends X.0XTe r0 = r12.LJIIIZ
            java.lang.Boolean r1 = r0.LJFF
            r0 = 1
            r2.PS(r3, r0, r1)
            X.C1C7U.LIZIZ(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS188S0100000_19.accept$18(Y.AfS188S0100000_19, java.lang.Object):void");
    }

    public static final void accept$19(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("AvailableLoginOptionsHelper@fdca.sendVoiceCode$2");
        C19EG activity = ((BaseAccountFlowFragment) afS188S0100000_19.l0).getActivity();
        C1236890iIB.LIZ.getClass();
        String strLIZIZ = C1236890iIB.LIZIZ();
        C1237220iIi c1237220iIi = new C1237220iIi(60000L, 1000L, null);
        c1237220iIi.LIZJ();
        C851360XaY.LIZIZ(activity, strLIZIZ, new C851370XaZ(c1237220iIi), ((BaseAccountFlowFragment) afS188S0100000_19.l0).SR());
        C1C7U.LIZIZ("AvailableLoginOptionsHelper@fdca.sendVoiceCode$2");
    }

    public static final void accept$2(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("RxShakeController@30fe.setReceiveMsgListener$1");
        ((InterfaceC1232100iAS) afS188S0100000_19.l0).onReceive((String) obj);
        C1C7U.LIZIZ("RxShakeController@30fe.setReceiveMsgListener$1");
    }

    public static final void accept$20(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        String aid;
        String aid2;
        boolean z;
        User author;
        C1C7U.LIZ("StoryMixedFeedDetailPanel@ca80.updateBottomBar$5");
        C0S1L c0s1l = (C0S1L) obj;
        Aweme aweme = c0s1l.LIZ;
        String nickname = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        Aweme awemeLLLLLJLJLL = ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).LLLLLJLJLL();
        if (awemeLLLLLJLJLL != null) {
            aid2 = awemeLLLLLJLJLL.getAid();
        } else {
            aid2 = null;
        }
        if (Intrinsics.LJFF(aid, aid2) && c0s1l.LIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Aweme awemeLLLLLJLJLL2 = ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).LLLLLJLJLL();
            if (awemeLLLLLJLJLL2 != null && (author = awemeLLLLLJLJLL2.getAuthor()) != null) {
                nickname = author.getNickname();
            }
            sbLIZ.append(nickname);
            sbLIZ.append(" quick_dm: display quick dm");
            C2188811AlT.LIZIZ(sbLIZ);
            View view = ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).G0;
            if (view != null && view.getVisibility() != 8) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            InterfaceC1209130hZP interfaceC1209130hZP = ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).I;
            if (interfaceC1209130hZP != null) {
                interfaceC1209130hZP.p5(false);
            }
            StoryMixedFeedDetailPanel storyMixedFeedDetailPanel = (StoryMixedFeedDetailPanel) afS188S0100000_19.l0;
            if (storyMixedFeedDetailPanel.L0 == null) {
                storyMixedFeedDetailPanel.L0 = storyMixedFeedDetailPanel.I0();
            }
            StoryMixedFeedDetailPanel storyMixedFeedDetailPanel2 = (StoryMixedFeedDetailPanel) afS188S0100000_19.l0;
            InterfaceC1209750haP interfaceC1209750haP = storyMixedFeedDetailPanel2.L0;
            if (interfaceC1209750haP != null) {
                interfaceC1209750haP.Wp(storyMixedFeedDetailPanel2.getFragment().getView(), ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).LLLLLJLJLL(), ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).M0);
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("quick_dm: display common bottom bar, mDetailInputFragment is null?: ");
            if (((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).I == null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ2.append(z);
            C2188811AlT.LIZIZ(sbLIZ2);
            View view2 = ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).G0;
            if (view2 != null && view2.getVisibility() != 8) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            StoryMixedFeedDetailPanel storyMixedFeedDetailPanel3 = (StoryMixedFeedDetailPanel) afS188S0100000_19.l0;
            InterfaceC1209750haP interfaceC1209750haP2 = storyMixedFeedDetailPanel3.L0;
            if (interfaceC1209750haP2 != null) {
                interfaceC1209750haP2.x5(storyMixedFeedDetailPanel3.getFragment().getView());
            }
            InterfaceC1209130hZP interfaceC1209130hZP2 = ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).I;
            if (interfaceC1209130hZP2 != null) {
                interfaceC1209130hZP2.p5(true);
            }
            InterfaceC1209130hZP interfaceC1209130hZP3 = ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).I;
            if (interfaceC1209130hZP3 != null) {
                interfaceC1209130hZP3.W3();
            }
            InterfaceC1209130hZP interfaceC1209130hZP4 = ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).I;
            if (interfaceC1209130hZP4 != null) {
                interfaceC1209130hZP4.ry();
            }
        }
        ((StoryMixedFeedDetailPanel) afS188S0100000_19.l0).getClass();
        C1C7U.LIZIZ("StoryMixedFeedDetailPanel@ca80.updateBottomBar$5");
    }

    public static final void accept$21(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("RecFeedShareComponentController@885d.requestShareInfo$2");
        ((RecFeedShareComponentController) afS188S0100000_19.l0).LLILLJJLI = false;
        C2276471E8n.LIZIZ.LIZJ("common_feed", (Throwable) obj, "@LinkRelation_OldLogic", "online version request error");
        C1C7U.LIZIZ("RecFeedShareComponentController@885d.requestShareInfo$2");
    }

    public static final void accept$22(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("INotificationLiveViewModel@33cc.observeChangeOptions$1");
        NotificationLiveStatus notificationLiveStatus = (NotificationLiveStatus) ((C1641660sp2) obj).LIZ();
        if (notificationLiveStatus != null) {
            ((InterfaceC1252130igl) afS188S0100000_19.l0).LJJJZ(new AwS598S0100000_19(notificationLiveStatus, 191));
        }
        C1C7U.LIZIZ("INotificationLiveViewModel@33cc.observeChangeOptions$1");
    }

    public static final void accept$23(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("INotificationLiveViewModel@33cc.changeOptions$1");
        ((InterfaceC1252130igl) afS188S0100000_19.l0).LJJJZ(new AwS598S0100000_19((NotificationLiveStatus) obj, 190));
        C1C7U.LIZIZ("INotificationLiveViewModel@33cc.changeOptions$1");
    }

    public static final void accept$24(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("NotificationChunkVM@3761.loadMore$2");
        ((NotificationChunkVM) afS188S0100000_19.l0).yQ2().setValue(EnumC1223070hvt.SUCCESS);
        ((NotificationChunkVM) afS188S0100000_19.l0).BQ2(EnumC1242330iQx.EXPAND);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("NotificationChunkVM", ((NotificationChunkVM) afS188S0100000_19.l0).wQ2("loadMore success"));
        C1C7U.LIZIZ("NotificationChunkVM@3761.loadMore$2");
    }

    public static final void accept$25(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        EnumC1242340iQy enumC1242340iQy;
        C1C7U.LIZ("NotificationChunkVM@3761.refresh$2");
        C1619080sEc c1619080sEc = new C1619080sEc(-99999);
        c1619080sEc.LIZLLL(-999999, -1);
        c1619080sEc.post();
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("NotificationChunkVM", ((NotificationChunkVM) afS188S0100000_19.l0).wQ2("refresh success"));
        NotificationChunkVM notificationChunkVM = (NotificationChunkVM) afS188S0100000_19.l0;
        if (notificationChunkVM.LLJILJIL.LIZ.isEmpty()) {
            enumC1242340iQy = EnumC1242340iQy.EMPTY;
        } else {
            enumC1242340iQy = EnumC1242340iQy.SUCCESS;
        }
        notificationChunkVM.LLJI.setValue(enumC1242340iQy);
        NotificationChunkVM notificationChunkVM2 = (NotificationChunkVM) afS188S0100000_19.l0;
        if (notificationChunkVM2.LLJ == EnumC1242370iR1.DIRECTLY) {
            notificationChunkVM2.BQ2(EnumC1242330iQx.EXPAND);
        }
        C1C7U.LIZIZ("NotificationChunkVM@3761.refresh$2");
    }

    public static final void accept$26(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        EnumC1242340iQy enumC1242340iQy;
        C1C7U.LIZ("NotificationChunkVM@3761.refresh$3");
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("NotificationChunkVM", ((NotificationChunkVM) afS188S0100000_19.l0).wQ2("refresh error"), (Throwable) obj);
        NotificationChunkVM notificationChunkVM = (NotificationChunkVM) afS188S0100000_19.l0;
        if (notificationChunkVM.LLJILJIL.LIZ.isEmpty()) {
            enumC1242340iQy = EnumC1242340iQy.ERROR;
        } else {
            enumC1242340iQy = EnumC1242340iQy.SUCCESS;
        }
        notificationChunkVM.LLJI.setValue(enumC1242340iQy);
        C1C7U.LIZIZ("NotificationChunkVM@3761.refresh$3");
    }

    public static final void accept$27(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("BaseNotificationVM@1d03.deleteData$1");
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteData(");
        sbLIZ.append(((BaseNotice) afS188S0100000_19.l0).nid);
        sbLIZ.append(") success");
        C1720106oR.LJI("BaseNotificationVM", C2188811AlT.LIZIZ(sbLIZ));
        C1075780e6K.LIZJ((BaseNotice) afS188S0100000_19.l0, (BaseResponse) obj, null);
        C1C7U.LIZIZ("BaseNotificationVM@1d03.deleteData$1");
    }

    public static final void accept$28(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("BaseNotificationVM@1d03.deleteData$2");
        Throwable th = (Throwable) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteData(");
        sbLIZ.append(((BaseNotice) afS188S0100000_19.l0).nid);
        sbLIZ.append(") error, ");
        C1720106oR.LIZIZ("BaseNotificationVM", C2188811AlT.LIZIZ(sbLIZ), th);
        C1075780e6K.LIZJ((BaseNotice) afS188S0100000_19.l0, null, th);
        C1C7U.LIZIZ("BaseNotificationVM@1d03.deleteData$2");
    }

    public static final void accept$29(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.getSeries$1");
        ((PaidSeriesAddSeriesToLiveViewModel) afS188S0100000_19.l0).setState(AFwS257S0000000_19.get$arr$(243));
        C1C7U.LIZIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.getSeries$1");
    }

    public static final void accept$3(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        String localizedCountry;
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) afS188S0100000_19.l0;
        RegionStatus regionStatus = (RegionStatus) obj;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.getRegionStatus$1L");
        i18nSettingManageMyAccountActivity.LLJ = true;
        if (Boolean.TRUE.equals(regionStatus.getEnable())) {
            i18nSettingManageMyAccountActivity.LLJILJILJ.LJFF(true);
            if (regionStatus.getLocalizedCountry() != null) {
                localizedCountry = regionStatus.getLocalizedCountry();
            } else {
                localizedCountry = "";
            }
            i18nSettingManageMyAccountActivity.LLJI = regionStatus.getStatusEvent();
            i18nSettingManageMyAccountActivity.LLJIJIL = regionStatus.getRedirectUrl();
            i18nSettingManageMyAccountActivity.LLJILJILJ.LJIIIIZZ(localizedCountry);
            String str2 = i18nSettingManageMyAccountActivity.LLJIJIL;
            if (str2 == null || str2.isEmpty()) {
                C1238760iLC c1238760iLC = i18nSettingManageMyAccountActivity.LLJILJILJ;
                c1238760iLC.getClass();
                c1238760iLC.LJI(new AwS95S0110000_7(c1238760iLC, 5));
            }
            i18nSettingManageMyAccountActivity.LLJL.LJ();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(System.currentTimeMillis() - i18nSettingManageMyAccountActivity.LLJILJIL, "delay");
            c2344009Gk.LJIIIIZZ("enter_from", "settings_page");
            C20684815ws.LJIILLIIL("account_region_status_show", c2344009Gk.LIZ);
        }
        C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.getRegionStatus$1L");
    }

    public static final void accept$30(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.getSeries$2");
        ((PaidSeriesAddSeriesToLiveViewModel) afS188S0100000_19.l0).setState(new AwS598S0100000_19((PaidCollectionListResponse) obj, 210));
        C1C7U.LIZIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.getSeries$2");
    }

    public static final void accept$31(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.getSeries$3");
        ((PaidSeriesAddSeriesToLiveViewModel) afS188S0100000_19.l0).setState(new AwS598S0100000_19((Throwable) obj, 211));
        C1C7U.LIZIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.getSeries$3");
    }

    public static final void accept$32(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemActionButtonClick$3");
        ((PaidSeriesAddSeriesToLiveViewModel) afS188S0100000_19.l0).setState(new AwS598S0100000_19((Throwable) obj, 214));
        C1C7U.LIZIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemActionButtonClick$3");
    }

    public static final void accept$33(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemSecondaryButtonClick$3");
        ((PaidSeriesAddSeriesToLiveViewModel) afS188S0100000_19.l0).setState(new AwS598S0100000_19((Throwable) obj, 217));
        C1C7U.LIZIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemSecondaryButtonClick$3");
    }

    public static final void accept$34(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("ListLiveCircleItemVM@a76e.startRefreshListLiveState$1");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("check live once, wait next 1min,");
        sbLIZ.append(((ListLiveCircleItemVM) afS188S0100000_19.l0).hashCode());
        sbLIZ.append(",sizeu=");
        sbLIZ.append(((ListLiveCircleItemVM) afS188S0100000_19.l0).LLILZ.size());
        sbLIZ.append(",size=");
        sbLIZ.append(((ListLiveCircleItemVM) afS188S0100000_19.l0).LLILZIL.size());
        sbLIZ.append(",class=");
        sbLIZ.append(((ListLiveCircleItemVM) afS188S0100000_19.l0).getClass());
        C20441214yg.LIZIZ("LYP_LOG", C2188811AlT.LIZIZ(sbLIZ));
        if (!((ListLiveCircleItemVM) afS188S0100000_19.l0).LLILZ.isEmpty() || !((ListLiveCircleItemVM) afS188S0100000_19.l0).LLILZIL.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (User user : ((ListLiveCircleItemVM) afS188S0100000_19.l0).LLILZ) {
                if (user.roomId > 0) {
                    arrayList.add(user);
                }
            }
            ListLiveCircleItemVM listLiveCircleItemVM = (ListLiveCircleItemVM) afS188S0100000_19.l0;
            listLiveCircleItemVM.yQ2(listLiveCircleItemVM.LLIZLLLIL, listLiveCircleItemVM.LLILZ);
            ListLiveCircleItemVM listLiveCircleItemVM2 = (ListLiveCircleItemVM) afS188S0100000_19.l0;
            listLiveCircleItemVM2.yQ2(listLiveCircleItemVM2.LLJ, listLiveCircleItemVM2.LLILZIL);
        }
        C1C7U.LIZIZ("ListLiveCircleItemVM@a76e.startRefreshListLiveState$1");
    }

    public static final void accept$35(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1211700hdY controller;
        C1C7U.LIZ("PaidContentVideoPanel@283c.onViewCreated$4");
        Pair pair = (Pair) obj;
        if (((Boolean) pair.getFirst()).booleanValue()) {
            ((PaidContentVideoPanel) afS188S0100000_19.l0).E2((Aweme) pair.getSecond());
            VideoSeekBarMaskView videoSeekBarMaskView = ((PaidContentVideoPanel) afS188S0100000_19.l0).H;
            if (videoSeekBarMaskView != null && (controller = videoSeekBarMaskView.getController()) != null) {
                Aweme aweme = (Aweme) pair.getSecond();
                String eventType = ((PaidContentVideoPanel) afS188S0100000_19.l0).LLLLIIIILLL.getEventType();
                if (eventType == null) {
                    eventType = "";
                }
                controller.LJI(((PaidContentVideoPanel) afS188S0100000_19.l0).LLLLIIIILLL.getPageType(), aweme, eventType, "");
            }
            ((PaidContentVideoPanel) afS188S0100000_19.l0).a1 = true;
        }
        C1C7U.LIZIZ("PaidContentVideoPanel@283c.onViewCreated$4");
    }

    public static final void accept$36(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("CaptureSessionServiceAdapter@118.registerObserver$1$closeCameraEventDisposable$1");
        ((C1211880hdq) afS188S0100000_19.l0).LIZ.invoke();
        C1C7U.LIZIZ("CaptureSessionServiceAdapter@118.registerObserver$1$closeCameraEventDisposable$1");
    }

    public static final void accept$37(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("CaptureSessionServiceAdapter@118.registerObserver$1$mayEnableReverseCameraDisposable$1");
        ((C1211880hdq) afS188S0100000_19.l0).LIZIZ.invoke();
        C1C7U.LIZIZ("CaptureSessionServiceAdapter@118.registerObserver$1$mayEnableReverseCameraDisposable$1");
    }

    public static final void accept$38(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("IUserViewModel@6d30.observeUser$1$1");
        User user = (User) ((C1641660sp2) obj).LIZ();
        if (user != null) {
            ((InterfaceC1247720iZe) afS188S0100000_19.l0).LJJJZ(new AwS598S0100000_19(user, 271));
        }
        C1C7U.LIZIZ("IUserViewModel@6d30.observeUser$1$1");
    }

    public static final void accept$39(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("EffectWhitelistDataUpdateComponent@33df.onCreate$1");
        Pair pair = (Pair) obj;
        ((C1625860sPY) afS188S0100000_19.l0).o2(((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
        C1C7U.LIZIZ("EffectWhitelistDataUpdateComponent@33df.onCreate$1");
    }

    public static final void accept$4(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("BindPhoneCodeVerifyFragment@ebd9.resendCode$1");
        ((BindPhoneCodeVerifyFragment) afS188S0100000_19.l0).oT();
        C1C7U.LIZIZ("BindPhoneCodeVerifyFragment@ebd9.resendCode$1");
    }

    public static final void accept$40(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("ContentCellBalanceProtocol@22a0.updateComponentUIAndData$1$1");
        ((ContentCellBalanceProtocol) afS188S0100000_19.l0).LJLLLL();
        C1C7U.LIZIZ("ContentCellBalanceProtocol@22a0.updateComponentUIAndData$1$1");
    }

    public static final void accept$41(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("ProfileAigcAvatarViewModel@7228.showToast$1");
        ((ProfileAigcAvatarViewModel) afS188S0100000_19.l0).LLJ = true;
        C1C7U.LIZIZ("ProfileAigcAvatarViewModel@7228.showToast$1");
    }

    public static final void accept$42(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("ProfileAigcIntroFragmentV2@931b.showMaxToast$1$1");
        ((ProfileAigcIntroFragmentV2) afS188S0100000_19.l0).LLLF = true;
        C1C7U.LIZIZ("ProfileAigcIntroFragmentV2@931b.showMaxToast$1$1");
    }

    public static final void accept$43(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        boolean z;
        C1C7U.LIZ("ProfileAddFriendsRedPointsVM@2de.onPrepared$1");
        C1249200ic2 c1249200ic2 = (C1249200ic2) obj;
        ProfileAddFriendsRedPointsVM profileAddFriendsRedPointsVM = (ProfileAddFriendsRedPointsVM) afS188S0100000_19.l0;
        int i = 0;
        if (c1249200ic2 != null) {
            z = c1249200ic2.LIZ;
        } else {
            z = false;
        }
        profileAddFriendsRedPointsVM.LLILLJJLI = z;
        if (c1249200ic2 != null) {
            i = c1249200ic2.LIZIZ;
        }
        profileAddFriendsRedPointsVM.LLILLL = i;
        profileAddFriendsRedPointsVM.setStateImmediate(new AwS598S0100000_19(profileAddFriendsRedPointsVM, 825));
        C1C7U.LIZIZ("ProfileAddFriendsRedPointsVM@2de.onPrepared$1");
    }

    public static final void accept$44(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("NotificationDetailVM@38c7.deleteData$1");
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteData(");
        sbLIZ.append(((BaseNotice) afS188S0100000_19.l0).nid);
        sbLIZ.append(") success");
        C1720106oR.LJI("NotificationDetailVM", C2188811AlT.LIZIZ(sbLIZ));
        C1075780e6K.LIZJ((BaseNotice) afS188S0100000_19.l0, (BaseResponse) obj, null);
        C1C7U.LIZIZ("NotificationDetailVM@38c7.deleteData$1");
    }

    public static final void accept$45(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("NotificationDetailVM@38c7.deleteData$2");
        Throwable th = (Throwable) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("deleteData(");
        sbLIZ.append(((BaseNotice) afS188S0100000_19.l0).nid);
        sbLIZ.append(") error, ");
        C1720106oR.LIZIZ("NotificationDetailVM", C2188811AlT.LIZIZ(sbLIZ), th);
        C1075780e6K.LIZJ((BaseNotice) afS188S0100000_19.l0, null, th);
        C1C7U.LIZIZ("NotificationDetailVM@38c7.deleteData$2");
    }

    public static final void accept$46(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        boolean z;
        C1C7U.LIZ("RemoteSearchUserChunk@ccb7.subscribeToSearch$4");
        Pair pair = (Pair) obj;
        Object first = pair.getFirst();
        List list = (List) pair.getSecond();
        List<C1247270iYv> list2 = ((C1247070iYb) afS188S0100000_19.l0).LJJ().LLIZLLLIL;
        if ((list2 == null || ((ArrayList) list2).isEmpty()) && list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        ((C1247070iYb) afS188S0100000_19.l0).LJJ().xQ2(false, z);
        if (Intrinsics.LJFF(first, ((C1247070iYb) afS188S0100000_19.l0).LJJ().LLILZ)) {
            ((C1247070iYb) afS188S0100000_19.l0).LLILZLL.LJFF(null);
            InterfaceC1361890lXn operator = ((PowerPageSource) ((C1247070iYb) afS188S0100000_19.l0).LLJJ.getValue()).getOperator();
            EnumC323450Cm7 enumC323450Cm7 = EnumC323450Cm7.Refresh;
            AbstractC316870CbV.LIZ.getClass();
            operator.LIZJ(enumC323450Cm7, new C316640Cb8(list), true);
        }
        C1247190iYn c1247190iYn = C1247190iYn.LIZ;
        String str = (String) ((C1247070iYb) afS188S0100000_19.l0).LLJILJIL.getValue();
        long j = ((C1247070iYb) afS188S0100000_19.l0).LLJI;
        C1623606Xi c1623606Xi = new C1623606Xi(Boolean.valueOf(z));
        int i = ((C1247070iYb) afS188S0100000_19.l0).LLJILLL;
        c1247190iYn.getClass();
        C1247190iYn.LIZIZ(str, j, c1623606Xi, i);
        ((C1247070iYb) afS188S0100000_19.l0).LLJILLL--;
        C1C7U.LIZIZ("RemoteSearchUserChunk@ccb7.subscribeToSearch$4");
    }

    public static final void accept$47(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        Exception exc;
        boolean zIsEmpty;
        C1C7U.LIZ("RemoteSearchUserChunk@ccb7.subscribeToSearch$5");
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        if (exc != null) {
            InterfaceC1361890lXn operator = ((PowerPageSource) ((C1247070iYb) afS188S0100000_19.l0).LLJJ.getValue()).getOperator();
            EnumC323450Cm7 enumC323450Cm7 = EnumC323450Cm7.Refresh;
            AbstractC316870CbV.LIZ.getClass();
            operator.LIZJ(enumC323450Cm7, new C316650Cb9(exc), false);
        }
        RelationSearchVM relationSearchVMLJJ = ((C1247070iYb) afS188S0100000_19.l0).LJJ();
        List<C1247270iYv> list = ((C1247070iYb) afS188S0100000_19.l0).LJJ().LLIZ;
        if (list != null) {
            zIsEmpty = list.isEmpty();
        } else {
            zIsEmpty = true;
        }
        relationSearchVMLJJ.xQ2(false, zIsEmpty);
        C1247190iYn c1247190iYn = C1247190iYn.LIZ;
        String str = (String) ((C1247070iYb) afS188S0100000_19.l0).LLJILJIL.getValue();
        long j = ((C1247070iYb) afS188S0100000_19.l0).LLJI;
        C491001vg c491001vg = new C491001vg(th);
        int i = ((C1247070iYb) afS188S0100000_19.l0).LLJILLL;
        c1247190iYn.getClass();
        C1247190iYn.LIZIZ(str, j, c491001vg, i);
        ((C1247070iYb) afS188S0100000_19.l0).LLJILLL--;
        C1C7U.LIZIZ("RemoteSearchUserChunk@ccb7.subscribeToSearch$5");
    }

    public static final void accept$48(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        double d;
        C1C7U.LIZ("LocalSearchUserChunk@7804.subscribeToSearch$4");
        Pair pair = (Pair) obj;
        String str = (String) pair.getFirst();
        List list = (List) pair.getSecond();
        ((C1247080iYc) afS188S0100000_19.l0).LJJ();
        list.size();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1247270iYv) it2.next()).LL.getNickname());
        }
        if (!list.isEmpty()) {
            ((C1247080iYc) afS188S0100000_19.l0).LJJ().xQ2(false, false);
        }
        RelationSearchVM relationSearchVMLJJ = ((C1247080iYc) afS188S0100000_19.l0).LJJ();
        int size = list.size();
        C1247270iYv c1247270iYv = (C1247270iYv) C13LP.LJJJLL(list);
        double d2 = -1.0d;
        if (c1247270iYv != null) {
            d = c1247270iYv.LLJ;
        } else {
            d = -1.0d;
        }
        C1247270iYv c1247270iYv2 = (C1247270iYv) C13LP.LJJJLL(list);
        if (c1247270iYv2 != null) {
            d2 = c1247270iYv2.LLJI;
        }
        relationSearchVMLJJ.setState(new AwS598S0100000_19(new C1247250iYt(size, d, d2, str), 662));
        if (Intrinsics.LJFF(((C1247080iYc) afS188S0100000_19.l0).LJJ().LLILZ, str)) {
            InterfaceC1361890lXn operator = ((PowerPageSource) ((C1247080iYc) afS188S0100000_19.l0).LLJJ.getValue()).getOperator();
            EnumC323450Cm7 enumC323450Cm7 = EnumC323450Cm7.Refresh;
            AbstractC316870CbV.LIZ.getClass();
            operator.LIZJ(enumC323450Cm7, new C316640Cb8(list), true);
        }
        C1C7U.LIZIZ("LocalSearchUserChunk@7804.subscribeToSearch$4");
    }

    public static final void accept$49(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        boolean zIsEmpty;
        C1C7U.LIZ("LocalSearchUserChunk@7804.subscribeToSearch$5");
        Throwable th = (Throwable) obj;
        if ((th instanceof Exception) && th != null) {
            C1247080iYc c1247080iYc = (C1247080iYc) afS188S0100000_19.l0;
            c1247080iYc.LLILZLL.LJFF(null);
            RelationSearchVM relationSearchVMLJJ = c1247080iYc.LJJ();
            List<C1247270iYv> list = c1247080iYc.LJJ().LLIZLLLIL;
            if (list != null) {
                zIsEmpty = ((ArrayList) list).isEmpty();
            } else {
                zIsEmpty = true;
            }
            relationSearchVMLJJ.xQ2(false, zIsEmpty);
            c1247080iYc.LJJ().setState(new AwS598S0100000_19(new C1247250iYt(-1, -1.0d, -1.0d, c1247080iYc.LJJ().LLILZ), 662));
            InterfaceC1361890lXn operator = ((PowerPageSource) c1247080iYc.LLJJ.getValue()).getOperator();
            EnumC323450Cm7 enumC323450Cm7 = EnumC323450Cm7.Refresh;
            AbstractC316870CbV.LIZ.getClass();
            operator.LIZJ(enumC323450Cm7, new C316650Cb9((Exception) th), false);
        }
        C1C7U.LIZIZ("LocalSearchUserChunk@7804.subscribeToSearch$5");
    }

    public static final void accept$5(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("TwoStepVerifyEmailFor2046Fragment@836a.validateCode$2");
        C849600XUo c849600XUo = (C849600XUo) obj;
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String strCT = ((TwoStepVerifyEmailFor2046Fragment) afS188S0100000_19.l0).CT();
        c1233960iDS.getClass();
        C1233960iDS.LJIIL(strCT, "email", true);
        String enterFrom = ((TwoStepVerifyEmailFor2046Fragment) afS188S0100000_19.l0).getEnterFrom();
        String enterMethod = ((TwoStepVerifyEmailFor2046Fragment) afS188S0100000_19.l0).getEnterMethod();
        String strCT2 = ((TwoStepVerifyEmailFor2046Fragment) afS188S0100000_19.l0).CT();
        boolean zIsChecked = ((TwoStepVerifyEmailFor2046Fragment) afS188S0100000_19.l0).zT().isChecked();
        c1233960iDS.getClass();
        C1233960iDS.LJIIIZ(1, null, enterFrom, enterMethod, strCT2, "email", zIsChecked);
        C853660XeG c853660XeG = C853660XeG.LIZ;
        TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment = (TwoStepVerifyEmailFor2046Fragment) afS188S0100000_19.l0;
        EnumC1237100iIW enumC1237100iIW = twoStepVerifyEmailFor2046Fragment.LLLLLIL;
        boolean z = twoStepVerifyEmailFor2046Fragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        Bundle arguments = ((TwoStepVerifyEmailFor2046Fragment) afS188S0100000_19.l0).getArguments();
        if (arguments != null) {
            Bundle bundle = new Bundle();
            C852810Xct c852810Xct = C852810Xct.LIZ;
            String str = c849600XUo.LJIIIZ;
            c852810Xct.getClass();
            C852810Xct.LJIJJ(bundle, str);
            C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
        }
        TwoStepVerifyEmailFor2046Fragment twoStepVerifyEmailFor2046Fragment2 = (TwoStepVerifyEmailFor2046Fragment) afS188S0100000_19.l0;
        Bundle arguments2 = twoStepVerifyEmailFor2046Fragment2.getArguments();
        if (arguments2 == null) {
            arguments2 = new Bundle();
        }
        twoStepVerifyEmailFor2046Fragment2.WR(arguments2);
        C1C7U.LIZIZ("TwoStepVerifyEmailFor2046Fragment@836a.validateCode$2");
    }

    public static final void accept$50(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("PaidSeriesPopCardWidget@bc96.getPopSeries$1$3");
        ((C1236240iH8) afS188S0100000_19.l0).LJJI(((PaidCollectionDetailResponse) obj).collectionDetail, true);
        C1C7U.LIZIZ("PaidSeriesPopCardWidget@bc96.getPopSeries$1$3");
    }

    public static final void accept$51(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("DramaTopTabMainFragment@108d.updateSkylight$2");
        ((Function1) afS188S0100000_19.l0).invoke(obj);
        C1C7U.LIZIZ("DramaTopTabMainFragment@108d.updateSkylight$2");
    }

    public static final void accept$52(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("AddAnchorViewModel@1940.validate$4");
        ((AddAnchorViewModel) afS188S0100000_19.l0).setState(AFwS257S0000000_19.get$arr$(592));
        C1C7U.LIZIZ("AddAnchorViewModel@1940.validate$4");
    }

    public static final void accept$53(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("AddAnchorViewModel@1940.validate$5");
        LinkValidateResult linkValidateResult = (LinkValidateResult) obj;
        if (linkValidateResult.statusCode == 0) {
            ((AddAnchorViewModel) afS188S0100000_19.l0).setState(AFwS257S0000000_19.get$arr$(593));
            AddAnchorViewModel addAnchorViewModel = (AddAnchorViewModel) afS188S0100000_19.l0;
            addAnchorViewModel.LLILZ = addAnchorViewModel.LL;
        } else {
            ((AddAnchorViewModel) afS188S0100000_19.l0).setState(new AwS598S0100000_19(linkValidateResult, 560));
        }
        C1C7U.LIZIZ("AddAnchorViewModel@1940.validate$5");
    }

    public static final void accept$54(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("VerifyPhoneForChangeFlowStep@df7b.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS188S0100000_19.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyPhoneForChangeFlowStep@df7b.handleAction$2");
    }

    public static final void accept$55(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("VerifyPhoneForChangeFlowStep@df7b.handleAction$4");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS188S0100000_19.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("VerifyPhoneForChangeFlowStep@df7b.handleAction$4");
    }

    public static final void accept$56(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.resendCode$2");
        ((InputCodeFragment) afS188S0100000_19.l0).sT("");
        C1C7U.LIZIZ("InputCodeFragment@cfdb.resendCode$2");
    }

    public static final void accept$57(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.resendCode$3");
        ((InputCodeFragment) afS188S0100000_19.l0).sT("");
        C1C7U.LIZIZ("InputCodeFragment@cfdb.resendCode$3");
    }

    public static final void accept$58(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.resendCode$4");
        ((InputCodeFragment) afS188S0100000_19.l0).sT("");
        C1C7U.LIZIZ("InputCodeFragment@cfdb.resendCode$4");
    }

    public static final void accept$59(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.resendCode$5");
        ((InputCodeFragment) afS188S0100000_19.l0).sT("");
        C1C7U.LIZIZ("InputCodeFragment@cfdb.resendCode$5");
    }

    public static final void accept$6(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("TwoStepVerifySmsFor2046Fragment@ec0.onViewCreated$3$2");
        C1233960iDS c1233960iDS = C1233960iDS.LIZ;
        String strCT = ((TwoStepVerifySmsFor2046Fragment) afS188S0100000_19.l0).CT();
        c1233960iDS.getClass();
        C1233960iDS.LJIIL(strCT, "sms", true);
        String enterFrom = ((TwoStepVerifySmsFor2046Fragment) afS188S0100000_19.l0).getEnterFrom();
        String enterMethod = ((TwoStepVerifySmsFor2046Fragment) afS188S0100000_19.l0).getEnterMethod();
        String strCT2 = ((TwoStepVerifySmsFor2046Fragment) afS188S0100000_19.l0).CT();
        boolean zIsChecked = ((TwoStepVerifySmsFor2046Fragment) afS188S0100000_19.l0).zT().isChecked();
        c1233960iDS.getClass();
        C1233960iDS.LJIIIZ(1, null, enterFrom, enterMethod, strCT2, "sms", zIsChecked);
        C853660XeG c853660XeG = C853660XeG.LIZ;
        TwoStepVerifySmsFor2046Fragment twoStepVerifySmsFor2046Fragment = (TwoStepVerifySmsFor2046Fragment) afS188S0100000_19.l0;
        EnumC1237100iIW enumC1237100iIW = twoStepVerifySmsFor2046Fragment.LLLLLIL;
        boolean z = twoStepVerifySmsFor2046Fragment.LLLLL;
        c853660XeG.getClass();
        C853660XeG.LJFF(enumC1237100iIW, z);
        Bundle arguments = ((TwoStepVerifySmsFor2046Fragment) afS188S0100000_19.l0).getArguments();
        Bundle bundle = new Bundle();
        C852810Xct c852810Xct = C852810Xct.LIZ;
        String str = ((C849600XUo) obj).LJIIIZ;
        c852810Xct.getClass();
        C852810Xct.LJIJJ(bundle, str);
        C786410Ut5.LJJIIZI(arguments, bundle, "final_data");
        TwoStepVerifySmsFor2046Fragment twoStepVerifySmsFor2046Fragment2 = (TwoStepVerifySmsFor2046Fragment) afS188S0100000_19.l0;
        twoStepVerifySmsFor2046Fragment2.WR(twoStepVerifySmsFor2046Fragment2.getArguments());
        C1C7U.LIZIZ("TwoStepVerifySmsFor2046Fragment@ec0.onViewCreated$3$2");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$60(Y.AfS188S0100000_19 r5, java.lang.Object r6) {
        /*
            java.lang.String r4 = "InputCodeFragment@cfdb.sendSmsCodeForSignupOrLogin$1"
            X.C1C7U.LIZ(r4)
            X.0XT7 r6 = (X.C0XT7) r6
            com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp r0 = com.ss.android.ugc.aweme.account.login.v2.ui.experiment.SMSPermissionCheckboxExp.INSTANCE
            boolean r0 = r0.showCheckbox()
            if (r0 == 0) goto L65
            java.lang.StringBuilder r3 = X.C2188811AlT.LIZ()     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = "InputCodeFragment.sendSmsCodeForSignup("
            r3.append(r0)     // Catch: java.lang.Exception -> L61
            r3.append(r6)     // Catch: java.lang.Exception -> L61
            java.lang.String r0 = ")@@@["
            r3.append(r0)     // Catch: java.lang.Exception -> L61
            java.lang.String r2 = "has_sms_permission"
            java.lang.String r1 = "data"
            if (r6 == 0) goto L27
            goto L29
        L27:
            r0 = 0
            goto L3d
        L29:
            T extends X.0XTe r0 = r6.LJIIIZ     // Catch: java.lang.Exception -> L61
            X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L27
            org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L27
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L27
            java.lang.String r0 = r0.optString(r2)     // Catch: java.lang.Exception -> L61
        L3d:
            r3.append(r0)     // Catch: java.lang.Exception -> L61
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Exception -> L61
            X.C2188811AlT.LIZIZ(r3)     // Catch: java.lang.Exception -> L61
            if (r6 == 0) goto L65
            T extends X.0XTe r0 = r6.LJIIIZ     // Catch: java.lang.Exception -> L61
            X.0XXg r0 = (X.C850300XXg) r0     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L65
            org.json.JSONObject r0 = r0.LJ     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L65
            org.json.JSONObject r0 = com.bytedance.mt.protector.impl.JSONObjectProtectorUtils.getJSONObject(r0, r1)     // Catch: java.lang.Exception -> L61
            if (r0 == 0) goto L65
            java.lang.String r1 = r0.optString(r2)     // Catch: java.lang.Exception -> L61
            if (r1 != 0) goto L67
            goto L65
        L61:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L65:
            java.lang.String r1 = ""
        L67:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment r0 = (com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment) r0
            r0.sT(r1)
            X.C1C7U.LIZIZ(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS188S0100000_19.accept$60(Y.AfS188S0100000_19, java.lang.Object):void");
    }

    public static final void accept$61(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.sendVoiceCode$1");
        C19EG activity = ((InputCodeFragment) afS188S0100000_19.l0).getActivity();
        InputCodeFragment inputCodeFragment = (InputCodeFragment) afS188S0100000_19.l0;
        inputCodeFragment.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(inputCodeFragment.nT());
        sbLIZ.append("_voice");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1237220iIi c1237220iIi = new C1237220iIi(60000L, 1000L, null);
        c1237220iIi.LIZJ();
        C851360XaY.LIZIZ(activity, strLIZIZ, new C851370XaZ(c1237220iIi), ((InputCodeFragment) afS188S0100000_19.l0).SR());
        C1C7U.LIZIZ("InputCodeFragment@cfdb.sendVoiceCode$1");
    }

    public static final void accept$62(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("InputCodeFragment@cfdb.resendCode$1");
        ((InputCodeFragment) afS188S0100000_19.l0).sT("");
        C1C7U.LIZIZ("InputCodeFragment@cfdb.resendCode$1");
    }

    public static final void accept$63(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        TimeUnlockFragment timeUnlockFragment = (TimeUnlockFragment) afS188S0100000_19.l0;
        timeUnlockFragment.getClass();
        C1C7U.LIZ("TimeUnlockFragment@c0a1.doFamilyPairingUnLock$2L");
        C1354920lMY.LIZJ(timeUnlockFragment.getContext(), (Throwable) obj);
        C1C7U.LIZIZ("TimeUnlockFragment@c0a1.doFamilyPairingUnLock$2L");
    }

    public static final void accept$64(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("ProfileHeaderAdvancedFeatureBaseComponent@c75a.initBehaviorSubject$1");
        ((ProfileHeaderAdvancedFeatureBaseComponent) afS188S0100000_19.l0).Ep();
        C1C7U.LIZIZ("ProfileHeaderAdvancedFeatureBaseComponent@c75a.initBehaviorSubject$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$65(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("MyStoryAwemeListSubscriber@d3d.subscribe$$inlined$subscribeUserStoryChanged$3");
        Aweme awemeM199clone = ((Aweme) ((C727230Sfp) obj).LIZJ).m199clone();
        C1259180is8 c1259180is8 = ((C1258970irn) afS188S0100000_19.l0).LLILLJJLI;
        if (c1259180is8 != null) {
            c1259180is8.LIZ.DT(awemeM199clone);
        }
        C1C7U.LIZIZ("MyStoryAwemeListSubscriber@d3d.subscribe$$inlined$subscribeUserStoryChanged$3");
    }

    public static final void accept$66(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("PIIBindEmailFlowStep@e4fe.handleAction$2");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS188S0100000_19.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("PIIBindEmailFlowStep@e4fe.handleAction$2");
    }

    public static final void accept$67(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("PIIBindPhoneFlowStep@eff1.handleAction$3");
        Throwable th = (Throwable) obj;
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS188S0100000_19.l0;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZ(th, false, null);
        }
        C1C7U.LIZIZ("PIIBindPhoneFlowStep@eff1.handleAction$3");
    }

    public static final void accept$68(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("VerticalMusicViewV2@3dcd.updateBadgeView$1");
        Integer num = (Integer) obj;
        if (num != null) {
            ((VerticalMusicViewV2) afS188S0100000_19.l0).LJJJJ(num.intValue());
        }
        C1C7U.LIZIZ("VerticalMusicViewV2@3dcd.updateBadgeView$1");
    }

    public static final void accept$69(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("NotificationChunkVM@3761.loadMore$3");
        ((NotificationChunkVM) afS188S0100000_19.l0).yQ2().setValue(EnumC1223070hvt.ERROR);
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("NotificationChunkVM", ((NotificationChunkVM) afS188S0100000_19.l0).wQ2("loadMore error"), (Throwable) obj);
        C1C7U.LIZIZ("NotificationChunkVM@3761.loadMore$3");
    }

    public static final void accept$7(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        String str;
        C1C7U.LIZ("CreatePasswordSheetFragment@7330.onSubmit$1");
        C854460XfY.LIZ.getClass();
        C854460XfY.LJI().put("is_success", "bind_success");
        HashMap mapLJI = C854460XfY.LJI();
        C0HZQ c0hzq = ((CreatePasswordSheetFragment) afS188S0100000_19.l0).LLLF;
        if (c0hzq != null && c0hzq.isChecked()) {
            str = "is_checked";
        } else {
            str = "";
        }
        mapLJI.put("ocl_checkbox_checked", str);
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((CreatePasswordSheetFragment) afS188S0100000_19.l0, C343970De7.LIZ);
        C1C7U.LIZIZ("CreatePasswordSheetFragment@7330.onSubmit$1");
    }

    public static final void accept$70(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("ProfileLinksOrderViewModel@33cc.updateFeaturesOrder$1$1");
        ((ProfileLinksOrderViewModel) afS188S0100000_19.l0).setState(AFwS257S0000000_19.get$arr$(698));
        ((ArrayList) ((ProfileLinksOrderViewModel) afS188S0100000_19.l0).LLILZIL).clear();
        ProfileLinksOrderViewModel profileLinksOrderViewModel = (ProfileLinksOrderViewModel) afS188S0100000_19.l0;
        ((ArrayList) profileLinksOrderViewModel.LLILZIL).addAll(profileLinksOrderViewModel.LLILLJJLI);
        ((ProfileLinksOrderViewModel) afS188S0100000_19.l0).setState(AFwS257S0000000_19.get$arr$(699));
        C1C7U.LIZIZ("ProfileLinksOrderViewModel@33cc.updateFeaturesOrder$1$1");
    }

    public static final void accept$71(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("ProfileLinksOrderViewModel@33cc.updateFeaturesOrder$1$2");
        Throwable th = (Throwable) obj;
        ((ProfileLinksOrderViewModel) afS188S0100000_19.l0).setState(AFwS257S0000000_19.get$arr$(OppoPermissionPopupMaskDelayExp.DEFAULT));
        if ((th instanceof C0XIR) && !TextUtils.isEmpty(((C0XIR) th).getErrorMsg())) {
            ((ProfileLinksOrderViewModel) afS188S0100000_19.l0).setState(new AwS598S0100000_19(th, 685));
        } else {
            ((ProfileLinksOrderViewModel) afS188S0100000_19.l0).setState(AFwS257S0000000_19.get$arr$(701));
        }
        ProfileLinksOrderViewModel profileLinksOrderViewModel = (ProfileLinksOrderViewModel) afS188S0100000_19.l0;
        profileLinksOrderViewModel.setState(new AwS598S0100000_19(profileLinksOrderViewModel, 686));
        C1C7U.LIZIZ("ProfileLinksOrderViewModel@33cc.updateFeaturesOrder$1$2");
    }

    public static final void accept$72(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("ProfileEditProfileViewModel@b1a8.updateFeaturesOrder$1");
        ((ProfileEditProfileViewModel) afS188S0100000_19.l0).LLJ.setValue(Boolean.FALSE);
        ((ArrayList) ((ProfileEditProfileViewModel) afS188S0100000_19.l0).LLILZ).clear();
        ProfileEditProfileViewModel profileEditProfileViewModel = (ProfileEditProfileViewModel) afS188S0100000_19.l0;
        ((ArrayList) profileEditProfileViewModel.LLILZ).addAll(profileEditProfileViewModel.LLILLL);
        ((ProfileEditProfileViewModel) afS188S0100000_19.l0).LLIZLLLIL.setValue(Boolean.TRUE);
        C1C7U.LIZIZ("ProfileEditProfileViewModel@b1a8.updateFeaturesOrder$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$73(Y.AfS188S0100000_19 r3, java.lang.Object r4) {
        /*
            java.lang.String r2 = "ProfileEditProfileViewModel@b1a8.updateFeaturesOrder$2"
            X.C1C7U.LIZ(r2)
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.business.ur.editprofile.vm.ProfileEditProfileViewModel r0 = (com.ss.android.ugc.profile.business.ur.editprofile.vm.ProfileEditProfileViewModel) r0
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r1 = r0.LLJ
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.setValue(r0)
            boolean r0 = r4 instanceof X.C0XIR
            if (r0 == 0) goto L3e
            X.0XIR r4 = (X.C0XIR) r4
            java.lang.String r0 = r4.getErrorMsg()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L3e
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.business.ur.editprofile.vm.ProfileEditProfileViewModel r0 = (com.ss.android.ugc.profile.business.ur.editprofile.vm.ProfileEditProfileViewModel) r0
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = r0.LLILZLL
            java.lang.String r0 = r4.getErrorMsg()
            r1.setValue(r0)
        L2f:
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.business.ur.editprofile.vm.ProfileEditProfileViewModel r0 = (com.ss.android.ugc.profile.business.ur.editprofile.vm.ProfileEditProfileViewModel) r0
            androidx.lifecycle.MutableLiveData<java.util.List<java.lang.Integer>> r1 = r0.LLIZ
            java.util.List<java.lang.Integer> r0 = r0.LLILZ
            r1.setValue(r0)
            X.C1C7U.LIZIZ(r2)
            return
        L3e:
            java.lang.Object r0 = r3.l0
            com.ss.android.ugc.profile.business.ur.editprofile.vm.ProfileEditProfileViewModel r0 = (com.ss.android.ugc.profile.business.ur.editprofile.vm.ProfileEditProfileViewModel) r0
            androidx.lifecycle.MutableLiveData<java.lang.String> r1 = r0.LLILZLL
            r0 = 2131848597(0x7f116d95, float:1.9330704E38)
            java.lang.String r0 = X.C1216270hkv.LIZJ(r0)
            r1.setValue(r0)
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS188S0100000_19.accept$73(Y.AfS188S0100000_19, java.lang.Object):void");
    }

    public static final void accept$74(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("PNSSurveyService@7a9d.fetchTopicsToDisplay$2");
        ((PNSSurveyService) afS188S0100000_19.l0).LJIIJ.set(false);
        C1C7U.LIZIZ("PNSSurveyService@7a9d.fetchTopicsToDisplay$2");
    }

    public static final void accept$75(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("SmsConsentPageActivity@3b83.addSmsConsentPageFragment$fragment$1$onCancel$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            SmsConsentPageActivity smsConsentPageActivity = (SmsConsentPageActivity) afS188S0100000_19.l0;
            if (baseResponse.status_code == 0) {
                int i = C2187451AjH.LIZ;
                C1235600iG6.LIZ(smsConsentPageActivity.LL, "1", baseResponse.status_msg, false);
            } else {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("SMS_consent", "updateSmsConsentStatus(0) fail!!!");
                C1235600iG6.LIZ(smsConsentPageActivity.LL, CardStruct.IStatusCode.DEFAULT, baseResponse.status_msg, false);
            }
        }
        C1C7U.LIZIZ("SmsConsentPageActivity@3b83.addSmsConsentPageFragment$fragment$1$onCancel$1$1");
    }

    public static final void accept$76(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("SmsConsentPageActivity@3b83.addSmsConsentPageFragment$fragment$1$onCancel$1$2");
        Throwable th = (Throwable) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSmsConsentStatus(0) - error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        C1235600iG6.LIZ(((SmsConsentPageActivity) afS188S0100000_19.l0).LL, CardStruct.IStatusCode.DEFAULT, th.getMessage(), false);
        C1C7U.LIZIZ("SmsConsentPageActivity@3b83.addSmsConsentPageFragment$fragment$1$onCancel$1$2");
    }

    public static final void accept$77(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("SmsConsentPageActivity@3b83.addSmsConsentPageFragment$fragment$1$onConfirm$1$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            SmsConsentPageActivity smsConsentPageActivity = (SmsConsentPageActivity) afS188S0100000_19.l0;
            if (baseResponse.status_code == 0) {
                int i = C2187451AjH.LIZ;
                ((IPopupInfoService) ServiceManager.get().getService(IPopupInfoService.class)).LJIIJJI(false);
                C1235600iG6.LIZ(smsConsentPageActivity.LL, "1", baseResponse.status_msg, true);
            } else {
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("SMS_consent", "updateSmsConsentStatus(1) fail!!!");
                C1235600iG6.LIZ(smsConsentPageActivity.LL, CardStruct.IStatusCode.DEFAULT, baseResponse.status_msg, true);
            }
        }
        C1C7U.LIZIZ("SmsConsentPageActivity@3b83.addSmsConsentPageFragment$fragment$1$onConfirm$1$1");
    }

    public static final void accept$78(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("SmsConsentPageActivity@3b83.addSmsConsentPageFragment$fragment$1$onConfirm$1$2");
        Throwable th = (Throwable) obj;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSmsConsentStatus(1) - error: ");
        sbLIZ.append(th);
        C2188811AlT.LIZIZ(sbLIZ);
        C1235600iG6.LIZ(((SmsConsentPageActivity) afS188S0100000_19.l0).LL, CardStruct.IStatusCode.DEFAULT, th.getMessage(), true);
        C1C7U.LIZIZ("SmsConsentPageActivity@3b83.addSmsConsentPageFragment$fragment$1$onConfirm$1$2");
    }

    public static final void accept$79(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("ExploreViewPagerComponent@6933.observerTopicPinTabState$1");
        ((ExploreViewPagerComponent) afS188S0100000_19.l0).cp(((Boolean) obj).booleanValue());
        C1C7U.LIZIZ("ExploreViewPagerComponent@6933.observerTopicPinTabState$1");
    }

    public static final void accept$8(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("EmailBindSheetFragment@b0b1.sendCode$1");
        ((EmailBindSheetFragment) afS188S0100000_19.l0).kT(true);
        C1C7U.LIZIZ("EmailBindSheetFragment@b0b1.sendCode$1");
    }

    public static final void accept$80(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("FeedRefreshRecoverComponent@16a7.tryRecoverAweme$dispose$1");
        Aweme aweme = (Aweme) obj;
        if (((FeedRefreshRecoverComponent) afS188S0100000_19.l0).bo(aweme)) {
            ((FeedRefreshRecoverComponent) afS188S0100000_19.l0).fo(aweme, "background");
        } else {
            ((FeedRefreshRecoverComponent) afS188S0100000_19.l0).getClass();
            FeedRefreshRecoverComponent.ho(aweme, "background", false);
        }
        C1C7U.LIZIZ("FeedRefreshRecoverComponent@16a7.tryRecoverAweme$dispose$1");
    }

    public static final void accept$81(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1253880ija c1253880ija;
        C1C7U.LIZ("FeedRefreshRecoverComponent@16a7.tryRecoverAweme$dispose$2");
        Throwable th = (Throwable) obj;
        ((AbstractC1604130rqV) ((FeedRefreshRecoverComponent) afS188S0100000_19.l0).LLIZLLLIL.getValue()).LJI("tryRecoverAweme", th);
        FeedRefreshRecoverComponent feedRefreshRecoverComponent = (FeedRefreshRecoverComponent) afS188S0100000_19.l0;
        Aweme aweme = null;
        if ((th instanceof C1253880ija) && (c1253880ija = (C1253880ija) th) != null) {
            aweme = c1253880ija.LL;
        }
        feedRefreshRecoverComponent.getClass();
        FeedRefreshRecoverComponent.ho(aweme, "background", false);
        C1C7U.LIZIZ("FeedRefreshRecoverComponent@16a7.tryRecoverAweme$dispose$2");
    }

    public static final void accept$82(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) afS188S0100000_19.l0;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.tryRefreshList$1L");
        StoryArchDetail detail = ((StoryArchDetailResponse) obj).getDetail();
        if (detail != null && !C086I.LIZIZ(detail.items)) {
            if (((Boolean) C281200B0k.LIZIZ.getValue()).booleanValue()) {
                PopupManager.LJIIZILJ(new C1259310isL(awemeListFragmentImpl.getContext(), awemeListFragmentImpl.LLLLZIL, new AObjectS362S0100000_19(awemeListFragmentImpl, 22)), new C1668306g5("story_archive_v2_popup_profile"));
            } else if (awemeListFragmentImpl.rT()) {
                C735840Sti.LIZ.getClass();
                C735840Sti.LJIJ("show", "personal_homepage");
                C1259360isQ c1259360isQ = awemeListFragmentImpl.LLJJJ;
                if (!c1259360isQ.LLLIILIL) {
                    c1259360isQ.LLLIILIL = true;
                    c1259360isQ.notifyDataSetChanged();
                }
            }
        }
        C1259360isQ c1259360isQ2 = awemeListFragmentImpl.LLJJJ;
        if (c1259360isQ2 != null) {
            c1259360isQ2.LLLLIILLL = false;
            awemeListFragmentImpl.z = false;
        }
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.tryRefreshList$1L");
    }

    public static final void accept$83(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) afS188S0100000_19.l0;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.tryRefreshList$2L");
        C1259360isQ c1259360isQ = awemeListFragmentImpl.LLJJJ;
        if (c1259360isQ != null) {
            c1259360isQ.LLLLIILLL = false;
            awemeListFragmentImpl.z = false;
        }
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.tryRefreshList$2L");
    }

    public static final void accept$84(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("NewsAnchorPublishRepo@bd0e.requestTitleVerify$5");
        ((Function1) afS188S0100000_19.l0).invoke(obj);
        C1C7U.LIZIZ("NewsAnchorPublishRepo@bd0e.requestTitleVerify$5");
    }

    public static final void accept$85(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C0XZJ c0xzj;
        String string;
        C1C7U.LIZ("SMSInputViewHolderV2@22b.sendCode$2");
        Throwable th = (Throwable) obj;
        if ((th instanceof C0XZJ) && (c0xzj = (C0XZJ) th) != null) {
            C1238900iLQ c1238900iLQ = (C1238900iLQ) afS188S0100000_19.l0;
            int i = C1238900iLQ.LLJILJILJ;
            C1238920iLS.LIZ(Integer.valueOf(c0xzj.getErrorCode()), c1238900iLQ.LLILLJJLI.getEnterFrom(), c1238900iLQ.LLILLJJLI.getEnterMethod(), c1238900iLQ.LLILLJJLI.yQ2(), null, 96);
            int errorCode = c0xzj.getErrorCode();
            if (errorCode != 1002 && errorCode != 1003) {
                C1238240iKM c1238240iKM = c1238900iLQ.LLILLL;
                String errorMsg = c0xzj.getErrorMsg();
                if (errorMsg != null && errorMsg.length() != 0) {
                    string = c0xzj.getErrorMsg();
                } else {
                    string = c1238900iLQ.LL.getContext().getString(2131835079);
                }
                c1238240iKM.LIZJ(string);
            } else {
                c1238900iLQ.LLILLL.LIZJ(c1238900iLQ.LL.getContext().getString(2131829357));
            }
        }
        C1C7U.LIZIZ("SMSInputViewHolderV2@22b.sendCode$2");
    }

    public static final void accept$86(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("UserProfileFollowVM@2122.remove$2");
        ((UserProfileFollowVM) afS188S0100000_19.l0).setState(new AwS598S0100000_19((Throwable) obj, 864));
        C1C7U.LIZIZ("UserProfileFollowVM@2122.remove$2");
    }

    public static final void accept$87(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        Boolean boolValueOf;
        C1C7U.LIZ("ImageProgressScene@3772.startAutoPlay$1");
        if (((Boolean) obj).booleanValue()) {
            ((C12CY) afS188S0100000_19.l0).LLLIL();
        } else {
            InterfaceC19716212Ca interfaceC19716212Ca = ((C12CY) afS188S0100000_19.l0).LLJJIJI;
            if (interfaceC19716212Ca != null) {
                interfaceC19716212Ca.start();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start auto play: ");
            InterfaceC19716212Ca interfaceC19716212Ca2 = ((C12CY) afS188S0100000_19.l0).LLJJIJI;
            if (interfaceC19716212Ca2 != null) {
                boolValueOf = Boolean.valueOf(interfaceC19716212Ca2.isRunning());
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(boolValueOf);
            sbLIZ.append(' ');
            C1450070nq1.LIZJ("ImageProgressScene", C2188811AlT.LIZIZ(sbLIZ));
        }
        C1C7U.LIZIZ("ImageProgressScene@3772.startAutoPlay$1");
    }

    public static final void accept$88(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("SeriesPaymentServiceImpl@a944.requestRefund$2");
        ((Function1) afS188S0100000_19.l0).invoke(obj);
        C1C7U.LIZIZ("SeriesPaymentServiceImpl@a944.requestRefund$2");
    }

    public static final void accept$89(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1255780ime c1255780ime = (C1255780ime) afS188S0100000_19.l0;
        c1255780ime.getClass();
        C1BVK.LIZIZ().LIZ(c1255780ime.mHandler, new ACallableS411S0100000_3((Throwable) obj, 38), 0);
    }

    public static final void accept$9(AfS188S0100000_19 afS188S0100000_19, Object obj) {
        C1C7U.LIZ("EmailOTPLoginCodeVerifyFragment@a757.sendCode$1");
        C0XT7 c0xt7 = (C0XT7) obj;
        C0XZ2.LIZJ(((EmailOTPLoginCodeVerifyFragment) afS188S0100000_19.l0).getEmail(), (C849450XTz) c0xt7.LJIIIZ);
        String strLIZ = C0XZ2.LIZ((C849450XTz) c0xt7.LJIIIZ);
        if (strLIZ != null) {
            EmailOTPLoginCodeVerifyFragment emailOTPLoginCodeVerifyFragment = (EmailOTPLoginCodeVerifyFragment) afS188S0100000_19.l0;
            C854460XfY c854460XfY = C854460XfY.LIZ;
            Bundle arguments = emailOTPLoginCodeVerifyFragment.getArguments();
            c854460XfY.getClass();
            if (arguments != null) {
                C786410Ut5.LJJJI("passport_ticket", strLIZ, arguments);
            }
            C19EG activity = emailOTPLoginCodeVerifyFragment.getActivity();
            if (activity != null && C1234920iF0.LIZIZ(emailOTPLoginCodeVerifyFragment).shouldGetAvailableWays) {
                ((AvailableWaysViewModel) ViewModelProviders.of(activity).get(AvailableWaysViewModel.class)).wQ2(emailOTPLoginCodeVerifyFragment.getEmail(), strLIZ, emailOTPLoginCodeVerifyFragment.getEnterFrom(), emailOTPLoginCodeVerifyFragment.getEnterMethod(), emailOTPLoginCodeVerifyFragment.PR(), emailOTPLoginCodeVerifyFragment.RR());
            }
        }
        Bundle arguments2 = ((EmailOTPLoginCodeVerifyFragment) afS188S0100000_19.l0).getArguments();
        if (arguments2 != null) {
            arguments2.putBoolean("is_register", false);
        }
        C1C7U.LIZIZ("EmailOTPLoginCodeVerifyFragment@a757.sendCode$1");
    }
}
