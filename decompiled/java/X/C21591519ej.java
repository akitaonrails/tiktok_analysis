package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.19ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21591519ej extends ViewGroup {
    public View LL;
    public View LLILLJJLI;
    public final Rect LLILLL;
    public final Rect LLILZ;
    public final Rect LLILZIL;
    public final Rect LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public int LLJJ;
    public int LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public C21586019dq LLJJIJIL;
    public C19290410dS LLJJJ;
    public InterfaceC21591819em LLJJJIL;
    public final C21591619ek LLJJJJ;
    public final C21591719el LLJJJJJIL;

    private final int getMainOpenLeft() {
        int i = this.LLJJI;
        if (i == 1) {
            return this.LLILLL.left + this.LLILLJJLI.getWidth();
        }
        if (i == 2) {
            return this.LLILLL.left - this.LLILLJJLI.getWidth();
        }
        if (i == 4 || i == 8) {
            return this.LLILLL.left;
        }
        return 0;
    }

    private final int getMainOpenTop() {
        int i = this.LLJJI;
        if (i == 1 || i == 2) {
            return this.LLILLL.top;
        }
        if (i == 4) {
            return this.LLILLL.top + this.LLILLJJLI.getHeight();
        }
        if (i != 8) {
            return 0;
        }
        return this.LLILLL.top - this.LLILLJJLI.getHeight();
    }

    private final int getSecOpenLeft() {
        int i;
        return (this.LLJILJILJ == 0 || (i = this.LLJJI) == 8 || i == 4) ? this.LLILZIL.left : i == 1 ? this.LLILZIL.left + this.LLILLJJLI.getWidth() : this.LLILZIL.left - this.LLILLJJLI.getWidth();
    }

    private final int getSecOpenTop() {
        int i;
        return (this.LLJILJILJ == 0 || (i = this.LLJJI) == 1 || i == 2) ? this.LLILZIL.top : i == 4 ? this.LLILZIL.top + this.LLILLJJLI.getHeight() : this.LLILZIL.top - this.LLILLJJLI.getHeight();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLJJIJIL.LJIIIIZZ()) {
            postInvalidateOnAnimation();
        }
    }

    public final int getClosestEdgeDistance() {
        int i = this.LLJJI;
        if (i == 1) {
            return Math.min(this.LL.getLeft() - this.LLILLL.left, (this.LLILLL.left + this.LLILLJJLI.getWidth()) - this.LL.getLeft());
        }
        if (i == 2) {
            return Math.min(this.LL.getRight() - (this.LLILLL.right - this.LLILLJJLI.getWidth()), this.LLILLL.right - this.LL.getRight());
        }
        if (i == 4) {
            int height = this.LLILLL.top + this.LLILLJJLI.getHeight();
            return Math.min(this.LL.getBottom() - height, height - this.LL.getTop());
        }
        if (i != 8) {
            return 0;
        }
        return Math.min(this.LLILLL.bottom - this.LL.getBottom(), this.LL.getBottom() - (this.LLILLL.bottom - this.LLILLJJLI.getHeight()));
    }

    public final int getHalfwayPivotHorizontal() {
        return this.LLJJI == 1 ? this.LLILLL.left + (this.LLILLJJLI.getWidth() / 2) : this.LLILLL.right - (this.LLILLJJLI.getWidth() / 2);
    }

    public final int getHalfwayPivotVertical() {
        return this.LLJJI == 4 ? this.LLILLL.top + (this.LLILLJJLI.getHeight() / 2) : this.LLILLL.bottom - (this.LLILLJJLI.getHeight() / 2);
    }

    public final int getDragEdge() {
        return this.LLJJI;
    }

    public final int getMinFlingVelocity() {
        return this.LLJIJIL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.19ek] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.19el] */
    public C21591519ej(final Context context) {
        new LinkedHashMap();
        super(context);
        this.LLILLL = new Rect();
        this.LLILZ = new Rect();
        this.LLILZIL = new Rect();
        this.LLILZLL = new Rect();
        this.LLJIJIL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLJILJILJ = 1;
        this.LLJJI = 1;
        this.LLJJIJI = -1.0f;
        this.LLJJIJIIJIL = -1.0f;
        this.LLJJJJ = new AbstractC21586119dr() { // from class: X.19ek
            @Override // X.AbstractC21586119dr
            public final void onViewDragStateChanged(int i) {
                super.onViewDragStateChanged(i);
                C21591519ej c21591519ej = this.LIZ;
                if (i != 0) {
                    if (i == 1) {
                        c21591519ej.LLJILJIL = 4;
                        return;
                    }
                    return;
                }
                int i2 = 0;
                if (c21591519ej.getDragEdge() == 1 || this.LIZ.getDragEdge() == 2 ? this.LIZ.LL.getLeft() != this.LIZ.LLILLL.left : this.LIZ.LL.getTop() != this.LIZ.LLILLL.top) {
                    i2 = 2;
                }
                c21591519ej.LLJILJIL = i2;
            }

            @Override // X.AbstractC21586119dr
            public final void onEdgeDragStarted(int i, int i2) {
                boolean z;
                boolean z2;
                boolean z3;
                super.onEdgeDragStarted(i, i2);
                if (this.LIZ.LLJI) {
                    return;
                }
                boolean z4 = false;
                if (this.LIZ.getDragEdge() == 2 && i == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.LIZ.getDragEdge() == 1 && i == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.LIZ.getDragEdge() == 8 && i == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (this.LIZ.getDragEdge() == 4 && i == 8) {
                    z4 = true;
                }
                if (z || z2 || z3 || z4) {
                    C21591519ej c21591519ej = this.LIZ;
                    c21591519ej.LLJJIJIL.LIZJ(i2, c21591519ej.LL);
                }
            }

            @Override // X.AbstractC21586119dr
            public final boolean tryCaptureView(View view, int i) {
                this.LIZ.getClass();
                if (this.LIZ.LLJI) {
                    return false;
                }
                C21591519ej c21591519ej = this.LIZ;
                c21591519ej.LLJJIJIL.LIZJ(i, c21591519ej.LL);
                return false;
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                int dragEdge = this.LIZ.getDragEdge();
                if (dragEdge != 1) {
                    if (dragEdge != 2) {
                        return view.getLeft();
                    }
                    int iMin = Math.min(i, this.LIZ.LLILLL.left);
                    C21591519ej c21591519ej = this.LIZ;
                    return Math.max(iMin, c21591519ej.LLILLL.left - c21591519ej.LLILLJJLI.getWidth());
                }
                C21591519ej c21591519ej2 = this.LIZ;
                return Math.max(Math.min(i, c21591519ej2.LLILLL.left + c21591519ej2.LLILLJJLI.getWidth()), this.LIZ.LLILLL.left);
            }

            @Override // X.AbstractC21586119dr
            public final int clampViewPositionVertical(View view, int i, int i2) {
                int dragEdge = this.LIZ.getDragEdge();
                if (dragEdge != 4) {
                    if (dragEdge != 8) {
                        return view.getTop();
                    }
                    int iMin = Math.min(i, this.LIZ.LLILLL.top);
                    C21591519ej c21591519ej = this.LIZ;
                    return Math.max(iMin, c21591519ej.LLILLL.top - c21591519ej.LLILLJJLI.getHeight());
                }
                C21591519ej c21591519ej2 = this.LIZ;
                return Math.max(Math.min(i, c21591519ej2.LLILLL.top + c21591519ej2.LLILLJJLI.getHeight()), this.LIZ.LLILLL.top);
            }

            @Override // X.AbstractC21586119dr
            public final void onViewReleased(View view, float f, float f2) {
                boolean z;
                boolean z2;
                boolean z3;
                int i = (int) f;
                boolean z4 = false;
                if (C0GTZ.LIZ(i, context) >= this.LIZ.getMinFlingVelocity()) {
                    z = true;
                } else {
                    z = false;
                }
                if (C0GTZ.LIZ(i, context) <= (-this.LIZ.getMinFlingVelocity())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i2 = (int) f2;
                if (C0GTZ.LIZ(i2, context) <= (-this.LIZ.getMinFlingVelocity())) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (C0GTZ.LIZ(i2, context) >= this.LIZ.getMinFlingVelocity()) {
                    z4 = true;
                }
                int halfwayPivotHorizontal = this.LIZ.getHalfwayPivotHorizontal();
                int halfwayPivotVertical = this.LIZ.getHalfwayPivotVertical();
                int dragEdge = this.LIZ.getDragEdge();
                if (dragEdge != 1) {
                    if (dragEdge != 2) {
                        if (dragEdge != 4) {
                            if (dragEdge == 8) {
                                if (z3) {
                                    this.LIZ.LIZJ(true);
                                    return;
                                }
                                if (z4) {
                                    this.LIZ.LIZIZ(true);
                                    return;
                                } else if (this.LIZ.LL.getBottom() < halfwayPivotVertical) {
                                    this.LIZ.LIZJ(true);
                                    return;
                                } else {
                                    this.LIZ.LIZIZ(true);
                                    return;
                                }
                            }
                            return;
                        }
                        if (z3) {
                            this.LIZ.LIZIZ(true);
                            return;
                        }
                        if (z4) {
                            this.LIZ.LIZJ(true);
                            return;
                        } else if (this.LIZ.LL.getTop() < halfwayPivotVertical) {
                            this.LIZ.LIZIZ(true);
                            return;
                        } else {
                            this.LIZ.LIZJ(true);
                            return;
                        }
                    }
                    if (z) {
                        this.LIZ.LIZIZ(true);
                        return;
                    }
                    if (z2) {
                        this.LIZ.LIZJ(true);
                        return;
                    } else if (this.LIZ.LL.getRight() < halfwayPivotHorizontal) {
                        this.LIZ.LIZJ(true);
                        return;
                    } else {
                        this.LIZ.LIZIZ(true);
                        return;
                    }
                }
                if (z) {
                    this.LIZ.LIZJ(true);
                    return;
                }
                if (z2) {
                    this.LIZ.LIZIZ(true);
                } else if (this.LIZ.LL.getLeft() < halfwayPivotHorizontal) {
                    this.LIZ.LIZIZ(true);
                } else {
                    this.LIZ.LIZJ(true);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
            @Override // X.AbstractC21586119dr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onViewPositionChanged(android.view.View r6, int r7, int r8, int r9, int r10) {
                /*
                    Method dump skipped, instruction units count: 256
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21591619ek.onViewPositionChanged(android.view.View, int, int, int, int):void");
            }
        };
        this.LLJJJJJIL = new GestureDetector.SimpleOnGestureListener() { // from class: X.19el
            public boolean LL;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                this.LLILLJJLI.LLJ = false;
                this.LL = false;
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                this.LLILLJJLI.LLJ = true;
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z;
                boolean z2 = true;
                this.LLILLJJLI.LLJ = true;
                if (this.LLILLJJLI.getParent() != null) {
                    if (!this.LL) {
                        if (this.LLILLJJLI.getClosestEdgeDistance() >= this.LLILLJJLI.LLIZ) {
                            z = true;
                            this.LL = true;
                        } else {
                            z = false;
                        }
                        z2 = z;
                    }
                    this.LLILLJJLI.getParent().requestDisallowInterceptTouchEvent(z2);
                }
                return false;
            }
        };
    }

    public final void LIZ(View view) {
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view2);
            removeView(view2);
        }
        this.LLILLJJLI = view;
        addView(view, 0);
    }

    public final void LIZIZ(boolean z) {
        this.LLIZLLLIL = false;
        if (z) {
            this.LLJILJIL = 1;
            C21586019dq c21586019dq = this.LLJJIJIL;
            View view = this.LL;
            Rect rect = this.LLILLL;
            c21586019dq.LJIJJLI(rect.left, rect.top, view);
        } else {
            this.LLJILJIL = 0;
            this.LLJJIJIL.LIZ();
            View view2 = this.LL;
            Rect rect2 = this.LLILLL;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            View view3 = this.LLILLJJLI;
            Rect rect3 = this.LLILZIL;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        postInvalidateOnAnimation();
    }

    public final void LIZJ(boolean z) {
        this.LLIZLLLIL = true;
        if (z) {
            this.LLJILJIL = 3;
            C21586019dq c21586019dq = this.LLJJIJIL;
            View view = this.LL;
            Rect rect = this.LLILZ;
            c21586019dq.LJIJJLI(rect.left, rect.top, view);
        } else {
            this.LLJILJIL = 2;
            this.LLJJIJIL.LIZ();
            View view2 = this.LL;
            Rect rect2 = this.LLILZ;
            view2.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
            View view3 = this.LLILLJJLI;
            Rect rect3 = this.LLILZLL;
            view3.layout(rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.LLJI
            if (r0 == 0) goto L9
            boolean r0 = super.onInterceptTouchEvent(r6)
            return r0
        L9:
            X.19dq r0 = r5.LLJJIJIL
            r0.LJIILIIL(r6)
            X.10dS r0 = r5.LLJJJ
            r0.LIZ(r6)
            int r0 = r6.getAction()
            r2 = 2
            r4 = 0
            r1 = 1
            if (r0 != 0) goto L90
            r0 = 0
            r5.LLJJIII = r0
        L1f:
            float r3 = r6.getX()
            float r1 = r6.getY()
            android.view.View r0 = r5.LL
            int r0 = r0.getTop()
            float r0 = (float) r0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L8e
            android.view.View r0 = r5.LL
            int r0 = r0.getBottom()
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L8e
            r1 = 1
        L3e:
            android.view.View r0 = r5.LL
            int r0 = r0.getLeft()
            float r0 = (float) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L8c
            android.view.View r0 = r5.LL
            int r0 = r0.getRight()
            float r0 = (float) r0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L8c
            r0 = 1
        L55:
            if (r1 == 0) goto L8a
            if (r0 == 0) goto L8a
            X.19dq r0 = r5.LLJJIJIL
            int r0 = r0.LIZIZ
            float r1 = (float) r0
            float r0 = r5.LLJJIII
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8a
            r3 = 1
        L65:
            X.19dq r0 = r5.LLJJIJIL
            int r0 = r0.LIZ
            if (r0 != r2) goto L81
            r2 = 1
        L6c:
            r1 = 0
        L6d:
            float r0 = r6.getX()
            r5.LLJJIJI = r0
            float r0 = r6.getY()
            r5.LLJJIJIIJIL = r0
            if (r3 != 0) goto L80
            if (r2 != 0) goto L7f
            if (r1 == 0) goto L80
        L7f:
            r4 = 1
        L80:
            return r4
        L81:
            r2 = 0
            if (r0 != 0) goto L6c
            boolean r0 = r5.LLJ
            if (r0 == 0) goto L6c
            r1 = 1
            goto L6d
        L8a:
            r3 = 0
            goto L65
        L8c:
            r0 = 0
            goto L55
        L8e:
            r1 = 0
            goto L3e
        L90:
            int r0 = r5.LLJJI
            if (r0 == r1) goto La8
            if (r0 == r2) goto La8
            float r1 = r6.getY()
            float r0 = r5.LLJJIJIIJIL
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
        La1:
            float r0 = r5.LLJJIII
            float r0 = r0 + r1
            r5.LLJJIII = r0
            goto L1f
        La8:
            float r1 = r6.getX()
            float r0 = r5.LLJJIJI
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            goto La1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21591519ej.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LLJJJ.LIZ(motionEvent);
        this.LLJJIJIL.LJIILIIL(motionEvent);
        return true;
    }

    public final void setDragEdge(int i) {
        this.LLJJI = i;
    }

    public final void setLockDrag(boolean z) {
        this.LLJI = z;
    }

    public final void setMinFlingVelocity(int i) {
        this.LLJIJIL = i;
    }

    public final void setMode$x_element_reveal_view_release(int i) {
        this.LLJILJILJ = i;
    }

    public final void setSwipeListener(InterfaceC21591819em interfaceC21591819em) {
        this.LLJJJIL = interfaceC21591819em;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (getChildCount() >= 2) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int childCount = getChildCount();
            int iMax = 0;
            int iMax2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                measureChild(childAt, i, i2);
                iMax = Math.max(childAt.getMeasuredWidth(), iMax);
                iMax2 = Math.max(childAt.getMeasuredHeight(), iMax2);
            }
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, mode);
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, mode2);
            int size = View.MeasureSpec.getSize(iMakeMeasureSpec);
            int size2 = View.MeasureSpec.getSize(iMakeMeasureSpec2);
            int childCount2 = getChildCount();
            for (int i4 = 0; i4 < childCount2; i4++) {
                View childAt2 = getChildAt(i4);
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 != null) {
                    if (layoutParams2.height == -1) {
                        childAt2.setMinimumHeight(size2);
                    }
                    if (layoutParams2.width == -1) {
                        childAt2.setMinimumWidth(size);
                    }
                }
                measureChild(childAt2, iMakeMeasureSpec, iMakeMeasureSpec2);
                iMax = Math.max(childAt2.getMeasuredWidth(), iMax);
                iMax2 = Math.max(childAt2.getMeasuredHeight(), iMax2);
            }
            int paddingLeft = iMax + getPaddingLeft() + getPaddingRight();
            int paddingTop = iMax2 + getPaddingTop() + getPaddingBottom();
            if (mode != 1073741824) {
                if (layoutParams.width == -1) {
                    paddingLeft = size;
                }
                if (mode == Integer.MIN_VALUE) {
                    size = Math.min(paddingLeft, size);
                } else {
                    size = paddingLeft;
                }
            }
            if (mode2 != 1073741824) {
                if (layoutParams.height == -1) {
                    paddingTop = size2;
                }
                if (mode2 == Integer.MIN_VALUE) {
                    size2 = Math.min(paddingTop, size2);
                } else {
                    size2 = paddingTop;
                }
            }
            setMeasuredDimension(size, size2);
            return;
        }
        throw new RuntimeException("Layout must have two children");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21591519ej.onLayout(boolean, int, int, int, int):void");
    }
}
