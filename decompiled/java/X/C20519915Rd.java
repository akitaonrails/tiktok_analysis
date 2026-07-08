package X;

import Y.ALAdapterS25S0200000_31;
import Y.ARunnableS131S0100000_31;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS575S0100000_31;
import xbk.f;

/* JADX INFO: renamed from: X.15Rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20519915Rd implements InterfaceC2254051DKh {
    public final Context LIZ;
    public final InterfaceC2254081DKk LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public final C20519615Ra LJ;
    public final ImageView LJFF;
    public boolean LJIIIZ;
    public final C01GW LJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1599));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1600));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1601));
    public boolean LJIIJ = true;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 1604));
    public final boolean LJIIL = true;
    public final int LJIILIIL = -1;
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(655));

    @Override // X.InterfaceC2254051DKh
    public final void E0() {
        if (this.LIZLLL) {
            if (this.LJIIIZ) {
                ((AnimatorSet) this.LJI.getValue()).end();
            } else {
                ((AnimatorSet) this.LJII.getValue()).end();
            }
        }
    }

    public final InterfaceC20520115Rf LIZIZ() {
        return (InterfaceC20520115Rf) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC2254051DKh
    public final void M0() {
        if (this.LIZJ) {
            if (this.LJIIIZ) {
                ((AnimatorSet) this.LJI.getValue()).end();
            } else {
                ((AnimatorSet) this.LJIIIIZZ.getValue()).end();
            }
        }
    }

    @Override // X.InterfaceC2254051DKh
    public final boolean getIsExposureSeekBarShowing() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC2254051DKh
    public final void J0(boolean z) {
        this.LJIIJ = z;
    }

    public final AnimatorSet LIZ(View view) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.5f);
        objectAnimatorOfFloat2.setDuration(1000L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.5f, 0.5f);
        objectAnimatorOfFloat3.setDuration(500L);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.5f, 0.0f);
        objectAnimatorOfFloat4.setDuration(500L);
        objectAnimatorOfFloat4.addListener(new ALAdapterS25S0200000_31(view, this, 11));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4);
        return animatorSet;
    }

    @Override // X.InterfaceC2254051DKh
    public final void setExposureSeekBarProgress(float f) {
        if (this.LJIIIZ) {
            ((AnimatorSet) this.LJI.getValue()).end();
            LIZIZ().removeView(this.LJFF);
            LIZIZ().removeView(this.LJ);
            LIZIZ().addView(this.LJ);
            LIZIZ().addView(this.LJFF);
            this.LIZLLL = true;
            this.LIZJ = true;
        } else {
            ((AnimatorSet) this.LJIIIIZZ.getValue()).end();
            ((AnimatorSet) this.LJII.getValue()).end();
            LIZIZ().removeView(this.LJFF);
            LIZIZ().removeView(this.LJ);
            LIZIZ().addView(this.LJ);
            LIZIZ().addView(this.LJFF);
            this.LIZLLL = true;
            this.LIZJ = true;
        }
        this.LJ.setProgress(f);
        float progress = this.LJ.getProgress();
        C1286570jaJ cameraECInfo = this.LIZIZ.getCameraECInfo();
        if (cameraECInfo != null) {
            int i = cameraECInfo.LIZJ;
            int i2 = cameraECInfo.LIZ;
            if (Math.abs(i) < Math.abs(i2)) {
                i2 = -i;
            } else if (Math.abs(i2) < Math.abs(i)) {
                i = -i2;
            }
            this.LIZIZ.setExposureCompensation((int) ((progress * (i2 - i)) + i));
        }
        ((AnimatorSet) this.LJII.getValue()).start();
        ((AnimatorSet) this.LJIIIIZZ.getValue()).start();
    }

    @Override // X.InterfaceC2254051DKh
    public final void H0(int i, int i2) {
        int i3;
        int i4;
        DisplayMetrics displayMetrics;
        DisplayMetrics displayMetrics2;
        if ((!this.LIZJ || this.LIZIZ.getExposureCompensationEnable()) && this.LJIIJ) {
            ((Handler) this.LJIILJJIL.getValue()).removeCallbacksAndMessages(null);
            ImageView imageView = this.LJFF;
            imageView.setImageDrawable(new AbstractC415370GQl() { // from class: X.0GHo
                {
                    this.LIZJ.LIZ(42.0f, 42.0f, 41.25f, Path.Direction.CW);
                    this.LIZIZ.setStyle(Paint.Style.STROKE);
                    this.LIZIZ.setStrokeWidth(1.5f);
                    this.LIZIZ.setColor(-1);
                    this.LIZ.add(this.LIZIZ);
                }

                @Override // X.AbstractC415370GQl
                public final void LIZ(Canvas canvas) {
                    LIZIZ(84.0f, 84.0f, canvas);
                    canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
                }
            });
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ImageView imageView2 = this.LJFF;
            int iLIZ = this.LJIILIIL;
            if (iLIZ <= 0) {
                iLIZ = (int) C20519715Rb.LIZ(65.0f, this.LIZ);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iLIZ, iLIZ);
            int i5 = iLIZ / 2;
            layoutParams.leftMargin = i - i5;
            if (C1336470ksn.LIZJ(this.LIZ)) {
                layoutParams.rightMargin = (C20519715Rb.LIZIZ(this.LIZ) - layoutParams.leftMargin) - iLIZ;
            }
            layoutParams.topMargin = i2 - i5;
            if (layoutParams.leftMargin > C20519715Rb.LIZIZ(this.LIZ) - iLIZ) {
                layoutParams.leftMargin = C20519715Rb.LIZIZ(this.LIZ) - iLIZ;
            }
            if (C1336470ksn.LIZJ(this.LIZ) && layoutParams.rightMargin > C20519715Rb.LIZIZ(this.LIZ) - iLIZ) {
                layoutParams.rightMargin = C20519715Rb.LIZIZ(this.LIZ) - iLIZ;
            }
            if (layoutParams.leftMargin < 0) {
                layoutParams.leftMargin = 0;
            }
            if (C1336470ksn.LIZJ(this.LIZ) && layoutParams.rightMargin < 0) {
                layoutParams.rightMargin = 0;
            }
            int i6 = layoutParams.topMargin;
            Context context = this.LIZ;
            if (context != null && (displayMetrics2 = context.getResources().getDisplayMetrics()) != null) {
                i3 = displayMetrics2.heightPixels;
            } else {
                i3 = 0;
            }
            if (i6 > i3 - iLIZ) {
                Context context2 = this.LIZ;
                if (context2 != null && (displayMetrics = context2.getResources().getDisplayMetrics()) != null) {
                    i4 = displayMetrics.heightPixels;
                } else {
                    i4 = 0;
                }
                layoutParams.topMargin = i4 - iLIZ;
            }
            if (layoutParams.topMargin < 0) {
                layoutParams.topMargin = 0;
            }
            C786410Ut5.c6(imageView2, layoutParams);
            if (this.LIZJ) {
                if (this.LJIIIZ) {
                    ((AnimatorSet) this.LJI.getValue()).end();
                } else {
                    ((AnimatorSet) this.LJIIIIZZ.getValue()).end();
                }
            }
            LIZIZ().removeView(this.LJFF);
            C786410Ut5.V4(this.LJFF, 1.0f);
            LIZIZ().addView(this.LJFF);
            if (this.LJIIL) {
                ((AnimatorSet) this.LJI.getValue()).start();
            } else {
                C786410Ut5.LJLIIL(1500L, (Handler) this.LJIILJJIL.getValue(), new ARunnableS131S0100000_31(this, 206));
            }
            this.LIZJ = true;
        }
    }

    @Override // X.InterfaceC2254051DKh
    public final void nh(float f, float f2) {
        float fLIZ;
        if (this.LIZLLL) {
            ((AnimatorSet) this.LJII.getValue()).end();
        }
        LIZIZ().removeView(this.LJ);
        if (f > C20519715Rb.LIZIZ(this.LIZ) - C20519715Rb.LIZ(64.0f, this.LIZ)) {
            fLIZ = f - C20519715Rb.LIZ(51.5f, this.LIZ);
        } else {
            fLIZ = f + C20519715Rb.LIZ(51.5f, this.LIZ);
        }
        double d = 0;
        double seekBarTotalLength = (((double) this.LJ.getSeekBarTotalLength()) * 0.5d) + d;
        double seekBarTotalLength2 = d - (((double) this.LJ.getSeekBarTotalLength()) * 0.5d);
        double d2 = f2;
        if (seekBarTotalLength <= d2 && d2 <= seekBarTotalLength2) {
            float[] fArr = {fLIZ, f2};
            this.LIZLLL = true;
            C20519615Ra c20519615Ra = this.LJ;
            float f3 = fArr[0];
            float f4 = fArr[1];
            c20519615Ra.LLILZLL = f3;
            c20519615Ra.LLIZ = f4;
            c20519615Ra.LLJIJIL = false;
            c20519615Ra.LLIZLLLIL = 0.5f;
            c20519615Ra.invalidate();
            C20519615Ra c20519615Ra2 = this.LJ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20519615Ra2);
            c20519615Ra2.setAlpha(1.0f);
            this.LIZIZ.setExposureCompensation(0);
            LIZIZ().addView(this.LJ);
        }
    }

    public C20519915Rd(Context context, f fVar, C2253541DIi c2253541DIi) {
        this.LIZ = context;
        this.LIZIZ = fVar;
        this.LJ = new C20519615Ra(context);
        this.LJFF = new ImageView(context);
    }
}
