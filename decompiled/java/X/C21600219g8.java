package X;

import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
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
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.performanceopt.api.IOptimizerHelperService;
import dmt.viewpager.DmtViewPager$SavedState;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import u4.q0;

/* JADX INFO: renamed from: X.19g8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21600219g8 extends ViewGroup implements InterfaceC21604919gt {
    public static final int[] LLLLLLZ = {R.attr.layout_gravity};
    public static final C21601419gK LLLLLLZZ = new Comparator<C21601319gJ>() { // from class: X.19gK
        @Override // java.util.Comparator
        public final int compare(C21601319gJ c21601319gJ, C21601319gJ c21601319gJ2) {
            return c21601319gJ.LIZIZ - c21601319gJ2.LIZIZ;
        }
    };
    public static final InterpolatorC21604419go LLLLLZ = new Interpolator() { // from class: X.19go
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public static final C21601219gI LLLLLZIL = new Comparator<View>() { // from class: X.19gI
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            C21600619gC c21600619gC = (C21600619gC) view.getLayoutParams();
            C21600619gC c21600619gC2 = (C21600619gC) view2.getLayoutParams();
            boolean z = c21600619gC.LIZ;
            if (z != c21600619gC2.LIZ) {
                if (z) {
                    return 1;
                }
                return -1;
            }
            return c21600619gC.LJ - c21600619gC2.LJ;
        }
    };
    public boolean LL;
    public final C21600319g9 LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public int LLJILLL;
    public final ArrayList<C21601319gJ> LLJJ;
    public final C21601319gJ LLJJI;
    public final Rect LLJJIII;
    public PagerAdapter LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public Parcelable LLJJJ;
    public ClassLoader LLJJJIL;
    public Scroller LLJJJJ;
    public boolean LLJJJJJIL;
    public C21603719gh LLJJJJLIIL;
    public int LLJJL;
    public Drawable LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public float LLJLILLLLZIIL;
    public float LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public int LLL;
    public boolean LLLF;
    public boolean LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public float LLLII;
    public float LLLIIII;
    public float LLLIIIIL;
    public float LLLIIIL;
    public int LLLIIL;
    public VelocityTracker LLLIILIL;
    public int LLLIL;
    public int LLLILZ;
    public int LLLILZJ;
    public int LLLILZLLLI;
    public boolean LLLIZZ;
    public long LLLJ;
    public boolean LLLJIL;
    public boolean LLLJL;
    public int LLLL;
    public CopyOnWriteArrayList<InterfaceC469360Ias> LLLLII;
    public InterfaceC469360Ias LLLLIIIILLL;
    public List<C19XY> LLLLIIL;
    public InterfaceC1590660rUm LLLLIILL;
    public InterfaceC19471211Fu LLLLIILLL;
    public int LLLLIL;
    public int LLLLILI;
    public float LLLLJ;
    public int LLLLJI;
    public ArrayList<View> LLLLL;
    public final C21601719gN LLLLLIL;
    public final RunnableC21601119gH LLLLLILLIL;
    public int LLLLLJIL;
    public boolean LLLLLJLJLL;
    public int LLLLLL;
    public int LLLLLLIL;
    public boolean LLLLLLJ;
    public View LLLLLLL;
    public final boolean LLLLLLLLL;
    public InterfaceC719740SLc LLLLLLLLLL;
    public CopyOnWriteArrayList<InterfaceC1055440dZW> LLLLLLLZIL;
    public EdgeEffect mLeftEdge;
    public EdgeEffect mRightEdge;

    private boolean LJJIIZ() {
        this.LLLIIL = -1;
        this.LLLF = false;
        this.LLLFF = false;
        VelocityTracker velocityTracker = this.LLLIILIL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LLLIILIL = null;
        }
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    public float LJIILL(float f, float f2) {
        return f - f2;
    }

    public final void LJIJI() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.LLJJJJ = new Scroller(context, LLLLLZ);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.LLLI = viewConfiguration.getScaledPagingTouchSlop();
        this.LLLIL = (int) (400.0f * f);
        this.LLLILZ = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.LLLILZJ = (int) (25.0f * f);
        this.LLLILZLLLI = (int) (2.0f * f);
        this.LLLFFI = (int) (f * 16.0f);
        q0.LJIJ(this, new C20094213jo() { // from class: X.147R
            /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
            @Override // X.C20094213jo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onInitializeAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                /*
                    r2 = this;
                    super.onInitializeAccessibilityEvent(r3, r4)
                    java.lang.Class<X.147R> r0 = X.C147R.class
                    java.lang.String r0 = r0.getName()
                    r4.setClassName(r0)
                    X.19g8 r0 = r2.LIZ
                    androidx.viewpager.widget.PagerAdapter r0 = r0.LLJJIJI
                    if (r0 == 0) goto L40
                    int r1 = r0.getCount()
                    r0 = 1
                    if (r1 <= r0) goto L40
                L19:
                    r4.setScrollable(r0)
                    int r1 = r4.getEventType()
                    r0 = 4096(0x1000, float:5.74E-42)
                    if (r1 != r0) goto L3f
                    X.19g8 r0 = r2.LIZ
                    androidx.viewpager.widget.PagerAdapter r0 = r0.LLJJIJI
                    if (r0 == 0) goto L3f
                    int r0 = r0.getCount()
                    r4.setItemCount(r0)
                    X.19g8 r0 = r2.LIZ
                    int r0 = r0.LLJJIJIIJIL
                    r4.setFromIndex(r0)
                    X.19g8 r0 = r2.LIZ
                    int r0 = r0.LLJJIJIIJIL
                    r4.setToIndex(r0)
                L3f:
                    return
                L40:
                    r0 = 0
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C147R.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
            }

            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                boolean z;
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(C147R.class.getName());
                PagerAdapter pagerAdapter = this.LIZ.LLJJIJI;
                if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityNodeInfoCompat.setScrollable(z);
                if (this.LIZ.canScrollHorizontally(1)) {
                    accessibilityNodeInfoCompat.addAction(SpeechEngineDefines.TTS_WORK_MODE_BOTH);
                }
                if (this.LIZ.canScrollHorizontally(-1)) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
            }

            @Override // X.C20094213jo
            public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i != 8192 || !this.LIZ.canScrollHorizontally(-1)) {
                        return false;
                    }
                    C21600219g8 c21600219g8 = this.LIZ;
                    c21600219g8.setCurrentItem(c21600219g8.LLJJIJIIJIL - 1);
                    return true;
                }
                if (!this.LIZ.canScrollHorizontally(1)) {
                    return false;
                }
                C21600219g8 c21600219g82 = this.LIZ;
                c21600219g82.setCurrentItem(c21600219g82.LLJJIJIIJIL + 1);
                return true;
            }
        });
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C14K9.LJIJJ(this, new C0TVI() { // from class: X.14KC
            public final Rect LL = new Rect();

            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                C20246014Ju c20246014JuLJIIL = q0.LJIIL(view, c20246014Ju);
                if (c20246014JuLJIIL.LJII()) {
                    return c20246014JuLJIIL;
                }
                Rect rect = this.LL;
                rect.left = c20246014JuLJIIL.LIZLLL();
                rect.top = c20246014JuLJIIL.LJFF();
                rect.right = c20246014JuLJIIL.LJ();
                rect.bottom = c20246014JuLJIIL.LIZJ();
                int childCount = this.LLILLJJLI.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C20246014Ju c20246014JuLIZJ = q0.LIZJ(this.LLILLJJLI.getChildAt(i), c20246014JuLJIIL);
                    rect.left = Math.min(c20246014JuLIZJ.LIZLLL(), rect.left);
                    rect.top = Math.min(c20246014JuLIZJ.LJFF(), rect.top);
                    rect.right = Math.min(c20246014JuLIZJ.LJ(), rect.right);
                    rect.bottom = Math.min(c20246014JuLIZJ.LIZJ(), rect.bottom);
                }
                return c20246014JuLJIIL.LJIIIZ(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.LLJJJJJIL = true;
        if (this.LLJJJJ.isFinished() || !this.LLJJJJ.computeScrollOffset()) {
            LJII(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.LLJJJJ.getCurrX();
        int currY = this.LLJJJJ.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!LJJI(currX)) {
                this.LLJJJJ.abortAnimation();
                scrollTo(0, currY);
            }
        }
        postInvalidateOnAnimation();
    }

    public void setExpPageOffset(float f) {
    }

    private void LJJIJLIJ() {
        if (this.LLLLJI != 0) {
            ArrayList<View> arrayList = this.LLLLL;
            if (arrayList == null) {
                this.LLLLL = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.LLLLL.add(getChildAt(i));
            }
            Collections.sort(this.LLLLL, LLLLLZIL);
        }
    }

    public final boolean LJFF() {
        if (this.LLLF) {
            return false;
        }
        this.LLLIZZ = true;
        setScrollState(1);
        this.LLLII = 0.0f;
        this.LLLIIIIL = 0.0f;
        VelocityTracker velocityTracker = this.LLLIILIL;
        if (velocityTracker == null) {
            this.LLLIILIL = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.LLLIILIL.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.LLLJ = jUptimeMillis;
        return true;
    }

    public final void LJIIIIZZ() {
        int count = this.LLJJIJI.getCount();
        this.LLJILLL = count;
        boolean z = this.LLJJ.size() < (this.LLL * 2) + 1 && this.LLJJ.size() < count;
        int iMax = this.LLJJIJIIJIL;
        int i = 0;
        boolean z2 = false;
        while (i < this.LLJJ.size()) {
            C21601319gJ c21601319gJ = (C21601319gJ) ListProtector.get(this.LLJJ, i);
            int iLJIJJ = this.LLJJIJI.LJIJJ(c21601319gJ.LIZ);
            if (iLJIJJ != -1) {
                if (iLJIJJ == -2) {
                    ListProtector.remove(this.LLJJ, i);
                    i--;
                    if (!z2) {
                        this.LLJJIJI.LJJIJIIJI(this);
                        z2 = true;
                    }
                    this.LLJJIJI.LJIIZILJ(this, c21601319gJ.LIZIZ, c21601319gJ.LIZ);
                    int i2 = this.LLJJIJIIJIL;
                    if (i2 == c21601319gJ.LIZIZ) {
                        iMax = Math.max(0, Math.min(i2, (-1) + count));
                    }
                } else {
                    int i3 = c21601319gJ.LIZIZ;
                    if (i3 != iLJIJJ) {
                        if (i3 == this.LLJJIJIIJIL) {
                            iMax = iLJIJJ;
                        }
                        c21601319gJ.LIZIZ = iLJIJJ;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.LLJJIJI.LJIJI(this);
        }
        Collections.sort(this.LLJJ, LLLLLLZZ);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C21600619gC c21600619gC = (C21600619gC) getChildAt(i4).getLayoutParams();
                if (!c21600619gC.LIZ) {
                    c21600619gC.LIZJ = 0.0f;
                }
            }
            LJJIJIIJI(iMax, false, true, 0);
            requestLayout();
        }
    }

    public final void LJIIL() {
        if (!this.LLLIZZ) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.LLJJIJI != null) {
            VelocityTracker velocityTracker = this.LLLIILIL;
            velocityTracker.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, this.LLLILZ);
            int xVelocity = (int) velocityTracker.getXVelocity(this.LLLIIL);
            this.LLJZIJLIL = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C21601319gJ c21601319gJLJIIZILJ = LJIIZILJ();
            LJJIJIIJI(LJIIIZ(c21601319gJLJIIZILJ.LIZIZ, ((scrollX / clientWidth) - c21601319gJLJIIZILJ.LJ) / c21601319gJLJIIZILJ.LIZLLL, xVelocity, (int) (this.LLLII - this.LLLIIIIL)), true, true, xVelocity);
        }
        this.LLLF = false;
        this.LLLFF = false;
        VelocityTracker velocityTracker2 = this.LLLIILIL;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.LLLIILIL = null;
        }
        this.LLLIZZ = false;
    }

    public final boolean LJJ() {
        PagerAdapter pagerAdapter = this.LLJJIJI;
        if (pagerAdapter == null || this.LLJJIJIIJIL >= pagerAdapter.getCount() - 1) {
            return false;
        }
        LLFFF(this.LLJJIJIIJIL + 1, true);
        return true;
    }

    public final void LJJIII() {
        LJJII(this.LLJJIJIIJIL);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C21600619gC();
    }

    public Boolean getMIsActionFling() {
        return Boolean.valueOf(this.LLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IOptimizerHelperService iOptimizerHelperService;
        C21602719gX c21602719gX;
        HandlerHook.viewRemoveCallbacks(this, this.LLLLLILLIL);
        Scroller scroller = this.LLJJJJ;
        if (scroller != null && !scroller.isFinished()) {
            this.LLJJJJ.abortAnimation();
        }
        this.LLLLLLL = null;
        this.LLIZ = false;
        C21601719gN c21601719gN = this.LLLLLIL;
        c21601719gN.getClass();
        if (((Boolean) C21606019h4.LJ.getValue()).booleanValue() && (iOptimizerHelperService = c21601719gN.LJIILLIIL) != null && (c21602719gX = c21601719gN.LJIIZILJ) != null) {
            iOptimizerHelperService.LJI(c21602719gX);
            c21601719gN.LJIIZILJ = null;
        }
        super.onDetachedFromWindow();
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public final C21601319gJ LJIIZILJ() {
        float scrollX;
        float f;
        int i;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        if (clientWidth > 0) {
            scrollX = getScrollX() / clientWidth;
            f = this.LLJJL / clientWidth;
        } else {
            scrollX = 0.0f;
            f = 0.0f;
        }
        C21601319gJ c21601319gJ = null;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.LLJJ.size()) {
            C21601319gJ c21601319gJ2 = (C21601319gJ) ListProtector.get(this.LLJJ, i2);
            if (!z && c21601319gJ2.LIZIZ != (i = i3 + 1)) {
                c21601319gJ2 = this.LLJJI;
                c21601319gJ2.LJ = f2 + f3 + f;
                c21601319gJ2.LIZIZ = i;
                c21601319gJ2.LIZLLL = this.LLJJIJI.LJIL(i);
                i2--;
            }
            f2 = c21601319gJ2.LJ;
            float f4 = c21601319gJ2.LIZLLL + f2 + f;
            if (!z && scrollX < f2) {
                return c21601319gJ;
            }
            if (scrollX < f4 || i2 == this.LLJJ.size() - 1) {
                return c21601319gJ2;
            }
            i3 = c21601319gJ2.LIZIZ;
            f3 = c21601319gJ2.LIZLLL;
            i2++;
            z = false;
            c21601319gJ = c21601319gJ2;
        }
        return c21601319gJ;
    }

    public final void LJIJJ() {
        View view;
        if (getAdapter().getCount() == 3) {
            for (int i = 0; i < this.LLJJ.size(); i++) {
                if ((((C21601319gJ) ListProtector.get(this.LLJJ, i)).LIZ instanceof Fragment) && (view = ((Fragment) ((C21601319gJ) ListProtector.get(this.LLJJ, i)).LIZ).getView()) != null) {
                    view.getLayoutParams();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LLJJLIIIJLLLLLLLZ;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLJIL = true;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        DmtViewPager$SavedState dmtViewPager$SavedState = new DmtViewPager$SavedState(super.onSaveInstanceState());
        dmtViewPager$SavedState.LL = this.LLJJIJIIJIL;
        PagerAdapter pagerAdapter = this.LLJJIJI;
        if (pagerAdapter != null) {
            dmtViewPager$SavedState.LLILLJJLI = pagerAdapter.LJJIIJ();
        }
        return dmtViewPager$SavedState;
    }

    public PagerAdapter getAdapter() {
        return this.LLJJIJI;
    }

    public int getCurrentItem() {
        return this.LLJJIJIIJIL;
    }

    public int getOffscreenPageLimit() {
        return this.LLL;
    }

    public int getPageMargin() {
        return this.LLJJL;
    }

    public Scroller getScroller() {
        return this.LLJJJJ;
    }

    public C21600219g8(Context context) {
        super(context);
        this.LLILLJJLI = new C21600319g9();
        this.LLILLL = true;
        this.LLILZ = true;
        this.LLILZIL = true;
        this.LLILZLL = true;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = 0.0f;
        this.LLJI = 0.0f;
        this.LLJIJIL = -1.0f;
        this.LLJILJIL = false;
        this.LLJILJILJ = 0.0f;
        this.LLJJ = new ArrayList<>();
        this.LLJJI = new C21601319gJ();
        this.LLJJIII = new Rect();
        this.LLJJIJIL = -1;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJLILLLLZIIL = -3.4028235E38f;
        this.LLJLL = Float.MAX_VALUE;
        this.LLL = 1;
        this.LLLIIL = -1;
        this.LLLJIL = true;
        this.LLLLILI = -1;
        this.LLLLJ = 0.0f;
        this.LLLLLIL = new C21601719gN(this, 0);
        this.LLLLLILLIL = new RunnableC21601119gH(this);
        this.LLLLLJIL = 0;
        this.LLLLLJLJLL = true;
        this.LLLLLL = -1;
        this.LLLLLLIL = -1;
        this.LLLLLLJ = false;
        this.LLLLLLL = null;
        this.LLLLLLLLL = C293590Bf3.LIZ();
        LJIJI();
    }

    private void LJII(boolean z) {
        boolean z2;
        if (this.LLLLLJIL == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.LLJJJJ.isFinished()) {
                this.LLJJJJ.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.LLJJJJ.getCurrX();
                int currY = this.LLJJJJ.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        LJJI(currX);
                    }
                }
            } else if (this.LLJJJJ.getCurrX() != getScrollX()) {
                scrollTo(this.LLJJJJ.getCurrX(), this.LLJJJJ.getCurrY());
            }
        } else {
            z2 = false;
        }
        this.LLJZIJLIL = false;
        for (int i = 0; i < this.LLJJ.size(); i++) {
            C21601319gJ c21601319gJ = (C21601319gJ) ListProtector.get(this.LLJJ, i);
            if (c21601319gJ.LIZJ) {
                c21601319gJ.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.LLLLLILLIL);
            } else {
                this.LLLLLILLIL.run();
            }
        }
    }

    private void LJIIJ(int i) {
        C21601719gN c21601719gN = this.LLLLLIL;
        if (!c21601719gN.LJI) {
            int i2 = c21601719gN.LJIIL;
            if (i2 == -1) {
                c21601719gN.LJIIL = i;
            } else if (i2 != i) {
                c21601719gN.LJI = true;
            }
        }
        InterfaceC469360Ias interfaceC469360Ias = this.LLLLIIIILLL;
        if (interfaceC469360Ias != null) {
            interfaceC469360Ias.onPageSelected(i);
        }
        if (this.LLLLII != null) {
            for (int i3 = 0; i3 < this.LLLLII.size(); i3++) {
                InterfaceC469360Ias interfaceC469360Ias2 = this.LLLLII.get(i3);
                if (interfaceC469360Ias2 != null) {
                    interfaceC469360Ias2.onPageSelected(i);
                }
            }
        }
    }

    private void LJIL(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLLIIL) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLLII = motionEvent.getX(i);
            this.LLLIIL = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LLLIILIL;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean LJJI(int i) {
        if (this.LLJJ.size() == 0) {
            if (this.LLLJIL) {
                return false;
            }
            this.LLLJL = false;
            LJIJJLI(0, 0.0f, 0);
            if (this.LLLJL) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C21601319gJ c21601319gJLJIIZILJ = LJIIZILJ();
        int clientWidth = getClientWidth();
        int i2 = this.LLJJL;
        int i3 = clientWidth + i2;
        float f = i2;
        float f2 = clientWidth;
        int i4 = c21601319gJLJIIZILJ.LIZIZ;
        float f3 = ((i / f2) - c21601319gJLJIIZILJ.LJ) / (c21601319gJLJIIZILJ.LIZLLL + (f / f2));
        this.LLLJL = false;
        LJIJJLI(i4, f3, (int) (i3 * f3));
        if (this.LLLJL) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean LJJIFFI(float f) {
        boolean z;
        boolean z2;
        float fLJIILL = LJIILL(this.LLLII, f);
        this.LLLII = f;
        float scrollX = getScrollX() + fLJIILL;
        float clientWidth = getClientWidth();
        float f2 = this.LLJLILLLLZIIL * clientWidth;
        float f3 = this.LLJLL * clientWidth;
        boolean z3 = false;
        C21601319gJ c21601319gJ = (C21601319gJ) ListProtector.get(this.LLJJ, 0);
        ArrayList<C21601319gJ> arrayList = this.LLJJ;
        C21601319gJ c21601319gJ2 = (C21601319gJ) ListProtector.get(arrayList, arrayList.size() - 1);
        if (c21601319gJ.LIZIZ != 0) {
            f2 = c21601319gJ.LJ * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c21601319gJ2.LIZIZ != this.LLJJIJI.getCount() - 1) {
            f3 = c21601319gJ2.LJ * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f2) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f2 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f2;
        } else if (scrollX > f3) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f3) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        }
        int i = (int) scrollX;
        this.LLLII += scrollX - i;
        scrollTo(i, getScrollY());
        LJJI(i);
        return z3;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.LLJZ != z) {
            this.LLJZ = z;
        }
    }

    @Override // X.InterfaceC21604919gt
    public final View LIZ(int i) {
        return getChildAt(i);
    }

    @Override // X.InterfaceC21604919gt
    public final boolean LIZIZ(View view) {
        C21601319gJ c21601319gJLJIILLIIL = LJIILLIIL(view);
        if (c21601319gJLJIILLIIL == null || c21601319gJLJIILLIIL.LIZIZ == this.LLJJIJIIJIL) {
            return true;
        }
        return false;
    }

    public void LIZLLL(InterfaceC469360Ias interfaceC469360Ias) {
        if (this.LLLLII == null) {
            this.LLLLII = new CopyOnWriteArrayList<>();
        }
        this.LLLLII.add(interfaceC469360Ias);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(int r7) {
        /*
            r6 = this;
            android.view.View r3 = r6.findFocus()
            r5 = 1
            r2 = 0
            if (r3 == r6) goto L29
            if (r3 == 0) goto L2a
            android.view.ViewParent r1 = r3.getParent()
        Le:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L19
            if (r1 == r6) goto L2a
            android.view.ViewParent r1 = r1.getParent()
            goto Le
        L19:
            android.view.ViewParent r1 = r3.getParent()
        L1d:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L29
            r1.getClass()
            android.view.ViewParent r1 = r1.getParent()
            goto L1d
        L29:
            r3 = 0
        L2a:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r4 = r0.findNextFocus(r6, r3, r7)
            r1 = 66
            r0 = 17
            if (r4 == 0) goto L88
            if (r4 == r3) goto L88
            if (r7 != r0) goto L68
            android.graphics.Rect r0 = r6.LLJJIII
            android.graphics.Rect r0 = r6.LJIILJJIL(r0, r4)
            int r1 = r0.left
            android.graphics.Rect r0 = r6.LLJJIII
            android.graphics.Rect r0 = r6.LJIILJJIL(r0, r3)
            int r0 = r0.left
            if (r3 == 0) goto L63
            if (r1 < r0) goto L63
            int r0 = r6.LLJJIJIIJIL
            if (r0 <= 0) goto L9f
            int r0 = r0 - r5
            r6.LLFFF(r0, r5)
        L58:
            r2 = r5
        L59:
            if (r2 == 0) goto L62
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r0)
        L62:
            return r2
        L63:
            boolean r2 = r4.requestFocus()
            goto L59
        L68:
            if (r7 != r1) goto L62
            android.graphics.Rect r0 = r6.LLJJIII
            android.graphics.Rect r0 = r6.LJIILJJIL(r0, r4)
            int r1 = r0.left
            android.graphics.Rect r0 = r6.LLJJIII
            android.graphics.Rect r0 = r6.LJIILJJIL(r0, r3)
            int r0 = r0.left
            if (r3 == 0) goto L83
            if (r1 > r0) goto L83
            boolean r2 = r6.LJJ()
            goto L59
        L83:
            boolean r2 = r4.requestFocus()
            goto L59
        L88:
            if (r7 == r0) goto L96
            if (r7 == r5) goto L96
            if (r7 == r1) goto L91
            r0 = 2
            if (r7 != r0) goto L62
        L91:
            boolean r2 = r6.LJJ()
            goto L59
        L96:
            int r0 = r6.LLJJIJIIJIL
            if (r0 <= 0) goto L9f
            int r0 = r0 - r5
            r6.LLFFF(r0, r5)
            goto L58
        L9f:
            r5 = 0
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21600219g8.LJ(int):boolean");
    }

    public final void LJIILIIL(float f) {
        if (this.LLLIZZ) {
            if (this.LLJJIJI == null) {
                return;
            }
            this.LLLII += f;
            float scrollX = getScrollX() - f;
            float clientWidth = getClientWidth();
            float f2 = this.LLJLILLLLZIIL * clientWidth;
            float f3 = this.LLJLL * clientWidth;
            C21601319gJ c21601319gJ = (C21601319gJ) ListProtector.get(this.LLJJ, 0);
            C21601319gJ c21601319gJ2 = (C21601319gJ) ListProtector.get(this.LLJJ, r1.size() - 1);
            if (c21601319gJ.LIZIZ != 0) {
                f2 = c21601319gJ.LJ * clientWidth;
            }
            if (c21601319gJ2.LIZIZ != this.LLJJIJI.getCount() - 1) {
                f3 = c21601319gJ2.LJ * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.LLLII += scrollX - i;
            scrollTo(i, getScrollY());
            LJJI(i);
            MotionEvent motionEventObtain = MotionEvent.obtain(this.LLLJ, SystemClock.uptimeMillis(), 2, this.LLLII, 0.0f, 0);
            this.LLLIILIL.addMovement(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public final C21601319gJ LJIILLIIL(View view) {
        for (int i = 0; i < this.LLJJ.size(); i++) {
            C21601319gJ c21601319gJ = (C21601319gJ) ListProtector.get(this.LLJJ, i);
            if (this.LLJJIJI.LJJIFFI(view, c21601319gJ.LIZ)) {
                return c21601319gJ;
            }
        }
        return null;
    }

    public final C21601319gJ LJIJ(int i) {
        for (int i2 = 0; i2 < this.LLJJ.size(); i2++) {
            C21601319gJ c21601319gJ = (C21601319gJ) ListProtector.get(this.LLJJ, i2);
            if (c21601319gJ.LIZIZ == i) {
                return c21601319gJ;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0199 A[PHI: r6 r7
      0x0199: PHI (r6v18 float) = (r6v16 float), (r6v17 float), (r6v15 float) binds: [B:100:0x018e, B:97:0x0174, B:90:0x0156] A[DONT_GENERATE, DONT_INLINE]
      0x0199: PHI (r7v15 int) = (r7v13 int), (r7v14 int), (r7v12 int) binds: [B:100:0x018e, B:97:0x0174, B:90:0x0156] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ea A[PHI: r2 r11 r14
      0x00ea: PHI (r2v16 int) = (r2v15 int), (r2v8 int), (r2v18 int) binds: [B:60:0x00df, B:57:0x00c9, B:50:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r11v11 int) = (r11v1 int), (r11v10 int), (r11v13 int) binds: [B:60:0x00df, B:57:0x00c9, B:50:0x00b1] A[DONT_GENERATE, DONT_INLINE]
      0x00ea: PHI (r14v4 float) = (r14v2 float), (r14v3 float), (r14v1 float) binds: [B:60:0x00df, B:57:0x00c9, B:50:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(int r18) {
        /*
            Method dump skipped, instruction units count: 1055
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21600219g8.LJJII(int):void");
    }

    public void LJJIIJZLJL(InterfaceC469360Ias interfaceC469360Ias) {
        CopyOnWriteArrayList<InterfaceC469360Ias> copyOnWriteArrayList = this.LLLLII;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.remove(interfaceC469360Ias);
        }
    }

    public final void LJJIJIIJIL(InterfaceC19471211Fu interfaceC19471211Fu) {
        boolean z;
        boolean z2;
        boolean z3;
        if (interfaceC19471211Fu != null) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLLLIILLL != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.LLLLIILLL = interfaceC19471211Fu;
        setChildrenDrawingOrderEnabled(z);
        if (z) {
            this.LLLLJI = 1;
            this.LLLLIL = 2;
        } else {
            this.LLLLJI = 0;
        }
        if (z3) {
            LJJIII();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C21601319gJ c21601319gJLJIILLIIL;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c21601319gJLJIILLIIL = LJIILLIIL(childAt)) != null && c21601319gJLJIILLIIL.LIZIZ == this.LLJJIJIIJIL) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.LLJJIJI == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (clientWidth * this.LLJLILLLLZIIL))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollX >= ((int) (clientWidth * this.LLJLL))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C21600619gC) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.LLLLLIL.LIZJ();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zLJ;
        if (!super.dispatchKeyEvent(keyEvent)) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 21) {
                    if (keyCode != 22) {
                        if (keyCode == 61) {
                            if (keyEvent.hasNoModifiers()) {
                                zLJ = LJ(2);
                            } else if (keyEvent.hasModifiers(1)) {
                                zLJ = LJ(1);
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else if (keyEvent.hasModifiers(2)) {
                        zLJ = LJJ();
                    } else {
                        zLJ = LJ(66);
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        int i = this.LLJJIJIIJIL;
                        if (i > 0) {
                            LLFFF(i - 1, true);
                            return true;
                        }
                        return false;
                    }
                    zLJ = LJ(17);
                }
                if (!zLJ) {
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
        C21601319gJ c21601319gJLJIILLIIL;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c21601319gJLJIILLIIL = LJIILLIIL(childAt)) != null && c21601319gJLJIILLIIL.LIZIZ == this.LLJJIJIIJIL && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0061 A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:12:0x001b, B:23:0x0059, B:24:0x0061, B:26:0x0065, B:28:0x009d, B:30:0x0167, B:37:0x0179, B:39:0x018a, B:42:0x0191, B:43:0x0198, B:53:0x01b2, B:40:0x018d, B:54:0x01bb, B:15:0x0027), top: B:57:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x018a A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:12:0x001b, B:23:0x0059, B:24:0x0061, B:26:0x0065, B:28:0x009d, B:30:0x0167, B:37:0x0179, B:39:0x018a, B:42:0x0191, B:43:0x0198, B:53:0x01b2, B:40:0x018d, B:54:0x01bb, B:15:0x0027), top: B:57:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018d A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:12:0x001b, B:23:0x0059, B:24:0x0061, B:26:0x0065, B:28:0x009d, B:30:0x0167, B:37:0x0179, B:39:0x018a, B:42:0x0191, B:43:0x0198, B:53:0x01b2, B:40:0x018d, B:54:0x01bb, B:15:0x0027), top: B:57:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0191 A[Catch: all -> 0x01c0, TryCatch #0 {all -> 0x01c0, blocks: (B:12:0x001b, B:23:0x0059, B:24:0x0061, B:26:0x0065, B:28:0x009d, B:30:0x0167, B:37:0x0179, B:39:0x018a, B:42:0x0191, B:43:0x0198, B:53:0x01b2, B:40:0x018d, B:54:0x01bb, B:15:0x0027), top: B:57:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21600219g8.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.LLJJIJI) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.LLJLILLLLZIIL * width);
                this.mLeftEdge.setSize(height, width);
                zDraw = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.mRightEdge.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.LLJLL + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                zDraw |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
            if (zDraw) {
                postInvalidateOnAnimation();
                return;
            }
            return;
        }
        this.mLeftEdge.finish();
        this.mRightEdge.finish();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C21600619gC(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.LLJJL > 0 && this.LLJJLIIIJLLLLLLLZ != null && this.LLJJ.size() > 0 && this.LLJJIJI != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f2 = this.LLJJL / width;
            int i2 = 0;
            C21601319gJ c21601319gJ = (C21601319gJ) ListProtector.get(this.LLJJ, 0);
            float f3 = c21601319gJ.LJ;
            int size = this.LLJJ.size();
            int i3 = ((C21601319gJ) ListProtector.get(this.LLJJ, size - 1)).LIZIZ;
            for (int i4 = c21601319gJ.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c21601319gJ.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c21601319gJ = (C21601319gJ) ListProtector.get(this.LLJJ, i2);
                }
                if (i4 == i) {
                    float f4 = c21601319gJ.LJ;
                    float f5 = c21601319gJ.LIZLLL;
                    f = (f4 + f5) * width;
                    f3 = f4 + f5 + f2;
                } else {
                    float fLJIL = this.LLJJIJI.LJIL(i4);
                    f = (f3 + fLJIL) * width;
                    f3 += fLJIL + f2;
                }
                if (this.LLJJL + f > scrollX) {
                    this.LLJJLIIIJLLLLLLLZ.setBounds(Math.round(f), this.LLJL, Math.round(this.LLJJL + f), this.LLJLIL);
                    this.LLJJLIIIJLLLLLLLZ.draw(canvas);
                }
                if (f > scrollX + r9) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.LLLF) {
                    return true;
                }
                if (this.LLLFF) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        LJIL(motionEvent);
                    }
                } else {
                    int i = this.LLLIIL;
                    if (i != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(iFindPointerIndex);
                        float f2 = x - this.LLLII;
                        float fAbs = Math.abs(f2);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y - this.LLLIIIL);
                        if (f2 != 0.0f) {
                            float f3 = this.LLLII;
                            if ((f3 >= this.LLLFZ || f2 <= 0.0f) && ((f3 <= getWidth() - this.LLLFZ || f2 >= 0.0f) && LJI(this, false, (int) f2, (int) x, (int) y))) {
                                this.LLLII = x;
                                this.LLLIIII = y;
                                this.LLLFF = true;
                                return false;
                            }
                        }
                        float f4 = this.LLJILJILJ;
                        float f5 = 1.0f;
                        if (f4 > 0.0f) {
                            if (this.LLJILJIL && f4 > 1.0f) {
                                f5 = f4;
                            }
                        } else {
                            f4 = 0.5f;
                        }
                        float f6 = this.LLLI;
                        if (fAbs > f6 && fAbs * f4 > fAbs2) {
                            this.LLLF = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            if (f2 > 0.0f) {
                                f = this.LLLIIIIL + this.LLLI;
                            } else {
                                f = this.LLLIIIIL - this.LLLI;
                            }
                            this.LLLII = f;
                            this.LLLIIII = y;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > f6 * f5) {
                            this.LLLFF = true;
                        }
                        if (this.LLLF) {
                            if (LJJIFFI(x)) {
                                postInvalidateOnAnimation();
                            }
                            this.LLILLJJLI.LIZJ(x, y);
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.LLLIIIIL = x2;
                this.LLLII = x2;
                float y2 = motionEvent.getY();
                this.LLLIIIL = y2;
                this.LLLIIII = y2;
                this.LLLIIL = motionEvent.getPointerId(0);
                this.LLLFF = false;
                this.LLJJJJJIL = true;
                this.LLJJJJ.computeScrollOffset();
                if (this.LLLLLJIL == 2 && Math.abs(this.LLJJJJ.getFinalX() - this.LLJJJJ.getCurrX()) > this.LLLILZLLLI) {
                    this.LLJJJJ.abortAnimation();
                    this.LLJZIJLIL = false;
                    LJJIII();
                    this.LLLF = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    LJII(false);
                    this.LLLF = false;
                }
            }
            if (this.LLLIILIL == null) {
                this.LLLIILIL = VelocityTracker.obtain();
            }
            this.LLLIILIL.addMovement(motionEvent);
            return this.LLLF;
        }
        LJJIIZ();
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DmtViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DmtViewPager$SavedState dmtViewPager$SavedState = (DmtViewPager$SavedState) parcelable;
        super.onRestoreInstanceState(dmtViewPager$SavedState.mSuperState);
        PagerAdapter pagerAdapter = this.LLJJIJI;
        if (pagerAdapter != null) {
            pagerAdapter.LJJIII(dmtViewPager$SavedState.LLILLJJLI, dmtViewPager$SavedState.LLILLL);
            LJJIJIIJI(dmtViewPager$SavedState.LL, false, true, 0);
        } else {
            this.LLJJIJIL = dmtViewPager$SavedState.LL;
            this.LLJJJ = dmtViewPager$SavedState.LLILLJJLI;
            this.LLJJJIL = dmtViewPager$SavedState.LLILLL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21600219g8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LLJLLL) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        boolean zIsAssignableFrom = C0SLZ.class.isAssignableFrom(getClass());
        if (!zIsAssignableFrom) {
            C21594219fA c21594219fA = C788530UwV.LIZIZ;
            LJJIIJZLJL(c21594219fA);
            LIZLLL(c21594219fA);
        }
        if (C788530UwV.LIZ("setDmtViewPagerAdapter") && !zIsAssignableFrom) {
            C2413309cx.LIZ(new C2188231AkX());
        }
        LJJIJ(pagerAdapter, false);
    }

    public void setAllowCreateEndItem(boolean z) {
        this.LLLLLJLJLL = z;
    }

    public void setCanTouchBeforeScrollIdle(boolean z) {
        this.LLILZ = z;
    }

    public void setCurrentItem(int i) {
        this.LLJZIJLIL = false;
        LJJIJIIJI(i, !this.LLLJIL, false, 0);
    }

    public void setDefaultGutterSize(int i) {
        this.LLLFFI = i;
    }

    public void setDragMotionEventListener(InterfaceC1590660rUm interfaceC1590660rUm) {
        this.LLLLIILL = interfaceC1590660rUm;
    }

    public void setEnableTouchSlopMultiple(boolean z) {
        this.LLJILJIL = z;
    }

    public void setExpDuration(int i) {
        this.LLLLILI = i;
    }

    public void setFlingEnabled(boolean z) {
        this.LLILZIL = z;
        this.LLILZLL = z;
    }

    public void setLeftFlingEnabled(boolean z) {
        this.LLILZIL = z;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.LLL) {
            this.LLL = i;
            LJJIII();
        }
    }

    public void setOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        this.LLLLIIIILLL = interfaceC469360Ias;
    }

    public void setOnPageScrollTriggerListener(InterfaceC719740SLc interfaceC719740SLc) {
        this.LLLLLLLLLL = interfaceC719740SLc;
    }

    public void setOptFlingDistanceByRatio(float f) {
        this.LLLLLL = (int) (this.LLLILZJ * f);
    }

    public void setOptForceDetermineTargetPage(boolean z) {
        this.LLLLLLJ = z;
    }

    public void setOptMinimumVelocityByRatio(float f) {
        this.LLLLLLIL = (int) (this.LLLIL * f);
    }

    public void setOptPageChangeOffset(float f) {
        this.LLJ = f;
    }

    public void setOptimizeSlideEnable(boolean z) {
        this.LL = z;
    }

    public void setPageChangeExtOffset(float f) {
        this.LLJI = f;
    }

    public void setPageFlingVelocity(float f) {
        this.LLJIJIL = f;
    }

    public void setPageMargin(int i) {
        int i2 = this.LLJJL;
        this.LLJJL = i;
        int width = getWidth();
        LJJIIJ(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.LLJJLIIIJLLLLLLLZ = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setPageOffset(float f) {
        this.LLLLJ = f;
    }

    public void setRightFlingEnabled(boolean z) {
        this.LLILZLL = z;
    }

    public void setScrollState(int i) {
        boolean z;
        int i2;
        if (this.LLLLLJIL == i) {
            return;
        }
        this.LLLLLJIL = i;
        if (this.LLLLIILLL != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                if (z) {
                    i2 = this.LLLLIL;
                } else {
                    i2 = 0;
                }
                getChildAt(i3).setLayerType(i2, null);
            }
        }
        if (i == 0) {
            this.LLILLL = true;
        }
        InterfaceC469360Ias interfaceC469360Ias = this.LLLLIIIILLL;
        if (interfaceC469360Ias != null) {
            interfaceC469360Ias.onPageScrollStateChanged(i);
        }
        CopyOnWriteArrayList<InterfaceC469360Ias> copyOnWriteArrayList = this.LLLLII;
        if (copyOnWriteArrayList != null) {
            int size = copyOnWriteArrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                InterfaceC469360Ias interfaceC469360Ias2 = this.LLLLII.get(i4);
                if (interfaceC469360Ias2 != null) {
                    interfaceC469360Ias2.onPageScrollStateChanged(i);
                }
            }
        }
        if (i == 1) {
            C21601719gN c21601719gN = this.LLLLLIL;
            if (c21601719gN.LIZIZ()) {
                c21601719gN.LJII();
                return;
            }
            return;
        }
        if (i != 0) {
            return;
        }
        this.LLLLLIL.LIZLLL(false);
    }

    public void setScroller(Scroller scroller) {
        this.LLJJJJ = scroller;
    }

    public void setSlideAngle(int i) {
        if (i > 0 && i < 90) {
            double d = i;
            this.LLJILJILJ = (float) (((double) ((float) Math.sin(Math.toRadians(d)))) / Math.cos(Math.toRadians(d)));
            return;
        }
        this.LLJILJILJ = 0.0f;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.LLJJLIIIJLLLLLLLZ) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C800330VaR.LIZIZ(getContext(), i));
    }

    public C21600219g8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLJJLI = new C21600319g9();
        this.LLILLL = true;
        this.LLILZ = true;
        this.LLILZIL = true;
        this.LLILZLL = true;
        this.LLIZ = false;
        this.LLIZLLLIL = false;
        this.LLJ = 0.0f;
        this.LLJI = 0.0f;
        this.LLJIJIL = -1.0f;
        this.LLJILJIL = false;
        this.LLJILJILJ = 0.0f;
        this.LLJJ = new ArrayList<>();
        this.LLJJI = new C21601319gJ();
        this.LLJJIII = new Rect();
        this.LLJJIJIL = -1;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJLILLLLZIIL = -3.4028235E38f;
        this.LLJLL = Float.MAX_VALUE;
        this.LLL = 1;
        this.LLLIIL = -1;
        this.LLLJIL = true;
        this.LLLLILI = -1;
        this.LLLLJ = 0.0f;
        this.LLLLLIL = new C21601719gN(this, 0);
        this.LLLLLILLIL = new RunnableC21601119gH(this);
        this.LLLLLJIL = 0;
        this.LLLLLJLJLL = true;
        this.LLLLLL = -1;
        this.LLLLLLIL = -1;
        this.LLLLLLJ = false;
        this.LLLLLLL = null;
        this.LLLLLLLLL = C293590Bf3.LIZ();
        LJIJI();
    }

    private Rect LJIILJJIL(Rect rect, View view) {
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

    public static void LJJIJIL(PagerAdapter pagerAdapter, C21603719gh c21603719gh) {
        try {
            Method declaredMethod = PagerAdapter.class.getDeclaredMethod("LJJIIZI", DataSetObserver.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(pagerAdapter, c21603719gh);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final C21601319gJ LIZJ(int i, int i2) {
        C21601319gJ c21601319gJ = new C21601319gJ();
        c21601319gJ.LIZIZ = i;
        c21601319gJ.LIZ = this.LLJJIJI.LJJI(i, this);
        c21601319gJ.LIZLLL = this.LLJJIJI.LJIL(i);
        if (i2 >= 0 && i2 < this.LLJJ.size()) {
            ListProtector.add(this.LLJJ, i2, c21601319gJ);
            return c21601319gJ;
        }
        this.LLJJ.add(c21601319gJ);
        return c21601319gJ;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.19gh] */
    public final void LJJIJ(PagerAdapter pagerAdapter, boolean z) {
        PagerAdapter pagerAdapter2 = this.LLJJIJI;
        if (pagerAdapter2 != null) {
            LJJIJIL(pagerAdapter2, null);
            this.LLJJIJI.LJJIJIIJI(this);
            for (int i = 0; i < this.LLJJ.size(); i++) {
                C21601319gJ c21601319gJ = (C21601319gJ) ListProtector.get(this.LLJJ, i);
                this.LLJJIJI.LJIIZILJ(this, c21601319gJ.LIZIZ, c21601319gJ.LIZ);
            }
            this.LLJJIJI.LJIJI(this);
            this.LLJJ.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C21600619gC) getChildAt(i2).getLayoutParams()).LIZ) {
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.LLJJIJIIJIL = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.LLJJIJI;
        this.LLJJIJI = pagerAdapter;
        this.LLJILLL = 0;
        if (pagerAdapter != null) {
            if (this.LLJJJJLIIL == null) {
                this.LLJJJJLIIL = new DataSetObserver() { // from class: X.19gh
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        this.LIZ.LJIIIIZZ();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        this.LIZ.LJIIIIZZ();
                    }
                };
            }
            LJJIJIL(this.LLJJIJI, this.LLJJJJLIIL);
            this.LLJZIJLIL = false;
            boolean z2 = this.LLLJIL;
            this.LLLJIL = true;
            this.LLJILLL = this.LLJJIJI.getCount();
            if (this.LLJJIJIL >= 0) {
                this.LLJJIJI.LJJIII(this.LLJJJ, this.LLJJJIL);
                LJJIJIIJI(this.LLJJIJIL, false, true, 0);
                this.LLJJIJIL = -1;
                this.LLJJJ = null;
                this.LLJJJIL = null;
            } else if (!z2 && !z) {
                LJJIII();
            } else {
                requestLayout();
            }
        }
        List<C19XY> list = this.LLLLIIL;
        if (list != null && !((ArrayList) list).isEmpty()) {
            int size = ((ArrayList) this.LLLLIIL).size();
            for (int i3 = 0; i3 < size; i3++) {
                ((C19XY) ListProtector.get(this.LLLLIIL, i3)).LIZ(pagerAdapter3, pagerAdapter);
            }
        }
    }

    public void LLFFF(int i, boolean z) {
        this.LLJZIJLIL = false;
        try {
            LJJIJIIJI(i, z, false, 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            TryCatchGuardChecker.doCheck(e);
            if (i < 0) {
                i = 0;
            } else if (i >= this.LLJJIJI.getCount()) {
                i = this.LLJJIJI.getCount() - 1;
            }
            LJJIJIIJI(i, z, false, 0);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.LLLLJI == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C21600619gC) ((View) ListProtector.get(this.LLLLL, i2)).getLayoutParams()).LJFF;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        if (this.LLLLLLLLL && view.getParent() == this && view2 != view) {
            if (this.LLLLLLL == view2) {
                return;
            }
            C21601319gJ c21601319gJLJIILLIIL = LJIILLIIL(view);
            if (c21601319gJLJIILLIIL != null && c21601319gJLJIILLIIL.LIZIZ != getCurrentItem()) {
                this.LLLLLLL = view2;
                return;
            }
        }
        this.LLLLLLL = null;
        super.onDescendantInvalidated(view, view2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        C21600619gC c21600619gC;
        C21600619gC c21600619gC2;
        boolean z;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.LLLFZ = Math.min(measuredWidth / 10, this.LLLFFI);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (c21600619gC2 = (C21600619gC) childAt.getLayoutParams()) != null && c21600619gC2.LIZ) {
                int i6 = c21600619gC2.LIZIZ;
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
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                    if (z2) {
                        i9 = 1073741824;
                    }
                }
                int i10 = ((ViewGroup.LayoutParams) c21600619gC2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i3 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) c21600619gC2).height;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = measuredHeight;
                    }
                } else {
                    i11 = measuredHeight;
                    i5 = i9;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i3), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z2) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.LLJLLIL = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.LLJLLL = true;
        LJJIII();
        this.LLJLLL = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c21600619gC = (C21600619gC) childAt2.getLayoutParams()) == null || !c21600619gC.LIZ)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * c21600619gC.LIZJ), 1073741824), this.LLJLLIL);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C21601319gJ c21601319gJLJIILLIIL;
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
            if (childAt.getVisibility() == 0 && (c21601319gJLJIILLIIL = LJIILLIIL(childAt)) != null && c21601319gJLJIILLIIL.LIZIZ == this.LLJJIJIIJIL && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    public final void LJIIJJI(int i, int i2, int i3) {
        CopyOnWriteArrayList<InterfaceC1055440dZW> copyOnWriteArrayList;
        if (i != i2 && (copyOnWriteArrayList = this.LLLLLLLZIL) != null) {
            Iterator<InterfaceC1055440dZW> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(i2, i3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.LLLL
            r6 = 0
            r5 = 1
            if (r0 <= 0) goto L69
            int r10 = r11.getScrollX()
            int r4 = r11.getPaddingLeft()
            int r9 = r11.getPaddingRight()
            int r8 = r11.getWidth()
            int r3 = r11.getChildCount()
            r2 = 0
        L1b:
            if (r2 >= r3) goto L69
            android.view.View r1 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r7 = r1.getLayoutParams()
            X.19gC r7 = (X.C21600619gC) r7
            boolean r0 = r7.LIZ
            if (r0 == 0) goto L44
            int r0 = r7.LIZIZ
            r7 = r0 & 7
            if (r7 == r5) goto L4d
            r0 = 3
            if (r7 == r0) goto L47
            r0 = 5
            if (r7 == r0) goto L5a
            r0 = r4
        L38:
            int r4 = r4 + r10
            int r7 = r1.getLeft()
            int r4 = r4 - r7
            if (r4 == 0) goto L43
            r1.offsetLeftAndRight(r4)
        L43:
            r4 = r0
        L44:
            int r2 = r2 + 1
            goto L1b
        L47:
            int r0 = r1.getWidth()
            int r0 = r0 + r4
            goto L38
        L4d:
            int r0 = r1.getMeasuredWidth()
            int r0 = r8 - r0
            int r0 = r0 / 2
            int r7 = java.lang.Math.max(r0, r4)
            goto L66
        L5a:
            int r7 = r8 - r9
            int r0 = r1.getMeasuredWidth()
            int r7 = r7 - r0
            int r0 = r1.getMeasuredWidth()
            int r9 = r9 + r0
        L66:
            r0 = r4
            r4 = r7
            goto L38
        L69:
            X.0Ias r0 = r11.LLLLIIIILLL
            if (r0 == 0) goto L70
            r0.onPageScrolled(r12, r13, r14)
        L70:
            java.util.concurrent.CopyOnWriteArrayList<X.0Ias> r0 = r11.LLLLII
            if (r0 == 0) goto L8b
            int r2 = r0.size()
            r1 = 0
        L79:
            if (r1 >= r2) goto L8b
            java.util.concurrent.CopyOnWriteArrayList<X.0Ias> r0 = r11.LLLLII
            java.lang.Object r0 = r0.get(r1)
            X.0Ias r0 = (X.InterfaceC469360Ias) r0
            if (r0 == 0) goto L88
            r0.onPageScrolled(r12, r13, r14)
        L88:
            int r1 = r1 + 1
            goto L79
        L8b:
            X.11Fu r0 = r11.LLLLIILLL
            if (r0 == 0) goto Lbb
            int r4 = r11.getScrollX()
            int r3 = r11.getChildCount()
        L97:
            if (r6 >= r3) goto Lbb
            android.view.View r2 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            X.19gC r0 = (X.C21600619gC) r0
            boolean r0 = r0.LIZ
            if (r0 != 0) goto Lb8
            int r0 = r2.getLeft()
            int r0 = r0 - r4
            float r1 = (float) r0
            int r0 = r11.getClientWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            X.11Fu r0 = r11.LLLLIILLL
            r0.LIZ(r2, r1)
        Lb8:
            int r6 = r6 + 1
            goto L97
        Lbb:
            r11.LLLJL = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21600219g8.LJIJJLI(int, float, int):void");
    }

    public void LJJIJL(int i, int i2, int i3) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.LLJJJJ;
        if (scroller != null && !scroller.isFinished()) {
            if (this.LLJJJJJIL) {
                scrollX = this.LLJJJJ.getCurrX();
            } else {
                scrollX = this.LLJJJJ.getStartX();
            }
            this.LLJJJJ.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            LJII(false);
            LJJIII();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        float f = clientWidth;
        float f2 = clientWidth / 2;
        float fSin = f2 + (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2);
        int iAbs2 = Math.abs(i3);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i4) / ((f * this.LLJJIJI.LJIL(this.LLJJIJIIJIL)) + this.LLJJL)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.LLJJJJJIL = false;
        int i6 = this.LLLLILI;
        if (i6 <= 0) {
            i6 = iMin;
        }
        this.LLJJJJ.startScroll(scrollX, scrollY, i4, i5, i6);
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C21601319gJ c21601319gJLJIILLIIL;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c21601319gJLJIILLIIL = LJIILLIIL(childAt)) != null && c21601319gJLJIILLIIL.LIZIZ == this.LLJJIJIIJIL) {
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

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C21600619gC c21600619gC = (C21600619gC) layoutParams;
        boolean z2 = c21600619gC.LIZ;
        if (view.getClass().getAnnotation(C147X.class) != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = z2 | z;
        c21600619gC.LIZ = z3;
        if (this.LLJLLL) {
            if (!z3) {
                c21600619gC.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
            } else {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
        } else {
            super.addView(view, i, layoutParams);
        }
        C21601719gN c21601719gN = this.LLLLLIL;
        if (c21601719gN.LIZIZ()) {
            if (c21601719gN.LJIIIZ == EnumC21602519gV.NOT_OPT) {
                c21601719gN.LJIIIZ = EnumC21602519gV.WAIT_OPT;
            }
        }
    }

    private int LJIIIZ(int i, float f, int i2, int i3) {
        boolean z;
        int i4 = this.LLLILZJ;
        int i5 = this.LLLLLL;
        if (i5 > 0) {
            i4 = i5;
        }
        int i6 = this.LLLIL;
        int i7 = this.LLLLLLIL;
        if (i7 > 0) {
            i6 = i7;
        }
        if (Math.abs(i3) > i4 && Math.abs(i2) > i6) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZ = z;
        if (this.LLLLLLJ) {
            if (i2 <= 0) {
                i++;
            }
        } else if (((this.LLILZIL && i3 < 0) || (this.LLILZLL && i3 > 0)) && z) {
            if (i2 <= 0) {
                i++;
            }
            LJIIJJI(getCurrentItem(), i, 1);
        } else {
            float f2 = 0.0f;
            if (z && this.LLJIJIL > 0.0f && Math.abs(i2) >= this.LLJIJIL) {
                if (i2 <= 0) {
                    i++;
                }
                LJIIJJI(getCurrentItem(), i, 1);
            } else {
                float f3 = 0.4f;
                if (!this.LL ? i < this.LLJJIJIIJIL : i >= this.LLJJIJIIJIL) {
                    f3 = 0.6f;
                }
                float f4 = this.LLJI;
                if (f4 > 0.0f && i3 != 0) {
                    if (i3 > 0) {
                        f4 = -f4;
                    }
                    f2 = f4;
                } else if (i >= this.LLJJIJIIJIL) {
                    float f5 = this.LLJ;
                    if (f5 != 0.0f) {
                        f2 = f5 - f3;
                    }
                }
                i += (int) (f + f3 + this.LLLLJ + f2);
                LJIIJJI(getCurrentItem(), i, 2);
            }
        }
        boolean z2 = this.LLILZIL;
        if (this.LLJJ.size() > 0) {
            C21601319gJ c21601319gJ = (C21601319gJ) ListProtector.get(this.LLJJ, 0);
            ArrayList<C21601319gJ> arrayList = this.LLJJ;
            return Math.max(c21601319gJ.LIZIZ, Math.min(i, ((C21601319gJ) ListProtector.get(arrayList, arrayList.size() - 1)).LIZIZ));
        }
        return i;
    }

    private void LJJIIJ(int i, int i2, int i3, int i4) {
        float fMin;
        if (i2 > 0 && !this.LLJJ.isEmpty()) {
            if (!this.LLJJJJ.isFinished()) {
                this.LLJJJJ.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
            return;
        }
        C21601319gJ c21601319gJLJIJ = LJIJ(this.LLJJIJIIJIL);
        if (c21601319gJLJIJ != null) {
            fMin = Math.min(c21601319gJLJIJ.LJ, this.LLJLL);
        } else {
            fMin = 0.0f;
        }
        int paddingLeft = (int) (fMin * ((i - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft == getScrollX()) {
            return;
        }
        LJII(false);
        scrollTo(paddingLeft, getScrollY());
    }

    private void LJJIIZI(int i, boolean z, int i2, boolean z2) {
        int iLIZIZ;
        C21601319gJ c21601319gJLJIJ = LJIJ(i);
        if (c21601319gJLJIJ != null) {
            iLIZIZ = (int) (getClientWidth() * Math.max(this.LLJLILLLLZIIL, Math.min(c21601319gJLJIJ.LJ, this.LLJLL)));
        } else {
            iLIZIZ = 0;
        }
        InterfaceC719740SLc interfaceC719740SLc = this.LLLLLLLLLL;
        if (interfaceC719740SLc != null) {
            iLIZIZ = interfaceC719740SLc.LIZIZ(i, iLIZIZ);
        }
        if (z) {
            LJJIJL(iLIZIZ, 0, i2);
            if (z2) {
                LJIIJ(i);
                return;
            }
            return;
        }
        if (z2) {
            LJIIJ(i);
        }
        LJII(false);
        scrollTo(iLIZIZ, 0);
        LJJI(iLIZIZ);
    }

    public final void LJJIJIIJI(int i, boolean z, boolean z2, int i2) {
        boolean z3;
        this.LLLLLIL.LJII();
        PagerAdapter pagerAdapter = this.LLJJIJI;
        boolean z4 = false;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            if (!z2 && this.LLJJIJIIJIL == i && this.LLJJ.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.LLJJIJI.getCount()) {
                i = this.LLJJIJI.getCount() - 1;
            }
            int i3 = this.LLL;
            int i4 = this.LLJJIJIIJIL;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.LLJJ.size(); i5++) {
                    ((C21601319gJ) ListProtector.get(this.LLJJ, i5)).LIZJ = true;
                }
            }
            if (this.LLJJIJIIJIL != i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.LLILZ || !z) {
                z4 = true;
            }
            this.LLILLL = z4;
            if (this.LLLJIL) {
                this.LLJJIJIIJIL = i;
                if (z3) {
                    LJIIJ(i);
                }
                requestLayout();
                return;
            }
            LJJII(i);
            LJJIIZI(i, z, i2, z3);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.LLJJL;
            LJJIIJ(i, i3, i5, i5);
        }
    }

    public boolean LJI(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && LJI(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        Object tag = view.getTag(com.zhiliaoapp.musically.R.id.mlo);
        if (tag instanceof Boolean) {
            if (z && ((Boolean) tag).booleanValue()) {
                return true;
            }
            return false;
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21600219g8.onLayout(boolean, int, int, int, int):void");
    }
}
