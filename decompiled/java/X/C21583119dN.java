package X;

import Y.ARunnableS128S0100000_28;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.sheet.widgets.CreativeBottomSheetBehavior;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19dN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21583119dN {
    public static final InterpolatorC21584119dX LJIL = new Interpolator() { // from class: X.19dX
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public int LIZ;
    public final int LIZIZ;
    public float[] LIZLLL;
    public float[] LJ;
    public float[] LJFF;
    public float[] LJI;
    public int[] LJII;
    public int[] LJIIIIZZ;
    public int[] LJIIIZ;
    public int LJIIJ;
    public VelocityTracker LJIIL;
    public final float LJIILIIL;
    public final float LJIILJJIL;
    public final int LJIILL;
    public final OverScroller LJIILLIIL;
    public final AbstractC21584419da LJIIZILJ;
    public View LJIJ;
    public boolean LJIJI;
    public final ViewGroup LJIJJ;
    public int LIZJ = -1;
    public int LJIIJJI = -1;
    public final ARunnableS128S0100000_28 LJIJJLI = new ARunnableS128S0100000_28(this, 18);

    public final void LIZ() {
        this.LIZJ = -1;
        float[] fArr = this.LIZLLL;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.LJ, 0.0f);
            Arrays.fill(this.LJFF, 0.0f);
            Arrays.fill(this.LJI, 0.0f);
            Arrays.fill(this.LJII, 0);
            Arrays.fill(this.LJIIIIZZ, 0);
            Arrays.fill(this.LJIIIZ, 0);
            this.LJIIJ = 0;
        }
        VelocityTracker velocityTracker = this.LJIIL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LJIIL = null;
        }
    }

    public final void LJIIIZ() {
        this.LJIIL.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LJIILIIL);
        float xVelocity = this.LJIIL.getXVelocity(this.LIZJ);
        float f = this.LJIILJJIL;
        float f2 = this.LJIILIIL;
        float fAbs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (fAbs < f) {
            xVelocity = 0.0f;
        } else if (fAbs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.LJIIL.getYVelocity(this.LIZJ);
        float f4 = this.LJIILJJIL;
        float f5 = this.LJIILIIL;
        float fAbs2 = Math.abs(yVelocity);
        if (fAbs2 >= f4) {
            if (fAbs2 <= f5) {
                f3 = yVelocity;
            } else if (yVelocity > 0.0f) {
                f3 = f5;
            } else {
                yVelocity = -f5;
                f3 = yVelocity;
            }
        }
        LJI(xVelocity, f3);
    }

    public final void LJ(int i) {
        float[] fArr = this.LIZLLL;
        if (fArr != null) {
            int i2 = this.LJIIJ;
            int i3 = 1 << i;
            if ((i3 & i2) != 0) {
                fArr[i] = 0.0f;
                this.LJ[i] = 0.0f;
                this.LJFF[i] = 0.0f;
                this.LJI[i] = 0.0f;
                this.LJII[i] = 0;
                this.LJIIIIZZ[i] = 0;
                this.LJIIIZ[i] = 0;
                this.LJIIJ = (~i3) & i2;
            }
        }
    }

    public final void LJIIL(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.LJIIJ & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.LJFF[pointerId] = x;
                this.LJI[pointerId] = y;
            }
        }
    }

    public final void LJIILIIL(int i) {
        HandlerHook.viewRemoveCallbacks(this.LJIJJ, this.LJIJJLI);
        if (this.LIZ != i) {
            this.LIZ = i;
            CreativeBottomSheetBehavior creativeBottomSheetBehavior = ((C21584319dZ) this.LJIIZILJ).LIZ;
            if (i == 1 && creativeBottomSheetBehavior.LJJ) {
                creativeBottomSheetBehavior.setStateInternal(1);
            }
            if (this.LIZ == 0) {
                this.LJIJ = null;
            }
        }
    }

    public final void LIZIZ(int i, View view) {
        if (view.getParent() == this.LJIJJ) {
            this.LJIJ = view;
            this.LIZJ = i;
            getClass();
            LJIILIIL(1);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sbLIZ.append(this.LJIJJ);
        sbLIZ.append(")");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LIZLLL(float f, View view) {
        int i;
        if (view == null) {
            return false;
        }
        getClass();
        CreativeBottomSheetBehavior creativeBottomSheetBehavior = ((C21584319dZ) this.LJIIZILJ).LIZ;
        if (creativeBottomSheetBehavior.LJIJJLI) {
            i = creativeBottomSheetBehavior.LJJIIZI;
        } else {
            i = creativeBottomSheetBehavior.LJIJI;
        }
        if (i <= 0 || Math.abs(f) <= this.LIZIZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(float r9, float r10) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21583119dN.LJI(float, float):void");
    }

    public final View LJII(int i, int i2) {
        for (int childCount = this.LJIJJ.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.LJIJJ;
            getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean LJIILJJIL(int i, View view) {
        C21584319dZ c21584319dZ;
        CreativeBottomSheetBehavior creativeBottomSheetBehavior;
        int i2;
        Reference reference;
        WeakReference<View> weakReference;
        View view2;
        if (view == this.LJIJ && this.LIZJ == i) {
            return true;
        }
        if (view == null || (i2 = (creativeBottomSheetBehavior = (c21584319dZ = (C21584319dZ) this.LJIIZILJ).LIZ).LJJI) == 1 || creativeBottomSheetBehavior.LJJIL || ((i2 == 3 && creativeBottomSheetBehavior.LJJIJL == i && (weakReference = creativeBottomSheetBehavior.LJJIJIIJI) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = c21584319dZ.LIZ.LJJIJ) == null || reference.get() != view)) {
            return false;
        }
        this.LIZJ = i;
        LIZIZ(i, view);
        return true;
    }

    public C21583119dN(Context context, ViewGroup viewGroup, C21584319dZ c21584319dZ) {
        if (viewGroup != null) {
            if (c21584319dZ != null) {
                this.LJIJJ = viewGroup;
                this.LJIIZILJ = c21584319dZ;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.LJIILL = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.LIZIZ = viewConfiguration.getScaledTouchSlop();
                this.LJIILIIL = viewConfiguration.getScaledMaximumFlingVelocity();
                this.LJIILJJIL = viewConfiguration.getScaledMinimumFlingVelocity();
                this.LJIILLIIL = new OverScroller(context, LJIL);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final int LJFF(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.LJIJJ.getWidth();
        float fMin = Math.min(1.0f, Math.abs(i) / width);
        float f = width / 2;
        float fSin = f + (((float) Math.sin((fMin - 0.5f) * 0.47123894f)) * f);
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        int i4 = this.LJIIJJI;
        if (i4 > 0) {
            return i4;
        }
        return Math.min(iAbs, 600);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final void LJIIJ(float f, float f2, int i) {
        boolean zLIZJ = LIZJ(f, f2, i, 1);
        ?? r2 = zLIZJ;
        if (LIZJ(f2, f, i, 4)) {
            r2 = (zLIZJ ? 1 : 0) | 4;
        }
        ?? r22 = r2;
        if (LIZJ(f, f2, i, 2)) {
            r22 = (r2 == true ? 1 : 0) | 2;
        }
        ?? r23 = r22;
        if (LIZJ(f2, f, i, 8)) {
            r23 = (r22 == true ? 1 : 0) | 8;
        }
        if (r23 != 0) {
            int[] iArr = this.LJIIIIZZ;
            iArr[i] = iArr[i] | r23;
            getClass();
        }
    }

    public final void LJIIJJI(float f, float f2, int i) {
        float[] fArr = this.LIZLLL;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.LJ;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.LJFF;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.LJI;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.LJII;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.LJIIIIZZ;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.LJIIIZ;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.LIZLLL = fArr2;
            this.LJ = fArr3;
            this.LJFF = fArr4;
            this.LJI = fArr5;
            this.LJII = iArr;
            this.LJIIIIZZ = iArr2;
            this.LJIIIZ = iArr3;
        }
        float[] fArr9 = this.LIZLLL;
        this.LJFF[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.LJ;
        this.LJI[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.LJII;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.LJIJJ.getLeft() + this.LJIILL) {
            i2 = 1;
        }
        if (i5 < this.LJIJJ.getTop() + this.LJIILL) {
            i2 |= 4;
        }
        if (i4 > this.LJIJJ.getRight() - this.LJIILL) {
            i2 |= 2;
        }
        if (i5 > this.LJIJJ.getBottom() - this.LJIILL) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.LJIIJ |= 1 << i;
    }

    public final boolean LIZJ(float f, float f2, int i, int i2) {
        Math.abs(f);
        Math.abs(f2);
        int i3 = this.LJII[i] & i2;
        return false;
    }

    public final boolean LJIIIIZZ(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5;
        int i6 = i3;
        int i7 = i4;
        int left = this.LJIJ.getLeft();
        int top = this.LJIJ.getTop();
        int i8 = i - left;
        int i9 = i2 - top;
        if (i8 == 0 && i9 == 0) {
            this.LJIILLIIL.abortAnimation();
            LJIILIIL(0);
            return false;
        }
        int i10 = (int) this.LJIILJJIL;
        int i11 = (int) this.LJIILIIL;
        int iAbs = Math.abs(i6);
        if (iAbs < i10) {
            i6 = 0;
        } else if (iAbs > i11) {
            if (i6 > 0) {
                i6 = i11;
            } else {
                i6 = -i11;
            }
        }
        int i12 = (int) this.LJIILJJIL;
        int i13 = (int) this.LJIILIIL;
        int iAbs2 = Math.abs(i7);
        if (iAbs2 < i12) {
            i7 = 0;
        } else if (iAbs2 > i13) {
            if (i7 > 0) {
                i7 = i13;
            } else {
                i7 = -i13;
            }
        }
        int iAbs3 = Math.abs(i8);
        int iAbs4 = Math.abs(i9);
        int iAbs5 = Math.abs(i6);
        int iAbs6 = Math.abs(i7);
        int i14 = iAbs5 + iAbs6;
        int i15 = iAbs3 + iAbs4;
        if (i6 != 0) {
            f = iAbs5;
            f2 = i14;
        } else {
            f = iAbs3;
            f2 = i15;
        }
        float f5 = f / f2;
        if (i7 != 0) {
            f3 = iAbs6;
            f4 = i14;
        } else {
            f3 = iAbs4;
            f4 = i15;
        }
        float f6 = f3 / f4;
        getClass();
        int iLJFF = LJFF(i8, i6, 0);
        CreativeBottomSheetBehavior creativeBottomSheetBehavior = ((C21584319dZ) this.LJIIZILJ).LIZ;
        if (creativeBottomSheetBehavior.LJIJJLI) {
            i5 = creativeBottomSheetBehavior.LJJIIZI;
        } else {
            i5 = creativeBottomSheetBehavior.LJIJI;
        }
        this.LJIILLIIL.startScroll(left, top, i8, i9, (int) ((iLJFF * f5) + (LJFF(i9, i7, i5) * f6)));
        LJIILIIL(2);
        return true;
    }
}
