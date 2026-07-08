package X;

import Y.ALAdapterS27S0200000_33;
import Y.ARunnableS133S0100000_33;
import Y.AUListenerS235S0200000_33;
import Y.AUListenerS280S0100000_33;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.19o0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21649019o0 extends AbstractC21649219o2 {
    public final float[] LLJILLL;
    public final float[] LLJJ;
    public final float[] LLJJI;
    public final Matrix LLJJIII;
    public final Matrix LLJJIJI;
    public final Matrix LLJJIJIIJIL;
    public InterfaceC1765520w2o LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final ValueAnimator LLJJJJ;
    public long LLJJJJJIL;
    public final ARunnableS133S0100000_33 LLJJJJLIIL;
    public final Scroller LLJJL;
    public final RectF LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;

    public void LJIILJJIL() {
    }

    public final boolean LJIIIZ() {
        return this.LLJJJJ.isRunning() || this.LLJJL.computeScrollOffset();
    }

    public final void LJIJ() {
        if (this.LLJJJJ.isRunning()) {
            this.LLJJJJ.cancel();
            this.LLJJJJ.removeAllUpdateListeners();
            this.LLJJJJ.removeAllListeners();
        }
    }

    public final boolean LJIIJ() {
        if (LJIIIZ()) {
            return false;
        }
        this.LLJIJIL.getValues(this.LLJILJILJ);
        float[] fArr = this.LLJILJILJ;
        fArr[0] = fArr[0] - 1.0f;
        fArr[4] = fArr[4] - 1.0f;
        fArr[8] = fArr[8] - 1.0f;
        int i = 0;
        while (Math.abs(this.LLJILJILJ[i]) <= 0.001f) {
            i++;
            if (i >= 9) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC21650219oC
    public /* bridge */ /* synthetic */ void LIZLLL(C21649319o3 c21649319o3) {
        LJIILJJIL();
    }

    public final boolean LJIIL(Matrix matrix) {
        RectF rectF = this.LLJJLIIIJLLLLLLLZ;
        RectF rectF2 = this.LLJ;
        RectF rectF3 = this.LLIZLLLIL;
        rectF.set(rectF2);
        matrix.mapRect(rectF);
        float fLJIIIIZZ = LJIIIIZZ(rectF.left, rectF.right, rectF3.left, rectF3.right, rectF2.centerX());
        float fLJIIIIZZ2 = LJIIIIZZ(rectF.top, rectF.bottom, rectF3.top, rectF3.bottom, rectF2.centerY());
        if (fLJIIIIZZ == 0.0f && fLJIIIIZZ2 == 0.0f) {
            return false;
        }
        matrix.postTranslate(fLJIIIIZZ, fLJIIIIZZ2);
        return true;
    }

    @Override // X.InterfaceC21650219oC
    /* JADX INFO: renamed from: LJIILIIL, reason: merged with bridge method [inline-methods] */
    public void LIZJ(C21649319o3 c21649319o3) {
        if (this.LLJL) {
            return;
        }
        LJIJ();
        if (this.LLJJL.computeScrollOffset()) {
            this.LLJJL.forceFinished(true);
        }
    }

    @Override // X.InterfaceC21650219oC
    /* JADX INFO: renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    public void LIZ(C21649319o3 c21649319o3) {
        if (this.LLJL || LJIIIZ()) {
            return;
        }
        C21649719o7 c21649719o7 = c21649319o3.LLILLJJLI;
        int i = c21649719o7.LIZ;
        if (i != c21649719o7.LIZIZ && i == 1) {
            this.LLJJIII.set(this.LLJIJIL);
            RectF rectF = this.LLIZLLLIL;
            if (LJIIJJI(rectF.centerX(), rectF.centerY(), this.LLJJIII) | LJIIL(this.LLJJIII)) {
                this.LLJL = true;
                LJIIZILJ(this.LLJJIII, this.LLJJJJJIL, this.LLJJJJLIIL, null);
                return;
            }
            return;
        }
        Matrix matrix = this.LLJIJIL;
        C21649319o3 c21649319o32 = this.LL;
        matrix.set(matrix);
        if (this.LLILZIL) {
            matrix.postTranslate(c21649319o32.LLJ, c21649319o32.LLJI);
        }
        if (this.LLILZ && c21649319o32.LLILLJJLI.LIZ > 1) {
            float f = c21649319o32.LLJIJIL;
            matrix.postScale(f, f, c21649319o32.LLIZ, c21649319o32.LLIZLLLIL);
        }
        if (c21649319o32.LLILLJJLI.LIZ == 1) {
            LJIIL(matrix);
        }
        LJFF();
    }

    public final boolean LJIILLIIL(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 3) {
            if (this.LLILLL) {
                this.LL.LJ(motionEvent);
                return true;
            }
            return false;
        }
        if (this.LLJJJ) {
            C21649319o3 c21649319o3 = this.LL;
            if ((Math.abs(this.LLJI.left - this.LLIZLLLIL.left) < 0.001f || LJIIJ()) && c21649319o3.LLJILJIL == 3) {
                return false;
            }
            if ((Math.abs(this.LLJI.right - this.LLIZLLLIL.right) < 0.001f || LJIIJ()) && c21649319o3.LLJILJIL == 1) {
                return false;
            }
        }
        if (this.LLJJJIL) {
            C21649319o3 c21649319o32 = this.LL;
            if ((Math.abs(this.LLJI.top - this.LLIZLLLIL.top) < 0.001f || LJIIJ()) && c21649319o32.LLJILJIL == 4) {
                return false;
            }
            if ((Math.abs(this.LLJI.bottom - this.LLIZLLLIL.bottom) < 0.001f || LJIIJ()) && c21649319o32.LLJILJIL == 2) {
                return false;
            }
        }
        if (this.LLILLL) {
            this.LL.LJ(motionEvent);
            return true;
        }
        return false;
    }

    public C21649019o0(C21649319o3 c21649319o3, Context context) {
        super(c21649319o3);
        this.LLJILLL = new float[9];
        this.LLJJ = new float[9];
        this.LLJJI = new float[9];
        this.LLJJIII = new Matrix();
        this.LLJJIJI = new Matrix();
        this.LLJJIJIIJIL = new Matrix();
        this.LLJJJ = false;
        this.LLJJJIL = false;
        this.LLJJJJJIL = 400L;
        this.LLJJJJLIIL = new ARunnableS133S0100000_33(this, 112);
        this.LLJJLIIIJLLLLLLLZ = new RectF();
        this.LLJL = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LLJJJJ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator(1.2f));
        this.LLJJL = new Scroller(context);
    }

    public final boolean LJIIJJI(float f, float f2, Matrix matrix) {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Map<String, String> map = C07KF.LIZ;
        Object objLJJII = c0c64LJIILLIIL.LJJII(Map.class, map, "ec_pdp_header_image_resize", true);
        if (objLJJII == null) {
            objLJJII = map;
        }
        boolean z = !Intrinsics.LJFF(objLJJII, map);
        matrix.getValues(this.LLJILJILJ);
        float f3 = this.LLJILJILJ[0];
        if (z) {
            if (f3 > 10.0f) {
                float f4 = 10.0f / f3;
                matrix.postScale(f4, f4, f, f2);
                return true;
            }
            if (f3 < 1.0f) {
                float f5 = 1.0f / f3;
                matrix.postScale(f5, f5, f, f2);
                return true;
            }
        } else {
            float fMax = Math.max(1.0f, f3);
            float f6 = this.LLILZLL;
            if (f6 == 0.0f) {
                f6 = this.LLIZ;
            }
            float fMin = Math.min(fMax, f6);
            if (fMin != f3) {
                float f7 = fMin / f3;
                matrix.postScale(f7, f7, f, f2);
                return true;
            }
        }
        return false;
    }

    public final void LJIIZILJ(Matrix matrix, long j, Runnable runnable, AUListenerS280S0100000_33 aUListenerS280S0100000_33) {
        if (this.LLJJJJ.isRunning()) {
            LJIJ();
        }
        this.LLJJJJ.setDuration(j);
        this.LLJIJIL.getValues(this.LLJILLL);
        matrix.getValues(this.LLJJ);
        this.LLJJJJ.addUpdateListener(new AUListenerS235S0200000_33(this, aUListenerS280S0100000_33, 7));
        this.LLJJJJ.addListener(new ALAdapterS27S0200000_33(runnable, this, 7));
        this.LLJJJJ.start();
    }

    public static float LJIIIIZZ(float f, float f2, float f3, float f4, float f5) {
        float f6 = f2 - f;
        float f7 = f4 - f3;
        if (f6 < Math.min(f5 - f3, f4 - f5) * 2.0f) {
            return f5 - ((f2 + f) / 2.0f);
        }
        if (f6 < f7) {
            if (f5 < (f3 + f4) / 2.0f) {
                return f3 - f;
            }
            return f4 - f2;
        }
        if (f > f3) {
            return f3 - f;
        }
        if (f2 < f4) {
            return f4 - f2;
        }
        return 0.0f;
    }
}
