package Y;

import X.AbstractC1086230eNB;
import X.AbstractC1096120ed8;
import X.C0IJT;
import X.C1080530eDz;
import X.C1080860eEW;
import X.C1083540eIq;
import X.C1085120eLO;
import X.C1087880ePq;
import X.C1087890ePr;
import X.C1091250eVH;
import X.C1095930ecp;
import X.C1096340edU;
import X.C1099190ei5;
import X.C1099230ei9;
import X.C1099390eiP;
import X.C1120350fGD;
import X.C1120360fGE;
import X.C1120370fGF;
import X.C1120390fGH;
import X.C1120420fGK;
import X.C1124290fMZ;
import X.C1135030fdt;
import X.C1135810ff9;
import X.C1143680frq;
import X.C1143920fsE;
import X.C1144530ftD;
import X.C1144580ftI;
import X.C1144910ftp;
import X.C1145600fuw;
import X.C1145620fuy;
import X.C1146010fvb;
import X.C1146260fw0;
import X.C1146270fw1;
import X.C1149320g0w;
import X.C1151780g4u;
import X.C118300cf;
import X.C1295960jpS;
import X.C12ES;
import X.C1324720kZq;
import X.C1338270kvh;
import X.C13LP;
import X.C16F5;
import X.C1819620xS4;
import X.C1CC2;
import X.C20441214yg;
import X.C20600815jK;
import X.C20736316Cj;
import X.C425250Glv;
import X.C430340Gu8;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C917350Zyn;
import X.C930540aK4;
import X.C930940aKi;
import X.C970370bMJ;
import X.C973660bRc;
import X.EnumC1096020ecy;
import X.EnumC1135050fdv;
import X.EnumC919170a1j;
import X.InterfaceC1891350zJl;
import X.InterfaceC500940Jki;
import X.InterfaceC973730bRj;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.mask.common.BigFlyingGiftPathWidget;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.enteranim.MatchItemEnterAnimAssem;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.GiftAnchorPanelRecordPageCenterAssem;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.record.center.list.AnchorRecordEmptyCell;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.landscape.widget.LiveNewGiftBottomWidget;
import com.bytedance.android.livesdk.goody_bag.model.GoodyBagBaseInfo;
import com.bytedance.android.livesdk.impl.revenue.goodybag.widget.GoodyBagWidget;
import com.bytedance.android.livesdk.livesetting.LiveClearScreenFollowShrinkEndOptSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubFollowShrinkAnimEnableSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.android.livesdk.model.BorderInfo;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.android.livesdk.shorttouch.ui.PortraitShortTouchPreviewWidget;
import com.bytedance.android.livesdk.userinfowidget.ClearScreenUserInfoWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class ALAdapterS12S0200000_17 extends AnimatorListenerAdapter {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onAnimationCancel$5(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationCancel$0(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationCancel$1(this, animator);
                break;
            case 19:
                onAnimationCancel$2(this, animator);
                break;
            case 27:
                onAnimationCancel$3(this, animator);
                break;
            case 30:
                onAnimationCancel$4(this, animator);
                break;
            case 37:
                onAnimationCancel$5(this, animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws Throwable {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            case 2:
                onAnimationEnd$2(this, animator);
                break;
            case 3:
                onAnimationEnd$3(this, animator);
                break;
            case 4:
                onAnimationEnd$4(this, animator);
                break;
            case 5:
                onAnimationEnd$5(this, animator);
                break;
            case 6:
                onAnimationEnd$6(this, animator);
                break;
            case 7:
                onAnimationEnd$7(this, animator);
                break;
            case 8:
                onAnimationEnd$8(this, animator);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onAnimationEnd$9(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onAnimationEnd$10(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationEnd$11(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationEnd$12(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationEnd$13(this, animator);
                break;
            case 14:
                onAnimationEnd$14(this, animator);
                break;
            case 15:
                onAnimationEnd$15(this, animator);
                break;
            case 16:
                onAnimationEnd$16(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationEnd$17(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationEnd$18(this, animator);
                break;
            case 19:
                onAnimationEnd$19(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onAnimationEnd$20(this, animator);
                break;
            case 21:
                onAnimationEnd$21(this, animator);
                break;
            case 22:
                onAnimationEnd$22(this, animator);
                break;
            case 23:
                onAnimationEnd$23(this, animator);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                onAnimationEnd$24(this, animator);
                break;
            case 25:
                onAnimationEnd$25(this, animator);
                break;
            case 26:
                onAnimationEnd$26(this, animator);
                break;
            case 27:
                onAnimationEnd$27(this, animator);
                break;
            case 28:
                onAnimationEnd$28(this, animator);
                break;
            case 29:
                onAnimationEnd$29(this, animator);
                break;
            case 30:
                onAnimationEnd$30(this, animator);
                break;
            case 31:
                onAnimationEnd$31(this, animator);
                break;
            case 32:
                onAnimationEnd$32(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationEnd$33(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                onAnimationEnd$34(this, animator);
                break;
            case 35:
                onAnimationEnd$35(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationEnd$36(this, animator);
                break;
            case 37:
                onAnimationEnd$37(this, animator);
                break;
            case 38:
                onAnimationEnd$38(this, animator);
                break;
            case 39:
                onAnimationEnd$39(this, animator);
                break;
            case 40:
                onAnimationEnd$40(this, animator);
                break;
            case 41:
            default:
                super.onAnimationEnd(animator);
                break;
            case 42:
                onAnimationEnd$41(this, animator);
                break;
            case 43:
                onAnimationEnd$42(this, animator);
                break;
            case 44:
                onAnimationEnd$43(this, animator);
                break;
            case 45:
                onAnimationEnd$44(this, animator);
                break;
            case 46:
                onAnimationEnd$45(this, animator);
                break;
            case 47:
                onAnimationEnd$46(this, animator);
                break;
            case 48:
                onAnimationEnd$47(this, animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) throws Throwable {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case 16:
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
            case 21:
            case 23:
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
            case 25:
            case 27:
            case 30:
            case 31:
            case 32:
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
            case 35:
            case 38:
            case 39:
            case 42:
            case 43:
            case 47:
            default:
                super.onAnimationStart(animator);
                break;
            case 3:
                super.onAnimationStart(animator);
                break;
            case 4:
                onAnimationStart$2(this, animator);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onAnimationStart$3(this, animator);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onAnimationStart$4(this, animator);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onAnimationStart$5(this, animator);
                break;
            case 14:
                onAnimationStart$6(this, animator);
                break;
            case 15:
                onAnimationStart$7(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onAnimationStart$8(this, animator);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onAnimationStart$9(this, animator);
                break;
            case 19:
                onAnimationStart$10(this, animator);
                break;
            case 22:
                onAnimationStart$11(this, animator);
                break;
            case 26:
                onAnimationStart$12(this, animator);
                break;
            case 28:
                onAnimationStart$13(this, animator);
                break;
            case 29:
                onAnimationStart$14(this, animator);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                onAnimationStart$15(this, animator);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                onAnimationStart$16(this, animator);
                break;
            case 37:
                onAnimationStart$17(this, animator);
                break;
            case 40:
                onAnimationStart$18(this, animator);
                break;
            case 41:
                onAnimationStart$19(this, animator);
                break;
            case 44:
                onAnimationStart$20(this, animator);
                break;
            case 45:
                onAnimationStart$21(this, animator);
                break;
            case 46:
                onAnimationStart$22(this, animator);
                break;
            case 48:
                onAnimationStart$23(this, animator);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (27 - this.$t != 0) {
            super.onAnimationStart(animator, z);
        } else {
            onAnimationStart$0(this, animator, z);
        }
    }

    public final void LIZ$0(C1144580ftI c1144580ftI) {
        Long lValueOf;
        int i;
        int i2;
        Long lValueOf2;
        String string;
        String str;
        String str2;
        List<Long> list;
        Long lValueOf3;
        BattleUserArmy userInfo;
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        Long lValueOf4 = null;
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        Iterator<C1146270fw1> it2 = ((C1146260fw0) this.l1).LLLFZ.iterator();
        int i3 = 0;
        while (true) {
            if (it2.hasNext()) {
                C1146270fw1 next = it2.next();
                if (next != null && (userInfo = next.getUserInfo()) != null) {
                    lValueOf3 = Long.valueOf(userInfo.userId);
                } else {
                    lValueOf3 = null;
                }
                if (Intrinsics.LJFF(lValueOf3, lValueOf)) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i3 = -1;
                break;
            }
        }
        int i4 = i3 + 1;
        if (c1144580ftI != null && (list = c1144580ftI.LIZIZ) != null && C13LP.LJJJJ(lValueOf, list)) {
            i = 1;
        } else {
            i = 0;
        }
        C973660bRc c973660bRc = C973660bRc.LIZ;
        if (c1144580ftI != null) {
            i2 = c1144580ftI.LIZJ;
        } else {
            i2 = 0;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C973660bRc.LJIIZILJ(c973660bRc, linkedHashMap, false, false, null, 14);
        C973660bRc.LJJIIJZLJL(linkedHashMap);
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            lValueOf2 = Long.valueOf(interfaceC973730bRjYf2.LJJL());
        } else {
            lValueOf2 = null;
        }
        linkedHashMap.put("channel_id", String.valueOf(lValueOf2));
        InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf22 != null) {
            lValueOf4 = Long.valueOf(interfaceC973730bRjYf22.LJJJJJL());
        }
        linkedHashMap.put("pk_id", String.valueOf(lValueOf4));
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        if (interfaceC500940JkiUser2 == null || (string = Long.valueOf(interfaceC500940JkiUser2.getCurrentUserId()).toString()) == null) {
            string = "";
        }
        linkedHashMap.put("user_id", string);
        String str3 = C973660bRc.LJJII;
        if (C973660bRc.LJLLLL()) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put(str3, str);
        linkedHashMap.put("is_card_receiver", String.valueOf(i));
        linkedHashMap.put("mvp_ranking", String.valueOf(i4));
        if (i2 == 1) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_league_match_extra", str2);
        C973660bRc.LJIJ(c973660bRc, linkedHashMap, false, false, false, 12);
        C1144530ftD.LIZ(c973660bRc, linkedHashMap);
        String strLIZIZ = (String) ((LinkedHashMap) C973660bRc.LJLJLLL).get("sub_match_type");
        if (strLIZIZ == null) {
            C917350Zyn c917350Zyn = EnumC919170a1j.Companion;
            EnumC919170a1j enumC919170a1jXB0 = C915980Zwa.LJFF().xB0();
            int size = C915980Zwa.LJII().LLILZLL(true).size();
            c917350Zyn.getClass();
            strLIZIZ = C917350Zyn.LIZIZ(enumC919170a1jXB0, size);
        }
        if (C970370bMJ.LJII()) {
            C973660bRc.LJZ(c973660bRc, "livesdk_mvp_get_match_item_room_notice_click", linkedHashMap, strLIZIZ);
        } else {
            C973660bRc.LJZI(c973660bRc, "livesdk_mvp_get_match_item_room_notice_click", linkedHashMap, strLIZIZ);
        }
    }

    public static final void onAnimationCancel$0(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((BigFlyingGiftPathWidget) aLAdapterS12S0200000_17.l0).getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        ((C1295960jpS) aLAdapterS12S0200000_17.l1).removeAnimatorListener(aLAdapterS12S0200000_17);
        super.onAnimationCancel(animator);
        C930540aK4.LJJIJL((C1295960jpS) aLAdapterS12S0200000_17.l1);
        ((BigFlyingGiftPathWidget) aLAdapterS12S0200000_17.l0).LLILZIL.remove((C1295960jpS) aLAdapterS12S0200000_17.l1);
    }

    public static final void onAnimationCancel$1(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ViewGroup viewGroup = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup != null) {
            C786410Ut5.Gc(0.0f, viewGroup);
        }
        ViewGroup viewGroup2 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup2 != null) {
            C786410Ut5.bd(0.0f, viewGroup2);
        }
        ViewGroup viewGroup3 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup3 != null) {
            C786410Ut5.R4(1.0f, viewGroup3);
        }
        ViewGroup viewGroup4 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup4 != null) {
            C786410Ut5.Lb(1.0f, viewGroup4);
        }
        ViewGroup viewGroup5 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup5 != null) {
            C786410Ut5.mc(1.0f, viewGroup5);
        }
        ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).hide();
        ViewGroup viewGroup6 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup6 != null) {
            C786410Ut5.LJJJJI(viewGroup6);
        }
        ((AnimatorListenerAdapter) aLAdapterS12S0200000_17.l1).onAnimationCancel(animator);
    }

    public static final void onAnimationCancel$2(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((C1099230ei9) aLAdapterS12S0200000_17.l0).LJIILLIIL.invoke();
    }

    public static final void onAnimationCancel$3(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationCancel(animator);
        C1135030fdt c1135030fdt = (C1135030fdt) aLAdapterS12S0200000_17.l0;
        c1135030fdt.LLJJJIL = null;
        c1135030fdt.LLJILLL = EnumC1135050fdv.HIDE;
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS12S0200000_17.l1);
        C786410Ut5.T4((View) aLAdapterS12S0200000_17.l1, 1.0f);
        C1135810ff9 c1135810ff9Poll = ((C1135030fdt) aLAdapterS12S0200000_17.l0).LLJJI.poll();
        if (c1135810ff9Poll != null) {
            ((C1135030fdt) aLAdapterS12S0200000_17.l0).LJIIIIZZ(c1135810ff9Poll);
        }
    }

    public static final void onAnimationCancel$4(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationCancel(animator);
        ((AnimatorSet) aLAdapterS12S0200000_17.l0).removeAllListeners();
        C786410Ut5.Ob((View) aLAdapterS12S0200000_17.l1, 1.0f);
        C786410Ut5.pc((View) aLAdapterS12S0200000_17.l1, 1.0f);
    }

    public static final void onAnimationEnd$0(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((BigFlyingGiftPathWidget) aLAdapterS12S0200000_17.l0).getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        ((C1295960jpS) aLAdapterS12S0200000_17.l1).removeAnimatorListener(aLAdapterS12S0200000_17);
        super.onAnimationEnd(animator);
        C930540aK4.LJJIJL((C1295960jpS) aLAdapterS12S0200000_17.l1);
        ((BigFlyingGiftPathWidget) aLAdapterS12S0200000_17.l0).LLILZIL.remove((C1295960jpS) aLAdapterS12S0200000_17.l1);
    }

    public static final void onAnimationEnd$1(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C1145620fuy c1145620fuy;
        FrameLayout frameLayout;
        AppCompatImageView appCompatImageView;
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (((C1145600fuw) aLAdapterS12S0200000_17.l0).LIZ instanceof C1144910ftp) {
            View view = (View) aLAdapterS12S0200000_17.l1;
            if ((view instanceof C1145620fuy) && (c1145620fuy = (C1145620fuy) view) != null && (frameLayout = c1145620fuy.LLJJIJIIJIL) != null && (appCompatImageView = c1145620fuy.LLILLL) != null) {
                c1145620fuy.LLJJIJI = new C1324720kZq(c1145620fuy.getContext());
                C1324720kZq c1324720kZq = c1145620fuy.LLJJIJI;
                if (c1324720kZq != null) {
                    if (c1145620fuy.LLJJI) {
                        f5 = 30.0f;
                    } else {
                        f5 = 32.0f;
                    }
                    int iLIZIZ = (int) C497740JfY.LIZIZ(f5);
                    if (c1145620fuy.LLJJI) {
                        f6 = 1.0f;
                    } else {
                        f6 = 2.0f;
                    }
                    C786410Ut5.W5(c1324720kZq, C425250Glv.LIZ(appCompatImageView, frameLayout, iLIZIZ, -((int) C497740JfY.LIZIZ(f6)), true));
                }
                frameLayout.addView(c1145620fuy.LLJJIJI);
                C1143680frq.LJFF(c1145620fuy.LLJJIJI, "tiktok_live_interaction_demand_16", "seat_top2_animation.webp", ImageView.ScaleType.CENTER_INSIDE, new C1151780g4u(c1145620fuy, 2));
                c1145620fuy.LLJJIII = new C1324720kZq(frameLayout.getContext());
                C1324720kZq c1324720kZq2 = c1145620fuy.LLJJIII;
                if (c1324720kZq2 != null) {
                    if (c1145620fuy.LLJJI) {
                        f = 12.0f;
                    } else {
                        f = 14.0f;
                    }
                    int iLIZIZ2 = (int) C497740JfY.LIZIZ(f);
                    if (c1145620fuy.LLJJI) {
                        f2 = 21.0f;
                    } else {
                        f2 = 25.0f;
                    }
                    int iLIZIZ3 = (int) C497740JfY.LIZIZ(f2);
                    if (c1145620fuy.LLJJI) {
                        f3 = 9.7f;
                    } else {
                        f3 = 11.0f;
                    }
                    int iLIZIZ4 = (int) C497740JfY.LIZIZ(f3);
                    if (c1145620fuy.LLJJI) {
                        f4 = 7.3f;
                    } else {
                        f4 = 9.1f;
                    }
                    C786410Ut5.W5(c1324720kZq2, C425250Glv.LIZJ(appCompatImageView, frameLayout, iLIZIZ2, iLIZIZ3, iLIZIZ4, (int) C497740JfY.LIZIZ(f4), true));
                }
                frameLayout.addView(c1145620fuy.LLJJIII);
                C1324720kZq c1324720kZq3 = c1145620fuy.LLJJIII;
                if ((c1324720kZq3 instanceof C1324720kZq) && c1324720kZq3 != null) {
                    int i2 = c1145620fuy.LLJILJILJ;
                    if (i2 != 2 && i2 == 3) {
                        i = R.drawable.ez_;
                    } else {
                        i = R.drawable.eza;
                    }
                    c1324720kZq3.setActualImageResource(i);
                }
                C500260Jjc.LJIILLIIL(c1145620fuy.LLJJIII);
            }
        }
    }

    public static final void onAnimationEnd$10(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((C1120360fGE) aLAdapterS12S0200000_17.l0).LLILLL.remove((C1120420fGK) aLAdapterS12S0200000_17.l1);
    }

    public static final void onAnimationEnd$11(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ViewGroup viewGroup = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup != null) {
            C786410Ut5.Gc(0.0f, viewGroup);
        }
        ViewGroup viewGroup2 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup2 != null) {
            C786410Ut5.bd(0.0f, viewGroup2);
        }
        ViewGroup viewGroup3 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup3 != null) {
            C786410Ut5.R4(1.0f, viewGroup3);
        }
        ViewGroup viewGroup4 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup4 != null) {
            C786410Ut5.Lb(1.0f, viewGroup4);
        }
        ViewGroup viewGroup5 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup5 != null) {
            C786410Ut5.mc(1.0f, viewGroup5);
        }
        ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).hide();
        ViewGroup viewGroup6 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup6 != null) {
            C786410Ut5.LJJJJI(viewGroup6);
        }
        ((AnimatorListenerAdapter) aLAdapterS12S0200000_17.l1).onAnimationEnd(animator);
    }

    public static final void onAnimationEnd$12(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        if (LiveClearScreenFollowShrinkEndOptSetting.INSTANCE.enable()) {
            C1096340edU c1096340edU = ((ClearScreenUserInfoWidget) aLAdapterS12S0200000_17.l1).LLLZ;
            if (c1096340edU != null) {
                c1096340edU.LJ();
                return;
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((ClearScreenUserInfoWidget) aLAdapterS12S0200000_17.l1).LLLIIII.getLayoutParams();
        layoutParams.width = -2;
        layoutParams.height = -2;
        C786410Ut5.X5(layoutParams, ((ClearScreenUserInfoWidget) aLAdapterS12S0200000_17.l1).LLLIIII);
        GradientDrawable gradientDrawable = (GradientDrawable) aLAdapterS12S0200000_17.l0;
        if (gradientDrawable != null) {
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(13.5f));
        }
        C1096340edU c1096340edU2 = ((ClearScreenUserInfoWidget) aLAdapterS12S0200000_17.l1).LLLZ;
        if (c1096340edU2 != null) {
            c1096340edU2.LJ();
        }
        C500260Jjc.LJIILIIL(((ClearScreenUserInfoWidget) aLAdapterS12S0200000_17.l1).LLLIIII);
    }

    public static final void onAnimationEnd$13(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        AnimatedDrawable2 animatedDrawable2;
        if (!((LiveRoomUserInfoWidget) aLAdapterS12S0200000_17.l1).isDestroyed && (animatedDrawable2 = (AnimatedDrawable2) aLAdapterS12S0200000_17.l0) != null) {
            animatedDrawable2.start();
        }
    }

    public static final void onAnimationEnd$14(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C1295960jpS c1295960jpS = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLIZLLLIL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
    }

    public static final void onAnimationEnd$15(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        int width;
        C118300cf c118300cf = (C118300cf) aLAdapterS12S0200000_17.l1;
        TextView textView = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLILZLL;
        if (textView != null) {
            width = textView.getWidth();
        } else {
            width = 0;
        }
        c118300cf.element = width;
        TextView textView2 = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLIZ;
        if (textView2 != null) {
            C786410Ut5.LLIL(textView2, 8);
        }
    }

    public static final void onAnimationEnd$16(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ConstraintProperty constraintProperty = (ConstraintProperty) aLAdapterS12S0200000_17.l0;
        constraintProperty.margin(7, ((C1080530eDz) ((LayeredElementContext) aLAdapterS12S0200000_17.l1)).LJIIL);
        constraintProperty.apply();
    }

    public static final void onAnimationEnd$17(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((ConstraintProperty) aLAdapterS12S0200000_17.l0).alpha(0.0f);
        ((ConstraintProperty) aLAdapterS12S0200000_17.l0).translationY(((LayeredElementContext) aLAdapterS12S0200000_17.l1).getContainer().getHeight());
    }

    public static final void onAnimationEnd$18(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((ConstraintProperty) aLAdapterS12S0200000_17.l0).alpha(0.0f);
        ((ConstraintProperty) aLAdapterS12S0200000_17.l0).translationY(((LayeredElementContext) aLAdapterS12S0200000_17.l1).getContainer().getHeight());
    }

    public static final void onAnimationEnd$19(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C12ES.LJIILL(0, ((C1099230ei9) aLAdapterS12S0200000_17.l0).LJIIJJI);
        C12ES.LJIILL(4, (ViewGroup) aLAdapterS12S0200000_17.l1);
    }

    public static final void onAnimationEnd$2(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C20600815jK<InterfaceC1891350zJl> state;
        super.onAnimationEnd(animator);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = ((GiftAnchorPanelRecordPageCenterAssem) aLAdapterS12S0200000_17.l0).LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(((C1146010fvb) aLAdapterS12S0200000_17.l1).LIZ, null);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = ((GiftAnchorPanelRecordPageCenterAssem) aLAdapterS12S0200000_17.l0).LLJJJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.scrollToPosition(0);
        }
    }

    public static final void onAnimationEnd$20(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((C1099230ei9) aLAdapterS12S0200000_17.l0).LJIILJJIL.invoke();
        ((C1099230ei9) aLAdapterS12S0200000_17.l0).LJIILLIIL.invoke();
        C12ES.LJIILL(8, (FrameLayout) aLAdapterS12S0200000_17.l1);
        ViewGroup viewGroup = ((C1099230ei9) aLAdapterS12S0200000_17.l0).LJI;
        if (viewGroup != null) {
            viewGroup.setBackgroundResource(R.drawable.e_u);
        }
        ((C1099230ei9) aLAdapterS12S0200000_17.l0).LIZIZ();
    }

    public static final void onAnimationEnd$21(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ViewGroup viewGroup;
        C1099190ei5 c1099190ei5 = (C1099190ei5) aLAdapterS12S0200000_17.l0;
        View view = c1099190ei5.LJIILL;
        if (view != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(view, viewGroup);
            }
            c1099190ei5.LJIILL = null;
        }
        ((C1099190ei5) aLAdapterS12S0200000_17.l0).LIZ((Function0) aLAdapterS12S0200000_17.l1);
    }

    public static final void onAnimationEnd$22(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        if (LiveFansClubFollowShrinkAnimEnableSetting.INSTANCE.getValue() && ((View) aLAdapterS12S0200000_17.l0) != null) {
            C1096340edU c1096340edU = (C1096340edU) aLAdapterS12S0200000_17.l1;
            c1096340edU.LJJIJLIJ = new ARunnableS117S0100000_17(aLAdapterS12S0200000_17, 209);
            HandlerHook.viewPost((View) aLAdapterS12S0200000_17.l0, c1096340edU.LJJIJLIJ);
            return;
        }
        ((C1096340edU) aLAdapterS12S0200000_17.l1).LIZ(EnumC1096020ecy.FANS_CLUB_UNJOIN_ANIM);
    }

    public static final void onAnimationEnd$23(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1099390eiP c1099390eiP = (C1099390eiP) aLAdapterS12S0200000_17.l0;
        c1099390eiP.LJIILLIIL = false;
        View view = c1099390eiP.LJFF;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = c1099390eiP.LJIILJJIL;
            } else {
                layoutParams = null;
            }
            C786410Ut5.W5(view, layoutParams);
        }
        ((C1099390eiP) aLAdapterS12S0200000_17.l0).LIZ(8);
        C786410Ut5.F8(((C1099390eiP) aLAdapterS12S0200000_17.l0).LJ, null);
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$24(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C1819620xS4.LIZ().LJIIIZ(((BorderInfo) aLAdapterS12S0200000_17.l0).icon).LJJI(((C1099390eiP) aLAdapterS12S0200000_17.l1).LJII);
    }

    public static final void onAnimationEnd$25(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C12ES.LJIILL(8, ((LiveRoomUserInfoWidget) aLAdapterS12S0200000_17.l1).LLLLII);
        C12ES.LJIILL(8, (FrameLayout) aLAdapterS12S0200000_17.l0);
        C12ES.LJIILL(8, ((LiveRoomUserInfoWidget) aLAdapterS12S0200000_17.l1).LLLLIIL);
        C12ES.LJIILL(0, ((LiveRoomUserInfoWidget) aLAdapterS12S0200000_17.l1).LLLIIII);
        ((LiveRoomUserInfoWidget) aLAdapterS12S0200000_17.l1).t2();
        LiveRoomUserInfoWidget liveRoomUserInfoWidget = (LiveRoomUserInfoWidget) aLAdapterS12S0200000_17.l1;
        liveRoomUserInfoWidget.K = null;
        liveRoomUserInfoWidget.L = null;
        liveRoomUserInfoWidget.M = null;
        liveRoomUserInfoWidget.N = null;
        liveRoomUserInfoWidget.f326O = null;
    }

    public static final void onAnimationEnd$26(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        boolean zBooleanValue;
        String str;
        String string;
        FollowInfo followInfo;
        String string2;
        GoodyBagBaseInfo goodyBagBaseInfoLIZ = ((GoodyBagWidget) aLAdapterS12S0200000_17.l0).x1().LIZ();
        Boolean boolValueOf = Boolean.valueOf(((GoodyBagWidget) aLAdapterS12S0200000_17.l0).x1().isAnchor());
        HashMap map = new HashMap(11);
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        map.put("is_anchor", String.valueOf(zBooleanValue));
        String str2 = "";
        if (goodyBagBaseInfoLIZ == null || (str = goodyBagBaseInfoLIZ.goodyBagId) == null) {
            str = "";
        }
        map.put("goody_bag_id", str);
        if (goodyBagBaseInfoLIZ == null || (string = Integer.valueOf(goodyBagBaseInfoLIZ.biz).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("goody_bag_type", string);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null && (string2 = Long.valueOf(followInfo.getFollowStatus()).toString()) != null) {
                str2 = string2;
            }
            map.put("follow_status", str2);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_short_touch_finish");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
        C1CC2.LJII(0, "ttlive_goody_bag_short_touch_finish", map);
    }

    public static final void onAnimationEnd$27(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1135030fdt c1135030fdt = (C1135030fdt) aLAdapterS12S0200000_17.l0;
        c1135030fdt.LLJJJIL = null;
        c1135030fdt.LLJILLL = EnumC1135050fdv.HIDE;
        C786410Ut5.LJLLLLLL(8, (View) aLAdapterS12S0200000_17.l1);
        C786410Ut5.T4((View) aLAdapterS12S0200000_17.l1, 1.0f);
        C1135810ff9 c1135810ff9Poll = ((C1135030fdt) aLAdapterS12S0200000_17.l0).LLJJI.poll();
        if (c1135810ff9Poll != null) {
            ((C1135030fdt) aLAdapterS12S0200000_17.l0).LJIIIIZZ(c1135810ff9Poll);
        }
    }

    public static final void onAnimationEnd$28(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((C1124290fMZ) aLAdapterS12S0200000_17.l0).LLJL;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        ImageView imageView = ((C1124290fMZ) aLAdapterS12S0200000_17.l0).LLJLIL;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$29(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((C1124290fMZ) aLAdapterS12S0200000_17.l0).LLJJLIIIJLLLLLLLZ;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        ImageView imageView = ((C1124290fMZ) aLAdapterS12S0200000_17.l0).LLJJL;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$3(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((LiveNewGiftBottomWidget) aLAdapterS12S0200000_17.l0).LLJJI;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        ImageView imageView = ((LiveNewGiftBottomWidget) aLAdapterS12S0200000_17.l0).LLJ;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$30(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((AnimatorSet) aLAdapterS12S0200000_17.l0).removeAllListeners();
        C786410Ut5.Ob((View) aLAdapterS12S0200000_17.l1, 1.0f);
        C786410Ut5.pc((View) aLAdapterS12S0200000_17.l1, 1.0f);
    }

    public static final void onAnimationEnd$31(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C786410Ut5.Db((LiveIconView) aLAdapterS12S0200000_17.l0, 0.0f);
        ((AnchorRecordEmptyCell) aLAdapterS12S0200000_17.l1).LLILZIL = null;
    }

    public static final void onAnimationEnd$32(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((MatchItemEnterAnimAssem) aLAdapterS12S0200000_17.l0).Ho((ItemInfo4FE) aLAdapterS12S0200000_17.l1);
    }

    public static final void onAnimationEnd$33(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C1091250eVH c1091250eVH;
        Function0 function0 = (Function0) aLAdapterS12S0200000_17.l0;
        if (function0 != null) {
            function0.invoke();
        }
        View view = (View) aLAdapterS12S0200000_17.l1;
        if ((view instanceof C1091250eVH) && (c1091250eVH = (C1091250eVH) view) != null) {
            c1091250eVH.setEnableFixedSize(true);
        }
    }

    public static final void onAnimationEnd$34(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((C1295960jpS) aLAdapterS12S0200000_17.l0).removeAnimatorListener(aLAdapterS12S0200000_17);
        C1087880ePq c1087880ePq = (C1087880ePq) aLAdapterS12S0200000_17.l1;
        C1295960jpS c1295960jpS = (C1295960jpS) aLAdapterS12S0200000_17.l0;
        c1087880ePq.getClass();
        C786410Ut5.LLD(4, c1295960jpS);
        if (c1087880ePq.LIZ.size() >= 5) {
            C786410Ut5.LJJJLZIJ(c1295960jpS, c1087880ePq.LIZIZ.LIZLLL);
        } else {
            c1087880ePq.LIZ.add(c1295960jpS);
        }
    }

    public static final void onAnimationEnd$35(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((ConstraintProperty) aLAdapterS12S0200000_17.l0).removeConstraints(4);
        ConstraintProperty constraintProperty = (ConstraintProperty) aLAdapterS12S0200000_17.l0;
        constraintProperty.connect(4, R.id.kwc, 3, ((C1080860eEW) aLAdapterS12S0200000_17.l1).LL.LIZLLL);
        constraintProperty.apply();
    }

    public static final void onAnimationEnd$36(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) throws Throwable {
        super.onAnimationEnd(animator);
        if (!((C1085120eLO) aLAdapterS12S0200000_17.l0).LIZIZ) {
            ((ConstraintProperty) aLAdapterS12S0200000_17.l1).forceHasOverlappingRenderingCompat(true);
        } else {
            ((ConstraintProperty) aLAdapterS12S0200000_17.l1).visibility(4);
        }
    }

    public static final void onAnimationEnd$37(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C786410Ut5.T4(((RecyclerView.ViewHolder) aLAdapterS12S0200000_17.l1).itemView, 1.0f);
        ((C1149320g0w) aLAdapterS12S0200000_17.l0).LJJIIJ((RecyclerView.ViewHolder) aLAdapterS12S0200000_17.l1);
    }

    public static final void onAnimationEnd$38(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C430340Gu8 c430340Gu8 = ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJIL;
        if (c430340Gu8 != null) {
            C786410Ut5.sd(c430340Gu8, 0.0f);
        }
        ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJJIIJ(true);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJIL);
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$39(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1143920fsE c1143920fsE = ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJJJIL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZ();
        }
        C1095930ecp c1095930ecp = (C1095930ecp) aLAdapterS12S0200000_17.l0;
        c1095930ecp.LJJJIL = null;
        C12ES.LJIILL(0, c1095930ecp.LJIIIZ);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJIILL);
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$4(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C1295960jpS c1295960jpS = ((LiveNewGiftBottomWidget) aLAdapterS12S0200000_17.l0).LLJJ;
        if (c1295960jpS != null) {
            C786410Ut5.LLD(8, c1295960jpS);
        }
        ImageView imageView = ((LiveNewGiftBottomWidget) aLAdapterS12S0200000_17.l0).LLIZLLLIL;
        if (imageView != null) {
            C786410Ut5.LJZI(0, imageView);
        }
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$40(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$41(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        AbstractC1096120ed8 abstractC1096120ed8 = (AbstractC1096120ed8) aLAdapterS12S0200000_17.l0;
        C16F5 c16f5 = (C16F5) aLAdapterS12S0200000_17.l1;
        abstractC1096120ed8.getClass();
        AbstractC1096120ed8.LJIIZILJ(4, c16f5);
        C16F5 c16f52 = (C16F5) aLAdapterS12S0200000_17.l1;
        if (c16f52 != null) {
            c16f52.setSelected(false);
        }
        C16F5 c16f53 = (C16F5) aLAdapterS12S0200000_17.l1;
        if (c16f53 != null) {
            c16f53.setEllipsize(null);
        }
    }

    public static final void onAnimationEnd$42(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJIJI);
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$43(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$44(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    public static final void onAnimationEnd$45(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationEnd(animator);
        C430340Gu8 c430340Gu8 = ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJIILJJIL;
        if (c430340Gu8 != null) {
            C786410Ut5.sd(c430340Gu8, 1.0f);
        }
        C430340Gu8 c430340Gu82 = ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJIILIIL;
        if (c430340Gu82 != null) {
            C786410Ut5.sd(c430340Gu82, 1.0f);
        }
        C12ES.LJIILL(8, ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJIILJJIL);
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJIILIIL);
        ((Function0) aLAdapterS12S0200000_17.l1).invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[PHI: r1
      0x003e: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v3 java.lang.String) binds: [B:16:0x003c, B:14:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationEnd$46(Y.ALAdapterS12S0200000_17 r2, android.animation.Animator r3) {
        /*
            super.onAnimationEnd(r3)
            java.lang.Object r0 = r2.l0
            X.00zU r0 = (X.C259800zU) r0
            T r0 = r0.element
            if (r0 == 0) goto L46
            com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig r0 = (com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig) r0
            java.lang.String r0 = r0.geckoChannel
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L46
            java.lang.Object r0 = r2.l0
            X.00zU r0 = (X.C259800zU) r0
            T r0 = r0.element
            com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig r0 = (com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig) r0
            if (r0 == 0) goto L47
            java.lang.String r0 = r0.entranceLottieFileName
        L21:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L46
            java.lang.Object r3 = r2.l1
            X.0ecp r3 = (X.C1095930ecp) r3
            java.lang.Object r0 = r2.l0
            X.00zU r0 = (X.C259800zU) r0
            T r0 = r0.element
            com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig r0 = (com.bytedance.android.livesdk.livesetting.level.FansEntranceResConfig) r0
            java.lang.String r2 = ""
            if (r0 == 0) goto L3b
            java.lang.String r1 = r0.entranceLottieFileName
            if (r1 != 0) goto L3e
        L3b:
            r1 = r2
            if (r0 == 0) goto L43
        L3e:
            java.lang.String r0 = r0.geckoChannel
            if (r0 == 0) goto L43
            r2 = r0
        L43:
            r3.LJJII(r1, r2)
        L46:
            return
        L47:
            r0 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS12S0200000_17.onAnimationEnd$46(Y.ALAdapterS12S0200000_17, android.animation.Animator):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onAnimationEnd$47(Y.ALAdapterS12S0200000_17 r14, android.animation.Animator r15) {
        /*
            Method dump skipped, instruction units count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ALAdapterS12S0200000_17.onAnimationEnd$47(Y.ALAdapterS12S0200000_17, android.animation.Animator):void");
    }

    public static final void onAnimationEnd$5(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((C1295960jpS) aLAdapterS12S0200000_17.l0).removeAnimatorListener(aLAdapterS12S0200000_17);
        ((C1087890ePr) aLAdapterS12S0200000_17.l1).LIZIZ((C1295960jpS) aLAdapterS12S0200000_17.l0);
    }

    public static final void onAnimationEnd$6(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ImageView imageView = ((C1120390fGH) aLAdapterS12S0200000_17.l0).LIZ;
        if (imageView == null) {
            return;
        }
        if (((C1120350fGD) aLAdapterS12S0200000_17.l1).LLIZ) {
            imageView.setLayerType(0, null);
        }
        if (!((C1120350fGD) aLAdapterS12S0200000_17.l1).LLILZLL.LIZ(imageView)) {
            C1120350fGD c1120350fGD = (C1120350fGD) aLAdapterS12S0200000_17.l1;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1120350fGD, imageView);
            c1120350fGD.removeView(imageView);
        }
        ((C1120350fGD) aLAdapterS12S0200000_17.l1).LLILLJJLI.remove((C1120390fGH) aLAdapterS12S0200000_17.l0);
    }

    public static final void onAnimationEnd$7(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((C1120360fGE) aLAdapterS12S0200000_17.l0).LLILLL.remove((C1120420fGK) aLAdapterS12S0200000_17.l1);
    }

    public static final void onAnimationEnd$8(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ImageView imageView = ((C1120390fGH) aLAdapterS12S0200000_17.l0).LIZ;
        if (imageView == null) {
            return;
        }
        if (((C1120350fGD) aLAdapterS12S0200000_17.l1).LLIZ) {
            imageView.setLayerType(0, null);
        }
        if (!((C1120350fGD) aLAdapterS12S0200000_17.l1).LLILZLL.LIZ(imageView)) {
            C1120350fGD c1120350fGD = (C1120350fGD) aLAdapterS12S0200000_17.l1;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1120350fGD, imageView);
            c1120350fGD.removeView(imageView);
        }
        ((C1120350fGD) aLAdapterS12S0200000_17.l1).LLILLJJLI.remove((C1120390fGH) aLAdapterS12S0200000_17.l0);
    }

    public static final void onAnimationEnd$9(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ImageView imageView = ((C1120370fGF) aLAdapterS12S0200000_17.l0).LIZ;
        if (imageView == null) {
            return;
        }
        if (((C1120350fGD) aLAdapterS12S0200000_17.l1).LLIZ) {
            imageView.setLayerType(0, null);
        }
        if (!((C1120350fGD) aLAdapterS12S0200000_17.l1).LLILZLL.LIZ(imageView)) {
            C1120350fGD c1120350fGD = (C1120350fGD) aLAdapterS12S0200000_17.l1;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1120350fGD, imageView);
            c1120350fGD.removeView(imageView);
        }
        ((C1120350fGD) aLAdapterS12S0200000_17.l1).LLILLL.remove((C1120370fGF) aLAdapterS12S0200000_17.l0);
    }

    public static final void onAnimationStart$0(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((BigFlyingGiftPathWidget) aLAdapterS12S0200000_17.l0).getClass();
        Map<String, Object> map = C1338270kvh.LIZ;
        super.onAnimationStart(animator);
        ((BigFlyingGiftPathWidget) aLAdapterS12S0200000_17.l0).LLILZIL.add((C1295960jpS) aLAdapterS12S0200000_17.l1);
    }

    public static final void onAnimationStart$10(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((C1099230ei9) aLAdapterS12S0200000_17.l0).LJIILIIL.invoke();
        ((C1099230ei9) aLAdapterS12S0200000_17.l0).LJIILL.invoke();
    }

    public static final void onAnimationStart$11(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C12ES.LJIILL(0, (View) aLAdapterS12S0200000_17.l0);
    }

    public static final void onAnimationStart$12(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        boolean zBooleanValue;
        String str;
        String string;
        FollowInfo followInfo;
        String string2;
        GoodyBagBaseInfo goodyBagBaseInfoLIZ = ((GoodyBagWidget) aLAdapterS12S0200000_17.l0).x1().LIZ();
        Boolean boolValueOf = Boolean.valueOf(((GoodyBagWidget) aLAdapterS12S0200000_17.l0).x1().isAnchor());
        HashMap map = new HashMap(11);
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        map.put("is_anchor", String.valueOf(zBooleanValue));
        String str2 = "";
        if (goodyBagBaseInfoLIZ == null || (str = goodyBagBaseInfoLIZ.goodyBagId) == null) {
            str = "";
        }
        map.put("goody_bag_id", str);
        if (goodyBagBaseInfoLIZ == null || (string = Integer.valueOf(goodyBagBaseInfoLIZ.biz).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("goody_bag_type", string);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = String.valueOf(room.getId());
            }
            map.put("room_id", idStr);
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            User owner = room.getOwner();
            if (owner != null && (followInfo = owner.getFollowInfo()) != null && (string2 = Long.valueOf(followInfo.getFollowStatus()).toString()) != null) {
                str2 = string2;
            }
            map.put("follow_status", str2);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_goody_bag_short_touch_pushin");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_detail");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LIZ();
        C1CC2.LJII(0, "ttlive_goody_bag_short_touch_pushin", map);
        ((ViewGroup) aLAdapterS12S0200000_17.l1).setPivotX((int) C497740JfY.LIZIZ(35.0f));
        ((ViewGroup) aLAdapterS12S0200000_17.l1).setPivotY((int) C497740JfY.LIZIZ(35.0f));
    }

    public static final void onAnimationStart$13(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ImageView imageView = ((C1124290fMZ) aLAdapterS12S0200000_17.l0).LLJLIL;
        if (imageView != null) {
            C786410Ut5.LJZI(4, imageView);
        }
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$14(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ImageView imageView = ((C1124290fMZ) aLAdapterS12S0200000_17.l0).LLJJL;
        if (imageView != null) {
            C786410Ut5.LJZI(4, imageView);
        }
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$15(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C1091250eVH c1091250eVH;
        super.onAnimationStart(animator);
        View view = (View) aLAdapterS12S0200000_17.l1;
        if ((view instanceof C1091250eVH) && (c1091250eVH = (C1091250eVH) view) != null) {
            c1091250eVH.setEnableFixedSize(false);
        }
    }

    public static final void onAnimationStart$16(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) throws Throwable {
        super.onAnimationStart(animator);
        if (((C1085120eLO) aLAdapterS12S0200000_17.l0).LIZIZ) {
            ((ConstraintProperty) aLAdapterS12S0200000_17.l1).forceHasOverlappingRenderingCompat(false);
        }
    }

    public static final void onAnimationStart$17(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ((C1149320g0w) aLAdapterS12S0200000_17.l0).getClass();
    }

    public static final void onAnimationStart$18(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJJIFFI);
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$19(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationStart(animator);
        AbstractC1096120ed8 abstractC1096120ed8 = (AbstractC1096120ed8) aLAdapterS12S0200000_17.l0;
        C16F5 c16f5 = (C16F5) aLAdapterS12S0200000_17.l1;
        abstractC1096120ed8.getClass();
        AbstractC1096120ed8.LJIIZILJ(0, c16f5);
    }

    public static final void onAnimationStart$2(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ImageView imageView = ((LiveNewGiftBottomWidget) aLAdapterS12S0200000_17.l0).LLIZLLLIL;
        if (imageView != null) {
            C786410Ut5.LJZI(4, imageView);
        }
        super.onAnimationStart(animator);
    }

    public static final void onAnimationStart$20(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, (View) aLAdapterS12S0200000_17.l0);
    }

    public static final void onAnimationStart$21(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJJIIZ);
    }

    public static final void onAnimationStart$22(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationStart(animator);
        C12ES.LJIILL(0, ((C1095930ecp) aLAdapterS12S0200000_17.l0).LJIILIIL);
    }

    public static final void onAnimationStart$23(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationStart(animator);
        C786410Ut5.LLJLIL((C1146270fw1) aLAdapterS12S0200000_17.l0, 0);
        C20441214yg.LJ("NewMvpContainer", "MVP animation start");
        ((C1146270fw1) aLAdapterS12S0200000_17.l0).LJIIIZ();
    }

    public static final void onAnimationStart$3(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        ViewGroup viewGroup = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup != null) {
            viewGroup.setPivotX(0.0f);
        }
        ViewGroup viewGroup2 = ((PortraitShortTouchPreviewWidget) aLAdapterS12S0200000_17.l0).LL;
        if (viewGroup2 != null) {
            viewGroup2.setPivotY(0.0f);
        }
        ((AnimatorListenerAdapter) aLAdapterS12S0200000_17.l1).onAnimationStart(animator);
    }

    public static final void onAnimationStart$4(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C500260Jjc.LJIILLIIL(((ClearScreenUserInfoWidget) aLAdapterS12S0200000_17.l1).LLLIIII);
    }

    public static final void onAnimationStart$5(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        DataChannel dataChannel = ((LiveRoomUserInfoWidget) aLAdapterS12S0200000_17.l1).dataChannel;
        if (dataChannel != null) {
            dataChannel.SX0(C1083540eIq.class, Boolean.TRUE);
        }
    }

    public static final void onAnimationStart$6(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        C1295960jpS c1295960jpS = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLIZLLLIL;
        if (c1295960jpS != null) {
            C118300cf c118300cf = (C118300cf) aLAdapterS12S0200000_17.l1;
            if (c118300cf.element > 0) {
                ViewGroup.LayoutParams layoutParams = c1295960jpS.getLayoutParams();
                layoutParams.width = c118300cf.element;
                C786410Ut5.s6(c1295960jpS, layoutParams);
            }
        }
        C1295960jpS c1295960jpS2 = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLIZLLLIL;
        if (c1295960jpS2 != null) {
            C786410Ut5.LLD(0, c1295960jpS2);
        }
        C1295960jpS c1295960jpS3 = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLIZLLLIL;
        if (c1295960jpS3 != null) {
            c1295960jpS3.playAnimation();
        }
    }

    public static final void onAnimationStart$7(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        View view = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLILLJJLI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        View view2 = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLILZIL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(0, view2);
        }
        TextView textView = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLILZLL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 0);
        }
        TextView textView2 = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLILZLL;
        if (textView2 != null) {
            textView2.setText(C497740JfY.LJIJI(2131843871));
        }
        TextView textView3 = ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LLILZLL;
        if (textView3 != null) {
            textView3.setTextColor(C20736316Cj.LIZJ(R.attr.er6, textView3));
        }
        ((AbstractC1086230eNB) aLAdapterS12S0200000_17.l0).LL.LIZJ();
    }

    public static final void onAnimationStart$8(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationStart(animator);
        ((ConstraintProperty) aLAdapterS12S0200000_17.l0).translationY(0.0f);
    }

    public static final void onAnimationStart$9(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator) {
        super.onAnimationStart(animator);
        ((ConstraintProperty) aLAdapterS12S0200000_17.l0).translationY(0.0f);
    }

    public ALAdapterS12S0200000_17(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onAnimationStart$0(ALAdapterS12S0200000_17 aLAdapterS12S0200000_17, Animator animator, boolean z) {
        ((C1135030fdt) aLAdapterS12S0200000_17.l0).LLJILLL = EnumC1135050fdv.HIDING;
    }
}
