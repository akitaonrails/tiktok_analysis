package Y;

import X.AbstractC1093440eYo;
import X.C0VMV;
import X.C1093150eYL;
import X.C1094360eaI;
import X.C1099190ei5;
import X.C1117710fBx;
import X.C1124670fNB;
import X.C1124680fNC;
import X.C1127920fSQ;
import X.C1128710fTh;
import X.C1132840faM;
import X.C1133910fc5;
import X.C1136390fg5;
import X.C1136500fgG;
import X.C1136560fgM;
import X.C1139450fl1;
import X.C1139460fl2;
import X.C1139470fl3;
import X.C1139480fl4;
import X.C1145600fuw;
import X.C11JF;
import X.C11S5;
import X.C1295960jpS;
import X.C1701940uOG;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C259800zU;
import X.C480460Ism;
import X.C500260Jjc;
import X.InterfaceC1093480eYs;
import X.InterfaceC1136020ffU;
import X.InterfaceC1139780flY;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchBottomNoticeCard;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.base.platform.business.effect.collaborativegifting.CollabGiftApi;
import com.bytedance.android.livesdk.livesetting.gift.GiftCollaborateGiftingWatchdogJitterSetting;
import com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftFullInfo;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public class ARunnableS25S0400000_17 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        C1136560fgM c1136560fgMLJFF = (C1136560fgM) this.l0;
        if (c1136560fgMLJFF == null) {
            c1136560fgMLJFF = C1136390fg5.LJFF((GiftMessage) this.l1, (InterfaceC1139780flY) this.l2);
        }
        C20441214yg.LJIIIZ("gift_sticker_ttlive_gift_render", "handle the message check done, ready to go");
        if (c1136560fgMLJFF == null) {
            C20441214yg.LJ("gift_sticker_ttlive_gift_render", "handleGiftMessage error - stickerEffectMessage is null");
            C1136500fgG.LJFF((GiftMessage) this.l1);
            return;
        }
        C1139480fl4 c1139480fl4 = (C1139480fl4) this.l3;
        if (c1139480fl4.LL) {
            C20441214yg.LJ("gift_sticker_ttlive_gift_render", "handleGiftMessage ignore msg due to stop");
        } else {
            c1136560fgMLJFF.LJJJIL = "effect_gift";
            c1139480fl4.LLILLJJLI.LJIIZILJ(c1136560fgMLJFF);
        }
    }

    public final void LIZ$1() {
        C1136560fgM c1136560fgMLJ = (C1136560fgM) this.l0;
        if (c1136560fgMLJ == null) {
            c1136560fgMLJ = C1136390fg5.LJ((InterfaceC1136020ffU) this.l1, (InterfaceC1139780flY) this.l2);
        }
        C1133910fc5.LIZLLL("GiftStickerMessageQueueManager", "handle the message check done, ready to go");
        if (c1136560fgMLJ == null) {
            C1133910fc5.LIZJ("GiftStickerMessageQueueManager", "handleGiftMessage error - stickerEffectMessage is null", null);
            C1136500fgG.LJ((InterfaceC1136020ffU) this.l1);
            return;
        }
        C1139450fl1 c1139450fl1 = (C1139450fl1) this.l3;
        if (c1139450fl1.LL) {
            C1133910fc5.LIZJ("GiftStickerMessageQueueManager", "handleGiftMessage ignore msg due to stop", null);
        } else {
            c1139450fl1.LLILLJJLI.LJIIZILJ(c1136560fgMLJ);
        }
    }

    public final void LIZ$2() {
        C1099190ei5 c1099190ei5 = (C1099190ei5) this.l0;
        C1295960jpS c1295960jpS = (C1295960jpS) this.l1;
        View view = (View) this.l2;
        Function0<Unit> function0 = (Function0) this.l3;
        if (!c1099190ei5.LJIIJ) {
            c1099190ei5.LIZ(function0);
            return;
        }
        FrameLayout frameLayout = c1099190ei5.LIZIZ;
        if (frameLayout == null) {
            c1099190ei5.LIZ(function0);
            return;
        }
        View view2 = c1099190ei5.LIZJ;
        C500260Jjc.LLFFF(frameLayout);
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat.setDuration(200L);
            objectAnimatorOfFloat.setInterpolator(C1099190ei5.LJIILLIIL);
            arrayList.add(objectAnimatorOfFloat);
        }
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
            objectAnimatorOfFloat2.setDuration(200L);
            objectAnimatorOfFloat2.setInterpolator(C1099190ei5.LJIILLIIL);
            arrayList.add(objectAnimatorOfFloat2);
        }
        if (c1099190ei5.LJII != null) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(255, 0);
            valueAnimatorOfInt.setDuration(200L);
            valueAnimatorOfInt.setInterpolator(C1099190ei5.LJIILLIIL);
            valueAnimatorOfInt.addUpdateListener(new AUListenerS266S0100000_17(c1099190ei5, 72));
            arrayList.add(valueAnimatorOfInt);
        }
        if (!arrayList.isEmpty()) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new ALAdapterS13S0100000_17(c1099190ei5, 53));
            animatorSet.start();
            c1099190ei5.LJIILIIL = animatorSet;
        }
        ArrayList arrayList2 = new ArrayList();
        if (view2 != null) {
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat3.setDuration(200L);
            objectAnimatorOfFloat3.setStartDelay(3875L);
            objectAnimatorOfFloat3.setInterpolator(C1099190ei5.LJIILLIIL);
            arrayList2.add(objectAnimatorOfFloat3);
        }
        if (view != null) {
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
            objectAnimatorOfFloat4.setDuration(200L);
            objectAnimatorOfFloat4.setStartDelay(3875L);
            objectAnimatorOfFloat4.setInterpolator(C1099190ei5.LJIILLIIL);
            arrayList2.add(objectAnimatorOfFloat4);
        }
        if (c1099190ei5.LJII != null) {
            ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, 255);
            valueAnimatorOfInt2.setDuration(200L);
            valueAnimatorOfInt2.setStartDelay(3875L);
            valueAnimatorOfInt2.setInterpolator(C1099190ei5.LJIILLIIL);
            valueAnimatorOfInt2.addUpdateListener(new AUListenerS266S0100000_17(c1099190ei5, 73));
            arrayList2.add(valueAnimatorOfInt2);
        }
        if (!arrayList2.isEmpty()) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(arrayList2);
            animatorSet2.addListener(new ALAdapterS12S0200000_17(c1099190ei5, function0, 21));
            animatorSet2.start();
            c1099190ei5.LJIILJJIL = animatorSet2;
        }
        c1295960jpS.addAnimatorListener(new ALAdapterS9S0100000_12(frameLayout, 32));
        c1295960jpS.playAnimation();
    }

    public final void LIZ$3() {
        if (C1124670fNB.LJIIJJI((C1124680fNC) this.l1, ((C1124670fNB) this.l0).LJ())) {
            ((C1124670fNB) this.l0).LJIIJ();
            return;
        }
        C1128710fTh c1128710fTh = (C1128710fTh) this.l2;
        if (c1128710fTh == null || !c1128710fTh.LLZLI) {
            ((C1124670fNB) this.l0).LJ().B0((C1094360eaI) this.l3);
        }
        C1117710fBx c1117710fBxLIZLLL = ((C1124670fNB) this.l0).LJ();
        C1127920fSQ c1127920fSQ = ((C1124680fNC) this.l1).LJIIL;
        c1117710fBxLIZLLL.n0(c1127920fSQ != null ? c1127920fSQ.LIZ : false);
    }

    public final void LIZ$4() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fallbackTimer fired: requesting state sync, session=");
        sbLIZ.append(((CollabGiftBaseInfo) this.l0).collabSessionId);
        C20441214yg.LJIIIZ("CollaborateGiftingStateMachine", C2188811AlT.LIZIZ(sbLIZ));
        C1132840faM c1132840faM = (C1132840faM) this.l1;
        CollabGiftBaseInfo collabGiftBaseInfo = (CollabGiftBaseInfo) this.l0;
        CollabGiftActiveInfo collabGiftActiveInfo = (CollabGiftActiveInfo) this.l2;
        CollabGiftFullInfo collabGiftFullInfo = (CollabGiftFullInfo) this.l3;
        C11JF c11jf = c1132840faM.LLILZIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C480460Ism.LIZ().getClass();
        c1132840faM.LLILZIL = (C11JF) ((CollabGiftApi) C480460Ism.LIZIZ(CollabGiftApi.class)).getCollabGiftState(collabGiftBaseInfo.collabSessionId).LJJI(new SecureRandom().nextInt(GiftCollaborateGiftingWatchdogJitterSetting.INSTANCE.getExpireMs()), TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS67S0400000_17(c1132840faM, collabGiftActiveInfo, collabGiftBaseInfo, collabGiftFullInfo, 0), new AfS67S0400000_17(c1132840faM, collabGiftActiveInfo, collabGiftBaseInfo, collabGiftFullInfo, 1));
    }

    public static final void run$0(ARunnableS25S0400000_17 aRunnableS25S0400000_17) {
        boolean zLIZ;
        C1C7U.LIZ("MatchBottomNoticeCard@8c49.layoutPullOutAnimation$$inlined$doOnPreDraw$1");
        try {
            ((MatchBottomNoticeCard) aRunnableS25S0400000_17.l1).Vo((View) aRunnableS25S0400000_17.l2, (C1145600fuw) aRunnableS25S0400000_17.l3, false);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("MatchBottomNoticeCard@8c49.layoutPullOutAnimation$$inlined$doOnPreDraw$1");
    }

    public static final void run$1(ARunnableS25S0400000_17 aRunnableS25S0400000_17) {
        boolean zLIZ;
        C1C7U.LIZ("StickerMessageHandler@53da.handleGiftMessage$cont$1");
        try {
            aRunnableS25S0400000_17.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerMessageHandler@53da.handleGiftMessage$cont$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$2(ARunnableS25S0400000_17 aRunnableS25S0400000_17) {
        boolean zLIZ;
        C1C7U.LIZ("StickerMessageQueueRender@15fb.onFacialAlgorithmModelPrepared$1");
        try {
            ((C1139470fl3) aRunnableS25S0400000_17.l0).LJIILL((C1136560fgM) aRunnableS25S0400000_17.l1, (AssetsModel) aRunnableS25S0400000_17.l2, (LiveEffect) ((C259800zU) aRunnableS25S0400000_17.l3).element);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StickerMessageQueueRender@15fb.onFacialAlgorithmModelPrepared$1");
    }

    public static final void run$3(ARunnableS25S0400000_17 aRunnableS25S0400000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftStickerMessageQueueManager@a1d1.handleGiftMessage$cont$1");
        try {
            aRunnableS25S0400000_17.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftStickerMessageQueueManager@a1d1.handleGiftMessage$cont$1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$4(ARunnableS25S0400000_17 aRunnableS25S0400000_17) {
        boolean zLIZ;
        C1C7U.LIZ("GiftStickerMessageQueue@d013.onFacialAlgorithmModelPrepared$1");
        try {
            ((C1139460fl2) aRunnableS25S0400000_17.l0).LJIILL((C1136560fgM) aRunnableS25S0400000_17.l1, (AssetsModel) aRunnableS25S0400000_17.l2, (LiveEffect) ((C259800zU) aRunnableS25S0400000_17.l3).element);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftStickerMessageQueue@d013.onFacialAlgorithmModelPrepared$1");
    }

    public static final void run$5(ARunnableS25S0400000_17 aRunnableS25S0400000_17) {
        boolean zLIZ;
        C1C7U.LIZ("FragmentEarnedAnimator@4887.startAnim$1$onFinish$1");
        try {
            aRunnableS25S0400000_17.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FragmentEarnedAnimator@4887.startAnim$1$onFinish$1");
    }

    public static final void run$6(ARunnableS25S0400000_17 aRunnableS25S0400000_17) {
        boolean zLIZ;
        C1C7U.LIZ("UserLevelBannerHandler@b203.renderView$1");
        try {
            aRunnableS25S0400000_17.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("UserLevelBannerHandler@b203.renderView$1");
    }

    public static final void run$7(ARunnableS25S0400000_17 aRunnableS25S0400000_17) {
        boolean zLIZ;
        C1C7U.LIZ("StrategyEngine@51d8.callActions$1$1");
        try {
            ((InterfaceC1093480eYs) aRunnableS25S0400000_17.l0).LIZ(((AbstractC1093440eYo) aRunnableS25S0400000_17.l1).LIZ.LIZJ, (C0VMV) aRunnableS25S0400000_17.l2, (C1093150eYL) aRunnableS25S0400000_17.l3);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StrategyEngine@51d8.callActions$1$1");
    }

    public static final void run$8(ARunnableS25S0400000_17 aRunnableS25S0400000_17) {
        boolean zLIZ;
        C1C7U.LIZ("CollaborateGiftingStateMachine@8efd.delayRequestCollabGiftStateApi$runnable$1");
        try {
            aRunnableS25S0400000_17.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CollaborateGiftingStateMachine@8efd.delayRequestCollabGiftStateApi$runnable$1");
    }

    public ARunnableS25S0400000_17(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj3;
        this.l1 = obj2;
        this.l2 = obj;
        this.l3 = obj4;
    }
}
