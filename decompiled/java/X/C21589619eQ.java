package X;

import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.anim.BottomSheetBehavior;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19eQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21589619eQ {
    public static final InterpolatorC21589819eS LJIJJLI = new Interpolator() { // from class: X.19eS
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
    public VelocityTracker LJIIJJI;
    public final float LJIIL;
    public final float LJIILIIL;
    public final int LJIILJJIL;
    public final OverScroller LJIILL;
    public final AbstractC21590019eU LJIILLIIL;
    public View LJIIZILJ;
    public boolean LJIJ;
    public final ViewGroup LJIJI;
    public int LIZJ = -1;
    public final ARunnableS126S0100000_26 LJIJJ = new ARunnableS126S0100000_26(this, 9);

    public final void LIZIZ() {
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
        VelocityTracker velocityTracker = this.LJIIJJI;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LJIIJJI = null;
        }
    }

    public final void LJIIJJI() {
        this.LJIIJJI.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LJIIL);
        float xVelocity = this.LJIIJJI.getXVelocity(this.LIZJ);
        float f = this.LJIILIIL;
        float f2 = this.LJIIL;
        float fAbs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (fAbs < f) {
            xVelocity = 0.0f;
        } else if (fAbs > f2) {
            xVelocity = xVelocity > 0.0f ? f2 : -f2;
        }
        float yVelocity = this.LJIIJJI.getYVelocity(this.LIZJ);
        float f4 = this.LJIILIIL;
        float f5 = this.LJIIL;
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
        LJII(xVelocity, f3);
    }

    public final void LJFF(int i) {
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

    public final void LJIILJJIL(MotionEvent motionEvent) {
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

    public final void LJIILL(int i) {
        HandlerHook.viewRemoveCallbacks(this.LJIJI, this.LJIJJ);
        if (this.LIZ != i) {
            this.LIZ = i;
            C21589919eT c21589919eT = (C21589919eT) this.LJIILLIIL;
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = c21589919eT.LIZ;
                if (bottomSheetBehavior.LJIIZILJ) {
                    bottomSheetBehavior.setStateInternal(1);
                }
            } else {
                c21589919eT.getClass();
            }
            if (this.LIZ == 0) {
                this.LJIIZILJ = null;
            }
        }
    }

    public final void LIZJ(int i, View view) {
        if (view.getParent() == this.LJIJI) {
            this.LJIIZILJ = view;
            this.LIZJ = i;
            getClass();
            LJIILL(1);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(")");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final boolean LJ(float f, View view) {
        int i;
        if (view == null) {
            return false;
        }
        getClass();
        BottomSheetBehavior bottomSheetBehavior = ((C21589919eT) this.LJIILLIIL).LIZ;
        if (bottomSheetBehavior.LJIILL) {
            i = bottomSheetBehavior.LJJIJIIJIL;
        } else {
            i = bottomSheetBehavior.LJIILJJIL;
        }
        if (i <= 0 || Math.abs(f) <= this.LIZIZ) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(float r11, float r12) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21589619eQ.LJII(float, float):void");
    }

    public final View LJIIIZ(int i, int i2) {
        for (int childCount = this.LJIJI.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.LJIJI;
            getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean LJIILLIIL(int i, View view) {
        C21589919eT c21589919eT;
        BottomSheetBehavior bottomSheetBehavior;
        int i2;
        Reference reference;
        WeakReference<View> weakReference;
        View view2;
        if (view == this.LJIIZILJ && this.LIZJ == i) {
            return true;
        }
        if (view == null || (i2 = (bottomSheetBehavior = (c21589919eT = (C21589919eT) this.LJIILLIIL).LIZ).LJJIIJ) == 1 || bottomSheetBehavior.LJJJIL || ((i2 == 3 && bottomSheetBehavior.LJJIZ == i && (weakReference = bottomSheetBehavior.LJJIJL) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = c21589919eT.LIZ.LJJIJIL) == null || reference.get() != view)) {
            return false;
        }
        this.LIZJ = i;
        LIZJ(i, view);
        return true;
    }

    public C21589619eQ(Context context, ViewGroup viewGroup, AbstractC21590019eU abstractC21590019eU) {
        if (viewGroup != null) {
            if (abstractC21590019eU != null) {
                this.LJIJI = viewGroup;
                this.LJIILLIIL = abstractC21590019eU;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.LJIILJJIL = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.LIZIZ = viewConfiguration.getScaledTouchSlop();
                this.LJIIL = viewConfiguration.getScaledMaximumFlingVelocity();
                this.LJIILIIL = viewConfiguration.getScaledMinimumFlingVelocity();
                this.LJIILL = new OverScroller(context, LJIJJLI);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final int LJI(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.LJIJI.getWidth();
        float fMin = Math.min(1.0f, Math.abs(i) / width);
        float f = width / 2;
        float fSin = f + (((float) Math.sin((fMin - 0.5f) * 0.47123894f)) * f);
        int iAbs2 = Math.abs(i2);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
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
    public final void LJIIL(float f, float f2, int i) {
        boolean zLIZLLL = LIZLLL(f, f2, i, 1);
        ?? r2 = zLIZLLL;
        if (LIZLLL(f2, f, i, 4)) {
            r2 = (zLIZLLL ? 1 : 0) | 4;
        }
        ?? r22 = r2;
        if (LIZLLL(f, f2, i, 2)) {
            r22 = (r2 == true ? 1 : 0) | 2;
        }
        ?? r23 = r22;
        if (LIZLLL(f2, f, i, 8)) {
            r23 = (r22 == true ? 1 : 0) | 8;
        }
        if (r23 != 0) {
            int[] iArr = this.LJIIIIZZ;
            iArr[i] = iArr[i] | r23;
            getClass();
        }
    }

    public final void LJIILIIL(float f, float f2, int i) {
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
        if (i4 < this.LJIJI.getLeft() + this.LJIILJJIL) {
            i2 = 1;
        }
        if (i5 < this.LJIJI.getTop() + this.LJIILJJIL) {
            i2 |= 4;
        }
        if (i4 > this.LJIJI.getRight() - this.LJIILJJIL) {
            i2 |= 2;
        }
        if (i5 > this.LJIJI.getBottom() - this.LJIILJJIL) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.LJIIJ |= 1 << i;
    }

    public static boolean LIZ(int i, int i2, int i3, View view) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && LIZ(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt)) {
                    return true;
                }
            }
        }
        if ((i != 0 && view.canScrollHorizontally(-i)) || view.canScrollVertically(-1)) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL(float f, float f2, int i, int i2) {
        Math.abs(f);
        Math.abs(f2);
        int i3 = this.LJII[i] & i2;
        return false;
    }

    public final void LJIIIIZZ(int i, int i2, int i3, int i4) {
        int i5;
        int left = this.LJIIZILJ.getLeft();
        int top = this.LJIIZILJ.getTop();
        if (i3 != 0) {
            AbstractC21590019eU abstractC21590019eU = this.LJIILLIIL;
            View view = this.LJIIZILJ;
            abstractC21590019eU.getClass();
            this.LJIIZILJ.offsetLeftAndRight(view.getLeft() - left);
        }
        if (i4 != 0) {
            C21589919eT c21589919eT = (C21589919eT) this.LJIILLIIL;
            int expandedOffset = c21589919eT.LIZ.getExpandedOffset();
            BottomSheetBehavior bottomSheetBehavior = c21589919eT.LIZ;
            if (bottomSheetBehavior.LJIILL) {
                i5 = bottomSheetBehavior.LJJIJIIJIL;
            } else {
                i5 = bottomSheetBehavior.LJIILJJIL;
            }
            i2 = C419990GdR.LIZIZ(i2, expandedOffset, i5);
            this.LJIIZILJ.offsetTopAndBottom(i2 - top);
        }
        if (i3 != 0 || i4 != 0) {
            ((C21589919eT) this.LJIILLIIL).LIZ.dispatchOnSlide(i2);
        }
    }

    public final boolean LJIIJ(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5;
        int i6 = i3;
        int i7 = i4;
        int left = this.LJIIZILJ.getLeft();
        int top = this.LJIIZILJ.getTop();
        int i8 = i - left;
        int i9 = i2 - top;
        if (i8 == 0 && i9 == 0) {
            this.LJIILL.abortAnimation();
            LJIILL(0);
            return false;
        }
        int i10 = (int) this.LJIILIIL;
        int i11 = (int) this.LJIIL;
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
        int i12 = (int) this.LJIILIIL;
        int i13 = (int) this.LJIIL;
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
        int iLJI = LJI(i8, i6, 0);
        BottomSheetBehavior bottomSheetBehavior = ((C21589919eT) this.LJIILLIIL).LIZ;
        if (bottomSheetBehavior.LJIILL) {
            i5 = bottomSheetBehavior.LJJIJIIJIL;
        } else {
            i5 = bottomSheetBehavior.LJIILJJIL;
        }
        this.LJIILL.startScroll(left, top, i8, i9, (int) ((iLJI * f5) + (LJI(i9, i7, i5) * f6)));
        LJIILL(2);
        return true;
    }
}
