package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0J2B, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J2B {
    public final Context LIZ;
    public int LIZLLL;
    public int LJ;
    public FrameLayout LJFF;
    public LinearLayout LJI;
    public ViewGroup LJII;
    public boolean LJIIIIZZ;
    public int LJIIJ;
    public ValueAnimator LJIIJJI;
    public CharSequence LIZIZ = "";
    public long LIZJ = 3000;
    public final BPEAHandler LJIIIZ = new BPEAHandler(Looper.getMainLooper());

    public final void LIZ() {
        ViewGroup viewGroup;
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        this.LJIIIZ.removeCallbacksAndMessages(null);
        ValueAnimator valueAnimator = this.LJIIJJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        LinearLayout linearLayout = this.LJI;
        if (linearLayout == null) {
            FrameLayout frameLayout = this.LJFF;
            if (frameLayout != null) {
                ViewParent parent = frameLayout.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(frameLayout, viewGroup);
                }
                this.LJFF = null;
                this.LJI = null;
                return;
            }
            return;
        }
        final C0J2F c0j2f = new C0J2F(this);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.TRANSLATION_Y, 0.0f, C418440Gaw.LIZIZ(20));
        objectAnimatorOfFloat.setDuration(348L);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(1.71f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(100L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        C786410Ut5.LJLIIL(500L, this.LJIIIZ, new Runnable() { // from class: X.0J2D
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveBottomToastView@e25.sam$java_lang_Runnable$0");
                try {
                    c0j2f.invoke();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveBottomToastView@e25.sam$java_lang_Runnable$0");
            }
        });
    }

    public C0J2B(Context context) {
        this.LIZ = context;
    }

    public final void LIZIZ(ViewGroup viewGroup) {
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJII = viewGroup;
        int iLIZIZ = C20736316Cj.LIZIZ(R.attr.etf, this.LIZ);
        int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.eyw, this.LIZ);
        int iMin = Math.min(C14KS.LJFF() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(430)));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(iLIZIZ);
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(12));
        ImageView imageView = new ImageView(this.LIZ);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        layoutParams.gravity = 16;
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.c6(imageView, layoutParams);
        if (this.LJ != 0) {
            imageView.setImageDrawable(C20736316Cj.LIZLLL(this.LJ, imageView.getContext()));
            imageView.setColorFilter(iLIZIZ2);
        }
        C16F5 c16f5 = new C16F5(this.LIZ, null);
        c16f5.setText(this.LIZIZ);
        c16f5.setTextColor(iLIZIZ2);
        c16f5.setTextSize(1, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.gravity = 16;
        layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
        C786410Ut5.y6(c16f5, layoutParams2);
        LinearLayout linearLayout = new LinearLayout(this.LIZ);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(gradientDrawable);
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        linearLayout.setPadding(iLIZIZ3, iLIZIZ3, iLIZIZ3, iLIZIZ3);
        linearLayout.setGravity(16);
        linearLayout.setMinimumHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iMin, -2);
        layoutParams3.gravity = 81;
        layoutParams3.bottomMargin = this.LIZLLL + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        C786410Ut5.d6(linearLayout, layoutParams3);
        linearLayout.addView(imageView);
        linearLayout.addView(c16f5);
        this.LJI = linearLayout;
        this.LJIIJ = this.LIZLLL;
        FrameLayout frameLayout = new FrameLayout(this.LIZ);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(linearLayout);
        this.LJFF = frameLayout;
        viewGroup.addView(frameLayout);
        float fLIZIZ = C418440Gaw.LIZIZ(20);
        C786410Ut5.T4(linearLayout, 0.0f);
        C786410Ut5.ed(linearLayout, fLIZIZ);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.TRANSLATION_Y, fLIZIZ, 0.0f);
        objectAnimatorOfFloat.setDuration(348L);
        objectAnimatorOfFloat.setInterpolator(new OvershootInterpolator(1.71f));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.ALPHA, 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(300L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        C786410Ut5.LJLIIL(this.LIZJ, this.LJIIIZ, new Runnable() { // from class: X.0J2C
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveBottomToastView@e25.show$1");
                try {
                    this.LL.LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveBottomToastView@e25.show$1");
            }
        });
    }
}
