package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11gs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19566411gs extends AbstractC2255721DQs<InterfaceC459260Hzg> implements InterfaceC459260Hzg, InterfaceC379610EuV {
    public static final int LLILZLL = 8;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final int LLILLL;
    public final Set<String> LLILZ = new LinkedHashSet();
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 806));

    public InterfaceC459260Hzg W1() {
        return this;
    }

    private final C19566511gt X1() {
        return (C19566511gt) this.LLILZIL.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLILLJJLI.add(this.LLILLL, X1(), "EditStoryGradientBgComponent");
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        this.LLILLJJLI.remove(X1());
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC459260Hzg
    public void Wu1(String str) {
        this.LLILZ.add(str);
        C19566511gt c19566511gtX1 = X1();
        View view = c19566511gtX1.LLJIJIL;
        View view2 = null;
        if (view == null) {
            view = null;
        }
        C786410Ut5.LJLLLLLL(0, view);
        View view3 = c19566511gtX1.LLJIJIL;
        if (view3 != null) {
            view2 = view3;
        }
        C786410Ut5.T4(view2, 1.0f);
        ViewPropertyAnimator viewPropertyAnimator = c19566511gtX1.LLJILJIL;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // X.InterfaceC459260Hzg
    public void bN(String str) {
        this.LLILZ.remove(str);
        if (this.LLILZ.size() == 0) {
            C19566511gt c19566511gtX1 = X1();
            View view = c19566511gtX1.LLJIJIL;
            if (view == null) {
                view = null;
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            c19566511gtX1.LLJILJIL = viewPropertyAnimatorAnimate;
            if (viewPropertyAnimatorAnimate != null) {
                viewPropertyAnimatorAnimate.setDuration(300L);
                viewPropertyAnimatorAnimate.alpha(0.0f);
                viewPropertyAnimatorAnimate.start();
            }
        }
    }

    public C19566411gs(C1DRG c1drg, C19A3 c19a3, int i) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = i;
    }
}
