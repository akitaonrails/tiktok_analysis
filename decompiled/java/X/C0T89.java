package X;

import Y.AAListenerS258S0200000_2;
import Y.ARunnableS112S0100000_12;
import Y.ARunnableS21S0400000_12;
import Y.ARunnableS45S0300000_12;
import Y.ARunnableS81S0200000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS17S0410000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0T89, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T89 extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final List<ViewPropertyAnimator> LLILZIL;
    public C0T8B LLILZLL;
    public Function0<Unit> LLIZ;
    public final ARunnableS112S0100000_12 LLIZLLLIL;

    private final int getMargin() {
        return ((Number) this.LL.getValue()).intValue();
    }

    public final void LIZJ() {
        Iterator<ViewPropertyAnimator> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().cancel();
        }
        ((ArrayList) this.LLILZIL).clear();
    }

    public final View getDivider() {
        return (View) this.LLILLL.getValue();
    }

    public final C754480Tig getGiftGalleryView() {
        return (C754480Tig) this.LLILZ.getValue();
    }

    public final C16FV getMasker() {
        return (C16FV) this.LLILLJJLI.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        HandlerHook.viewRemoveCallbacks(this, this.LLIZLLLIL);
        LIZJ();
    }

    public final void setOnGalleryClickListener$livegift_impl_release(Function1<? super Boolean, Unit> function1) {
        C754480Tig giftGalleryView = getGiftGalleryView();
        if (giftGalleryView != null) {
            giftGalleryView.setOnClickListener$livegift_impl_release(function1);
        }
    }

    public C0T89(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(137));
        this.LLILLJJLI = C292401Bi.LIZ(new AwS556S0100000_12(this, 299));
        this.LLILLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 297));
        this.LLILZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 298));
        this.LLILZIL = new ArrayList();
        this.LLIZLLLIL = new ARunnableS112S0100000_12(this, 138);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C0T8B c0t8b, C0T8B c0t8b2) {
        View view;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("adaptConstraintSet ");
        sbLIZ.append(c0t8b);
        sbLIZ.append(", ");
        sbLIZ.append(c0t8b2);
        C20441214yg.LIZIZ("BannerParentLayout", C2188811AlT.LIZIZ(sbLIZ));
        if ((c0t8b instanceof View) && (view = (View) c0t8b) != null) {
            C1117830fC9.LIZ(0, view);
        }
        View view2 = (View) c0t8b2;
        C1117830fC9.LIZ(getMargin(), view2);
        view2.requestLayout();
    }

    public static void LIZIZ(C0T89 c0t89, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        c0t89.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("animateShowBox# endAction : ");
        sbLIZ.append((Object) null);
        C20441214yg.LIZIZ("BannerParentLayout", C2188811AlT.LIZIZ(sbLIZ));
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = null;
        C754480Tig giftGalleryView = c0t89.getGiftGalleryView();
        if (giftGalleryView != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = giftGalleryView.animate();
            if (viewPropertyAnimatorAnimate != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            int visibility = giftGalleryView.getVisibility();
            giftGalleryView.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, giftGalleryView);
            if (z) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(giftGalleryView);
                giftGalleryView.setAlpha(0.0f);
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = giftGalleryView.animate();
            if (viewPropertyAnimatorAnimate2 != null) {
                viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(300L).setInterpolator(new C12DM()).withStartAction(new ARunnableS81S0200000_12(viewPropertyAnimatorAnimate2, c0t89, 8)).withEndAction(new ARunnableS45S0300000_12(c0t89, viewPropertyAnimatorAnimate2, c259800zU, 0)).start();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZLLL(C0T89 c0t89, Long l, C1127920fSQ c1127920fSQ, C0T8B c0t8b, AwS561S0100000_17 awS561S0100000_17, int i) {
        boolean z;
        boolean z2;
        C754480Tig giftGalleryView;
        Function0<Unit> function0 = awS561S0100000_17;
        if ((i & 16) != 0) {
            function0 = AFwS199S0000000_12.get$arr$(13);
        }
        if (C1127480fRi.LJIIIIZZ(l) && c0t8b != 0 && c0t8b.h() && c1127920fSQ != null && c1127920fSQ.LIZ && ((!C753060TgO.LIZ() || C497740JfY.LJIL()) && !C1125810fP1.LIZ())) {
            z = true;
        } else {
            z = false;
        }
        C0T89 c0t892 = c0t89;
        C754480Tig giftGalleryView2 = c0t892.getGiftGalleryView();
        if (giftGalleryView2 != null && giftGalleryView2.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isGalleryHasShown = ");
        sbLIZ.append(z2);
        sbLIZ.append(",  shouldShowDisplayGallery = ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("BannerParentLayout", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            c0t892.LLILZLL = c0t8b;
            c0t892.LLIZ = function0;
            if (z2) {
                if (c1127920fSQ != null && (giftGalleryView = c0t892.getGiftGalleryView()) != null) {
                    giftGalleryView.e0(c1127920fSQ, null);
                }
                LIZIZ(c0t892, false, 3);
                if (c0t8b != 0) {
                    c0t892.LIZ(null, c0t8b);
                    HandlerHook.viewPostDelay(c0t892, new ARunnableS81S0200000_12(c0t8b, c0t892, 11), 30L);
                }
            } else {
                AwS17S0410000_12 awS17S0410000_12 = new AwS17S0410000_12(c0t892, c1127920fSQ, c0t8b, null, 0);
                C754480Tig giftGalleryView3 = c0t892.getGiftGalleryView();
                if (giftGalleryView3 != null) {
                    ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(giftGalleryView3, new ARunnableS81S0200000_12(awS17S0410000_12, giftGalleryView3, 12));
                }
            }
        } else {
            c0t892.LLILZLL = null;
            c0t892.LLIZ = null;
            if (c0t8b != 0) {
                C20441214yg.LIZIZ("BannerParentLayout", "adaptConstraintSetWhenDismiss");
                View view = (View) c0t8b;
                C1117830fC9.LIZ(0, view);
                view.requestLayout();
            }
            if (z2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("animateHideBox# endAction : ");
                sbLIZ2.append((Object) null);
                C20441214yg.LIZIZ("BannerParentLayout", C2188811AlT.LIZIZ(sbLIZ2));
                C259800zU c259800zU = new C259800zU();
                c259800zU.element = null;
                for (View view2 : (ArrayList) C13LP.LJJJJLI(C1697810uHb.LJ(c0t892.getGiftGalleryView(), c0t892.getMasker(), c0t892.getDivider()))) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
                    if (viewPropertyAnimatorAnimate != null) {
                        viewPropertyAnimatorAnimate.cancel();
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                    if (viewPropertyAnimatorAnimate2 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = viewPropertyAnimatorAnimate2.alpha(0.0f).setDuration(300L).setInterpolator(new C12DM()).withStartAction(new ARunnableS81S0200000_12(viewPropertyAnimatorAnimate2, c0t892, 7));
                        c0t892 = c0t892;
                        viewPropertyAnimatorWithStartAction.withEndAction(new ARunnableS21S0400000_12(c0t892, viewPropertyAnimatorAnimate2, view2, c259800zU, 0)).setListener(new AAListenerS258S0200000_2(view2, c259800zU, 0)).start();
                    }
                }
            } else {
                C20441214yg.LIZIZ("BannerParentLayout", "hideGiftBox#");
                c0t892.LIZJ();
                View divider = c0t892.getDivider();
                if (divider != null) {
                    C786410Ut5.LJLLLLLL(8, divider);
                }
                C16FV masker = c0t892.getMasker();
                if (masker != null) {
                    C786410Ut5.LLJJJJJIL(masker, 8);
                }
                C754480Tig giftGalleryView4 = c0t892.getGiftGalleryView();
                if (giftGalleryView4 != null) {
                    int visibility = giftGalleryView4.getVisibility();
                    giftGalleryView4.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, giftGalleryView4);
                }
            }
            function0.invoke();
        }
        c0t892.getGiftGalleryView();
        function0.invoke();
    }
}
