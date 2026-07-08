package X;

import Y.ACListenerS147S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C778020UfY extends C779160UhO {
    public final int LJI;
    public final int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public DataChannel LJIIJ;
    public int LJIIJJI;
    public final C16F5 LJIIL;
    public final LiveIconView LJIILIIL;
    public final LiveIconView LJIILJJIL;
    public final C16F5 LJIILL;
    public final View LJIILLIIL;
    public float LJIIZILJ;
    public float LJIJ;
    public ACListenerS147S0100000_12 LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;

    @Override // X.C779160UhO
    public final void LJIIJJI() {
        LJIILL(true, false);
    }

    @Override // X.C779160UhO
    public final void LJIIIIZZ() {
        if (!this.LJ) {
            LJIILL(false, true);
        }
    }

    public C778020UfY(Context context) {
        View viewSd;
        super(context);
        int iLIZ = C439101nJ.LIZ(215);
        this.LJI = iLIZ;
        int iLIZ2 = C439101nJ.LIZ(34);
        this.LJII = iLIZ2;
        this.LJIIIIZZ = true;
        this.LJIIIZ = true;
        this.LJIIJJI = C497740JfY.LIZLLL(R.attr.eui, context);
        this.LJIJ = 1.0f;
        if (C497740JfY.LJJ()) {
            viewSd = C786410Ut5.Sd(R.layout.hss, C786410Ut5.ne(context), null);
        } else {
            viewSd = C786410Ut5.Sd(R.layout.hsq, C786410Ut5.ne(context), null);
        }
        this.LIZLLL = viewSd;
        this.LJIIL = (C16F5) viewSd.findViewById(R.id.znh);
        this.LJIILIIL = (LiveIconView) viewSd.findViewById(R.id.lhz);
        this.LJIILJJIL = (LiveIconView) viewSd.findViewById(R.id.li8);
        this.LJIILL = (C16F5) viewSd.findViewById(R.id.z86);
        this.LJIILLIIL = viewSd.findViewById(R.id.nah);
        LJIIL(iLIZ, iLIZ2);
        LJII(0, 0);
        this.LJIJJ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 908));
        this.LJIJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 909));
    }

    public final void LJIILLIIL(Throwable th) {
        View rootView;
        ViewParent parent;
        Thread thread;
        View view = this.LIZLLL;
        Thread thread2 = null;
        if (view != null && (rootView = view.getRootView()) != null && (parent = rootView.getParent()) != null && parent.getClass().getName().equals("android.view.ViewRootImpl")) {
            try {
                thread = (Thread) parent.getClass().getDeclaredField("mThread").get(parent);
                try {
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            } catch (Throwable th3) {
                th = th3;
                thread = null;
            }
            thread2 = thread;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update ui error, is main = ");
        sbLIZ.append(Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()));
        sbLIZ.append(", ViewRootImpl: thread = ");
        sbLIZ.append(thread2);
        sbLIZ.append(", wanna content = ");
        sbLIZ.append((Object) this.LJIIL.getText());
        C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
    }

    public final void LJIILL(boolean z, boolean z2) {
        float f;
        float alpha = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        View view = this.LIZLLL;
        if (view != null) {
            alpha = view.getAlpha();
        }
        this.LJIIZILJ = alpha;
        if (z2) {
            View view2 = this.LIZLLL;
            if (view2 != null) {
                C786410Ut5.T4(view2, f);
            }
            if (z != (!this.LJ)) {
                if (z) {
                    LJIIIZ();
                    return;
                } else {
                    LJI();
                    return;
                }
            }
            return;
        }
        if (((ValueAnimator) this.LJIJJ.getValue()).isRunning()) {
            ((ValueAnimator) this.LJIJJ.getValue()).cancel();
        }
        if (((ValueAnimator) this.LJIJJLI.getValue()).isRunning()) {
            ((ValueAnimator) this.LJIJJLI.getValue()).cancel();
        }
        if (true != (!this.LJ)) {
            LJIIIZ();
        }
        this.LJIJ = f - this.LJIIZILJ;
        ((ValueAnimator) this.LJIJJ.getValue()).start();
        ((ValueAnimator) this.LJIJJLI.getValue()).start();
    }
}
