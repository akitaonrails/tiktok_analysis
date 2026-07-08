package X;

import Y.AAListenerS275S0200000_27;
import Y.AUListenerS0S0113000_27;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yAW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847180yAW extends AbstractC1846670y9h<C1119420fEi> {
    public final LinearLayout LIZLLL;
    public final C1846630y9d LJ;
    public final C1846630y9d LJFF;
    public final C1846630y9d LJI;
    public final ImageView LJII;
    public final C1846630y9d LJIIIIZZ;
    public final LinearLayout LJIIIZ;
    public final FrameLayout LJIIJ;

    @Override // X.InterfaceC1846720y9m
    public final Pair<Integer, Integer> LIZ() {
        C1847200yAY c1847200yAYLJFF = LJFF(u.LJJIFFI(C497740JfY.LJIJI(2131844587), "{0:string}", "99+", false));
        if (c1847200yAYLJFF == null) {
            return new Pair<>(0, 0);
        }
        this.LJ.setText(c1847200yAYLJFF.LIZ);
        this.LJFF.setText(c1847200yAYLJFF.LIZIZ);
        this.LJI.setText(c1847200yAYLJFF.LIZJ);
        C1846800y9u.LJIIJJI(this.LIZLLL);
        this.LJ.setText("");
        this.LJFF.setText("");
        this.LJI.setText("");
        return new Pair<>(Integer.valueOf(this.LIZLLL.getMeasuredWidth() + ((int) C497740JfY.LIZIZ(10.0f))), Integer.valueOf(this.LIZLLL.getMeasuredHeight()));
    }

    public C1847180yAW(C1091250eVH c1091250eVH) {
        super(c1091250eVH);
        this.LIZLLL = (LinearLayout) c1091250eVH.findViewById(R.id.squ);
        this.LJ = (C1846630y9d) c1091250eVH.findViewById(R.id.pgv);
        this.LJFF = (C1846630y9d) c1091250eVH.findViewById(R.id.pgw);
        this.LJI = (C1846630y9d) c1091250eVH.findViewById(R.id.ph0);
        this.LJII = (ImageView) c1091250eVH.findViewById(R.id.jul);
        this.LJIIIIZZ = (C1846630y9d) c1091250eVH.findViewById(R.id.pgx);
        this.LJIIIZ = (LinearLayout) c1091250eVH.findViewById(R.id.pgz);
        this.LJIIJ = (FrameLayout) c1091250eVH.findViewById(R.id.pgy);
    }

    public static C1847200yAY LJFF(String str) {
        int length = str.length();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            if (!Character.isDigit(str.charAt(i3)) && str.charAt(i3) != '+') {
                if (i != -1) {
                    break;
                }
            } else {
                if (i == -1) {
                    i = i3;
                }
                i2 = i3;
            }
        }
        if (i >= 0) {
            int i4 = i2 + 1;
            return new C1847200yAY(str.substring(0, i), str.substring(i, i4), str.substring(i4, str.length()));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1846670y9h
    public final void LIZLLL(C1119420fEi c1119420fEi) {
        C1847200yAY c1847200yAYLJFF = LJFF(u.LJJIFFI(C497740JfY.LJIJI(2131844587), "{0:string}", c1119420fEi.LJIIJJI, false));
        if (c1847200yAYLJFF == null) {
            return;
        }
        this.LJ.setText(c1847200yAYLJFF.LIZ);
        this.LJFF.setText(c1847200yAYLJFF.LIZIZ);
        this.LJI.setText(c1847200yAYLJFF.LIZJ);
        this.LIZIZ = c1119420fEi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1846670y9h
    public final void LJ(C1119420fEi c1119420fEi) {
        final C1847200yAY c1847200yAYLJFF;
        float f;
        T t = this.LIZIZ;
        if (t == 0 || (c1847200yAYLJFF = LJFF(u.LJJIFFI(C497740JfY.LJIJI(2131844587), "{0:string}", c1119420fEi.LJIIJJI, false))) == null) {
            return;
        }
        long j = t.LIZIZ;
        long j2 = c1119420fEi.LIZIZ;
        if (j2 != j) {
            boolean z = true;
            LIZJ(true);
            this.LIZIZ = c1119420fEi;
            if (j2 >= j) {
                z = false;
            }
            final int height = this.LJIIJ.getHeight();
            int width = this.LJIIJ.getWidth();
            ImageView imageView = this.LJII;
            if (z) {
                f = 0.0f;
            } else {
                f = 180.0f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
            imageView.setRotationX(f);
            C500260Jjc.LLFFF(this.LJII);
            C1846800y9u.LJIIJJI(this.LJIIJ);
            final int measuredWidth = this.LJIIJ.getMeasuredWidth();
            ImageView imageView2 = this.LJII;
            float f2 = height;
            if (!z) {
                f2 *= -1.0f;
            }
            C786410Ut5.gd(imageView2, f2);
            C1846800y9u.LJIILL(this.LJIIJ, width);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(750L);
            valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, -0.0f, 0.34f, 1.0f));
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS0S0113000_27(z, this, height, width, measuredWidth, 0));
            final boolean z2 = z;
            valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: X.0yAX
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    float f3;
                    C500260Jjc.LJIILIIL(this.LL.LJIIIZ);
                    C500260Jjc.LLFFF(this.LL.LJIIIIZZ);
                    this.LL.LJIIIIZZ.setText(c1847200yAYLJFF.LIZIZ);
                    C1846800y9u.LJIILL(this.LL.LJIIJ, -2);
                    C1846800y9u.LJIIJJI(this.LL.LJIIJ);
                    int measuredWidth2 = this.LL.LJIIJ.getMeasuredWidth();
                    C500260Jjc.LLFFF(this.LL.LJIIIZ);
                    C1846630y9d c1846630y9d = this.LL.LJIIIIZZ;
                    if (z2) {
                        f3 = height;
                    } else {
                        f3 = height * (-1.0f);
                    }
                    C786410Ut5.qd(c1846630y9d, f3);
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.setDuration(750L);
                    valueAnimatorOfFloat2.setStartDelay(750L);
                    valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.66f, -0.0f, 0.34f, 1.0f));
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS0S0113000_27(z2, this.LL, height, measuredWidth, measuredWidth2, 1));
                    valueAnimatorOfFloat2.addListener(new AAListenerS275S0200000_27(this.LL, c1847200yAYLJFF, 3));
                    valueAnimatorOfFloat2.start();
                }
            });
            valueAnimatorOfFloat.start();
        }
    }
}
