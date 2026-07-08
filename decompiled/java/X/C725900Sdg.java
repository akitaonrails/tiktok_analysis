package X;

import Y.ARunnableS111S0100000_11;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0Sdg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C725900Sdg extends FrameLayout {
    public final int LL;
    public final float LLILLJJLI;
    public final float LLILLL;
    public final OverScroller LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public long LLIZLLLIL;
    public int LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public int LLJILJILJ;
    public final int[] LLJILLL;
    public final int[] LLJJ;
    public C16GX LLJJI;
    public C16G0 LLJJIII;
    public AppBarLayout$Behavior LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public VelocityTracker LLJJJ;
    public boolean LLJJJIL;
    public final ARunnableS111S0100000_11 LLJJJJ;

    public final boolean LIZIZ() {
        C16BC c16bc;
        C16GX c16gx;
        AppBarLayout$Behavior appBarLayout$Behavior;
        C16G1 c16g1;
        if (this.LLJJI != null && this.LLJJIII != null && this.LLJJIJI != null) {
            return true;
        }
        ViewParent parent = getParent();
        while (true) {
            c16bc = null;
            if (parent == null) {
                c16gx = null;
                break;
            }
            if (parent instanceof C16GX) {
                c16gx = (C16GX) parent;
                break;
            }
            parent = parent.getParent();
        }
        if (c16gx == null) {
            return false;
        }
        ViewParent parent2 = c16gx.getParent();
        while (true) {
            if (parent2 == null) {
                break;
            }
            if (parent2 instanceof C16G0) {
                C16G0 c16g0 = (C16G0) parent2;
                if (c16g0 != null) {
                    ViewGroup.LayoutParams layoutParams = c16gx.getLayoutParams();
                    if ((layoutParams instanceof C16G1) && (c16g1 = (C16G1) layoutParams) != null) {
                        c16bc = c16g1.LIZ;
                    }
                    if (!(c16bc instanceof AppBarLayout$Behavior) || (appBarLayout$Behavior = (AppBarLayout$Behavior) c16bc) == null) {
                        return false;
                    }
                    this.LLJJI = c16gx;
                    this.LLJJIII = c16g0;
                    this.LLJJIJI = appBarLayout$Behavior;
                    return true;
                }
            } else {
                parent2 = parent2.getParent();
            }
        }
        return false;
    }

    public final View LIZJ() {
        C16G1 c16g1;
        C16G0 c16g0 = this.LLJJIII;
        if (c16g0 == null) {
            return null;
        }
        C16GX c16gx = this.LLJJI;
        int childCount = c16g0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = c16g0.getChildAt(i);
            if (childAt != c16gx) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (((!(layoutParams instanceof C16G1) || (c16g1 = (C16G1) layoutParams) == null) ? null : c16g1.LIZ) instanceof AppBarLayout$ScrollingViewBehavior) {
                    return childAt;
                }
            }
        }
        return null;
    }

    public final void LJ() {
        if (this.LLJIJIL) {
            C16GX c16gx = this.LLJJI;
            C16G0 c16g0 = this.LLJJIII;
            AppBarLayout$Behavior appBarLayout$Behavior = this.LLJJIJI;
            if (c16gx != null && c16g0 != null && appBarLayout$Behavior != null) {
                View view = this.LLJJIJIIJIL;
                if (view == null) {
                    view = this;
                }
                appBarLayout$Behavior.onStopNestedScroll(c16g0, c16gx, view, 0);
            }
        }
        this.LLJI = false;
        this.LLJIJIL = false;
        this.LLJJIJIIJIL = null;
    }

    public final void LJI() {
        C16GX c16gx;
        C16G0 c16g0;
        AppBarLayout$Behavior appBarLayout$Behavior;
        if (this.LLJIJIL || !LIZIZ() || (c16gx = this.LLJJI) == null || (c16g0 = this.LLJJIII) == null || (appBarLayout$Behavior = this.LLJJIJI) == null) {
            return;
        }
        View viewLIZJ = LIZJ();
        if (viewLIZJ == null) {
            viewLIZJ = this;
        }
        if (appBarLayout$Behavior.onStartNestedScroll(c16g0, c16gx, viewLIZJ, viewLIZJ, 2, 0)) {
            this.LLJIJIL = true;
            this.LLJJIJIIJIL = viewLIZJ;
            appBarLayout$Behavior.onNestedScrollAccepted(c16g0, c16gx, viewLIZJ, viewLIZJ, 2, 0);
        }
    }

    public final void LJIIIIZZ() {
        if (this.LLJILJIL) {
            C16GX c16gx = this.LLJJI;
            C16G0 c16g0 = this.LLJJIII;
            AppBarLayout$Behavior appBarLayout$Behavior = this.LLJJIJI;
            if (c16gx != null && c16g0 != null && appBarLayout$Behavior != null) {
                View view = this.LLJJIJIL;
                if (view == null && (view = this.LLJJIJIIJIL) == null) {
                    view = this;
                }
                appBarLayout$Behavior.onStopNestedScroll(c16g0, c16gx, view, 1);
            }
        }
        this.LLJILJIL = false;
        this.LLJJIJIL = null;
    }

    public final void LJIIIZ() {
        if (!this.LLILZ.isFinished()) {
            this.LLILZ.abortAnimation();
        }
        HandlerHook.viewRemoveCallbacks(this, this.LLJJJJ);
        this.LLJILJILJ = 0;
        LJIIIIZZ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:15:0x002a, B:17:0x0032, B:19:0x003a, B:20:0x003e, B:22:0x0042, B:39:0x007c, B:41:0x0080, B:43:0x008c, B:25:0x004b, B:31:0x005d, B:33:0x0061, B:35:0x006d, B:28:0x0054, B:36:0x0073, B:44:0x0091, B:45:0x0094), top: B:76:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:15:0x002a, B:17:0x0032, B:19:0x003a, B:20:0x003e, B:22:0x0042, B:39:0x007c, B:41:0x0080, B:43:0x008c, B:25:0x004b, B:31:0x005d, B:33:0x0061, B:35:0x006d, B:28:0x0054, B:36:0x0073, B:44:0x0091, B:45:0x0094), top: B:76:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C725900Sdg.LIZLLL():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        VelocityTracker velocityTracker = this.LLJJJ;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LLJJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
    }

    public final void LJFF(MotionEvent motionEvent) {
        this.LLILZIL = motionEvent.getX();
        this.LLILZLL = motionEvent.getY();
        this.LLIZ = motionEvent.getRawY();
        this.LLIZLLLIL = motionEvent.getEventTime();
        this.LLJ = 0;
        this.LLJI = false;
        this.LLJIJIL = false;
    }

    public final void LJII(MotionEvent motionEvent) {
        float yVelocity;
        int i;
        C16GX c16gx;
        AppBarLayout$Behavior appBarLayout$Behavior;
        C16GX c16gx2;
        C16G0 c16g0;
        AppBarLayout$Behavior appBarLayout$Behavior2;
        VelocityTracker velocityTracker = this.LLJJJ;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLILLL);
        }
        if (velocityTracker != null) {
            yVelocity = velocityTracker.getYVelocity();
        } else {
            yVelocity = 0.0f;
        }
        float f = -yVelocity;
        long eventTime = motionEvent.getEventTime() - this.LLIZLLLIL;
        if (eventTime < 1) {
            eventTime = 1;
        }
        int i2 = this.LLJ;
        float f2 = (i2 * 1000.0f) / eventTime;
        int i3 = this.LL;
        if (i2 > i3 || (i2 >= (-i3) && f >= 0.0f)) {
            i = 1;
        } else {
            i = -1;
        }
        float fMax = Math.max(Math.abs(f), Math.abs(f2)) * i;
        float f3 = this.LLILLL;
        float fLIZLLL = C13LZ.LIZLLL(fMax, -f3, f3);
        if (Math.abs(fLIZLLL) < this.LLILLJJLI || !LIZIZ() || (c16gx = this.LLJJI) == null || (appBarLayout$Behavior = this.LLJJIJI) == null) {
            return;
        }
        int topAndBottomOffset = appBarLayout$Behavior.getTopAndBottomOffset();
        int totalScrollRange = c16gx.getTotalScrollRange() + topAndBottomOffset;
        if (fLIZLLL <= 0.0f || totalScrollRange > 0) {
            if (fLIZLLL < 0.0f && topAndBottomOffset >= 0) {
                return;
            }
            LJIIIZ();
            if (!this.LLJILJIL) {
                if (LIZIZ() && (c16gx2 = this.LLJJI) != null && (c16g0 = this.LLJJIII) != null && (appBarLayout$Behavior2 = this.LLJJIJI) != null) {
                    View viewLIZJ = LIZJ();
                    if (viewLIZJ == null) {
                        viewLIZJ = this;
                    }
                    if (appBarLayout$Behavior2.onStartNestedScroll(c16g0, c16gx2, viewLIZJ, viewLIZJ, 2, 1)) {
                        this.LLJILJIL = true;
                        this.LLJJIJIL = viewLIZJ;
                        appBarLayout$Behavior2.onNestedScrollAccepted(c16g0, c16gx2, viewLIZJ, viewLIZJ, 2, 1);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.LLJILJILJ = 0;
            this.LLILZ.fling(0, 0, 0, C814420VxA.LIZIZ(fLIZLLL), 0, 0, topAndBottomOffset, totalScrollRange);
            if (!this.LLILZ.computeScrollOffset()) {
                LJIIIIZZ();
            } else {
                postOnAnimation(this.LLJJJJ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C725900Sdg.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = X.C2552209zM.LIZ
            boolean r0 = X.C2552209zM.LIZ
            if (r0 != 0) goto Lb
            boolean r0 = super.onInterceptTouchEvent(r5)
            return r0
        Lb:
            int r3 = r5.getActionMasked()
            r1 = 0
            if (r3 == 0) goto L69
            r2 = 1
            if (r3 == r2) goto L60
            r0 = 2
            if (r3 == r0) goto L20
            r0 = 3
            if (r3 == r0) goto L60
        L1b:
            boolean r0 = super.onInterceptTouchEvent(r5)
            return r0
        L20:
            float r1 = r5.getX()
            float r0 = r4.LLILZIL
            float r1 = r1 - r0
            float r3 = java.lang.Math.abs(r1)
            float r1 = r5.getY()
            float r0 = r4.LLILZLL
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            int r0 = r4.LL
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1b
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1b
            r4.LLJI = r2
            float r1 = r4.LLIZ
            float r0 = r5.getRawY()
            float r1 = r1 - r0
            int r0 = X.C814420VxA.LIZIZ(r1)
            r4.LLJ = r0
            long r0 = r5.getEventTime()
            r4.LLIZLLLIL = r0
            float r0 = r5.getRawY()
            r4.LLIZ = r0
            r4.LJI()
            return r2
        L60:
            boolean r0 = r4.LLJJJIL
            if (r0 == 0) goto L65
            return r1
        L65:
            r4.LJ()
            goto L1b
        L69:
            r4.LJFF(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C725900Sdg.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0020, code lost:
    
        if (r1 != 3) goto L16;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = X.C2552209zM.LIZ
            if (r0 != 0) goto L9
            boolean r0 = super.onTouchEvent(r6)
            return r0
        L9:
            boolean r0 = r5.LLJJJIL
            r4 = 0
            r3 = 3
            if (r0 == 0) goto L16
            int r0 = r6.getActionMasked()
            if (r0 != r3) goto L16
            return r4
        L16:
            int r1 = r6.getActionMasked()
            r2 = 1
            if (r1 == r2) goto L4c
            r0 = 2
            if (r1 == r0) goto L2e
            if (r1 == r3) goto L4c
        L22:
            boolean r0 = r5.LLJI
            if (r0 != 0) goto L2c
            boolean r0 = super.onTouchEvent(r6)
            if (r0 == 0) goto L2d
        L2c:
            r4 = 1
        L2d:
            return r4
        L2e:
            boolean r0 = r5.LLJI
            if (r0 == 0) goto L22
            float r1 = r5.LLIZ
            float r0 = r6.getRawY()
            float r1 = r1 - r0
            int r1 = X.C814420VxA.LIZIZ(r1)
            float r0 = r6.getRawY()
            r5.LLIZ = r0
            int r0 = r5.LLJ
            int r0 = r0 + r1
            r5.LLJ = r0
            r5.LIZ(r1, r4)
            return r2
        L4c:
            int r0 = r6.getActionMasked()
            if (r0 != r2) goto L59
            r5.LJII(r6)
        L55:
            r5.LJ()
            return r2
        L59:
            r5.LIZLLL()
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C725900Sdg.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        boolean z2 = C2552209zM.LIZ;
        if (!C2552209zM.LIZ) {
            super.requestDisallowInterceptTouchEvent(z);
        } else {
            super.requestDisallowInterceptTouchEvent(false);
        }
    }

    public C725900Sdg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLILLJJLI = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
        this.LLILLL = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.LLILZ = new OverScroller(context);
        this.LLJILLL = new int[2];
        this.LLJJ = new int[2];
        this.LLJJJJ = new ARunnableS111S0100000_11(this, 130);
    }

    public final int LIZ(int i, int i2) {
        C16G0 c16g0;
        AppBarLayout$Behavior appBarLayout$Behavior;
        View view;
        if (i == 0) {
            return 0;
        }
        if (i2 == 0 && !this.LLJIJIL) {
            LJI();
        }
        C16GX c16gx = this.LLJJI;
        if (c16gx == null || (c16g0 = this.LLJJIII) == null || (appBarLayout$Behavior = this.LLJJIJI) == null) {
            return 0;
        }
        int[] iArr = this.LLJILLL;
        iArr[0] = 0;
        iArr[1] = 0;
        if (i2 != 0 ? !((view = this.LLJJIJIL) != null || (view = this.LLJJIJIIJIL) != null) : (view = this.LLJJIJIIJIL) == null) {
            view = this;
        }
        appBarLayout$Behavior.onNestedPreScroll(c16g0, c16gx, view, 0, i, iArr, i2);
        int i3 = this.LLJILLL[1];
        int i4 = i - i3;
        if (i4 < 0) {
            int[] iArr2 = this.LLJJ;
            iArr2[0] = 0;
            iArr2[1] = 0;
            appBarLayout$Behavior.onNestedScroll(c16g0, c16gx, view, 0, i3, 0, i4, i2, iArr2);
            return i3 + this.LLJJ[1];
        }
        return i3;
    }
}
