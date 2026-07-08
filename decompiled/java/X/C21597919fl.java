package X;

import Y.AComparatorS52S0000000_33;
import Y.ARunnableS131S0100000_31;
import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.tools.mvtemplate.mvpreview.VerticalViewPager$SavedState;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u4.q0;

/* JADX INFO: renamed from: X.19fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21597919fl extends ViewGroup {
    public static final int[] LLLILZ = {R.attr.layout_gravity};
    public static final AComparatorS52S0000000_33 LLLILZJ = new AComparatorS52S0000000_33(11);
    public static final InterpolatorC21599019fw LLLILZLLLI = new Interpolator() { // from class: X.19fw
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public static final Field LLLIZZ;
    public boolean LL;
    public int LLILLJJLI;
    public final ArrayList<C21598819fu> LLILLL;
    public final C21598819fu LLILZ;
    public final Rect LLILZIL;
    public PagerAdapter LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public Parcelable LLJ;
    public ClassLoader LLJI;
    public Scroller LLJIJIL;
    public boolean LLJILJIL;
    public C21598919fv LLJILJILJ;
    public int LLJILLL;
    public Drawable LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public float LLJJIJI;
    public float LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public float LLJLLIL;
    public float LLJLLL;
    public int LLJZ;
    public VelocityTracker LLJZIJLIL;
    public int LLL;
    public int LLLF;
    public int LLLFF;
    public int LLLFFI;
    public C20097913kP LLLFZ;
    public C20097913kP LLLI;
    public boolean LLLII;
    public boolean LLLIIII;
    public int LLLIIIIL;
    public final List<InterfaceC469360Ias> LLLIIIL;
    public final ARunnableS131S0100000_31 LLLIIL;
    public int LLLIILIL;
    public boolean LLLIL;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19fw] */
    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            LLLIZZ = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public final boolean LJIIZILJ() {
        this.LLJZ = -1;
        this.LLJJJJLIIL = false;
        this.LLJJL = false;
        VelocityTracker velocityTracker = this.LLJZIJLIL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LLJZIJLIL = null;
        }
        return this.LLLFZ.LJI() | this.LLLI.LJI();
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.LLJILJIL = true;
        if (this.LLJIJIL.isFinished() || !this.LLJIJIL.computeScrollOffset()) {
            LIZLLL(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.LLJIJIL.getCurrX();
        int currY = this.LLJIJIL.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!LJIIL(currY)) {
                this.LLJIJIL.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        postInvalidateOnAnimation();
    }

    public void setOnAdapterChangeListener(InterfaceC21599119fx interfaceC21599119fx) {
    }

    public final void LJ() {
        int count = this.LLILZLL.getCount();
        this.LLILLJJLI = count;
        boolean z = this.LLILLL.size() < (this.LLJJJJJIL * 2) + 1 && this.LLILLL.size() < count;
        int iMax = this.LLIZ;
        int i = 0;
        boolean z2 = false;
        while (i < this.LLILLL.size()) {
            C21598819fu c21598819fu = (C21598819fu) ListProtector.get(this.LLILLL, i);
            int iLJIJJ = this.LLILZLL.LJIJJ(c21598819fu.LIZ);
            if (iLJIJJ != -1) {
                if (iLJIJJ == -2) {
                    ListProtector.remove(this.LLILLL, i);
                    i--;
                    if (!z2) {
                        this.LLILZLL.LJJIJIIJI(this);
                        z2 = true;
                    }
                    this.LLILZLL.LJIIZILJ(this, c21598819fu.LIZIZ, c21598819fu.LIZ);
                    int i2 = this.LLIZ;
                    if (i2 == c21598819fu.LIZIZ) {
                        iMax = Math.max(0, Math.min(i2, (-1) + count));
                    }
                } else {
                    int i3 = c21598819fu.LIZIZ;
                    if (i3 != iLJIJJ) {
                        if (i3 == this.LLIZ) {
                            iMax = iLJIJJ;
                        }
                        c21598819fu.LIZIZ = iLJIJJ;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.LLILZLL.LJIJI(this);
        }
        Collections.sort(this.LLILLL, LLLILZJ);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C21598319fp c21598319fp = (C21598319fp) getChildAt(i4).getLayoutParams();
                if (!c21598319fp.LIZ) {
                    c21598319fp.LIZJ = 0.0f;
                }
            }
            LJIJI(iMax, false, true, 0);
            requestLayout();
        }
    }

    public final void LJIILJJIL() {
        LJIILL(this.LLIZ);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C21598319fp();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        HandlerHook.viewRemoveCallbacks(this, this.LLLIIL);
        Scroller scroller = this.LLJIJIL;
        if (scroller != null && !scroller.isFinished()) {
            this.LLJIJIL.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final C21598819fu LJIIIIZZ() {
        float scrollY;
        float f;
        int i;
        int clientHeight = getClientHeight();
        float f2 = 0.0f;
        if (clientHeight > 0) {
            scrollY = getScrollY() / clientHeight;
            f = this.LLJILLL / clientHeight;
        } else {
            scrollY = 0.0f;
            f = 0.0f;
        }
        C21598819fu c21598819fu = null;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.LLILLL.size()) {
            C21598819fu c21598819fu2 = (C21598819fu) ListProtector.get(this.LLILLL, i2);
            if (!z && c21598819fu2.LIZIZ != (i = i3 + 1)) {
                c21598819fu2 = this.LLILZ;
                c21598819fu2.LJ = f2 + f3 + f;
                c21598819fu2.LIZIZ = i;
                c21598819fu2.LIZLLL = this.LLILZLL.LJIL(i);
                i2--;
            }
            f2 = c21598819fu2.LJ;
            float f4 = c21598819fu2.LIZLLL + f2 + f;
            if (!z && scrollY < f2) {
                return c21598819fu;
            }
            if (scrollY < f4 || i2 == this.LLILLL.size() - 1) {
                return c21598819fu2;
            }
            i3 = c21598819fu2.LIZIZ;
            f3 = c21598819fu2.LIZLLL;
            i2++;
            z = false;
            c21598819fu = c21598819fu2;
        }
        return c21598819fu;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LLJJ;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLII = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        VerticalViewPager$SavedState verticalViewPager$SavedState = new VerticalViewPager$SavedState(super.onSaveInstanceState());
        verticalViewPager$SavedState.LL = this.LLIZ;
        PagerAdapter pagerAdapter = this.LLILZLL;
        if (pagerAdapter != null) {
            verticalViewPager$SavedState.LLILLJJLI = pagerAdapter.LJJIIJ();
        }
        return verticalViewPager$SavedState;
    }

    public PagerAdapter getAdapter() {
        return this.LLILZLL;
    }

    public int getCurrentItem() {
        return this.LLIZ;
    }

    public int getExpectedAdapterCount() {
        return this.LLILLJJLI;
    }

    public int getOffscreenPageLimit() {
        return this.LLJJJJJIL;
    }

    public int getPageMargin() {
        return this.LLJILLL;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.LLJJJIL != z) {
            this.LLJJJIL = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r7) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21597919fl.LIZIZ(int):boolean");
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        if (this.LLLIILIL == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.LLJIJIL.isFinished()) {
                this.LLJIJIL.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.LLJIJIL.getCurrX();
                int currY = this.LLJIJIL.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        LJIIL(currY);
                    }
                }
            }
        } else {
            z2 = false;
        }
        this.LLJJJJ = false;
        for (int i = 0; i < this.LLILLL.size(); i++) {
            C21598819fu c21598819fu = (C21598819fu) ListProtector.get(this.LLILLL, i);
            if (c21598819fu.LIZJ) {
                c21598819fu.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.LLLIIL);
            } else {
                this.LLLIIL.run();
            }
        }
    }

    public final C21598819fu LJII(View view) {
        for (int i = 0; i < this.LLILLL.size(); i++) {
            C21598819fu c21598819fu = (C21598819fu) ListProtector.get(this.LLILLL, i);
            if (this.LLILZLL.LJJIFFI(view, c21598819fu.LIZ)) {
                return c21598819fu;
            }
        }
        return null;
    }

    public final C21598819fu LJIIIZ(int i) {
        for (int i2 = 0; i2 < this.LLILLL.size(); i2++) {
            C21598819fu c21598819fu = (C21598819fu) ListProtector.get(this.LLILLL, i2);
            if (c21598819fu.LIZIZ == i) {
                return c21598819fu;
            }
        }
        return null;
    }

    public final void LJIIJJI(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLJZ) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLJLL = motionEvent.getY(i);
            this.LLJZ = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LLJZIJLIL;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean LJIIL(int i) {
        if (this.LLILLL.size() == 0) {
            if (this.LLLII) {
                return false;
            }
            this.LLLIIII = false;
            LJIIJ(0, 0.0f, 0);
            if (this.LLLIIII) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C21598819fu c21598819fuLJIIIIZZ = LJIIIIZZ();
        int clientHeight = getClientHeight();
        int i2 = this.LLJILLL;
        int i3 = clientHeight + i2;
        float f = i2;
        float f2 = clientHeight;
        int i4 = c21598819fuLJIIIIZZ.LIZIZ;
        float f3 = ((i / f2) - c21598819fuLJIIIIZZ.LJ) / (c21598819fuLJIIIIZZ.LIZLLL + (f / f2));
        this.LLLIIII = false;
        LJIIJ(i4, f3, (int) (i3 * f3));
        if (this.LLLIIII) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean LJIILIIL(float f) {
        boolean z;
        boolean z2;
        float f2 = this.LLJLL - f;
        this.LLJLL = f;
        float scrollY = getScrollY() + f2;
        float clientHeight = getClientHeight();
        float f3 = this.LLJJIJI * clientHeight;
        float f4 = this.LLJJIJIIJIL * clientHeight;
        boolean z3 = false;
        if (this.LLILLL.size() <= 0) {
            return false;
        }
        C21598819fu c21598819fu = (C21598819fu) ListProtector.get(this.LLILLL, 0);
        ArrayList<C21598819fu> arrayList = this.LLILLL;
        C21598819fu c21598819fu2 = (C21598819fu) ListProtector.get(arrayList, arrayList.size() - 1);
        if (c21598819fu.LIZIZ != 0) {
            f3 = c21598819fu.LJ * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (c21598819fu2.LIZIZ != this.LLILZLL.getCount() - 1) {
            f4 = c21598819fu2.LJ * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollY < f3) {
            if (z) {
                this.LLLFZ.LJ(Math.abs(f3 - scrollY) / clientHeight);
                z3 = true;
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z2) {
                this.LLLI.LJ(Math.abs(scrollY - f4) / clientHeight);
                z3 = true;
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.LLJLILLLLZIIL += scrollY - i;
        scrollTo(getScrollX(), i);
        LJIIL(i);
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0347 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9 A[PHI: r2 r13 r15
      0x00d9: PHI (r2v14 int) = (r2v13 int), (r2v8 int), (r2v16 int) binds: [B:53:0x00ce, B:50:0x00b8, B:43:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r13v18 int) = (r13v1 int), (r13v17 int), (r13v20 int) binds: [B:53:0x00ce, B:50:0x00b8, B:43:0x00a0] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r15v4 float) = (r15v2 float), (r15v3 float), (r15v1 float) binds: [B:53:0x00ce, B:50:0x00b8, B:43:0x00a0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0182 A[PHI: r7 r9
      0x0182: PHI (r7v18 float) = (r7v16 float), (r7v17 float), (r7v15 float) binds: [B:92:0x0177, B:89:0x015d, B:82:0x013f] A[DONT_GENERATE, DONT_INLINE]
      0x0182: PHI (r9v11 int) = (r9v9 int), (r9v10 int), (r9v8 int) binds: [B:92:0x0177, B:89:0x015d, B:82:0x013f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILL(int r18) {
        /*
            Method dump skipped, instruction units count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21597919fl.LJIILL(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C21598819fu c21598819fuLJII;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c21598819fuLJII = LJII(childAt)) != null && c21598819fuLJII.LIZIZ == this.LLIZ) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLILZLL == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY <= ((int) (clientHeight * this.LLJJIJI))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollY >= ((int) (clientHeight * this.LLJJIJIIJIL))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C21598319fp) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zLIZIZ;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode == 61) {
                            if (keyEvent.hasNoModifiers()) {
                                zLIZIZ = LIZIZ(2);
                            } else if (keyEvent.hasModifiers(1)) {
                                zLIZIZ = LIZIZ(1);
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        zLIZIZ = LIZIZ(66);
                    }
                } else {
                    zLIZIZ = LIZIZ(17);
                }
                if (!zLIZIZ) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C21598819fu c21598819fuLJII;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c21598819fuLJII = LJII(childAt)) != null && c21598819fuLJII.LIZIZ == this.LLIZ && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LL && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C0CHQ.LIZ().LIZJ().LJ("VerticalViewPager", e);
        }
        int overScrollMode = getOverScrollMode();
        boolean zLIZ = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.LLILZLL) != null && pagerAdapter.getCount() > 1)) {
            if (!this.LLLFZ.LIZLLL()) {
                int iSave = canvas.save();
                int height = getHeight();
                int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.translate(getPaddingLeft(), this.LLJJIJI * height);
                this.LLLFZ.LJII(width, height);
                zLIZ = false | this.LLLFZ.LIZ(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.LLLI.LIZLLL()) {
                int iSave2 = canvas.save();
                int height2 = getHeight();
                int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                canvas.rotate(180.0f);
                canvas.translate((-width2) - getPaddingLeft(), (-(this.LLJJIJIIJIL + 1.0f)) * height2);
                this.LLLI.LJII(width2, height2);
                zLIZ |= this.LLLI.LIZ(canvas);
                canvas.restoreToCount(iSave2);
            }
            if (zLIZ) {
                postInvalidateOnAnimation();
                return;
            }
            return;
        }
        this.LLLFZ.LIZIZ();
        this.LLLI.LIZIZ();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C21598319fp(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.LLJILLL > 0 && this.LLJJ != null && this.LLILLL.size() > 0 && this.LLILZLL != null) {
            int scrollY = getScrollY();
            float height = getHeight();
            float f2 = this.LLJILLL / height;
            int i2 = 0;
            C21598819fu c21598819fu = (C21598819fu) ListProtector.get(this.LLILLL, 0);
            float f3 = c21598819fu.LJ;
            int size = this.LLILLL.size();
            int i3 = ((C21598819fu) ListProtector.get(this.LLILLL, size - 1)).LIZIZ;
            for (int i4 = c21598819fu.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c21598819fu.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c21598819fu = (C21598819fu) ListProtector.get(this.LLILLL, i2);
                }
                if (i4 == i) {
                    float f4 = c21598819fu.LJ;
                    float f5 = c21598819fu.LIZLLL;
                    f = (f4 + f5) * height;
                    f3 = f4 + f5 + f2;
                } else {
                    float fLJIL = this.LLILZLL.LJIL(i4);
                    f = (f3 + fLJIL) * height;
                    f3 += fLJIL + f2;
                }
                int i5 = this.LLJILLL;
                if (i5 + f > scrollY) {
                    this.LLJJ.setBounds(this.LLJJI, (int) f, this.LLJJIII, (int) (i5 + f + 0.5f));
                    this.LLJJ.draw(canvas);
                }
                if (f > scrollY + r8) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action;
        float f;
        if (this.LLLIL) {
            return false;
        }
        try {
            action = motionEvent.getAction() & 255;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.LLJJJJLIIL) {
                    return true;
                }
                if (this.LLJJL) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        LJIIJJI(motionEvent);
                    }
                } else {
                    int i = this.LLJZ;
                    if (i != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f2 = y - this.LLJLL;
                        float fAbs = Math.abs(f2);
                        float x = motionEvent.getX(iFindPointerIndex);
                        float fAbs2 = Math.abs(x - this.LLJLLIL);
                        if (f2 != 0.0f) {
                            float f3 = this.LLJLL;
                            if ((f3 >= this.LLJL || f2 <= 0.0f) && ((f3 <= getHeight() - this.LLJL || f2 >= 0.0f) && LIZJ(this, false, (int) f2, (int) x, (int) y))) {
                                this.LLJLILLLLZIIL = x;
                                this.LLJLL = y;
                                this.LLJJL = true;
                                return false;
                            }
                        }
                        float f4 = this.LLJLIL;
                        if (fAbs > f4 && fAbs * 1.0f > fAbs2) {
                            this.LLJJJJLIIL = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            if (f2 <= 0.0f) {
                                f = this.LLJLLL - this.LLJLIL;
                            } else {
                                f = this.LLJLLL + this.LLJLIL;
                            }
                            this.LLJLL = f;
                            this.LLJLILLLLZIIL = x;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > f4) {
                            this.LLJJL = true;
                        }
                        if (this.LLJJJJLIIL && LJIILIIL(y)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                this.LLJLILLLLZIIL = motionEvent.getX();
                this.LLJLLIL = motionEvent.getX();
                this.LLJLL = motionEvent.getY();
                this.LLJLLL = motionEvent.getY();
                this.LLJZ = motionEvent.getPointerId(0);
                this.LLJJL = false;
                this.LLJILJIL = true;
                this.LLJIJIL.computeScrollOffset();
                if (this.LLLIILIL == 2 && Math.abs(this.LLJIJIL.getFinalY() - this.LLJIJIL.getCurrY()) > this.LLLFFI) {
                    this.LLJIJIL.abortAnimation();
                    this.LLJJJJ = false;
                    LJIILJJIL();
                    this.LLJJJJLIIL = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    LIZLLL(false);
                    this.LLJJJJLIIL = false;
                }
            }
            if (this.LLJZIJLIL == null) {
                this.LLJZIJLIL = VelocityTracker.obtain();
            }
            this.LLJZIJLIL.addMovement(motionEvent);
            return this.LLJJJJLIIL;
        }
        LJIIZILJ();
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof VerticalViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        VerticalViewPager$SavedState verticalViewPager$SavedState = (VerticalViewPager$SavedState) parcelable;
        super.onRestoreInstanceState(verticalViewPager$SavedState.getSuperState());
        PagerAdapter pagerAdapter = this.LLILZLL;
        if (pagerAdapter != null) {
            pagerAdapter.LJJIII(verticalViewPager$SavedState.LLILLJJLI, verticalViewPager$SavedState.LLILLL);
            LJIJI(verticalViewPager$SavedState.LL, false, true, 0);
        } else {
            this.LLIZLLLIL = verticalViewPager$SavedState.LL;
            this.LLJ = verticalViewPager$SavedState.LLILLJJLI;
            this.LLJI = verticalViewPager$SavedState.LLILLL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7 A[Catch: IllegalStateException -> 0x016a, IllegalArgumentException -> 0x017e, TryCatch #2 {IllegalArgumentException -> 0x017e, IllegalStateException -> 0x016a, blocks: (B:6:0x0007, B:8:0x000d, B:11:0x0014, B:13:0x0018, B:15:0x001e, B:17:0x0022, B:18:0x0028, B:29:0x0043, B:31:0x0053, B:33:0x0064, B:35:0x0068, B:65:0x013c, B:36:0x0073, B:38:0x0077, B:40:0x0080, B:41:0x0086, B:45:0x00a9, B:47:0x00b1, B:48:0x00b4, B:50:0x00bc, B:51:0x00c0, B:53:0x00d0, B:57:0x00e7, B:54:0x00d3, B:56:0x00d7, B:58:0x00ec, B:60:0x00f0, B:62:0x0111, B:63:0x0136, B:67:0x0140), top: B:78:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c A[Catch: IllegalStateException -> 0x016a, IllegalArgumentException -> 0x017e, TryCatch #2 {IllegalArgumentException -> 0x017e, IllegalStateException -> 0x016a, blocks: (B:6:0x0007, B:8:0x000d, B:11:0x0014, B:13:0x0018, B:15:0x001e, B:17:0x0022, B:18:0x0028, B:29:0x0043, B:31:0x0053, B:33:0x0064, B:35:0x0068, B:65:0x013c, B:36:0x0073, B:38:0x0077, B:40:0x0080, B:41:0x0086, B:45:0x00a9, B:47:0x00b1, B:48:0x00b4, B:50:0x00bc, B:51:0x00c0, B:53:0x00d0, B:57:0x00e7, B:54:0x00d3, B:56:0x00d7, B:58:0x00ec, B:60:0x00f0, B:62:0x0111, B:63:0x0136, B:67:0x0140), top: B:78:0x0007 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21597919fl.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LLJJJ) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.19fv] */
    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.LLILZLL;
        if (pagerAdapter2 != null) {
            try {
                Field field = LLLIZZ;
                if (field != null) {
                    field.set(pagerAdapter2, null);
                }
                this.LLILZLL.LJJIJIIJI(this);
                for (int i = 0; i < this.LLILLL.size(); i++) {
                    C21598819fu c21598819fu = (C21598819fu) ListProtector.get(this.LLILLL, i);
                    this.LLILZLL.LJIIZILJ(this, c21598819fu.LIZIZ, c21598819fu.LIZ);
                }
                this.LLILZLL.LJIJI(this);
                this.LLILLL.clear();
                int i2 = 0;
                while (i2 < getChildCount()) {
                    if (!((C21598319fp) getChildAt(i2).getLayoutParams()).LIZ) {
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                        removeViewAt(i2);
                        i2--;
                    }
                    i2++;
                }
                this.LLIZ = 0;
                scrollTo(0, 0);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        this.LLILZLL = pagerAdapter;
        this.LLILLJJLI = 0;
        if (pagerAdapter != null) {
            if (this.LLJILJILJ == null) {
                this.LLJILJILJ = new DataSetObserver() { // from class: X.19fv
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.LJ();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.LIZ.LJ();
                    }
                };
            }
            PagerAdapter pagerAdapter3 = this.LLILZLL;
            C21598919fv c21598919fv = this.LLJILJILJ;
            try {
                Field field2 = LLLIZZ;
                if (field2 != null) {
                    field2.set(pagerAdapter3, c21598919fv);
                }
                this.LLJJJJ = false;
                boolean z = this.LLLII;
                this.LLLII = true;
                this.LLILLJJLI = this.LLILZLL.getCount();
                if (this.LLIZLLLIL >= 0) {
                    this.LLILZLL.LJJIII(this.LLJ, this.LLJI);
                    LJIJI(this.LLIZLLLIL, false, true, 0);
                    this.LLIZLLLIL = -1;
                    this.LLJ = null;
                    this.LLJI = null;
                    return;
                }
                if (!z) {
                    LJIILJJIL();
                } else {
                    requestLayout();
                }
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException(e2);
            }
        }
    }

    public void setCanTouch(boolean z) {
        this.LL = z;
    }

    public void setCurrentItem(int i) {
        this.LLJJJJ = false;
        LJIJI(i, !this.LLLII, false, 0);
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.LLJJJJ = false;
        LJIJI(i, true, true, 1);
    }

    public void setDefaultItem(int i) {
        this.LLIZ = i;
    }

    public void setDisableScroll(boolean z) {
        this.LLLIL = z;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.LLJJJJJIL) {
            this.LLJJJJJIL = i;
            LJIILJJIL();
        }
    }

    public void setPageMargin(int i) {
        int i2 = this.LLJILLL;
        this.LLJILLL = i;
        int height = getHeight();
        LJIILLIIL(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.LLJJ = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.LLLIILIL == i) {
            return;
        }
        this.LLLIILIL = i;
        List<InterfaceC469360Ias> list = this.LLLIIIL;
        if (list != null && !((ArrayList) list).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LLLIIIL).iterator();
            while (it2.hasNext()) {
                ((InterfaceC469360Ias) it2.next()).onPageScrollStateChanged(i);
            }
        }
    }

    public void setScroller(Scroller scroller) {
        this.LLJIJIL = scroller;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.LLJJ) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i));
    }

    public C21597919fl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = new ArrayList<>();
        this.LLILZ = new C21598819fu();
        this.LLILZIL = new Rect();
        this.LLIZLLLIL = -1;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJJIJI = -3.4028235E38f;
        this.LLJJIJIIJIL = Float.MAX_VALUE;
        this.LLJJJJJIL = 1;
        this.LLJZ = -1;
        this.LLLII = true;
        this.LLLIIIL = new ArrayList();
        this.LLLIIL = new ARunnableS131S0100000_31(this, 93);
        this.LLLIILIL = 0;
        this.LLLIL = false;
        this.LL = true;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.LLJIJIL = new Scroller(context2, LLLILZLLLI);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        Method method = C19737612Kg.LIZ;
        this.LLJLIL = viewConfiguration.getScaledPagingTouchSlop();
        this.LLL = (int) (400.0f * f);
        this.LLLF = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLLFZ = new C20097913kP(context2);
        this.LLLI = new C20097913kP(context2);
        this.LLLFF = (int) (25.0f * f);
        this.LLLFFI = (int) (2.0f * f);
        this.LLJJLIIIJLLLLLLLZ = (int) (f * 16.0f);
        q0.LJIJ(this, new C20094213jo() { // from class: X.19fm
            /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
            @Override // X.C20094213jo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onInitializeAccessibilityEvent(android.view.View r4, android.view.accessibility.AccessibilityEvent r5) {
                /*
                    r3 = this;
                    super.onInitializeAccessibilityEvent(r4, r5)
                    java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
                    java.lang.String r0 = r0.getName()
                    r5.setClassName(r0)
                    X.19fs r2 = X.C21598619fs.LIZ()
                    X.19fl r0 = r3.LIZ
                    androidx.viewpager.widget.PagerAdapter r0 = r0.LLILZLL
                    if (r0 == 0) goto L44
                    int r1 = r0.getCount()
                    r0 = 1
                    if (r1 <= r0) goto L44
                L1d:
                    r2.LIZLLL(r0)
                    int r1 = r5.getEventType()
                    r0 = 4096(0x1000, float:5.74E-42)
                    if (r1 != r0) goto L43
                    X.19fl r0 = r3.LIZ
                    androidx.viewpager.widget.PagerAdapter r0 = r0.LLILZLL
                    if (r0 == 0) goto L43
                    int r0 = r0.getCount()
                    r2.LIZJ(r0)
                    X.19fl r0 = r3.LIZ
                    int r0 = r0.LLIZ
                    r2.LIZIZ(r0)
                    X.19fl r0 = r3.LIZ
                    int r0 = r0.LLIZ
                    r2.LJ(r0)
                L43:
                    return
                L44:
                    r0 = 0
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21598019fm.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
            }

            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                boolean z;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
                PagerAdapter pagerAdapter = this.LIZ.LLILZLL;
                if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfoCompat.setScrollable(z);
                if (this.LIZ.canScrollVertically(1)) {
                    accessibilityNodeInfoCompat.addAction(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                }
                if (this.LIZ.canScrollVertically(-1)) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
            }

            @Override // X.C20094213jo
            public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i != 8192 || !this.LIZ.canScrollVertically(-1)) {
                        return false;
                    }
                    C21597919fl c21597919fl = this.LIZ;
                    c21597919fl.setCurrentItem(c21597919fl.LLIZ - 1);
                    return true;
                }
                if (!this.LIZ.canScrollVertically(1)) {
                    return false;
                }
                C21597919fl c21597919fl2 = this.LIZ;
                c21597919fl2.setCurrentItem(c21597919fl2.LLIZ + 1);
                return true;
            }
        });
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C14K9.LJIJJ(this, new C20309014dM(this, 0));
    }

    public final C21598819fu LIZ(int i, int i2) {
        C21598819fu c21598819fu = new C21598819fu();
        c21598819fu.LIZIZ = i;
        c21598819fu.LIZ = this.LLILZLL.LJJI(i, this);
        c21598819fu.LIZLLL = this.LLILZLL.LJIL(i);
        if (i2 >= 0 && i2 < this.LLILLL.size()) {
            ListProtector.add(this.LLILLL, i2, c21598819fu);
            return c21598819fu;
        }
        this.LLILLL.add(c21598819fu);
        return c21598819fu;
    }

    public final Rect LJI(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        Object parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            View view2 = (View) parent;
            rect.left += view2.getLeft();
            rect.right += view2.getRight();
            rect.top += view2.getTop();
            rect.bottom += view2.getBottom();
            parent = view2.getParent();
        }
        return rect;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return ((C21598319fp) ((View) ListProtector.get(null, i2)).getLayoutParams()).LJFF;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        C21598319fp c21598319fp;
        C21598319fp c21598319fp2;
        boolean z;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredHeight = getMeasuredHeight();
        this.LLJL = Math.min(measuredHeight / 10, this.LLJJLIIIJLLLLLLLZ);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c21598319fp2 = (C21598319fp) childAt.getLayoutParams()) != null && c21598319fp2.LIZ) {
                int i6 = c21598319fp2.LIZIZ;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                if (i8 != 48 && i8 != 80) {
                    z = false;
                } else {
                    z = true;
                }
                if (i7 != 3 && i7 != 5) {
                    z2 = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else if (z2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) c21598319fp2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = measuredWidth;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = measuredWidth;
                }
                int i11 = ((ViewGroup.LayoutParams) c21598319fp2).height;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingTop;
                    }
                } else {
                    i11 = paddingTop;
                    i5 = i3;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    paddingTop -= childAt.getMeasuredHeight();
                } else if (z2) {
                    measuredWidth -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.LLJJIJIL = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.LLJJJ = true;
        LJIILJJIL();
        this.LLJJJ = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c21598319fp = (C21598319fp) childAt2.getLayoutParams()) == null || !c21598319fp.LIZ)) {
                childAt2.measure(this.LLJJIJIL, View.MeasureSpec.makeMeasureSpec((int) (paddingTop * c21598319fp.LIZJ), 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C21598819fu c21598819fuLJII;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            childCount = -1;
            i3 = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (c21598819fuLJII = LJII(childAt)) != null && c21598819fuLJII.LIZIZ == this.LLIZ && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(int r10, float r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.LLLIIIIL
            if (r0 <= 0) goto L6b
            int r8 = r9.getScrollY()
            int r5 = r9.getPaddingTop()
            int r7 = r9.getPaddingBottom()
            int r6 = r9.getHeight()
            int r4 = r9.getChildCount()
            r3 = 0
        L19:
            if (r3 >= r4) goto L6b
            android.view.View r2 = r9.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.19fp r1 = (X.C21598319fp) r1
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L46
            int r0 = r1.LIZIZ
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L5c
            r0 = 48
            if (r1 == r0) goto L56
            r0 = 80
            if (r1 == r0) goto L49
            r0 = r5
        L3a:
            int r5 = r5 + r8
            int r1 = r2.getTop()
            int r5 = r5 - r1
            if (r5 == 0) goto L45
            r2.offsetTopAndBottom(r5)
        L45:
            r5 = r0
        L46:
            int r3 = r3 + 1
            goto L19
        L49:
            int r1 = r6 - r7
            int r0 = r2.getMeasuredHeight()
            int r1 = r1 - r0
            int r0 = r2.getMeasuredHeight()
            int r7 = r7 + r0
            goto L68
        L56:
            int r0 = r2.getHeight()
            int r0 = r0 + r5
            goto L3a
        L5c:
            int r0 = r2.getMeasuredHeight()
            int r0 = r6 - r0
            int r0 = r0 / 2
            int r1 = java.lang.Math.max(r0, r5)
        L68:
            r0 = r5
            r5 = r1
            goto L3a
        L6b:
            java.util.List<X.0Ias> r0 = r9.LLLIIIL
            if (r0 == 0) goto L8f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L8f
            java.util.List<X.0Ias> r0 = r9.LLLIIIL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L7f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r1.next()
            X.0Ias r0 = (X.InterfaceC469360Ias) r0
            r0.onPageScrolled(r10, r11, r12)
            goto L7f
        L8f:
            r0 = 1
            r9.LLLIIII = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21597919fl.LJIIJ(int, float, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C21598819fu c21598819fuLJII;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c21598819fuLJII = LJII(childAt)) != null && c21598819fuLJII.LIZIZ == this.LLIZ) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, byte] */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C21598319fp c21598319fp = (C21598319fp) layoutParams;
        ?? r1 = c21598319fp.LIZ ? (byte) 1 : (byte) 0;
        c21598319fp.LIZ = r1;
        if (this.LLJJJ) {
            if (r1 == 0) {
                c21598319fp.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    public final int LJFF(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) > this.LLLFF && Math.abs(i2) > this.LLL) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            if (i >= this.LLIZ) {
                f2 = 0.6f;
            } else {
                f2 = 0.4f;
            }
            i = (int) (i + f + f2);
        }
        if (this.LLILLL.size() > 0) {
            return Math.max(((C21598819fu) ListProtector.get(this.LLILLL, 0)).LIZIZ, Math.min(i, ((C21598819fu) ListProtector.get(this.LLILLL, r1.size() - 1)).LIZIZ));
        }
        return i;
    }

    public final void LJIILLIIL(int i, int i2, int i3, int i4) {
        float fMin;
        if (i2 > 0 && !this.LLILLL.isEmpty()) {
            if (!this.LLJIJIL.isFinished()) {
                this.LLJIJIL.setFinalY(getCurrentItem() * getClientHeight());
                return;
            }
            scrollTo(getScrollX(), (int) ((getScrollY() / (((i2 - getPaddingTop()) - getPaddingBottom()) + i4)) * (((i - getPaddingTop()) - getPaddingBottom()) + i3)));
            return;
        }
        C21598819fu c21598819fuLJIIIZ = LJIIIZ(this.LLIZ);
        if (c21598819fuLJIIIZ != null) {
            fMin = Math.min(c21598819fuLJIIIZ.LJ, this.LLJJIJIIJIL);
        } else {
            fMin = 0.0f;
        }
        int paddingTop = (int) (fMin * ((i - getPaddingTop()) - getPaddingBottom()));
        if (paddingTop == getScrollY()) {
            return;
        }
        LIZLLL(false);
        scrollTo(getScrollX(), paddingTop);
    }

    public final void LJIJ(int i, boolean z, int i2, boolean z2) {
        int clientHeight;
        List<InterfaceC469360Ias> list;
        int scrollY;
        int iAbs;
        List<InterfaceC469360Ias> list2;
        C21598819fu c21598819fuLJIIIZ = LJIIIZ(i);
        if (c21598819fuLJIIIZ != null) {
            clientHeight = (int) (getClientHeight() * Math.max(this.LLJJIJI, Math.min(c21598819fuLJIIIZ.LJ, this.LLJJIJIIJIL)));
        } else {
            clientHeight = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.LLJIJIL;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.LLJILJIL) {
                        scrollY = this.LLJIJIL.getCurrY();
                    } else {
                        scrollY = this.LLJIJIL.getStartY();
                    }
                    this.LLJIJIL.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollY = getScrollY();
                }
                int scrollX = getScrollX();
                int i3 = -scrollX;
                int i4 = clientHeight - scrollY;
                if (i3 == 0 && i4 == 0) {
                    LIZLLL(false);
                    LJIILJJIL();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientHeight2 = getClientHeight();
                    float f = clientHeight2;
                    float f2 = clientHeight2 / 2;
                    float fSin = f2 + (((float) Math.sin((float) (((double) (Math.min(1.0f, (Math.abs(i3) * 1.0f) / f) - 0.5f)) * 0.4712389167638204d))) * f2);
                    int iAbs2 = Math.abs(i2);
                    if (iAbs2 > 0) {
                        iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                    } else {
                        iAbs = (int) (((Math.abs(i3) / ((f * this.LLILZLL.LJIL(this.LLIZ)) + this.LLJILLL)) + 1.0f) * 100.0f);
                    }
                    int iMin = Math.min(iAbs, 600);
                    this.LLJILJIL = false;
                    this.LLJIJIL.startScroll(scrollX, scrollY, i3, i4, iMin);
                    postInvalidateOnAnimation();
                }
            }
            if (z2 && (list2 = this.LLLIIIL) != null && !((ArrayList) list2).isEmpty()) {
                Iterator it2 = ((ArrayList) this.LLLIIIL).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC469360Ias) it2.next()).onPageSelected(i);
                }
                return;
            }
            return;
        }
        if (z2 && (list = this.LLLIIIL) != null && !((ArrayList) list).isEmpty()) {
            Iterator it3 = ((ArrayList) this.LLLIIIL).iterator();
            while (it3.hasNext()) {
                ((InterfaceC469360Ias) it3.next()).onPageSelected(i);
            }
        }
        LIZLLL(false);
        scrollTo(0, clientHeight);
        LJIIL(clientHeight);
    }

    public final void LJIJI(int i, boolean z, boolean z2, int i2) {
        List<InterfaceC469360Ias> list;
        PagerAdapter pagerAdapter = this.LLILZLL;
        boolean z3 = false;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            if (!z2 && this.LLIZ == i && this.LLILLL.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.LLILZLL.getCount()) {
                i = this.LLILZLL.getCount() - 1;
            }
            int i3 = this.LLJJJJJIL;
            int i4 = this.LLIZ;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.LLILLL.size(); i5++) {
                    ((C21598819fu) ListProtector.get(this.LLILLL, i5)).LIZJ = true;
                }
            }
            if (this.LLIZ != i) {
                z3 = true;
            }
            if (this.LLLII) {
                this.LLIZ = i;
                if (z3 && (list = this.LLLIIIL) != null && !((ArrayList) list).isEmpty()) {
                    Iterator it2 = ((ArrayList) this.LLLIIIL).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC469360Ias) it2.next()).onPageSelected(i);
                    }
                }
                requestLayout();
                return;
            }
            LJIILL(i);
            LJIJ(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.LLJILLL;
            LJIILLIIL(i2, i4, i5, i5);
        }
    }

    public static boolean LIZJ(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i3 + scrollY;
                if (i5 >= childAt.getTop() && i5 < childAt.getBottom() && (i4 = i2 + scrollX) >= childAt.getLeft() && i4 < childAt.getRight() && LIZJ(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollVertically(-i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21597919fl.onLayout(boolean, int, int, int, int):void");
    }
}
