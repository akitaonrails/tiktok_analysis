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
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19eK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21589019eK {
    public static float LJIJJLI = 1.0f;
    public static final InterpolatorC21589519eP LJIL = new Interpolator() { // from class: X.19eP
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
    public final AbstractC21589419eO LJIILLIIL;
    public View LJIIZILJ;
    public boolean LJIJ;
    public final ViewGroup LJIJI;
    public int LIZJ = -1;
    public final ARunnableS126S0100000_26 LJIJJ = new ARunnableS126S0100000_26(this, 16);

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
        VelocityTracker velocityTracker = this.LJIIJJI;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LJIIJJI = null;
        }
    }

    public final void LJIIIZ() {
        VelocityTracker velocityTracker = this.LJIIJJI;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LJIIL);
        }
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
        LJI(xVelocity, f3);
    }

    public final void LJ(int i) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3 = this.LIZLLL;
        if (fArr3 != null) {
            int i2 = this.LJIIJ;
            int i3 = 1 << i;
            if ((i3 & i2) != 0 && (fArr = this.LJFF) != null && (fArr2 = this.LJI) != null) {
                fArr3[i] = 0.0f;
                this.LJ[i] = 0.0f;
                fArr[i] = 0.0f;
                fArr2[i] = 0.0f;
                this.LJII[i] = 0;
                this.LJIIIIZZ[i] = 0;
                this.LJIIIZ[i] = 0;
                this.LJIIJ = (~i3) & i2;
            }
        }
    }

    public final void LJIIL(MotionEvent motionEvent) {
        if (this.LJFF != null && this.LJI != null) {
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
    }

    public final void LJIILIIL(int i) {
        HandlerHook.viewRemoveCallbacks(this.LJIJI, this.LJIJJ);
        if (this.LIZ != i) {
            this.LIZ = i;
            C21589319eN c21589319eN = (C21589319eN) this.LJIILLIIL;
            if (i == 1) {
                c21589319eN.LIZ.setStateInternal(1);
            } else {
                c21589319eN.getClass();
            }
            if (this.LIZ == 0) {
                this.LJIIZILJ = null;
            }
        }
    }

    public final void LIZIZ(int i, View view) {
        if (view.getParent() == this.LJIJI) {
            this.LJIIZILJ = view;
            this.LIZJ = i;
            this.LJIILLIIL.getClass();
            LJIILIIL(1);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("captureChildView: parameter must be a descendant of the AdPopUpWebViewDragHelper's tracked parent view (");
        sbLIZ.append(this.LJIJI);
        sbLIZ.append(")");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(float r13, float r14) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21589019eK.LJI(float, float):void");
    }

    public final View LJII(int i, int i2) {
        for (int childCount = this.LJIJI.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.LJIJI;
            this.LJIILLIIL.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean LJIILJJIL(int i, View view) {
        C21589319eN c21589319eN;
        AdPopUpWebBottomSheetBehavior adPopUpWebBottomSheetBehavior;
        int i2;
        Reference reference;
        WeakReference<View> weakReference;
        View view2;
        if (view == this.LJIIZILJ && this.LIZJ == i) {
            return true;
        }
        if (view == null || (i2 = (adPopUpWebBottomSheetBehavior = (c21589319eN = (C21589319eN) this.LJIILLIIL).LIZ).LJIIIIZZ) == 1 || adPopUpWebBottomSheetBehavior.LJIJJ || ((i2 == 3 && adPopUpWebBottomSheetBehavior.LJIJ == i && (weakReference = adPopUpWebBottomSheetBehavior.LJIILL) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = c21589319eN.LIZ.LJIILJJIL) == null || reference.get() != view)) {
            return false;
        }
        this.LIZJ = i;
        LIZIZ(i, view);
        return true;
    }

    public C21589019eK(Context context, ViewGroup viewGroup, C21589319eN c21589319eN) {
        if (viewGroup != null) {
            if (c21589319eN != null) {
                this.LJIJI = viewGroup;
                this.LJIILLIIL = c21589319eN;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.LJIILJJIL = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.LIZIZ = viewConfiguration.getScaledTouchSlop();
                this.LJIIL = viewConfiguration.getScaledMaximumFlingVelocity();
                this.LJIILIIL = viewConfiguration.getScaledMinimumFlingVelocity();
                this.LJIILL = new OverScroller(context, LJIL);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final boolean LIZLLL(float f, float f2, View view) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.LJIILLIIL.LIZ() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJIILLIIL.LIZIZ() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            if (z2) {
                float f3 = (f * f) + (f2 * f2);
                int i = this.LIZIZ;
                if (f3 <= i * i) {
                    return false;
                }
                return true;
            }
            if (Math.abs(f) <= this.LIZIZ) {
                return false;
            }
            return true;
        }
        if (!z2 || Math.abs(f2) <= this.LIZIZ) {
            return false;
        }
        return true;
    }

    public final int LJFF(int i, int i2, int i3) {
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
            if (iArr != null) {
                iArr[i] = iArr[i] | r23;
            }
            this.LJIILLIIL.getClass();
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
        float[] fArr9 = this.LJFF;
        if (fArr9 != null) {
            float[] fArr10 = this.LIZLLL;
            fArr9[i] = f;
            fArr10[i] = f;
            float[] fArr11 = this.LJ;
            this.LJI[i] = f2;
            fArr11[i] = f2;
        }
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
        View view = this.LJIIZILJ;
        if (view == null) {
            return false;
        }
        int left = view.getLeft();
        int top = this.LJIIZILJ.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.LJIILL.abortAnimation();
            LJIILIIL(0);
            return false;
        }
        int i7 = (int) this.LJIILIIL;
        int i8 = (int) this.LJIIL;
        int iAbs = Math.abs(i3);
        if (iAbs < i7) {
            i3 = 0;
        } else if (iAbs > i8) {
            if (i3 > 0) {
                i3 = i8;
            } else {
                i3 = -i8;
            }
        }
        int i9 = (int) this.LJIILIIL;
        int i10 = (int) this.LJIIL;
        int iAbs2 = Math.abs(i4);
        if (iAbs2 < i9) {
            i4 = 0;
        } else if (iAbs2 > i10) {
            if (i4 > 0) {
                i4 = i10;
            } else {
                i4 = -i10;
            }
        }
        int iAbs3 = Math.abs(i5);
        int iAbs4 = Math.abs(i6);
        int iAbs5 = Math.abs(i3);
        int iAbs6 = Math.abs(i4);
        int i11 = iAbs5 + iAbs6;
        int i12 = iAbs3 + iAbs4;
        if (i3 != 0) {
            f = iAbs5;
            f2 = i11;
        } else {
            f = iAbs3;
            f2 = i12;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = iAbs6;
            f4 = i11;
        } else {
            f3 = iAbs4;
            f4 = i12;
        }
        this.LJIILL.startScroll(left, top, i5, i6, (int) (((LJFF(i5, i3, this.LJIILLIIL.LIZ()) * f5) + (LJFF(i6, i4, this.LJIILLIIL.LIZIZ()) * (f3 / f4))) * LJIJJLI));
        LJIILIIL(2);
        return true;
    }
}
