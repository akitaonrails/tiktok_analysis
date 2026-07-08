package X;

import Y.ARunnableS117S0100000_17;
import Y.ATListenerS341S0200000_17;
import Y.ATListenerS450S0100000_17;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.level.LiveUserLevelBackEnableSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126410fPz extends AbstractC1126560fQE implements InterfaceC520700KbU {
    public final View LLLILZ;
    public final C1295960jpS LLLILZJ;
    public final LinearLayout LLLILZLLLI;
    public final C1324720kZq LLLIZZ;
    public final C1324720kZq LLLJ;
    public final ImageView LLLJIL;
    public C1143920fsE LLLJL;
    public C1143920fsE LLLL;
    public boolean LLLLII;
    public final C520690KbT LLLLIIIILLL;
    public final C1324720kZq LLLLIIL;
    public FrameLayout LLLLIILL;
    public C520440Kb4 LLLLIILLL;
    public AnimatorSet LLLLIL;
    public final C1324720kZq LLLLILI;
    public ImageModel LLLLJ;
    public AnimatorSet LLLLJI;
    public final String LLLLL;
    public final C1143100fqu LLLLLIL;
    public final C16F5 LLLLLILLIL;
    public final C16F5 LLLLLJIL;
    public boolean LLLLLJLJLL;
    public boolean LLLLLL;
    public AnimatorSet LLLLLLIL;
    public C1126370fPv LLLLLLJ;
    public final String LLLLLLL;
    public final ViewOnAttachStateChangeListenerC1151620g4e LLLLLLLLL;
    public boolean LLLLLLLLLL;

    public final boolean D6() {
        Gift gift;
        GiftLockInfo giftLockInfo;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI == null || !abstractC1126600fQI.LJIIJ) {
            return false;
        }
        T t = abstractC1126600fQI.LIZIZ;
        return (!(t instanceof Gift) || (gift = (Gift) t) == null || (giftLockInfo = gift.giftSubInfo) == null || giftLockInfo.mLockType != 2 || giftLockInfo.mLock) ? false : true;
    }

    public final C520440Kb4 J6() {
        C520440Kb4 c520440Kb4 = this.LLLLIILLL;
        if (c520440Kb4 != null) {
            return c520440Kb4;
        }
        if (this.LLLLIILL == null) {
            this.LLLLIILL = (FrameLayout) this.LLLILZ.findViewById(R.id.eux);
        }
        FrameLayout frameLayout = this.LLLLIILL;
        if (frameLayout == null) {
            return null;
        }
        C520440Kb4 c520440Kb42 = new C520440Kb4(this.LLLILZ.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(30.0f), (int) C497740JfY.LIZIZ(30.0f), 17);
        layoutParams.bottomMargin = (int) C497740JfY.LIZIZ(20.0f);
        frameLayout.addView(c520440Kb42, layoutParams);
        this.LLLLIILLL = c520440Kb42;
        return c520440Kb42;
    }

    public final void L6() {
        View view;
        C20441214yg.LJIIIZ(this.LLLLL, "hideRecommendGiftUI: ");
        this.LLLLLJLJLL = false;
        ImageView imageView = this.LLILZ;
        if (imageView != null) {
            C786410Ut5.V4(imageView, 1.0f);
        }
        FrameLayout frameLayout = this.LLILZLL;
        if (frameLayout != null) {
            C786410Ut5.U4(frameLayout, 1.0f);
        }
        C16F5 c16f5 = this.LLJJJIL;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, 1.0f);
        }
        C520690KbT c520690KbT = this.LLLLIIIILLL;
        if (c520690KbT != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c520690KbT);
            c520690KbT.setAlpha(1.0f);
        }
        C16F5 c16f52 = this.LLJIJIL;
        if (c16f52 != null) {
            C786410Ut5.k5(c16f52, 1.0f);
        }
        C16F5 c16f53 = this.LLJJIII;
        if (c16f53 != null) {
            C786410Ut5.k5(c16f53, 1.0f);
        }
        C16F5 c16f54 = this.LLLLLILLIL;
        if (c16f54 != null) {
            C786410Ut5.k5(c16f54, 1.0f);
        }
        C16F5 c16f55 = this.LLJJJJJIL;
        if (c16f55 != null) {
            C786410Ut5.k5(c16f55, 1.0f);
        }
        ImageView imageView2 = this.LLLJIL;
        if (imageView2 != null) {
            C786410Ut5.V4(imageView2, 1.0f);
        }
        LiveIconView liveIconView = this.LLJJJJLIIL;
        if (liveIconView != null) {
            C786410Ut5.i5(liveIconView, 1.0f);
        }
        C16F5 c16f56 = this.LLLLLJIL;
        if (c16f56 != null) {
            C500260Jjc.LJIILIIL(c16f56);
        }
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI != null && !abstractC1126600fQI.LIZJ && (view = this.LLJJJ) != null) {
            C500260Jjc.LJIILIIL(view);
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            view2.setBackgroundResource(R.drawable.e22);
        }
    }

    @Override // X.AbstractC1126560fQE
    public final void LLIILZL() {
        if (this.LLLLLLLLLL) {
            this.LLLILZ.removeOnAttachStateChangeListener(this.LLLLLLLLL);
            this.LLLLLLLLLL = false;
        }
        T6();
        super.LLIILZL();
    }

    @Override // X.AbstractC1126560fQE
    public final boolean T5() {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI == null || !abstractC1126600fQI.LJIJJLI() || !abstractC1126600fQI.LIZJ) {
            return false;
        }
        InterfaceC1126580fQG interfaceC1126580fQG = this.LLJL;
        if (interfaceC1126580fQG != null) {
            interfaceC1126580fQG.LJIJ(abstractC1126600fQI);
        }
        b7(K6(abstractC1126600fQI));
        return true;
    }

    public final void T6() {
        AnimatorSet animatorSet = this.LLLLIL;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.LLLLIL = null;
        C520440Kb4 c520440Kb4 = this.LLLLIILLL;
        if (c520440Kb4 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c520440Kb4);
            c520440Kb4.setTranslationY(0.0f);
        }
    }

    public final void U6() {
        C20441214yg.LJIIIZ(this.LLLLL, "resetRecommendView: ");
        this.LLLLLJLJLL = false;
        this.LLLLLL = false;
        C1324720kZq c1324720kZq = this.LLJILLL;
        if (c1324720kZq != null) {
            C786410Ut5.Yb(c1324720kZq, 1.0f);
        }
        C1324720kZq c1324720kZq2 = this.LLJILLL;
        if (c1324720kZq2 != null) {
            C786410Ut5.xc(c1324720kZq2, 1.0f);
        }
        L6();
        C1324720kZq c1324720kZq3 = this.LLJILLL;
        if (c1324720kZq3 != null) {
            C786410Ut5.md(c1324720kZq3, C497740JfY.LIZIZ(5));
        }
    }

    @Override // X.InterfaceC520700KbU
    public final void V3() {
        Gift gift;
        GiftLockInfo giftLockInfo;
        C520690KbT c520690KbT;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI != null) {
            T t = abstractC1126600fQI.LIZIZ;
            if ((t instanceof Gift) && (gift = (Gift) t) != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 6 && (c520690KbT = this.LLLLIIIILLL) != null) {
                C500260Jjc.LJIILIIL(c520690KbT);
            }
        }
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 == null || !abstractC1126600fQI2.LIZJ) {
            C500260Jjc.LLFFF(this.LLLJIL);
        }
    }

    public final void V6() {
        C20441214yg.LJIIIZ(this.LLLLL, "showRecommendGiftUi: ");
        this.LLLLLJLJLL = true;
        ImageView imageView = this.LLILZ;
        if (imageView != null) {
            C786410Ut5.V4(imageView, 0.0f);
        }
        FrameLayout frameLayout = this.LLILZLL;
        if (frameLayout != null) {
            C786410Ut5.U4(frameLayout, 0.0f);
        }
        C16F5 c16f5 = this.LLJJJIL;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, 0.0f);
        }
        C520690KbT c520690KbT = this.LLLLIIIILLL;
        if (c520690KbT != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c520690KbT);
            c520690KbT.setAlpha(0.0f);
        }
        C16F5 c16f52 = this.LLJIJIL;
        if (c16f52 != null) {
            C786410Ut5.k5(c16f52, 0.0f);
        }
        C16F5 c16f53 = this.LLJJIII;
        if (c16f53 != null) {
            C786410Ut5.k5(c16f53, 0.0f);
        }
        C16F5 c16f54 = this.LLLLLILLIL;
        if (c16f54 != null) {
            C786410Ut5.k5(c16f54, 0.0f);
        }
        C16F5 c16f55 = this.LLJJJJJIL;
        if (c16f55 != null) {
            C786410Ut5.k5(c16f55, 0.0f);
        }
        ImageView imageView2 = this.LLLJIL;
        if (imageView2 != null) {
            C786410Ut5.V4(imageView2, 0.0f);
        }
        LiveIconView liveIconView = this.LLJJJJLIIL;
        if (liveIconView != null) {
            C786410Ut5.i5(liveIconView, 0.0f);
        }
        C16F5 c16f56 = this.LLLLLJIL;
        if (c16f56 != null) {
            C500260Jjc.LLFFF(c16f56);
        }
        View view = this.LLJJJ;
        if (view != null) {
            C500260Jjc.LLFFF(view);
        }
        C16F5 c16f57 = this.LLLLLJIL;
        if (c16f57 != null) {
            C786410Ut5.k5(c16f57, 1.0f);
        }
        View view2 = this.LLJJJ;
        if (view2 != null) {
            C786410Ut5.T4(view2, 1.0f);
        }
        View view3 = this.LLJJJ;
        if (view3 != null) {
            view3.setBackgroundResource(R.drawable.e24);
        }
    }

    @Override // X.AbstractC1126560fQE
    public final void e6() {
        AnimatorSet animatorSet = this.LLLLLLIL;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.LLLLLLIL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        if (this.LLLLLLIL != null) {
            C1143100fqu c1143100fqu = this.LLLLLIL;
            if (c1143100fqu != null) {
                c1143100fqu.LJFF();
            }
            C1143100fqu c1143100fqu2 = this.LLLLLIL;
            if (c1143100fqu2 != null) {
                C500260Jjc.LJIILIIL(c1143100fqu2);
            }
            C1324720kZq c1324720kZq = this.LLJILLL;
            if (c1324720kZq != null) {
                C786410Ut5.Yb(c1324720kZq, 1.0f);
            }
            C1324720kZq c1324720kZq2 = this.LLJILLL;
            if (c1324720kZq2 != null) {
                C786410Ut5.xc(c1324720kZq2, 1.0f);
            }
            ImageView imageView = this.LLILZ;
            if (imageView != null) {
                C786410Ut5.Qb(imageView, 1.0f);
            }
            ImageView imageView2 = this.LLILZ;
            if (imageView2 != null) {
                C786410Ut5.rc(imageView2, 1.0f);
            }
        }
        C1143920fsE c1143920fsE = this.LLLJL;
        if (c1143920fsE != null) {
            c1143920fsE.LIZIZ();
        }
        C1143920fsE c1143920fsE2 = this.LLLL;
        if (c1143920fsE2 != null) {
            c1143920fsE2.LIZIZ();
        }
        LinearLayout linearLayout = this.LLLILZLLLI;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        i7();
        super.e6();
        h7(false);
        T6();
        C520440Kb4 c520440Kb4 = this.LLLLIILLL;
        if (c520440Kb4 != null) {
            C786410Ut5.Q1(c520440Kb4, 8);
        }
        C1324720kZq c1324720kZq3 = this.LLLLILI;
        if (c1324720kZq3 != null) {
            C786410Ut5.LLJJIII(c1324720kZq3, 8);
        }
    }

    @Override // X.AbstractC1126560fQE
    public final void h6() {
        super.h6();
        ImageView imageView = this.LLLJIL;
        if (imageView != null) {
            imageView.setContentDescription(this.LLLLLLL);
        }
        ImageView imageView2 = this.LLLJIL;
        if (imageView2 != null) {
            imageView2.setImportantForAccessibility(1);
        }
    }

    public final void i7() {
        if (C1125810fP1.LIZIZ()) {
            return;
        }
        if (!C1125760fOw.LIZLLL(this.LLJJLIIIJLLLLLLLZ)) {
            C500260Jjc.LJIILIIL(this.LLLLIIL);
            return;
        }
        C500260Jjc.LLFFF(this.LLLLIIL);
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(UserService.getInstance().user().getCurrentUser().getAvatarThumb());
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        float fLIZIZ = C497740JfY.LIZIZ(0.8f);
        c1324610kZfLJIIIZ.LJJIIJ = -3421237;
        c1324610kZfLJIIIZ.LJJIII = fLIZIZ;
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.ela;
        c1324610kZfLJIIIZ.LJJI(this.LLLLIIL);
    }

    @Override // X.AbstractC1126560fQE
    public final String R5() {
        return this.LLLLL;
    }

    public C1126410fPz(View view) {
        int iIntValue;
        super(view);
        this.LLLILZ = view;
        this.LLLLILI = (C1324720kZq) view.findViewById(R.id.iw_);
        this.LLLLL = "LiveGiftPanelViewHolderV2";
        this.LLLLLLL = C497740JfY.LJIJI(2131840818);
        ViewOnAttachStateChangeListenerC1151620g4e viewOnAttachStateChangeListenerC1151620g4e = new ViewOnAttachStateChangeListenerC1151620g4e(this, 3);
        this.LLLLLLLLL = viewOnAttachStateChangeListenerC1151620g4e;
        this.LLLLLIL = (C1143100fqu) view.findViewById(R.id.o24);
        this.LLLLLILLIL = (C16F5) view.findViewById(R.id.z47);
        this.LLLLLJIL = (C16F5) view.findViewById(R.id.tv_recommend_gift);
        this.LLLILZJ = (C1295960jpS) view.findViewById(R.id.iyj);
        this.LLLILZLLLI = (LinearLayout) view.findViewById(R.id.iyk);
        this.LLLJ = (C1324720kZq) view.findViewById(R.id.user_level_unlock_animation);
        this.LLLIZZ = (C1324720kZq) view.findViewById(R.id.user_level_unlock_light_animation);
        ImageView imageView = (ImageView) view.findViewById(R.id.user_level_lock);
        this.LLLJIL = imageView;
        C520690KbT c520690KbT = (C520690KbT) view.findViewById(R.id.xw8);
        this.LLLLIIIILLL = c520690KbT;
        this.LLLLIIL = (C1324720kZq) view.findViewById(R.id.j0l);
        if (C1125810fP1.LIZIZ()) {
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ez2);
            }
            if (c520690KbT != null) {
                C500260Jjc.LJJZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15)), c520690KbT);
                c520690KbT.setBackgroundResource(R.drawable.dp2);
                c520690KbT.setPadding(0, 0, 0, 0);
                C500260Jjc.LJLJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(59)), c520690KbT);
                c520690KbT.setWidthInOneDay(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
                C16F5 timer = c520690KbT.getTimer();
                if (timer != null) {
                    timer.setTypeface(C1119920fFW.LIZJ(timer.getTextSize(), 500, timer.getContext()));
                    timer.setTextSize(10.0f);
                    Integer numLIZ = C1135270feH.LIZ(R.attr.ezq, c520690KbT.getContext());
                    if (numLIZ != null) {
                        iIntValue = numLIZ.intValue();
                    } else {
                        iIntValue = -592138;
                    }
                    timer.setTextColor(iIntValue);
                    C500260Jjc.LJLJJL(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), timer);
                    C500260Jjc.LJJLJLI(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), timer);
                }
            }
        }
        if (!this.LLLLLLLLLL) {
            view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1151620g4e);
            this.LLLLLLLLLL = true;
        }
    }

    public static long K6(AbstractC1126600fQI abstractC1126600fQI) {
        Gift gift;
        T t = abstractC1126600fQI.LIZIZ;
        if ((t instanceof Gift) && (gift = (Gift) t) != null) {
            return gift.id;
        }
        return abstractC1126600fQI.LJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    @Override // X.AbstractC1126560fQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S5(int r8) {
        /*
            r7 = this;
            r3 = 1
            r7.LLLFFI = r3
            X.0fQI<? extends X.0054> r1 = r7.LLJJLIIIJLLLLLLLZ
            r4 = 0
            if (r1 == 0) goto L3f
            X.0fQ0 r0 = r1.LJIIZILJ
            if (r0 == 0) goto L2f
            if (r1 == 0) goto L2e
            X.0fQ0 r1 = r1.LJIIZILJ
            if (r1 == 0) goto L2e
            boolean r0 = r1.LIZIZ()
            if (r0 == 0) goto L2e
            boolean r0 = r1.LIZ()
            if (r0 != 0) goto L2e
            X.0kZq r3 = r7.LLJILLL
            if (r3 == 0) goto L2e
            Y.ARunnableS117S0100000_17 r2 = new Y.ARunnableS117S0100000_17
            r0 = 158(0x9e, float:2.21E-43)
            r2.<init>(r7, r0)
            r0 = 300(0x12c, double:1.48E-321)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPostDelay(r3, r2, r0)
        L2e:
            return
        L2f:
            if (r1 == 0) goto L3f
            long r5 = X.C1128450fTH.LJJIJIIJI()
            long r1 = r1.LJFF()
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L3f
            r5 = 1
            goto L40
        L3f:
            r5 = 0
        L40:
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = X.C1128450fTH.LIZ
            com.bytedance.android.live.base.model.user.User r0 = X.C1125800fP0.LIZJ()
            if (r0 == 0) goto L9b
            long r0 = r0.getId()
        L4c:
            boolean r1 = X.C1128450fTH.LJJII(r0)
            boolean r0 = X.C1125800fP0.LJFF()
            if (r0 != 0) goto L99
            if (r1 != 0) goto L99
            X.0fP3 r0 = X.C1125820fP2.LJFF()
            X.0fP6 r0 = r0.LIZ
            if (r0 == 0) goto L97
            X.0fPC r0 = r0.LIZ()
            if (r0 == 0) goto L97
            long r0 = r0.LIZ
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
        L6c:
            X.0fQI<? extends X.0054> r0 = r7.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L78
            long r0 = r0.LJFF()
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
        L78:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r4)
            if (r0 == 0) goto L99
            com.bytedance.android.livesdk.livesetting.gift.LiveGiftRealTimeApiSettings r0 = com.bytedance.android.livesdk.livesetting.gift.LiveGiftRealTimeApiSettings.INSTANCE
            boolean r0 = r0.enableRealTimeApiRequest()
            if (r0 != 0) goto L99
            r2 = 1
        L87:
            X.0fQI<? extends X.0054> r1 = r7.LLJJLIIIJLLLLLLLZ
            if (r1 == 0) goto L9e
            boolean r0 = r1.LIZJ
            if (r0 != r3) goto L9e
            if (r5 == 0) goto L9e
            com.bytedance.android.live.liveinteract.api.IInteractService r0 = X.C1128450fTH.LIZ
            r0.Ky1()
            return
        L97:
            r2 = r4
            goto L6c
        L99:
            r2 = 0
            goto L87
        L9b:
            r0 = 0
            goto L4c
        L9e:
            boolean r0 = r7.LLLFFI
            if (r0 == 0) goto Lb9
            if (r1 == 0) goto Lb9
            boolean r0 = r1.LIZJ
            if (r0 != 0) goto Lb9
            if (r5 != 0) goto Lac
            if (r2 == 0) goto Lb9
        Lac:
            X.0kZq r2 = r7.LLJILLL
            if (r2 == 0) goto Lb9
            Y.ARunnableS28S0101000_17 r1 = new Y.ARunnableS28S0101000_17
            r0 = 7
            r1.<init>(r8, r7, r0)
            com.bytedance.bpea.transmit.hook.HandlerHook.viewPost(r2, r1)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1126410fPz.S5(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6(boolean r5) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1126410fPz.S6(boolean):void");
    }

    public final void a7(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        Gift gift;
        GiftLockInfo giftLockInfo;
        boolean z = false;
        if (Long.valueOf(abstractC1126600fQI.LJ()) != null && abstractC1126600fQI.LJ() > 0) {
            C6(abstractC1126600fQI.LJ(), !abstractC1126600fQI.LJIJJ(), abstractC1126600fQI.LIZJ);
            return;
        }
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LJIIJ && (!abstractC1126600fQI2.LJJII() || !LiveUserLevelBackEnableSetting.INSTANCE.getValue())) {
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = this.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI3 == null) {
                return;
            }
            T t = abstractC1126600fQI3.LIZIZ;
            if (!(t instanceof Gift) || (gift = (Gift) t) == null || (giftLockInfo = gift.giftSubInfo) == null || giftLockInfo.mLockType != 6 || abstractC1126600fQI3.LJIL()) {
                return;
            }
        }
        if (D6()) {
            return;
        }
        if (!abstractC1126600fQI.LJIJJ() && abstractC1126600fQI.LJJ()) {
            z = true;
        }
        C6(abstractC1126600fQI.LJIIL, z, abstractC1126600fQI.LIZJ);
    }

    public final void b7(long j) {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI != null && abstractC1126600fQI.LJIJJLI() && abstractC1126600fQI.LIZJ && K6(abstractC1126600fQI) == j) {
            C520440Kb4 c520440Kb4J6 = J6();
            if (c520440Kb4J6 != null) {
                C786410Ut5.Q1(c520440Kb4J6, 0);
                C1142070fpF.LIZ.getClass();
                c520440Kb4J6.setPlaying(C1142070fpF.LJIILJJIL(j));
                return;
            }
            return;
        }
        T6();
        C520440Kb4 c520440Kb4 = this.LLLLIILLL;
        if (c520440Kb4 != null) {
            C786410Ut5.Q1(c520440Kb4, 8);
        }
    }

    @Override // X.AbstractC1126560fQE
    public final void f6(DataChannel dataChannel) {
        LinearLayout linearLayout = this.LLLILZLLLI;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        ImageView imageView = this.LLLJIL;
        if (imageView != null) {
            C786410Ut5.LJZI(8, imageView);
        }
        i7();
        h7(true);
        super.f6(dataChannel);
    }

    public final void h7(boolean z) {
        InterfaceC1126420fQ0 interfaceC1126420fQ0;
        boolean z2;
        Float fValueOf;
        boolean z3;
        C1324720kZq c1324720kZq;
        InterfaceC1126420fQ0 interfaceC1126420fQ02;
        InterfaceC1126420fQ0 interfaceC1126420fQ03;
        String str = this.LLLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateRecommendView: isSelected ");
        sbLIZ.append(z);
        sbLIZ.append(", showingRecommendGift ");
        sbLIZ.append(this.LLLLLJLJLL);
        sbLIZ.append(", giftPanelRecommendData == null ");
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        Float fValueOf2 = null;
        if (abstractC1126600fQI != null) {
            interfaceC1126420fQ0 = abstractC1126600fQI.LJIIZILJ;
        } else {
            interfaceC1126420fQ0 = null;
        }
        boolean z4 = true;
        if (interfaceC1126420fQ0 == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(", ");
        C1324720kZq c1324720kZq2 = this.LLJILLL;
        if (c1324720kZq2 != null) {
            fValueOf = Float.valueOf(c1324720kZq2.getScaleX());
        } else {
            fValueOf = null;
        }
        sbLIZ.append(fValueOf);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C1126370fPv c1126370fPv = this.LLLLLLJ;
        if (c1126370fPv != null && c1126370fPv.LIZIZ()) {
            C1126370fPv c1126370fPv2 = this.LLLLLLJ;
            if (c1126370fPv2 != null) {
                c1126370fPv2.LIZ();
            }
            this.LLLLLLJ = null;
            U6();
        }
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null && abstractC1126600fQI2.LJIIZILJ != null) {
            if (abstractC1126600fQI2 != null && (interfaceC1126420fQ03 = abstractC1126600fQI2.LJIIZILJ) != null && interfaceC1126420fQ03.LIZIZ()) {
                z3 = true;
            } else {
                z3 = false;
            }
            AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI3 = this.LLJJLIIIJLLLLLLLZ;
            if (abstractC1126600fQI3 == null || (interfaceC1126420fQ02 = abstractC1126600fQI3.LJIIZILJ) == null || !interfaceC1126420fQ02.LIZ()) {
                z4 = false;
            }
            String str2 = this.LLLLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateRecommendView: should show ");
            sbLIZ2.append(z3);
            sbLIZ2.append(", showed ");
            sbLIZ2.append(z4);
            sbLIZ2.append(", hasInitAndShowRecommendGift ");
            sbLIZ2.append(this.LLLLLL);
            C20441214yg.LJIIIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
            if (this.LLLLLJLJLL) {
                if (z) {
                    L6();
                    return;
                }
                if (z3 && !z4) {
                    U6();
                    return;
                }
                View view = this.LLJJJ;
                if (view == null) {
                    return;
                }
                C500260Jjc.LLFFF(view);
                return;
            }
            if (z) {
                return;
            }
            if (this.LLLLLL) {
                V6();
                return;
            } else {
                if ((z3 && !z4) || (c1324720kZq = this.LLJILLL) == null) {
                    return;
                }
                HandlerHook.viewPost(c1324720kZq, new ARunnableS117S0100000_17(this, 159));
                return;
            }
        }
        if (!this.LLLLLJLJLL) {
            C1324720kZq c1324720kZq3 = this.LLJILLL;
            if (c1324720kZq3 != null) {
                fValueOf2 = Float.valueOf(c1324720kZq3.getScaleX());
            }
            if (Intrinsics.LIZLLL(fValueOf2, 1.0f)) {
                return;
            }
        }
        U6();
    }

    public final void z6(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        if (abstractC1126600fQI.LJIJJLI() && abstractC1126600fQI.LIZJ) {
            b7(K6(abstractC1126600fQI));
            return;
        }
        T6();
        C520440Kb4 c520440Kb4 = this.LLLLIILLL;
        if (c520440Kb4 != null) {
            C786410Ut5.Q1(c520440Kb4, 8);
        }
    }

    @Override // X.AbstractC1126560fQE
    public final void L5(int i, C1149290g0t c1149290g0t) {
        C16F5 c16f5 = this.LLJJJJ;
        if (c16f5 != null) {
            c16f5.setOnTouchListener(new ATListenerS341S0200000_17(this, c1149290g0t, 0));
        }
        this.LLLILZ.setOnTouchListener(new ATListenerS450S0100000_17(c1149290g0t, 7));
    }

    public final void C6(long j, boolean z, boolean z2) {
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI;
        Gift gift;
        GiftLockInfo giftLockInfo;
        C520690KbT c520690KbT = this.LLLLIIIILLL;
        if (c520690KbT != null) {
            c520690KbT.setListener(this);
            if (z && !z2) {
                c520690KbT.LIZ(j);
                if (j - (C158B.LIZ() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) <= 0 && (abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ) != null) {
                    T t = abstractC1126600fQI.LIZIZ;
                    if ((t instanceof Gift) && (gift = (Gift) t) != null && (giftLockInfo = gift.giftSubInfo) != null && giftLockInfo.mLockType == 6) {
                        return;
                    }
                }
                C500260Jjc.LLFFF(c520690KbT);
                return;
            }
            C500260Jjc.LJIILIIL(c520690KbT);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0138  */
    @Override // X.AbstractC1126560fQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(X.AbstractC1126600fQI<? extends X.AnonymousClass0054> r12, com.bytedance.ies.sdk.datachannel.DataChannel r13, int r14) {
        /*
            Method dump skipped, instruction units count: 1111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1126410fPz.N5(X.0fQI, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }
}
