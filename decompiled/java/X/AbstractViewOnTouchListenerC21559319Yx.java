package X;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.ListView;

/* JADX INFO: renamed from: X.19Yx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractViewOnTouchListenerC21559319Yx implements View.OnTouchListener {
    public static final int LLJJIII = ViewConfiguration.getTapTimeout();
    public final C21559519Yz LL;
    public final Interpolator LLILLJJLI;
    public final View LLILLL;
    public RunnableC21559419Yy LLILZ;
    public final float[] LLILZIL;
    public final float[] LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final float[] LLJ;
    public final float[] LLJI;
    public final float[] LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;

    public static float LIZIZ(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public final void LIZLLL() {
        int i = 0;
        if (this.LLJILJILJ) {
            this.LLJJ = false;
            return;
        }
        C21559519Yz c21559519Yz = this.LL;
        c21559519Yz.getClass();
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (jCurrentAnimationTimeMillis - c21559519Yz.LJ);
        int i3 = c21559519Yz.LIZIZ;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c21559519Yz.LJIIIIZZ = i;
        c21559519Yz.LJII = c21559519Yz.LIZ(jCurrentAnimationTimeMillis);
        c21559519Yz.LJI = jCurrentAnimationTimeMillis;
    }

    public final boolean LJ() {
        ListView listView;
        int count;
        C21559519Yz c21559519Yz = this.LL;
        float f = c21559519Yz.LIZLLL;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(c21559519Yz.LIZJ);
        if (iAbs != 0 && (count = (listView = ((C19XD) this).LLJJIJI).getCount()) != 0) {
            int childCount = listView.getChildCount();
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0) {
                return firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0;
            }
            if (i < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                return true;
            }
        }
        return false;
    }

    public AbstractViewOnTouchListenerC21559319Yx(View view) {
        C21559519Yz c21559519Yz = new C21559519Yz();
        this.LL = c21559519Yz;
        this.LLILLJJLI = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.LLILZIL = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.LLILZLL = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.LLJ = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.LLJI = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.LLJIJIL = fArr5;
        this.LLILLL = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.LLIZ = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.LLIZLLLIL = LLJJIII;
        c21559519Yz.LIZ = 500;
        c21559519Yz.LIZIZ = 500;
    }

    public final float LIZJ(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.LLIZ;
        if (i != 0 && i != 1) {
            if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        } else if (f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.LLJJ && i == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r1 != 3) goto L12;
     */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.19Yy] */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            boolean r0 = r6.LLJJI
            r5 = 0
            if (r0 != 0) goto L6
            return r5
        L6:
            int r1 = r8.getActionMasked()
            r4 = 1
            if (r1 == 0) goto L16
            if (r1 == r4) goto L7a
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L7a
        L15:
            return r5
        L16:
            r6.LLJILLL = r4
            r6.LLJILJIL = r5
        L1a:
            float r2 = r8.getX()
            int r0 = r7.getWidth()
            float r1 = (float) r0
            android.view.View r0 = r6.LLILLL
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r3 = r6.LIZ(r2, r1, r0, r5)
            float r2 = r8.getY()
            int r0 = r7.getHeight()
            float r1 = (float) r0
            android.view.View r0 = r6.LLILLL
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r1 = r6.LIZ(r2, r1, r0, r4)
            X.19Yz r0 = r6.LL
            r0.LIZJ = r3
            r0.LIZLLL = r1
            boolean r0 = r6.LLJJ
            if (r0 != 0) goto L15
            boolean r0 = r6.LJ()
            if (r0 == 0) goto L15
            X.19Yy r0 = r6.LLILZ
            if (r0 != 0) goto L5d
            X.19Yy r0 = new X.19Yy
            r0.<init>()
            r6.LLILZ = r0
        L5d:
            r6.LLJJ = r4
            r6.LLJILJILJ = r4
            boolean r0 = r6.LLJILJIL
            if (r0 != 0) goto L74
            int r0 = r6.LLIZLLLIL
            if (r0 <= 0) goto L74
            android.view.View r3 = r6.LLILLL
            X.19Yy r2 = r6.LLILZ
            long r0 = (long) r0
            r3.postOnAnimationDelayed(r2, r0)
        L71:
            r6.LLJILJIL = r4
            return r5
        L74:
            X.19Yy r0 = r6.LLILZ
            r0.run()
            goto L71
        L7a:
            r6.LIZLLL()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractViewOnTouchListenerC21559319Yx.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final float LIZ(float f, float f2, float f3, int i) {
        float interpolation;
        float fLIZIZ = LIZIZ(this.LLILZIL[i] * f2, 0.0f, this.LLILZLL[i]);
        float fLIZJ = LIZJ(f2 - f, fLIZIZ) - LIZJ(f, fLIZIZ);
        if (fLIZJ < 0.0f) {
            interpolation = -((AccelerateInterpolator) this.LLILLJJLI).getInterpolation(-fLIZJ);
        } else {
            if (fLIZJ > 0.0f) {
                interpolation = ((AccelerateInterpolator) this.LLILLJJLI).getInterpolation(fLIZJ);
            }
            return 0.0f;
        }
        float fLIZIZ2 = LIZIZ(interpolation, -1.0f, 1.0f);
        if (fLIZIZ2 != 0.0f) {
            float f4 = this.LLJ[i];
            float f5 = this.LLJI[i];
            float f6 = this.LLJIJIL[i];
            float f7 = f4 * f3;
            if (fLIZIZ2 > 0.0f) {
                return LIZIZ(fLIZIZ2 * f7, f5, f6);
            }
            return -LIZIZ((-fLIZIZ2) * f7, f5, f6);
        }
        return 0.0f;
    }
}
