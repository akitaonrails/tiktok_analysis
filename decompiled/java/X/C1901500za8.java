package X;

import Y.ACListenerS162S0100000_28;
import Y.AObserverS230S0100000_28;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.0za8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1901500za8 {
    public final View LIZ;
    public final Function0<Unit> LIZIZ;
    public int LJII;
    public int LJIIIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 347));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 346));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 345));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS572S0100000_28(this, 344));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 348));
    public boolean LJIIIIZZ = true;
    public final C01GW LJIIJ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 496));
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 498));
    public final C01GW LJIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 495));
    public final C01GW LJIILIIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 497));

    public final void LIZ() {
        Integer numLJII;
        C786410Ut5.LLZILL((TuxSpinner) this.LJI.getValue(), 8);
        C786410Ut5.LLD(0, LJ());
        Context context = LJ().getContext();
        if (context != null && (numLJII = C1308910kAL.LJII(R.attr.a3o, context)) != null) {
            LJ().setAnimation(numLJII.intValue());
        }
        LJ().playAnimation();
    }

    public final TuxIconView LIZIZ() {
        return (TuxIconView) this.LJFF.getValue();
    }

    public final int LIZJ() {
        return (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)) * this.LJIIIZ) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    }

    public final View LIZLLL() {
        return (View) this.LJ.getValue();
    }

    public final C1295960jpS LJ() {
        return (C1295960jpS) this.LIZLLL.getValue();
    }

    public final void LJFF() {
        C1901440za2 c1901440za2 = C1901440za2.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideAvatar, avatar.visible: ");
        sbLIZ.append(LIZLLL().getVisibility() == 0);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1901440za2.getClass();
        C1901440za2.LJIIJ(strLIZIZ);
        if (LIZLLL().getVisibility() != 0 || ((ValueAnimator) this.LJIILIIL.getValue()).isRunning() || ((ValueAnimator) this.LJIILIIL.getValue()).isStarted()) {
            return;
        }
        ((ValueAnimator) this.LJIILIIL.getValue()).start();
    }

    public final void LJI(String str) {
        boolean z;
        C1901440za2 c1901440za2 = C1901440za2.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hideBubble, reason: ");
        sbLIZ.append(str);
        sbLIZ.append(", bubbleState: ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", bubbleEnable: ");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", needHide: ");
        if (this.LJII != 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1901440za2.getClass();
        C1901440za2.LJIIJ(strLIZIZ);
        if (this.LIZ.getVisibility() == 0) {
            this.LJII = 0;
            this.LJIIIIZZ = false;
            if (!((ValueAnimator) this.LJIIJJI.getValue()).isRunning() && !((ValueAnimator) this.LJIIJJI.getValue()).isStarted()) {
                ((ValueAnimator) this.LJIIJJI.getValue()).start();
            }
        }
    }

    public C1901500za8(View view, AwS572S0100000_28 awS572S0100000_28) {
        FrameLayout.LayoutParams layoutParams;
        this.LIZ = view;
        this.LIZIZ = awS572S0100000_28;
        if (!((Boolean) C262020AOq.LIZ.getValue()).booleanValue()) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                if (layoutParams != null) {
                    layoutParams.gravity = 8388693;
                }
            } else {
                layoutParams = null;
            }
            C786410Ut5.W5(this.LIZ, layoutParams);
        }
        C786410Ut5.I7(new ACListenerS162S0100000_28(this, 64), view);
        LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view);
        if (lifecycleOwner != null) {
            C1901440za2.LIZ.getClass();
            C1901440za2.LJI.observe(lifecycleOwner, new AObserverS230S0100000_28(this, 35));
        }
    }
}
