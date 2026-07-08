package X;

import Y.AAListenerS276S0200000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterUIStyleOptimizationSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.12Oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19747412Oa extends C12O8 {
    public static final /* synthetic */ int LJIJJ = 0;
    public final ImageView LJ;
    public final LiveIconView LJFF;
    public final View LJI;
    public boolean LJII;
    public final C01GW LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C01GW LJIIJ;
    public int LJIIJJI;
    public final LiveIconView LJIIL;
    public int LJIILIIL;
    public Integer LJIILJJIL;
    public int LJIILL;
    public Integer LJIILLIIL;
    public int LJIIZILJ;
    public Integer LJIJ;
    public int LJIJI;

    @Override // X.C12O8
    public final int LJIIJJI() {
        return 0;
    }

    @Override // X.C12O8
    public final void LJIIZILJ() {
        C500260Jjc.LJJLIIIJLJLI(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ() {
        /*
            r6 = this;
            int r1 = r6.LJIILIIL
            r5 = 2
            r4 = 0
            r3 = 1
            if (r1 == 0) goto Le
            if (r1 == r3) goto L34
            if (r1 == r5) goto L32
            r0 = 3
            if (r1 == r0) goto L32
        Le:
            r2 = 0
        Lf:
            int r0 = r6.LJIILL
            if (r0 == 0) goto L30
            if (r0 != r5) goto L30
            r1 = 2
        L16:
            int r0 = r6.LJIIZILJ
            if (r0 == 0) goto L2e
            if (r0 == r3) goto L2c
            if (r0 != r5) goto L2e
            r0 = 2
        L1f:
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = java.lang.Math.max(r2, r0)
            int r0 = r6.LJIJI
            if (r0 != r2) goto L36
            return r4
        L2c:
            r0 = 1
            goto L1f
        L2e:
            r0 = 0
            goto L1f
        L30:
            r1 = 0
            goto L16
        L32:
            r2 = 2
            goto Lf
        L34:
            r2 = 1
            goto Lf
        L36:
            if (r2 == 0) goto L59
            if (r2 == r3) goto L50
            if (r2 != r5) goto L4d
            X.01GW r0 = r6.LJIIJ
            java.lang.Object r1 = r0.getValue()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
        L44:
            if (r1 == 0) goto L4d
            android.widget.ImageView r0 = r6.LJ
            if (r0 == 0) goto L4d
            r0.setImageDrawable(r1)
        L4d:
            r6.LJIJI = r2
            return r3
        L50:
            X.01GW r0 = r6.LJIIIZ
            java.lang.Object r1 = r0.getValue()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            goto L44
        L59:
            X.01GW r0 = r6.LJIIIIZZ
            java.lang.Object r1 = r0.getValue()
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19747412Oa.LJIJJ():boolean");
    }

    @Override // X.C12O8
    public final void LJIILJJIL() {
        long j = LiveHostAutoAdaptiveParams.disableLiveCenterAnim() ? 0L : 150L;
        if (this.LJII) {
            this.LJII = false;
            return;
        }
        View view = this.LJI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 42));
        valueAnimatorOfFloat.start();
    }

    @Override // X.C12O8
    public final View LIZJ() {
        return this.LJI;
    }

    @Override // X.C12O8
    public final View LJFF() {
        return this.LJFF;
    }

    public C19747412Oa(View view) {
        super(C12OE.DEFAULT, 0, 0);
        this.LJII = true;
        this.LJIIIIZZ = C292401Bi.LIZ(AFwS218S0000000_29.get$arr$(407));
        this.LJIIIZ = C292401Bi.LIZ(AFwS218S0000000_29.get$arr$(408));
        this.LJIIJ = C292401Bi.LIZ(AFwS218S0000000_29.get$arr$(406));
        this.LJIIJJI = 1;
        this.LJ = (ImageView) view.findViewById(R.id.w1a);
        this.LJFF = (LiveIconView) view.findViewById(R.id.jsw);
        this.LJI = view.findViewById(R.id.jsv);
        view.findViewById(R.id.p58);
        if (LiveCenterUIStyleOptimizationSetting.INSTANCE.enable()) {
            this.LJIIL = (LiveIconView) view.findViewById(R.id.tk9);
        }
    }

    @Override // X.C12O8
    public final void LJIIL(C12OB c12ob) {
        long j;
        if (LiveHostAutoAdaptiveParams.disableLiveCenterAnim()) {
            j = 0;
        } else {
            j = 250;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJI, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addListener(new AAListenerS276S0200000_29(c12ob, this, 4));
        if (LiveCenterUIStyleOptimizationSetting.INSTANCE.enable()) {
            objectAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(this, 43));
        }
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }
}
