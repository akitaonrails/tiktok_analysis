package X;

import Y.AUListenerS219S0200000_11;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS189S0000000_3;

/* JADX INFO: renamed from: X.0SLr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C719890SLr {
    public final View LIZIZ;
    public final boolean LIZJ;
    public final VideoItemParams LIZLLL;
    public final boolean LJ;
    public final C0SMC LJFF;
    public final TuxTextView LJI;
    public final ViewGroup LJII;
    public final C0STF LJIIIIZZ;
    public final ImageView LJIIIZ;
    public final ImageView LJIIJ;
    public final C426320Gne LJIIJJI;
    public boolean LJIIL;
    public final Context LJIILIIL;
    public ValueAnimator LJIILJJIL;
    public Aweme LIZ = null;
    public final boolean LJIILL = C04WY.LIZ();
    public float LJIILLIIL = 10.0f;
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(22));

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LJIILJJIL;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.LJIILJJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
    }

    public final void LJI() {
        float translationX = this.LJIIJJI.getTranslationX();
        float translationY = this.LJIIJJI.getTranslationY();
        C786410Ut5.Lc(this.LJIIIZ, translationX);
        C786410Ut5.gd(this.LJIIIZ, translationY);
        TuxTextView tuxTextView = this.LJI;
        if (tuxTextView != null) {
            C786410Ut5.Vc(tuxTextView, translationX);
        }
        TuxTextView tuxTextView2 = this.LJI;
        if (tuxTextView2 != null) {
            C786410Ut5.wd(tuxTextView2, translationY);
        }
    }

    public final void LIZJ() {
        if (C298560Bn4.LIZ()) {
            C339190DRl.LIZIZ(this.LJIIJJI);
            LIZ();
        } else {
            if (!this.LJIILL) {
                C339190DRl.LIZIZ(this.LJIIJ);
                return;
            }
            this.LJIIJJI.LIZ(100.0f, false);
            C438910HIz.LIZIZ(this.LJIIJJI, 75L, 2);
            LIZ();
        }
    }

    public final void LJ() {
        TuxTextView tuxTextView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        LIZ();
        if (C298560Bn4.LIZ()) {
            C426320Gne c426320Gne = this.LJIIJJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426320Gne);
            c426320Gne.setTranslationX(0.0f);
            C426320Gne c426320Gne2 = this.LJIIJJI;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c426320Gne2);
            c426320Gne2.setTranslationY(0.0f);
            C786410Ut5.Lc(this.LJIIIZ, 0.0f);
            C786410Ut5.gd(this.LJIIIZ, 0.0f);
            TuxTextView tuxTextView2 = this.LJI;
            if (tuxTextView2 != null) {
                C786410Ut5.Vc(tuxTextView2, 0.0f);
            }
            TuxTextView tuxTextView3 = this.LJI;
            if (tuxTextView3 != null) {
                C786410Ut5.wd(tuxTextView3, 0.0f);
            }
            for (View view : (ArrayList) C13LQ.LJIJI(new View[]{this.LJIIJJI, this.LJIIIZ, this.LJI})) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.bottomMargin = 0;
                    C786410Ut5.W5(view, marginLayoutParams);
                }
            }
        }
        LIZJ();
        C339190DRl.LIZIZ(this.LJIIIZ);
        if (C298560Bn4.LIZ() && (tuxTextView = this.LJI) != null) {
            C339190DRl.LIZIZ(tuxTextView);
        }
        this.LJIILLIIL = 10.0f;
        this.LJIIJJI.LIZ(10.0f, false);
    }

    public final void LIZLLL(C426320Gne c426320Gne) {
        if (this.LJIILLIIL == 10.0f) {
            C438910HIz.LIZ(c426320Gne, 0L, 2);
            c426320Gne.LLILZLL = true;
            c426320Gne.LLIZ = false;
            ViewParent parent = c426320Gne.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).setClipChildren(false);
            }
            c426320Gne.postInvalidate();
        }
    }

    public final void LJFF(C426320Gne c426320Gne) {
        float f = this.LJIILLIIL;
        if (f == 10.0f) {
            C786410Ut5.E5(c426320Gne, 1.0f);
            LIZ();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.LJIILLIIL, Math.max(f, 65.0f));
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS219S0200000_11(this, c426320Gne, 0));
            valueAnimatorOfFloat.start();
            this.LJIILJJIL = valueAnimatorOfFloat;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C719890SLr.LIZIZ(int, int, int):void");
    }

    public C719890SLr(View view, boolean z, VideoItemParams videoItemParams, boolean z2, C0SMC c0smc) {
        this.LIZIZ = view;
        this.LIZJ = z;
        this.LIZLLL = videoItemParams;
        this.LJ = z2;
        this.LJFF = c0smc;
        this.LJI = (TuxTextView) view.findViewById(R.id.kda);
        this.LJII = (ViewGroup) view.findViewById(R.id.qeg);
        this.LJIIIIZZ = (C0STF) view.findViewById(R.id.vmb);
        this.LJIIIZ = (ImageView) view.findViewById(R.id.kd_);
        this.LJIIJ = (ImageView) view.findViewById(R.id.nnp);
        this.LJIIJJI = (C426320Gne) view.findViewById(R.id.nnr);
        this.LJIILIIL = view.getContext();
    }
}
