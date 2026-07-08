package Y;

import X.C09JN;
import X.C1075780e6K;
import X.C1076010e6h;
import X.C1176850gjL;
import X.C1218080hnq;
import X.C1223390hwP;
import X.C1237920iJq;
import X.C1237930iJr;
import X.C1246520iXi;
import X.C1259680isw;
import X.C1260440iuA;
import X.C1389890mGx;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1397620mTQ;
import X.C1720106oR;
import X.C191994109g;
import X.C19719612Di;
import X.C19EG;
import X.C1C7U;
import X.C20684815ws;
import X.C2187451AjH;
import X.C2344009Gk;
import X.C637680Ozm;
import X.C785410UrT;
import X.C786410Ut5;
import X.C846060XGy;
import X.C852810Xct;
import X.DialogC1237620iJM;
import X.EnumC1244930iV9;
import X.InterfaceC1891350zJl;
import X.InterfaceC19256710Vh;
import X.InterfaceC853780XeS;
import X.InterfaceC853790XeT;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment;
import com.ss.android.ugc.aweme.account.popup.SyncNicknameAndUsernamePopTask;
import com.ss.android.ugc.aweme.account.popup.popuphelper.SyncNicknameAndUsernamePopUpHelper;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.follower.CheckupRelationFollowerViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.model.SkylightBlocks;
import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.skylight.BaseSeriesSkyLightVM;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel;
import com.ss.android.ugc.aweme.paidseries.broadcaster.before.viewmodel.PaidSeriesAddSeriesToLiveViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.setting.model.DoBStatus;
import com.ss.android.ugc.aweme.setting.model.EdibilityStatusDisplay;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.model.StoryViewInfoResponse;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.BioTranslationViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import org.json.JSONException;

