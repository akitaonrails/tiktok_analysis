package X;

import Y.AUListenerS279S0100000_32;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.app.services.InterceptHomeBackPressService;
import com.ss.android.ugc.aweme.ecommerce.mixmall.event.data.TTKECMMKGlobalContextModule;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import g1c.AjS46S0200000_32;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS147S1200000_32;
import kotlin.jvm.internal.AwS148S0110000_32;
import kotlin.jvm.internal.AwS161S0110000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.17qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC21155717qd extends AbstractC21154217qO implements ViewTreeObserver.OnGlobalLayoutListener, InterfaceC1768080w6w, InterfaceC1385905bd {
    public final C1771920wD8 LLIZLLLIL;
    public View LLJ;
    public C1772770wEV LLJI;
    public AnonymousClass0956 LLJIJIL;
    public C2252611DEt LLJILJIL;
    public PageFinder LLJILJILJ;

    @Override // X.InterfaceC1768080w6w
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJ(int i) {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJI() {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJIIIIZZ(int i, boolean z) {
    }

    @Override // X.InterfaceC1768080w6w
    public final void LJIIJ(boolean z) {
    }

    @Override // X.InterfaceC1385905bd
    public final boolean onBackPress() {
        View view;
        if (this.LLILZIL || !this.LLILLL.LIZ() || (view = this.LLJ) == null || view.getVisibility() != 0) {
            return false;
        }
        C21157017qq c21157017qq = this.LLILLJJLI;
        C21155817qe c21155817qe = this.LLILLL.LJI;
        C21157017qq.LIZ(c21157017qq, this, c21155817qe != null ? c21155817qe.LJI : false, C21155317qZ.LJFF, null, 17);
        return true;
    }

    @Override // X.AbstractC21154217qO
    public final void LJIIL() {
        C1772770wEV c1772770wEV = this.LLJI;
        if (c1772770wEV != null) {
            c1772770wEV.release();
        }
        this.LLJI = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.LLIZLLLIL.getMeasuredWidth() <= 0 || this.LLIZLLLIL.getMeasuredHeight() <= 0) {
            return;
        }
        C786410Ut5.C3(this.LLIZLLLIL.getViewTreeObserver(), this);
        C21155817qe c21155817qe = this.LLILLL.LJI;
        if (c21155817qe != null && c21155817qe.LJFF == EnumC1490800oti.BOTTOM_POPUP) {
            C1771920wD8 c1771920wD8 = this.LLIZLLLIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771920wD8);
            c1771920wD8.setAlpha(1.0f);
            C1771920wD8 c1771920wD82 = this.LLIZLLLIL;
            float measuredHeight = c1771920wD82.getMeasuredHeight();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771920wD82);
            c1771920wD82.setTranslationY(measuredHeight);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS279S0100000_32(this, 1));
        valueAnimatorOfFloat.start();
    }

    @Override // X.InterfaceC1768080w6w
    public final void LIZ(boolean z) {
        View view;
        int i;
        if (this.LLILZIL) {
            return;
        }
        if (this.LLJILJIL != null) {
            if (z) {
                new AwS576S0100000_32(this, 20);
                C324990Cob.LIZIZ(this.LLJILJIL);
                this.LLJILJIL = null;
                return;
            }
            return;
        }
        if (!this.LLILLL.LIZ() || (view = this.LLJ) == null) {
            return;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, view);
    }

    @Override // X.AbstractC21154217qO
    public final void LJIIIZ(FrameLayout frameLayout) {
        AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJIJIL = null;
        C2252611DEt c2252611DEt = this.LLJILJIL;
        if (c2252611DEt != null) {
            c2252611DEt.LJJIIZ(null);
        }
        this.LLJILJIL = null;
        ((InterceptHomeBackPressService) ServiceManager.get().getService(InterceptHomeBackPressService.class)).LIZ(this);
        this.LL.LIZLLL.M4(this);
        this.LLJ = null;
        C786410Ut5.LJJJJIZL(frameLayout);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC21155717qd(C1771760wCs c1771760wCs, C21157017qq c21157017qq, C21155617qc c21155617qc, Context context) {
        super(c1771760wCs, c21157017qq, c21155617qc);
        this.LLIZLLLIL = new C1771920wD8(context);
        c1771760wCs.LIZLLL.L4(this);
    }

    @Override // X.AbstractC21154217qO
    public final void LJIIJJI(final FrameLayout frameLayout, FrameLayout frameLayout2, final AwS161S0110000_32 awS161S0110000_32, final AwS576S0100000_32 awS576S0100000_32, final AwS576S0100000_32 awS576S0100000_322, final AwS148S0110000_32 awS148S0110000_32) {
        int measuredWidth;
        FrameLayout.LayoutParams layoutParams;
        int i;
        this.LLJ = frameLayout;
        C786410Ut5.LJZ(8, frameLayout);
        C21155817qe c21155817qe = this.LLILLL.LJI;
        if (c21155817qe != null) {
            View view = new View(frameLayout.getContext());
            view.setBackgroundColor(c21155817qe.LIZJ);
            if (!c21155817qe.LJ || c21155817qe.LIZLLL) {
                C786410Ut5.I7(new AjS46S0200000_32(c21155817qe, this, 0), view);
            }
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        }
        C21155817qe c21155817qe2 = this.LLILLL.LJI;
        if (c21155817qe2 != null && c21155817qe2.LJFF != EnumC1490800oti.NONE) {
            C1771920wD8 c1771920wD8 = this.LLIZLLLIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771920wD8);
            c1771920wD8.setAlpha(0.0f);
            C786410Ut5.x3(this.LLIZLLLIL.getViewTreeObserver(), this);
        } else {
            C1771920wD8 c1771920wD82 = this.LLIZLLLIL;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1771920wD82);
            c1771920wD82.setAlpha(1.0f);
        }
        View view2 = this.LLIZLLLIL;
        C21155817qe c21155817qe3 = this.LLILLL.LJI;
        if (c21155817qe3 == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            int iLJ = C13LZ.LJ(c21155817qe3.LIZ, 0, 100);
            int iLJ2 = C13LZ.LJ(this.LLILLL.LJI.LIZIZ, 0, 100);
            this.LLIZLLLIL.setWidthPercent(iLJ);
            this.LLIZLLLIL.setHeightPercent(iLJ2);
            int measuredHeight = -2;
            if (iLJ != 0) {
                if (iLJ != 100) {
                    measuredWidth = (int) (((double) frameLayout.getMeasuredWidth()) * (((double) iLJ) / 100.0d));
                } else {
                    measuredWidth = -1;
                }
            } else {
                measuredWidth = -2;
            }
            if (iLJ2 != 0) {
                if (iLJ2 != 100) {
                    measuredHeight = (int) (((double) frameLayout.getMeasuredHeight()) * (((double) iLJ2) / 100.0d));
                } else {
                    measuredHeight = -1;
                }
            }
            layoutParams = new FrameLayout.LayoutParams(measuredWidth, measuredHeight);
            if (this.LLILLL.LJI.LJFF == EnumC1490800oti.BOTTOM_POPUP) {
                i = 81;
            } else {
                i = 17;
            }
            layoutParams.gravity = i;
        }
        frameLayout.addView(view2, layoutParams);
        final long j = this.LLILLL.LJFF;
        if (j > 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            this.LLJIJIL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C21158317r3(j, this, awS161S0110000_32, null), 3);
        }
        C1772770wEV c1772770wEVLIZ = C0WOY.LIZ(C0WOW.SPARK_LITE);
        Context context = frameLayout.getContext();
        C21155617qc c21155617qc = this.LLILLL;
        String str = c21155617qc.LIZLLL;
        String str2 = c21155617qc.LJ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("ecGlobalContext", new C1311220kE4(TTKECMMKGlobalContextModule.class, Collections.singletonList(this.LL.LIZIZ))));
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair(InterfaceC606320NqI.class, new C1544630qIX(this.LL.LIZ)), new Pair(InterfaceC599750Nfh.class, new C1544630qIX(this.LL.LIZIZ)), new Pair(InterfaceC21154317qP.class, new C1544630qIX(this)));
        C1771760wCs c1771760wCs = this.LL;
        View viewLJI = c1772770wEVLIZ.LJI(context, new C1772800wEY(str, str2, mapLJIIIIZZ, mapLJIIJ, null, null, false, c1771760wCs.LIZIZ, C2097908Jt.LIZJ(new Pair("shop_mix_mall_global_data", c1771760wCs.LIZJ)), null, false, null, "popup_view", null, 48356), null, new AbstractC1772940wEm() { // from class: X.17qM
            @Override // X.AbstractC1772940wEm
            public final void LIZJ() {
                new AwS576S0100000_32(this.LIZ, 15);
                awS161S0110000_32.invoke(Boolean.TRUE, null, null);
                if (j <= 0 || this.LIZ.LLJIJIL != null) {
                    AnonymousClass0956 anonymousClass0956 = this.LIZ.LLJIJIL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    this.LIZ.LLJIJIL = null;
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C21158117r1(this.LIZ, awS576S0100000_32, frameLayout, awS576S0100000_322, awS148S0110000_32, null), 3);
                }
            }

            @Override // X.AbstractC1772940wEm
            public final void LIZIZ(InterfaceC1541990qEH interfaceC1541990qEH) {
                new AwS576S0100000_32(this.LIZ, 17);
                if (this.LIZ.LLILLL.LIZ()) {
                    ViewTreeObserverOnGlobalLayoutListenerC21155717qd viewTreeObserverOnGlobalLayoutListenerC21155717qd = this.LIZ;
                    if (C7879035x.LIZLLL()) {
                        viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLJILJILJ = PageFinder.via(viewTreeObserverOnGlobalLayoutListenerC21155717qd.LL.LJ);
                        C1059860dge c1059860dge = (C1059860dge) interfaceC1541990qEH.getHybridContext().LJFF(C1059860dge.class);
                        if (c1059860dge != null) {
                            c1059860dge.LIZLLL(PageFinder.class, viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLJILJILJ);
                        }
                        new AwS576S0100000_32(viewTreeObserverOnGlobalLayoutListenerC21155717qd, 18);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                        return;
                    }
                    try {
                        viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLJILJILJ = PageFinder.via(viewTreeObserverOnGlobalLayoutListenerC21155717qd.LL.LJ);
                        C1059860dge c1059860dge2 = (C1059860dge) interfaceC1541990qEH.getHybridContext().LJFF(C1059860dge.class);
                        if (c1059860dge2 != null) {
                            c1059860dge2.LIZLLL(PageFinder.class, viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLJILJILJ);
                        }
                        new AwS576S0100000_32(viewTreeObserverOnGlobalLayoutListenerC21155717qd, 18);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJ(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }

            @Override // X.AbstractC1772940wEm
            public final void LIZ(Integer num, String str3) {
                Map<String, Object> mapLJIIJ2;
                new AwS147S1200000_32(this.LIZ, num, str3, 2);
                InterfaceC1631620sYq<Boolean, Pair<Integer, String>, Map<String, Object>, Unit> interfaceC1631620sYq = awS161S0110000_32;
                Boolean bool = Boolean.FALSE;
                Pair<Integer, String> pair = new Pair<>(num, "lynx error");
                if (str3 != null) {
                    mapLJIIJ2 = C2097608Jq.LJIIJ(new Pair("lynx_error_info", str3));
                } else {
                    mapLJIIJ2 = null;
                }
                interfaceC1631620sYq.invoke(bool, pair, mapLJIIJ2);
                ViewTreeObserverOnGlobalLayoutListenerC21155717qd viewTreeObserverOnGlobalLayoutListenerC21155717qd = this.LIZ;
                C21157017qq.LIZ(viewTreeObserverOnGlobalLayoutListenerC21155717qd.LLILLJJLI, viewTreeObserverOnGlobalLayoutListenerC21155717qd, false, C21155317qZ.LIZ, null, 17);
            }
        }, null, frameLayout2);
        if (viewLJI != null) {
            this.LLIZLLLIL.addView(viewLJI, new FrameLayout.LayoutParams(-1, -1));
        }
        this.LLJI = c1772770wEVLIZ;
    }
}
