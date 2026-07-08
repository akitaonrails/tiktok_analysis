package X;

import Y.ALAdapterS19S0100000_24;
import Y.AUListenerS256S0100000_6;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rjX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1599810rjX {
    public final View LIZ;
    public final ViewGroup LIZIZ;
    public FrameLayout LIZJ;
    public FrameLayout LIZLLL;
    public View LJ;
    public View LJFF;
    public C1598650rhf LJI;
    public Function0<Unit> LJII;
    public Function0<Unit> LJIIIIZZ;
    public ValueAnimator LJIIIZ;
    public ValueAnimator LJIIJ;
    public boolean LJIIJJI;

    public final void LIZIZ() {
        Unit unit;
        Unit unit2;
        C994590bzN c994590bzN;
        C1598800rhu c1598800rhu;
        ViewGroup viewGroup;
        try {
            ValueAnimator valueAnimator = this.LJIIIZ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.LJIIIZ = null;
            ValueAnimator valueAnimator2 = this.LJIIJ;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.LJIIJ = null;
            try {
                C1598650rhf c1598650rhf = this.LJI;
                if (c1598650rhf != null && (c1598800rhu = c1598650rhf.LLJJL) != null) {
                    C1600450rkZ c1600450rkZ = c1598800rhu.LIZ;
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1600450rkZ);
                    c1600450rkZ.setTranslationY(0.0f);
                    c1598800rhu.LIZ.setClipBounds(null);
                    if (c1598800rhu.LIZIZ == EnumC1599390rir.POPUP) {
                        ViewParent parent = c1598800rhu.LIZ.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                            C786410Ut5.LJJJLZIJ(c1598800rhu.LIZ, viewGroup);
                        }
                        c1598800rhu.LIZJ = null;
                        c1598800rhu.LIZIZ = EnumC1599390rir.NONE;
                    }
                }
                C1598650rhf c1598650rhf2 = this.LJI;
                if (c1598650rhf2 != null) {
                    C1598800rhu c1598800rhu2 = c1598650rhf2.LLJJL;
                    if (c1598800rhu2 != null && (c994590bzN = c1598650rhf2.LLJJJJ) != null) {
                        c1598800rhu2.LIZ(EnumC1599390rir.INBOX_VH, c994590bzN, new FrameLayout.LayoutParams(-1, C1607400rvm.LIZIZ.LJFF(EnumC1606080rte.INBOX_TOP_LIST, false).LIZLLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))));
                        ViewGroup.LayoutParams layoutParams = c994590bzN.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = 0;
                        } else {
                            layoutParams = new ViewGroup.MarginLayoutParams(-1, 0);
                        }
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c994590bzN);
                        c994590bzN.setLayoutParams(layoutParams);
                    }
                    unit2 = Unit.LIZ;
                } else {
                    unit2 = null;
                }
                C189200o6.m2constructorimpl(unit2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            try {
                FrameLayout frameLayout = this.LIZJ;
                if (frameLayout != null) {
                    C786410Ut5.LJJJLZIJ(frameLayout, this.LIZIZ);
                }
                View view = this.LJ;
                if (view != null) {
                    C786410Ut5.LJJJLZIJ(view, this.LIZIZ);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            this.LJI = null;
            this.LIZLLL = null;
            this.LIZJ = null;
            this.LJ = null;
            this.LJFF = null;
            this.LJIIJJI = false;
            this.LJII = null;
            Function0<Unit> function0 = this.LJIIIIZZ;
            this.LJIIIIZZ = null;
            if (function0 != null) {
                function0.invoke();
            }
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            this.LJI = null;
            this.LIZLLL = null;
            this.LIZJ = null;
            this.LJ = null;
            this.LJFF = null;
            this.LJIIJJI = false;
            this.LJII = null;
            Function0<Unit> function02 = this.LJIIIIZZ;
            this.LJIIIIZZ = null;
            if (function02 != null) {
                function02.invoke();
            }
            throw th3;
        }
    }

    public final void LIZ() {
        if (this.LJIIJJI) {
            return;
        }
        this.LJIIJJI = true;
        FrameLayout frameLayout = this.LIZLLL;
        if (frameLayout == null) {
            LIZIZ();
            return;
        }
        ValueAnimator valueAnimator = this.LJIIIZ;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float height = frameLayout.getHeight();
        if (height < 1.0f) {
            height = 1.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(frameLayout.getTranslationY(), -height);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS256S0100000_6(frameLayout, 32));
        valueAnimatorOfFloat.addListener(new ALAdapterS19S0100000_24(this, 0));
        valueAnimatorOfFloat.setDuration(220L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.start();
        this.LJIIJ = valueAnimatorOfFloat;
        Function0<Unit> function0 = this.LJII;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void LIZJ() {
        ValueAnimator valueAnimator = this.LJIIIZ;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = this.LJIIIZ;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = this.LJIIIZ;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.LJIIIZ = null;
        ValueAnimator valueAnimator4 = this.LJIIJ;
        if (valueAnimator4 != null) {
            valueAnimator4.removeAllListeners();
        }
        ValueAnimator valueAnimator5 = this.LJIIJ;
        if (valueAnimator5 != null) {
            valueAnimator5.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator6 = this.LJIIJ;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        this.LJIIJ = null;
        LIZIZ();
    }

    public C1599810rjX(View view, ViewGroup viewGroup) {
        this.LIZ = view;
        this.LIZIZ = viewGroup;
    }
}
