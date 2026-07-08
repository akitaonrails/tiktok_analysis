package X;

import Y.AAListenerS275S0200000_27;
import Y.AAListenerS337S0100000_27;
import Y.AUListenerS11S0111000_27;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yAJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1847050yAJ extends AbstractC1846670y9h<C1119420fEi> {
    public final int LIZLLL;
    public final LinearLayout LJ;
    public final ImageView LJFF;
    public final C1846630y9d LJI;
    public final C1846630y9d LJII;
    public final C1846630y9d LJIIIIZZ;
    public final C1846630y9d LJIIIZ;
    public final FrameLayout LJIIJ;

    @Override // X.InterfaceC1846720y9m
    public Pair<Integer, Integer> LIZ() {
        C1119210fEN.LIZ.getClass();
        int i = C1119210fEN.LIZJ;
        C1847040yAI c1847040yAILJFF = LJFF(u.LJJIFFI(C497740JfY.LJIJI(this.LIZLLL), "{0:string}", "99+", false));
        if (c1847040yAILJFF == null) {
            return new Pair<>(0, 0);
        }
        this.LJI.setText(c1847040yAILJFF.LIZ);
        this.LJII.setText(c1847040yAILJFF.LIZIZ);
        this.LJIIIIZZ.setText(c1847040yAILJFF.LIZJ);
        C1846800y9u.LJIIJJI(this.LJ);
        this.LJI.setText("");
        this.LJII.setText("");
        this.LJIIIIZZ.setText("");
        return new Pair<>(Integer.valueOf(this.LJ.getMeasuredWidth() + i), Integer.valueOf(this.LJ.getMeasuredHeight()));
    }

    public void LJII() {
        C786410Ut5.LJZI(0, this.LJFF);
        this.LJFF.setImageResource(R.drawable.dpc);
        if (C497740JfY.LJJ()) {
            ImageView imageView = this.LJFF;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(imageView);
            imageView.setRotationY(180.0f);
        }
    }

    public static C1847040yAI LJFF(String str) {
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
            return new C1847040yAI(str.substring(0, i), str.substring(i, i4), str.substring(i4, str.length()));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1846670y9h
    public void LIZLLL(C1119420fEi c1119420fEi) {
        C1847040yAI c1847040yAILJFF = LJFF(u.LJJIFFI(C497740JfY.LJIJI(this.LIZLLL), "{0:string}", C1846800y9u.LJIIJ(c1119420fEi.LJII), false));
        if (c1847040yAILJFF == null) {
            return;
        }
        this.LJI.setText(c1847040yAILJFF.LIZ);
        this.LJII.setText(c1847040yAILJFF.LIZIZ);
        this.LJIIIIZZ.setText(c1847040yAILJFF.LIZJ);
        this.LIZIZ = c1119420fEi;
        LJII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1846670y9h
    public void LJ(C1119420fEi c1119420fEi) {
        C1847040yAI c1847040yAILJFF;
        T t = this.LIZIZ;
        C1846810y9v c1846810y9v = c1119420fEi.LJIIIIZZ;
        boolean z = true;
        if (c1846810y9v != null && c1846810y9v.LIZ == 2) {
            this.LIZIZ = c1119420fEi;
            LJI(c1119420fEi);
            return;
        }
        if (t == 0 || (c1847040yAILJFF = LJFF(u.LJJIFFI(C497740JfY.LJIJI(this.LIZLLL), "{0:string}", c1119420fEi.LJIIJJI, false))) == null) {
            return;
        }
        long j = t.LIZIZ;
        long j2 = c1119420fEi.LIZIZ;
        if (j2 != j) {
            LIZJ(true);
            this.LIZIZ = c1119420fEi;
            if (j2 >= j) {
                z = false;
            }
            int height = this.LJIIJ.getHeight();
            C500260Jjc.LLFFF(this.LJIIIZ);
            this.LJIIIZ.setText(c1847040yAILJFF.LIZIZ);
            C1846630y9d c1846630y9d = this.LJIIIZ;
            float f = height;
            if (!z) {
                f *= -1.0f;
            }
            C786410Ut5.qd(c1846630y9d, f);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(750L);
            valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, -0.0f, 0.34f, 1.0f));
            valueAnimatorOfFloat.addUpdateListener(new AUListenerS11S0111000_27(z, this, height, 0));
            valueAnimatorOfFloat.addListener(new AAListenerS275S0200000_27(this, c1847040yAILJFF, 0));
            valueAnimatorOfFloat.start();
        }
    }

    public void LJI(C1119420fEi c1119420fEi) {
        long j = c1119420fEi.LJII;
        C1847040yAI c1847040yAILJFF = LJFF(u.LJJIFFI(C497740JfY.LJIJI(this.LIZLLL), "{0:string}", C1846800y9u.LJIIJ(j), false));
        if (c1847040yAILJFF == null) {
            return;
        }
        this.LJI.setText(c1847040yAILJFF.LIZ);
        this.LJII.setText(C1846800y9u.LJIIJ(j));
        this.LJIIIIZZ.setText(c1847040yAILJFF.LIZJ);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LJII, (Property<C1846630y9d, Float>) View.SCALE_X, 1.0f, 0.7f, 1.08f, 1.0f);
        objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.47f, -0.0f, 0.67f, 1.0f));
        objectAnimatorOfFloat.setDuration(800L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.LJII, (Property<C1846630y9d, Float>) View.SCALE_Y, 1.0f, 0.7f, 1.08f, 1.0f);
        objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.47f, -0.0f, 0.67f, 1.0f));
        objectAnimatorOfFloat2.setDuration(800L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new AAListenerS337S0100000_27(this, 1));
        animatorSet.start();
    }

    public C1847050yAJ(C1091250eVH c1091250eVH, int i) {
        super(c1091250eVH);
        this.LIZLLL = i;
        this.LJ = (LinearLayout) c1091250eVH.findViewById(R.id.squ);
        this.LJFF = (ImageView) c1091250eVH.findViewById(R.id.lsp);
        C1846630y9d c1846630y9d = (C1846630y9d) c1091250eVH.findViewById(R.id.pgv);
        this.LJI = c1846630y9d;
        C1846630y9d c1846630y9d2 = (C1846630y9d) c1091250eVH.findViewById(R.id.pgw);
        this.LJII = c1846630y9d2;
        C1846630y9d c1846630y9d3 = (C1846630y9d) c1091250eVH.findViewById(R.id.ph0);
        this.LJIIIIZZ = c1846630y9d3;
        C1846630y9d c1846630y9d4 = (C1846630y9d) c1091250eVH.findViewById(R.id.pgx);
        this.LJIIIZ = c1846630y9d4;
        FrameLayout frameLayout = (FrameLayout) c1091250eVH.findViewById(R.id.pgy);
        this.LJIIJ = frameLayout;
        c1846630y9d.LJJJJI();
        c1846630y9d2.LJJJJI();
        c1846630y9d3.LJJJJI();
        c1846630y9d4.LJJJJI();
        C1119210fEN.LIZ.getClass();
        int i2 = C1119210fEN.LIZJ;
        c1846630y9d.LLJJIJIIJIL = true;
        c1846630y9d.LLJJIJI = i2;
        c1846630y9d2.LLJJIJIIJIL = true;
        c1846630y9d2.LLJJIJI = i2;
        c1846630y9d3.LLJJIJIIJIL = true;
        c1846630y9d3.LLJJIJI = i2;
        c1846630y9d4.LLJJIJIIJIL = true;
        c1846630y9d4.LLJJIJI = i2;
        C500260Jjc.LJJLJ(-i2, frameLayout);
    }
}
