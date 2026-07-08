package X;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.19s3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21674119s3 extends AbstractC21674019s2 {
    public PointF LJIIIZ;
    public final DisplayMetrics LJIIJ;
    public float LJIIL;
    public final LinearInterpolator LJII = new LinearInterpolator();
    public final DecelerateInterpolator LJIIIIZZ = new DecelerateInterpolator();
    public boolean LJIIJJI = false;
    public int LJIILIIL = 0;
    public int LJIILJJIL = 0;

    @Override // X.AbstractC21674019s2
    public void LJ() {
    }

    @Override // X.AbstractC21674019s2
    public void LJFF() {
        this.LJIILJJIL = 0;
        this.LJIILIIL = 0;
        this.LJIIIZ = null;
    }

    public int LJIILJJIL() {
        PointF pointF = this.LJIIIZ;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.x;
        if (f != 0.0f) {
            return f > 0.0f ? 1 : -1;
        }
        return 0;
    }

    public int LJIILL() {
        PointF pointF = this.LJIIIZ;
        if (pointF == null) {
            return 0;
        }
        float f = pointF.y;
        if (f != 0.0f) {
            return f > 0.0f ? 1 : -1;
        }
        return 0;
    }

    public C21674119s3(Context context) {
        this.LJIIJ = context.getResources().getDisplayMetrics();
    }

    public float LJIIJJI(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int LJIIL(int i) {
        return (int) Math.ceil(((double) LJIILIIL(i)) / 0.3356d);
    }

    public int LJIILIIL(int i) {
        float fAbs = Math.abs(i);
        if (!this.LJIIJJI) {
            this.LJIIL = LJIIJJI(this.LJIIJ);
            this.LJIIJJI = true;
        }
        return (int) Math.ceil(fAbs * this.LJIIL);
    }

    public int LJIIIZ(int i, View view) {
        RecyclerView.LayoutManager layoutManager = this.LIZJ;
        if (layoutManager != null && layoutManager.canScrollHorizontally()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            return LJIIIIZZ(layoutManager.getDecoratedLeft(view) - marginLayoutParams.leftMargin, layoutManager.getDecoratedRight(view) + marginLayoutParams.rightMargin, layoutManager.getPaddingLeft(), layoutManager.getWidth() - layoutManager.getPaddingRight(), i);
        }
        return 0;
    }

    public int LJIIJ(int i, View view) {
        RecyclerView.LayoutManager layoutManager = this.LIZJ;
        if (layoutManager != null && layoutManager.canScrollVertically()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            return LJIIIIZZ(layoutManager.getDecoratedTop(view) - marginLayoutParams.topMargin, layoutManager.getDecoratedBottom(view) + marginLayoutParams.bottomMargin, layoutManager.getPaddingTop(), layoutManager.getHeight() - layoutManager.getPaddingBottom(), i);
        }
        return 0;
    }

    @Override // X.AbstractC21674019s2
    public final void LIZLLL(int i, int i2, C21675319sF c21675319sF) {
        if (LIZIZ() == 0) {
            LJII();
            return;
        }
        int i3 = this.LJIILIIL;
        int i4 = i3 - i;
        int i5 = 0;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.LJIILIIL = i4;
        int i6 = this.LJIILJJIL;
        int i7 = i6 - i2;
        if (i6 * i7 > 0) {
            i5 = i7;
        }
        this.LJIILJJIL = i5;
        if (i4 == 0 && i5 == 0) {
            PointF pointFLIZ = LIZ(this.LIZ);
            if (pointFLIZ != null) {
                if (pointFLIZ.x != 0.0f || pointFLIZ.y != 0.0f) {
                    float f = pointFLIZ.y;
                    float fSqrt = (float) Math.sqrt((r2 * r2) + (f * f));
                    float f2 = pointFLIZ.x / fSqrt;
                    pointFLIZ.x = f2;
                    float f3 = pointFLIZ.y / fSqrt;
                    pointFLIZ.y = f3;
                    this.LJIIIZ = pointFLIZ;
                    this.LJIILIIL = (int) (f2 * 10000.0f);
                    this.LJIILJJIL = (int) (f3 * 10000.0f);
                    c21675319sF.LIZIZ((int) (this.LJIILIIL * 1.2f), (int) (this.LJIILJJIL * 1.2f), this.LJII, (int) (LJIILIIL(10000) * 1.2f));
                    return;
                }
            }
            c21675319sF.LIZLLL = this.LIZ;
            LJII();
        }
    }

    @Override // X.AbstractC21674019s2
    public void LJI(View view, C21673919s1 c21673919s1, C21675319sF c21675319sF) {
        int iLJIIIZ = LJIIIZ(LJIILJJIL(), view);
        int iLJIIJ = LJIIJ(LJIILL(), view);
        int iLJIIL = LJIIL((int) Math.sqrt((iLJIIIZ * iLJIIIZ) + (iLJIIJ * iLJIIJ)));
        if (iLJIIL > 0) {
            c21675319sF.LIZIZ(-iLJIIIZ, -iLJIIJ, this.LJIIIIZZ, iLJIIL);
        }
    }

    public int LJIIIIZZ(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }
}
