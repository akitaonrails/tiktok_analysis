package Y;

import X.C0GY9;
import X.C1085630eMD;
import X.C1126540fQC;
import X.C1768270w7F;
import X.C19QG;
import X.C19QH;
import X.C1AWL;
import X.C1C7U;
import X.C1DJG;
import X.C21657819pQ;
import X.C2182691Abb;
import X.C2182701Abc;
import X.C2186321AhS;
import X.C2187701Ajg;
import X.C786410Ut5;
import X.C957020b0m;
import X.C983850bi3;
import X.EnumC20300814c2;
import X.EnumC21696919vj;
import X.EnumC2244671CtN;
import X.InterfaceC1588310rQz;
import X.InterfaceC2186211AhH;
import X.InterfaceC2186331AhT;
import X.InterfaceC2188711AlJ;
import X.InterfaceC2188721AlK;
import X.InterfaceC2189431AmT;
import X.ViewTreeObserverOnScrollChangedListenerC21657919pR;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ttvecamera.TECameraCapture;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.player.FriendsV3PlayerManagerComponent;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.LynxExposeHelper;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.optimizer.live.sdk.dns.DnsOptimizer;
import com.tts.oecverify.BdTuring;
import java.util.LinkedList;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS66S0300000_33 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    public final void LIZ$0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C983850bi3 c983850bi3 = (C983850bi3) this.l0;
        C19QH c19qh = (C19QH) this.l1;
        View view = (View) this.l2;
        valueAnimatorOfFloat.setDuration(c983850bi3.LIZ);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.87f, 0.0f, 0.17f, 0.99f));
        valueAnimatorOfFloat.addListener(new AAListenerS343S0100000_33(view, 1));
        valueAnimatorOfFloat.addListener(new AAListenerS279S0200000_33(view, c19qh, 0));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS280S0100000_33(view, 2));
        c19qh.LLILZLL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public final void LIZ$1() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        C19QG c19qg = (C19QG) this.l0;
        C19QH c19qh = (C19QH) this.l1;
        View view = (View) this.l2;
        valueAnimatorOfFloat.setDuration(c19qg.LIZIZ);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.87f, 0.0f, 0.17f, 0.99f));
        valueAnimatorOfFloat.addListener(new AAListenerS145S0300000_33(view, c19qg, c19qh, 1));
        valueAnimatorOfFloat.addListener(new AAListenerS145S0300000_33(view, c19qg, c19qh, 0));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS160S0300000_33(view, c19qg, c19qh, 1));
        c19qh.LLILZLL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
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

    public final void LIZ$2() {
        LynxExposeHelper lynxExposeHelper = LynxExposeHelper.LIZ;
        View view = (View) this.l0;
        lynxExposeHelper.getClass();
        boolean z = false;
        if (view.isAttachedToWindow() && view.hasWindowFocus() && view.getWindowVisibility() == 0 && view.isShown() && view.getWidth() > 0 && view.getHeight() > 0 && view.getAlpha() > 0.0f) {
            if (view.getGlobalVisibleRect(new Rect())) {
                if (r2.height() * r2.width() >= view.getMeasuredWidth() * view.getMeasuredHeight() * 0.01f) {
                    z = true;
                }
            }
        }
        LynxExposeHelper.ExposeView exposeView = (LynxExposeHelper.ExposeView) this.l1;
        if (z != exposeView.LLILZ) {
            if (((EnumC20300814c2) this.l2) == EnumC20300814c2.FOCUS) {
                Lifecycle.Event event = exposeView.LLILLL;
                Lifecycle.Event event2 = Lifecycle.Event.ON_ANY;
                if (event == event2) {
                    exposeView.LLILLL = event2;
                    return;
                }
            }
            C1AWL c1awl = exposeView.LLILLJJLI;
            if (c1awl != null) {
                c1awl.LIZ(z);
            }
            LynxExposeHelper.ExposeView exposeView2 = (LynxExposeHelper.ExposeView) this.l1;
            exposeView2.LLILZ = z;
            exposeView2.LLILLL = Lifecycle.Event.ON_ANY;
        }
    }

    public final void LIZ$3() {
        boolean z;
        Object objCall;
        synchronized (((DnsOptimizer) this.l2).LJI) {
            try {
                z = !((LinkedList) ((DnsOptimizer) this.l2).LJI).contains((Callable) this.l0);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (z) {
            return;
        }
        try {
            objCall = ((Callable) this.l0).call();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            objCall = null;
        }
        C786410Ut5.LJJZZIII(((DnsOptimizer) this.l2).LIZJ, new ARunnableS102S0200000_33(this, objCall, 23));
    }

    public final void LIZ$4() {
        if (!((C21657819pQ) this.l0).LJ && ((View) this.l1).getParent() != null && ((View) this.l2).getParent() != null && ((View) this.l2).getVisibility() == 0 && ((View) this.l2).isShown() && ((View) this.l2).getWidth() > 0 && ((View) this.l2).getHeight() > 0) {
            int[] iArr = new int[2];
            ((View) this.l1).getLocationOnScreen(iArr);
            int i = iArr[1];
            if (i <= 0) {
                return;
            }
            int height = ((View) this.l1).getHeight() + i;
            int[] iArr2 = new int[2];
            ((View) this.l2).getLocationOnScreen(iArr2);
            int i2 = iArr2[1];
            int height2 = ((View) this.l2).getHeight() + i2;
            C21657819pQ c21657819pQ = (C21657819pQ) this.l0;
            if (c21657819pQ.LIZLLL) {
                if (i2 < i || height2 > height) {
                    return;
                }
            } else if (height2 <= i || i2 >= height) {
                return;
            }
            c21657819pQ.LJ = true;
            c21657819pQ.LIZJ.invoke();
            ViewTreeObserver viewTreeObserver = ((View) this.l1).getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                ViewTreeObserverOnScrollChangedListenerC21657919pR viewTreeObserverOnScrollChangedListenerC21657919pR = ((C21657819pQ) this.l0).LJFF;
                viewTreeObserver.removeOnScrollChangedListener(viewTreeObserverOnScrollChangedListenerC21657919pR);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnScrollChangedListenerC21657919pR, ViewTreeObserver.OnScrollChangedListener.class);
            }
            ((View) this.l2).removeOnLayoutChangeListener(((C21657819pQ) this.l0).LJI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$5() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS66S0300000_33.LIZ$5():void");
    }

    public static final void run$0(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("CustomViewFlipper@3258.launchFlip2StartAnim$1");
        try {
            aRunnableS66S0300000_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CustomViewFlipper@3258.launchFlip2StartAnim$1");
    }

    public static final void run$1(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("CustomViewFlipper@3258.launchFlip2UpAnim$1");
        try {
            aRunnableS66S0300000_33.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CustomViewFlipper@3258.launchFlip2UpAnim$1");
    }

    public static final void run$10(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.setStabilizationMode$1");
        try {
            ((b0) aRunnableS66S0300000_33.l2).setStabilizationMode((TECameraCapture) aRunnableS66S0300000_33.l0, (EnumC2244671CtN) aRunnableS66S0300000_33.l1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.setStabilizationMode$1");
    }

    public static final void run$11(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.getCameraCapbilitiesForBytebench$1");
        try {
            JSONObject cameraCapbilitiesForBytebench = ((b0) aRunnableS66S0300000_33.l2).getCameraCapbilitiesForBytebench((TECameraCapture) aRunnableS66S0300000_33.l0, (InterfaceC2186331AhT) aRunnableS66S0300000_33.l1);
            InterfaceC2186331AhT interfaceC2186331AhT = (InterfaceC2186331AhT) aRunnableS66S0300000_33.l1;
            if (interfaceC2186331AhT != null) {
                ((C2186321AhS) interfaceC2186331AhT).LIZ.LJJJJLI(cameraCapbilitiesForBytebench);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.getCameraCapbilitiesForBytebench$1");
    }

    public static final void run$12(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("FriendsV3PlayerManagerComponent@cf34.tryPlay$1");
        try {
            ((FriendsV3PlayerManagerComponent) aRunnableS66S0300000_33.l0).xo((InterfaceC1588310rQz) aRunnableS66S0300000_33.l1, (EnumC21696919vj) aRunnableS66S0300000_33.l2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FriendsV3PlayerManagerComponent@cf34.tryPlay$1");
    }

    public static final void run$13(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("LynxExposeHelper$ExposeView@b1f9.detect$1$1");
        try {
            aRunnableS66S0300000_33.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LynxExposeHelper$ExposeView@b1f9.detect$1$1");
    }

    public static final void run$14(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("DnsOptimizer@bdef.submit$1");
        try {
            aRunnableS66S0300000_33.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DnsOptimizer@bdef.submit$1");
    }

    public static final void run$15(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        InterfaceC2188721AlK[] interfaceC2188721AlKArr = (InterfaceC2188721AlK[]) aRunnableS66S0300000_33.l0;
        C1768270w7F c1768270w7F = (C1768270w7F) aRunnableS66S0300000_33.l1;
        InterfaceC2188711AlJ[] interfaceC2188711AlJArr = (InterfaceC2188711AlJ[]) aRunnableS66S0300000_33.l2;
        C1C7U.LIZ("MemoryInternal@16db.notifyMemoryChange$1L");
        for (InterfaceC2188721AlK interfaceC2188721AlK : interfaceC2188721AlKArr) {
            try {
                interfaceC2188721AlK.LIZ(c1768270w7F, true);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        for (InterfaceC2188711AlJ interfaceC2188711AlJ : interfaceC2188711AlJArr) {
            try {
                interfaceC2188711AlJ.LIZ(c1768270w7F);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        for (InterfaceC2188721AlK interfaceC2188721AlK2 : interfaceC2188721AlKArr) {
            try {
                interfaceC2188721AlK2.LIZ(c1768270w7F, false);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
            }
        }
        C1C7U.LIZIZ("MemoryInternal@16db.notifyMemoryChange$1L");
    }

    public static final void run$16(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("ScrollViewChildMonitorOpt@cc0d.checkVisibility$1");
        try {
            aRunnableS66S0300000_33.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ScrollViewChildMonitorOpt@cc0d.checkVisibility$1");
    }

    public static final void run$17(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("LiveAddToStoryAction@cb7a.execute$executeShare$1");
        try {
            aRunnableS66S0300000_33.LIZ$5();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveAddToStoryAction@cb7a.execute$executeShare$1");
    }

    public static final void run$2(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("GiftExpressionHelperV2@b131.playSmallFlyGiftOnMask$1$onAnimationStop$1");
        try {
            C786410Ut5.LJJJZ((C1126540fQC) aRunnableS66S0300000_33.l1, (FrameLayout) aRunnableS66S0300000_33.l0);
            C957020b0m c957020b0m = ((C2182691Abb) aRunnableS66S0300000_33.l2).LIZIZ;
            FrameLayout frameLayout = (FrameLayout) aRunnableS66S0300000_33.l0;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c957020b0m, frameLayout);
            c957020b0m.removeView(frameLayout);
            C1085630eMD<C1126540fQC> c1085630eMD = ((C2182691Abb) aRunnableS66S0300000_33.l2).LJIIJJI;
            if (c1085630eMD != null) {
                c1085630eMD.LIZ((C1126540fQC) aRunnableS66S0300000_33.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftExpressionHelperV2@b131.playSmallFlyGiftOnMask$1$onAnimationStop$1");
    }

    public static final void run$3(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("GiftExpressionHelperV2@b131.resetSmallFlyGiftAnimView$1");
        try {
            C786410Ut5.LJJJZ((C1126540fQC) aRunnableS66S0300000_33.l1, (FrameLayout) aRunnableS66S0300000_33.l0);
            C957020b0m c957020b0m = ((C2182691Abb) aRunnableS66S0300000_33.l2).LIZIZ;
            FrameLayout frameLayout = (FrameLayout) aRunnableS66S0300000_33.l0;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c957020b0m, frameLayout);
            c957020b0m.removeView(frameLayout);
            C1085630eMD<C1126540fQC> c1085630eMD = ((C2182691Abb) aRunnableS66S0300000_33.l2).LJIIJJI;
            if (c1085630eMD != null) {
                c1085630eMD.LIZ((C1126540fQC) aRunnableS66S0300000_33.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftExpressionHelperV2@b131.resetSmallFlyGiftAnimView$1");
    }

    public static final void run$4(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("GiftExpressionHelper@7c7f.playBigFlyGiftOnMask$1$onAnimationStop$1");
        try {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) aRunnableS66S0300000_33.l0;
            if (animatedDrawable2 != null) {
                animatedDrawable2.setVisible(false, false);
            }
            C786410Ut5.LJJJZ((C1126540fQC) aRunnableS66S0300000_33.l2, ((C2182701Abc) aRunnableS66S0300000_33.l1).LIZIZ.LJJIIJ());
            C1085630eMD<C1126540fQC> c1085630eMD = ((C2182701Abc) aRunnableS66S0300000_33.l1).LJII;
            if (c1085630eMD != null) {
                c1085630eMD.LIZ((C1126540fQC) aRunnableS66S0300000_33.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftExpressionHelper@7c7f.playBigFlyGiftOnMask$1$onAnimationStop$1");
    }

    public static final void run$5(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("GiftExpressionHelper@7c7f.playSmallFlyGiftOnMask$1$onAnimationStop$1");
        try {
            C786410Ut5.LJJJZ((C1126540fQC) aRunnableS66S0300000_33.l1, (FrameLayout) aRunnableS66S0300000_33.l0);
            C786410Ut5.LJJJZ((FrameLayout) aRunnableS66S0300000_33.l0, ((C2182701Abc) aRunnableS66S0300000_33.l2).LIZIZ.LJJIIJ());
            C1085630eMD<C1126540fQC> c1085630eMD = ((C2182701Abc) aRunnableS66S0300000_33.l2).LJI;
            if (c1085630eMD != null) {
                c1085630eMD.LIZ((C1126540fQC) aRunnableS66S0300000_33.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftExpressionHelper@7c7f.playSmallFlyGiftOnMask$1$onAnimationStop$1");
    }

    public static final void run$6(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("GiftExpressionHelper@7c7f.resetSmallFlyGiftAnimView$1");
        try {
            FrameLayout frameLayout = (FrameLayout) aRunnableS66S0300000_33.l0;
            if (frameLayout != null) {
                C786410Ut5.LJJJZ((C1126540fQC) aRunnableS66S0300000_33.l1, frameLayout);
            }
            C786410Ut5.LJJJZ((FrameLayout) aRunnableS66S0300000_33.l0, ((C2182701Abc) aRunnableS66S0300000_33.l2).LIZIZ.LJJIIJ());
            C1085630eMD<C1126540fQC> c1085630eMD = ((C2182701Abc) aRunnableS66S0300000_33.l2).LJI;
            if (c1085630eMD != null) {
                c1085630eMD.LIZ((C1126540fQC) aRunnableS66S0300000_33.l1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftExpressionHelper@7c7f.resetSmallFlyGiftAnimView$1");
    }

    public static final void run$7(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("GiftExpressionHelperV2@b131.playBigFlyGiftOnMask$1$onAnimationStop$1");
        try {
            ((AnimatedDrawable2) aRunnableS66S0300000_33.l0).setVisible(false, false);
            C957020b0m c957020b0m = ((C2182691Abb) aRunnableS66S0300000_33.l1).LIZIZ;
            C1126540fQC c1126540fQC = (C1126540fQC) aRunnableS66S0300000_33.l2;
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c957020b0m, c1126540fQC);
            c957020b0m.removeView(c1126540fQC);
            C1085630eMD<C1126540fQC> c1085630eMD = ((C2182691Abb) aRunnableS66S0300000_33.l1).LJIIL;
            if (c1085630eMD != null) {
                c1085630eMD.LIZ((C1126540fQC) aRunnableS66S0300000_33.l2);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GiftExpressionHelperV2@b131.playBigFlyGiftOnMask$1$onAnimationStop$1");
    }

    public static final void run$8(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.getFOV$1");
        try {
            float[] fov = ((b0) aRunnableS66S0300000_33.l2).getFOV((TECameraCapture) aRunnableS66S0300000_33.l0, (InterfaceC2186211AhH) aRunnableS66S0300000_33.l1);
            InterfaceC2186211AhH interfaceC2186211AhH = (InterfaceC2186211AhH) aRunnableS66S0300000_33.l1;
            if (interfaceC2186211AhH != null) {
                interfaceC2186211AhH.LIZ(fov);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.getFOV$1");
    }

    public static final void run$9(ARunnableS66S0300000_33 aRunnableS66S0300000_33) {
        boolean zLIZ;
        InterfaceC2189431AmT interfaceC2189431AmT;
        C1C7U.LIZ("TECameraServer@d252.focusAtPoint$1");
        try {
            int iFocusAtPoint = ((b0) aRunnableS66S0300000_33.l2).focusAtPoint((TECameraCapture) aRunnableS66S0300000_33.l0, (C1DJG) aRunnableS66S0300000_33.l1);
            if (iFocusAtPoint != 0 && (interfaceC2189431AmT = ((C1DJG) aRunnableS66S0300000_33.l1).LJIIJJI) != null) {
                interfaceC2189431AmT.LIZ(iFocusAtPoint, ((b0) aRunnableS66S0300000_33.l2).mCameraSettings.LLILZ, "");
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.focusAtPoint$1");
    }

    public ARunnableS66S0300000_33(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
