package X;

import Y.AComparatorS52S0000000_33;
import Y.ARunnableS107S0100000_7;
import Y.ARunnableS131S0100000_31;
import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import com.bytedance.android.livesdk.liveroom.LiveVerticalViewPager$SavedState;
import com.bytedance.android.livesdk.liveroom.LiveViewpagerCanScrollFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkLinkMicLandscapeSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAdjustScrollConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveScrollAngleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import u4.q0;

/* JADX INFO: renamed from: X.19gM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21601619gM extends ViewGroup implements InterfaceC21605719h1, InterfaceC472340Ifg {
    public static final int[] LLLLILI = {R.attr.layout_gravity};
    public static final AComparatorS52S0000000_33 LLLLJ = new AComparatorS52S0000000_33(2);
    public static final InterpolatorC21604019gk LLLLJI = new Interpolator() { // from class: X.19gk
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    public static final Field LLLLL;
    public float LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final ArrayList<C21603219gc> LLILZ;
    public final C21603219gc LLILZIL;
    public final Rect LLILZLL;
    public PagerAdapter LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public Parcelable LLJI;
    public ClassLoader LLJIJIL;
    public Scroller LLJILJIL;
    public boolean LLJILJILJ;
    public C21603519gf LLJILLL;
    public int LLJJ;
    public Drawable LLJJI;
    public int LLJJIII;
    public int LLJJIJI;
    public float LLJJIJIIJIL;
    public float LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public int LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public int LLJLIL;
    public int LLJLILLLLZIIL;
    public float LLJLL;
    public float LLJLLIL;
    public float LLJLLL;
    public float LLJZ;
    public int LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public int LLLFF;
    public VelocityTracker LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public int LLLII;
    public int LLLIIII;
    public double LLLIIIIL;
    public Boolean LLLIIIL;
    public C21580619cy LLLIIL;
    public C21580619cy LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public C0ILG LLLILZJ;
    public boolean LLLILZLLLI;
    public boolean LLLIZZ;
    public int LLLJ;
    public InterfaceC469360Ias LLLJIL;
    public Method LLLJL;
    public InterfaceC470350IcT LLLL;
    public boolean LLLLII;
    public InterfaceC466610IRn LLLLIIIILLL;
    public float LLLLIIL;
    public final InterfaceC466620IRo LLLLIILL;
    public final ARunnableS131S0100000_31 LLLLIILLL;
    public int LLLLIL;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19gk] */
    static {
        try {
            Field declaredField = PagerAdapter.class.getDeclaredField("mViewPagerObserver");
            LLLLL = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(e);
        }
    }

    public final boolean LJIJJ() {
        this.LLLFF = -1;
        this.LLJJL = false;
        this.LLJJLIIIJLLLLLLLZ = false;
        VelocityTracker velocityTracker = this.LLLFFI;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.LLLFFI = null;
        }
        C21580619cy c21580619cy = this.LLLIIL;
        c21580619cy.LIZ.onRelease();
        boolean zIsFinished = c21580619cy.LIZ.isFinished();
        C21580619cy c21580619cy2 = this.LLLIILIL;
        c21580619cy2.LIZ.onRelease();
        return zIsFinished | c21580619cy2.LIZ.isFinished();
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.LLJILJILJ = true;
        if (this.LLJILJIL.isFinished() || !this.LLJILJIL.computeScrollOffset()) {
            LIZLLL(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.LLJILJIL.getCurrX();
        int currY = this.LLJILJIL.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!LJIILJJIL(currY)) {
                this.LLJILJIL.abortAnimation();
                scrollTo(currX, 0);
            }
        }
        postInvalidateOnAnimation();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestFitSystemWindows() {
    }

    public void setOnAdapterChangeListener(InterfaceC21605319gx interfaceC21605319gx) {
    }

    private int getScrollAngle() {
        return LiveScrollAngleSetting.INSTANCE.getValue();
    }

    public final void LJ() {
        int count = this.LLIZ.getCount();
        boolean z = this.LLILZ.size() < (this.LLJJJJLIIL * 2) + 1 && this.LLILZ.size() < count;
        int iMax = this.LLIZLLLIL;
        int i = 0;
        boolean z2 = false;
        while (i < this.LLILZ.size()) {
            C21603219gc c21603219gc = (C21603219gc) ListProtector.get(this.LLILZ, i);
            int iLJIJJ = this.LLIZ.LJIJJ(c21603219gc.LIZ);
            if (iLJIJJ != -1) {
                if (iLJIJJ == -2) {
                    ListProtector.remove(this.LLILZ, i);
                    i--;
                    if (!z2) {
                        this.LLIZ.LJJIJIIJI(this);
                        z2 = true;
                    }
                    this.LLIZ.LJIIZILJ(this, c21603219gc.LIZIZ, c21603219gc.LIZ);
                    int i2 = this.LLIZLLLIL;
                    if (i2 == c21603219gc.LIZIZ) {
                        iMax = Math.max(0, Math.min(i2, (-1) + count));
                    }
                } else {
                    int i3 = c21603219gc.LIZIZ;
                    if (i3 != iLJIJJ) {
                        if (i3 == this.LLIZLLLIL) {
                            iMax = iLJIJJ;
                        }
                        c21603219gc.LIZIZ = iLJIJJ;
                    }
                }
                z = true;
            }
            i++;
        }
        if (z2) {
            this.LLIZ.LJIJI(this);
        }
        Collections.sort(this.LLILZ, LLLLJ);
        if (z) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                C21601819gO c21601819gO = (C21601819gO) getChildAt(i4).getLayoutParams();
                if (!c21601819gO.LIZ) {
                    c21601819gO.LIZJ = 0.0f;
                }
            }
            LJJ(iMax, 0, 0, false, true);
            requestLayout();
        }
    }

    public final boolean LJIILIIL() {
        PagerAdapter pagerAdapter = this.LLIZ;
        if (pagerAdapter == null || this.LLIZLLLIL >= pagerAdapter.getCount() - 1) {
            return false;
        }
        LJIL(this.LLIZLLLIL + 1, true);
        return true;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C21601819gO();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        HandlerHook.viewRemoveCallbacks(this, this.LLLLIILLL);
        Scroller scroller = this.LLJILJIL;
        if (scroller != null && !scroller.isFinished()) {
            this.LLJILJIL.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    private int getClientHeight() {
        return (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final C21603219gc LJIIIZ() {
        float scrollY;
        float f;
        int i;
        int clientHeight = getClientHeight();
        float f2 = 0.0f;
        if (clientHeight > 0) {
            scrollY = getScrollY() / clientHeight;
            f = this.LLJJ / clientHeight;
        } else {
            scrollY = 0.0f;
            f = 0.0f;
        }
        C21603219gc c21603219gc = null;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.LLILZ.size()) {
            C21603219gc c21603219gc2 = (C21603219gc) ListProtector.get(this.LLILZ, i2);
            if (!z && c21603219gc2.LIZIZ != (i = i3 + 1)) {
                c21603219gc2 = this.LLILZIL;
                c21603219gc2.LJ = f2 + f3 + f;
                c21603219gc2.LIZIZ = i;
                c21603219gc2.LIZLLL = this.LLIZ.LJIL(i);
                i2--;
            }
            f2 = c21603219gc2.LJ;
            float f4 = c21603219gc2.LIZLLL + f2 + f;
            if (!z && scrollY < f2) {
                return c21603219gc;
            }
            if (scrollY < f4 || i2 == this.LLILZ.size() - 1) {
                return c21603219gc2;
            }
            i3 = c21603219gc2.LIZIZ;
            f3 = c21603219gc2.LIZLLL;
            i2++;
            z = false;
            c21603219gc = c21603219gc2;
        }
        return c21603219gc;
    }

    public final void LJIILLIIL() {
        boolean zLJI = MethodIDManager.LJI(71959);
        LJIIZILJ(this.LLIZLLLIL);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LLJJI;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLLILZLLLI = true;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        LiveVerticalViewPager$SavedState liveVerticalViewPager$SavedState = new LiveVerticalViewPager$SavedState(super.onSaveInstanceState());
        liveVerticalViewPager$SavedState.LL = this.LLIZLLLIL;
        PagerAdapter pagerAdapter = this.LLIZ;
        if (pagerAdapter != null) {
            liveVerticalViewPager$SavedState.LLILLJJLI = pagerAdapter.LJJIIJ();
        }
        return liveVerticalViewPager$SavedState;
    }

    public PagerAdapter getAdapter() {
        return this.LLIZ;
    }

    public int getCurrentItem() {
        return this.LLIZLLLIL;
    }

    public float getInitialMotionY() {
        return this.LLJZ;
    }

    public int getOffscreenPageLimit() {
        return this.LLJJJJLIIL;
    }

    public int getPageMargin() {
        return this.LLJJ;
    }

    public double getTanValue() {
        return this.LLLIIIIL;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.LLJJJJ != z) {
            this.LLJJJJ = z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(int r7) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21601619gM.LIZIZ(int):boolean");
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        if (this.LLLLIL == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.LLJILJIL.isFinished()) {
                this.LLJILJIL.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.LLJILJIL.getCurrX();
                int currY = this.LLJILJIL.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currY != scrollY) {
                        LJIILJJIL(currY);
                    }
                }
            } else if (this.LLJILJIL.getCurrY() != getScrollY()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DmtViewPager completeScroll mScroller.getCurrY() != getScrollY() ");
                sbLIZ.append(this.LLJILJIL.getCurrY() - getScrollY());
                C20441214yg.LJ("slide_log", C2188811AlT.LIZIZ(sbLIZ));
                scrollTo(this.LLJILJIL.getCurrX(), this.LLJILJIL.getCurrY());
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                C11RO c11ro = C11S5.LIZIZ;
                C1701890uOB.LIZ(timeUnit, "unit is null");
                C1701890uOB.LIZ(c11ro, "scheduler is null");
                new C11O1(Math.max(0L, 300L), Math.max(0L, 300L), timeUnit, c11ro).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new InterfaceC626120Oh8<Long>() { // from class: X.16Al
                    public InterfaceC420801kM LL;
                    public int LLILLJJLI = 2;

                    @Override // X.InterfaceC626120Oh8
                    public final void onComplete() {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onError(Throwable th) {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(Long l) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("scroll ");
                        sbLIZ2.append(this.LLILLL.LLJILJIL.getCurrY() - this.LLILLL.getScrollY());
                        C20441214yg.LJ("slide_log", C2188811AlT.LIZIZ(sbLIZ2));
                        if (this.LLILLL.LLJILJIL.getCurrY() == this.LLILLL.getScrollY()) {
                            this.LLILLJJLI--;
                            InterfaceC420801kM interfaceC420801kM = this.LL;
                            if (interfaceC420801kM != null && !interfaceC420801kM.isDisposed() && this.LLILLJJLI <= 0) {
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("dispose ");
                                sbLIZ3.append(this.LLILLL.LLJILJIL.getCurrY());
                                C20441214yg.LJ("slide_log", C2188811AlT.LIZIZ(sbLIZ3));
                                this.LL.dispose();
                                return;
                            }
                            return;
                        }
                        C21601619gM c21601619gM = this.LLILLL;
                        c21601619gM.scrollTo(c21601619gM.LLJILJIL.getCurrX(), this.LLILLL.LLJILJIL.getCurrY());
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                        this.LL = interfaceC420801kM;
                    }
                });
            }
        } else {
            z2 = false;
        }
        this.LLJJJJJIL = false;
        for (int i = 0; i < this.LLILZ.size(); i++) {
            C21603219gc c21603219gc = (C21603219gc) ListProtector.get(this.LLILZ, i);
            if (c21603219gc.LIZJ) {
                c21603219gc.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                postOnAnimation(this.LLLLIILLL);
            } else {
                this.LLLLIILLL.run();
            }
        }
    }

    public final C21603219gc LJIIIIZZ(View view) {
        for (int i = 0; i < this.LLILZ.size(); i++) {
            C21603219gc c21603219gc = (C21603219gc) ListProtector.get(this.LLILZ, i);
            if (this.LLIZ.LJJIFFI(view, c21603219gc.LIZ)) {
                return c21603219gc;
            }
        }
        return null;
    }

    public final C21603219gc LJIIJ(int i) {
        for (int i2 = 0; i2 < this.LLILZ.size(); i2++) {
            C21603219gc c21603219gc = (C21603219gc) ListProtector.get(this.LLILZ, i2);
            if (c21603219gc.LIZIZ == i) {
                return c21603219gc;
            }
        }
        return null;
    }

    public final void LJIIL(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.LLLFF) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LLJLLIL = motionEvent.getY(i);
            this.LLLFF = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.LLLFFI;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean LJIILJJIL(int i) {
        if (this.LLILZ.size() == 0) {
            if (this.LLLILZLLLI) {
                return false;
            }
            this.LLLIZZ = false;
            LJIIJJI(0, 0.0f, 0);
            if (this.LLLIZZ) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C21603219gc c21603219gcLJIIIZ = LJIIIZ();
        int clientHeight = getClientHeight();
        int i2 = this.LLJJ;
        int i3 = clientHeight + i2;
        float f = i2;
        float f2 = clientHeight;
        int i4 = c21603219gcLJIIIZ.LIZIZ;
        float f3 = ((i / f2) - c21603219gcLJIIIZ.LJ) / (c21603219gcLJIIIZ.LIZLLL + (f / f2));
        this.LLLIZZ = false;
        LJIIJJI(i4, f3, (int) (i3 * f3));
        if (this.LLLIZZ) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    public final boolean LJIILL(float f) {
        boolean z;
        boolean z2;
        float f2 = (this.LLJLLIL - f) * this.LL;
        this.LLJLLIL = f;
        float scrollY = getScrollY() + f2;
        float clientHeight = getClientHeight();
        float f3 = this.LLJJIJIIJIL * clientHeight;
        float f4 = this.LLJJIJIL * clientHeight;
        boolean z3 = false;
        C21603219gc c21603219gc = (C21603219gc) ListProtector.get(this.LLILZ, 0);
        ArrayList<C21603219gc> arrayList = this.LLILZ;
        C21603219gc c21603219gc2 = (C21603219gc) ListProtector.get(arrayList, arrayList.size() - 1);
        if (c21603219gc.LIZIZ != 0) {
            f3 = c21603219gc.LJ * clientHeight;
            z = false;
        } else {
            z = true;
        }
        if (c21603219gc2.LIZIZ != this.LLIZ.getCount() - 1) {
            f4 = c21603219gc2.LJ * clientHeight;
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.LLLIIL.LIZ.isFinished()) {
            if (z) {
                this.LLLIIL.LIZ.onPull((f3 - scrollY) / clientHeight);
                z3 = true;
            }
            scrollY = f3;
        } else if (!this.LLLIILIL.LIZ.isFinished()) {
            if (z2) {
                this.LLLIILIL.LIZ.onPull((scrollY - f4) / clientHeight);
                z3 = true;
            }
            scrollY = f4;
        } else if (scrollY < f3) {
            if (z) {
                this.LLLIIL.LIZ.onPull((f3 - scrollY) / clientHeight);
                z3 = true;
            }
            scrollY = f3;
        } else if (scrollY > f4) {
            if (z2) {
                this.LLLIILIL.LIZ.onPull((scrollY - f4) / clientHeight);
                z3 = true;
            }
            scrollY = f4;
        }
        int i = (int) scrollY;
        this.LLJLL += scrollY - i;
        if (this.LLILLJJLI) {
            scrollTo(getScrollX(), i);
            LJIILJJIL(i);
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:260:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010a A[PHI: r2 r11 r14
      0x010a: PHI (r2v14 int) = (r2v13 int), (r2v8 int), (r2v16 int) binds: [B:57:0x00ff, B:54:0x00e9, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r11v19 int) = (r11v1 int), (r11v18 int), (r11v21 int) binds: [B:57:0x00ff, B:54:0x00e9, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]
      0x010a: PHI (r14v5 float) = (r14v3 float), (r14v4 float), (r14v1 float) binds: [B:57:0x00ff, B:54:0x00e9, B:47:0x00d1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b4 A[PHI: r6 r11
      0x01b4: PHI (r6v18 int) = (r6v16 int), (r6v17 int), (r6v15 int) binds: [B:96:0x01a9, B:93:0x018f, B:86:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x01b4: PHI (r11v16 float) = (r11v14 float), (r11v15 float), (r11v13 float) binds: [B:96:0x01a9, B:93:0x018f, B:86:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(int r18) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21601619gM.LJIIZILJ(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList<View> arrayList) {
        C21603219gc c21603219gcLJIIIIZZ;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c21603219gcLJIIIIZZ = LJIIIIZZ(childAt)) != null && c21603219gcLJIIIIZZ.LIZIZ == this.LLIZLLLIL) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLIZ == null) {
            return false;
        }
        int clientHeight = getClientHeight();
        int scrollY = getScrollY();
        if (i < 0) {
            if (scrollY <= ((int) (clientHeight * this.LLJJIJIIJIL))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollY >= ((int) (clientHeight * this.LLJJIJIL))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C21601819gO) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        C21602019gQ c21602019gQ = ((C21602919gZ) this.LLLLIILL).LIZIZ;
        if (c21602019gQ.LIZ() && Build.VERSION.SDK_INT < 24) {
            C786410Ut5.LJLIIL(200L, c21602019gQ.LIZLLL, new ARunnableS107S0100000_7(c21602019gQ, 144));
        }
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
        C21603219gc c21603219gcLJIIIIZZ;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (c21603219gcLJIIIIZZ = LJIIIIZZ(childAt)) != null && c21603219gcLJIIIIZZ.LIZIZ == this.LLIZLLLIL && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean zDraw;
        PagerAdapter pagerAdapter;
        try {
            super.draw(canvas);
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.LLIZ) != null && pagerAdapter.getCount() > 1)) {
                if (!this.LLLIIL.LIZ.isFinished()) {
                    int iSave = canvas.save();
                    int height = getHeight();
                    int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    canvas.translate(getPaddingLeft(), this.LLJJIJIIJIL * height);
                    this.LLLIIL.LIZ.setSize(width, height);
                    zDraw = this.LLLIIL.LIZ.draw(canvas);
                    canvas.restoreToCount(iSave);
                    if (!this.LLLIL) {
                        this.LLLIL = true;
                        if (this.LLLILZJ != null) {
                            HandlerHook.viewPost(this, new ARunnableS107S0100000_7(this, 89));
                        }
                    }
                } else {
                    zDraw = false;
                }
                if (!this.LLLIILIL.LIZ.isFinished()) {
                    int iSave2 = canvas.save();
                    int height2 = getHeight();
                    int width2 = (getWidth() - getPaddingLeft()) - getPaddingRight();
                    canvas.rotate(180.0f);
                    canvas.translate((-width2) - getPaddingLeft(), (-(this.LLJJIJIL + 1.0f)) * height2);
                    this.LLLIILIL.LIZ.setSize(width2, height2);
                    zDraw |= this.LLLIILIL.LIZ.draw(canvas);
                    canvas.restoreToCount(iSave2);
                    if (!this.LLLILZ) {
                        this.LLLILZ = true;
                        if (this.LLLILZJ != null) {
                            HandlerHook.viewPost(this, new ARunnableS107S0100000_7(this, 90));
                        }
                    }
                }
                if (zDraw) {
                    postInvalidateOnAnimation();
                    return;
                }
            } else {
                this.LLLIIL.LIZ.finish();
                this.LLLIILIL.LIZ.finish();
            }
            if (this.LLLIL) {
                this.LLLIL = false;
            }
            if (this.LLLILZ) {
                this.LLLILZ = false;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJI("LiveVerticalViewPager", th);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C21601819gO(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.LLJJ > 0 && this.LLJJI != null && this.LLILZ.size() > 0 && this.LLIZ != null) {
            int scrollY = getScrollY();
            float height = getHeight();
            float f2 = this.LLJJ / height;
            int i2 = 0;
            C21603219gc c21603219gc = (C21603219gc) ListProtector.get(this.LLILZ, 0);
            float f3 = c21603219gc.LJ;
            int size = this.LLILZ.size();
            int i3 = ((C21603219gc) ListProtector.get(this.LLILZ, size - 1)).LIZIZ;
            for (int i4 = c21603219gc.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c21603219gc.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c21603219gc = (C21603219gc) ListProtector.get(this.LLILZ, i2);
                }
                if (i4 == i) {
                    float f4 = c21603219gc.LJ;
                    float f5 = c21603219gc.LIZLLL;
                    f = (f4 + f5) * height;
                    f3 = f4 + f5 + f2;
                } else {
                    float fLJIL = this.LLIZ.LJIL(i4);
                    f = (f3 + fLJIL) * height;
                    f3 += fLJIL + f2;
                }
                int i5 = this.LLJJ;
                if (i5 + f > scrollY) {
                    this.LLJJI.setBounds(this.LLJJIII, (int) f, this.LLJJIJI, (int) (i5 + f + 0.5f));
                    this.LLJJI.draw(canvas);
                }
                if (f > scrollY + r8) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        C21601619gM c21601619gM;
        if (!isEnabled()) {
            return false;
        }
        if (LiveSdkLinkMicLandscapeSetting.isEnable() && !C497740JfY.LJIL() && C924790aAn.LIZLLL().LJFF()) {
            return false;
        }
        InterfaceC466610IRn interfaceC466610IRn = this.LLLLIIIILLL;
        if (interfaceC466610IRn != null) {
            C0IRW c0irw = (C0IRW) interfaceC466610IRn;
            if (motionEvent.getAction() == 0) {
                c0irw.LIZ = motionEvent.getY();
                C21601619gM c21601619gM2 = c0irw.LIZIZ.LLLJIL;
                if (c21601619gM2 != null) {
                    c21601619gM2.setCanFastSwipe(false);
                }
            } else if (motionEvent.getAction() == 2 && c0irw.LIZIZ.bS(motionEvent.getY() - c0irw.LIZ) && (c21601619gM = c0irw.LIZIZ.LLLJIL) != null) {
                c21601619gM.requestDisallowInterceptTouchEvent(true);
                return false;
            }
        }
        try {
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!this.LLILLL) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.LLJJL) {
                    return true;
                }
                if (this.LLJJLIIIJLLLLLLLZ) {
                    return false;
                }
                if (action != 2) {
                    if (action == 6) {
                        LJIIL(motionEvent);
                    }
                } else {
                    int i = this.LLLFF;
                    if (i != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f2 = y - this.LLJLLIL;
                        float fAbs = Math.abs(f2);
                        float x = motionEvent.getX(iFindPointerIndex);
                        float fAbs2 = Math.abs(x - this.LLJLLL);
                        if (f2 != 0.0f) {
                            float f3 = this.LLJLLIL;
                            if ((f3 >= this.LLJLIL || f2 <= 0.0f) && ((f3 <= getHeight() - this.LLJLIL || f2 >= 0.0f) && LIZJ(this, false, (int) f2, (int) x, (int) y))) {
                                this.LLJLL = x;
                                this.LLJLLIL = y;
                                this.LLJJLIIIJLLLLLLLZ = true;
                                return false;
                            }
                        }
                        float f4 = this.LLJLILLLLZIIL;
                        if (fAbs > f4 && fAbs > ((double) fAbs2) * this.LLLIIIIL) {
                            if (this.LLLLII) {
                                return false;
                            }
                            InterfaceC470350IcT interfaceC470350IcT = this.LLLL;
                            if (interfaceC470350IcT != null && ((C465870IOr) interfaceC470350IcT).LIZ(f2)) {
                                this.LLLLII = true;
                                return false;
                            }
                            this.LLJJL = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            if (f2 <= 0.0f) {
                                f = this.LLJZ - this.LLJLILLLLZIIL;
                            } else {
                                f = this.LLJZ + this.LLJLILLLLZIIL;
                            }
                            this.LLJLLIL = f;
                            this.LLJLL = x;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > f4 && (!this.LLLIIIL.booleanValue() || (this.LLLIIIL.booleanValue() && fAbs <= ((double) fAbs2) * this.LLLIIIIL))) {
                            this.LLJJLIIIJLLLLLLLZ = true;
                        }
                        if (this.LLJJL && LJIILL(y)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                this.LLJLL = motionEvent.getX();
                this.LLJLLL = motionEvent.getX();
                this.LLJLLIL = motionEvent.getY();
                this.LLJZ = motionEvent.getY();
                this.LLLFF = motionEvent.getPointerId(0);
                this.LLJJLIIIJLLLLLLLZ = false;
                this.LLJILJILJ = true;
                this.LLJILJIL.computeScrollOffset();
                if (this.LLLLIL == 2 && Math.abs(this.LLJILJIL.getFinalY() - this.LLJILJIL.getCurrY()) > this.LLLIIII) {
                    this.LLJILJIL.abortAnimation();
                    this.LLJJJJJIL = false;
                    LJIILLIIL();
                    this.LLJJL = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    LIZLLL(false);
                    this.LLJJL = false;
                    this.LLLLII = false;
                }
            }
            if (this.LLLFFI == null) {
                this.LLLFFI = VelocityTracker.obtain();
            }
            this.LLLFFI.addMovement(motionEvent);
            return this.LLJJL;
        }
        LJIJJ();
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof LiveVerticalViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LiveVerticalViewPager$SavedState liveVerticalViewPager$SavedState = (LiveVerticalViewPager$SavedState) parcelable;
        super.onRestoreInstanceState(liveVerticalViewPager$SavedState.getSuperState());
        PagerAdapter pagerAdapter = this.LLIZ;
        if (pagerAdapter != null) {
            pagerAdapter.LJJIII(liveVerticalViewPager$SavedState.LLILLJJLI, liveVerticalViewPager$SavedState.LLILLL);
            LJJ(liveVerticalViewPager$SavedState.LL, 0, 0, false, true);
        } else {
            this.LLJ = liveVerticalViewPager$SavedState.LL;
            this.LLJI = liveVerticalViewPager$SavedState.LLILLJJLI;
            this.LLJIJIL = liveVerticalViewPager$SavedState.LLILLL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x010b A[Catch: IllegalArgumentException -> 0x01e6, TryCatch #0 {IllegalArgumentException -> 0x01e6, blocks: (B:17:0x0039, B:19:0x003f, B:22:0x0046, B:24:0x004a, B:26:0x0050, B:28:0x0054, B:29:0x005a, B:39:0x0074, B:41:0x0084, B:43:0x0095, B:45:0x0099, B:87:0x01b8, B:46:0x00a7, B:48:0x00ab, B:50:0x00b4, B:51:0x00ba, B:55:0x00dd, B:57:0x00e5, B:58:0x00e8, B:60:0x00f0, B:61:0x00f4, B:63:0x0104, B:67:0x011c, B:64:0x0107, B:66:0x010b, B:68:0x0121, B:70:0x0125, B:72:0x013e, B:75:0x0143, B:77:0x0173, B:81:0x0184, B:83:0x0199, B:84:0x01aa, B:85:0x01ad, B:89:0x01bc), top: B:95:0x0039 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b8 A[Catch: IllegalArgumentException -> 0x01e6, TryCatch #0 {IllegalArgumentException -> 0x01e6, blocks: (B:17:0x0039, B:19:0x003f, B:22:0x0046, B:24:0x004a, B:26:0x0050, B:28:0x0054, B:29:0x005a, B:39:0x0074, B:41:0x0084, B:43:0x0095, B:45:0x0099, B:87:0x01b8, B:46:0x00a7, B:48:0x00ab, B:50:0x00b4, B:51:0x00ba, B:55:0x00dd, B:57:0x00e5, B:58:0x00e8, B:60:0x00f0, B:61:0x00f4, B:63:0x0104, B:67:0x011c, B:64:0x0107, B:66:0x010b, B:68:0x0121, B:70:0x0125, B:72:0x013e, B:75:0x0143, B:77:0x0173, B:81:0x0184, B:83:0x0199, B:84:0x01aa, B:85:0x01ad, B:89:0x01bc), top: B:95:0x0039 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21601619gM.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.LLJJJIL) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, view);
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.19gf] */
    public void setAdapter(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.LLIZ;
        if (pagerAdapter2 != null) {
            try {
                LLLLL.set(pagerAdapter2, null);
                this.LLIZ.LJJIJIIJI(this);
                for (int i = 0; i < this.LLILZ.size(); i++) {
                    C21603219gc c21603219gc = (C21603219gc) ListProtector.get(this.LLILZ, i);
                    this.LLIZ.LJIIZILJ(this, c21603219gc.LIZIZ, c21603219gc.LIZ);
                }
                this.LLIZ.LJIJI(this);
                this.LLILZ.clear();
                int i2 = 0;
                while (i2 < getChildCount()) {
                    if (!((C21601819gO) getChildAt(i2).getLayoutParams()).LIZ) {
                        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                        removeViewAt(i2);
                        i2--;
                    }
                    i2++;
                }
                this.LLIZLLLIL = 0;
                scrollTo(0, 0);
            } catch (IllegalAccessException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new RuntimeException(e);
            }
        }
        this.LLIZ = pagerAdapter;
        if (pagerAdapter != null) {
            if (this.LLJILLL == null) {
                this.LLJILLL = new DataSetObserver() { // from class: X.19gf
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
            try {
                LLLLL.set(this.LLIZ, this.LLJILLL);
                this.LLJJJJJIL = false;
                boolean z = this.LLLILZLLLI;
                this.LLLILZLLLI = true;
                this.LLIZ.getCount();
                if (this.LLJ >= 0) {
                    this.LLIZ.LJJIII(this.LLJI, this.LLJIJIL);
                    LJJ(this.LLJ, 0, 0, false, true);
                    this.LLJ = -1;
                    this.LLJI = null;
                    this.LLJIJIL = null;
                    return;
                }
                if (!z) {
                    LJIILLIIL();
                } else {
                    requestLayout();
                }
            } catch (IllegalAccessException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException(e2);
            }
        }
    }

    public void setCanFastSwipe(boolean z) {
        this.LLLF = z;
    }

    public void setChildrenDrawingOrderEnabledCompat(boolean z) {
        if (this.LLLJL == null) {
            try {
                this.LLLJL = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJFF("LiveVerticalViewPager", "Can't find setChildrenDrawingOrderEnabled", e);
            }
        }
        try {
            this.LLLJL.invoke(this, Boolean.valueOf(z));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C20441214yg.LJFF("LiveVerticalViewPager", "Error changing children drawing order", e2);
        }
    }

    public void setCurrentItem(int i) {
        this.LLJJJJJIL = false;
        LJJ(i, 0, 0, !this.LLLILZLLLI, false);
    }

    public void setCurrentItemWithDefaultVelocity(int i) {
        this.LLJJJJJIL = false;
        LJJ(i, 1, 0, true, true);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("viewpager setEnabled->");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("live_viewpager", C2188811AlT.LIZIZ(sbLIZ));
        super.setEnabled(z);
    }

    public void setIsCanChangePage(boolean z) {
        this.LLL = z;
    }

    public void setLandscapeFeedSlideInterceptor(InterfaceC466610IRn interfaceC466610IRn) {
        this.LLLLIIIILLL = interfaceC466610IRn;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Requested offscreen page limit ");
            sbLIZ.append(i);
            sbLIZ.append(" too small; defaulting to ");
            sbLIZ.append(1);
            C20441214yg.LJIIL("LiveVerticalViewPager", C2188811AlT.LIZIZ(sbLIZ));
            i = 1;
        }
        if (i != this.LLJJJJLIIL) {
            this.LLJJJJLIIL = i;
            LJIILLIIL();
        }
    }

    public void setOnPageChangeListener(InterfaceC469360Ias interfaceC469360Ias) {
        this.LLLJIL = interfaceC469360Ias;
    }

    public void setOnSlideInterceptor(InterfaceC470350IcT interfaceC470350IcT) {
        this.LLLL = interfaceC470350IcT;
    }

    public void setOverScrollListener(C0ILG c0ilg) {
        this.LLLILZJ = c0ilg;
    }

    public void setPageMargin(int i) {
        int i2 = this.LLJJ;
        this.LLJJ = i;
        int height = getHeight();
        LJIJ(height, height, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.LLJJI = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollConfigInPortrait(int i) {
        if (i > 0) {
            this.LLLIIIIL = Math.tan(Math.toRadians(90 - (i / 2)));
            this.LLLIIIL = Boolean.TRUE;
        } else {
            this.LLLIIIL = Boolean.FALSE;
        }
    }

    public void setScrollDistanceInPortrait(float f) {
        if (f > 0.0f && this.LLLLIIL != 0.0f) {
            this.LLLII = (int) (f * getClientHeight() * this.LLLLIIL);
        }
    }

    public void setScrollState(int i) {
        if (this.LLLLIL == i) {
            return;
        }
        this.LLLLIL = i;
        InterfaceC469360Ias interfaceC469360Ias = this.LLLJIL;
        if (interfaceC469360Ias != null) {
            interfaceC469360Ias.onPageScrollStateChanged(i);
        }
        if (i == 1) {
            C21602019gQ c21602019gQ = ((C21602919gZ) this.LLLLIILL).LIZIZ;
            if (c21602019gQ.LIZ()) {
                c21602019gQ.LIZJ();
                return;
            }
            return;
        }
        if (i != 0) {
            return;
        }
        C21602019gQ c21602019gQ2 = ((C21602919gZ) this.LLLLIILL).LIZIZ;
        if (!c21602019gQ2.LIZ()) {
            return;
        }
        if (c21602019gQ2.LJ != EnumC21602519gV.NOT_OPT) {
            return;
        }
        c21602019gQ2.LJ = EnumC21602519gV.WAIT_OPT;
    }

    public void setScrollVelocityInPortrait(int i) {
        if (i > 0) {
            float f = this.LLLLIIL;
            if (f != 0.0f) {
                this.LLLFZ = (int) (i * f);
            }
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.LLJJI) {
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

    public C21601619gM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = 1.0f;
        this.LLILLJJLI = true;
        this.LLILLL = true;
        this.LLILZ = new ArrayList<>();
        this.LLILZIL = new C21603219gc();
        this.LLILZLL = new Rect();
        this.LLJ = -1;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJJIJIIJIL = -3.4028235E38f;
        this.LLJJIJIL = Float.MAX_VALUE;
        this.LLJJJJLIIL = 1;
        this.LLL = true;
        this.LLLF = false;
        this.LLLFF = -1;
        this.LLLIIIIL = 2.0d;
        Boolean bool = Boolean.FALSE;
        this.LLLIIIL = bool;
        this.LLLIL = false;
        this.LLLILZ = false;
        this.LLLILZJ = null;
        this.LLLILZLLLI = true;
        this.LLLLII = false;
        this.LLLLIIL = 0.0f;
        this.LLLLIILL = ((IHostPerformanceMonitor) C1161920gLG.LIZJ(IHostPerformanceMonitor.class)).r62(this);
        this.LLLLIILLL = new ARunnableS131S0100000_31(this, 35);
        this.LLLLIL = 0;
        boolean zLJI = MethodIDManager.LJI(202278);
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        final Context context2 = getContext();
        this.LLJILJIL = new Scroller(context2, LLLLJI);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.LLLLIIL = f;
        Method method = C19737612Kg.LIZ;
        this.LLJLILLLLZIIL = viewConfiguration.getScaledPagingTouchSlop();
        LiveAdjustScrollConfigSetting liveAdjustScrollConfigSetting = LiveAdjustScrollConfigSetting.INSTANCE;
        this.LLLFZ = (int) (liveAdjustScrollConfigSetting.getValue().getMinFlingVelocity() * f);
        this.LLLI = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LLLIIL = new C21580619cy(0, context2, this);
        this.LLLIILIL = new C21580619cy(1, context2, this);
        this.LLLII = (int) (liveAdjustScrollConfigSetting.getValue().getMinDistanceForFling() * f);
        this.LLLIIII = (int) (2.0f * f);
        this.LLJL = (int) (f * 16.0f);
        if (LiveScrollAngleSetting.INSTANCE.getValue() > 0) {
            this.LLLIIIIL = Math.tan(Math.toRadians(90 - (r0 / 2)));
            this.LLLIIIL = Boolean.TRUE;
        } else {
            this.LLLIIIL = bool;
        }
        q0.LJIJ(this, new C20094213jo() { // from class: X.19fn
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
                    X.19gM r0 = r3.LIZ
                    androidx.viewpager.widget.PagerAdapter r0 = r0.LLIZ
                    if (r0 == 0) goto L44
                    int r1 = r0.getCount()
                    r0 = 1
                    if (r1 <= r0) goto L44
                L1d:
                    r2.LIZLLL(r0)
                    int r1 = r5.getEventType()
                    r0 = 4096(0x1000, float:5.74E-42)
                    if (r1 != r0) goto L43
                    X.19gM r0 = r3.LIZ
                    androidx.viewpager.widget.PagerAdapter r0 = r0.LLIZ
                    if (r0 == 0) goto L43
                    int r0 = r0.getCount()
                    r2.LIZJ(r0)
                    X.19gM r0 = r3.LIZ
                    int r0 = r0.LLIZLLLIL
                    r2.LIZIZ(r0)
                    X.19gM r0 = r3.LIZ
                    int r0 = r0.LLIZLLLIL
                    r2.LJ(r0)
                L43:
                    return
                L44:
                    r0 = 0
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21598119fn.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
            }

            @Override // X.C20094213jo
            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                boolean z;
                try {
                    super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (C20441214yg.LIZJ()) {
                        C20441214yg.LJ("MyAccessibilityDelegate", e.getMessage());
                    }
                }
                accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
                PagerAdapter pagerAdapter = this.LIZ.LLIZ;
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
                    C21601619gM c21601619gM = this.LIZ;
                    c21601619gM.setCurrentItem(c21601619gM.LLIZLLLIL - 1);
                    return true;
                }
                if (!this.LIZ.canScrollVertically(1)) {
                    return false;
                }
                C21601619gM c21601619gM2 = this.LIZ;
                c21601619gM2.setCurrentItem(c21601619gM2.LLIZLLLIL + 1);
                return true;
            }
        });
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        C14K9.LJIJJ(this, new C0TVI() { // from class: X.14KE
            public final Rect LL = new Rect();

            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) throws Exception {
                C20246014Ju c20246014JuLJIIL = q0.LJIIL(view, c20246014Ju);
                if (c20246014JuLJIIL.LJII()) {
                    return c20246014JuLJIIL;
                }
                Rect rect = this.LL;
                rect.left = c20246014JuLJIIL.LIZLLL();
                rect.top = c20246014JuLJIIL.LJFF();
                rect.right = c20246014JuLJIIL.LJ();
                rect.bottom = c20246014JuLJIIL.LIZJ();
                int childCount = this.LLILLL.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    try {
                        C20246014Ju c20246014JuLIZJ = q0.LIZJ(this.LLILLL.getChildAt(i), c20246014JuLJIIL);
                        rect.left = Math.min(c20246014JuLIZJ.LIZLLL(), rect.left);
                        rect.top = Math.min(c20246014JuLIZJ.LJFF(), rect.top);
                        rect.right = Math.min(c20246014JuLIZJ.LJ(), rect.right);
                        rect.bottom = Math.min(c20246014JuLIZJ.LIZJ(), rect.bottom);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C19EG c19egLJ = C500260Jjc.LJ(context2);
                        if (c19egLJ != null) {
                            String strLJFF = C2450709iz.LJFF(c19egLJ);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("LiveVerticalViewPager onApplyWindowInsets:");
                            sbLIZ.append(strLJFF);
                            C20441214yg.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                        }
                        throw e;
                    }
                }
                return c20246014JuLJIIL.LJIIIZ(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline() || ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLiveInhouse()) {
            setId(com.zhiliaoapp.musically.R.id.viewpager);
        }
    }

    public final C21603219gc LIZ(int i, int i2) {
        C21603219gc c21603219gc = new C21603219gc();
        c21603219gc.LIZIZ = i;
        c21603219gc.LIZ = this.LLIZ.LJJI(i, this);
        c21603219gc.LIZLLL = this.LLIZ.LJIL(i);
        if (i2 >= 0 && i2 < this.LLILZ.size()) {
            ListProtector.add(this.LLILZ, i2, c21603219gc);
            return c21603219gc;
        }
        this.LLILZ.add(c21603219gc);
        return c21603219gc;
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

    public final boolean LJII(int i, int i2) {
        if (Math.abs((int) (i * this.LL)) > this.LLLII && Math.abs(i2) > this.LLLFZ && this.LL >= 1.0d) {
            return true;
        }
        return false;
    }

    public final void LJIL(int i, boolean z) {
        this.LLJJJJJIL = false;
        LJJ(i, 0, 0, z, false);
    }

    public final void LJJI(float f, boolean z) {
        this.LL = Math.max(f, 0.5f);
        this.LLILLJJLI = z;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return ((C21601819gO) ((View) ListProtector.get(null, i2)).getLayoutParams()).LJFF;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) throws Exception {
        C21601819gO c21601819gO;
        C21601819gO c21601819gO2;
        boolean z;
        int i3;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i), ViewGroup.getDefaultSize(0, i2));
        int measuredHeight = getMeasuredHeight();
        this.LLJLIL = Math.min(measuredHeight / 10, this.LLJL);
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
            if (childAt.getVisibility() != 8 && (c21601819gO2 = (C21601819gO) childAt.getLayoutParams()) != null && c21601819gO2.LIZ) {
                int i6 = c21601819gO2.LIZIZ;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                if (i8 != 48 && i8 != 80) {
                    z = false;
                } else {
                    z = true;
                }
                if (i7 != 8388611 && i7 != 8388613) {
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
                int i10 = ((ViewGroup.LayoutParams) c21601819gO2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = measuredWidth;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = measuredWidth;
                }
                int i11 = ((ViewGroup.LayoutParams) c21601819gO2).height;
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
        this.LLJJJ = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        View.MeasureSpec.makeMeasureSpec(paddingTop, 1073741824);
        this.LLJJJIL = true;
        LJIILLIIL();
        this.LLJJJIL = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((c21601819gO = (C21601819gO) childAt2.getLayoutParams()) == null || !c21601819gO.LIZ)) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (paddingTop * c21601819gO.LIZJ), 1073741824);
                try {
                    if (getContext().getApplicationInfo() != null) {
                        childAt2.measure(this.LLJJJ, iMakeMeasureSpec);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (!((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest()) {
                        C20441214yg.LJI("LiveVerticalViewPager", e);
                    } else {
                        throw e;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C21603219gc c21603219gcLJIIIIZZ;
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
            if (childAt.getVisibility() == 0 && (c21603219gcLJIIIIZZ = LJIIIIZZ(childAt)) != null && c21603219gcLJIIIIZZ.LIZIZ == this.LLIZLLLIL && childAt.requestFocus(i, rect)) {
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
    public final void LJIIJJI(int r10, float r11, int r12) {
        /*
            r9 = this;
            int r0 = r9.LLLJ
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
            X.19gO r1 = (X.C21601819gO) r1
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
            X.0Ias r0 = r9.LLLJIL
            if (r0 == 0) goto L72
            r0.onPageScrolled(r10, r11, r12)
        L72:
            r0 = 1
            r9.LLLIZZ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21601619gM.LJIIJJI(int, float, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C21603219gc c21603219gcLJIIIIZZ;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (c21603219gcLJIIIIZZ = LJIIIIZZ(childAt)) != null && c21603219gcLJIIIIZZ.LIZIZ == this.LLIZLLLIL) {
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
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C21601819gO c21601819gO = (C21601819gO) layoutParams;
        boolean z = c21601819gO.LIZ;
        c21601819gO.LIZ = z;
        if (this.LLJJJIL) {
            if (!z) {
                c21601819gO.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
            } else {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
        } else {
            super.addView(view, i, layoutParams);
        }
        C21602019gQ c21602019gQ = ((C21602919gZ) this.LLLLIILL).LIZIZ;
        if (c21602019gQ.LIZ()) {
            if (c21602019gQ.LJ == EnumC21602519gV.NOT_OPT) {
                c21602019gQ.LJ = EnumC21602519gV.WAIT_OPT;
            }
        }
    }

    public final int LJFF(int i, float f, int i2, int i3) {
        int iMax;
        Object obj;
        if (LJII(i3, i2)) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            float turnPageValue = LiveAdjustScrollConfigSetting.INSTANCE.getValue().getTurnPageValue();
            if (turnPageValue > 0.0f && turnPageValue < 1.0f) {
                if (i >= this.LLIZLLLIL) {
                    turnPageValue = 1.0f - turnPageValue;
                }
            } else if (i >= this.LLIZLLLIL) {
                turnPageValue = 0.6f;
            } else {
                turnPageValue = 0.4f;
            }
            i = (int) (i + f + turnPageValue);
        }
        if (this.LLILZ.size() > 0) {
            iMax = Math.max(((C21603219gc) ListProtector.get(this.LLILZ, 0)).LIZIZ, Math.min(i, ((C21603219gc) ListProtector.get(this.LLILZ, r1.size() - 1)).LIZIZ));
        } else {
            iMax = i;
        }
        int i4 = this.LLIZLLLIL;
        String str = "portrait";
        if (i != i4 && C0IIO.LIZ) {
            Map<String, Object> map = C1338270kvh.LIZ;
            if (AbstractC19994813Le.Default.nextInt(100) < 10) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_landscape_view_pager_slide_over_thread");
                c474500IjALIZ.LJJII(Integer.valueOf(iMax), "target_position");
                c474500IjALIZ.LJJII(Integer.valueOf(i4), "cur_position");
                c474500IjALIZ.LJJII(C0IIO.LJI, "live_type");
                if (C497740JfY.LJIL()) {
                    obj = "portrait";
                } else {
                    obj = "landscape";
                }
                c474500IjALIZ.LJJII(obj, "orientation");
                c474500IjALIZ.LIZ();
            }
        }
        int i5 = this.LLIZLLLIL;
        if (i != i5 && i != iMax && C0IIO.LIZ) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_landscape_view_pager_can_not_slide");
            c474500IjALIZ2.LJJII(Integer.valueOf(i), "target_position");
            c474500IjALIZ2.LJJII(Integer.valueOf(i5), "cur_position");
            c474500IjALIZ2.LJJII(C0IIO.LJI, "live_type");
            if (!C497740JfY.LJIL()) {
                str = "landscape";
            }
            c474500IjALIZ2.LJJII(str, "orientation");
            c474500IjALIZ2.LIZ();
        }
        return iMax;
    }

    public final void LJIJ(int i, int i2, int i3, int i4) {
        float fMin;
        if (i2 > 0 && !this.LLILZ.isEmpty()) {
            if (!this.LLJILJIL.isFinished()) {
                this.LLJILJIL.setFinalY(getCurrentItem() * getClientHeight());
                return;
            }
            scrollTo(getScrollX(), (int) ((getScrollY() / (((i2 - getPaddingTop()) - getPaddingBottom()) + i4)) * (((i - getPaddingTop()) - getPaddingBottom()) + i3)));
            return;
        }
        C21603219gc c21603219gcLJIIJ = LJIIJ(this.LLIZLLLIL);
        if (c21603219gcLJIIJ != null) {
            fMin = Math.min(c21603219gcLJIIJ.LJ, this.LLJJIJIL);
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

    public final void LJIJI(final float f, final boolean z, final int i, final int i2) {
        Room room;
        C0IR5 c0ir5 = (C0IR5) DataChannelGlobal.LLILZ.gg0(C1148310fzJ.class);
        if (c0ir5 != null && (room = c0ir5.LIZIZ) != null && c0ir5.LJFF != null) {
            final long id = room.getId();
            final long jLongValue = c0ir5.LIZLLL.longValue();
            C0IXL c0ixl = c0ir5.LJFF;
            final String str = c0ixl.LIZIZ;
            final String str2 = c0ixl.LIZ;
            final String str3 = c0ixl.LJFF;
            C823050WQl.LIZJ().submit(new Runnable() { // from class: X.0IPR
                public final void LIZ() {
                    boolean zLJII = this.LLJI.LJII(i2, i);
                    int iAbs = Math.abs(i);
                    C21601619gM c21601619gM = this.LLJI;
                    int i3 = (iAbs <= c21601619gM.LLLFZ || Math.abs((int) (((float) i2) * c21601619gM.LL)) > this.LLJI.LLLII) ? 0 : 1;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_up_down_draw_end");
                    c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
                    c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "anchor_id");
                    c474500IjALIZ.LJJII(str3, "action_type");
                    c474500IjALIZ.LJJII(str, "enter_from_merge");
                    c474500IjALIZ.LJJII(str2, "enter_method");
                    c474500IjALIZ.LJJIFFI(Float.valueOf(f), "draw_distance");
                    c474500IjALIZ.LJJII(zLJII ? "rapid" : "slow", "speed_type");
                    c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_succeed");
                    c474500IjALIZ.LJJII(i2 > 0 ? "down" : "up", "draw_type");
                    c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_accident");
                    if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                        c474500IjALIZ.LIZ();
                    } else {
                        c474500IjALIZ.LJJIJLIJ();
                        c474500IjALIZ.LJJIJL();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveVerticalViewPager@3b3d.reportScrollLog$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveVerticalViewPager@3b3d.reportScrollLog$1");
                }
            });
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            int i5 = this.LLJJ;
            LJIJ(i2, i4, i5, i5);
        }
    }

    public static boolean LIZJ(View view, boolean z, int i, int i2, int i3) {
        int translationX;
        int translationY;
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (LiveViewpagerCanScrollFixSetting.INSTANCE.getValue()) {
                    if (childAt.getVisibility() == 0) {
                        translationX = (int) childAt.getTranslationX();
                        translationY = (int) childAt.getTranslationY();
                    } else {
                        continue;
                    }
                } else {
                    translationX = 0;
                    translationY = 0;
                }
                int i5 = i3 + scrollY;
                if (i5 >= childAt.getTop() + translationY && i5 < childAt.getBottom() + translationY && (i4 = i2 + scrollX) >= childAt.getLeft() + translationX && i4 < childAt.getRight() + translationX && LIZJ(childAt, true, i, (i4 - childAt.getLeft()) - translationX, (i5 - childAt.getTop()) - translationY)) {
                    return true;
                }
            }
        }
        if (!z || !view.canScrollVertically(-i)) {
            return false;
        }
        return true;
    }

    public final void LJIJJLI(int i, int i2, int i3, boolean z, boolean z2) {
        int clientHeight;
        int scrollY;
        int iAbs;
        int i4 = i3;
        C21603219gc c21603219gcLJIIJ = LJIIJ(i);
        if (c21603219gcLJIIJ != null) {
            clientHeight = (int) (getClientHeight() * Math.max(this.LLJJIJIIJIL, Math.min(c21603219gcLJIIJ.LJ, this.LLJJIJIL)));
        } else {
            clientHeight = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.LLJILJIL;
                if (scroller != null && !scroller.isFinished()) {
                    if (this.LLJILJILJ) {
                        scrollY = this.LLJILJIL.getCurrY();
                    } else {
                        scrollY = this.LLJILJIL.getStartY();
                    }
                    this.LLJILJIL.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollY = getScrollY();
                }
                int scrollX = getScrollX();
                int i5 = -scrollX;
                int i6 = clientHeight - scrollY;
                if (i5 == 0 && i6 == 0) {
                    LIZLLL(false);
                    LJIILLIIL();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientHeight2 = getClientHeight();
                    float f = clientHeight2;
                    float f2 = clientHeight2 / 2;
                    float fSin = f2 + (((float) Math.sin((float) (((double) (Math.min(1.0f, (Math.abs(i5) * 1.0f) / f) - 0.5f)) * 0.4712389167638204d))) * f2);
                    int iAbs2 = Math.abs(i2);
                    if (iAbs2 > 0) {
                        iAbs = Math.round(Math.abs(fSin / iAbs2) * 1000.0f) * 4;
                    } else {
                        iAbs = (int) (((Math.abs(i5) / ((f * this.LLIZ.LJIL(this.LLIZLLLIL)) + this.LLJJ)) + 1.0f) * 100.0f);
                    }
                    int iMin = Math.min(iAbs, 600);
                    if (i4 <= 0) {
                        i4 = iMin;
                    }
                    this.LLJILJILJ = false;
                    this.LLJILJIL.startScroll(scrollX, scrollY, i5, i6, i4);
                    postInvalidateOnAnimation();
                }
            }
            if (z2 && this.LLLJIL != null) {
                ((C21602919gZ) this.LLLLIILL).LIZ(i);
                this.LLLJIL.onPageSelected(i);
                return;
            }
            return;
        }
        if (z2 && this.LLLJIL != null) {
            ((C21602919gZ) this.LLLLIILL).LIZ(i);
            this.LLLJIL.onPageSelected(i);
        }
        LIZLLL(false);
        scrollTo(0, clientHeight);
        LJIILJJIL(clientHeight);
    }

    public final void LJJ(int i, int i2, int i3, boolean z, boolean z2) {
        boolean z3;
        InterfaceC469360Ias interfaceC469360Ias;
        ((C21602919gZ) this.LLLLIILL).LIZIZ.LIZJ();
        PagerAdapter pagerAdapter = this.LLIZ;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            if (!z2 && this.LLIZLLLIL == i && this.LLILZ.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i < 0) {
                i = 0;
            } else if (i >= this.LLIZ.getCount()) {
                i = this.LLIZ.getCount() - 1;
            }
            int i4 = this.LLJJJJLIIL;
            int i5 = this.LLIZLLLIL;
            if (i > i5 + i4 || i < i5 - i4) {
                for (int i6 = 0; i6 < this.LLILZ.size(); i6++) {
                    ((C21603219gc) ListProtector.get(this.LLILZ, i6)).LIZJ = true;
                }
            }
            if (this.LLIZLLLIL != i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.LLLILZLLLI) {
                this.LLIZLLLIL = i;
                ((C21602919gZ) this.LLLLIILL).LIZ(i);
                if (z3 && (interfaceC469360Ias = this.LLLJIL) != null) {
                    interfaceC469360Ias.onPageSelected(i);
                }
                requestLayout();
                return;
            }
            LJIIZILJ(i);
            LJIJJLI(i, i2, i3, z, z3);
            return;
        }
        setScrollingCacheEnabled(false);
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
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21601619gM.onLayout(boolean, int, int, int, int):void");
    }
}
