package X;

import Y.ALAdapterS27S0100000_33;
import Y.ARunnableS133S0100000_33;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.widget.ContentFrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19W6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19W6 extends ViewGroup implements C19WR, InterfaceC1318530kPr, InterfaceC1318370kPb, InterfaceC1318440kPi {
    public static final int[] LLJLIL = {R.attr.b80, android.R.attr.windowContentOverlay};
    public static final C20246014Ju LLJLILLLLZIIL;
    public static final Rect LLJLL;
    public int LL;
    public int LLILLJJLI;
    public ContentFrameLayout LLILLL;
    public C21545619Tq LLILZ;
    public C19W5 LLILZIL;
    public Drawable LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public final Rect LLJILJILJ;
    public final Rect LLJILLL;
    public final Rect LLJJ;
    public final Rect LLJJI;
    public C20246014Ju LLJJIII;
    public C20246014Ju LLJJIJI;
    public C20246014Ju LLJJIJIIJIL;
    public C20246014Ju LLJJIJIL;
    public C19WG LLJJJ;
    public OverScroller LLJJJIL;
    public ViewPropertyAnimator LLJJJJ;
    public final ALAdapterS27S0100000_33 LLJJJJJIL;
    public final ARunnableS133S0100000_33 LLJJJJLIIL;
    public final ARunnableS133S0100000_33 LLJJL;
    public final C1317550kOH LLJJLIIIJLLLLLLLZ;
    public final C19WC LLJL;

    static {
        C20246414Jy c20246414Jy = new C20246414Jy();
        c20246414Jy.LIZ.LJI(C20244914Jj.LIZIZ(0, 1, 0, 1));
        LLJLILLLLZIIL = c20246414Jy.LIZ();
        LLJLL = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void LJIIJ() {
        removeCallbacks(this.LLJJJJLIIL);
        removeCallbacks(this.LLJJL);
        ViewPropertyAnimator viewPropertyAnimator = this.LLJJJJ;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void LJIIL() {
        C19W5 wrapper;
        if (this.LLILLL == null) {
            this.LLILLL = (ContentFrameLayout) findViewById(R.id.a16);
            this.LLILZ = (C21545619Tq) findViewById(R.id.a1_);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.a15);
            if (callbackFindViewById instanceof C19W5) {
                wrapper = (C19W5) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof C19V8)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Can't make a decor toolbar out of ");
                    sbLIZ.append(callbackFindViewById.getClass().getSimpleName());
                    throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
                }
                wrapper = ((C19V8) callbackFindViewById).getWrapper();
            }
            this.LLILZIL = wrapper;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C19W9();
    }

    public int getActionBarHideOffset() {
        C21545619Tq c21545619Tq = this.LLILZ;
        if (c21545619Tq != null) {
            return -((int) c21545619Tq.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C1317550kOH c1317550kOH = this.LLJJLIIIJLLLLLLLZ;
        return c1317550kOH.LIZIZ | c1317550kOH.LIZ;
    }

    @Override // X.C19WR
    public final boolean LIZ() {
        LJIIL();
        return this.LLILZIL.LIZ();
    }

    @Override // X.C19WR
    public final boolean LIZIZ() {
        LJIIL();
        return this.LLILZIL.LIZIZ();
    }

    @Override // X.C19WR
    public final boolean LIZJ() {
        LJIIL();
        return this.LLILZIL.LIZJ();
    }

    @Override // X.C19WR
    public final void LIZLLL() {
        LJIIL();
        this.LLILZIL.LIZLLL();
    }

    @Override // X.C19WR
    public final boolean LJ() {
        LJIIL();
        return this.LLILZIL.LJ();
    }

    @Override // X.C19WR
    public final boolean LJFF() {
        LJIIL();
        return this.LLILZIL.LJFF();
    }

    @Override // X.C19WR
    public final void LJIIIIZZ() {
        LJIIL();
        this.LLILZIL.LJIIL();
    }

    public CharSequence getTitle() {
        LJIIL();
        return this.LLILZIL.getTitle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJIIJ();
    }

    @Override // X.C19WR
    public final void LJII(int i) {
        LJIIL();
        if (i != 2) {
            if (i != 5) {
                if (i == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            }
            this.LLILZIL.LJIIZILJ();
            return;
        }
        this.LLILZIL.LJIIIIZZ();
    }

    public final void LJIIJJI(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(LLJLIL);
        boolean z = false;
        this.LL = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.LLILZLL = drawable;
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        typedArrayObtainStyledAttributes.recycle();
        this.LLJJJIL = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C19W9;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int bottom;
        super.draw(canvas);
        if (this.LLILZLL != null) {
            if (this.LLILZ.getVisibility() == 0) {
                bottom = (int) (this.LLILZ.getBottom() + this.LLILZ.getTranslationY() + 0.5f);
            } else {
                bottom = 0;
            }
            this.LLILZLL.setBounds(0, bottom, getWidth(), this.LLILZLL.getIntrinsicHeight() + bottom);
            this.LLILZLL.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C19W9(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        LJIIL();
        C20246014Ju c20246014JuLJIIJJI = C20246014Ju.LJIIJJI(this, windowInsets);
        boolean zLJIIIZ = LJIIIZ(this.LLILZ, new Rect(c20246014JuLJIIJJI.LIZLLL(), c20246014JuLJIIJJI.LJFF(), c20246014JuLJIIJJI.LJ(), c20246014JuLJIIJJI.LIZJ()), false);
        C14K9.LIZIZ(this, c20246014JuLJIIJJI, this.LLJILJILJ);
        Rect rect = this.LLJILJILJ;
        C20246014Ju c20246014JuLJIILIIL = c20246014JuLJIIJJI.LIZ.LJIILIIL(rect.left, rect.top, rect.right, rect.bottom);
        this.LLJJIII = c20246014JuLJIILIIL;
        if (!this.LLJJIJI.equals(c20246014JuLJIILIIL)) {
            this.LLJJIJI = this.LLJJIII;
            zLJIIIZ = true;
        }
        if (!this.LLJILLL.equals(this.LLJILJILJ)) {
            this.LLJILLL.set(this.LLJILJILJ);
        } else {
            if (zLJIIIZ) {
            }
            return c20246014JuLJIIJJI.LIZ.LIZ().LIZ.LIZJ().LIZ.LIZIZ().LJIIJ();
        }
        requestLayout();
        return c20246014JuLJIIJJI.LIZ.LIZ().LIZ.LIZJ().LIZ.LIZIZ().LJIIJ();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LJIIJJI(getContext());
        C20097313kJ.LIZJ(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.LLJ && !this.LLJI) {
            if (this.LLJIJIL <= this.LLILZ.getHeight()) {
                LJIIJ();
                postDelayed(this.LLJJJJLIIL, 600L);
            } else {
                LJIIJ();
                postDelayed(this.LLJJL, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        LJIIL();
        int i2 = this.LLJILJIL ^ i;
        this.LLJILJIL = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C19WG c19wg = this.LLJJJ;
        if (c19wg != null) {
            ((C19W2) c19wg).LJIILL = !z2;
            if (!z && z2) {
                C19W2 c19w2 = (C19W2) c19wg;
                if (!c19w2.LJIIZILJ) {
                    c19w2.LJIIZILJ = true;
                    c19w2.LJJ(true);
                }
            } else {
                C19W2 c19w22 = (C19W2) c19wg;
                if (c19w22.LJIIZILJ) {
                    c19w22.LJIIZILJ = false;
                    c19w22.LJJ(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.LLJJJ != null) {
            C20097313kJ.LIZJ(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.LLILLJJLI = i;
        C19WG c19wg = this.LLJJJ;
        if (c19wg != null) {
            ((C19W2) c19wg).LJIILJJIL = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        LJIIJ();
        int iMax = Math.max(0, Math.min(i, this.LLILZ.getHeight()));
        C21545619Tq c21545619Tq = this.LLILZ;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21545619Tq);
        c21545619Tq.setTranslationY(-iMax);
    }

    public void setActionBarVisibilityCallback(C19WG c19wg) {
        this.LLJJJ = c19wg;
        if (getWindowToken() != null) {
            ((C19W2) this.LLJJJ).LJIILJJIL = this.LLILLJJLI;
            int i = this.LLJILJIL;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                C20097313kJ.LIZJ(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.LLIZLLLIL = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.LLJ) {
            this.LLJ = z;
            if (!z) {
                LJIIJ();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        LJIIL();
        this.LLILZIL.setIcon(i);
    }

    public void setLogo(int i) {
        LJIIL();
        this.LLILZIL.LJIJ(i);
    }

    public void setOverlayMode(boolean z) {
        this.LLIZ = z;
    }

    @Override // X.C19WR
    public void setWindowCallback(Window.Callback callback) {
        LJIIL();
        this.LLILZIL.setWindowCallback(callback);
    }

    @Override // X.C19WR
    public void setWindowTitle(CharSequence charSequence) {
        LJIIL();
        this.LLILZIL.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C19W9(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        LJIIL();
        this.LLILZIL.setIcon(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.19WC, android.view.View] */
    public C19W6(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJILJILJ = new Rect();
        this.LLJILLL = new Rect();
        this.LLJJ = new Rect();
        this.LLJJI = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        C20246014Ju c20246014Ju = C20246014Ju.LIZIZ;
        this.LLJJIII = c20246014Ju;
        this.LLJJIJI = c20246014Ju;
        this.LLJJIJIIJIL = c20246014Ju;
        this.LLJJIJIL = c20246014Ju;
        this.LLJJJJJIL = new ALAdapterS27S0100000_33(this, 0);
        this.LLJJJJLIIL = new ARunnableS133S0100000_33(this, 3);
        this.LLJJL = new ARunnableS133S0100000_33(this, 4);
        LJIIJJI(context);
        this.LLJJLIIIJLLLLLLLZ = new C1317550kOH();
        ?? r0 = new View(context) { // from class: X.19WC
            @Override // android.view.View
            public final int getWindowSystemUiVisibility() {
                return 0;
            }

            {
                setWillNotDraw(true);
            }
        };
        this.LLJL = r0;
        addView(r0);
    }

    @Override // X.C19WR
    public final void LJI(C19V6 c19v6, C19WV c19wv) {
        LJIIL();
        this.LLILZIL.LJI(c19v6, c19wv);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x011e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r16, int r17) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19W6.onMeasure(int, int):void");
    }

    @Override // X.InterfaceC1318370kPb
    public final void onStopNestedScroll(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    public static boolean LJIIIZ(View view, Rect rect, boolean z) {
        boolean z2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i = marginLayoutParams.leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            marginLayoutParams.leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = marginLayoutParams.topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            marginLayoutParams.topMargin = i4;
            z2 = true;
        }
        int i5 = marginLayoutParams.rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            marginLayoutParams.rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = marginLayoutParams.bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                marginLayoutParams.bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, X.InterfaceC1318530kPr
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C19W2 c19w2;
        C19W4 c19w4;
        this.LLJJLIIIJLLLLLLLZ.LIZ(i, 0);
        this.LLJIJIL = getActionBarHideOffset();
        LJIIJ();
        C19WG c19wg = this.LLJJJ;
        if (c19wg != null && (c19w4 = (c19w2 = (C19W2) c19wg).LJIJJ) != null) {
            c19w4.LIZ();
            c19w2.LJIJJ = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && this.LLILZ.getVisibility() == 0) {
            return this.LLJ;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.LLJ || !z) {
            return false;
        }
        this.LLJJJIL.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.LLJJJIL.getFinalY() > this.LLILZ.getHeight()) {
            LJIIJ();
            this.LLJJL.run();
        } else {
            LJIIJ();
            this.LLJJJJLIIL.run();
        }
        this.LLJI = true;
        return true;
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = marginLayoutParams.leftMargin + paddingLeft;
                int i7 = marginLayoutParams.topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.LLJIJIL + i2;
        this.LLJIJIL = i5;
        setActionBarHideOffset(i5);
    }

    @Override // X.InterfaceC1318370kPb
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // X.InterfaceC1318440kPi
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(view, i, i2, i3, i4, i5);
    }
}
