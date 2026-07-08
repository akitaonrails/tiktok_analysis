package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS20S1100000_15;
import Y.ARunnableS84S0200000_15;
import Y.AUListenerS264S0100000_15;
import Y.AfS184S0100000_15;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import avg.f;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayStatusChangeEvent;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.LinkInGuestCountDownFinishChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTicketIconNotUpdateFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicTicketIconUrlSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestIconResourceOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLeaveGiftRankIsUSRegionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestMockFanticketUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS164S1100000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import mf.a;

/* JADX INFO: renamed from: X.0aYs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C939720aYs extends FrameLayout implements InterfaceC938310aWb, WeakHandler.IHandler, C0UUU {
    public boolean adjustParent;
    public ValueAnimator animatorScrollIn;
    public ValueAnimator animatorScrollOut;
    public C1324720kZq avatarBackground;
    public C11NJ compositeDisposable;
    public InterfaceC420801kM countDownDisposable;
    public C945640aiQ countDownLayout;
    public ViewStub countDownLayoutStub;
    public int currentState;
    public String currentTicketDisplayString;
    public final C01GW expressionHelper$delegate;
    public View fanTicketContainer;
    public View fanTicketContainerInner;
    public boolean hasInit;
    public boolean hasLoadingFinished;
    public final String interactId;
    public String lastTicketIconUrl;
    public C16FZ liveLoadingView;
    public ViewGroup liveShowOrderContainer;
    public C16F5 liveShowOrderTv;
    public C01FR liveShowStateListener;
    public boolean mAttachedToWindow;
    public boolean mCurrentUserIsLinkedGuest;
    public final DataChannel mDataChannel;
    public final WeakHandler mHandler;
    public boolean mHasCountDownFinished;
    public boolean mNeedPrepareLoading;
    public TextView mOnlineName;
    public View mOnlinePlayerClose;
    public ViewGroup mOnlineViewContainer;
    public ViewGroup mPrepareViewContainer;
    public AbstractC938280aWY mPresenter;
    public C16FV networkStateImageView;
    public final C01GW newStyleFanTicketIconDrawable$delegate;
    public View nickNameContainer;
    public C1105630esT onlineTicket;
    public C1105630esT onlineTicketAnimation;
    public C1126540fQC onlineTicketIcon;
    public LiveIconView onlineTicketPlusIcon;
    public ConstraintLayout pauseContainer;
    public C1126540fQC pauseImageView;
    public ViewStub pauseLayoutViewStub;
    public C16F5 pauseMainText;
    public C16F5 pauseSecondText;
    public C1324720kZq prepareAvatarImage;
    public C1324720kZq prepareAvatarView;
    public C1324720kZq prepareBackground;
    public ConstraintLayout prepareContainer;
    public ViewStub prepareLayoutViewStub;
    public C16FZ prepareLoadingView;
    public boolean shouldShowCountDownLayoutWhenResume;
    public boolean ticketIconLoaded;
    public C1106010et5 timeCircleViewV2;
    public C1088120eQE timeCountdownViewV2;
    public View timerViewLayout;
    public ViewStub timerViewStub;
    public InterfaceC937840aVq window;
    public static final C940730aaV Companion = new Object() { // from class: X.0aaV
    };
    public static final int $stable = 8;

    public final int getWindowLayoutId() {
        return R.layout.hu4;
    }

    public void onSingleTapConfirm() {
        invokeSendGiftPanel$default(this, null, 1, null);
    }

    public void updateUserInfo(User user) {
    }

    private final boolean currentStateIsConnecting() {
        return this.currentState == 1;
    }

    private final C1AGN getExpressionHelper() {
        return (C1AGN) this.expressionHelper$delegate.getValue();
    }

    private final TuxIconDrawable getNewStyleFanTicketIconDrawable() {
        return (TuxIconDrawable) this.newStyleFanTicketIconDrawable$delegate.getValue();
    }

    private final void initOnlineWindow() {
        View.OnClickListener aCListenerS150S0100000_15 = new ACListenerS150S0100000_15(this, 70);
        if (C1848410yCV.LIZ) {
            aCListenerS150S0100000_15 = new f(aCListenerS150S0100000_15);
        }
        a aVar = new a(aCListenerS150S0100000_15);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000b, B:7:0x0014, B:13:0x001f, B:14:0x0028, B:18:0x002f, B:19:0x0038, B:21:0x003c, B:22:0x0045), top: B:29:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void initPrepareLayout() {
        /*
            r3 = this;
            android.view.ViewStub r1 = r3.prepareLayoutViewStub     // Catch: java.lang.Throwable -> L48
            r0 = 0
            if (r1 == 0) goto L17
            android.view.View r2 = X.C786410Ut5.LJLLLL(r1)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L18
            r1 = 2131386167(0x7f0a5f37, float:1.8392785E38)
            android.view.View r1 = r2.findViewById(r1)     // Catch: java.lang.Throwable -> L48
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1     // Catch: java.lang.Throwable -> L48
        L14:
            r3.prepareContainer = r1     // Catch: java.lang.Throwable -> L48
            goto L1a
        L17:
            r2 = r0
        L18:
            r1 = r0
            goto L14
        L1a:
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r1 = r0
            goto L28
        L1f:
            r1 = 2131386166(0x7f0a5f36, float:1.8392783E38)
            android.view.View r1 = r2.findViewById(r1)     // Catch: java.lang.Throwable -> L48
            X.0kZq r1 = (X.C1324720kZq) r1     // Catch: java.lang.Throwable -> L48
        L28:
            r3.prepareBackground = r1     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L2d
            goto L2f
        L2d:
            r1 = r0
            goto L38
        L2f:
            r1 = 2131386165(0x7f0a5f35, float:1.839278E38)
            android.view.View r1 = r2.findViewById(r1)     // Catch: java.lang.Throwable -> L48
            X.0kZq r1 = (X.C1324720kZq) r1     // Catch: java.lang.Throwable -> L48
        L38:
            r3.prepareAvatarImage = r1     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L45
            r0 = 2131380664(0x7f0a49b8, float:1.8381623E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Throwable -> L48
            X.16FZ r0 = (X.C16FZ) r0     // Catch: java.lang.Throwable -> L48
        L45:
            r3.prepareLoadingView = r0     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            android.view.ViewStub r1 = r3.prepareLayoutViewStub
            if (r1 == 0) goto L54
            r0 = 0
            X.C12ES.LJIILL(r0, r1)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939720aYs.initPrepareLayout():void");
    }

    private final boolean isDefaultStyle() {
        String strLJIIIIZZ;
        AbstractC938280aWY abstractC938280aWY = this.mPresenter;
        return abstractC938280aWY == null || (strLJIIIIZZ = abstractC938280aWY.LJIIIIZZ()) == null || a0.LJJJIL(strLJIIIIZZ) || Intrinsics.LJFF(strLJIIIIZZ, "default");
    }

    private final void onCoinsClickInUS() {
        C940280aZm.LIZ(getContext(), this.mDataChannel);
    }

    private final void openGiftRankDialog() {
        User userLJIIIZ;
        AbstractC938280aWY abstractC938280aWY = this.mPresenter;
        C01ZG.LIZ(getContext(), Long.valueOf((abstractC938280aWY == null || (userLJIIIZ = abstractC938280aWY.LJIIIZ()) == null) ? 0L : userLJIIIZ.getId()));
    }

    private final void updateCountDownLayoutSize() {
        int i;
        C945640aiQ c945640aiQ = this.countDownLayout;
        if (c945640aiQ != null) {
            ViewGroup.LayoutParams layoutParams = this.window.LJJIIJ().getLayoutParams();
            if (layoutParams == null || (i = layoutParams.width) <= 0) {
                HandlerHook.viewPost(this, new ARunnableS84S0200000_15(this, c945640aiQ, 17));
            } else {
                c945640aiQ.LIZJ(i);
            }
        }
    }

    public final void animateBg() {
        ViewGroup viewGroup;
        View view = this.fanTicketContainer;
        if (view == null || (viewGroup = this.mOnlineViewContainer) == null) {
            return;
        }
        View view2 = new View(getContext());
        View view3 = this.fanTicketContainer;
        int width = view3 != null ? view3.getWidth() : 0;
        View view4 = this.fanTicketContainer;
        C19ME c19me = new C19ME(width, view4 != null ? view4.getHeight() : 0);
        c19me.startToStart = 0;
        c19me.topToTop = 0;
        c19me.bottomToBottom = -1;
        c19me.endToEnd = -1;
        C786410Ut5.W5(view2, c19me);
        view2.setBackgroundResource(R.drawable.e3i);
        try {
            int iIndexOfChild = viewGroup.indexOfChild(view);
            if (iIndexOfChild >= 0 && iIndexOfChild < viewGroup.getChildCount()) {
                C930540aK4.LJJIL(iIndexOfChild, view2, viewGroup);
            }
            C954140aw8.LIZ(view2, new AwS559S0100000_15(view2, 290));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJ("BaseMultiGuestV3Mask", String.valueOf(th.getMessage()));
        }
    }

    public final TextView getMOnlineName() {
        TextView textView = this.mOnlineName;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final C16FV getNetworkStateImageView() {
        C16FV c16fv = this.networkStateImageView;
        if (c16fv != null) {
            return c16fv;
        }
        return null;
    }

    public final void initCountDownLayout() {
        if (this.countDownLayout == null) {
            try {
                ViewStub viewStub = this.countDownLayoutStub;
                Unit unit = null;
                View viewLJLLLL = viewStub != null ? C786410Ut5.LJLLLL(viewStub) : null;
                this.countDownLayout = viewLJLLLL instanceof C945640aiQ ? (C945640aiQ) viewLJLLLL : null;
                updateCountDownLayoutSize();
                C945640aiQ c945640aiQ = this.countDownLayout;
                if (c945640aiQ != null) {
                    C786410Ut5.p8(c945640aiQ, new ACListenerS150S0100000_15(this, 69));
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000b, B:7:0x0014, B:13:0x001f, B:14:0x0028, B:18:0x002f, B:19:0x0038, B:21:0x003c, B:22:0x0045), top: B:29:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initPauseLayout$liveinteract_impl_release() {
        /*
            r3 = this;
            android.view.ViewStub r1 = r3.pauseLayoutViewStub     // Catch: java.lang.Throwable -> L48
            r0 = 0
            if (r1 == 0) goto L17
            android.view.View r2 = X.C786410Ut5.LJLLLL(r1)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L18
            r1 = 2131383997(0x7f0a56bd, float:1.8388383E38)
            android.view.View r1 = r2.findViewById(r1)     // Catch: java.lang.Throwable -> L48
            X.0fQC r1 = (X.C1126540fQC) r1     // Catch: java.lang.Throwable -> L48
        L14:
            r3.pauseImageView = r1     // Catch: java.lang.Throwable -> L48
            goto L1a
        L17:
            r2 = r0
        L18:
            r1 = r0
            goto L14
        L1a:
            if (r2 == 0) goto L1d
            goto L1f
        L1d:
            r1 = r0
            goto L28
        L1f:
            r1 = 2131383996(0x7f0a56bc, float:1.8388381E38)
            android.view.View r1 = r2.findViewById(r1)     // Catch: java.lang.Throwable -> L48
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1     // Catch: java.lang.Throwable -> L48
        L28:
            r3.pauseContainer = r1     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L2d
            goto L2f
        L2d:
            r1 = r0
            goto L38
        L2f:
            r1 = 2131384005(0x7f0a56c5, float:1.83884E38)
            android.view.View r1 = r2.findViewById(r1)     // Catch: java.lang.Throwable -> L48
            X.16F5 r1 = (X.C16F5) r1     // Catch: java.lang.Throwable -> L48
        L38:
            r3.pauseMainText = r1     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L45
            r0 = 2131384014(0x7f0a56ce, float:1.8388418E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Throwable -> L48
            X.16F5 r0 = (X.C16F5) r0     // Catch: java.lang.Throwable -> L48
        L45:
            r3.pauseSecondText = r0     // Catch: java.lang.Throwable -> L48
            return
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            android.view.ViewStub r1 = r3.pauseLayoutViewStub
            if (r1 == 0) goto L54
            r0 = 0
            X.C12ES.LJIILL(r0, r1)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939720aYs.initPauseLayout$liveinteract_impl_release():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000b, B:7:0x0014, B:11:0x001c, B:12:0x0025, B:14:0x0029, B:15:0x002e), top: B:22:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x000b, B:7:0x0014, B:11:0x001c, B:12:0x0025, B:14:0x0029, B:15:0x002e), top: B:22:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void initTimerView() {
        /*
            r3 = this;
            android.view.ViewStub r0 = r3.timerViewStub     // Catch: java.lang.Throwable -> L31
            r1 = 0
            if (r0 == 0) goto L17
            android.view.View r2 = X.C786410Ut5.LJLLLL(r0)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L18
            r0 = 2131379987(0x7f0a4713, float:1.838025E38)
            android.view.View r0 = r2.findViewById(r0)     // Catch: java.lang.Throwable -> L31
            X.0et5 r0 = (X.C1106010et5) r0     // Catch: java.lang.Throwable -> L31
        L14:
            r3.timeCircleViewV2 = r0     // Catch: java.lang.Throwable -> L31
            goto L1a
        L17:
            r2 = r1
        L18:
            r0 = r1
            goto L14
        L1a:
            if (r2 == 0) goto L25
            r0 = 2131379991(0x7f0a4717, float:1.8380258E38)
            android.view.View r1 = r2.findViewById(r0)     // Catch: java.lang.Throwable -> L31
            X.0eQE r1 = (X.C1088120eQE) r1     // Catch: java.lang.Throwable -> L31
        L25:
            r3.timeCountdownViewV2 = r1     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L2e
            r0 = 1096810496(0x41600000, float:14.0)
            r1.setTextSize(r0)     // Catch: java.lang.Throwable -> L31
        L2e:
            r3.timerViewLayout = r2     // Catch: java.lang.Throwable -> L31
            return
        L31:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            android.view.ViewStub r1 = r3.timerViewStub
            if (r1 == 0) goto L3d
            r0 = 0
            X.C12ES.LJIILL(r0, r1)
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939720aYs.initTimerView():void");
    }

    public final boolean isAnchor() {
        Room room;
        DataChannel dataChannel = this.mDataChannel;
        return ((dataChannel == null || (room = (Room) dataChannel.gg0(RoomChannel.class)) == null) ? 0L : room.getOwnerUserId()) == UserService.getInstance().user().getCurrentUserId();
    }

    public final boolean isSelf$liveinteract_impl_release() {
        AbstractC938280aWY abstractC938280aWY = this.mPresenter;
        return (abstractC938280aWY != null && abstractC938280aWY.LJIIJJI()) || this.window.LIZ() == UserService.getInstance().user().getCurrentUserId();
    }

    public final void onCoinsClick() {
        boolean zIsInUS = MultiGuestLeaveGiftRankIsUSRegionSetting.INSTANCE.isInUS();
        if (zIsInUS) {
            onCoinsClickInUS();
        } else {
            if (zIsInUS) {
                throw new C1954807lC();
            }
            openGiftRankDialog();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        if (this.adjustParent) {
            super.onDetachedFromWindow();
            return;
        }
        DataChannel dataChannel = this.mDataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.mAttachedToWindow = false;
        this.mHandler.removeCallbacksAndMessages(null);
        this.hasInit = false;
        AbstractC938280aWY abstractC938280aWY = this.mPresenter;
        if (abstractC938280aWY != null) {
            abstractC938280aWY.LIZIZ();
        }
        this.compositeDisposable.LJ();
        this.ticketIconLoaded = false;
        this.lastTicketIconUrl = null;
        removeLiveShowStateListener();
        super.onDetachedFromWindow();
    }

    public final void switchCamera() {
        if (this.window.LIZLLL() == null || !(this.window.LIZLLL() instanceof InterfaceC923870a9J)) {
            return;
        }
        ((InterfaceC923870a9J) this.window.LIZLLL()).LJ(CertProviderManagerKt.findCert("bpea-linkmic_basemask_switchCamera", 1476788233));
    }

    public final void updateOnlineCloseUI() {
        View view;
        if (this.mOnlinePlayerClose == null) {
            return;
        }
        if (this.mCurrentUserIsLinkedGuest && isSelf$liveinteract_impl_release()) {
            View view2 = this.mOnlinePlayerClose;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
        } else {
            View view3 = this.mOnlinePlayerClose;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
        }
        if (isAnchor() && (view = this.mOnlinePlayerClose) != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        View view4 = this.mOnlinePlayerClose;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
    }

    private final void addLiveShowStateListener() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LJFF(this.liveShowStateListener);
        }
    }

    private final void initViewStubs() {
        this.pauseLayoutViewStub = (ViewStub) findViewById(R.id.b1_);
        this.prepareLayoutViewStub = (ViewStub) findViewById(R.id.roi);
        this.timerViewStub = (ViewStub) findViewById(R.id.xy4);
        this.countDownLayoutStub = (ViewStub) findViewById(R.id.ezt);
    }

    private final void removeLiveShowStateListener() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (interfaceC302601FgLIZ != null) {
            interfaceC302601FgLIZ.LJIIIZ(this.liveShowStateListener);
        }
    }

    private final void updateCornerStyle() {
        if (C917900Zzg.LIZ()) {
            ViewGroup viewGroup = this.liveShowOrderContainer;
            if (viewGroup != null) {
                viewGroup.setBackgroundResource(R.drawable.ea_);
            }
            View view = this.nickNameContainer;
            if (view != null) {
                view.setBackgroundResource(R.drawable.ea_);
            }
            View view2 = this.fanTicketContainerInner;
            if (view2 != null) {
                view2.setBackgroundResource(R.drawable.ea_);
            }
        }
    }

    public final void clearTicketUIPlayingStyle() {
        View view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clearTicketUIPlayingStyle ");
        sbLIZ.append(this.window.LJIIIIZZ());
        C20441214yg.LJIIIZ("FanTicketContLog", C2188811AlT.LIZIZ(sbLIZ));
        if (isDefaultStyle() && (view = this.fanTicketContainerInner) != null) {
            view.setBackgroundResource(R.drawable.ea9);
        }
        LiveIconView liveIconView = this.onlineTicketPlusIcon;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C439101nJ.LJI(liveIconView);
        changeOnlineTicketTextMarginStart((int) C497740JfY.LIZIZ(2));
    }

    public void initView() {
        initViewStubs();
        setNetworkStateImageView((C16FV) findViewById(R.id.lpm));
        setMOnlineName((TextView) findViewById(R.id.p94));
        this.nickNameContainer = findViewById(R.id.p96);
        C1105630esT c1105630esT = (C1105630esT) findViewById(R.id.pn8);
        c1105630esT.setOptState(false);
        if (C917900Zzg.LIZ()) {
            c1105630esT.LJJJI(R.style.a9k);
        }
        this.onlineTicket = c1105630esT;
        C1105630esT c1105630esT2 = (C1105630esT) findViewById(R.id.pn9);
        c1105630esT2.setOptState(false);
        this.onlineTicketAnimation = c1105630esT2;
        this.onlineTicketIcon = (C1126540fQC) findViewById(R.id.pn_);
        this.onlineTicketPlusIcon = (LiveIconView) findViewById(R.id.pna);
        this.mOnlineViewContainer = (ViewGroup) findViewById(R.id.pmw);
        this.fanTicketContainer = findViewById(R.id.mgt);
        this.fanTicketContainerInner = findViewById(R.id.mgu);
        this.liveShowOrderContainer = (ViewGroup) findViewById(R.id.n6_);
        this.liveShowOrderTv = (C16F5) findViewById(R.id.n6a);
        this.shouldShowCountDownLayoutWhenResume = false;
        updateCornerStyle();
        this.hasInit = true;
    }

    public final boolean isInPlayMode() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if (C500260Jjc.LJJJI(interfaceC302601FgLIZ != null ? Boolean.valueOf(interfaceC302601FgLIZ.LJIJI()) : null)) {
            return true;
        }
        InterfaceC927690aFT interfaceC927690aFTLIZ = C924220a9s.LIZ();
        if (C500260Jjc.LJJJI(interfaceC927690aFTLIZ != null ? Boolean.valueOf(interfaceC927690aFTLIZ.LJFF()) : null)) {
            return true;
        }
        InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
        return C500260Jjc.LJJJI(interfaceC938530aWxLIZ != null ? Boolean.valueOf(interfaceC938530aWxLIZ.LJIIJ()) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initOnlineWindow();
        this.mAttachedToWindow = true;
        AbstractC938280aWY abstractC938280aWY = this.mPresenter;
        if (abstractC938280aWY != null) {
            abstractC938280aWY.LIZ(this);
        }
        AbstractC938280aWY abstractC938280aWY2 = this.mPresenter;
        if (abstractC938280aWY2 != null) {
            abstractC938280aWY2.LJIILLIIL();
        }
        if (!this.mNeedPrepareLoading || this.hasLoadingFinished) {
            updateState(2);
            DataChannel dataChannel = this.mDataChannel;
            if (dataChannel != null) {
                dataChannel.zW(LinkInGuestCountDownFinishChannel.class, this.interactId);
            }
        } else {
            initPrepareLayout();
            updateState(1);
        }
        if (C497740JfY.LJJ()) {
            getMOnlineName().setLayoutDirection(1);
            ViewGroup viewGroup = this.mOnlineViewContainer;
            if (viewGroup != null) {
                viewGroup.setLayoutDirection(1);
            }
        }
        this.compositeDisposable.LIZ(C784440Upu.LIZ().LJ(C465900IOu.class).LJJLJLI(new AfS184S0100000_15(this, 53)));
        View view = this.fanTicketContainer;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS150S0100000_15(this, 71), view);
        }
        DataChannel dataChannel2 = this.mDataChannel;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(PlayStatusChangeEvent.class, this, new AwS594S0100000_15(this, 346));
        }
        updateTicketUIByPlayingStyle("onAttachedToWindow");
        addLiveShowStateListener();
        updateCountDownLayoutSize();
    }

    public final void setTicketUIPlayingStyle() {
        View view;
        String strLJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTicketUIPlayingStyle ");
        sbLIZ.append(this.window.LJIIIIZZ());
        C20441214yg.LJIIIZ("FanTicketContLog", C2188811AlT.LIZIZ(sbLIZ));
        LiveIconView liveIconView = this.onlineTicketPlusIcon;
        if (liveIconView == null) {
            liveIconView = null;
        }
        C12ES.LJIILL(0, liveIconView);
        changeOnlineTicketTextMarginStart((int) C497740JfY.LIZIZ(1));
        C1105630esT c1105630esT = this.onlineTicket;
        if (c1105630esT == null) {
            c1105630esT = null;
        }
        setWidth(c1105630esT, -2);
        AbstractC938280aWY abstractC938280aWY = this.mPresenter;
        if (abstractC938280aWY == null || (strLJ = abstractC938280aWY.LJ()) == null || LinkMicTicketIconUrlSetting.INSTANCE.getIconBgColorByName(strLJ) == null) {
            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
            if (C500260Jjc.LJJJI(interfaceC938530aWxLIZ != null ? Boolean.valueOf(interfaceC938530aWxLIZ.LJIIJ()) : null) || !isDefaultStyle() || (view = this.fanTicketContainerInner) == null) {
                return;
            }
            view.setBackgroundResource(R.drawable.e3i);
        }
    }

    private final ViewGroup getPrepareContainer() {
        return this.prepareContainer;
    }

    private final C16FZ getPrepareLoadingVie() {
        return this.prepareLoadingView;
    }

    private final void onCoinsClickNotInUS() {
        openGiftRankDialog();
    }

    public final C945640aiQ getCountDownLayout() {
        return this.countDownLayout;
    }

    public final View getFanTicketContainer() {
        return this.fanTicketContainer;
    }

    public final boolean getHasLoadingFinished$liveinteract_impl_release() {
        return this.hasLoadingFinished;
    }

    public final String getInteractId() {
        return this.interactId;
    }

    public final ViewGroup getLiveShowOrderContainer() {
        return this.liveShowOrderContainer;
    }

    public final C16F5 getLiveShowOrderTv() {
        return this.liveShowOrderTv;
    }

    public final boolean getMAttachedToWindow$liveinteract_impl_release() {
        return this.mAttachedToWindow;
    }

    public final boolean getMCurrentUserIsLinkedGuest() {
        return this.mCurrentUserIsLinkedGuest;
    }

    public final DataChannel getMDataChannel() {
        return this.mDataChannel;
    }

    public final boolean getMNeedPrepareLoading() {
        return this.mNeedPrepareLoading;
    }

    public final AbstractC938280aWY getMPresenter() {
        return this.mPresenter;
    }

    public final ConstraintLayout getPauseContainer$liveinteract_impl_release() {
        return this.pauseContainer;
    }

    public final C1126540fQC getPauseImageView$liveinteract_impl_release() {
        return this.pauseImageView;
    }

    public final C16F5 getPauseMainText$liveinteract_impl_release() {
        return this.pauseMainText;
    }

    public final C16F5 getPauseSecondText$liveinteract_impl_release() {
        return this.pauseSecondText;
    }

    public final C1324720kZq getPrepareAvatar$liveinteract_impl_release() {
        return this.prepareAvatarImage;
    }

    public final C1324720kZq getPrepareAvatarBackground$liveinteract_impl_release() {
        return this.prepareBackground;
    }

    public final boolean getShouldShowCountDownLayoutWhenResume() {
        return this.shouldShowCountDownLayoutWhenResume;
    }

    public final C1106010et5 getTimeCircleView() {
        return this.timeCircleViewV2;
    }

    public final C1106010et5 getTimeCircleViewV2() {
        return this.timeCircleViewV2;
    }

    public final C1088120eQE getTimeCountdownView() {
        return this.timeCountdownViewV2;
    }

    public final C1088120eQE getTimeCountdownViewV2() {
        return this.timeCountdownViewV2;
    }

    public final View getTimerViewLayout() {
        return this.timerViewLayout;
    }

    public final InterfaceC937840aVq getWindow() {
        return this.window;
    }

    @Override // X.C0UUU
    public boolean isAdjustParent() {
        return this.adjustParent;
    }

    private final void changeOnlineTicketTextMarginStart(int i) {
        ArrayList<View> arrayList = new ArrayList();
        C1105630esT c1105630esT = this.onlineTicketAnimation;
        if (c1105630esT != null) {
            arrayList.add(c1105630esT);
        }
        C1105630esT c1105630esT2 = this.onlineTicket;
        if (c1105630esT2 == null) {
            c1105630esT2 = null;
        }
        arrayList.add(c1105630esT2);
        for (View view : arrayList) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(i);
            C786410Ut5.W5(view, marginLayoutParams);
        }
    }

    private final String getFanTicketIconUrl(String str) {
        MultiGuestMockFanticketUrlSetting multiGuestMockFanticketUrlSetting = MultiGuestMockFanticketUrlSetting.INSTANCE;
        if (multiGuestMockFanticketUrlSetting.isEnable()) {
            return multiGuestMockFanticketUrlSetting.getMockedIconUrl();
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        MultiGuestDataHolder multiGuestDataHolder = (MultiGuestDataHolder) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_DATA_HOLDER");
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder.LJII();
        }
        return null;
    }

    private final void preMeasure(View view) {
        view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    private final void updateTicketCountWithAnimation(final String str) {
        int height;
        final int measuredWidth;
        View view;
        C1105630esT c1105630esT = this.onlineTicket;
        C1105630esT c1105630esT2 = null;
        if (c1105630esT == null) {
            c1105630esT = null;
        }
        Object parent = c1105630esT.getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            height = view.getHeight();
        } else {
            C1105630esT c1105630esT3 = this.onlineTicket;
            if (c1105630esT3 == null) {
                c1105630esT3 = null;
            }
            height = c1105630esT3.getHeight();
        }
        float f = height;
        C1105630esT c1105630esT4 = this.onlineTicket;
        if (c1105630esT4 == null) {
            c1105630esT4 = null;
        }
        C786410Ut5.rd(c1105630esT4, 0.0f);
        C1105630esT c1105630esT5 = this.onlineTicket;
        if (c1105630esT5 == null) {
            c1105630esT5 = null;
        }
        final int measuredWidth2 = c1105630esT5.getMeasuredWidth();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (-1.0f) * f);
        this.animatorScrollOut = valueAnimatorOfFloat;
        if (valueAnimatorOfFloat != null) {
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator = this.animatorScrollOut;
        if (valueAnimator != null) {
            valueAnimator.setDuration(250L);
        }
        ValueAnimator valueAnimator2 = this.animatorScrollOut;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new AUListenerS264S0100000_15(this, 3));
        }
        ValueAnimator valueAnimator3 = this.animatorScrollOut;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
        C1105630esT c1105630esT6 = this.onlineTicketAnimation;
        if (c1105630esT6 != null) {
            C786410Ut5.LLLF(c1105630esT6, 0);
        }
        C1105630esT c1105630esT7 = this.onlineTicketAnimation;
        if (c1105630esT7 != null) {
            c1105630esT7.setText(str);
        }
        C1105630esT c1105630esT8 = this.onlineTicketAnimation;
        if (c1105630esT8 != null) {
            preMeasure(c1105630esT8);
        }
        C1105630esT c1105630esT9 = this.onlineTicketAnimation;
        if (c1105630esT9 != null) {
            measuredWidth = c1105630esT9.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        if (measuredWidth >= measuredWidth2) {
            measuredWidth2 = measuredWidth;
        }
        if (MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
            C1105630esT c1105630esT10 = this.onlineTicket;
            if (c1105630esT10 != null) {
                c1105630esT2 = c1105630esT10;
            }
            setWidth(c1105630esT2, measuredWidth2);
        }
        C1105630esT c1105630esT11 = this.onlineTicketAnimation;
        if (c1105630esT11 != null) {
            C786410Ut5.rd(c1105630esT11, f);
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(f, 0.0f);
        this.animatorScrollIn = valueAnimatorOfFloat2;
        if (valueAnimatorOfFloat2 != null) {
            valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        }
        ValueAnimator valueAnimator4 = this.animatorScrollIn;
        if (valueAnimator4 != null) {
            valueAnimator4.setDuration(250L);
        }
        ValueAnimator valueAnimator5 = this.animatorScrollIn;
        if (valueAnimator5 != null) {
            valueAnimator5.addUpdateListener(new AUListenerS264S0100000_15(this, 4));
        }
        ValueAnimator valueAnimator6 = this.animatorScrollIn;
        if (valueAnimator6 != null) {
            valueAnimator6.addListener(new C940590aaH() { // from class: X.0aZ5
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    if (this.LL.isInPlayMode()) {
                        return;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("animatorScrollIn onAnimationEnd,  countStr=");
                    sbLIZ.append(str);
                    C20441214yg.LJIIIZ("FanTicketContLog", C2188811AlT.LIZIZ(sbLIZ));
                    C1105630esT c1105630esT12 = this.LL.onlineTicketAnimation;
                    if (c1105630esT12 != null) {
                        C786410Ut5.LLLF(c1105630esT12, 8);
                    }
                    C1105630esT c1105630esT13 = this.LL.onlineTicket;
                    C1105630esT c1105630esT14 = null;
                    if (c1105630esT13 == null) {
                        c1105630esT13 = null;
                    }
                    C786410Ut5.rd(c1105630esT13, 0.0f);
                    C1105630esT c1105630esT15 = this.LL.onlineTicket;
                    if (c1105630esT15 == null) {
                        c1105630esT15 = null;
                    }
                    c1105630esT15.setText(str);
                    if (!MultiGuestLiveShowConfigSetting.INSTANCE.isOpenLiveShow()) {
                        C939720aYs c939720aYs = this.LL;
                        C1105630esT c1105630esT16 = c939720aYs.onlineTicket;
                        if (c1105630esT16 != null) {
                            c1105630esT14 = c1105630esT16;
                        }
                        c939720aYs.setWidth(c1105630esT14, measuredWidth2);
                    } else {
                        C939720aYs c939720aYs2 = this.LL;
                        C1105630esT c1105630esT17 = c939720aYs2.onlineTicket;
                        if (c1105630esT17 != null) {
                            c1105630esT14 = c1105630esT17;
                        }
                        c939720aYs2.setWidth(c1105630esT14, measuredWidth);
                    }
                    C939720aYs c939720aYs3 = this.LL;
                    View view2 = c939720aYs3.fanTicketContainerInner;
                    if (view2 != null) {
                        c939720aYs3.setWidth(view2, -2);
                    }
                    View fanTicketContainer = this.LL.getFanTicketContainer();
                    if (fanTicketContainer != null) {
                        this.LL.setWidth(fanTicketContainer, -2);
                    }
                }
            });
        }
        ValueAnimator valueAnimator7 = this.animatorScrollIn;
        if (valueAnimator7 != null) {
            valueAnimator7.start();
        }
    }

    private final void updateTicketCountWithOutAnimation(String str) {
        ValueAnimator valueAnimator = this.animatorScrollOut;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.animatorScrollIn;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        C1105630esT c1105630esT = this.onlineTicket;
        if (c1105630esT == null) {
            c1105630esT = null;
        }
        HandlerHook.viewPost(c1105630esT, new ARunnableS20S1100000_15(this, str, 2));
        C1105630esT c1105630esT2 = this.onlineTicketAnimation;
        if (c1105630esT2 != null) {
            C439101nJ.LJI(c1105630esT2);
        }
    }

    private final void updateTicketStyle(Drawable drawable) {
        String strLJIIIIZZ;
        int iLJI;
        Drawable background;
        LayerDrawable layerDrawableUpdateTicketStyle$ensure;
        LayerDrawable layerDrawableUpdateTicketStyle$level;
        LayerDrawable layerDrawableUpdateTicketStyle$ensure2;
        LayerDrawable layerDrawableUpdateTicketStyle$level$default;
        View view = this.fanTicketContainerInner;
        if (view == null) {
            return;
        }
        AbstractC938280aWY abstractC938280aWY = this.mPresenter;
        LiveIconView liveIconView = null;
        if (abstractC938280aWY != null) {
            strLJIIIIZZ = abstractC938280aWY.LJIIIIZZ();
        } else {
            strLJIIIIZZ = null;
        }
        AbstractC938280aWY abstractC938280aWY2 = this.mPresenter;
        int iLIZIZ = 0;
        if (abstractC938280aWY2 != null) {
            iLJI = abstractC938280aWY2.LJI();
        } else {
            iLJI = 0;
        }
        C013C c013c = new C013C();
        if (strLJIIIIZZ != null) {
            int iHashCode = strLJIIIIZZ.hashCode();
            if (iHashCode != -321799542) {
                if (iHashCode != 0) {
                    if (iHashCode != 444088374) {
                        if (iHashCode != 901005104) {
                            if (iHashCode != 1544803905 || !strLJIIIIZZ.equals("default")) {
                                return;
                            }
                        } else {
                            if (!strLJIIIIZZ.equals("playing_default")) {
                                return;
                            }
                            setWidth(view, -2);
                            if (drawable != null) {
                                View view2 = this.fanTicketContainerInner;
                                if (view2 == null) {
                                    return;
                                }
                                view2.setBackground(drawable);
                                return;
                            }
                            View view3 = this.fanTicketContainerInner;
                            if (view3 == null) {
                                return;
                            }
                            view3.setBackgroundResource(R.drawable.e3j);
                            return;
                        }
                    } else {
                        if (!strLJIIIIZZ.equals("default_highlight")) {
                            return;
                        }
                        setWidth(view, -2);
                        Drawable background2 = view.getBackground();
                        if (background2 == null || (layerDrawableUpdateTicketStyle$ensure2 = updateTicketStyle$ensure(background2, c013c)) == null || (layerDrawableUpdateTicketStyle$level$default = updateTicketStyle$level$default(layerDrawableUpdateTicketStyle$ensure2, this, 100, false, 0, 8, null)) == null) {
                            return;
                        }
                        view.setBackground(layerDrawableUpdateTicketStyle$level$default);
                        return;
                    }
                } else if (!strLJIIIIZZ.equals("")) {
                    return;
                }
                setWidth(view, -2);
                LiveIconView liveIconView2 = this.onlineTicketPlusIcon;
                if (liveIconView2 == null) {
                    liveIconView2 = null;
                }
                if (liveIconView2.getVisibility() != 8) {
                    LiveIconView liveIconView3 = this.onlineTicketPlusIcon;
                    if (liveIconView3 != null) {
                        liveIconView = liveIconView3;
                    }
                    C439101nJ.LJI(liveIconView);
                    changeOnlineTicketTextMarginStart((int) C497740JfY.LIZIZ(2));
                }
                if (drawable != null) {
                    View view4 = this.fanTicketContainerInner;
                    if (view4 == null) {
                        return;
                    }
                    view4.setBackground(drawable);
                    return;
                }
                View view5 = this.fanTicketContainerInner;
                if (view5 == null) {
                    return;
                }
                view5.setBackgroundResource(R.drawable.ea9);
                return;
            }
            if (!strLJIIIIZZ.equals("playing_with_target_completion_progress")) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = this.window.LJJIIJ().getLayoutParams();
            if (layoutParams != null) {
                iLIZIZ = layoutParams.width;
            }
            if (iLIZIZ > 0) {
                if (iLIZIZ <= ((int) C497740JfY.LIZIZ(60.0f))) {
                    setWidth(view, iLIZIZ);
                    background = view.getBackground();
                    if (background != null || (layerDrawableUpdateTicketStyle$ensure = updateTicketStyle$ensure(background, c013c)) == null || (layerDrawableUpdateTicketStyle$level = updateTicketStyle$level(layerDrawableUpdateTicketStyle$ensure, this, iLJI, c013c.element, iLIZIZ)) == null) {
                        return;
                    }
                    view.setBackground(layerDrawableUpdateTicketStyle$level);
                    return;
                }
                iLIZIZ = Math.min((int) C497740JfY.LIZIZ(60.0f), iLIZIZ);
            } else {
                iLIZIZ = (int) C497740JfY.LIZIZ(60.0f);
            }
            setWidth(view, iLIZIZ);
            background = view.getBackground();
            if (background != null) {
            }
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        Object obj;
        Map map;
        if (message.what == 0) {
            this.mHasCountDownFinished = true;
            DataChannel dataChannel = this.mDataChannel;
            if (dataChannel != null) {
                dataChannel.zW(LinkInGuestCountDownFinishChannel.class, this.interactId);
            }
            DataChannel dataChannel2 = this.mDataChannel;
            if (dataChannel2 != null && (map = (Map) dataChannel2.gg0(C749450TaZ.class)) != null) {
                obj = map.get(this.window.LJ());
            } else {
                obj = null;
            }
            if (!Intrinsics.LJFF(obj, Boolean.TRUE)) {
                updateState(1);
            } else {
                updateState(2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invokeSendGiftPanel(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939720aYs.invokeSendGiftPanel(java.lang.String):void");
    }

    public final void log(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseMultiGuestV3Mask_");
        sbLIZ.append(this.window.LJIIIIZZ());
        C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str);
    }

    public final void setCountDownLayout(C945640aiQ c945640aiQ) {
        this.countDownLayout = c945640aiQ;
    }

    public final void setCurrentUserIsLinkedGuest(boolean z) {
        this.mCurrentUserIsLinkedGuest = z;
    }

    public final void setFanTicketContainer(View view) {
        this.fanTicketContainer = view;
    }

    public final void setHasLoadingFinished$liveinteract_impl_release(boolean z) {
        this.hasLoadingFinished = z;
    }

    public final void setMAttachedToWindow$liveinteract_impl_release(boolean z) {
        this.mAttachedToWindow = z;
    }

    public final void setMCurrentUserIsLinkedGuest(boolean z) {
        this.mCurrentUserIsLinkedGuest = z;
    }

    public final void setMNeedPrepareLoading(boolean z) {
        this.mNeedPrepareLoading = z;
    }

    public final void setMOnlineName(TextView textView) {
        this.mOnlineName = textView;
    }

    public final void setMPresenter(AbstractC938280aWY abstractC938280aWY) {
        this.mPresenter = abstractC938280aWY;
    }

    public final void setNetworkStateImageView(C16FV c16fv) {
        this.networkStateImageView = c16fv;
    }

    public final void setPauseContainer$liveinteract_impl_release(ConstraintLayout constraintLayout) {
        this.pauseContainer = constraintLayout;
    }

    public final void setPauseImageView$liveinteract_impl_release(C1126540fQC c1126540fQC) {
        this.pauseImageView = c1126540fQC;
    }

    public final void setPauseMainText$liveinteract_impl_release(C16F5 c16f5) {
        this.pauseMainText = c16f5;
    }

    public final void setPauseSecondText$liveinteract_impl_release(C16F5 c16f5) {
        this.pauseSecondText = c16f5;
    }

    public final void setShouldShowCountDownLayoutWhenResume(boolean z) {
        this.shouldShowCountDownLayoutWhenResume = z;
    }

    public final void setTimeCircleViewV2(C1106010et5 c1106010et5) {
        this.timeCircleViewV2 = c1106010et5;
    }

    public final void setTimeCountdownViewV2(C1088120eQE c1088120eQE) {
        this.timeCountdownViewV2 = c1088120eQE;
    }

    public final void setTimerViewLayout(View view) {
        this.timerViewLayout = view;
    }

    @Override // X.InterfaceC938310aWb
    public void setVisibility(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    public final void setWindow(InterfaceC937840aVq interfaceC937840aVq) {
        log("update window");
        getExpressionHelper().LIZ = interfaceC937840aVq.LJJIIJ();
        this.window = interfaceC937840aVq;
    }

    public void updateState(int i) {
        this.currentState = i;
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    ViewGroup viewGroup = this.mOnlineViewContainer;
                    if (viewGroup != null) {
                        C786410Ut5.LJLZ(8, viewGroup);
                    }
                    ViewGroup prepareContainer = getPrepareContainer();
                    if (prepareContainer != null) {
                        C786410Ut5.LJLZ(8, prepareContainer);
                        return;
                    }
                    return;
                }
                return;
            }
            ViewGroup viewGroup2 = this.mOnlineViewContainer;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(0, viewGroup2);
            }
            ViewGroup prepareContainer2 = getPrepareContainer();
            if (prepareContainer2 != null) {
                C786410Ut5.LJLZ(8, prepareContainer2);
            }
            this.hasLoadingFinished = true;
            C16FZ prepareLoadingVie = getPrepareLoadingVie();
            if (prepareLoadingVie == null) {
                return;
            }
            C439101nJ.LJI(prepareLoadingVie);
            return;
        }
        ViewGroup prepareContainer3 = getPrepareContainer();
        if (prepareContainer3 != null) {
            C786410Ut5.LJLZ(0, prepareContainer3);
        }
        ViewGroup viewGroup3 = this.mOnlineViewContainer;
        if (viewGroup3 != null) {
            C786410Ut5.LJLZ(8, viewGroup3);
        }
        C16FZ prepareLoadingVie2 = getPrepareLoadingVie();
        if (prepareLoadingVie2 != null) {
            C786410Ut5.LLLIZZ(prepareLoadingVie2, 0);
        }
        this.mHandler.sendEmptyMessageDelayed(0, 1000L);
    }

    public final void updateTicketLayoutBg(Integer num) {
        GradientDrawable gradientDrawable = null;
        Integer numValueOf = null;
        if (num != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateTicketUIByPlayingStyle, ");
            sbLIZ.append(hashCode());
            sbLIZ.append(' ');
            View view = this.fanTicketContainerInner;
            if (view != null) {
                numValueOf = Integer.valueOf(view.hashCode());
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(" updateColor bgColor:");
            sbLIZ.append(num);
            log(C2188811AlT.LIZIZ(sbLIZ));
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setColors(new int[]{num.intValue(), num.intValue()});
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius((int) C497740JfY.LIZIZ(57.0f));
        }
        updateTicketStyle(gradientDrawable);
    }

    public final void updateTicketLayoutByByIconName(String str) {
        if (!Intrinsics.LJFF(str, "mg_default_without_bg") && !Intrinsics.LJFF(str, "mg_default_new_without_bg")) {
            updateTicketLayoutBg(LinkMicTicketIconUrlSetting.INSTANCE.getIconBgColorByName(str));
        } else {
            updateTicketStyle(C0UDZ.LIZ(R.drawable.e3i));
        }
    }

    @Override // X.InterfaceC938310aWb
    public void updateTicketStyleByComponent(C941850acJ c941850acJ) {
        boolean z;
        if (c941850acJ != null) {
            LinkMicAbilityManager.LJIIIZ.getClass();
            InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
            if (interfaceC941720ac6LIZIZ != null && interfaceC941720ac6LIZIZ.LJIIJ("guest_showdown")) {
                z = true;
            } else {
                z = false;
            }
            LinkMicTicketIconUrlSetting linkMicTicketIconUrlSetting = LinkMicTicketIconUrlSetting.INSTANCE;
            String str = c941850acJ.LIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String iconValueByName = linkMicTicketIconUrlSetting.getIconValueByName(str);
            if ((LinkMicTicketIconNotUpdateFixSetting.INSTANCE.isEnable() && !Intrinsics.LJFF(this.lastTicketIconUrl, iconValueByName)) || z) {
                String str3 = c941850acJ.LIZ;
                if (str3 != null) {
                    str2 = str3;
                }
                updateIconUrl(linkMicTicketIconUrlSetting.getIconValueByName(str2), "updateTicketStyleByComponent");
            }
            updateTicketLayoutByByIconName(c941850acJ.LIZ);
        }
    }

    public final void updateTicketUIByPlayingStyle(String str) {
        if (C01ZE.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTicketUIByPlayingStyle, source=");
        sbLIZ.append(str);
        log(C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJJLIIIJILLIZJL(new AwS164S1100000_15(this, str, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void reportOpenGiftPanelResult(boolean r13, com.bytedance.android.livesdkapi.depend.model.live.Room r14) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939720aYs.reportOpenGiftPanelResult(boolean, com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }

    private final void updateTicketCountByComponent(long j, int i) {
        String upperCase = C1850730yGF.LJFF(j).toUpperCase(Locale.ROOT);
        Long lValueOf = null;
        if (i == 2) {
            String strLJIJJ = C497740JfY.LJIJJ(2131852938, upperCase);
            if (Intrinsics.LJFF(strLJIJJ, this.currentTicketDisplayString)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateTicketCountByComponent, scoreType: PLAY, but countStr == onlineTicket.text, countStr: ");
                sbLIZ.append(strLJIJJ);
                sbLIZ.append(", onlineTicket.text: ");
                C1105630esT c1105630esT = this.onlineTicket;
                if (c1105630esT == null) {
                    c1105630esT = null;
                }
                sbLIZ.append((Object) c1105630esT.getText());
                sbLIZ.append(", uid = ");
                AbstractC938280aWY abstractC938280aWY = this.mPresenter;
                if (abstractC938280aWY != null) {
                    lValueOf = Long.valueOf(abstractC938280aWY.LJIIJ());
                }
                sbLIZ.append(lValueOf);
                C320901Mh.LIZ("BaseMultiGuestV3Mask", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            this.currentTicketDisplayString = strLJIJJ;
            C1105630esT c1105630esT2 = this.onlineTicket;
            if (c1105630esT2 == null) {
                c1105630esT2 = null;
            }
            setWidth(c1105630esT2, -2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateTicketCountByComponent, scoreType: PLAY, and countStr != onlineTicket.text, countStr: ");
            sbLIZ2.append(strLJIJJ);
            sbLIZ2.append(", onlineTicket.text: ");
            C1105630esT c1105630esT3 = this.onlineTicket;
            if (c1105630esT3 == null) {
                c1105630esT3 = null;
            }
            sbLIZ2.append((Object) c1105630esT3.getText());
            sbLIZ2.append(", uid = ");
            AbstractC938280aWY abstractC938280aWY2 = this.mPresenter;
            if (abstractC938280aWY2 != null) {
                lValueOf = Long.valueOf(abstractC938280aWY2.LJIIJ());
            }
            sbLIZ2.append(lValueOf);
            C320901Mh.LIZ("BaseMultiGuestV3Mask", C2188811AlT.LIZIZ(sbLIZ2));
            updateTicketCountWithOutAnimation(strLJIJJ);
            return;
        }
        if (Intrinsics.LJFF(upperCase, this.currentTicketDisplayString)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateTicketCountByComponent, scoreType: FanTicket, but countStr == onlineTicket.text, countStr: ");
            sbLIZ3.append(upperCase);
            sbLIZ3.append(", onlineTicket.text: ");
            C1105630esT c1105630esT4 = this.onlineTicket;
            if (c1105630esT4 == null) {
                c1105630esT4 = null;
            }
            sbLIZ3.append((Object) c1105630esT4.getText());
            sbLIZ3.append(", uid = ");
            AbstractC938280aWY abstractC938280aWY3 = this.mPresenter;
            if (abstractC938280aWY3 != null) {
                lValueOf = Long.valueOf(abstractC938280aWY3.LJIIJ());
            }
            sbLIZ3.append(lValueOf);
            C320901Mh.LIZ("BaseMultiGuestV3Mask", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        this.currentTicketDisplayString = upperCase;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("updateTicketCountByComponent, scoreType: FanTicket, and countStr != onlineTicket.text, countStr: ");
        sbLIZ4.append(upperCase);
        sbLIZ4.append(", onlineTicket.text: ");
        C1105630esT c1105630esT5 = this.onlineTicket;
        if (c1105630esT5 == null) {
            c1105630esT5 = null;
        }
        sbLIZ4.append((Object) c1105630esT5.getText());
        sbLIZ4.append(", uid = ");
        AbstractC938280aWY abstractC938280aWY4 = this.mPresenter;
        if (abstractC938280aWY4 != null) {
            lValueOf = Long.valueOf(abstractC938280aWY4.LJIIJ());
        }
        sbLIZ4.append(lValueOf);
        C320901Mh.LIZ("BaseMultiGuestV3Mask", C2188811AlT.LIZIZ(sbLIZ4));
        updateTicketCountWithAnimation(upperCase);
    }

    public static final LayerDrawable updateTicketStyle$ensure(Drawable drawable, C013C c013c) {
        LayerDrawable layerDrawable;
        if ((drawable instanceof LayerDrawable) && (layerDrawable = (LayerDrawable) drawable) != null) {
            c013c.element = true;
            return layerDrawable;
        }
        if (!C497740JfY.LJJ()) {
            Drawable drawableLIZ = C0UDZ.LIZ(R.drawable.e4v);
            if (drawableLIZ instanceof LayerDrawable) {
                return (LayerDrawable) drawableLIZ;
            }
        } else {
            Drawable drawableLIZ2 = C0UDZ.LIZ(R.drawable.e4w);
            if (drawableLIZ2 instanceof LayerDrawable) {
                return (LayerDrawable) drawableLIZ2;
            }
        }
        return null;
    }

    public final void setWidth(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i;
        C786410Ut5.W5(view, layoutParams);
    }

    public final void updateIconUrl(String str, String str2) {
        String fanTicketIconUrl = getFanTicketIconUrl(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateIconUrl, finalTicketIconUrl:");
        sbLIZ.append(fanTicketIconUrl);
        sbLIZ.append(" source=");
        sbLIZ.append(str2);
        log(C2188811AlT.LIZIZ(sbLIZ));
        C1126540fQC c1126540fQC = null;
        if (fanTicketIconUrl != null) {
            if (!TextUtils.isEmpty(fanTicketIconUrl) && Intrinsics.LJFF(fanTicketIconUrl, this.lastTicketIconUrl) && this.ticketIconLoaded) {
                C20441214yg.LIZIZ("BaseMultiGuestV3Mask", "same url and loaded successfully, so return");
                return;
            }
            this.lastTicketIconUrl = fanTicketIconUrl;
            C1324610kZf url = C1819620xS4.LIZ().setUrl(fanTicketIconUrl);
            url.LJJ = Boolean.FALSE;
            if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
                url.LJIIJJI = getNewStyleFanTicketIconDrawable();
            } else {
                url.LJIIIZ = R.drawable.emi;
            }
            url.LJIIL = new C987140bnM(this, 4);
            C1126540fQC c1126540fQC2 = this.onlineTicketIcon;
            if (c1126540fQC2 != null) {
                c1126540fQC = c1126540fQC2;
            }
            url.LJJI(c1126540fQC);
            return;
        }
        if (MultiGuestIconResourceOptSetting.INSTANCE.isEnable()) {
            C1126540fQC c1126540fQC3 = this.onlineTicketIcon;
            if (c1126540fQC3 != null) {
                c1126540fQC = c1126540fQC3;
            }
            c1126540fQC.setImageDrawable(getNewStyleFanTicketIconDrawable());
            return;
        }
        C1126540fQC c1126540fQC4 = this.onlineTicketIcon;
        if (c1126540fQC4 != null) {
            c1126540fQC = c1126540fQC4;
        }
        c1126540fQC.setActualImageResource(R.drawable.emi);
    }

    @Override // X.InterfaceC938310aWb
    public void updateTicket(long j, String str) {
        String upperCase = C1850730yGF.LJFF(j).toUpperCase(Locale.ROOT);
        if (!isInPlayMode() && isDefaultStyle()) {
            C1105630esT c1105630esT = this.onlineTicket;
            if (c1105630esT == null) {
                c1105630esT = null;
            }
            if (Intrinsics.LJFF(upperCase, String.valueOf(c1105630esT.getText()))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("countStr == mOnlineTicket.text.toString(),  countStr=");
                sbLIZ.append(upperCase);
                sbLIZ.append(", source=");
                sbLIZ.append(str);
                sbLIZ.append(", interactId=");
                sbLIZ.append(this.interactId);
                C20441214yg.LJIIIZ("FanTicketContLog", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateTicketCountWithAnimation,  countStr=");
            sbLIZ2.append(upperCase);
            sbLIZ2.append(", source=");
            sbLIZ2.append(str);
            sbLIZ2.append(", interactId=");
            sbLIZ2.append(this.interactId);
            C20441214yg.LJIIIZ("FanTicketContLog", C2188811AlT.LIZIZ(sbLIZ2));
            updateTicketCountWithAnimation(upperCase);
            return;
        }
        updateTicketCountWithOutAnimation(upperCase);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("updateTicketCountWithOutAnimation, countStr=");
        sbLIZ3.append(upperCase);
        sbLIZ3.append(", source=");
        sbLIZ3.append(str);
        sbLIZ3.append(", interactId=");
        sbLIZ3.append(this.interactId);
        C20441214yg.LJIIIZ("FanTicketContLog", C2188811AlT.LIZIZ(sbLIZ3));
    }

    @Override // X.InterfaceC938310aWb
    public void updateTicketByComponent(long j, int i) {
        C940780aaa c940780aaaLJII;
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC938280aWY abstractC938280aWY = this.mPresenter;
        String str5 = null;
        if (abstractC938280aWY != null) {
            c940780aaaLJII = abstractC938280aWY.LJII();
        } else {
            c940780aaaLJII = null;
        }
        LinkMicTicketIconUrlSetting linkMicTicketIconUrlSetting = LinkMicTicketIconUrlSetting.INSTANCE;
        if (c940780aaaLJII == null || (str = c940780aaaLJII.LIZIZ) == null) {
            str = "";
        }
        String iconValueByName = linkMicTicketIconUrlSetting.getIconValueByName(str);
        if (c940780aaaLJII != null) {
            str2 = c940780aaaLJII.LIZIZ;
        } else {
            str2 = null;
        }
        Integer iconBgColorByName = linkMicTicketIconUrlSetting.getIconBgColorByName(str2);
        if (c940780aaaLJII != null) {
            str3 = c940780aaaLJII.LIZ;
        } else {
            str3 = null;
        }
        if (!currentStateIsConnecting() && str3 != null && str3.length() != 0) {
            C1AGN expressionHelper = getExpressionHelper();
            if (c940780aaaLJII != null) {
                str4 = c940780aaaLJII.LIZIZ;
            } else {
                str4 = null;
            }
            if (expressionHelper.LIZJ(iconBgColorByName, iconValueByName, str3, str4)) {
                updateTicketCountByComponent(j, i);
                return;
            }
        }
        updateIconUrl(iconValueByName, "updateTicketByComponent");
        if (c940780aaaLJII != null) {
            str5 = c940780aaaLJII.LIZIZ;
        }
        updateTicketLayoutByByIconName(str5);
        updateTicketCountByComponent(j, i);
    }

    @Override // X.InterfaceC938310aWb
    public void updateTicket(String str, long j, String str2) {
        C940780aaa c940780aaaLJII;
        Pair pair;
        String str3;
        AbstractC938280aWY abstractC938280aWY = this.mPresenter;
        String str4 = null;
        if (abstractC938280aWY != null) {
            c940780aaaLJII = abstractC938280aWY.LJII();
        } else {
            c940780aaaLJII = null;
        }
        if (c940780aaaLJII != null && (str3 = c940780aaaLJII.LIZIZ) != null && str3.length() != 0) {
            LinkMicTicketIconUrlSetting linkMicTicketIconUrlSetting = LinkMicTicketIconUrlSetting.INSTANCE;
            pair = new Pair(linkMicTicketIconUrlSetting.getIconValueByName(c940780aaaLJII.LIZIZ), linkMicTicketIconUrlSetting.getIconBgColorByName(c940780aaaLJII.LIZIZ));
        } else {
            pair = new Pair(str, null);
        }
        String str5 = (String) pair.getFirst();
        Integer num = (Integer) pair.getSecond();
        if (!currentStateIsConnecting() && c940780aaaLJII != null && c940780aaaLJII.LIZ != null && c940780aaaLJII.LIZ.length() > 0 && getExpressionHelper().LIZJ(num, str5, c940780aaaLJII.LIZ, c940780aaaLJII.LIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateTicket source=");
            sbLIZ.append(str2);
            sbLIZ.append(", interactId=");
            sbLIZ.append(this.interactId);
            sbLIZ.append(" return as expressionHelper consume");
            log(C2188811AlT.LIZIZ(sbLIZ));
            updateTicket(j, str2);
            return;
        }
        updateIconUrl(str5, str2);
        updateTicketLayoutBg(num);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateTicket currentStateIsConnecting:");
        sbLIZ2.append(currentStateIsConnecting());
        sbLIZ2.append(" iconName=");
        if (c940780aaaLJII != null) {
            str4 = c940780aaaLJII.LIZIZ;
        }
        sbLIZ2.append(str4);
        sbLIZ2.append(" source=");
        sbLIZ2.append(str2);
        sbLIZ2.append(", interactId=");
        sbLIZ2.append(this.interactId);
        log(C2188811AlT.LIZIZ(sbLIZ2));
        updateTicket(j, str2);
    }

    public static /* synthetic */ void invokeSendGiftPanel$default(C939720aYs c939720aYs, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = "anchor_link_guest";
            }
            c939720aYs.invokeSendGiftPanel(str);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeSendGiftPanel");
    }

    public C939720aYs(Context context, InterfaceC937840aVq interfaceC937840aVq, String str, AbstractC938280aWY abstractC938280aWY, DataChannel dataChannel) {
        super(context);
        this.interactId = str;
        this.mPresenter = abstractC938280aWY;
        this.mDataChannel = dataChannel;
        this.window = interfaceC937840aVq;
        this.currentTicketDisplayString = "";
        this.newStyleFanTicketIconDrawable$delegate = C930540aK4.LJJIJIL(new AwS416S0200000_15(context, this, 31));
        this.expressionHelper$delegate = C930540aK4.LJJIJIL(new AwS416S0200000_15(interfaceC937840aVq, this, 30));
        this.mHandler = new WeakHandler(this);
        this.currentState = 4;
        this.compositeDisposable = new C11NJ();
        this.liveShowStateListener = new C01FR() { // from class: X.0aZf
            @Override // X.C01FR
            public final void LIZIZ() {
                this.LIZ.updateTicketUIByPlayingStyle("liveShow_toStateShowing");
            }

            @Override // X.C01FR
            public final void LIZJ() {
                this.LIZ.updateTicketUIByPlayingStyle("liveShow_toStateIdle");
            }

            @Override // X.C01FR
            public final void LIZLLL() {
                this.LIZ.updateTicketUIByPlayingStyle("liveShow_toStateEnd");
            }

            @Override // X.C01FR
            public final void LIZ(C01FL c01fl) {
                this.LIZ.updateTicketUIByPlayingStyle("liveShow_toStateReady");
            }
        };
    }

    public static final LayerDrawable updateTicketStyle$level(LayerDrawable layerDrawable, C939720aYs c939720aYs, int i, boolean z, int i2) {
        Number numberValueOf;
        C1105630esT c1105630esT = null;
        if (layerDrawable == null) {
            return null;
        }
        if (i != 100 && i2 > 0) {
            float fLIZIZ = C497740JfY.LIZIZ(14.0f);
            float f = i2;
            float f2 = 100;
            float f3 = (((((f - fLIZIZ) * i) / f2) + fLIZIZ) / f) * f2;
            if (f3 > 0.0f) {
                numberValueOf = Float.valueOf(f3);
            } else {
                numberValueOf = Integer.valueOf(i);
            }
        } else {
            numberValueOf = Integer.valueOf(i);
        }
        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.progress);
        if (drawableFindDrawableByLayerId != null) {
            if (z && drawableFindDrawableByLayerId.getLevel() != 10000 && numberValueOf.intValue() == 100) {
                C1105630esT c1105630esT2 = c939720aYs.onlineTicket;
                if (c1105630esT2 != null) {
                    c1105630esT = c1105630esT2;
                }
                C954140aw8.LIZLLL(c1105630esT);
                HandlerHook.viewPost(c939720aYs, new ARunnableS115S0100000_15(c939720aYs, 47));
            }
            drawableFindDrawableByLayerId.setLevel(numberValueOf.intValue() * 100);
        }
        return layerDrawable;
    }

    public static /* synthetic */ LayerDrawable updateTicketStyle$level$default(LayerDrawable layerDrawable, C939720aYs c939720aYs, int i, boolean z, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 8) != 0) {
                i2 = 0;
            }
            return updateTicketStyle$level(layerDrawable, c939720aYs, i, z, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateTicketStyle$level");
    }
}
