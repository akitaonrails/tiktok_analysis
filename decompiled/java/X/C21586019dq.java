package X;

import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19dq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21586019dq {
    public static final InterpolatorC21586219ds LJJ = new Interpolator() { // from class: X.19ds
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public int LIZ;
    public int LIZIZ;
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
    public float LJIILIIL;
    public int LJIILJJIL;
    public final int LJIILL;
    public int LJIILLIIL;
    public final OverScroller LJIIZILJ;
    public final AbstractC21586119dr LJIJ;
    public View LJIJI;
    public boolean LJIJJ;
    public final ViewGroup LJIJJLI;
    public int LIZJ = -1;
    public final ARunnableS133S0100000_33 LJIL = new ARunnableS133S0100000_33(this, 96);

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

    public final boolean LJ() {
        int length = this.LIZLLL.length;
        for (int i = 0; i < length; i++) {
            if ((this.LJIIJ & (1 << i)) != 0) {
                float f = this.LJFF[i] - this.LIZLLL[i];
                float f2 = this.LJI[i] - this.LJ[i];
                float f3 = (f * f) + (f2 * f2);
                int i2 = this.LIZIZ;
                if (f3 > i2 * i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LJIIIIZZ() {
        if (this.LIZ == 2) {
            boolean zComputeScrollOffset = this.LJIIZILJ.computeScrollOffset();
            int currX = this.LJIIZILJ.getCurrX();
            int currY = this.LJIIZILJ.getCurrY();
            int left = currX - this.LJIJI.getLeft();
            int top = currY - this.LJIJI.getTop();
            if (left != 0) {
                this.LJIJI.offsetLeftAndRight(left);
            }
            if (top != 0) {
                this.LJIJI.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.LJIJ.onViewPositionChanged(this.LJIJI, currX, currY, left, top);
            }
            if (!zComputeScrollOffset) {
                this.LJIJJLI.post(this.LJIL);
            } else if (currX == this.LJIIZILJ.getFinalX() && currY == this.LJIIZILJ.getFinalY()) {
                this.LJIIZILJ.abortAnimation();
                this.LJIJJLI.post(this.LJIL);
            }
        }
        return this.LIZ == 2;
    }

    public final void LJIILJJIL() {
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
        this.LJIJJ = true;
        this.LJIJ.onViewReleased(this.LJIJI, xVelocity, f3);
        this.LJIJJ = false;
        if (this.LIZ == 1) {
            LJIJ(0);
        }
    }

    public final void LIZ() {
        LIZIZ();
        if (this.LIZ == 2) {
            int currX = this.LJIIZILJ.getCurrX();
            int currY = this.LJIIZILJ.getCurrY();
            this.LJIIZILJ.abortAnimation();
            int currX2 = this.LJIIZILJ.getCurrX();
            int currY2 = this.LJIIZILJ.getCurrY();
            this.LJIJ.onViewPositionChanged(this.LJIJI, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        LJIJ(0);
    }

    public final void LJI(int i) {
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

    public final void LJIILIIL(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            LIZIZ();
        }
        if (this.LJIIJJI == null) {
            this.LJIIJJI = VelocityTracker.obtain();
        }
        this.LJIIJJI.addMovement(motionEvent);
        int i = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.LIZ == 1 && pointerId == this.LIZJ) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i >= pointerCount) {
                                            break;
                                        }
                                        int pointerId2 = motionEvent.getPointerId(i);
                                        if (pointerId2 != this.LIZJ) {
                                            View viewLJIIJJI = LJIIJJI((int) motionEvent.getX(i), (int) motionEvent.getY(i));
                                            View view = this.LJIJI;
                                            if (viewLJIIJJI == view && LJIL(pointerId2, view)) {
                                                if (this.LIZJ == -1) {
                                                    break;
                                                }
                                            }
                                        }
                                        i++;
                                    }
                                    LJIILJJIL();
                                }
                                LJI(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        LJIILLIIL(x, y, pointerId3);
                        if (this.LIZ == 0) {
                            LJIL(pointerId3, LJIIJJI((int) x, (int) y));
                            int i2 = this.LJII[pointerId3] & this.LJIILLIIL;
                            if (i2 == 0) {
                                return;
                            }
                            this.LJIJ.onEdgeTouched(i2, pointerId3);
                            return;
                        }
                        int i3 = (int) x;
                        int i4 = (int) y;
                        View view2 = this.LJIJI;
                        if (view2 == null || i3 < view2.getLeft() || i3 >= view2.getRight() || i4 < view2.getTop() || i4 >= view2.getBottom()) {
                            return;
                        }
                        LJIL(pointerId3, this.LJIJI);
                        return;
                    }
                    if (this.LIZ == 1) {
                        this.LJIJJ = true;
                        this.LJIJ.onViewReleased(this.LJIJI, 0.0f, 0.0f);
                        this.LJIJJ = false;
                        if (this.LIZ == 1) {
                            LJIJ(0);
                        }
                    }
                    LIZIZ();
                    return;
                }
                if (this.LIZ == 1) {
                    int i5 = this.LIZJ;
                    if ((this.LJIIJ & (1 << i5)) == 0) {
                        return;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i5);
                    float x2 = motionEvent.getX(iFindPointerIndex);
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    float[] fArr = this.LJFF;
                    int i6 = this.LIZJ;
                    int i7 = (int) (x2 - fArr[i6]);
                    int i8 = (int) (y2 - this.LJI[i6]);
                    int left = this.LJIJI.getLeft() + i7;
                    int top = this.LJIJI.getTop() + i8;
                    int left2 = this.LJIJI.getLeft();
                    int top2 = this.LJIJI.getTop();
                    if (i7 != 0) {
                        left = this.LJIJ.clampViewPositionHorizontal(this.LJIJI, left, i7);
                        this.LJIJI.offsetLeftAndRight(left - left2);
                    }
                    if (i8 != 0) {
                        top = this.LJIJ.clampViewPositionVertical(this.LJIJI, top, i8);
                        this.LJIJI.offsetTopAndBottom(top - top2);
                    }
                    if (i7 != 0 || i8 != 0) {
                        this.LJIJ.onViewPositionChanged(this.LJIJI, left, top, left - left2, top - top2);
                    }
                    LJIIZILJ(motionEvent);
                    return;
                }
                int pointerCount2 = motionEvent.getPointerCount();
                for (int i9 = 0; i9 < pointerCount2; i9++) {
                    int pointerId4 = motionEvent.getPointerId(i9);
                    if ((this.LJIIJ & (1 << pointerId4)) != 0) {
                        float x3 = motionEvent.getX(i9);
                        float y3 = motionEvent.getY(i9);
                        float f = x3 - this.LIZLLL[pointerId4];
                        float f2 = y3 - this.LJ[pointerId4];
                        LJIILL(f, f2, pointerId4);
                        if (this.LIZ == 1) {
                            break;
                        }
                        View viewLJIIJJI2 = LJIIJJI((int) x3, (int) y3);
                        if (LJFF(f, f2, viewLJIIJJI2) && LJIL(pointerId4, viewLJIIJJI2)) {
                            break;
                        }
                    }
                }
                LJIIZILJ(motionEvent);
                return;
            }
            if (this.LIZ == 1) {
                LJIILJJIL();
            }
            LIZIZ();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View viewLJIIJJI3 = LJIIJJI((int) x4, (int) y4);
        LJIILLIIL(x4, y4, pointerId5);
        LJIL(pointerId5, viewLJIIJJI3);
        int i10 = this.LJII[pointerId5] & this.LJIILLIIL;
        if (i10 == 0) {
            return;
        }
        this.LJIJ.onEdgeTouched(i10, pointerId5);
    }

    public final void LJIIZILJ(MotionEvent motionEvent) {
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

    public final void LJIJ(int i) {
        this.LJIJJLI.removeCallbacks(this.LJIL);
        if (this.LIZ != i) {
            this.LIZ = i;
            this.LJIJ.onViewDragStateChanged(i);
            if (this.LIZ == 0) {
                this.LJIJI = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIJJ(android.view.MotionEvent r15) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21586019dq.LJIJJ(android.view.MotionEvent):boolean");
    }

    public static C21586019dq LJIIIZ(ViewGroup viewGroup, AbstractC21586119dr abstractC21586119dr) {
        return new C21586019dq(viewGroup.getContext(), viewGroup, abstractC21586119dr);
    }

    public static C21586019dq LJIIJ(ViewGroup viewGroup, AbstractC21586119dr abstractC21586119dr) {
        C21586019dq c21586019dqLJIIIZ = LJIIIZ(viewGroup, abstractC21586119dr);
        c21586019dqLJIIIZ.LIZIZ = (int) (c21586019dqLJIIIZ.LIZIZ * 1.0f);
        return c21586019dqLJIIIZ;
    }

    public final void LIZJ(int i, View view) {
        if (view.getParent() == this.LJIJJLI) {
            this.LJIJI = view;
            this.LIZJ = i;
            this.LJIJ.onViewCaptured(view, i);
            LJIJ(1);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        sbLIZ.append(this.LJIJJLI);
        sbLIZ.append(")");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final View LJIIJJI(int i, int i2) {
        for (int childCount = this.LJIJJLI.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.LJIJJLI;
            this.LJIJ.getOrderedChildIndex(childCount);
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean LJIJI(int i, int i2) {
        if (this.LJIJJ) {
            return LJIIL(i, i2, (int) this.LJIIJJI.getXVelocity(this.LIZJ), (int) this.LJIIJJI.getYVelocity(this.LIZJ));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final boolean LJIL(int i, View view) {
        if (view == this.LJIJI && this.LIZJ == i) {
            return true;
        }
        if (view != null && this.LJIJ.tryCaptureView(view, i)) {
            this.LIZJ = i;
            LIZJ(i, view);
            return true;
        }
        return false;
    }

    public C21586019dq(Context context, ViewGroup viewGroup, AbstractC21586119dr abstractC21586119dr) {
        if (viewGroup != null) {
            if (abstractC21586119dr != null) {
                this.LJIJJLI = viewGroup;
                this.LJIJ = abstractC21586119dr;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                int i = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.LJIILL = i;
                this.LJIILJJIL = i;
                this.LIZIZ = viewConfiguration.getScaledTouchSlop();
                this.LJIIL = viewConfiguration.getScaledMaximumFlingVelocity();
                this.LJIILIIL = viewConfiguration.getScaledMinimumFlingVelocity();
                this.LJIIZILJ = new OverScroller(context, LJJ);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final boolean LJFF(float f, float f2, View view) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        if (this.LJIJ.getViewHorizontalDragRange(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LJIJ.getViewVerticalDragRange(view) > 0) {
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

    public final int LJII(int i, int i2, int i3) {
        int iAbs;
        if (i == 0) {
            return 0;
        }
        int width = this.LJIJJLI.getWidth();
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
    /* JADX WARN: Type inference failed for: r0v9, types: [X.19dr] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJIILL(float f, float f2, int i) {
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
            this.LJIJ.onEdgeDragStarted(r23, i);
        }
    }

    public final void LJIILLIIL(float f, float f2, int i) {
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
        if (i4 < this.LJIJJLI.getLeft() + this.LJIILJJIL) {
            i2 = 1;
        }
        if (i5 < this.LJIJJLI.getTop() + this.LJIILJJIL) {
            i2 |= 4;
        }
        if (i4 > this.LJIJJLI.getRight() - this.LJIILJJIL) {
            i2 |= 2;
        }
        if (i5 > this.LJIJJLI.getBottom() - this.LJIILJJIL) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.LJIIJ |= 1 << i;
    }

    public final boolean LJIJJLI(int i, int i2, View view) {
        this.LJIJI = view;
        this.LIZJ = -1;
        boolean zLJIIL = LJIIL(i, i2, 0, 0);
        if (!zLJIIL && this.LIZ == 0 && this.LJIJI != null) {
            this.LJIJI = null;
        }
        return zLJIIL;
    }

    public final boolean LIZLLL(float f, float f2, int i, int i2) {
        float fAbs = Math.abs(f);
        float fAbs2 = Math.abs(f2);
        if ((this.LJII[i] & i2) == i2 && (this.LJIILLIIL & i2) != 0 && (this.LJIIIZ[i] & i2) != i2 && (this.LJIIIIZZ[i] & i2) != i2) {
            int i3 = this.LIZIZ;
            if (fAbs > i3 || fAbs2 > i3) {
                if (fAbs < fAbs2 * 0.5f && this.LJIJ.onEdgeLock(i2)) {
                    int[] iArr = this.LJIIIZ;
                    iArr[i] = iArr[i] | i2;
                    return false;
                }
                if ((this.LJIIIIZZ[i] & i2) == 0 && fAbs > this.LIZIZ) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean LJIIL(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int i5 = i3;
        int i6 = i4;
        int left = this.LJIJI.getLeft();
        int top = this.LJIJI.getTop();
        int i7 = i - left;
        int i8 = i2 - top;
        int i9 = 0;
        if (i7 == 0 && i8 == 0) {
            this.LJIIZILJ.abortAnimation();
            LJIJ(0);
            return false;
        }
        View view = this.LJIJI;
        int i10 = (int) this.LJIILIIL;
        int i11 = (int) this.LJIIL;
        int iAbs = Math.abs(i5);
        if (iAbs < i10) {
            i5 = 0;
        } else if (iAbs > i11) {
            if (i5 > 0) {
                i5 = i11;
            } else {
                i5 = -i11;
            }
        }
        int i12 = (int) this.LJIILIIL;
        int i13 = (int) this.LJIIL;
        int iAbs2 = Math.abs(i6);
        if (iAbs2 >= i12) {
            if (iAbs2 > i13) {
                if (i6 > 0) {
                    i6 = i13;
                } else {
                    i9 = -i13;
                    i6 = i9;
                }
            }
        } else {
            i6 = i9;
        }
        int iAbs3 = Math.abs(i7);
        int iAbs4 = Math.abs(i8);
        int iAbs5 = Math.abs(i5);
        int iAbs6 = Math.abs(i6);
        int i14 = iAbs5 + iAbs6;
        int i15 = iAbs3 + iAbs4;
        if (i5 != 0) {
            f = iAbs5;
            f2 = i14;
        } else {
            f = iAbs3;
            f2 = i15;
        }
        float f5 = f / f2;
        if (i6 != 0) {
            f3 = iAbs6;
            f4 = i14;
        } else {
            f3 = iAbs4;
            f4 = i15;
        }
        this.LJIIZILJ.startScroll(left, top, i7, i8, (int) ((LJII(i7, i5, this.LJIJ.getViewHorizontalDragRange(view)) * f5) + (LJII(i8, i6, this.LJIJ.getViewVerticalDragRange(view)) * (f3 / f4))));
        LJIJ(2);
        return true;
    }
}
