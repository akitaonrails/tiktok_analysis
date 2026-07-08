package Y;

import X.C03IT;
import X.C06U1;
import X.C0N6C;
import X.C0P0T;
import X.C0STY;
import X.C0XQ7;
import X.C0Y8T;
import X.C118300cf;
import X.C1211810hdj;
import X.C1216510hlJ;
import X.C1227990i3p;
import X.C123100dR;
import X.C1259780it6;
import X.C12G1;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1336205Ku;
import X.C1361400lX0;
import X.C1391550mJd;
import X.C1391600mJi;
import X.C1398620mV2;
import X.C13LZ;
import X.C14KQ;
import X.C155H;
import X.C1619980sG4;
import X.C1637550siP;
import X.C1657890tFD;
import X.C1C7U;
import X.C20684815ws;
import X.C21415018rM;
import X.C21578619ce;
import X.C2344009Gk;
import X.C289680BXa;
import X.C291001Au;
import X.C418440Gaw;
import X.C426750GoL;
import X.C444830HcP;
import X.C450720Hlu;
import X.C720310SNh;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C913380ZsO;
import X.EnumC1235690iGF;
import X.EnumC1237810iJf;
import X.InterfaceC1260110itd;
import X.InterfaceC19726212Fw;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.service.IIMContactUtilService;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.invitation.newdesign.assem.GroupInvitationInputAnswerAssem;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.I18nSettingManageMyAccountActivity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicViewV2;
import com.ss.android.ugc.profile.business.ur.platform.HeaderCTASettingsButtonComponent;
import com.ss.android.ugc.profile.platform.base.viewmodel.ProfilePlatformViewModel;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class ARunnableS52S0300000_19 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$10() {
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        Context context = (Context) this.l0;
        IIMContactUtilService.LIZ.getClass();
        IIMContactUtilService iIMContactUtilServiceLIZ = C913380ZsO.LIZ();
        EnterChatParams enterChatParams = new EnterChatParams(context, iIMContactUtilServiceLIZ != null ? iIMContactUtilServiceLIZ.LJI((C0Y8T) this.l1) : null);
        C1227990i3p c1227990i3p = (C1227990i3p) this.l2;
        C0Y8T c0y8t = (C0Y8T) this.l1;
        enterChatParams.setNewGroupChat(true);
        enterChatParams.setChatType(3);
        enterChatParams.setEnterFrom(15);
        enterChatParams.setEnterMethodForMob(c1227990i3p.LLILLJJLI.LJJJJLL().LJIIIZ().LIZLLL());
        enterChatParams.setSessionId(c0y8t.getConversationId());
        enterChatParams.setEnterFromForMob(c1227990i3p.LLILLJJLI.LJJJJLL().LJIIIZ().LIZJ());
        enterChatParams.setTrafficType(c1227990i3p.LLILZ.LJIILL);
        if (c1227990i3p.LLIZLLLIL) {
            enterChatParams.setQuickChat(true);
            enterChatParams.setQuickChatViewType(c1227990i3p.LLJ);
            enterChatParams.setDisableBackGroundMaskForQuickChat(c1227990i3p.LLILZ.LJIILJJIL ? 1 : 0);
        }
        imChatService.LJIILLIIL(enterChatParams, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                run$12(this);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                run$13(this);
                break;
            case 14:
                run$14(this);
                break;
            case 15:
                run$15(this);
                break;
            case 16:
                run$16(this);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                run$17(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        TuxTextView tuxTextView;
        if (((BaseAccountFlowFragment) this.l0).isAdded() && (tuxTextView = (TuxTextView) this.l1) != null) {
            List list = (List) this.l2;
            BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) this.l0;
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, tuxTextView.getContext());
            if (numLIZJ != null) {
                tuxTextView.setTextColor(numLIZJ.intValue());
            }
            if (list.size() != 1) {
                tuxTextView.setText(baseAccountFlowFragment.getString(2131826467));
                C786410Ut5.h9(tuxTextView, new ACListenerS122S0200000_19(baseAccountFlowFragment, list, 12));
            } else {
                C1211810hdj c1211810hdj = (C1211810hdj) ListProtector.get(list, 0);
                tuxTextView.setText(baseAccountFlowFragment.getString(c1211810hdj.LIZ));
                C786410Ut5.h9(tuxTextView, new ACListenerS122S0200000_19(baseAccountFlowFragment, c1211810hdj, 11));
            }
        }
    }

    public final void LIZ$1() {
        ((FeedAvatarDefaultAssem) this.l0).ep().UB1();
        ((FeedAvatarDefaultAssem) this.l0).Fp((Aweme) this.l1, (FollowStatus) this.l2);
        ((FeedAvatarDefaultAssem) this.l0).ep().xQ2(new C291001Au<>(1));
        C736680Sv4.LJIJJ(((FeedAvatarDefaultAssem) this.l0).kp(), new AwS598S0100000_19((FeedAvatarDefaultAssem) this.l0, 145));
    }

    public final void LIZ$11() {
        PhotoModeImageUrlModel imagePostCover;
        UrlModel urlModel;
        Aweme aweme = ((C1259780it6) this.l2).LL;
        if (aweme != null && aweme.getPhotoModeImageInfo() != null && (imagePostCover = ((C1259780it6) this.l2).LL.getPhotoModeImageInfo().getImagePostCover()) != null && (urlModel = imagePostCover.displayImageNoWatermark) != null && urlModel.getUrlList() != null && !imagePostCover.displayImageNoWatermark.getUrlList().isEmpty()) {
            Bitmap bitmap = C720310SNh.LIZ;
            C720310SNh.LJII(C1331660kl2.LIZJ().LIZIZ(new C03IT(imagePostCover.displayImageNoWatermark.getUrlList())));
        }
        C0STY.LIZ.execute(new ARunnableS119S0100000_19(this, 208));
    }

    public final void LIZ$12() {
        C1637550siP c1637550siP = (C1637550siP) this.l0;
        if (c1637550siP.LIZJ.LIZ.LJ) {
            c1637550siP.LIZIZ();
            ViewGroup viewGroup = (ViewGroup) this.l1;
            C1637550siP c1637550siP2 = (C1637550siP) this.l0;
            Function0 function0 = (Function0) this.l2;
            View childAt = viewGroup.getChildAt(0);
            if (childAt != null) {
                C786410Ut5.LJLLLLLL(4, childAt);
            }
            viewGroup.addView(c1637550siP2.LIZ());
            viewGroup.requestLayout();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1637550siP2.LIZ(), "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(150L);
            objectAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
            C786410Ut5.Pd(objectAnimatorOfFloat);
            HandlerHook.viewPost(viewGroup, new ARunnableS109S0100000_9(function0, 234));
        }
    }

    public final void LIZ$2() {
        User author = ((Aweme) this.l0).getAuthor();
        if (author != null && author.getFollowStatus() == 2 && C123100dR.LIZ(author.getSecUid()) && Intrinsics.LJFF(author.getUid(), ((FollowStatus) this.l1).getUserId())) {
            C1336205Ku.LIZ(false).getImUserService().LJ(author, false, new AwS598S0100000_19((FeedAvatarDefaultAssem) this.l2, 147));
        }
    }

    public final void LIZ$3() {
        if (((View) this.l0).getParent() == null || ((View) this.l0).getVisibility() != 0 || C1216510hlJ.LIZ().getBoolean("ai_cover_entry_guide_shown", false)) {
            return;
        }
        C12G1 c12g1 = (C12G1) this.l1;
        C450720Hlu c450720Hlu = new C450720Hlu(new C1361400lX0((Context) this.l2, R.style.y0));
        View view = (View) this.l0;
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c450720Hlu.LIZLLL();
        c450720Hlu.LLILLJJLI.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-6));
        C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
        c1391600mJi2.LJFF = iLIZIZ;
        c1391600mJi2.LJII = 3000L;
        c1391600mJi2.LJIJJ = true;
        c450720Hlu.LJIIJ(2131821393);
        c12g1.LLLFF = c450720Hlu.LIZIZ();
        C0P0T c0p0t = ((C12G1) this.l1).LLLFF;
        if (c0p0t != null) {
            c0p0t.show();
        }
        C1216510hlJ.LIZ().storeBoolean("ai_cover_entry_guide_shown", true);
    }

    public final void LIZ$4() {
        if (((View) this.l0).getParent() == null || ((View) this.l0).getVisibility() != 0 || C1216510hlJ.LIZ().getBoolean("ai_cover_entry_guide_shown", false)) {
            return;
        }
        InterfaceC19726212Fw interfaceC19726212Fw = ((C12G1) this.l1).LLJLLIL;
        if (interfaceC19726212Fw != null) {
            interfaceC19726212Fw.LIZIZ();
        }
        View view = (View) this.l0;
        HandlerHook.viewPost(view, new ARunnableS52S0300000_19(view, (C12G1) this.l1, (Context) this.l2, 6));
    }

    public final void LIZ$5() {
        int iLJ = C13LZ.LJ(C14KQ.LJIIIIZZ((Context) this.l0) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(196)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL))));
        C21415018rM c21415018rM = new C21415018rM((Context) this.l0, null, 6);
        Context context = (Context) this.l0;
        C786410Ut5.Q6(c21415018rM, new LinearLayout.LayoutParams(-2, -2));
        C426750GoL.LJIIIZ(c21415018rM, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, false, 16);
        C444830HcP c444830HcP = new C444830HcP();
        int iLIZIZ = C289680BXa.LIZIZ();
        c444830HcP.LJIILIIL(context.getString((iLIZIZ == 1 || iLIZIZ != 2) ? 2131824785 : 2131824793));
        c444830HcP.LIZIZ.LJ = iLJ;
        c444830HcP.LJII(52);
        c444830HcP.LIZIZ.LJI = Layout.Alignment.ALIGN_CENTER;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.o1, context);
        c444830HcP.LJIILJJIL(numLIZJ != null ? numLIZJ.intValue() : 0);
        c21415018rM.setTextLayout(C444830HcP.LIZJ(c444830HcP, 0.0f, true, null, 29));
        C1391550mJd c1391550mJd = new C1391550mJd((Context) this.l0);
        View view = (View) this.l1;
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LJIIZILJ = c21415018rM;
        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
        c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        c1391550mJd.LJ(AFwS207S0000000_19.get$arr$(456));
        C0P0T c0p0tLIZIZ = c1391550mJd.LIZIZ();
        c0p0tLIZIZ.show();
        ProfilePlatformViewModel profilePlatformViewModelZo = ((HeaderCTASettingsButtonComponent) this.l2).Zo();
        if (profilePlatformViewModelZo != null) {
            profilePlatformViewModelZo.GQ2(new AwS598S0100000_19(c0p0tLIZIZ, 387));
        }
    }

    public final void LIZ$6() {
        TuxTextView tuxTextView;
        if (((BaseAccountFlowFragment) this.l0).isAdded() && (tuxTextView = (TuxTextView) this.l1) != null) {
            BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) this.l0;
            List list = (List) this.l2;
            tuxTextView.setText(baseAccountFlowFragment.getString(2131826467));
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, tuxTextView.getContext());
            if (numLIZJ != null) {
                tuxTextView.setTextColor(numLIZJ.intValue());
            }
            C786410Ut5.h9(tuxTextView, new ACListenerS122S0200000_19(baseAccountFlowFragment, list, 34));
        }
    }

    public final void LIZ$7() {
        ((C1657890tFD) this.l0).LLJILJILJ.clear();
        C786410Ut5.LJJJLZIJ((View) this.l1, ((C1657890tFD) this.l0).LLILLJJLI);
        ViewGroup.LayoutParams layoutParams = ((View) this.l1).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = ((Integer) this.l2).intValue();
        }
        C1657890tFD c1657890tFD = (C1657890tFD) this.l0;
        View view = (View) this.l1;
        c1657890tFD.getClass();
        C1657890tFD.LJFF(view);
    }

    public final void LIZ$8() {
        ViewGroup viewGroup = (ViewGroup) this.l0;
        VerticalMusicViewV2 verticalMusicViewV2 = (VerticalMusicViewV2) this.l1;
        View view = (C06U1) this.l2;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        C155H c155h = verticalMusicViewV2.LLIZ;
        if (c155h == null) {
            c155h = null;
        }
        layoutParams.setMargins(0, 0, 0, ((int) c155h.LJIJI.LIZIZ) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(view);
        view.setLayoutParams(layoutParams);
        if (view.getParent() == null) {
            viewGroup.addView(view);
            verticalMusicViewV2.LJJJJJL();
            verticalMusicViewV2.LJJLIIIJILLIZJL();
        }
    }

    public final void LIZ$9() {
        Bitmap bitmap = C720310SNh.LIZ;
        C720310SNh.LJII(C1331660kl2.LIZJ().LIZIZ(new C03IT(((C1398620mV2) this.l0).LL.getVideo().getAiDynamicCover().getUrlList())));
        C0STY.LIZ.execute(new ARunnableS52S0300000_19((C1398620mV2) this.l0, (InterfaceC1260110itd) this.l1, (View) this.l2, 13));
    }

    public static final void run$0(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity = (I18nSettingManageMyAccountActivity) aRunnableS52S0300000_19.l0;
        Bundle bundle = (Bundle) aRunnableS52S0300000_19.l1;
        ArrayList<VerificationMethodType> arrayList = (ArrayList) aRunnableS52S0300000_19.l2;
        String str = I18nSettingManageMyAccountActivity._pnsPageId;
        i18nSettingManageMyAccountActivity.getClass();
        C1C7U.LIZ("I18nSettingManageMyAccountActivity@7df8.changeEmailWithType$1L");
        i18nSettingManageMyAccountActivity.LLILZ = true;
        i18nSettingManageMyAccountActivity.LJIIL();
        if (i18nSettingManageMyAccountActivity.LL.isEmailVerified()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "verified");
            C20684815ws.LJIILLIIL("enter_email_setting", c2344009Gk.LIZ);
            if (i18nSettingManageMyAccountActivity.LLIZ && i18nSettingManageMyAccountActivity.LLIZLLLIL) {
                C786410Ut5.LJJJI("page", "prompt_user_confirm", bundle);
                C786410Ut5.LJJJI("enter_from", i18nSettingManageMyAccountActivity.LLLIIII, bundle);
                C786410Ut5.LJJJI("enter_method", "normal", bundle);
                bundle.putBoolean("is_from_prompt", true);
            }
        }
        bundle.putInt("email_source", EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_ACCOUNT_MANAGEMENT_EMAIL.getValue());
        C0XQ7.LIZ().changeEmailWithTypes(i18nSettingManageMyAccountActivity, C0N6C.MANAGE_MY_ACCOUNT.getValue(), arrayList, bundle);
        C1C7U.LIZIZ("I18nSettingManageMyAccountActivity@7df8.changeEmailWithType$1L");
    }

    public static final void run$1(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        TuxTextView tuxTextView;
        C1C7U.LIZ("AvailableLoginOptionsHelper@fdca.setup3PBindHalfSheetOptions$availabilityListener$1$onResult$1");
        try {
            if (((BaseAccountFlowFragment) aRunnableS52S0300000_19.l0).isAdded() && (tuxTextView = (TuxTextView) aRunnableS52S0300000_19.l1) != null) {
                BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) aRunnableS52S0300000_19.l0;
                List list = (List) aRunnableS52S0300000_19.l2;
                tuxTextView.setText(baseAccountFlowFragment.getString(2131826467));
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                C786410Ut5.h9(tuxTextView, new ACListenerS122S0200000_19(baseAccountFlowFragment, list, 9));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvailableLoginOptionsHelper@fdca.setup3PBindHalfSheetOptions$availabilityListener$1$onResult$1");
    }

    public static final void run$10(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AvailableLoginOptionsHelper@fdca.showOptionalSignUpMethodsUI$availabilityListener$1$onResult$1");
        try {
            aRunnableS52S0300000_19.LIZ$6();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvailableLoginOptionsHelper@fdca.showOptionalSignUpMethodsUI$availabilityListener$1$onResult$1");
    }

    public static final void run$11(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ToolbarViewUpdateCallback@182e.removeView$2$onAnimationEnd$1");
        try {
            aRunnableS52S0300000_19.LIZ$7();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ToolbarViewUpdateCallback@182e.removeView$2$onAnimationEnd$1");
    }

    public static final void run$12(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("VerticalMusicViewV2@3dcd.createAndAddLyricLoadingView$2");
        try {
            aRunnableS52S0300000_19.LIZ$8();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("VerticalMusicViewV2@3dcd.createAndAddLyricLoadingView$2");
    }

    public static final void run$13(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDetailAwemeViewHolder@87e5.performClick$1$1");
        try {
            super/*X.0mV3*/.q6((View) aRunnableS52S0300000_19.l2, (InterfaceC1260110itd) aRunnableS52S0300000_19.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDetailAwemeViewHolder@87e5.performClick$1$1");
    }

    public static final void run$14(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("MusicDetailAwemeViewHolder@87e5.performClick$1");
        try {
            aRunnableS52S0300000_19.LIZ$9();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MusicDetailAwemeViewHolder@87e5.performClick$1");
    }

    public static final void run$15(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("NewConversationButtonProtocol@745a.enterChatRoomAfterGroupCreated$1");
        try {
            aRunnableS52S0300000_19.LIZ$10();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NewConversationButtonProtocol@745a.enterChatRoomAfterGroupCreated$1");
    }

    public static final void run$16(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AwemeViewHolder@8d38.performClick$1");
        try {
            aRunnableS52S0300000_19.LIZ$11();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AwemeViewHolder@8d38.performClick$1");
    }

    public static final void run$17(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("BottomTabWidgetManager@2038.addToNewParent$1");
        try {
            aRunnableS52S0300000_19.LIZ$12();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BottomTabWidgetManager@2038.addToNewParent$1");
    }

    public static final void run$2(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        TuxTextView tuxTextView;
        C1C7U.LIZ("AvailableLoginOptionsHelper@fdca.showOptionalLoginMethodsUI$availabilityListener$1$onResult$1");
        try {
            if (((BaseAccountFlowFragment) aRunnableS52S0300000_19.l0).isAdded() && (tuxTextView = (TuxTextView) aRunnableS52S0300000_19.l1) != null) {
                BaseAccountFlowFragment baseAccountFlowFragment = (BaseAccountFlowFragment) aRunnableS52S0300000_19.l0;
                List list = (List) aRunnableS52S0300000_19.l2;
                tuxTextView.setText(baseAccountFlowFragment.getString(2131824501));
                C786410Ut5.LLLLZLL(tuxTextView, 0);
                C786410Ut5.h9(tuxTextView, new ACListenerS122S0200000_19(baseAccountFlowFragment, list, 10));
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvailableLoginOptionsHelper@fdca.showOptionalLoginMethodsUI$availabilityListener$1$onResult$1");
    }

    public static final void run$3(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("AvailableLoginOptionsHelper@fdca.showOptionalBindMethodsUI$availabilityListener$1$onResult$1");
        try {
            aRunnableS52S0300000_19.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AvailableLoginOptionsHelper@fdca.showOptionalBindMethodsUI$availabilityListener$1$onResult$1");
    }

    public static final void run$4(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("FeedAvatarDefaultAssem@5993.onFollowStatusChange$$inlined$postDelayed$1");
        try {
            aRunnableS52S0300000_19.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedAvatarDefaultAssem@5993.onFollowStatusChange$$inlined$postDelayed$1");
    }

    public static final void run$5(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("FeedAvatarDefaultAssem@5993.updateShareStatus$$inlined$postDelayed$1");
        try {
            aRunnableS52S0300000_19.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FeedAvatarDefaultAssem@5993.updateShareStatus$$inlined$postDelayed$1");
    }

    public static final void run$6(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ImageEditThumbnailScene@6a71.maybeShowAiCoverEntryGuide$1$1");
        try {
            aRunnableS52S0300000_19.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageEditThumbnailScene@6a71.maybeShowAiCoverEntryGuide$1$1");
    }

    public static final void run$7(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("ImageEditThumbnailScene@6a71.maybeShowAiCoverEntryGuide$1");
        try {
            aRunnableS52S0300000_19.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageEditThumbnailScene@6a71.maybeShowAiCoverEntryGuide$1");
    }

    public static final void run$8(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("HeaderCTASettingsButtonComponent@2851.tryToShowAliasBubbleTooltip$1$1");
        try {
            aRunnableS52S0300000_19.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HeaderCTASettingsButtonComponent@2851.tryToShowAliasBubbleTooltip$1$1");
    }

    public static final void run$9(ARunnableS52S0300000_19 aRunnableS52S0300000_19) {
        boolean zLIZ;
        C1C7U.LIZ("GroupInvitationInputAnswerAssem@dec4.adjustForKeyboard$1$1");
        try {
            ViewGroup.LayoutParams layoutParams = ((TuxTextView) aRunnableS52S0300000_19.l0).getLayoutParams();
            layoutParams.height = ((GroupInvitationInputAnswerAssem) aRunnableS52S0300000_19.l1).LLJIJIL;
            C786410Ut5.R6((TuxTextView) aRunnableS52S0300000_19.l0, layoutParams);
            C21578619ce c21578619ce = (C21578619ce) ((GroupInvitationInputAnswerAssem) aRunnableS52S0300000_19.l1).LLJILJILJ.getValue();
            if (c21578619ce != null) {
                c21578619ce.scrollBy(0, ((C118300cf) aRunnableS52S0300000_19.l2).element);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GroupInvitationInputAnswerAssem@dec4.adjustForKeyboard$1$1");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS52S0300000_19(com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem r2, com.ss.android.ugc.aweme.feed.model.Aweme r3, com.ss.android.ugc.aweme.profile.model.FollowStatus r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            int r5 = 4 - r5
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
            r0.l0 = r2
            r0.l1 = r3
            r0.l2 = r4
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS52S0300000_19.<init>(com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarDefaultAssem, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.profile.model.FollowStatus, int):void");
    }

    public ARunnableS52S0300000_19(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
