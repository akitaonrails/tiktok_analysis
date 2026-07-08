package X;

import android.content.Context;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.19h9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21606519h9 extends ViewGroup {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final Scroller LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public int LLJJJIL;
    public InterfaceC21576019cE LLJJJJ;
    public final int LLJJJJJIL;
    public final int LLJJJJLIIL;
    public final float LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public int LLJLL;
    public int LLJLLIL;
    public final int LLJLLL;
    public float LLJZ;
    public float LLJZIJLIL;
    public float LLL;
    public float LLLF;
    public InterfaceC21607119hF LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public int LLLIIIIL;
    public int LLLIIIL;
    public int LLLIIL;
    public final List<InterfaceC21606819hC> LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public boolean LLLJ;
    public int LLLJIL;
    public float LLLJL;
    public float LLLL;
    public int LLLLII;
    public final GestureDetector LLLLIIIILLL;

    public final void LJIJ() {
        if (getChildCount() < 1) {
            return;
        }
        View currentView = getCurrentView();
        int scrollDistance = getScrollDistance();
        int iLJIIIIZZ = LJIIIIZZ(currentView) - scrollDistance;
        int bottom = (LJIIJJI() ? currentView.getBottom() : currentView.getRight()) - scrollDistance;
        if (LJ() && ((C21606919hD) currentView.getLayoutParams()).LIZ == 0) {
            int pile = getPile();
            if (LJIIJJI()) {
                this.LLJ.startScroll(0, scrollDistance, 0, (bottom + this.LLLIIIIL) - pile, this.LLLJIL);
            } else if (this.LLJJ) {
                this.LLJ.startScroll(scrollDistance, 0, (iLJIIIIZZ - this.LLLIIIIL) - (getPile() + getChildExpectSize()), 0, this.LLLJIL);
            } else {
                this.LLJ.startScroll(scrollDistance, 0, (bottom + this.LLLIIIIL) - pile, 0, this.LLLJIL);
            }
        } else if (LJFF() && ((C21606919hD) currentView.getLayoutParams()).LIZ == this.LLILZIL - 1) {
            int pile2 = getPile() + getChildExpectSize();
            if (LJIIJJI()) {
                this.LLJ.startScroll(0, scrollDistance, 0, (iLJIIIIZZ - this.LLLIIIIL) - pile2, this.LLLJIL);
            } else if (this.LLJJ) {
                this.LLJ.startScroll(scrollDistance, 0, (bottom + this.LLLIIIIL) - getPile(), 0, this.LLLJIL);
            } else {
                this.LLJ.startScroll(scrollDistance, 0, (iLJIIIIZZ - this.LLLIIIIL) - pile2, 0, this.LLLJIL);
            }
        } else {
            int pile3 = getPile() + (getChildExpectSize() / 2);
            int i = (iLJIIIIZZ + bottom) / 2;
            if (LJIIJJI()) {
                this.LLJ.startScroll(0, scrollDistance, 0, i - pile3, this.LLJJIJIL);
            } else {
                this.LLJ.startScroll(scrollDistance, 0, i - pile3, 0, this.LLJJIJIL);
            }
        }
        setScrollState(2);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        setScrollState(0);
        Scroller scroller = this.LLJ;
        if (scroller != null && !scroller.isFinished()) {
            this.LLJ.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final void LIZLLL() {
        if (this.LLLFF == null || this.LLILZIL <= 0) {
            return;
        }
        boolean z = false;
        boolean z2 = this.LLILLJJLI || this.LLILLL || this.LLILZ;
        if (!this.LLLIZZ || z2) {
            LJIJJ(this.LLLFZ, z2);
            int i = this.LLIZLLLIL;
            if (i == -1 || i == this.LLILZLL) {
                i = this.LLILZLL;
                if (i == -1) {
                    return;
                }
            } else {
                z = this.LL;
            }
            if (i < 0 || i >= this.LLILZIL) {
                return;
            }
            LJIJI(i, 1, z);
        }
    }

    public final boolean LJ() {
        if (!this.LLLIL || this.LLJILLL || this.LLJIJIL) {
            return false;
        }
        float f = this.LLLJL;
        if (f <= 0.0f || f >= 1.0f || this.LLLFF == null) {
            return false;
        }
        if (this.LLLL < 0.0f) {
            if (this.LLILZIL < 2) {
                return false;
            }
        } else if (this.LLILZIL < 3) {
            return false;
        }
        return (this.LLILZ || this.LLILLJJLI || this.LLILLL) ? false : true;
    }

    public final boolean LJFF() {
        if (!this.LLLIL || this.LLJILLL || this.LLJIJIL) {
            return false;
        }
        float f = this.LLLL;
        if (f <= 0.0f || f >= 1.0f || this.LLLFF == null) {
            return false;
        }
        if (this.LLLJL < 0.0f) {
            if (this.LLILZIL < 2) {
                return false;
            }
        } else if (this.LLILZIL < 3) {
            return false;
        }
        return (this.LLILZ || this.LLILLJJLI || this.LLILLL) ? false : true;
    }

    public final boolean LJIIJ() {
        return this.LLJJ && this.LLJJJ == 0;
    }

    public final boolean LJIIJJI() {
        return this.LLJJJ == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    public final void LJIILLIIL() {
        int childExpectSize;
        int i;
        int i2;
        int width;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.LLILZIL >= 1 && (childExpectSize = getChildExpectSize()) > 0) {
            int scrollDistance = getScrollDistance();
            int i7 = this.LLLIIIIL + childExpectSize;
            if (i7 <= 0) {
                return;
            }
            int i8 = scrollDistance / i7;
            int i9 = scrollDistance % i7;
            if (LJIIJ()) {
                if (this.LLJILLL) {
                    if (scrollDistance > 0) {
                        i8 = i9 != 0 ? i8 + 1 : i8 % this.LLILZIL;
                        width = ((getWidth() + scrollDistance) - i9) + (i9 == 0 ? 0 : this.LLLIIIIL + childExpectSize);
                    } else {
                        width = (getWidth() + scrollDistance) - i9;
                    }
                    int i10 = this.LLILZIL;
                    i = (i10 - i8) % i10;
                    if (i < 0) {
                        i += i10;
                    }
                } else {
                    int paddingRight = getPaddingRight() - this.LLLFZ;
                    i = 0;
                    while (true) {
                        if (i >= this.LLILZIL - 1) {
                            i = 0;
                            break;
                        }
                        int i11 = i + 1;
                        if (scrollDistance < ((this.LLLIIL - paddingRight) + getWidth()) - (i11 * i7)) {
                            break;
                        } else {
                            i = i11;
                        }
                    }
                    width = ((this.LLLIIL - paddingRight) + getWidth()) - (i7 * i);
                }
                i2 = 0;
            } else {
                if (!this.LLJILLL) {
                    int paddingLeft = getPaddingLeft() + this.LLLFZ;
                    i = 0;
                    while (true) {
                        if (i >= this.LLILZIL) {
                            i = 0;
                            break;
                        }
                        int i12 = i + 1;
                        if (scrollDistance < this.LLLIIIL + paddingLeft + (i12 * i7)) {
                            break;
                        } else {
                            i = i12;
                        }
                    }
                    i2 = this.LLLIIIL + paddingLeft + (i7 * i);
                } else if (scrollDistance < 0) {
                    if (i9 != 0) {
                        i8--;
                    }
                    int i13 = this.LLILZIL;
                    i = ((i8 % i13) + i13) % i13;
                    i2 = ((scrollDistance - (i9 == 0 ? -this.LLLIIIIL : childExpectSize)) - i9) - this.LLLIIIIL;
                } else {
                    i = i8 % this.LLILZIL;
                    i2 = scrollDistance - i9;
                }
                width = 0;
            }
            int iMax = Math.max(0, getPageGap()) + scrollDistance;
            ?? arrayList = new ArrayList();
            if (!this.LLJJI) {
                arrayList = getAllChildren();
                while (true) {
                    View viewLJIIIZ = LJIIIZ(i);
                    arrayList.remove(viewLJIIIZ);
                    if (LJIIJ()) {
                        i2 = width - childExpectSize;
                    } else {
                        width = i2 + childExpectSize;
                    }
                    LJIILL(viewLJIIIZ, i2, width);
                    LJIJJLI();
                    if (!LJIIJ()) {
                        if (width >= iMax) {
                            break;
                        }
                        i2 = this.LLLIIIIL + width;
                        i5 = i + 1;
                        i6 = this.LLILZIL;
                        if (i5 < i6) {
                        }
                        i = i5 % i6;
                    } else {
                        if (i2 <= scrollDistance) {
                            break;
                        }
                        width = i2 - this.LLLIIIIL;
                        i5 = i + 1;
                        i6 = this.LLILZIL;
                        if (i5 < i6 && !this.LLJILLL) {
                            break;
                        } else {
                            i = i5 % i6;
                        }
                    }
                }
            } else {
                if (this.LLJILLL) {
                    int i14 = i;
                    do {
                        View viewLJIIIZ2 = LJIIIZ(i14);
                        if (LJIIJ()) {
                            i2 = width - childExpectSize;
                        } else {
                            width = i2 + childExpectSize;
                        }
                        if ((LJIIJ() && width <= scrollDistance) || (!LJIIJ() && i2 >= iMax)) {
                            arrayList.add(viewLJIIIZ2);
                        }
                        LJIILL(viewLJIIIZ2, i2, width);
                        if (LJIIJ()) {
                            width = i2 - this.LLLIIIIL;
                        } else {
                            i2 = this.LLLIIIIL + width;
                        }
                        i14 = (i14 + 1) % this.LLILZIL;
                    } while (i14 != i);
                } else {
                    int i15 = i2;
                    int i16 = width;
                    for (int i17 = i - 1; i17 >= 0; i17--) {
                        View viewLJIIIZ3 = LJIIIZ(i17);
                        if (LJIIJ()) {
                            i4 = i16 + this.LLLIIIIL;
                            i3 = i4 + childExpectSize;
                        } else {
                            i3 = i15 - this.LLLIIIIL;
                            i4 = i3 - childExpectSize;
                        }
                        i15 = i4;
                        i16 = i3;
                        if ((LJIIJ() && i15 - this.LLLIIIIL >= iMax) || (!LJIIJ() && this.LLLIIIIL + i16 <= scrollDistance)) {
                            arrayList.add(viewLJIIIZ3);
                        }
                        LJIILL(viewLJIIIZ3, i15, i16);
                    }
                    while (i < this.LLILZIL) {
                        View viewLJIIIZ4 = LJIIIZ(i);
                        if (LJIIJ()) {
                            i2 = width - childExpectSize;
                        } else {
                            width = i2 + childExpectSize;
                        }
                        if ((LJIIJ() && width <= scrollDistance) || (!LJIIJ() && i2 >= iMax)) {
                            arrayList.add(viewLJIIIZ4);
                        }
                        LJIILL(viewLJIIIZ4, i2, width);
                        if (LJIIJ()) {
                            width = i2 - this.LLLIIIIL;
                        } else {
                            i2 = this.LLLIIIIL + width;
                        }
                        i++;
                    }
                }
                LJIJJLI();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                LJIILJJIL((View) it2.next(), this.LLJJI);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI() {
        /*
            r6 = this;
            X.19cE r0 = r6.LLJJJJ
            if (r0 == 0) goto L8a
            int r0 = r6.getChildCount()
            r5 = -1
            int r4 = r0 + (-1)
        Lb:
            if (r4 <= r5) goto L8a
            android.view.View r3 = r6.getChildAt(r4)
            boolean r0 = r6.LJ()
            r2 = 1
            if (r0 == 0) goto L25
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            X.19hD r0 = (X.C21606919hD) r0
            int r0 = r0.LIZ
            if (r0 != 0) goto L25
        L22:
            int r4 = r4 + (-1)
            goto Lb
        L25:
            boolean r0 = r6.LJFF()
            if (r0 == 0) goto L39
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            X.19hD r0 = (X.C21606919hD) r0
            int r1 = r0.LIZ
            int r0 = r6.LLILZIL
            int r0 = r0 - r2
            if (r1 != r0) goto L3b
            goto L22
        L39:
            if (r3 == 0) goto L22
        L3b:
            boolean r0 = r6.LJIIJ()
            if (r0 == 0) goto L5e
            int r1 = r3.getLeft()
            int r0 = r6.getScrollX()
            int r1 = r1 - r0
            int r0 = r6.getOffset()
            int r1 = r1 + r0
            int r0 = r6.getPaddingLeft()
        L53:
            int r1 = r1 - r0
            X.19cE r2 = r6.LLJJJJ
            boolean r0 = r6.LJIIJJI()
            r2.LLJL(r6, r3, r0, r1)
            goto L22
        L5e:
            boolean r0 = r6.LJIIJJI()
            if (r0 == 0) goto L77
            int r1 = r3.getTop()
            int r0 = r6.getScrollY()
            int r1 = r1 - r0
            int r0 = r6.getOffset()
            int r1 = r1 - r0
            int r0 = r6.getPaddingTop()
            goto L53
        L77:
            int r1 = r3.getLeft()
            int r0 = r6.getScrollX()
            int r1 = r1 - r0
            int r0 = r6.getOffset()
            int r1 = r1 - r0
            int r0 = r6.getPaddingLeft()
            goto L53
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21606519h9.LJIJJLI():void");
    }

    public final void LJIL() {
        if (this.LLJIJIL || this.LLJI) {
            return;
        }
        boolean z = this.LLJILJIL && this.LLJJJIL == 1;
        Iterator it2 = ((ArrayList) this.LLLIILIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21606819hC) it2.next()).LIZJ(this.LLILZLL, z);
        }
        this.LLJI = true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.LLJ.computeScrollOffset()) {
            this.LLLLII = LJIIJJI() ? this.LLJ.getFinalY() : this.LLJ.getFinalX();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.LLJ.getCurrX();
            int currY = this.LLJ.getCurrY();
            if (LJIIJJI() && scrollY != currY) {
                scrollTo(scrollX, currY);
            } else if (!LJIIJJI() && scrollX != currX) {
                scrollTo(currX, scrollY);
            }
            postInvalidateOnAnimation();
            return;
        }
        if (getChildCount() <= 0 || this.LLJJJIL == 1) {
            return;
        }
        int i = ((C21606919hD) getCurrentView().getLayoutParams()).LIZ;
        this.LLILZLL = i;
        if (this.LLIZ != i) {
            Iterator it2 = ((ArrayList) this.LLLIILIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC21606819hC) it2.next()).LJ(this.LLILZLL, this.LLJIJIL);
            }
        }
        if (this.LLJJIJI && this.LLJJIJIIJIL) {
            this.LLJILLL = false;
            this.LLJJIJIIJIL = false;
            super.requestLayout();
        }
        if (!this.LLJIJIL && this.LLJI) {
            Iterator it3 = ((ArrayList) this.LLLIILIL).iterator();
            while (it3.hasNext()) {
                ((InterfaceC21606819hC) it3.next()).LIZLLL(this.LLILZLL);
            }
            this.LLJI = false;
        }
        if (this.LLIZ == -1 && this.LLILZLL != -1) {
            this.LLJIJIL = false;
        }
        this.LLIZ = this.LLILZLL;
        setScrollState(0);
    }

    public int getChildExpectSize() {
        int i = this.LLLFFI;
        return i > 0 ? i : getContentSize();
    }

    private List<View> getAllChildren() {
        int childCount = getChildCount();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < childCount; i++) {
            linkedList.add(getChildAt(i));
        }
        return linkedList;
    }

    private int getContentHeight() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    private int getContentSize() {
        return LJIIJJI() ? getContentHeight() : getContentWidth();
    }

    private int getContentWidth() {
        return (getWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private View getCurrentView() {
        int pile = getPile() + (getChildExpectSize() / 2);
        int scrollDistance = getScrollDistance();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int iLJIIIIZZ = LJIIIIZZ(childAt) - scrollDistance;
            int bottom = (LJIIJJI() ? childAt.getBottom() : childAt.getRight()) - scrollDistance;
            int i2 = this.LLJLLIL;
            if (i2 > 0) {
                bottom += this.LLLIIIIL;
            } else if (i2 < 0) {
                iLJIIIIZZ -= this.LLLIIIIL;
            }
            if (iLJIIIIZZ <= pile && bottom >= pile) {
                return childAt;
            }
        }
        return getChildAt(0);
    }

    private int getPageGap() {
        int width;
        int i;
        if (LJIIJJI()) {
            width = getHeight() - getPaddingBottom();
            i = this.LLLIIIIL;
        } else {
            width = getWidth() - getPaddingRight();
            i = this.LLLIIIIL;
        }
        return width - i;
    }

    private int getPile() {
        return LJIIJJI() ? getPaddingTop() + getOffset() : LJIIJ() ? ((getPaddingLeft() + getOffset()) + getWidth()) - getChildExpectSize() : getPaddingLeft() + getOffset();
    }

    private int getScrollDistance() {
        return LJIIJJI() ? getScrollY() : getScrollX();
    }

    public InterfaceC21607119hF getAdapter() {
        return this.LLLFF;
    }

    public int getCurrentIndex() {
        return this.LLILZLL;
    }

    public int getOffset() {
        return this.LLLFZ;
    }

    public int getTotalCount() {
        return this.LLILZIL;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
    }

    public C21606519h9(Context context) {
        super(context, null);
        this.LLILZLL = -1;
        this.LLIZ = -1;
        this.LLIZLLLIL = -1;
        this.LLJIJIL = true;
        this.LLJILJIL = true;
        this.LLJJIJIL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLJLL = -1;
        this.LLLFFI = -1;
        this.LLLI = -1;
        this.LLLII = -1;
        this.LLLIIII = -1;
        this.LLLIIIL = Integer.MIN_VALUE;
        this.LLLIIL = Integer.MAX_VALUE;
        this.LLLJ = true;
        this.LLLJIL = DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL;
        this.LLLJL = -1.0f;
        this.LLLL = -1.0f;
        this.LLLLII = Integer.MIN_VALUE;
        this.LLLLIIIILLL = new GestureDetector(new GestureDetector.SimpleOnGestureListener() { // from class: X.19hA
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                this.LL.LLJ.abortAnimation();
                C21606519h9 c21606519h9 = this.LL;
                c21606519h9.LLJLLIL = 0;
                c21606519h9.LLJLILLLLZIIL = true;
                c21606519h9.LLJJLIIIJLLLLLLLZ = false;
                float x = motionEvent.getX();
                c21606519h9.LLL = x;
                c21606519h9.LLJZ = x;
                C21606519h9 c21606519h92 = this.LL;
                float y = motionEvent.getY();
                c21606519h92.LLLF = y;
                c21606519h92.LLJZIJLIL = y;
                this.LL.LLJLL = motionEvent.getPointerId(motionEvent.getActionIndex());
                return true;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
            
                if (r6 <= r1) goto L14;
             */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean onFling(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
                /*
                    r3 = this;
                    boolean r2 = super.onFling(r4, r5, r6, r7)
                    X.19h9 r0 = r3.LL
                    boolean r0 = r0.LJIIJJI()
                    if (r0 == 0) goto L1b
                    X.19h9 r0 = r3.LL
                    int r1 = r0.LLJJJJLIIL
                    int r0 = -r1
                    float r0 = (float) r0
                    int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                    if (r0 < 0) goto L1b
                    float r0 = (float) r1
                    int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L32
                L1b:
                    X.19h9 r0 = r3.LL
                    boolean r0 = r0.LJIIJJI()
                    if (r0 != 0) goto L33
                    X.19h9 r0 = r3.LL
                    int r1 = r0.LLJJJJJIL
                    int r0 = -r1
                    float r0 = (float) r0
                    int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                    if (r0 < 0) goto L33
                    float r0 = (float) r1
                    int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                    if (r0 > 0) goto L33
                L32:
                    return r2
                L33:
                    X.19h9 r1 = r3.LL
                    r0 = 1
                    r1.LLJJLIIIJLLLLLLLZ = r0
                    android.widget.Scroller r0 = r1.LLJ
                    r0.abortAnimation()
                    X.19h9 r0 = r3.LL
                    r0.LJI(r6, r7)
                    boolean r0 = super.onFling(r4, r5, r6, r7)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21606619hA.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                float f3;
                C21606519h9 c21606519h9 = this.LL;
                if (!c21606519h9.LLJL) {
                    if (motionEvent2.findPointerIndex(c21606519h9.LLJLL) == -1) {
                        return super.onScroll(motionEvent, motionEvent2, f, f2);
                    }
                    float fAbs = Math.abs(f);
                    float fAbs2 = Math.abs(f2);
                    if ((this.LL.LJIIJJI() && fAbs2 > fAbs && this.LL.LIZJ((int) f2)) || (!this.LL.LJIIJJI() && fAbs > fAbs2 && this.LL.LIZIZ((int) f))) {
                        C21606519h9 c21606519h92 = this.LL;
                        c21606519h92.LLJL = true;
                        c21606519h92.setScrollState(1);
                        this.LL.LJIIZILJ(true);
                    } else {
                        this.LL.LJIIZILJ(false);
                    }
                }
                C21606519h9 c21606519h93 = this.LL;
                if (c21606519h93.LLJL) {
                    int iFindPointerIndex = motionEvent2.findPointerIndex(c21606519h93.LLJLL);
                    float x = motionEvent2.getX(iFindPointerIndex);
                    float y = motionEvent2.getY(iFindPointerIndex);
                    C21606519h9 c21606519h94 = this.LL;
                    float f4 = c21606519h94.LLJZ - x;
                    float f5 = c21606519h94.LLJZIJLIL - y;
                    float f6 = c21606519h94.LLJLLIL;
                    if (c21606519h94.LJIIJJI()) {
                        f3 = f5;
                    } else {
                        f3 = f4;
                    }
                    c21606519h94.LLJLLIL = (int) (f6 + f3);
                    C21606519h9 c21606519h95 = this.LL;
                    c21606519h95.LLJZ = x;
                    c21606519h95.LLJZIJLIL = y;
                    if (c21606519h95.LLJLILLLLZIIL) {
                        c21606519h95.LJIL();
                        this.LL.LLJLILLLLZIIL = false;
                    }
                    if (this.LL.LJIIJJI()) {
                        this.LL.scrollBy(0, (int) (((double) f5) + 0.5d));
                    } else {
                        this.LL.scrollBy((int) (((double) f4) + 0.5d), 0);
                    }
                }
                return this.LL.LLJL;
            }
        }, new BPEAHandler(Looper.getMainLooper()));
        float f = getResources().getDisplayMetrics().density;
        this.LLJ = new Scroller(context, new LinearInterpolator());
        int i = (int) (600.0f * f);
        this.LLJJJJLIIL = i;
        this.LLJJJJJIL = i;
        this.LLJJL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLJLLL = (int) (f * 2.0f);
        this.LLLIILIL = new ArrayList();
    }

    public final boolean LIZIZ(int i) {
        int i2;
        int i3;
        if (LJIIJJI() || this.LLLFF == null || (i2 = this.LLILZIL) <= 1 || (i3 = this.LLILZLL) == -1) {
            return false;
        }
        if (!this.LLJILLL) {
            if (i > 0) {
                if (this.LLJJ) {
                    if (i3 <= 0) {
                        return false;
                    }
                } else if (i3 >= i2 - 1) {
                    return false;
                }
            } else {
                if (i >= 0) {
                    return false;
                }
                if (this.LLJJ) {
                    if (i3 >= i2 - 1) {
                        return false;
                    }
                } else if (i3 <= 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean LIZJ(int i) {
        int i2;
        int i3;
        if (LJIIJJI() && this.LLLFF != null && (i2 = this.LLILZIL) > 1 && (i3 = this.LLILZLL) != -1) {
            if (!this.LLJILLL) {
                if (i > 0) {
                    if (i3 < i2 - 1) {
                        return true;
                    }
                } else if (i < 0 && i3 > 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final int LJIIIIZZ(View view) {
        if (LJIIJJI()) {
            return view.getTop();
        }
        return view.getLeft();
    }

    public final View LJIIIZ(int i) {
        for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
            View childAt = getChildAt(childCount);
            if (((C21606919hD) childAt.getLayoutParams()).LIZ == i) {
                return childAt;
            }
        }
        View view = (View) ListProtector.get(((C21607019hE) this.LLLFF).LIZ.LLJLILLLLZIIL, i);
        C21606919hD c21606919hD = new C21606919hD();
        c21606919hD.LIZ = i;
        addViewInLayout(view, 0, c21606919hD, true);
        LJIIL(view);
        return view;
    }

    public final void LJIIL(View view) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        if (LJIIJJI()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i = layoutParams.width;
            if (i >= 0) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
            } else {
                int iMax = Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight());
                int i2 = layoutParams.width;
                if (i2 == -1) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                } else if (i2 == -2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, Integer.MIN_VALUE);
                } else {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                }
            }
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getChildExpectSize(), 1073741824);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getChildExpectSize(), 1073741824);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            int i3 = layoutParams2.height;
            if (i3 >= 0) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            } else {
                int iMax2 = Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom());
                int i4 = layoutParams2.height;
                if (i4 == -1) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else if (i4 == -2) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax2, Integer.MIN_VALUE);
                } else {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
                }
            }
        }
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
    }

    public final void LJIILIIL(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLJLL) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLJZ = motionEvent.getX(i);
            this.LLJZIJLIL = motionEvent.getY(i);
            this.LLJLL = motionEvent.getPointerId(i);
        }
    }

    public final void LJIIZILJ(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if ((!this.LLJILJIL || !LIZIZ(i)) && !this.LLJJIII) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if ((!this.LLJILJIL || !LIZJ(i)) && !this.LLJJIII) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int finalX;
        int currX;
        float f;
        float f2;
        float f3;
        if (!this.LLJILJIL) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 3 && actionMasked != 1) {
            if (actionMasked != 0) {
                if (this.LLJL) {
                    return true;
                }
                if (this.LLJLIL) {
                    return false;
                }
            }
            if (actionMasked != 0) {
                if (actionMasked != 2) {
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            LJIILIIL(motionEvent);
                        }
                    } else {
                        this.LLJLL = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int i = this.LLJLL;
                    if (i != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f4 = x - this.LLJZ;
                        float f5 = y - this.LLJZIJLIL;
                        float f6 = x - this.LLL;
                        float f7 = y - this.LLLF;
                        if (LJIIJJI()) {
                            f = f5;
                        } else {
                            f = f4;
                        }
                        int i2 = (int) f;
                        if (this.LLJILJILJ && i2 != 0 && LIZ(this, LJIIJJI(), false, i2, (int) x, (int) y)) {
                            this.LLJZ = x;
                            this.LLJZIJLIL = y;
                            this.LLJLIL = true;
                            return false;
                        }
                        if (LJIIJJI()) {
                            if (Math.abs(f5) > this.LLJJL && Math.abs(f5) > Math.abs(f6) * 0.5f) {
                                LJIIZILJ(true);
                                setScrollState(1);
                                this.LLJL = true;
                                this.LLJLILLLLZIIL = true;
                                if (f5 > 0.0f) {
                                    f3 = this.LLLF + this.LLJJL;
                                } else {
                                    f3 = this.LLLF - this.LLJJL;
                                }
                                this.LLJZIJLIL = f3;
                                this.LLJZ = x;
                            } else if (f6 > this.LLJJL) {
                                this.LLJLIL = true;
                            }
                        } else if (Math.abs(f4) > this.LLJJL && Math.abs(f4) > Math.abs(f7) * 0.5f) {
                            LJIIZILJ(true);
                            setScrollState(1);
                            this.LLJL = true;
                            this.LLJLILLLLZIIL = true;
                            if (f4 > 0.0f) {
                                f2 = this.LLL + this.LLJJL;
                            } else {
                                f2 = this.LLL - this.LLJJL;
                            }
                            this.LLJZ = f2;
                            this.LLJZIJLIL = y;
                        } else if (f7 > this.LLJJL) {
                            this.LLJLIL = true;
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.LLL = x2;
                this.LLJZ = x2;
                float y2 = motionEvent.getY();
                this.LLLF = y2;
                this.LLJZIJLIL = y2;
                this.LLJLL = motionEvent.getPointerId(actionIndex);
                this.LLJL = false;
                this.LLJLIL = false;
                this.LLJLILLLLZIIL = false;
                this.LLJJLIIIJLLLLLLLZ = false;
                this.LLJLLIL = 0;
                this.LLJ.computeScrollOffset();
                if (LJIIJJI()) {
                    finalX = this.LLJ.getFinalY();
                    currX = this.LLJ.getCurrY();
                } else {
                    finalX = this.LLJ.getFinalX();
                    currX = this.LLJ.getCurrX();
                }
                int i3 = finalX - currX;
                if (this.LLLJ) {
                    LJIIZILJ(true);
                }
                if (this.LLJJJIL == 2 && Math.abs(i3) > this.LLJLLL) {
                    this.LLJ.abortAnimation();
                    LJIIZILJ(true);
                    setScrollState(1);
                    this.LLJL = true;
                }
            }
            return this.LLJL;
        }
        this.LLJLL = -1;
        this.LLJL = false;
        this.LLJLIL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
        this.LLJLILLLLZIIL = false;
        this.LLJLLIL = 0;
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 1 && actionMasked != 3) {
            if (actionMasked != 5) {
                if (actionMasked == 6) {
                    LJIILIIL(motionEvent);
                }
            } else {
                this.LLJLL = motionEvent.getPointerId(actionIndex);
                this.LLJZ = motionEvent.getX(actionIndex);
                this.LLJZIJLIL = motionEvent.getY(actionIndex);
            }
        } else {
            this.LLJLL = -1;
            if (!this.LLJJLIIIJLLLLLLLZ) {
                LJIJ();
            }
        }
        if (this.LLJILJIL) {
            return this.LLLLIIIILLL.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAdapter(InterfaceC21607119hF interfaceC21607119hF) {
        if (this.LLLFF != null) {
            for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
                LJIILJJIL(getChildAt(childCount), false);
            }
        } else {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
            removeAllViews();
        }
        this.LLLFF = interfaceC21607119hF;
        if (interfaceC21607119hF == null) {
            return;
        }
        this.LLILZIL = ((ArrayList) ((C21607019hE) interfaceC21607119hF).LIZ.LLJLILLLLZIIL).size();
    }

    public void setAnimDuration(int i) {
        this.LLJJIJIL = i;
    }

    public void setBounceBeginThreshold(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.LLLJL = 1.0f - f;
        } else {
            this.LLLJL = -1.0f;
        }
    }

    public void setBounceDuration(int i) {
        this.LLLJIL = i;
    }

    public void setBounceEndThreshold(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.LLLL = 1.0f - f;
        } else {
            this.LLLL = -1.0f;
        }
    }

    public void setEnableBounce(boolean z) {
        this.LLLIL = z;
    }

    public void setEnableNestedChild(boolean z) {
        this.LLJILJILJ = z;
    }

    public void setEnableViceLoop(boolean z) {
        this.LLJJIJI = z;
    }

    public void setForceCanScroll(boolean z) {
        this.LLJJIII = z;
    }

    public void setHLayoutUpdated(boolean z) {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILLJJLI = z;
    }

    public void setHandleGesture(boolean z) {
        this.LLLJ = z;
    }

    public void setIgnoreLayoutUpdate(boolean z) {
        this.LLLIZZ = z;
    }

    public void setIsRTL(boolean z) {
        this.LLJJ = z;
    }

    public void setKeepItemView(boolean z) {
        this.LLJJI = z;
    }

    public void setLoop(boolean z) {
        this.LLJILLL = z;
        if (this.LLJJIJI && this.LLLFF != null && this.LLILZIL > 1 && this.LLILZLL != -1) {
            super.requestLayout();
        }
    }

    public void setOrientation(int i) {
        this.LLJJJ = i;
    }

    public void setPageMargin(int i) {
        if (i < 0) {
            i = 0;
        }
        this.LLLIIIIL = i;
    }

    public void setPageSize(int i) {
        this.LLLFFI = i;
    }

    public void setPropsUpdated(boolean z) {
        if (this.LLILZ) {
            return;
        }
        this.LLILZ = z;
    }

    public void setScrollState(int i) {
        if (this.LLJJJIL == i) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLLIILIL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC21606819hC) it2.next()).onPageScrollStateChanged(i);
        }
        this.LLJJJIL = i;
    }

    public void setTouchable(boolean z) {
        this.LLJILJIL = z;
    }

    public void setTransformer(InterfaceC21576019cE interfaceC21576019cE) {
        if (this.LLJJJJ != null) {
            for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
                this.LLJJJJ.LLJJLIIIJLLLLLLLZ(getChildAt(childCount));
            }
        }
        this.LLJJJJ = interfaceC21576019cE;
        LJIJJLI();
    }

    public void setVLayoutUpdated(boolean z) {
        if (this.LLILLL) {
            return;
        }
        this.LLILLL = z;
    }

    public final void LJI(float f, float f2) {
        if (getChildCount() < 1) {
            return;
        }
        if (LJIIJJI()) {
            f = f2;
        }
        int pile = getPile();
        int scrollDistance = getScrollDistance();
        int i = ((C21606919hD) getCurrentView().getLayoutParams()).LIZ;
        if (f < 0.0f) {
            int childCount = getChildCount();
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < childCount; i3++) {
                int iLJIIIIZZ = LJIIIIZZ(getChildAt(i3)) - scrollDistance;
                if (iLJIIIIZZ > pile && iLJIIIIZZ < i2) {
                    i2 = iLJIIIIZZ;
                }
            }
            if (i2 == Integer.MAX_VALUE) {
                LJII(i, true);
                return;
            }
            if (LJIIJJI()) {
                this.LLJ.startScroll(0, scrollDistance, 0, i2 - pile, this.LLJJIJIL);
            } else {
                this.LLJ.startScroll(scrollDistance, 0, i2 - pile, 0, this.LLJJIJIL);
            }
            setScrollState(2);
        } else {
            int childCount2 = getChildCount();
            int i4 = Integer.MIN_VALUE;
            for (int i5 = 0; i5 < childCount2; i5++) {
                int iLJIIIIZZ2 = LJIIIIZZ(getChildAt(i5)) - scrollDistance;
                if (iLJIIIIZZ2 < pile && iLJIIIIZZ2 > i4) {
                    i4 = iLJIIIIZZ2;
                }
            }
            if (i4 == Integer.MIN_VALUE) {
                LJII(i, false);
                return;
            }
            if (LJIIJJI()) {
                this.LLJ.startScroll(0, scrollDistance, 0, i4 - pile, this.LLJJIJIL);
            } else {
                this.LLJ.startScroll(scrollDistance, 0, i4 - pile, 0, this.LLJJIJIL);
            }
            setScrollState(2);
        }
        invalidate();
    }

    public final void LJII(int i, boolean z) {
        int i2;
        int i3 = 0;
        if (z) {
            if (LJIIJ()) {
                if (this.LLJILLL && i - 1 < 0) {
                    i = this.LLILZIL;
                }
                i2 = i - 1;
            } else {
                if (!this.LLJILLL || i + 1 < this.LLILZIL) {
                    i3 = i + 1;
                }
                i2 = i3;
            }
            LJIJI(i2, !LJIIJ() ? 1 : 0, true);
            return;
        }
        if (LJIIJ()) {
            if (!this.LLJILLL || i + 1 < this.LLILZIL) {
                i3 = i + 1;
            }
        } else {
            if (this.LLJILLL && i - 1 < 0) {
                i = this.LLILZIL;
            }
            i3 = i - 1;
        }
        LJIJI(i3, LJIIJ() ? 1 : 0, true);
    }

    public final void LJIILJJIL(View view, boolean z) {
        InterfaceC21576019cE interfaceC21576019cE = this.LLJJJJ;
        if (interfaceC21576019cE != null) {
            interfaceC21576019cE.LLJJLIIIJLLLLLLLZ(view);
        }
        if (!z) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
            removeView(view);
            this.LLLFF.getClass();
        }
    }

    public final void LJIJJ(int i, boolean z) {
        this.LLLFZ = i;
        if (z) {
            if (LJIIJJI()) {
                scrollTo(0, -i);
            } else {
                scrollTo(-i, 0);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        boolean z;
        boolean z2;
        int paddingLeft;
        boolean z3;
        boolean z4;
        int childExpectSize;
        int childExpectSize2;
        boolean z5;
        boolean z6;
        int paddingLeft2;
        int childExpectSize3 = getChildExpectSize() + this.LLLIIIIL;
        int i3 = this.LLILZIL * childExpectSize3;
        int paddingLeft3 = getPaddingLeft() + this.LLLFZ;
        boolean z7 = true;
        if ((this.LLLIIIL != Integer.MIN_VALUE || this.LLLIIL != Integer.MAX_VALUE) && this.LLLI == childExpectSize3 && this.LLLII == i3 && this.LLLIIII == paddingLeft3) {
            z = false;
        } else {
            z = true;
        }
        this.LLLI = childExpectSize3;
        this.LLLII = i3;
        this.LLLIIII = paddingLeft3;
        if (z) {
            if (LJIIJ()) {
                int paddingRight = getPaddingRight() - this.LLLFZ;
                this.LLLIIIL = ((-(this.LLILZIL - 1)) * (getChildExpectSize() + this.LLLIIIIL)) + paddingRight;
                this.LLLIIL = paddingRight;
            } else {
                if (LJIIJJI()) {
                    paddingLeft2 = getPaddingTop();
                } else {
                    paddingLeft2 = getPaddingLeft();
                }
                int i4 = paddingLeft2 + this.LLLFZ;
                this.LLLIIIL = -i4;
                this.LLLIIL = ((this.LLILZIL - 1) * (getChildExpectSize() + this.LLLIIIIL)) - i4;
            }
        }
        if (!this.LLJILLL) {
            if (LJIIJJI()) {
                if (LJ()) {
                    childExpectSize = (int) (this.LLLIIIL + (this.LLLJL * (getChildExpectSize() + this.LLLIIIIL)));
                } else {
                    childExpectSize = this.LLLIIIL;
                }
                if (LJFF()) {
                    childExpectSize2 = (int) (this.LLLIIL - (this.LLLL * (getChildExpectSize() + this.LLLIIIIL)));
                } else {
                    childExpectSize2 = this.LLLIIL;
                }
                if (LJ() && i2 <= childExpectSize) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                this.LLLILZ = z5;
                if (LJFF() && i2 >= childExpectSize2) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                this.LLLILZJ = z6;
                i2 = Math.min(Math.max(i2, childExpectSize), childExpectSize2);
            } else {
                int childExpectSize4 = this.LLLIIIL;
                int childExpectSize5 = this.LLLIIL;
                if (LJ()) {
                    if (this.LLJJ) {
                        childExpectSize5 = (int) (this.LLLIIL - (this.LLLJL * (getChildExpectSize() + this.LLLIIIIL)));
                    } else {
                        childExpectSize4 = (int) (this.LLLIIIL + (this.LLLJL * (getChildExpectSize() + this.LLLIIIIL)));
                    }
                }
                if (LJFF()) {
                    if (this.LLJJ) {
                        childExpectSize4 = (int) (this.LLLIIIL + (this.LLLL * (getChildExpectSize() + this.LLLIIIIL)));
                    } else {
                        childExpectSize5 = (int) (this.LLLIIL - (this.LLLL * (getChildExpectSize() + this.LLLIIIIL)));
                    }
                }
                if (LJ() && (!this.LLJJ ? i <= childExpectSize4 : i >= childExpectSize5)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                this.LLLILZ = z3;
                if (LJFF() && (!this.LLJJ ? i >= childExpectSize5 : i <= childExpectSize4)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.LLLILZJ = z4;
                i = Math.min(Math.max(i, childExpectSize4), childExpectSize5);
            }
        }
        super.scrollTo(i, i2);
        int childExpectSize6 = getChildExpectSize() + this.LLLIIIIL;
        int i5 = this.LLILZIL * childExpectSize6;
        if (this.LLJILLL && i5 > 0 && childExpectSize6 > 0) {
            int scrollDistance = getScrollDistance();
            if (LJIIJ()) {
                int paddingRight2 = getPaddingRight() - this.LLLFZ;
                int i6 = scrollDistance - (childExpectSize6 / 2);
                if (i6 >= 0) {
                    int i7 = i6 / i5;
                    this.LLLIIIL = (i7 * i5) + childExpectSize6 + paddingRight2;
                    this.LLLIIL = ((i7 + 1) * i5) + paddingRight2;
                } else {
                    this.LLLIIIL = ((-((Math.abs(i6) / i5) + 1)) * i5) + childExpectSize6 + paddingRight2;
                    this.LLLIIL = ((-(Math.abs(i6) / i5)) * i5) + paddingRight2;
                }
            } else {
                if (LJIIJJI()) {
                    paddingLeft = getPaddingTop();
                } else {
                    paddingLeft = getPaddingLeft();
                }
                int i8 = paddingLeft + this.LLLFZ;
                int i9 = scrollDistance + (childExpectSize6 / 2);
                if (i9 >= 0) {
                    int i10 = i9 / i5;
                    this.LLLIIIL = (i10 * i5) - i8;
                    this.LLLIIL = (((i10 + 1) * i5) - childExpectSize6) - i8;
                } else {
                    this.LLLIIIL = ((-((Math.abs(i9) / i5) + 1)) * i5) - i8;
                    this.LLLIIL = (((-(Math.abs(i9) / i5)) * i5) - childExpectSize6) - i8;
                }
            }
        }
        LJIILLIIL();
        if (!this.LLJIJIL && this.LLJI) {
            if (this.LLJILJIL && this.LLJJJIL == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            Iterator it2 = ((ArrayList) this.LLLIILIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC21606819hC) it2.next()).LIZIZ(getScrollX(), getScrollY(), z2);
            }
        }
        if (!this.LLJILLL) {
            if (this.LLLILZ || this.LLLILZJ) {
                LJIJ();
                if (!this.LLLILZLLLI) {
                    boolean z8 = this.LLLILZ;
                    boolean z9 = this.LLLILZJ;
                    if (!this.LLJIJIL && this.LLJI) {
                        Iterator it3 = ((ArrayList) this.LLLIILIL).iterator();
                        while (it3.hasNext()) {
                            ((InterfaceC21606819hC) it3.next()).LIZ(z8, z9);
                        }
                    }
                }
            }
            if (!this.LLLILZ && !this.LLLILZJ) {
                z7 = false;
            }
            this.LLLILZLLLI = z7;
            this.LLLILZ = false;
            this.LLLILZJ = false;
        }
    }

    public final void LJIILL(View view, int i, int i2) {
        int paddingTop;
        int measuredHeight;
        if (LJIIJJI()) {
            int paddingLeft = getPaddingLeft();
            int measuredWidth = view.getMeasuredWidth() + paddingLeft;
            paddingTop = i;
            i = paddingLeft;
            measuredHeight = i2;
            i2 = measuredWidth;
        } else {
            paddingTop = getPaddingTop();
            measuredHeight = view.getMeasuredHeight() + paddingTop;
        }
        view.layout(i, paddingTop, i2, measuredHeight);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21606519h9.LJIJI(int, int, boolean):void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new IllegalStateException();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LLILLJJLI || this.LLILLL) {
            LIZLLL();
            this.LLILLJJLI = false;
            this.LLILLL = false;
        }
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        super.setPadding(i, i2, i3, i4);
        if (LJIIJJI()) {
            scrollBy(0, paddingLeft - i);
        } else {
            scrollBy(paddingLeft - i, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int childCount = getChildCount() - 1; childCount > -1; childCount--) {
            LJIIL(getChildAt(childCount));
        }
        if (!this.LLILZ && !this.LLILLJJLI && !this.LLILLL) {
            LJIILLIIL();
            return;
        }
        LIZLLL();
        this.LLILZ = false;
        this.LLILLJJLI = false;
        this.LLILLL = false;
    }

    public static boolean LIZ(View view, boolean z, boolean z2, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && LIZ(childAt, z, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z2) {
            if (z) {
                if (view.canScrollVertically(-i)) {
                    return true;
                }
                return false;
            }
            if (view.canScrollHorizontally(-i)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
