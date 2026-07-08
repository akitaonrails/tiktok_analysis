package Y;

import X.C0259006v;
import X.C09JN;
import X.C09YG;
import X.C0HZQ;
import X.C0LAB;
import X.C0OBG;
import X.C0P0T;
import X.C0PEM;
import X.C0PGF;
import X.C0W3A;
import X.C0XGR;
import X.C0XQ5;
import X.C0XWJ;
import X.C10E1;
import X.C10ET;
import X.C11JF;
import X.C1211730hdb;
import X.C1220920hsQ;
import X.C1234920iF0;
import X.C1236200iH4;
import X.C1239960iN8;
import X.C1239970iN9;
import X.C1240010iND;
import X.C1240020iNE;
import X.C1241350iPN;
import X.C1241390iPR;
import X.C1241410iPT;
import X.C1241460iPY;
import X.C1242520iRG;
import X.C1242590iRN;
import X.C1242620iRQ;
import X.C1243410iSh;
import X.C1246760iY6;
import X.C1247000iYU;
import X.C1247130iYh;
import X.C1247140iYi;
import X.C1247240iYs;
import X.C1247270iYv;
import X.C1247510iZJ;
import X.C1248250iaV;
import X.C1248430ian;
import X.C1249240ic6;
import X.C1249580ice;
import X.C1249650icl;
import X.C1253930ijf;
import X.C1257270ip3;
import X.C1257500ipQ;
import X.C1257620ipc;
import X.C1257950iq9;
import X.C1258010iqF;
import X.C1266140j3M;
import X.C127K;
import X.C1336205Ku;
import X.C1388190mED;
import X.C1390850mIV;
import X.C1390920mIc;
import X.C1391600mJi;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1403110mcH;
import X.C1436505jn;
import X.C15438062q;
import X.C161N;
import X.C1701940uOG;
import X.C1720106oR;
import X.C19EG;
import X.C1EDI;
import X.C20515215Pi;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2215381BnE;
import X.C2277881EDy;
import X.C2296808zG;
import X.C23250099c;
import X.C2344009Gk;
import X.C259800zU;
import X.C450720Hlu;
import X.C497820Jfg;
import X.C849680XUw;
import X.C985403tE;
import X.EnumC1065850dqJ;
import X.EnumC1235690iGF;
import X.EnumC1241340iPM;
import X.EnumC1247010iYV;
import X.EnumC1248480ias;
import X.EnumC1612760s4Q;
import X.InterfaceC1258060iqK;
import X.InterfaceC1631620sYq;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ab.SubscribeSettingsExp;
import com.ss.android.ugc.aweme.account.login.passkey.RecoveryPasskeyUpsellFragment;
import com.ss.android.ugc.aweme.account.login.v2.base.AvailableWaysViewModel;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailLinkVerifyFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.EmailOTPLoginCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.cla.et.newet.ClickSeeOriginalInBioEvent;
import com.ss.android.ugc.aweme.compliance.api.services.banappeal.AgsWarningInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.feed.model.TvRatingInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.inbox.search.data.items.InboxSearchRecentStoreItem;
import com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchUserCell;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.profile.model.SignatureExtraInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.tab.profiletab.base.basebusiness.ITabBusinessListener;
import com.ss.android.ugc.aweme.series.seriesdetail.assem.SeriesDetailDescriptionAssem;
import com.ss.android.ugc.aweme.series.seriesdetail.fragment.SeriesDetailFragment;
import com.ss.android.ugc.aweme.service.IPaidContentNavigatorService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import com.ss.android.ugc.profile.business.cd.IMenuAbility;
import com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.profile.business.photo.text.photoboost.PhotoModeBoostedFeedbackResponse;
import com.ss.android.ugc.profile.business.pns.account.AccountAGSWarningProtocol;
import com.ss.android.ugc.profile.business.profile.menu.business.content.search.SearchActionComponent;
import com.ss.android.ugc.profile.business.ur.aigc.ChooseStyleCell;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.RelationSearchCell;
import com.ss.android.ugc.profile.business.ur.ui.ProfileEditFragment;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.DialogInfo;
import com.ss.android.ugc.profile.platform.base.data.EventParams;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.BioTranslationViewModel;
import com.ss.android.ugc.profile.platform.business.header.business.bio.business.signature.base.ProfileHeaderSignatureTranslationComponent;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.widget.awemepager.AwemePagerVM;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS103S0201000_19;
import kotlin.jvm.internal.AwS25S2200000_19;
import kotlin.jvm.internal.AwS33S0001000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public class ACListenerS85S0300000_19 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
            case 14:
                onClick$14(this, view);
                break;
            case 15:
                onClick$15(this, view);
                break;
            case 16:
                onClick$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onClick$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onClick$18(this, view);
                break;
            case 19:
                onClick$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onClick$20(this, view);
                break;
            case 21:
                onClick$21(this, view);
                break;
            case 22:
                onClick$22(this, view);
                break;
            case 23:
                onClick$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onClick$24(this, view);
                break;
            case 25:
                onClick$25(this, view);
                break;
            case 26:
                onClick$26(this, view);
                break;
            case 27:
                onClick$27(this, view);
                break;
            case 28:
                onClick$28(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        C1242620iRQ c1242620iRQLJI = ((C1242590iRN) aCListenerS85S0300000_19.l0).LJI();
        if (c1242620iRQLJI != null) {
            c1242620iRQLJI.LIZIZ("follow");
        }
        ((C1242590iRN) aCListenerS85S0300000_19.l0).LJ(((Aweme) aCListenerS85S0300000_19.l1).getAid(), AwemeExtKt.getAuthorUid((Aweme) aCListenerS85S0300000_19.l1), new AwS420S0200000_19((C1242590iRN) aCListenerS85S0300000_19.l0, (User) aCListenerS85S0300000_19.l2, 2));
    }

    public static final void onClick$1(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        String uid;
        long jLongValue;
        C1236200iH4 c1236200iH4 = (C1236200iH4) aCListenerS85S0300000_19.l0;
        CollectionDetailModel collectionDetailModel = (CollectionDetailModel) aCListenerS85S0300000_19.l1;
        c1236200iH4.getClass();
        if (collectionDetailModel.category == SeriesCategory.MINI_DRAMA) {
            ((IPaidContentNavigatorService) ((C1236200iH4) aCListenerS85S0300000_19.l0).LLILZLL.getValue()).LIZJ((Context) aCListenerS85S0300000_19.l2, "live_pop_card", (CollectionDetailModel) aCListenerS85S0300000_19.l1);
            return;
        }
        IPaidContentNavigatorService iPaidContentNavigatorService = (IPaidContentNavigatorService) ((C1236200iH4) aCListenerS85S0300000_19.l0).LLILZLL.getValue();
        CollectionDetailModel collectionDetailModel2 = (CollectionDetailModel) aCListenerS85S0300000_19.l1;
        long j = collectionDetailModel2.collectionId;
        User user = collectionDetailModel2.collectionCreator;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        Long l = ((C1236200iH4) aCListenerS85S0300000_19.l0).LLILLJJLI;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        SeriesDetailFragment seriesDetailFragmentLIZIZ = iPaidContentNavigatorService.LIZIZ("live_pop_card", j, uid, jLongValue, EnumC1612760s4Q.LIVE);
        C19EG c19egLIZIZ = C1388190mED.LIZIZ((Context) aCListenerS85S0300000_19.l2);
        if (c19egLIZIZ == null) {
            return;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LJIIIIZZ(1);
        int iLIZ = (int) (((double) C497820Jfg.LIZ(c19egLIZIZ)) * 0.73d);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJL = iLIZ;
        tuxSheet.LLJJIJI = seriesDetailFragmentLIZIZ;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLJLL = true;
        tuxSheet.showNow(c19egLIZIZ.getSupportFragmentManager(), null);
    }

    public static final void onClick$10(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        boolean z;
        int value;
        Integer numValueOf;
        EnumC1247010iYV enumC1247010iYV;
        EnumC1247010iYV enumC1247010iYV2;
        List<C1247270iYv> list = ((RelationSearchCell) aCListenerS85S0300000_19.l0).N5().LLIZ;
        if (list != null) {
            C1247270iYv c1247270iYv = (C1247270iYv) aCListenerS85S0300000_19.l2;
            ArrayList<C1247270iYv> arrayList = new ArrayList();
            for (C1247270iYv c1247270iYv2 : list) {
                if (Intrinsics.LJFF(c1247270iYv2.LL.getUid(), c1247270iYv.LL.getUid())) {
                    arrayList.add(c1247270iYv2);
                }
            }
            RelationSearchCell relationSearchCell = (RelationSearchCell) aCListenerS85S0300000_19.l0;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (C1247270iYv c1247270iYv3 : arrayList) {
                C1247270iYv item = relationSearchCell.getItem();
                if (item != null) {
                    item.LLILZIL = c1247270iYv3.LLILZIL;
                }
                arrayList2.add(Unit.LIZ);
            }
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null) {
            RelationSearchCell relationSearchCell2 = (RelationSearchCell) aCListenerS85S0300000_19.l0;
            User user = (User) aCListenerS85S0300000_19.l1;
            view.getContext();
            C1247140iYi c1247140iYi = new C1247140iYi();
            ((ArrayList) c1247140iYi.LIZ).addAll(relationSearchCell2.I5(user, view));
            C1247130iYh c1247130iYhLIZ = c1247140iYi.LIZ();
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            String strL5 = relationSearchCell2.L5();
            String strVQ2 = relationSearchCell2.N5().vQ2();
            int followStatus = user.getFollowStatus();
            if (C1247000iYU.LIZIZ(user) != null) {
                z = true;
            } else {
                z = false;
            }
            C1247270iYv item2 = relationSearchCell2.getItem();
            if (item2 != null && (enumC1247010iYV2 = item2.LLILZIL) != null) {
                value = enumC1247010iYV2.getValue();
            } else {
                value = 0;
            }
            C1247270iYv item3 = relationSearchCell2.getItem();
            if (item3 != null && (enumC1247010iYV = item3.LLILZIL) != null) {
                numValueOf = Integer.valueOf(enumC1247010iYV.getValue());
            } else {
                numValueOf = null;
            }
            c1247130iYhLIZ.LIZ(supportFragmentManager, strL5, new C1243410iSh(strVQ2, "card_list", "show", followStatus, z, value, C1247000iYU.LIZLLL(numValueOf, Integer.valueOf(user.getFollowStatus())) ? 1 : 0));
        }
        C1247240iYs c1247240iYs = C1247240iYs.LIZ;
        String enterFrom = ((RelationSearchCell) aCListenerS85S0300000_19.l0).getEnterFrom();
        String str = ((RelationSearchCell) aCListenerS85S0300000_19.l0).N5().LLILZ;
        int absoluteAdapterPosition = ((RelationSearchCell) aCListenerS85S0300000_19.l0).getAbsoluteAdapterPosition();
        int followStatus2 = ((User) aCListenerS85S0300000_19.l1).getFollowStatus();
        int followerStatus = ((User) aCListenerS85S0300000_19.l1).getFollowerStatus();
        c1247240iYs.getClass();
        C1247240iYs.LIZ(absoluteAdapterPosition, enterFrom, followStatus2, str, followerStatus, "more");
    }

    public static final void onClick$11(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        C1436505jn c1436505jn = C1436505jn.LIZ;
        C19EG c19eg = (C19EG) aCListenerS85S0300000_19.l0;
        Context context = (Context) aCListenerS85S0300000_19.l1;
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19((ProfileEditFragment) aCListenerS85S0300000_19.l2, 2445);
        c1436505jn.getClass();
        C1436505jn.LIZ(c19eg, context, 1, awS563S0100000_19);
        C20684815ws.onEventV3("impersonation_account_nr_submit_edits_button");
    }

    public static final void onClick$12(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        String str;
        String str2;
        C1257270ip3.LIZ.getClass();
        C1211730hdb c1211730hdb = C1257270ip3.LIZJ;
        c1211730hdb.LIZ().storeInt(C1211730hdb.LIZIZ("pb_uid_no_click_count", "global"), 0);
        c1211730hdb.LIZ().storeLong(C1211730hdb.LIZIZ("pb_uid_exit_until", "global"), 0L);
        PhotoModeBoostedFeedbackResponse photoModeBoostedFeedbackResponse = (PhotoModeBoostedFeedbackResponse) aCListenerS85S0300000_19.l0;
        C0LAB c0lab = new C0LAB();
        String str3 = null;
        if (photoModeBoostedFeedbackResponse != null) {
            str3 = photoModeBoostedFeedbackResponse.itemId;
            str = photoModeBoostedFeedbackResponse.hotRequestCount;
            str2 = photoModeBoostedFeedbackResponse.photoQueueHotRequestCnt;
        } else {
            str = null;
            str2 = null;
        }
        C1403110mcH.LIZIZ(c0lab, "personal_video_cover_page", str3, str, str2, "click", "click_more");
        C20684815ws.LJIILLIIL("info_photo_boosted_banner", c0lab.LIZ);
        C19EG c19eg = (C19EG) aCListenerS85S0300000_19.l1;
        PhotoModeBoostedFeedbackResponse photoModeBoostedFeedbackResponse2 = (PhotoModeBoostedFeedbackResponse) aCListenerS85S0300000_19.l0;
        String str4 = photoModeBoostedFeedbackResponse2.link;
        if (str4 != null) {
            StringBuilder sb = new StringBuilder(str4);
            String str5 = "?";
            if (a0.LJJIIZI(str4, "?", false)) {
                str5 = "&";
            }
            sb.append(str5);
            sb.append("enter_from=personal_video_cover_page");
            String str6 = photoModeBoostedFeedbackResponse2.itemId;
            if (str6 != null && str6.length() != 0) {
                sb.append("&item_id=");
                sb.append(str6);
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(c19eg, sb.toString());
            smartRouteBuildRoute.withParam("use_spark", 1);
            smartRouteBuildRoute.withParam("loading_bgcolor", "000000");
            smartRouteBuildRoute.withParam("container_bg_color", "000000");
            smartRouteBuildRoute.withParam("status_bar_color", "000000");
            smartRouteBuildRoute.withParam("nav_bar_color", "000000");
            smartRouteBuildRoute.withParam("navigation_bar_bg_color", "000000");
            smartRouteBuildRoute.withParam("status_font_dark", 0);
            smartRouteBuildRoute.withParam("hide_nav_bar", 1);
            smartRouteBuildRoute.withParam("disable_bounces", 1);
            smartRouteBuildRoute.withParam("disable_swipe", 1);
            smartRouteBuildRoute.open();
        }
        ((C20515215Pi) aCListenerS85S0300000_19.l2).LIZIZ();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void onClick$13(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        C2215381BnE c2215381BnE = C2215381BnE.LIZ;
        Context context = ((View) aCListenerS85S0300000_19.l0).getContext();
        DialogInfo dialog = ((Action) aCListenerS85S0300000_19.l1).getDialog();
        c2215381BnE.getClass();
        C1397580mTM c1397580mTMLIZIZ = C2215381BnE.LIZIZ(context, dialog);
        if (c1397580mTMLIZIZ != null) {
            new C1397510mTF(c1397580mTMLIZIZ).LIZLLL();
        }
        ?? r0 = ((AccountAGSWarningProtocol) aCListenerS85S0300000_19.l2).LLJJIII;
        if (r0 != 0) {
            r0.invoke();
        }
    }

    public static final void onClick$14(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        String strHP;
        boolean z;
        ((SearchActionComponent) aCListenerS85S0300000_19.l0).mp((ProfileComponents) aCListenerS85S0300000_19.l1);
        C1249240ic6 c1249240ic6 = C1249240ic6.LIZ;
        ProfileComponents profileComponents = (ProfileComponents) aCListenerS85S0300000_19.l1;
        IMenuAbility iMenuAbilityZp = ((SearchActionComponent) aCListenerS85S0300000_19.l0).zp();
        String notificationType = null;
        if (iMenuAbilityZp != null) {
            strHP = iMenuAbilityZp.hP();
        } else {
            strHP = null;
        }
        IMenuAbility iMenuAbilityZp2 = ((SearchActionComponent) aCListenerS85S0300000_19.l0).zp();
        if (iMenuAbilityZp2 != null) {
            notificationType = iMenuAbilityZp2.getNotificationType();
        }
        IMenuAbility iMenuAbilityZp3 = ((SearchActionComponent) aCListenerS85S0300000_19.l0).zp();
        boolean z2 = false;
        if (iMenuAbilityZp3 != null && iMenuAbilityZp3.hP1()) {
            z = true;
        } else {
            z = false;
        }
        IMenuAbility iMenuAbilityZp4 = ((SearchActionComponent) aCListenerS85S0300000_19.l0).zp();
        if (iMenuAbilityZp4 != null && iMenuAbilityZp4.Xd()) {
            z2 = true;
        }
        c1249240ic6.getClass();
        C20684815ws.LJFF().execute(new ARunnableS0S2140000_19(profileComponents, false, false, strHP, notificationType, z, z2, 1));
        C1248250iaV c1248250iaV = C1248250iaV.LIZ;
        ProfileComponents profileComponents2 = (ProfileComponents) aCListenerS85S0300000_19.l1;
        Context context = (Context) aCListenerS85S0300000_19.l2;
        c1248250iaV.getClass();
        C1248250iaV.LIZJ(profileComponents2, context);
        TuxTextView tuxTextViewAp = ((SearchActionComponent) aCListenerS85S0300000_19.l0).Ap();
        if (tuxTextViewAp != null) {
            tuxTextViewAp.setTag(R.id.s6y, Boolean.TRUE);
        }
    }

    public static final void onClick$15(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        String str;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSearchUserCell", "avatarIv.click");
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        C1241350iPN c1241350iPN = (C1241350iPN) aCListenerS85S0300000_19.l0;
        Function1<IMUser, Unit> function1 = c1241350iPN.LLILZIL;
        String str2 = "";
        if (function1 != null) {
            function1.invoke((IMUser) aCListenerS85S0300000_19.l1);
            ((InboxSearchUserCell) aCListenerS85S0300000_19.l2).LLILZIL = false;
        } else {
            InboxSearchUserCell inboxSearchUserCell = (InboxSearchUserCell) aCListenerS85S0300000_19.l2;
            IMUser iMUser = (IMUser) aCListenerS85S0300000_19.l1;
            inboxSearchUserCell.LLILZIL = true;
            EnumC1241340iPM enumC1241340iPM = null;
            C1242520iRG.LIZ(iMUser.getUid(), iMUser.getSecUid(), "", null);
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "dm_search_page");
            C1241350iPN item = inboxSearchUserCell.getItem();
            if (item != null) {
                enumC1241340iPM = item.LLILLL;
            }
            EnumC1241340iPM enumC1241340iPM2 = EnumC1241340iPM.RECENT;
            String str3 = "recent";
            if (enumC1241340iPM == enumC1241340iPM2) {
                str = "recent";
            } else {
                str = "suggested";
            }
            c2344009Gk.LJIIIIZZ("inbox_search_position", str);
            c2344009Gk.LJIIIIZZ("inbox_search_cell_type", "user_cell");
            c2344009Gk.LJIIIIZZ("enter_method", "click_dm_search_cell");
            c2344009Gk.LJIIIIZZ("to_user_id", iMUser.getUid());
            c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
            C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
            C1241350iPN item2 = inboxSearchUserCell.getItem();
            if (item2 != null) {
                C1241390iPR c1241390iPR = inboxSearchUserCell.LLILZ;
                if (c1241390iPR != null) {
                    Pair[] pairArr = new Pair[9];
                    if (c1241350iPN.LLILLL != enumC1241340iPM2) {
                        str3 = "suggested";
                    }
                    pairArr[0] = new Pair("position", str3);
                    pairArr[1] = new Pair("cell_type", "user_cell");
                    String uid = item2.LL.getUid();
                    if (uid == null) {
                        uid = "";
                    }
                    pairArr[2] = new Pair("to_user_id", uid);
                    pairArr[3] = new Pair("relation_tag", String.valueOf(item2.LL.getFollowStatus()));
                    String recType = item2.LL.getRecType();
                    if (recType == null) {
                        recType = "";
                    }
                    pairArr[4] = new Pair("rec_type", recType);
                    pairArr[5] = new Pair("chat_type", "private");
                    pairArr[6] = new Pair("action", "enter_profile");
                    pairArr[7] = new Pair("conversation_id", C1336205Ku.LIZ(false).getImUserService().LIZLLL(iMUser.getUid()));
                    String str4 = item2.LLILZLL.get("rank_num");
                    if (str4 == null) {
                        str4 = "-1";
                    }
                    pairArr[8] = new Pair("rank_num", str4);
                    c1241390iPR.LIZJ(C2097608Jq.LJIIIIZZ(pairArr));
                }
                C1241460iPY c1241460iPY = C1241460iPY.LIZ;
                EnumC1241340iPM enumC1241340iPM3 = item2.LLILLL;
                c1241460iPY.getClass();
                C1241460iPY.LJIIIZ(enumC1241340iPM3);
            }
        }
        C1241390iPR c1241390iPR2 = ((InboxSearchUserCell) aCListenerS85S0300000_19.l2).LLILZ;
        if (c1241390iPR2 != null) {
            C0PGF c0pgf = C0PGF.USER;
            String uid2 = ((C1241350iPN) aCListenerS85S0300000_19.l0).LL.getUid();
            if (uid2 != null) {
                str2 = uid2;
            }
            c1241390iPR2.LLILLJJLI.zQ2(new InboxSearchRecentStoreItem(c0pgf, str2, System.currentTimeMillis()));
        }
    }

    public static final void onClick$16(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        Context context;
        String str;
        C1241390iPR c1241390iPR;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("InboxSearchUserCell", "itemView.click");
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        C1241460iPY c1241460iPY = C1241460iPY.LIZ;
        EnumC1241340iPM enumC1241340iPM = ((C1241350iPN) aCListenerS85S0300000_19.l0).LLILLL;
        c1241460iPY.getClass();
        C1241460iPY.LJIIIZ(enumC1241340iPM);
        C1241350iPN c1241350iPN = (C1241350iPN) aCListenerS85S0300000_19.l0;
        Function1<IMUser, Unit> function1 = c1241350iPN.LLILZIL;
        String str2 = "";
        if (function1 != null) {
            function1.invoke((IMUser) aCListenerS85S0300000_19.l1);
        } else {
            InboxSearchUserCell inboxSearchUserCell = (InboxSearchUserCell) aCListenerS85S0300000_19.l2;
            IMUser iMUser = (IMUser) aCListenerS85S0300000_19.l1;
            EnumC1241340iPM enumC1241340iPM2 = c1241350iPN.LLILLL;
            inboxSearchUserCell.getClass();
            C1241410iPT.LIZ.getClass();
            IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            EnterChatParams enterChatParams = new EnterChatParams(context, iMUser);
            enterChatParams.setEnterFromForMob("dm_search_page");
            enterChatParams.setEnterMethodForMob("click_dm_search_cell");
            enterChatParams.setStickyTop(false);
            enterChatParams.setUnreadCount(0);
            enterChatParams.setSearchTargetIndex(null);
            enterChatParams.setMatchedKeyword("");
            enterChatParams.setInboxSearchCellType("user_cell");
            EnumC1241340iPM enumC1241340iPM3 = EnumC1241340iPM.RECENT;
            String str3 = "recent";
            if (enumC1241340iPM2 == enumC1241340iPM3) {
                str = "recent";
            } else {
                str = "suggested";
            }
            enterChatParams.setInboxSearchPosition(str);
            imChatService.LJIILLIIL(enterChatParams, null);
            C1241350iPN item = inboxSearchUserCell.getItem();
            if (item != null && (c1241390iPR = inboxSearchUserCell.LLILZ) != null) {
                Pair[] pairArr = new Pair[9];
                if (c1241350iPN.LLILLL != enumC1241340iPM3) {
                    str3 = "suggested";
                }
                pairArr[0] = new Pair("position", str3);
                pairArr[1] = new Pair("cell_type", "user_cell");
                String uid = item.LL.getUid();
                if (uid == null) {
                    uid = "";
                }
                pairArr[2] = new Pair("to_user_id", uid);
                pairArr[3] = new Pair("relation_tag", String.valueOf(item.LL.getFollowStatus()));
                String recType = item.LL.getRecType();
                if (recType == null) {
                    recType = "";
                }
                pairArr[4] = new Pair("rec_type", recType);
                pairArr[5] = new Pair("chat_type", "private");
                pairArr[6] = new Pair("action", "enter_chat");
                pairArr[7] = new Pair("conversation_id", C1336205Ku.LIZ(false).getImUserService().LIZLLL(iMUser.getUid()));
                String str4 = item.LLILZLL.get("rank_num");
                if (str4 == null) {
                    str4 = "-1";
                }
                pairArr[8] = new Pair("rank_num", str4);
                c1241390iPR.LIZJ(C2097608Jq.LJIIIIZZ(pairArr));
            }
        }
        C1241390iPR c1241390iPR2 = ((InboxSearchUserCell) aCListenerS85S0300000_19.l2).LLILZ;
        if (c1241390iPR2 != null) {
            C0PGF c0pgf = C0PGF.USER;
            String uid2 = ((C1241350iPN) aCListenerS85S0300000_19.l0).LL.getUid();
            if (uid2 != null) {
                str2 = uid2;
            }
            c1241390iPR2.LLILLJJLI.zQ2(new InboxSearchRecentStoreItem(c0pgf, str2, System.currentTimeMillis()));
        }
    }

    public static final void onClick$17(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        String str;
        C1241350iPN item = ((InboxSearchUserCell) aCListenerS85S0300000_19.l0).getItem();
        String str2 = "";
        if (item != null) {
            InboxSearchUserCell inboxSearchUserCell = (InboxSearchUserCell) aCListenerS85S0300000_19.l0;
            C1241350iPN c1241350iPN = (C1241350iPN) aCListenerS85S0300000_19.l1;
            IMUser iMUser = (IMUser) aCListenerS85S0300000_19.l2;
            C1241390iPR c1241390iPR = inboxSearchUserCell.LLILZ;
            if (c1241390iPR != null) {
                Pair[] pairArr = new Pair[9];
                if (c1241350iPN.LLILLL == EnumC1241340iPM.RECENT) {
                    str = "recent";
                } else {
                    str = "suggested";
                }
                pairArr[0] = new Pair("position", str);
                pairArr[1] = new Pair("cell_type", "user_cell");
                String uid = item.LL.getUid();
                if (uid == null) {
                    uid = "";
                }
                pairArr[2] = new Pair("to_user_id", uid);
                pairArr[3] = new Pair("relation_tag", String.valueOf(item.LL.getFollowStatus()));
                String recType = item.LL.getRecType();
                if (recType == null) {
                    recType = "";
                }
                pairArr[4] = new Pair("rec_type", recType);
                pairArr[5] = new Pair("chat_type", "private");
                pairArr[6] = new Pair("action", "clear_history");
                pairArr[7] = new Pair("conversation_id", C1336205Ku.LIZ(false).getImUserService().LIZLLL(iMUser.getUid()));
                String str3 = item.LLILZLL.get("rank_num");
                if (str3 == null) {
                    str3 = "-1";
                }
                pairArr[8] = new Pair("rank_num", str3);
                c1241390iPR.LIZJ(C2097608Jq.LJIIIIZZ(pairArr));
            }
        }
        C1241390iPR c1241390iPR2 = ((InboxSearchUserCell) aCListenerS85S0300000_19.l0).LLILZ;
        if (c1241390iPR2 != null) {
            C0PGF c0pgf = C0PGF.USER;
            String uid2 = ((C1241350iPN) aCListenerS85S0300000_19.l1).LL.getUid();
            if (uid2 != null) {
                str2 = uid2;
            }
            c1241390iPR2.LIZ(new InboxSearchRecentStoreItem(c0pgf, str2, 0L));
        }
    }

    public static final void onClick$18(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        boolean zLJI = MethodIDManager.LJI(71961);
        if (!C0OBG.LIZIZ((View) aCListenerS85S0300000_19.l0) && ((BaseI18nLoginFragment) aCListenerS85S0300000_19.l1).BS()) {
            if (C2214201BlK.LJFF() == null) {
                C2214201BlK.LJI(((BaseI18nLoginFragment) aCListenerS85S0300000_19.l1).getActivity());
            }
            ((View.OnClickListener) aCListenerS85S0300000_19.l2).onClick(view);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$19(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        T tLIZIZ;
        String tvRatingDescription;
        C259800zU c259800zU = new C259800zU();
        Context context = ((SeriesDetailDescriptionAssem) aCListenerS85S0300000_19.l0).getContext();
        if (context != null) {
            TuxIconView tuxIconView = (TuxIconView) aCListenerS85S0300000_19.l1;
            CollectionDetailModel collectionDetailModel = (CollectionDetailModel) aCListenerS85S0300000_19.l2;
            C450720Hlu c450720Hlu = new C450720Hlu(context);
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = tuxIconView;
            c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
            c450720Hlu.LJII(R.attr.zh);
            TvRatingInfo tvRatingInfo = collectionDetailModel.tvRatingInfo;
            if (tvRatingInfo == null || (tvRatingDescription = tvRatingInfo.getTvRatingDescription()) == null) {
                tvRatingDescription = "";
            }
            c450720Hlu.LLILZ = tvRatingDescription;
            tLIZIZ = c450720Hlu.LIZIZ();
        } else {
            tLIZIZ = 0;
        }
        c259800zU.element = tLIZIZ;
        HandlerHook.viewPost(((SeriesDetailDescriptionAssem) aCListenerS85S0300000_19.l0).LJJIJL(), new ARunnableS119S0100000_19(c259800zU, 144));
    }

    public static final void onClick$2(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        C0XWJ c0xwj = C0XWJ.LIZ;
        int size = ((C1239960iN8) aCListenerS85S0300000_19.l0).LL.size();
        c0xwj.getClass();
        C0XWJ.LJIIJ(size, "click_delete", null, null);
        C1239960iN8 c1239960iN8 = (C1239960iN8) aCListenerS85S0300000_19.l0;
        int absoluteAdapterPosition = ((C1239970iN9) aCListenerS85S0300000_19.l1).getAbsoluteAdapterPosition();
        Context context = ((C1239970iN9) aCListenerS85S0300000_19.l1).LL.getContext();
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) aCListenerS85S0300000_19.l2;
        c1239960iN8.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        if (baseLoginMethod == null) {
            baseLoginMethod = (BaseLoginMethod) ListProtector.get(c1239960iN8.LL, absoluteAdapterPosition);
        }
        String strLIZJ = C0XWJ.LIZJ(baseLoginMethod);
        boolean zLJ = C849680XUw.LJ(baseLoginMethod);
        long time = baseLoginMethod.safeExpires().getTime() - 31536000000L;
        Long lastActiveTime = baseLoginMethod.getLastActiveTime();
        if (lastActiveTime != null) {
            long jLongValue = lastActiveTime.longValue();
            if (jLongValue < 0) {
                time = jLongValue;
            }
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("user_id", baseLoginMethod.getUid());
        c2344009Gk.LJIIIIZZ("last_active", C1240010iND.LIZ(time));
        c2344009Gk.LJIIIIZZ("platform", C849680XUw.LJFF(baseLoginMethod));
        c2344009Gk.LIZJ(c1239960iN8.LL.size(), "user_cnt");
        C20684815ws.LJIILLIIL("login_notify_remove_account", c2344009Gk.LIZ);
        String str = c1239960iN8.LLILLL;
        String str2 = c1239960iN8.LLILZ;
        C0XGR c0xgr = new C0XGR();
        if (str == null) {
            str = "";
        }
        c0xgr.LIZLLL("enter_from", str);
        if (str2 == null) {
            str2 = "";
        }
        c0xgr.LIZLLL("enter_method", str2);
        c0xgr.LIZLLL("account_type", C849680XUw.LIZ(baseLoginMethod));
        c0xgr.LIZLLL("platform", C849680XUw.LJFF(baseLoginMethod));
        C20684815ws.LJIILLIIL("oneclick_remove_account_show", c0xgr.LIZ);
        c1397580mTM.LJFF(2131838748);
        c1397580mTM.LJII = false;
        c1397580mTM.LIZ(2131838747);
        c1397580mTM.LIZLLL(new AwS103S0201000_19(baseLoginMethod, c1239960iN8, absoluteAdapterPosition, 10));
        C985403tE.LIZ(c1397580mTM, new C1240020iNE(absoluteAdapterPosition, c1239960iN8, baseLoginMethod, strLIZJ, zLJ, context));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static final void onClick$20(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        final BioTranslationViewModel bioTranslationViewModelBp;
        EnumC1248480ias enumC1248480ias;
        String str;
        C1248430ian state;
        C1248430ian state2;
        ((ProfileHeaderSignatureTranslationComponent) aCListenerS85S0300000_19.l0).Fp();
        BioTranslationViewModel bioTranslationViewModelBp2 = ((ProfileHeaderSignatureTranslationComponent) aCListenerS85S0300000_19.l0).Bp();
        if (bioTranslationViewModelBp2 != null && Intrinsics.LJFF(bioTranslationViewModelBp2.getState().LLILZ, C161N.LIZIZ.LLIIZ())) {
            ((ProfileHeaderSignatureTranslationComponent) aCListenerS85S0300000_19.l0).Ip((View) aCListenerS85S0300000_19.l1);
        } else {
            BioTranslationViewModel bioTranslationViewModelBp3 = ((ProfileHeaderSignatureTranslationComponent) aCListenerS85S0300000_19.l0).Bp();
            if (bioTranslationViewModelBp3 != null && bioTranslationViewModelBp3.getState().LLIZLLLIL && (bioTranslationViewModelBp = ((ProfileHeaderSignatureTranslationComponent) aCListenerS85S0300000_19.l0).Bp()) != null) {
                AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19((ProfileHeaderSignatureTranslationComponent) aCListenerS85S0300000_19.l0, 664);
                C161N c161n = C161N.LIZIZ;
                final String strLLIIZ = c161n.LLIIZ();
                if (!Intrinsics.LJFF(bioTranslationViewModelBp.getState().LLILZ, strLLIIZ)) {
                    if (bioTranslationViewModelBp.getState().LLIZ == EnumC1248480ias.ORIGINAL) {
                        if (bioTranslationViewModelBp.getState().LLILZIL != null && Intrinsics.LJFF(bioTranslationViewModelBp.getState().LLILZLL, strLLIIZ)) {
                            bioTranslationViewModelBp.setState(AFwS257S0000000_19.get$arr$(687));
                        } else {
                            final String str2 = bioTranslationViewModelBp.getState().LL;
                            final List<SignatureExtraInfo> list = bioTranslationViewModelBp.getState().LLILLJJLI;
                            Pair pairVQ2 = BioTranslationViewModel.vQ2(str2, list);
                            String str3 = (String) pairVQ2.getFirst();
                            final String str4 = (String) pairVQ2.getSecond();
                            BioTranslationViewModel.vQ2(str2, list);
                            bioTranslationViewModelBp.LL = (C11JF) c161n.LJIIL(str3).LJJJLZIJ(C1701940uOG.LIZIZ()).LJLJI(15L, TimeUnit.SECONDS).LJJLL(new C09JN() { // from class: X.0iMe
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    int length;
                                    String strSubstring;
                                    int iLJJJ;
                                    C1C7U.LIZ("BioTranslationViewModel@f1b4.toggleTranslation$1");
                                    TranslationResult translationResult = (TranslationResult) obj;
                                    if (translationResult != null) {
                                        BioTranslationViewModel bioTranslationViewModel = bioTranslationViewModelBp;
                                        String str5 = str2;
                                        List<SignatureExtraInfo> list2 = list;
                                        String str6 = str4;
                                        String str7 = strLLIIZ;
                                        int i = translationResult.translationStatusCode;
                                        if (i == C163S.LANGUAGE_UNSUPPORTED.getStatusCode()) {
                                            bioTranslationViewModel.setState(AFwS257S0000000_19.get$arr$(684));
                                        } else if (i == C163S.LANGUAGE_SAME.getStatusCode()) {
                                            bioTranslationViewModel.setState(new AwS598S0100000_19(translationResult, 663));
                                        } else {
                                            String str8 = translationResult.translatedContent;
                                            if (str8 != null) {
                                                length = str8.length();
                                            } else {
                                                length = 0;
                                            }
                                            bioTranslationViewModel.getClass();
                                            ArrayList arrayList = new ArrayList();
                                            if (list2 != null) {
                                                int length2 = 0;
                                                for (SignatureExtraInfo signatureExtraInfo : list2) {
                                                    Integer startIndex = signatureExtraInfo.getStartIndex();
                                                    Integer endIndex = signatureExtraInfo.getEndIndex();
                                                    if (startIndex != null && endIndex != null && startIndex.intValue() >= 0 && endIndex.intValue() < str5.length() && (iLJJJ = a0.LJJJ(str6, (strSubstring = str5.substring(startIndex.intValue(), endIndex.intValue() + 1)), length2, false, 4)) != -1) {
                                                        SignatureExtraInfo signatureExtraInfo2 = new SignatureExtraInfo();
                                                        signatureExtraInfo2.setStartIndex(Integer.valueOf(iLJJJ + length));
                                                        signatureExtraInfo2.setEndIndex(Integer.valueOf((r1 + strSubstring.length()) - 1));
                                                        length2 = strSubstring.length() + iLJJJ;
                                                        signatureExtraInfo2.setSecUserId(signatureExtraInfo.getSecUserId());
                                                        signatureExtraInfo2.setUserId(signatureExtraInfo.getUserId());
                                                        arrayList.add(signatureExtraInfo2);
                                                    }
                                                }
                                            }
                                            bioTranslationViewModel.setState(new AwS25S2200000_19(translationResult, (TranslationResult) str6, (String) arrayList, (List<SignatureExtraInfo>) str7, (String) 4));
                                        }
                                    }
                                    C1C7U.LIZIZ("BioTranslationViewModel@f1b4.toggleTranslation$1");
                                }
                            }, new AfS155S0200000_19(awS598S0100000_19, bioTranslationViewModelBp, 16));
                            bioTranslationViewModelBp.setState(AFwS257S0000000_19.get$arr$(686));
                        }
                    } else {
                        bioTranslationViewModelBp.setState(AFwS257S0000000_19.get$arr$(688));
                    }
                }
            }
        }
        ProfileHeaderSignatureTranslationComponent profileHeaderSignatureTranslationComponent = (ProfileHeaderSignatureTranslationComponent) aCListenerS85S0300000_19.l0;
        EnumC1065850dqJ enumC1065850dqJ = (EnumC1065850dqJ) aCListenerS85S0300000_19.l2;
        BioTranslationViewModel bioTranslationViewModelBp4 = profileHeaderSignatureTranslationComponent.Bp();
        if (bioTranslationViewModelBp4 != null && (state2 = bioTranslationViewModelBp4.getState()) != null) {
            enumC1248480ias = state2.LLIZ;
        } else {
            enumC1248480ias = null;
        }
        if (enumC1248480ias == EnumC1248480ias.ORIGINAL) {
            profileHeaderSignatureTranslationComponent.Ep(enumC1065850dqJ);
        } else {
            ClickSeeOriginalInBioEvent clickSeeOriginalInBioEvent = new ClickSeeOriginalInBioEvent();
            String strLLIIZ2 = C161N.LIZIZ.LLIIZ();
            BioTranslationViewModel bioTranslationViewModelBp5 = profileHeaderSignatureTranslationComponent.Bp();
            if (bioTranslationViewModelBp5 != null && (state = bioTranslationViewModelBp5.getState()) != null) {
                str = state.LLILZ;
            } else {
                str = null;
            }
            clickSeeOriginalInBioEvent.LIZ().add(new C0259006v(null, strLLIIZ2, str, profileHeaderSignatureTranslationComponent.getEnterFrom()));
            clickSeeOriginalInBioEvent.LJIIIIZZ();
            if (((Boolean) C1EDI.LIZLLL.getValue()).booleanValue()) {
                profileHeaderSignatureTranslationComponent.Ep(enumC1065850dqJ);
            }
        }
        C0P0T c0p0t = ((ProfileHeaderSignatureTranslationComponent) aCListenerS85S0300000_19.l0).LLJLLIL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
    }

    public static final void onClick$21(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        ((RecoveryPasskeyUpsellFragment) aCListenerS85S0300000_19.l0).QS(2);
        C0XQ5.LIZIZ().bindMobile((C19EG) aCListenerS85S0300000_19.l1, ((RecoveryPasskeyUpsellFragment) aCListenerS85S0300000_19.l0).getEnterFrom(), "click_add_login_method", (Bundle) aCListenerS85S0300000_19.l2, true, new C1266140j3M((RecoveryPasskeyUpsellFragment) aCListenerS85S0300000_19.l0, 2));
    }

    public static final void onClick$22(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        ((RecoveryPasskeyUpsellFragment) aCListenerS85S0300000_19.l0).QS(1);
        C0XQ5.LIZIZ().bindEmail((C19EG) aCListenerS85S0300000_19.l1, ((RecoveryPasskeyUpsellFragment) aCListenerS85S0300000_19.l0).getEnterFrom(), "click_add_login_method", (Bundle) aCListenerS85S0300000_19.l2, true, new C1266140j3M((RecoveryPasskeyUpsellFragment) aCListenerS85S0300000_19.l0, 3));
    }

    public static final void onClick$23(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        ((InterfaceC1258060iqK) aCListenerS85S0300000_19.l0).LJIIJJI(((C1257950iq9) aCListenerS85S0300000_19.l1).LIZ);
        ((C1257500ipQ) aCListenerS85S0300000_19.l2).getClass();
        C1257500ipQ.LJII(view);
        ProfileTabBaseBusiness profileTabBaseBusiness = ((C1257620ipc) ((C1257950iq9) aCListenerS85S0300000_19.l1)).LJIIIZ;
        if (profileTabBaseBusiness != null) {
            profileTabBaseBusiness.st2(view);
        }
        ((C1257500ipQ) aCListenerS85S0300000_19.l2).getTextNavigatorScrollable();
    }

    public static final void onClick$24(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        ((InterfaceC1258060iqK) aCListenerS85S0300000_19.l0).LJIIJJI(((C1257950iq9) aCListenerS85S0300000_19.l1).LIZ);
        ((C1257500ipQ) aCListenerS85S0300000_19.l2).getClass();
        C1257500ipQ.LJII(view);
        ITabBusinessListener iTabBusinessListenerLIZ = ((C1257950iq9) aCListenerS85S0300000_19.l1).LIZ();
        if (iTabBusinessListenerLIZ != null) {
            iTabBusinessListenerLIZ.st2(view);
        }
        ((C1257500ipQ) aCListenerS85S0300000_19.l2).getTextNavigatorScrollable();
    }

    public static final void onClick$25(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        ((C1246760iY6) aCListenerS85S0300000_19.l0).LJIILIIL((View) aCListenerS85S0300000_19.l1, "switch");
        ((Function0) aCListenerS85S0300000_19.l2).invoke();
    }

    public static final void onClick$26(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        ChooseStyleCell chooseStyleCell = (ChooseStyleCell) aCListenerS85S0300000_19.l0;
        boolean z = chooseStyleCell.LLILLJJLI;
        if (z) {
            chooseStyleCell.LLILLJJLI = !z;
            chooseStyleCell.I5().xQ2(((C1220920hsQ) aCListenerS85S0300000_19.l1).LL, ((ChooseStyleCell) aCListenerS85S0300000_19.l0).LLILLJJLI);
            ((C0HZQ) aCListenerS85S0300000_19.l2).setChecked(((ChooseStyleCell) aCListenerS85S0300000_19.l0).LLILLJJLI);
        } else {
            if (!chooseStyleCell.I5().vQ2()) {
                return;
            }
            ChooseStyleCell chooseStyleCell2 = (ChooseStyleCell) aCListenerS85S0300000_19.l0;
            boolean z2 = !chooseStyleCell2.LLILLJJLI;
            chooseStyleCell2.LLILLJJLI = z2;
            ((C0HZQ) aCListenerS85S0300000_19.l2).setChecked(z2);
            ((ChooseStyleCell) aCListenerS85S0300000_19.l0).I5().xQ2(((C1220920hsQ) aCListenerS85S0300000_19.l1).LL, ((ChooseStyleCell) aCListenerS85S0300000_19.l0).LLILLJJLI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$27(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        String uid;
        String aid;
        AwemePagerVM awemePagerVM = (AwemePagerVM) aCListenerS85S0300000_19.l0;
        awemePagerVM.getClass();
        awemePagerVM.setState(new AwS33S0001000_19(0, 19));
        C0P0T c0p0t = ((C1258010iqF) aCListenerS85S0300000_19.l1).LLIZLLLIL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        C1258010iqF c1258010iqF = (C1258010iqF) aCListenerS85S0300000_19.l1;
        String str = c1258010iqF.LLILZ;
        User user = c1258010iqF.LLILZIL;
        String str2 = "";
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        Aweme aweme = ((C1258010iqF) aCListenerS85S0300000_19.l1).LLILZLL;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        String str3 = (String) ((C259800zU) aCListenerS85S0300000_19.l2).element;
        c1253930ijf.getClass();
        C1253930ijf.LJIL(str, uid, str2, "upload_date", str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$28(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        String uid;
        String aid;
        AwemePagerVM awemePagerVM = (AwemePagerVM) aCListenerS85S0300000_19.l0;
        awemePagerVM.getClass();
        awemePagerVM.setState(new AwS33S0001000_19(1, 19));
        C0P0T c0p0t = ((C1258010iqF) aCListenerS85S0300000_19.l1).LLIZLLLIL;
        if (c0p0t != null) {
            c0p0t.dismiss();
        }
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        C1258010iqF c1258010iqF = (C1258010iqF) aCListenerS85S0300000_19.l1;
        String str = c1258010iqF.LLILZ;
        User user = c1258010iqF.LLILZIL;
        String str2 = "";
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        Aweme aweme = ((C1258010iqF) aCListenerS85S0300000_19.l1).LLILZLL;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str2 = aid;
        }
        String str3 = (String) ((C259800zU) aCListenerS85S0300000_19.l2).element;
        c1253930ijf.getClass();
        C1253930ijf.LJIL(str, uid, str2, "most_watched", str3);
    }

    public static final void onClick$3(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        ((C1239960iN8) aCListenerS85S0300000_19.l0).LLILLJJLI.LIZ((BaseLoginMethod) aCListenerS85S0300000_19.l1, ((C1239970iN9) aCListenerS85S0300000_19.l2).getAdapterPosition());
    }

    public static final void onClick$4(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJII(2131824500);
        EmailLinkVerifyFragment emailLinkVerifyFragment = (EmailLinkVerifyFragment) aCListenerS85S0300000_19.l0;
        BaseI18nLoginFragment baseI18nLoginFragment = (BaseI18nLoginFragment) aCListenerS85S0300000_19.l1;
        AvailableWaysViewModel.AvailableWays availableWays = (AvailableWaysViewModel.AvailableWays) aCListenerS85S0300000_19.l2;
        emailLinkVerifyFragment.getClass();
        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) ((ArrayList) C1234920iF0.LIZ(emailLinkVerifyFragment, baseI18nLoginFragment, availableWays)).toArray(new C1247510iZJ[0]);
        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
        c1390850mIV.LIZJ().show(((EmailLinkVerifyFragment) aCListenerS85S0300000_19.l0).getChildFragmentManager(), "OptionalPhonePasswordLoginSheet");
    }

    public static final void onClick$5(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LJII(2131824500);
        EmailOTPLoginCodeVerifyFragment emailOTPLoginCodeVerifyFragment = (EmailOTPLoginCodeVerifyFragment) aCListenerS85S0300000_19.l0;
        BaseI18nLoginFragment baseI18nLoginFragment = (BaseI18nLoginFragment) aCListenerS85S0300000_19.l1;
        AvailableWaysViewModel.AvailableWays availableWays = (AvailableWaysViewModel.AvailableWays) aCListenerS85S0300000_19.l2;
        emailOTPLoginCodeVerifyFragment.getClass();
        C1247510iZJ[] c1247510iZJArr = (C1247510iZJ[]) ((ArrayList) C1234920iF0.LIZ(emailOTPLoginCodeVerifyFragment, baseI18nLoginFragment, availableWays)).toArray(new C1247510iZJ[0]);
        c1390850mIV.LIZIZ((C1247510iZJ[]) Arrays.copyOf(c1247510iZJArr, c1247510iZJArr.length));
        c1390850mIV.LIZJ().show(((EmailOTPLoginCodeVerifyFragment) aCListenerS85S0300000_19.l0).getChildFragmentManager(), "OptionalPhonePasswordLoginSheet");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$6(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        Integer num;
        ((PushSettingFollowListAdapter.FollowItemViewHolder) aCListenerS85S0300000_19.l0).LLJILLL = false;
        C10E1 c10e1M4 = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4();
        User user = (User) aCListenerS85S0300000_19.l1;
        Activity activityLIZ = C1388190mED.LIZ(view.getContext());
        ((PushSettingFollowListAdapter) aCListenerS85S0300000_19.l2).getClass();
        String str = "push_setting";
        String str2 = ((PushSettingFollowListAdapter) aCListenerS85S0300000_19.l2).LLILZ;
        String str3 = null;
        boolean z = false;
        if (SubscribeSettingsExp.LIZIZ()) {
            num = 12;
        } else {
            num = null;
        }
        c10e1M4.LJIILL(new C10ET(user, activityLIZ, str, str2, str3, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, z, null == true ? 1 : 0, num, 1008));
    }

    public static final void onClick$7(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        if (((PushSettingFollowListAdapter) aCListenerS85S0300000_19.l0).LLILZIL) {
            ((PushSettingFollowListAdapter.FollowItemViewHolder) aCListenerS85S0300000_19.l1).LLJILLL = true;
            if (view.getContext() != null) {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(view.getContext(), "aweme://user/profile/");
                smartRouteBuildRoute.withParam("uid", ((User) aCListenerS85S0300000_19.l2).getUid());
                smartRouteBuildRoute.withParam("sec_user_id", ((User) aCListenerS85S0300000_19.l2).getSecUid());
                ((PushSettingFollowListAdapter) aCListenerS85S0300000_19.l0).getClass();
                smartRouteBuildRoute.withParam("enter_from", "push_setting");
                smartRouteBuildRoute.withParam("profile_enterprise_type", C2277881EDy.LIZIZ.getEnterpriseType((User) aCListenerS85S0300000_19.l2));
                smartRouteBuildRoute.open();
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", "click_head");
            c2344009Gk.LJIIIIZZ("enter_method", "live_push_setting");
            c2344009Gk.LJIIIIZZ("to_user_id", ((User) aCListenerS85S0300000_19.l2).getUid());
            c2344009Gk.LIZLLL(System.currentTimeMillis(), "profile_entrance_id");
            C20684815ws.LJIILLIIL("enter_personal_detail", c2344009Gk.LIZ);
            return;
        }
        ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().M4().LIZIZ(view.getContext(), (User) aCListenerS85S0300000_19.l2);
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [X.09AY, kotlin.jvm.functions.Function0] */
    public static final void onClick$8(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        AgsWarningInfo agsWarningInfo = (AgsWarningInfo) aCListenerS85S0300000_19.l0;
        if (agsWarningInfo != null && agsWarningInfo.detailUrl != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(((View) aCListenerS85S0300000_19.l1).getContext(), "//webview");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((AgsWarningInfo) aCListenerS85S0300000_19.l0).detailUrl);
            sbLIZ.append("&enter_from=profile_page_warning_tag");
            smartRouteBuildRoute.withParam("url", C2188811AlT.LIZIZ(sbLIZ));
            smartRouteBuildRoute.withParam("hide_nav_bar", true);
            smartRouteBuildRoute.open();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZJ(((AgsWarningInfo) aCListenerS85S0300000_19.l0).warningLevel, "warning_level");
            AccountAGSWarningProtocol accountAGSWarningProtocol = (AccountAGSWarningProtocol) aCListenerS85S0300000_19.l2;
            String str = ((AgsWarningInfo) aCListenerS85S0300000_19.l0).detailUrl;
            accountAGSWarningProtocol.getClass();
            c2344009Gk.LJIIIIZZ("warning_content", AccountAGSWarningProtocol.LJJLJLI(str));
            C20684815ws.LJIILLIIL("tns_profile_page_ags_warning_tag_click", c2344009Gk.LIZ);
            ?? r0 = ((AccountAGSWarningProtocol) aCListenerS85S0300000_19.l2).LLJJIII;
            if (r0 != 0) {
                r0.invoke();
            }
        }
    }

    public static final void onClick$9(ACListenerS85S0300000_19 aCListenerS85S0300000_19, View view) {
        InterfaceC1631620sYq<Context, View, String, Unit> interfaceC1631620sYq = ((C1249580ice) aCListenerS85S0300000_19.l0).LLILZIL;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(((C127K) aCListenerS85S0300000_19.l1).getContext(), (C127K) aCListenerS85S0300000_19.l1, "profile_center_search");
        }
        C1249650icl c1249650icl = (C1249650icl) aCListenerS85S0300000_19.l2;
        int type = C09YG.TYPE_CLICK.getType();
        C1249580ice c1249580ice = (C1249580ice) aCListenerS85S0300000_19.l0;
        String str = c1249580ice.LLJ;
        List<EventParams> list = c1249580ice.LLJI;
        c1249650icl.getClass();
        if (list != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0W3A(list, type, str, c1249650icl, null), 3);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS85S0300000_19(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r2, X.C1241350iPN r3, com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchUserCell r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 15: goto L10;
                case 16: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS85S0300000_19.<init>(com.ss.android.ugc.aweme.im.contacts.api.model.IMUser, X.0iPN, com.ss.android.ugc.aweme.inbox.search.view.cell.InboxSearchUserCell, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS85S0300000_19(X.C1239970iN9 r2, X.C1239960iN8 r3, com.ss.android.ugc.aweme.account.model.BaseLoginMethod r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 2 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS85S0300000_19.<init>(X.0iN9, X.0iN8, com.ss.android.ugc.aweme.account.model.BaseLoginMethod, int):void");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS85S0300000_19(com.ss.android.ugc.aweme.profile.model.User r2, com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter.FollowItemViewHolder r3, com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 6 - r5
            if (r5 == 0) goto L11
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.l2 = r2
        Ld:
            r0.<init>()
            return
        L11:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS85S0300000_19.<init>(com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter$FollowItemViewHolder, com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter, int):void");
    }

    public ACListenerS85S0300000_19(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