/* JADX INFO: loaded from: classes20.dex */
public class AfS155S0200000_19 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;

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
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0iKv] */
    public static final void accept$0(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        int iIntValue;
        String title;
        String content;
        int iIntValue2;
        int i;
        int i2;
        boolean z;
        final I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) afS155S0200000_19.l0;
        DialogC1237620iJM dialogC1237620iJM = (DialogC1237620iJM) afS155S0200000_19.l1;
        DoBStatus doBStatus = (DoBStatus) obj;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.clickEditDoB$3L");
        dialogC1237620iJM.dismiss();
        C785410UrT.LIZ(dialogC1237620iJM);
        if (doBStatus.getType() != null && doBStatus.status_code == 0) {
            int iIntValue3 = doBStatus.getType().intValue();
            i18nSettingManageMyAccountActivity.LLILZLL = doBStatus;
            I18nSettingManageMyAccountActivity.LLZLI(iIntValue3);
            if (iIntValue3 != 3 && iIntValue3 != 4 && iIntValue3 != 0 && iIntValue3 != 5) {
                if (i18nSettingManageMyAccountActivity.LLILZLL.getDescType() != null) {
                    iIntValue = i18nSettingManageMyAccountActivity.LLILZLL.getDescType().intValue();
                } else {
                    iIntValue = -1;
                }
                String str2 = "";
                if (i18nSettingManageMyAccountActivity.LLILZLL.getTitle() == null) {
                    title = "";
                } else {
                    title = i18nSettingManageMyAccountActivity.LLILZLL.getTitle();
                }
                if (i18nSettingManageMyAccountActivity.LLILZLL.getContent() == null) {
                    content = "";
                } else {
                    content = i18nSettingManageMyAccountActivity.LLILZLL.getContent();
                }
                if (i18nSettingManageMyAccountActivity.LLILZLL.getCelebrateBirthday() != null) {
                    iIntValue2 = i18nSettingManageMyAccountActivity.LLILZLL.getCelebrateBirthday().intValue();
                } else {
                    iIntValue2 = 0;
                }
                EdibilityStatusDisplay edibilityStatusDisplay = i18nSettingManageMyAccountActivity.LLILZLL.getEdibilityStatusDisplay();
                if (edibilityStatusDisplay != null) {
                    i = edibilityStatusDisplay.ageSelectDisplay;
                    str2 = edibilityStatusDisplay.content;
                    i2 = edibilityStatusDisplay.statusType;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i18nSettingManageMyAccountActivity.LLILZLL.getBirthdayEdibilityStatus() != null && i18nSettingManageMyAccountActivity.LLILZLL.getBirthdayEdibilityStatus().intValue() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                ComplianceServiceProvider.LIZLLL().LJIJJLI(i18nSettingManageMyAccountActivity, new InterfaceC19256710Vh() { // from class: X.0iKv
                    @Override // X.InterfaceC19256710Vh
                    public final void LIZ(String str3, boolean z2) {
                        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity2 = i18nSettingManageMyAccountActivity;
                        String str4 = I18nSettingManageMyAccountActivity._pnsPageId;
                        i18nSettingManageMyAccountActivity2.getClass();
                        if (z2) {
                            C1389890mGx c1389890mGx = new C1389890mGx(i18nSettingManageMyAccountActivity2);
                            c1389890mGx.LJIIIZ(2131825272);
                            c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                            c1389890mGx.LJI(C960203pA.LIZ(R.attr.ee, i18nSettingManageMyAccountActivity2));
                            c1389890mGx.LJIIJJI();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("enter_from", "age_edit_page");
                            C20684815ws.LJIILLIIL("age_edit_birthday_corrected_toast_show", c2344009Gk.LIZ);
                            i18nSettingManageMyAccountActivity2.LLJJJIL.LJIIIIZZ(i18nSettingManageMyAccountActivity2.LLLLZLLLI(str3));
                        }
                    }
                }, i18nSettingManageMyAccountActivity.LLILZLL.getDefaultDoB(), iIntValue3, i18nSettingManageMyAccountActivity.LLILZLL.getUpperBoundDate(), iIntValue, title, content, i18nSettingManageMyAccountActivity.LLILZLL.getImageUrl(), i, str2, i2, iIntValue2, z);
                C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.clickEditDoB$3L");
                return;
            }
            C1397620mTQ c1397620mTQ = new C1397620mTQ(i18nSettingManageMyAccountActivity);
            if (iIntValue3 == 4 && !TextUtils.isEmpty(i18nSettingManageMyAccountActivity.LLILZLL.getAppealUrl())) {
                c1397620mTQ.LJFF(2131825274, new AObjectS362S0100000_19(i18nSettingManageMyAccountActivity, 7));
                c1397620mTQ.LJFF(R.string.f1_, null);
            } else {
                c1397620mTQ.LJFF(2131821883, null);
            }
            C1397580mTM c1397580mTM = new C1397580mTM(i18nSettingManageMyAccountActivity);
            c1397580mTM.LJFF(2131825273);
            c1397580mTM.LIZIZ(i18nSettingManageMyAccountActivity.LLILZLL.getMsg());
            c1397580mTM.LJIIL = c1397620mTQ;
            c1397580mTM.LJII = false;
            new C1397510mTF(c1397580mTM).LIZLLL();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "age_edit_page");
            c2344009Gk.LJ(i18nSettingManageMyAccountActivity.LLILZLL.getType(), "user_age_status");
            C20684815ws.LJIILLIIL("show_age_edit_ineligible_popup", c2344009Gk.LIZ);
            C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.clickEditDoB$3L");
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(i18nSettingManageMyAccountActivity);
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        I18nSettingManageMyAccountActivity.LLZLI(-1);
        C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.clickEditDoB$3L");
    }

    public static final void accept$1(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) afS155S0200000_19.l0;
        DialogC1237620iJM dialogC1237620iJM = (DialogC1237620iJM) afS155S0200000_19.l1;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.clickEditDoB$4L");
        I18nSettingManageMyAccountActivity.LLZLI(-1);
        C1389890mGx c1389890mGx = new C1389890mGx(i18nSettingManageMyAccountActivity);
        c1389890mGx.LJIIIZ(2131848597);
        c1389890mGx.LJIIJJI();
        dialogC1237620iJM.dismiss();
        C785410UrT.LIZ(dialogC1237620iJM);
        C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.clickEditDoB$4L");
    }

    public static final void accept$10(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        UserStory userStory;
        C1C7U.LIZ("StoryCollectionViewHolder@36e3.bindVideoViewerCount$1");
        StoryViewInfoResponse storyViewInfoResponse = (StoryViewInfoResponse) obj;
        Aweme aweme = ((C1259680isw) afS155S0200000_19.l0).LLIZLLLIL;
        if (aweme != null && (userStory = aweme.getUserStory()) != null) {
            userStory.setTotalVV(storyViewInfoResponse.getPlayVideoViewers());
        }
        ((TuxTextView) afS155S0200000_19.l1).setText(C1176850gjL.LIZ(1, Long.valueOf(storyViewInfoResponse.getPlayVideoViewers()), ""));
        C1C7U.LIZIZ("StoryCollectionViewHolder@36e3.bindVideoViewerCount$1");
    }

    public static final void accept$11(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("InvalidVideosClearHelper@8962.executeClear$3");
        C1260440iuA c1260440iuA = (C1260440iuA) afS155S0200000_19.l0;
        ARunnableS88S0200000_19 aRunnableS88S0200000_19 = c1260440iuA.LIZIZ;
        if (aRunnableS88S0200000_19 != null) {
            c1260440iuA.LIZJ.removeCallbacks(aRunnableS88S0200000_19);
        }
        c1260440iuA.LIZIZ = null;
        ((C1260440iuA) afS155S0200000_19.l0).LIZLLL = false;
        ((Function0) afS155S0200000_19.l1).invoke();
        C1C7U.LIZIZ("InvalidVideosClearHelper@8962.executeClear$3");
    }

    public static final void accept$12(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("PIIBindEmailFlowStep@e4fe.handleAction$1");
        ((C1237920iJq) afS155S0200000_19.l0).LIZ().getData().putBoolean("code_sent", true);
        C786410Ut5.LJJJI("args_email", ((C1237920iJq) afS155S0200000_19.l0).LIZ().getData().getString("pii_value"), ((C1237920iJq) afS155S0200000_19.l0).LIZ().getData());
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS155S0200000_19.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
        C1C7U.LIZIZ("PIIBindEmailFlowStep@e4fe.handleAction$1");
    }

    public static final void accept$13(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("PIIBindPhoneFlowStep@eff1.handleAction$2");
        C852810Xct c852810Xct = C852810Xct.LIZ;
        Bundle data = ((C1237930iJr) afS155S0200000_19.l0).LIZ().getData();
        String string = ((C1237930iJr) afS155S0200000_19.l0).LIZ().getData().getString("pii_value", "");
        c852810Xct.getClass();
        C852810Xct.LJIJI(data, string);
        ((C1237930iJr) afS155S0200000_19.l0).LIZ().getData().putBoolean("code_sent", true);
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS155S0200000_19.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, true);
        }
        C1C7U.LIZIZ("PIIBindPhoneFlowStep@eff1.handleAction$2");
    }

    public static final void accept$14(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("SystemNotificationListViewModel@79a3.onDeleteItem$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        SystemNotificationListViewModel systemNotificationListViewModel = (SystemNotificationListViewModel) afS155S0200000_19.l0;
        C1246520iXi c1246520iXi = (C1246520iXi) afS155S0200000_19.l1;
        List<InterfaceC1891350zJl> list = ((C1218080hnq) systemNotificationListViewModel.getState()).LL.LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list);
            arrayList.remove(c1246520iXi);
            if (C637680Ozm.LIZ()) {
                C19719612Di.LJJIIJ(arrayList, AFwS229S0000000_2.get$arr$(675), true);
                systemNotificationListViewModel.wQ2(arrayList, EnumC1244930iV9.DELETE);
            }
            systemNotificationListViewModel.listSetItems(arrayList);
        }
        C1075780e6K.LIZJ(((C1246520iXi) afS155S0200000_19.l1).LL, baseResponse, null);
        C1C7U.LIZIZ("SystemNotificationListViewModel@79a3.onDeleteItem$1");
    }

    public static final void accept$15(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("SystemNotificationListViewModel@79a3.onDeleteItem$2");
        Throwable th = (Throwable) obj;
        int i = C2187451AjH.LIZ;
        C1720106oR.LIZIZ("SystemNotificationListViewModel", "deleteData error", th);
        C1075780e6K.LIZJ(((C1246520iXi) afS155S0200000_19.l0).LL, null, th);
        ((SystemNotificationListViewModel) afS155S0200000_19.l1).setState(AFwS257S0000000_19.get$arr$(660));
        C1C7U.LIZIZ("SystemNotificationListViewModel@79a3.onDeleteItem$2");
    }

    public static final void accept$16(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("BioTranslationViewModel@f1b4.toggleTranslation$2");
        ((Function1) afS155S0200000_19.l0).invoke(obj);
        ((BioTranslationViewModel) afS155S0200000_19.l1).setState(AFwS257S0000000_19.get$arr$(685));
        C1C7U.LIZIZ("BioTranslationViewModel@f1b4.toggleTranslation$2");
    }

    public static final void accept$17(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        boolean z;
        C1C7U.LIZ("CheckupRelationFollowerViewModel@90ca.removeFollower$1");
        if (((BaseResponse) obj).status_code == 0) {
            if (((User) afS155S0200000_19.l0).getFollowStatus() == 2) {
                ((User) afS155S0200000_19.l0).setFollowStatus(1);
                z = true;
            } else {
                z = false;
            }
            C1076010e6h.LIZJ.LIZIZ().LIZJ().postValue(new C1223390hwP(true, ((CheckupRelationFollowerViewModel) afS155S0200000_19.l1).LLILLJJLI, ((User) afS155S0200000_19.l0).getUid(), z));
            C191994109g c191994109g = C191994109g.LIZ;
            CheckupRelationFollowerViewModel checkupRelationFollowerViewModel = (CheckupRelationFollowerViewModel) afS155S0200000_19.l1;
            String str = checkupRelationFollowerViewModel.LLILLJJLI;
            String str2 = checkupRelationFollowerViewModel.LLILLL;
            String uid = ((User) afS155S0200000_19.l0).getUid();
            c191994109g.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("to_user_id", uid);
            c2344009Gk.LJ(C191994109g.LIZJ(), "total_social_info");
            c2344009Gk.LJIIIIZZ("page_type", str2);
            c2344009Gk.LJIIIIZZ("page_name", "privacy_checkup_connections_page");
            C20684815ws.LJIILLIIL("remove_fans", c2344009Gk.LIZ);
        }
        C1C7U.LIZIZ("CheckupRelationFollowerViewModel@90ca.removeFollower$1");
    }

    public static final void accept$2(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("SyncNicknameAndUsernamePopTask@fc36.showNewPopup$1$2$2$1");
        try {
            ((SyncNicknameAndUsernamePopTask) afS155S0200000_19.l0).updateUsernameOnProfilePage(JSONObjectProtectorUtils.getString(((C846060XGy) obj).LJIILJJIL, "login_name"));
            SyncNicknameAndUsernamePopUpHelper.LJ().LIZIZ();
            SyncNicknameAndUsernamePopTask.showSuccessToast$default((SyncNicknameAndUsernamePopTask) afS155S0200000_19.l0, (C19EG) afS155S0200000_19.l1, false, 2, null);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("SyncNicknameAndUsernamePopTask@fc36.showNewPopup$1$2$2$1");
    }

    public static final void accept$3(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("SyncNicknameAndUsernamePopTask@fc36.showNewPopup$1$2$2$2");
        SyncNicknameAndUsernamePopTask.showErrorToast$default((SyncNicknameAndUsernamePopTask) afS155S0200000_19.l0, (C19EG) afS155S0200000_19.l1, false, 2, null);
        C1C7U.LIZIZ("SyncNicknameAndUsernamePopTask@fc36.showNewPopup$1$2$2$2");
    }

    public static final void accept$4(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("BaseSeriesSkyLightVM@3e10.handleRefreshWhenSkylight$4");
        ((BaseSeriesSkyLightVM) afS155S0200000_19.l0).BQ2((SkylightBlocks) obj);
        ((Function0) afS155S0200000_19.l1).invoke();
        C1C7U.LIZIZ("BaseSeriesSkyLightVM@3e10.handleRefreshWhenSkylight$4");
    }

    public static final void accept$5(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemActionButtonClick$1");
        ((PaidSeriesAddSeriesToLiveViewModel) afS155S0200000_19.l0).setState(new AwS598S0100000_19((CollectionDetailModel) afS155S0200000_19.l1, 212));
        C1C7U.LIZIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemActionButtonClick$1");
    }

    public static final void accept$6(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemActionButtonClick$2");
        if (((BaseResponse) obj).status_code == 0) {
            ((PaidSeriesAddSeriesToLiveViewModel) afS155S0200000_19.l0).setState(new AwS598S0100000_19((CollectionDetailModel) afS155S0200000_19.l1, 213));
        }
        C1C7U.LIZIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemActionButtonClick$2");
    }

    public static final void accept$7(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemSecondaryButtonClick$1");
        ((PaidSeriesAddSeriesToLiveViewModel) afS155S0200000_19.l0).setState(new AwS598S0100000_19((CollectionDetailModel) afS155S0200000_19.l1, 215));
        C1C7U.LIZIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemSecondaryButtonClick$1");
    }

    public static final void accept$8(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemSecondaryButtonClick$2");
        if (((BaseResponse) obj).status_code == 0) {
            ((PaidSeriesAddSeriesToLiveViewModel) afS155S0200000_19.l0).setState(new AwS598S0100000_19((CollectionDetailModel) afS155S0200000_19.l1, 216));
        }
        C1C7U.LIZIZ("PaidSeriesAddSeriesToLiveViewModel@f2fa.onItemSecondaryButtonClick$2");
    }

    public static final void accept$9(AfS155S0200000_19 afS155S0200000_19, Object obj) {
        C1C7U.LIZ("VerifyPhoneForChangeFlowStep@df7b.handleAction$1");
        ((InputCodeFragment.InputCodeActions) ((InterfaceC853790XeT) afS155S0200000_19.l0)).getFragment().sT("");
        InterfaceC853780XeS interfaceC853780XeS = (InterfaceC853780XeS) afS155S0200000_19.l1;
        if (interfaceC853780XeS != null) {
            interfaceC853780XeS.LIZIZ(null, false);
        }
        C1C7U.LIZIZ("VerifyPhoneForChangeFlowStep@df7b.handleAction$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS155S0200000_19(X.C1246520iXi r2, com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 14 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS155S0200000_19.<init>(X.0iXi, com.ss.android.ugc.aweme.notification.sysnotice.vm.SystemNotificationListViewModel, int):void");
    }

    public AfS155S0200000_19(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
