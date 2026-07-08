package X;

import Y.ALAdapterS12S0200000_17;
import Y.ALAdapterS13S0100000_17;
import Y.ALAdapterS9S0100000_12;
import Y.ARunnableS117S0100000_17;
import Y.AUListenerS15S0102000_17;
import Y.AUListenerS266S0100000_17;
import Y.AUListenerS78S0110000_17;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.UserContainerWidgetChangeEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.LinkedGuestCountChannel;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.room.FollowAnchorStateChangeEvent;
import com.bytedance.android.live.setting.LiveMainFrameUpdateFontOptSetting;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubAnimationProtectionSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubFollowAnimOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubTopOneOptSetting;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubUnFollowAnimEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestRevertFollowButton;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconHideTextMinimumDimensionSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe.SubscriptionIconNeedHideTextSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscribeEnhanceIconSetting;
import com.bytedance.android.livesdk.livesetting.other.subscribe_enhance.SubscriptionAudienceEntranceEnhanceSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.model.OfficialChannelInfo;
import com.bytedance.android.livesdk.revenue.level.api.service.IFansClubService;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0edU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1096340edU implements InterfaceC1095350ebt {
    public final View LIZ;
    public final View LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final ViewGroup LJ;
    public final View LJFF;
    public final View LJI;
    public final ViewGroup LJII;
    public final LiveIconView LJIIIIZZ;
    public final View LJIIIZ;
    public final C1126540fQC LJIIJ;
    public final ImageView LJIIJJI;
    public final ImageView LJIIL;
    public final TextView LJIILIIL;
    public final ViewGroup LJIILJJIL;
    public EnumC1096020ecy LJIILL;
    public final IMicRoomService LJIILLIIL;
    public final IProgrammedLiveService LJIIZILJ;
    public final DataChannel LJIJ;
    public final boolean LJIJI;
    public final Room LJIJJ;
    public ValueAnimator LJIL;
    public AnimatorSet LJJ;
    public final Context LJJIFFI;
    public final int LJJII;
    public boolean LJJIII;
    public boolean LJJIIJ;
    public ImageView LJJIIJZLJL;
    public ViewGroup LJJIIZ;
    public ViewGroup LJJIIZI;
    public InterfaceC1096360edW LJJIJ;
    public InterfaceC1096360edW LJJIJIIJI;
    public final boolean LJJIL;
    public final C11NJ LJIJJLI = new C11NJ();
    public final Boolean LJJI = Boolean.valueOf(SubscribeEnhanceIconSetting.INSTANCE.getValue());
    public boolean LJJIJIIJIL = false;
    public boolean LJJIJIL = false;
    public boolean LJJIJL = false;
    public ARunnableS117S0100000_17 LJJIJLIJ = null;

    public static void LJIIIIZZ() {
        C20441214yg.LIZLLL("gradientDrawable_Translate_Fail");
    }

    public final void LIZIZ() {
        C1126540fQC c1126540fQC = this.LJIIJ;
        if (c1126540fQC != null && c1126540fQC.LJI()) {
            this.LJIIJ.LIZLLL();
        }
        ValueAnimator valueAnimator = this.LJIL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJIL.cancel();
        }
        LiveFansClubAnimationProtectionSetting liveFansClubAnimationProtectionSetting = LiveFansClubAnimationProtectionSetting.INSTANCE;
        if (liveFansClubAnimationProtectionSetting.enableCatch()) {
            try {
                AnimatorSet animatorSet = this.LJJ;
                if (animatorSet == null || !animatorSet.isRunning()) {
                    return;
                }
                this.LJJ.cancel();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return;
            }
        }
        AnimatorSet animatorSet2 = this.LJJ;
        if (animatorSet2 == null || !animatorSet2.isRunning()) {
            return;
        }
        this.LJJ.cancel();
        if (liveFansClubAnimationProtectionSetting.safeCancelAnimatorSet()) {
            this.LJJ = null;
        }
    }

    public final void LIZJ() {
        ViewGroup.LayoutParams layoutParams = this.LIZLLL.getLayoutParams();
        layoutParams.width = this.LJ.getMeasuredWidth();
        layoutParams.height = this.LJ.getMeasuredHeight();
        C786410Ut5.W5(this.LIZLLL, layoutParams);
        C12ES.LJIILL(0, this.LIZLLL);
        ViewGroup.LayoutParams layoutParams2 = this.LJ.getLayoutParams();
        if (layoutParams2 instanceof C19ME) {
            ((C19ME) layoutParams2).startToEnd = R.id.jhk;
        }
        C786410Ut5.X5(layoutParams2, this.LJ);
        ViewGroup.LayoutParams layoutParams3 = this.LIZIZ.getLayoutParams();
        if (layoutParams3 instanceof C19ME) {
            ((C19ME) layoutParams3).endToStart = R.id.hkc;
        }
        C786410Ut5.W5(this.LIZIZ, layoutParams3);
    }

    public final void LJ() {
        ViewGroup.LayoutParams layoutParams = this.LJ.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            ((C19ME) layoutParams).startToEnd = R.id.p0o;
        }
        C786410Ut5.X5(layoutParams, this.LJ);
        ViewGroup.LayoutParams layoutParams2 = this.LIZIZ.getLayoutParams();
        if (layoutParams2 instanceof C19ME) {
            ((C19ME) layoutParams2).endToStart = R.id.iew;
        }
        C786410Ut5.W5(this.LIZIZ, layoutParams2);
        C12ES.LJIILL(8, this.LIZLLL);
    }

    public final void LJFF() {
        C1126540fQC c1126540fQC = this.LJIIJ;
        if (c1126540fQC != null && c1126540fQC.LJI()) {
            this.LJIIJ.LIZLLL();
        }
        ValueAnimator valueAnimator = this.LJIL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.LJIL.end();
        }
        AnimatorSet animatorSet = this.LJJ;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        this.LJJ.end();
    }

    public final void LJI() {
        ViewGroup.LayoutParams layoutParams = this.LJ.getLayoutParams();
        if (layoutParams instanceof C19ME) {
            ViewGroup viewGroup = (ViewGroup) this.LJ.getParent();
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.width = -2;
            C786410Ut5.X5(layoutParams2, viewGroup);
            layoutParams.width = -2;
            layoutParams.height = -2;
            C19ME c19me = (C19ME) layoutParams;
            c19me.startToStart = -1;
            c19me.startToEnd = R.id.p0o;
            c19me.endToEnd = 0;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) C497740JfY.LIZIZ(4.0f);
            c19me.setMarginEnd((int) C497740JfY.LIZIZ(4.0f));
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) C497740JfY.LIZIZ(4.0f);
            C786410Ut5.X5(layoutParams, this.LJ);
        }
    }

    public final ImageModel LJII() {
        OfficialChannelInfo officialChannelInfo;
        User user;
        IMicRoomService iMicRoomService = this.LJIILLIIL;
        if (iMicRoomService == null || !iMicRoomService.On1() || this.LJJII != 1) {
            Room room = this.LJIJJ;
            if (room == null || room.getOwner() == null || this.LJIJJ.getOwner().getSubscribeInfo() == null || this.LJIJJ.getOwner().getSubscribeInfo().getSubscribeBadge() == null) {
                return null;
            }
            return this.LJIJJ.getOwner().getSubscribeInfo().getSubscribeBadge().getOriginImage();
        }
        Room room2 = this.LJIJJ;
        if (room2 == null || (officialChannelInfo = room2.officialChannelInfo) == null || (user = officialChannelInfo.channelUser) == null || user.getSubscribeInfo() == null || this.LJIJJ.officialChannelInfo.channelUser.getSubscribeInfo().getSubscribeBadge() == null) {
            return null;
        }
        return this.LJIJJ.officialChannelInfo.channelUser.getSubscribeInfo().getSubscribeBadge().getOriginImage();
    }

    public final void LJIIJ() {
        if (this.LJJIII && LIZLLL()) {
        }
    }

    public final boolean LJIIJJI() {
        Room room;
        IMicRoomService iMicRoomService;
        OfficialChannelInfo officialChannelInfo;
        if (!this.LJIJI && (room = this.LJIJJ) != null && (iMicRoomService = this.LJIILLIIL) != null && (officialChannelInfo = room.officialChannelInfo) != null && officialChannelInfo.channelUser != null && iMicRoomService.On1()) {
            return this.LJIJJ.officialChannelInfo.channelUser.getFollowInfo().getFollowStatus() == 1 || this.LJIJJ.officialChannelInfo.channelUser.getFollowInfo().getFollowStatus() == 2;
        }
        Room room2 = this.LJIJJ;
        return (room2 == null || room2.getOwner() == null || !this.LJIJJ.getOwner().isFollowing()) ? false : true;
    }

    public final boolean LJIIL() {
        if (!this.LJJIII) {
            return false;
        }
        if (this.LJIJI) {
            return true;
        }
        InterfaceC1096360edW interfaceC1096360edW = this.LJJIJIIJI;
        return interfaceC1096360edW != null && interfaceC1096360edW.LIZLLL();
    }

    public final boolean LJIILIIL() {
        IMicRoomService iMicRoomService = this.LJIILLIIL;
        return (iMicRoomService != null && iMicRoomService.On1()) || this.LJJII == 2;
    }

    public final boolean LJIILJJIL() {
        if (this.LJJII == 3) {
            return true;
        }
        IProgrammedLiveService iProgrammedLiveService = this.LJIIZILJ;
        return iProgrammedLiveService != null && iProgrammedLiveService.lm1();
    }

    public final void LJIILL() {
        Room room = this.LJIJJ;
        if (room == null || room.getOwner() == null || this.LJIJJ.getOwner().getSubscribeInfo() == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_icon_click");
        c474500IjALIZ.LJIJJLI(this.LJIJ);
        c474500IjALIZ.LJJII(Long.valueOf(this.LJIJJ.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJIJJ.getId()), "room_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ.LJJII(w.LJJII(), "video_id");
        c474500IjALIZ.LJJII(this.LJIJI ? "anchor" : "user", "user_type");
        c474500IjALIZ.LJJII("live_left_corner", "click_position");
        DataChannel dataChannel = this.LJIJ;
        c474500IjALIZ.LJJIIZI(C494680Jac.LJJIFFI(C518420KUu.LIZJ(dataChannel), C518420KUu.LIZLLL(dataChannel), false));
        c474500IjALIZ.LIZ();
    }

    public final void LJIILLIIL() throws JSONException {
        long jLongValue;
        Room room = this.LJIJJ;
        if (room == null || room.getOwner() == null || this.LJIJJ.getOwner().getSubscribeInfo() == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_icon_show");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJIJJ.getOwnerUserId()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJIJJ.getId()), "room_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
        c474500IjALIZ.LJJII("click", "action_type");
        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
        c474500IjALIZ.LJJII(w.LJJII(), "video_id");
        c474500IjALIZ.LJJII(this.LJIJI ? "anchor" : "user", "user_type");
        c474500IjALIZ.LJJII("live_left_corner", "show_entrance");
        DataChannel dataChannel = this.LJIJ;
        c474500IjALIZ.LJJIIZI(C494680Jac.LJJIFFI(C518420KUu.LIZJ(dataChannel), C518420KUu.LIZLLL(dataChannel), false));
        c474500IjALIZ.LJIJJLI(this.LJIJ);
        if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJIL();
            c474500IjALIZ.LJJIJL();
        } else {
            c474500IjALIZ.LIZ();
        }
        C510380Jzw.LJIJJLI("live_left_corner");
        RecyclableWidgetManager recyclableWidgetManager = (RecyclableWidgetManager) this.LJIJ.gg0(C781240Ukk.class);
        long jLIZLLL = 0;
        if (recyclableWidgetManager != null) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            Long l = (Long) ((LinkedHashMap) C1082080eGU.LIZJ).get(recyclableWidgetManager);
            jLongValue = jUptimeMillis - (l != null ? l.longValue() : 0L);
            jLIZLLL = C1082080eGU.LIZLLL(recyclableWidgetManager);
        } else {
            jLongValue = 0;
        }
        JSONObject jSONObject = new JSONObject();
        C0K02.LJIIJ(jSONObject);
        Long lValueOf = Long.valueOf(jLongValue);
        if (lValueOf != null) {
            jSONObject.put("subs_btn_load_self_duration", lValueOf);
        }
        Long lValueOf2 = Long.valueOf(jLIZLLL);
        if (lValueOf2 != null) {
            jSONObject.put("subs_btn_load_total_duration", lValueOf2);
        }
        C1CC2.LJIIIIZZ("ttlive_subscription_perf_entrance_show", 0, jSONObject);
    }

    public final boolean LIZLLL() {
        if (LJIILIIL() || LJIILJJIL()) {
            return false;
        }
        Room room = this.LJIJJ;
        if (room == null) {
            room = null;
        }
        return C518190KTx.LIZ(this.LJIJI, room);
    }

    public static boolean LJIJI(DataChannel dataChannel) {
        if (!MultiGuestRevertFollowButton.enable() || dataChannel == null) {
            return false;
        }
        Room room = (Room) dataChannel.gg0(RoomChannel.class);
        if ((room == null || room.getStreamType() != LiveMode.LIVE_VOICE) && ((Integer) dataChannel.gg0(LinkedGuestCountChannel.class)).intValue() < 1) {
            return false;
        }
        return true;
    }

    public final void LIZ(EnumC1096020ecy enumC1096020ecy) {
        boolean z;
        boolean z2;
        int i;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        float f;
        float f2;
        long j;
        long jLongValue;
        EnumC1096020ecy enumC1096020ecy2;
        EnumC1096020ecy enumC1096020ecy3;
        ViewGroup viewGroup;
        EnumC1096020ecy enumC1096020ecy4 = this.LJIILL;
        if (enumC1096020ecy4 == enumC1096020ecy) {
            return;
        }
        if (enumC1096020ecy == EnumC1096020ecy.FOLLOW_ANIM && enumC1096020ecy4 != EnumC1096020ecy.UNFOLLOW) {
            return;
        }
        boolean z3 = true;
        if (!this.LJIJI && enumC1096020ecy == EnumC1096020ecy.UNFOLLOW && (viewGroup = this.LJJIIZ) != null && viewGroup.getVisibility() == 0 && LJIIL()) {
            return;
        }
        EnumC1096020ecy enumC1096020ecy5 = this.LJIILL;
        if (enumC1096020ecy5 != null && enumC1096020ecy5 != enumC1096020ecy) {
            z = true;
        } else {
            z = false;
        }
        if (LiveFansClubUnFollowAnimEnableSetting.INSTANCE.getValue() && (((enumC1096020ecy3 = this.LJIILL) == EnumC1096020ecy.FANS_CLUB_UNJOIN_ANIM || enumC1096020ecy3 == EnumC1096020ecy.FANS_CLUB_UNJOIN_DELAY_ANIM || enumC1096020ecy3 == EnumC1096020ecy.FANS_CLUB_UNJOIN) && enumC1096020ecy == EnumC1096020ecy.UNFOLLOW)) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LJIILL = enumC1096020ecy;
        LIZIZ();
        LJ();
        int i3 = 8;
        C12ES.LJIILL(8, this.LJ);
        C12ES.LJIILL(8, this.LJI);
        if (!this.LJIJI) {
            C12ES.LJIILL(8, this.LJIIIIZZ);
        }
        C12ES.LJIILL(8, this.LJFF);
        C12ES.LJIILL(8, this.LJIIJ);
        C12ES.LJIILL(8, this.LJIIJJI);
        C12ES.LJIILL(8, this.LJIILIIL);
        switch (C1096030ecz.LIZ[enumC1096020ecy.ordinal()]) {
            case 1:
                C12ES.LJIILL(8, this.LJJIIZ);
                C12ES.LJIILL(8, this.LJJIIZI);
                LJIJJ(C20736316Cj.LIZIZ(R.attr.c7n, this.LJJIFFI));
                if (!this.LJIJI) {
                    C12ES.LJIILL(0, this.LJIIIIZZ);
                    if (z) {
                        C1092460eXE.LIZLLL(this.LJIJI, false, this.LJII);
                        this.LJJIJL = true;
                        ViewGroup viewGroup2 = this.LJ;
                        if (viewGroup2 != null && (layoutParams = viewGroup2.getLayoutParams()) != null) {
                            layoutParams.width = -2;
                            C786410Ut5.X5(layoutParams, viewGroup2);
                        }
                    }
                }
                LJIJJLI(4.0f);
                if (!this.LJJIL && (this.LJIIJJI.getLayoutParams() instanceof FrameLayout.LayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJIIJJI.getLayoutParams();
                    marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(0.0f));
                    if (this.LJJII != 2) {
                        marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(8.0f));
                    }
                    C786410Ut5.c6(this.LJIIJJI, marginLayoutParams);
                }
                if (!this.LJJIIJ) {
                    ViewGroup viewGroup3 = this.LJII;
                    if (LJIJI(this.LJIJ)) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    C12ES.LJIILL(i, viewGroup3);
                    C12ES.LJIILL(0, this.LJ);
                }
                if (!LJIILIIL() || !LJIILJJIL()) {
                    C12ES.LJIILL(0, this.LJI);
                    C235600va.LIZ(this.LJIJJ, this.LJIJ, "livesdk_follow_show");
                }
                C12ES.LJIILL(0, this.LJFF);
                C12ES.LJIILL(8, this.LJIIL);
                if (this.LJJI.booleanValue()) {
                    C786410Ut5.LJLLLLLL(8, this.LJIIIZ);
                }
                if (!z2 || this.LIZJ == null || this.LJIIIIZZ == null || this.LJI == null) {
                    return;
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(300L);
                TransitionManager.beginDelayedTransition((ViewGroup) this.LIZJ, changeBounds);
                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(-1, this.LJJIFFI.getResources().getColor(R.color.a2r));
                valueAnimatorOfInt.setEvaluator(new ArgbEvaluator());
                valueAnimatorOfInt.setDuration(300L);
                valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(this, 75));
                valueAnimatorOfInt.addListener(new ALAdapterS13S0100000_17(this, 63));
                C786410Ut5.i5(this.LJIIIIZZ, 0.0f);
                C786410Ut5.T4(this.LJI, 0.0f);
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.LJIIIIZZ, (Property<LiveIconView, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
                duration.setStartDelay(200L);
                ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.LJI, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
                duration2.setStartDelay(200L);
                duration2.addListener(new ALAdapterS13S0100000_17(this, 67));
                AnimatorSet animatorSet = new AnimatorSet();
                this.LJJ = animatorSet;
                animatorSet.playTogether(valueAnimatorOfInt, duration, duration2);
                this.LJJ.start();
                return;
            case 2:
                if (!this.LJJIIJ) {
                    C12ES.LJIILL(0, this.LJ);
                }
                if (!LJIILIIL() || !LJIILJJIL()) {
                    C12ES.LJIILL(0, this.LJI);
                }
                if (!this.LJIJI) {
                    C12ES.LJIILL(0, this.LJIIIIZZ);
                }
                C12ES.LJIILL(0, this.LJFF);
                C12ES.LJIILL(8, this.LJIIL);
                View view = this.LJI;
                if (!LJIILIIL() || !LJIILJJIL()) {
                    i3 = 4;
                }
                C12ES.LJIILL(i3, view);
                if (!this.LJIJI) {
                    i2 = 4;
                    C12ES.LJIILL(4, this.LJIIIIZZ);
                } else {
                    i2 = 4;
                }
                C12ES.LJIILL(i2, this.LJFF);
                C12ES.LJIILL(0, this.LJIIJ);
                C1126540fQC c1126540fQC = this.LJIIJ;
                if (c1126540fQC == null || c1126540fQC.LJI()) {
                    return;
                }
                LJIIJ();
                this.LJIIJ.LLJILJIL = C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_basic_resource", "tiktok_live_watch_resource_normal_1"), "ttlive_user_info_follow_complete_1.webp");
                C1126540fQC c1126540fQC2 = this.LJIIJ;
                c1126540fQC2.LLJILJILJ = new C0I9J() { // from class: X.0edV
                    @Override // X.C0I9J, X.InterfaceC1331000kjy
                    public final void LIZJ(AnimatedDrawable2 animatedDrawable2) {
                        InterfaceC1096360edW interfaceC1096360edW;
                        int measuredWidth;
                        final boolean z4;
                        int measuredWidth2;
                        boolean z5;
                        if (this.LIZ.LIZLLL()) {
                            C1096340edU c1096340edU = this.LIZ;
                            if (c1096340edU.LJJIJIIJIL) {
                                if (c1096340edU.LIZJ != null && c1096340edU.LJIILL == EnumC1096020ecy.FOLLOW_ANIM && c1096340edU.LJJIJIIJI != null) {
                                    C12ES.LJIILL(0, c1096340edU.LJJIIZ);
                                    View viewLJIIIIZZ = c1096340edU.LJJIJIIJI.LJIIIIZZ();
                                    View viewLIZJ = c1096340edU.LJJIJIIJI.LIZJ();
                                    View viewLJI = c1096340edU.LJJIJIIJI.LJI();
                                    C12ES.LJIILL(8, viewLJIIIIZZ);
                                    C12ES.LJIILL(8, viewLIZJ);
                                    C12ES.LJIILL(8, viewLJI);
                                    ChangeBounds changeBounds2 = new ChangeBounds();
                                    changeBounds2.setDuration(300L);
                                    TransitionManager.beginDelayedTransition((ViewGroup) c1096340edU.LIZJ, changeBounds2);
                                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(c1096340edU.LJJIFFI.getResources().getColor(R.color.a2r), -1);
                                    valueAnimatorOfInt2.setEvaluator(new ArgbEvaluator());
                                    valueAnimatorOfInt2.setDuration(300L);
                                    valueAnimatorOfInt2.addUpdateListener(new AUListenerS266S0100000_17(c1096340edU, 76));
                                    valueAnimatorOfInt2.addListener(new ALAdapterS13S0100000_17(c1096340edU, 56));
                                    ObjectAnimator duration3 = ObjectAnimator.ofFloat(c1096340edU.LJIIJ, (Property<C1126540fQC, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(300L);
                                    duration3.addListener(new ALAdapterS13S0100000_17(c1096340edU, 60));
                                    ViewGroup viewGroup4 = c1096340edU.LJ;
                                    if (viewGroup4 != null) {
                                        measuredWidth2 = viewGroup4.getMeasuredWidth();
                                    } else {
                                        measuredWidth2 = 0;
                                    }
                                    int iLJ = c1096340edU.LJJIJIIJI.LJ();
                                    ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(measuredWidth2, iLJ);
                                    if (measuredWidth2 > iLJ && iLJ > 0) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    valueAnimatorOfInt3.addUpdateListener(new AUListenerS78S0110000_17(c1096340edU, z5, 7));
                                    valueAnimatorOfInt3.addListener(new ALAdapterS13S0100000_17(c1096340edU, 62));
                                    valueAnimatorOfInt3.setDuration(300L);
                                    valueAnimatorOfInt3.setStartDelay(300L);
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    c1096340edU.LJJ = animatorSet2;
                                    animatorSet2.playTogether(valueAnimatorOfInt2, duration3, valueAnimatorOfInt3);
                                    c1096340edU.LJJ.start();
                                }
                            } else if (c1096340edU.LJIIL()) {
                                C12ES.LJIILL(8, this.LIZ.LJIIJ);
                                this.LIZ.LIZ(EnumC1096020ecy.FANS_CLUB_JOINED);
                            } else {
                                final C1096340edU c1096340edU2 = this.LIZ;
                                if (c1096340edU2.LIZJ != null && c1096340edU2.LJIILL == EnumC1096020ecy.FOLLOW_ANIM && (interfaceC1096360edW = c1096340edU2.LJJIJIIJI) != null) {
                                    interfaceC1096360edW.LJIIIZ(false);
                                    C12ES.LJIILL(0, c1096340edU2.LJJIIZ);
                                    View viewLJIIIIZZ2 = c1096340edU2.LJJIJIIJI.LJIIIIZZ();
                                    View viewLIZJ2 = c1096340edU2.LJJIJIIJI.LIZJ();
                                    View viewLJI2 = c1096340edU2.LJJIJIIJI.LJI();
                                    c1096340edU2.LJJIJIIJI.LIZIZ();
                                    ChangeBounds changeBounds3 = new ChangeBounds();
                                    changeBounds3.setDuration(300L);
                                    TransitionManager.beginDelayedTransition((ViewGroup) c1096340edU2.LIZJ, changeBounds3);
                                    ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(c1096340edU2.LJJIFFI.getResources().getColor(R.color.a2r), -1);
                                    valueAnimatorOfInt4.setEvaluator(new ArgbEvaluator());
                                    valueAnimatorOfInt4.setDuration(300L);
                                    valueAnimatorOfInt4.addUpdateListener(new AUListenerS266S0100000_17(c1096340edU2, 74));
                                    valueAnimatorOfInt4.addListener(new ALAdapterS13S0100000_17(c1096340edU2, 47));
                                    ObjectAnimator duration4 = ObjectAnimator.ofFloat(c1096340edU2.LJIIJ, (Property<C1126540fQC, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(300L);
                                    duration4.addListener(new ALAdapterS13S0100000_17(c1096340edU2, 48));
                                    ObjectAnimator duration5 = ObjectAnimator.ofFloat(viewLJIIIIZZ2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
                                    duration5.addListener(new ALAdapterS9S0100000_12(viewLJIIIIZZ2, 33));
                                    duration5.setStartDelay(300L);
                                    ObjectAnimator duration6 = ObjectAnimator.ofFloat(viewLIZJ2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
                                    duration6.addListener(new ALAdapterS12S0200000_17(viewLIZJ2, c1096340edU2, 22));
                                    duration6.setStartDelay(300L);
                                    ObjectAnimator duration7 = ObjectAnimator.ofFloat(viewLJI2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(300L);
                                    duration7.addListener(new ALAdapterS9S0100000_12(viewLJI2, 34));
                                    duration7.setStartDelay(300L);
                                    ViewGroup viewGroup5 = c1096340edU2.LJ;
                                    if (viewGroup5 != null) {
                                        measuredWidth = viewGroup5.getMeasuredWidth();
                                    } else {
                                        measuredWidth = 0;
                                    }
                                    final int iLJIIJ = c1096340edU2.LJJIJIIJI.LJIIJ();
                                    ValueAnimator valueAnimatorOfInt5 = ValueAnimator.ofInt(measuredWidth, iLJIIJ);
                                    if (measuredWidth > iLJIIJ && iLJIIJ > 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    valueAnimatorOfInt5.addUpdateListener(new AUListenerS78S0110000_17(c1096340edU2, z4, 6));
                                    if (LiveFansClubFollowAnimOptimizeSetting.INSTANCE.getValue()) {
                                        valueAnimatorOfInt5.addListener(new AnimatorListenerAdapter() { // from class: X.0ec2
                                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                            public final void onAnimationEnd(Animator animator) {
                                                ViewGroup viewGroup6;
                                                super.onAnimationEnd(animator);
                                                if (z4 && (viewGroup6 = c1096340edU2.LJ) != null) {
                                                    ViewGroup.LayoutParams layoutParams2 = viewGroup6.getLayoutParams();
                                                    int i4 = layoutParams2.width;
                                                    int i5 = iLJIIJ;
                                                    if (i4 != i5) {
                                                        layoutParams2.width = i5;
                                                        C786410Ut5.X5(layoutParams2, c1096340edU2.LJ);
                                                    }
                                                }
                                            }
                                        });
                                    }
                                    valueAnimatorOfInt5.setDuration(300L);
                                    valueAnimatorOfInt5.setStartDelay(300L);
                                    c1096340edU2.LJJ = new AnimatorSet();
                                    if (LiveFansClubAnimationProtectionSetting.INSTANCE.changeAnimationOrder()) {
                                        c1096340edU2.LJJ.playTogether(valueAnimatorOfInt4, duration4, duration5, duration7, valueAnimatorOfInt5, duration6);
                                    } else {
                                        c1096340edU2.LJJ.playTogether(valueAnimatorOfInt4, duration4, duration5, duration6, duration7, valueAnimatorOfInt5);
                                    }
                                    c1096340edU2.LJJ.start();
                                }
                            }
                        } else {
                            C1096340edU c1096340edU3 = this.LIZ;
                            boolean z6 = c1096340edU3.LJJIII;
                            C12ES.LJIILL(8, c1096340edU3.LJIIJ);
                            C1096340edU c1096340edU4 = this.LIZ;
                            if (c1096340edU4.LJIILL == EnumC1096020ecy.FOLLOW_ANIM) {
                                int measuredWidth3 = c1096340edU4.LJ.getMeasuredWidth();
                                int measuredHeight = c1096340edU4.LJ.getMeasuredHeight();
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                                c1096340edU4.LJIL = valueAnimatorOfFloat;
                                valueAnimatorOfFloat.addUpdateListener(new AUListenerS15S0102000_17(c1096340edU4, measuredWidth3, measuredHeight, 1));
                                c1096340edU4.LJIL.addListener(new ALAdapterS13S0100000_17(c1096340edU4, 46));
                                c1096340edU4.LJIL.setDuration(200L);
                                c1096340edU4.LJIL.start();
                            }
                        }
                        DataChannel dataChannel = this.LIZ.LJIJ;
                        if (dataChannel != null) {
                            dataChannel.FQ2(UserContainerWidgetChangeEvent.class);
                        }
                    }
                };
                c1126540fQC2.LJII();
                return;
            case 3:
                if (this.LJ.getBackground() instanceof GradientDrawable) {
                    ((GradientDrawable) this.LJ.getBackground()).setColor(C20736316Cj.LIZIZ(R.attr.c9i, this.LJJIFFI));
                } else {
                    LJIIIIZZ();
                }
                if (!this.LJJIIJ) {
                    C12ES.LJIILL(0, this.LJ);
                }
                LJIJJLI(4.0f);
                if (this.LJJIL) {
                    C12ES.LJIILL(0, this.LJIILIIL);
                } else if ((this.LJIIJJI.getLayoutParams() instanceof FrameLayout.LayoutParams) && this.LJJII != 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.LJIIJJI.getLayoutParams();
                    if (this.LJJII == 3) {
                        f = 6.0f;
                        f2 = 6.0f;
                    } else {
                        f = 11.0f;
                        f2 = 10.0f;
                    }
                    marginLayoutParams2.setMarginEnd((int) C497740JfY.LIZIZ(f));
                    marginLayoutParams2.setMarginStart((int) C497740JfY.LIZIZ(f2));
                    C786410Ut5.c6(this.LJIIJJI, marginLayoutParams2);
                }
                C12ES.LJIILL(0, this.LJIIJJI);
                C12ES.LJIILL(8, this.LJIIL);
                LJIILLIIL();
                if (!this.LJJI.booleanValue()) {
                    return;
                }
                C786410Ut5.LJLLLLLL(0, this.LJIIIZ);
                return;
            case 4:
                if (!this.LJJIIJ) {
                    C12ES.LJIILL(0, this.LJ);
                }
                C12ES.LJIILL(0, this.LJIIJJI);
                C12ES.LJIILL(0, this.LJIILIIL);
                C786410Ut5.Qb(this.LJIIL, 0.0f);
                C786410Ut5.rc(this.LJIIL, 0.0f);
                C12ES.LJIILL(0, this.LJIIL);
                if (LiveImageLoaderModuleSetting.useImageModule()) {
                    C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(LJII().getUrls());
                    c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_INSIDE;
                    c1324610kZfLIZJ.LJJI(this.LJIIL);
                } else {
                    C1322000kVS c1322000kVSLJFF = C1322000kVS.LJFF(this.LJIIL.getContext());
                    c1322000kVSLJFF.LIZ(ImageView.ScaleType.CENTER_INSIDE);
                    c1322000kVSLJFF.LJFF = LJII();
                    c1322000kVSLJFF.LIZJ(this.LJIIL);
                }
                if (this.LIZJ == null || this.LJIILL != EnumC1096020ecy.SUBSCRIBE_ANIM) {
                    return;
                }
                if (!this.LJJIL) {
                    LIZ(EnumC1096020ecy.SUBSCRIBED);
                    return;
                }
                ChangeBounds changeBounds2 = new ChangeBounds();
                changeBounds2.setDuration(200L);
                TransitionManager.beginDelayedTransition((ViewGroup) this.LIZJ, changeBounds2);
                ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.LJIIJJI, (Property<ImageView, Float>) View.SCALE_X, 1.0f, 0.0f).setDuration(300L);
                duration3.setInterpolator(C0GY9.LIZIZ(1.0f, -0.62f, 0.63f, 0.9f));
                duration3.addListener(new ALAdapterS13S0100000_17(this, 65));
                duration3.setStartDelay(200L);
                ObjectAnimator duration4 = ObjectAnimator.ofFloat(this.LJIIJJI, (Property<ImageView, Float>) View.SCALE_Y, 1.0f, 0.0f).setDuration(300L);
                duration4.setInterpolator(C0GY9.LIZIZ(1.0f, -0.62f, 0.63f, 0.9f));
                duration4.setStartDelay(200L);
                ObjectAnimator duration5 = ObjectAnimator.ofFloat(this.LJIIL, (Property<ImageView, Float>) View.SCALE_X, 0.0f, 1.0f).setDuration(300L);
                duration5.setInterpolator(C0GY9.LIZIZ(0.17f, 0.89f, 0.32f, 1.77f));
                duration5.addListener(new ALAdapterS13S0100000_17(this, 68));
                duration5.setStartDelay(200L);
                ObjectAnimator duration6 = ObjectAnimator.ofFloat(this.LJIIL, (Property<ImageView, Float>) View.SCALE_Y, 0.0f, 1.0f).setDuration(300L);
                duration6.setInterpolator(C0GY9.LIZIZ(0.17f, 0.89f, 0.32f, 1.77f));
                duration6.setStartDelay(200L);
                ObjectAnimator duration7 = ObjectAnimator.ofFloat(this.LJIILIIL, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(150L);
                duration7.setStartDelay(3200L);
                duration7.addListener(new ALAdapterS13S0100000_17(this, 71));
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.LJJ = animatorSet2;
                animatorSet2.playTogether(duration3, duration4, duration5, duration6, duration7);
                this.LJJ.start();
                return;
            case 5:
                if (this.LJ.getBackground() instanceof GradientDrawable) {
                    ((GradientDrawable) this.LJ.getBackground()).setColor(C20736316Cj.LIZIZ(R.attr.c9i, this.LJJIFFI));
                } else {
                    LJIIIIZZ();
                }
                LJIJJLI(12.0f);
                ImageView imageView = this.LJIIL;
                if (imageView != null && imageView.getVisibility() == 8) {
                    Room room = this.LJIJJ;
                    if (room != null && room.getOwner() != null && this.LJIJJ.getOwner().getSubscribeInfo() != null) {
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_privilege_badge_show");
                        c474500IjALIZ.LJIJJLI(this.LJIJ);
                        c474500IjALIZ.LJJII(Long.valueOf(this.LJIJJ.getOwnerUserId()), "anchor_id");
                        c474500IjALIZ.LJJII(Long.valueOf(this.LJIJJ.getId()), "room_id");
                        w.LIZ.getClass();
                        c474500IjALIZ.LJJII(w.LJIIIZ(), "enter_from_merge");
                        c474500IjALIZ.LJJII(w.LJIIL(), "enter_method");
                        c474500IjALIZ.LJJII("click", "action_type");
                        c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
                        c474500IjALIZ.LJJII(w.LJJII(), "video_id");
                        c474500IjALIZ.LJJII("live_left_corner", "show_entrance");
                        if (this.LJIJJ.getOwner().getSubscribeInfo().getSubscribeBadge() != null) {
                            c474500IjALIZ.LJJII(Boolean.valueOf(this.LJIJJ.getOwner().getSubscribeInfo().getSubscribeBadge().isCustomized), "is_customized");
                        }
                        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                            c474500IjALIZ.LIZ();
                        } else {
                            c474500IjALIZ.LJJIJLIJ();
                            c474500IjALIZ.LJJIJL();
                        }
                        JSONObject jSONObject = new JSONObject();
                        C0K04.LJFF("show_entrance", "live_left_corner", jSONObject);
                        C510380Jzw.LJIL("subscription_badge_userinfo_show", jSONObject);
                        RecyclableWidgetManager recyclableWidgetManager = (RecyclableWidgetManager) this.LJIJ.gg0(C781240Ukk.class);
                        long jLIZLLL = 0;
                        if (recyclableWidgetManager != null) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            Long l = (Long) ((LinkedHashMap) C1082080eGU.LIZJ).get(recyclableWidgetManager);
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            j = jUptimeMillis - jLongValue;
                            jLIZLLL = C1082080eGU.LIZLLL(recyclableWidgetManager);
                        } else {
                            j = 0;
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        C0K02.LJIIJ(jSONObject2);
                        Long lValueOf = Long.valueOf(j);
                        if (lValueOf != null) {
                            jSONObject2.put("subs_btn_load_self_duration", lValueOf);
                        }
                        Long lValueOf2 = Long.valueOf(jLIZLLL);
                        if (lValueOf2 != null) {
                            jSONObject2.put("subs_btn_load_total_duration", lValueOf2);
                        }
                        C1CC2.LJIIIIZZ("ttlive_subscription_perf_badge_show", 0, jSONObject2);
                    }
                    LJIILLIIL();
                }
                if (!this.LJJIIJ) {
                    C12ES.LJIILL(0, this.LJ);
                }
                C12ES.LJIILL(0, this.LJIIL);
                if (LiveImageLoaderModuleSetting.useImageModule()) {
                    C1324610kZf c1324610kZfLIZJ2 = C1819620xS4.LIZ().LIZJ(LJII().getUrls());
                    c1324610kZfLIZJ2.LJIJJ = ImageView.ScaleType.CENTER_INSIDE;
                    c1324610kZfLIZJ2.LJJI(this.LJIIL);
                } else {
                    C1322000kVS c1322000kVSLJFF2 = C1322000kVS.LJFF(this.LJIIL.getContext());
                    c1322000kVSLJFF2.LIZ(ImageView.ScaleType.CENTER_INSIDE);
                    c1322000kVSLJFF2.LJFF = LJII();
                    c1322000kVSLJFF2.LIZJ(this.LJIIL);
                }
                if ((this.LJIIL.getLayoutParams() instanceof FrameLayout.LayoutParams) && this.LJJII != 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) this.LJIIL.getLayoutParams();
                    marginLayoutParams3.setMarginEnd((int) C497740JfY.LIZIZ(9.0f));
                    C786410Ut5.c6(this.LJIIL, marginLayoutParams3);
                }
                if (this.LJJI.booleanValue()) {
                    C786410Ut5.LJLLLLLL(8, this.LJIIIZ);
                }
                DataChannel dataChannel = this.LJIJ;
                if (dataChannel == null) {
                    return;
                }
                dataChannel.FQ2(UserContainerWidgetChangeEvent.class);
                return;
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                LJIJJLI(4.0f);
                if (this.LJ.getBackground() instanceof GradientDrawable) {
                    ((GradientDrawable) this.LJ.getBackground()).setColor(C20736316Cj.LIZIZ(R.attr.c9i, this.LJJIFFI));
                } else {
                    LJIIIIZZ();
                }
                if (!this.LJJIIJ) {
                    C12ES.LJIILL(0, this.LJ);
                }
                if (!this.LJIJI && this.LJII != null && (!this.LJJIJL || !LiveFansClubTopOneOptSetting.INSTANCE.getValue())) {
                    this.LJII.setMinimumWidth(0);
                    this.LJJIJL = true;
                } else {
                    this.LJJIJL = false;
                }
                if (!this.LJIJI) {
                    InterfaceC1096360edW interfaceC1096360edW = this.LJJIJIIJI;
                    if (interfaceC1096360edW == null) {
                        return;
                    }
                    if (enumC1096020ecy != EnumC1096020ecy.FANS_CLUB_JOINED && enumC1096020ecy != EnumC1096020ecy.FANS_CLUB_JOINED_PUSH_FOLLOWED) {
                        z3 = false;
                    }
                    interfaceC1096360edW.LJIIIZ(z3);
                    C12ES.LJIILL(0, this.LJJIIZ);
                    this.LJJIJIIJI.LJII(enumC1096020ecy);
                    return;
                }
                if (this.LJJIJ == null) {
                    return;
                }
                C12ES.LJIILL(0, this.LJJIIZI);
                this.LJJIJ.LJII(enumC1096020ecy);
                return;
            default:
                if (LIZLLL()) {
                    if (this.LJJIJIIJIL) {
                        LIZ(EnumC1096020ecy.FANS_CLUB_JOINED_PUSH_FOLLOWED);
                    } else {
                        if (LJIIL()) {
                            if (this.LJIJI) {
                                ViewGroup viewGroup4 = this.LJIILJJIL;
                                viewGroup4.setPadding(viewGroup4.getPaddingStart(), this.LJIILJJIL.getPaddingTop(), this.LJIILJJIL.getPaddingStart(), this.LJIILJJIL.getPaddingBottom());
                            }
                            if (this.LJIJI) {
                                enumC1096020ecy2 = EnumC1096020ecy.FANS_CLUB_JOINED_ANIM;
                            } else {
                                enumC1096020ecy2 = EnumC1096020ecy.FANS_CLUB_JOINED;
                            }
                            LIZ(enumC1096020ecy2);
                        } else if (this.LJJIJIL) {
                            LIZ(EnumC1096020ecy.FANS_CLUB_UNJOIN);
                        } else {
                            LIZ(EnumC1096020ecy.FANS_CLUB_UNJOIN_DELAY_ANIM);
                        }
                        break;
                    }
                    this.LJJIJIIJIL = false;
                    return;
                }
                LJIIJ();
                LJIJJLI(12.0f);
                C12ES.LJIILL(8, this.LJ);
                if (!LiveMainFrameUpdateFontOptSetting.INSTANCE.disableFontSizeScale()) {
                    return;
                }
                C12ES.LJIILL(8, this.LJII);
                return;
        }
    }

    public final void LJIIIZ(View view) throws JSONException {
        DataChannel dataChannel = this.LJIJ;
        if (dataChannel != null && dataChannel.gg0(C0TZM.class) != null && !((Boolean) this.LJIJ.gg0(C0TZM.class)).booleanValue()) {
            C784440Upu.LIZ().LIZIZ(new C0IF2("subscribe_live_left_corner"));
            return;
        }
        if (C497740JfY.LJII() != null && view.getId() == R.id.rvp) {
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2();
            C494790Jan.LJIIJJI(C497740JfY.LJII(), this.LJIJJ, "live_left_corner", null);
        } else {
            if (C497740JfY.LJII() == null) {
                return;
            }
            if (view.getId() != R.id.wi_ && view.getId() != R.id.wi8 && view.getId() != R.id.wik) {
                return;
            }
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).w2().LIZ(C497740JfY.LJII(), this.LJIJJ, "live_left_corner", null, null, 0L, 0L);
        }
    }

    public final void LJIJ(boolean z) {
        this.LJJIII = z;
        if (z) {
            InterfaceC1096360edW interfaceC1096360edW = this.LJJIJIIJI;
            if (interfaceC1096360edW != null) {
                interfaceC1096360edW.LLLILZJ();
            }
            InterfaceC1096360edW interfaceC1096360edW2 = this.LJJIJ;
            if (interfaceC1096360edW2 != null) {
                interfaceC1096360edW2.LLLILZJ();
            }
        }
    }

    public final void LJIJJ(int i) {
        ViewGroup viewGroup = this.LJ;
        if (viewGroup == null) {
            return;
        }
        if (viewGroup.getBackground() instanceof GradientDrawable) {
            ((GradientDrawable) this.LJ.getBackground()).setColor(i);
        } else {
            LJIIIIZZ();
        }
    }

    public final void LJIJJLI(float f) {
        if ((this.LIZIZ.getLayoutParams() instanceof C19ME) && this.LJJII != 2) {
            C19MB c19mb = new C19MB();
            ViewGroup viewGroup = this.LJIILJJIL;
            if (viewGroup instanceof ConstraintLayout) {
                c19mb.LJII((ConstraintLayout) viewGroup);
                c19mb.LJJIIJZLJL(this.LIZIZ.getId(), 2, (int) C497740JfY.LIZIZ(f));
                c19mb.LJJIIJZLJL(this.LIZIZ.getId(), 7, (int) C497740JfY.LIZIZ(f));
                c19mb.LIZIZ((ConstraintLayout) this.LJIILJJIL);
            }
        }
    }

    public final void LJIIZILJ(FollowPair followPair, boolean z) {
        if (!this.LJJIII) {
            return;
        }
        IMicRoomService iMicRoomService = this.LJIILLIIL;
        if (iMicRoomService != null && iMicRoomService.On1() && (this.LJJII == 1 || (LJIILJJIL() && this.LJJII == 3))) {
            Room room = (Room) this.LJIJ.gg0(RoomChannel.class);
            if (room != null) {
                room.officialChannelInfo.channelUser.setFollowStatus(followPair.LIZ());
            }
            this.LJIJ.zW(RoomChannel.class, room);
        } else {
            Room room2 = (Room) this.LJIJ.gg0(RoomChannel.class);
            room2.getOwner().setFollowStatus(followPair.LIZ());
            this.LJIJ.zW(RoomChannel.class, room2);
        }
        if (followPair.LIZ() == 0) {
            LIZ(EnumC1096020ecy.UNFOLLOW);
        } else if (z) {
            if (!LJIJI(this.LJIJ)) {
                LIZ(EnumC1096020ecy.FOLLOW_ANIM);
            } else {
                LIZ(EnumC1096020ecy.FOLLOWED);
            }
        }
        this.LJIJ.LC0(FollowAnchorStateChangeEvent.class, Integer.valueOf(followPair.LIZ()));
        Room room3 = ((C0IR5) this.LJIJ.gg0(C1087000eOQ.class)).LIZIZ;
        if (room3 != null && room3.getOwner() != null && room3.getOwner().getFollowInfo() != null && room3.getOwner().getId() == followPair.LIZ) {
            room3.getOwner().getFollowInfo().setFollowStatus(followPair.LIZJ);
        }
    }

    public C1096340edU(LiveIconView liveIconView, View view, View view2, View view3, ViewGroup viewGroup, View view4, C16F5 c16f5, View view5, C1126540fQC c1126540fQC, ImageView imageView, ImageView imageView2, TextView textView, ViewGroup viewGroup2, DataChannel dataChannel, Context context, View view6, ViewGroup viewGroup3, int i, LifecycleOwner lifecycleOwner) {
        boolean z;
        IFansClubService iFansClubService;
        ViewGroup.LayoutParams layoutParams;
        this.LJJIIZI = null;
        if (SubscriptionAudienceEntranceEnhanceSetting.INSTANCE.getValue() && C497740JfY.LJJI(C497740JfY.LJIIZILJ()) > SubscriptionIconHideTextMinimumDimensionSetting.INSTANCE.getValue() && !SubscriptionIconNeedHideTextSetting.INSTANCE.getValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LJJIL = z;
        this.LJIIIIZZ = liveIconView;
        this.LIZ = view;
        this.LIZIZ = view2;
        this.LIZLLL = view3;
        this.LJ = viewGroup;
        this.LJFF = view4;
        this.LJII = viewGroup3;
        this.LJI = c16f5;
        this.LJIIIZ = view5;
        this.LJIIJ = c1126540fQC;
        this.LJIIJJI = imageView;
        this.LJIIL = imageView2;
        this.LJIILIIL = textView;
        this.LJIILJJIL = viewGroup2;
        this.LJIILLIIL = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        this.LJIIZILJ = (IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class);
        this.LJIJ = dataChannel;
        boolean zBooleanValue = ((Boolean) dataChannel.gg0(UserIsAnchorChannel.class)).booleanValue();
        this.LJIJI = zBooleanValue;
        this.LJIJJ = (Room) dataChannel.gg0(RoomChannel.class);
        this.LJJIFFI = context;
        this.LIZJ = view6;
        this.LJJII = i;
        if ((view6 instanceof ViewGroup) && LIZLLL() && view6 != null && (iFansClubService = (IFansClubService) C1161920gLG.LIZJ(IFansClubService.class)) != null) {
            if (!zBooleanValue) {
                this.LJJIIJZLJL = (ImageView) view6.findViewById(R.id.zlh);
                ViewGroup viewGroup4 = (ViewGroup) view6.findViewById(R.id.hr3);
                this.LJJIIZ = viewGroup4;
                this.LJJIJIIJI = iFansClubService.qj0(false, viewGroup4, this, lifecycleOwner, dataChannel);
            } else {
                ViewGroup viewGroup5 = (ViewGroup) view6.findViewById(R.id.hr2);
                this.LJJIIZI = viewGroup5;
                this.LJJIJ = iFansClubService.qj0(zBooleanValue, viewGroup5, this, lifecycleOwner, dataChannel);
                if (viewGroup2 != null && (viewGroup2 instanceof ConstraintLayout)) {
                    ((ConstraintLayout) viewGroup2).setMaxWidth(viewGroup2.getContext().getResources().getDimensionPixelSize(R.dimen.ao8));
                }
                if (C497740JfY.LJJ() && view2 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 instanceof C19ME) {
                        ((C19ME) layoutParams2).endToEnd = -1;
                    }
                }
                if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null && (layoutParams instanceof C19ME)) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd((int) C497740JfY.LIZIZ(4.0f));
                }
            }
        }
        if (LJIILIIL() && LJIILJJIL()) {
            int iLIZIZ = (int) C497740JfY.LIZIZ(3.0f);
            c1126540fQC.setPadding(iLIZIZ, iLIZIZ, iLIZIZ, iLIZIZ);
        } else {
            c1126540fQC.setPadding(0, 0, 0, 0);
        }
    }
}
