package Y;

import X.C1090950eUn;
import X.C1C7U;
import X.C21388018n0;
import X.C436180H8m;
import X.C475630Ikz;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterpolatorC419670Gcv;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.inbox.bulletin.view.BaseBulletinBarAssem;
import com.ss.android.ugc.nearby.container.NearbyFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS25S0110000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int height = (int) (((View) this.l0).getHeight() * 0.075f);
        boolean z = this.z1;
        long j = z ? 300L : 100L;
        View view = (View) this.l0;
        float[] fArr = new float[2];
        fArr[0] = z ? 0.0f : 1.0f;
        fArr[1] = z ? 1.0f : 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addUpdateListener(new AUListenerS10S0111000_6(height, (View) this.l0, this.z1, 2));
        objectAnimatorOfFloat.setInterpolator(new C21388018n0());
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LIZ$1() {
        if (!this.z1) {
            FrameLayout frameLayout = ((NearbyFragment) this.l0).LLILZLL;
            if (frameLayout != null) {
                frameLayout.setBackground(null);
                return;
            }
            return;
        }
        NearbyFragment nearbyFragment = (NearbyFragment) this.l0;
        FrameLayout frameLayout2 = nearbyFragment.LLILZLL;
        if (frameLayout2 != null) {
            frameLayout2.getWidth();
            int height = frameLayout2.getHeight();
            GradientDrawable gradientDrawable = new GradientDrawable();
            int iLIZIZ = C475630Ikz.LIZIZ(R.attr.zp, nearbyFragment.getContext());
            int iLIZIZ2 = C475630Ikz.LIZIZ(R.attr.zq, nearbyFragment.getContext());
            gradientDrawable.setColor(iLIZIZ);
            GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{iLIZIZ, iLIZIZ2});
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setColor(iLIZIZ2);
            LayerDrawable layerDrawable = new LayerDrawable(new GradientDrawable[]{gradientDrawable, gradientDrawable2, gradientDrawable3});
            float f = height;
            layerDrawable.setLayerInset(0, 0, 0, 0, (int) (0.84f * f));
            layerDrawable.setLayerInset(1, 0, (int) (0.16f * f), 0, (int) (0.71f * f));
            layerDrawable.setLayerInset(2, 0, (int) (f * 0.29f), 0, 0);
            frameLayout2.setBackground(layerDrawable);
        }
    }

    public static final void run$0(ARunnableS25S0110000_6 aRunnableS25S0110000_6) {
        boolean zLIZ;
        C1C7U.LIZ("BaseBulletinBarAssem@9ce8.animateSlash$drawable$1$1");
        try {
            ((BaseBulletinBarAssem) aRunnableS25S0110000_6.l0).Ho(aRunnableS25S0110000_6.z1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BaseBulletinBarAssem@9ce8.animateSlash$drawable$1$1");
    }

    public static final void run$1(ARunnableS25S0110000_6 aRunnableS25S0110000_6) {
        long j;
        float f;
        View view = (View) aRunnableS25S0110000_6.l0;
        boolean z = aRunnableS25S0110000_6.z1;
        C1C7U.LIZ("PromoteProgramDialog@6644.viewAnim$1L");
        int height = (int) (view.getHeight() * 0.075f);
        if (z) {
            j = 300;
        } else {
            j = 100;
        }
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", fArr);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addUpdateListener(new AUListenerS10S0111000_6(height, view, z, 0));
        objectAnimatorOfFloat.setInterpolator(new C21388018n0());
        C786410Ut5.Pd(objectAnimatorOfFloat);
        C1C7U.LIZIZ("PromoteProgramDialog@6644.viewAnim$1L");
    }

    public static final void run$2(ARunnableS25S0110000_6 aRunnableS25S0110000_6) {
        boolean zLIZ;
        C1C7U.LIZ("SearchKeyframeOptDir3Assem@530c.playContainerAnimation$1");
        try {
            if (aRunnableS25S0110000_6.z1) {
                C436180H8m.LIZIZ((View) aRunnableS25S0110000_6.l0);
            }
            C786410Ut5.T4((View) aRunnableS25S0110000_6.l0, 1.0f);
            C786410Ut5.ed((View) aRunnableS25S0110000_6.l0, 0.0f);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SearchKeyframeOptDir3Assem@530c.playContainerAnimation$1");
    }

    public static final void run$3(ARunnableS25S0110000_6 aRunnableS25S0110000_6) {
        long j;
        float f;
        View view = (View) aRunnableS25S0110000_6.l0;
        boolean z = aRunnableS25S0110000_6.z1;
        C1C7U.LIZ("LiveModalDialog@12c1.viewAnim$1L");
        int height = (int) (view.getHeight() * 0.075f);
        if (z) {
            j = 300;
        } else {
            j = 100;
        }
        Property property = View.ALPHA;
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        objectAnimatorOfFloat.setDuration(j);
        objectAnimatorOfFloat.addUpdateListener(new AUListenerS10S0111000_6(height, view, z, 1));
        objectAnimatorOfFloat.setInterpolator(new InterpolatorC419670Gcv() { // from class: X.0Gcu
            {
                PointF pointF = this.LIZIZ;
                pointF.x = 0.35f;
                pointF.y = 0.0f;
                PointF pointF2 = this.LIZJ;
                pointF2.x = 0.25f;
                pointF2.y = 1.0f;
            }
        });
        C786410Ut5.Pd(objectAnimatorOfFloat);
        C1C7U.LIZIZ("LiveModalDialog@12c1.viewAnim$1L");
    }

    public static final void run$4(ARunnableS25S0110000_6 aRunnableS25S0110000_6) {
        boolean zLIZ;
        C1C7U.LIZ("BarrageUIStyleConstructor@63f3.constructBackground$1$2$1");
        try {
            C1090950eUn c1090950eUn = (C1090950eUn) aRunnableS25S0110000_6.l0;
            boolean z = aRunnableS25S0110000_6.z1;
            LinearLayout linearLayoutLIZJ = c1090950eUn.LIZJ();
            if (linearLayoutLIZJ != null) {
                int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.la);
                int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.l9);
                int iLJIIIZ3 = C497740JfY.LJIIIZ(R.dimen.lg);
                if (C497740JfY.LJJ()) {
                    if (z) {
                        iLJIIIZ2 += iLJIIIZ3;
                    }
                    linearLayoutLIZJ.setPadding(iLJIIIZ2, linearLayoutLIZJ.getPaddingTop(), iLJIIIZ, linearLayoutLIZJ.getPaddingBottom());
                } else {
                    int paddingTop = linearLayoutLIZJ.getPaddingTop();
                    if (z) {
                        iLJIIIZ2 += iLJIIIZ3;
                    }
                    linearLayoutLIZJ.setPadding(iLJIIIZ, paddingTop, iLJIIIZ2, linearLayoutLIZJ.getPaddingBottom());
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BarrageUIStyleConstructor@63f3.constructBackground$1$2$1");
    }

    public static final void run$5(ARunnableS25S0110000_6 aRunnableS25S0110000_6) {
        boolean zLIZ;
        C1C7U.LIZ("EmailBindDialog@9746.viewAnim$1");
        try {
            aRunnableS25S0110000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EmailBindDialog@9746.viewAnim$1");
    }

    public static final void run$6(ARunnableS25S0110000_6 aRunnableS25S0110000_6) {
        boolean zLIZ;
        C1C7U.LIZ("NearbyFragment@706.setGradientBackground$1");
        try {
            aRunnableS25S0110000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("NearbyFragment@706.setGradientBackground$1");
    }

    public static final void run$7(ARunnableS25S0110000_6 aRunnableS25S0110000_6) {
        boolean zLIZ;
        float f;
        C1C7U.LIZ("StoryV2AnimController@1246.animateReaction$1$2");
        try {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = ((View) aRunnableS25S0110000_6.l0).animate();
            float f2 = 1.5f;
            if (aRunnableS25S0110000_6.z1) {
                f = 1.5f;
            } else {
                f = 1.8f;
            }
            ViewPropertyAnimator viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(f);
            if (!aRunnableS25S0110000_6.z1) {
                f2 = 1.8f;
            }
            viewPropertyAnimatorScaleX.scaleY(f2).setDuration(200L).withEndAction(new ARunnableS106S0100000_6((View) aRunnableS25S0110000_6.l0, 294)).start();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("StoryV2AnimController@1246.animateReaction$1$2");
    }

    public ARunnableS25S0110000_6(View view, int i) {
        this.$t = i;
        if (1 - i != 0) {
            this.l0 = view;
            this.z1 = true;
        } else {
            this.l0 = view;
            this.z1 = true;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS25S0110000_6(android.view.View r2, boolean r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 2 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r2
            r0.z1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.z1 = r3
            r0.l0 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS25S0110000_6.<init>(android.view.View, boolean, int):void");
    }

    public ARunnableS25S0110000_6(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
