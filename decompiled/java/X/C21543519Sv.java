package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toolbar;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.Objects;

/* JADX INFO: renamed from: X.19Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21543519Sv extends FrameLayout {
    public boolean LL;
    public final int LLILLJJLI;
    public ViewGroup LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public final Rect LLJI;
    public final C21543619Sw LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public Drawable LLJILLL;
    public Drawable LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public ValueAnimator LLJJIJI;
    public long LLJJIJIIJIL;
    public int LLJJIJIL;
    public C21543819Sy LLJJJ;
    public int LLJJJIL;
    public C20246014Ju LLJJJJ;

    public final void LIZ() {
        if (this.LL) {
            ViewGroup viewGroup = null;
            this.LLILLL = null;
            this.LLILZ = null;
            int i = this.LLILLJJLI;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.LLILLL = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.LLILZ = view;
                }
            }
            if (this.LLILLL == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof C19V8) || (childAt instanceof Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.LLILLL = viewGroup;
            }
            LIZLLL();
            this.LL = false;
        }
    }

    public final void LIZLLL() {
        View view;
        if (!this.LLJILJIL && (view = this.LLILZIL) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                C786410Ut5.LJJJLZIJ(this.LLILZIL, (ViewGroup) parent);
            }
        }
        if (!this.LLJILJIL || this.LLILLL == null) {
            return;
        }
        if (this.LLILZIL == null) {
            this.LLILZIL = new View(getContext());
        }
        if (this.LLILZIL.getParent() == null) {
            this.LLILLL.addView(this.LLILZIL, -1, -1);
        }
    }

    public final void LJ() {
        if (this.LLJILLL == null && this.LLJJ == null) {
            return;
        }
        setScrimsShown(getHeight() + this.LLJJJIL < getScrimVisibleHeightTrigger());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C21536219Qa(-1);
    }

    public int getCollapsedTitleGravity() {
        return this.LLJIJIL.LJII;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.LLJIJIL.LJIJ;
        return typeface == null ? Typeface.DEFAULT : typeface;
    }

    public int getExpandedTitleGravity() {
        return this.LLJIJIL.LJI;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.LLJIJIL.LJIJI;
        return typeface == null ? Typeface.DEFAULT : typeface;
    }

    public int getMaxLines() {
        return this.LLJIJIL.LJJJJLL;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.LLJJIJIL;
        if (i >= 0) {
            return i;
        }
        C20246014Ju c20246014Ju = this.LLJJJJ;
        int iLJFF = c20246014Ju != null ? c20246014Ju.LJFF() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iLJFF, getHeight()) : getHeight() / 3;
    }

    public CharSequence getTitle() {
        if (this.LLJILJIL) {
            return this.LLJIJIL.LJJ;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.LLJJ;
        boolean zLJIILL = false;
        if (drawable != null && drawable.isStateful()) {
            zLJIILL = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.LLJILLL;
        if (drawable2 != null && drawable2.isStateful()) {
            zLJIILL |= drawable2.setState(drawableState);
        }
        C21543619Sw c21543619Sw = this.LLJIJIL;
        if (c21543619Sw != null) {
            zLJIILL |= c21543619Sw.LJIILL(drawableState);
        }
        if (zLJIILL) {
            invalidate();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.19Sy] */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object parent = getParent();
        if (parent instanceof C16GX) {
            setFitsSystemWindows(((View) parent).getFitsSystemWindows());
            if (this.LLJJJ == null) {
                this.LLJJJ = new InterfaceC1324370kZH() { // from class: X.19Sy
                    @Override // X.InterfaceC1324380kZI
                    public final void LLZZJLIL(C16GX c16gx, int i) {
                        int iLJFF;
                        C21543519Sv c21543519Sv = this.LL;
                        c21543519Sv.LLJJJIL = i;
                        C20246014Ju c20246014Ju = c21543519Sv.LLJJJJ;
                        if (c20246014Ju != null) {
                            iLJFF = c20246014Ju.LJFF();
                        } else {
                            iLJFF = 0;
                        }
                        int childCount = this.LL.getChildCount();
                        for (int i2 = 0; i2 < childCount; i2++) {
                            View childAt = this.LL.getChildAt(i2);
                            C21536219Qa c21536219Qa = (C21536219Qa) childAt.getLayoutParams();
                            C16GV c16gvLIZIZ = C21543519Sv.LIZIZ(childAt);
                            int i3 = c21536219Qa.LIZ;
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    c16gvLIZIZ.LIZIZ(Math.round((-i) * c21536219Qa.LIZIZ));
                                }
                            } else {
                                C21543519Sv c21543519Sv2 = this.LL;
                                c21543519Sv2.getClass();
                                c16gvLIZIZ.LIZIZ(C419990GdR.LIZIZ(-i, 0, ((c21543519Sv2.getHeight() - C21543519Sv.LIZIZ(childAt).LIZIZ) - childAt.getHeight()) - ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin));
                            }
                        }
                        this.LL.LJ();
                        C21543519Sv c21543519Sv3 = this.LL;
                        if (c21543519Sv3.LLJJ != null && iLJFF > 0) {
                            c21543519Sv3.postInvalidateOnAnimation();
                        }
                        this.LL.LLJIJIL.LJIILIIL(Math.abs(i) / ((this.LL.getHeight() - this.LL.getMinimumHeight()) - iLJFF));
                    }
                };
            }
            ((C16GX) parent).LIZ(this.LLJJJ);
            C20097313kJ.LIZJ(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ViewParent parent = getParent();
        C21543819Sy c21543819Sy = this.LLJJJ;
        if (c21543819Sy != null && (parent instanceof C16GX)) {
            ((C16GX) parent).LIZLLL(c21543819Sy);
        }
        super.onDetachedFromWindow();
    }

    public Drawable getContentScrim() {
        return this.LLJILLL;
    }

    public int getExpandedTitleMarginBottom() {
        return this.LLJ;
    }

    public int getExpandedTitleMarginEnd() {
        return this.LLIZLLLIL;
    }

    public int getExpandedTitleMarginStart() {
        return this.LLILZLL;
    }

    public int getExpandedTitleMarginTop() {
        return this.LLIZ;
    }

    public int getScrimAlpha() {
        return this.LLJJI;
    }

    public long getScrimAnimationDuration() {
        return this.LLJJIJIIJIL;
    }

    public Drawable getStatusBarScrim() {
        return this.LLJJ;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new C21536219Qa(-1);
    }

    public static C16GV LIZIZ(View view) {
        C16GV c16gv = (C16GV) view.getTag(R.id.view_offset_helper);
        if (c16gv == null) {
            C16GV c16gv2 = new C16GV(view);
            view.setTag(R.id.view_offset_helper, c16gv2);
            return c16gv2;
        }
        return c16gv;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C21536219Qa;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C20246014Ju c20246014Ju;
        int iLJFF;
        Drawable drawable;
        super.draw(canvas);
        LIZ();
        if (this.LLILLL == null && (drawable = this.LLJILLL) != null && this.LLJJI > 0) {
            drawable.mutate().setAlpha(this.LLJJI);
            this.LLJILLL.draw(canvas);
        }
        if (this.LLJILJIL && this.LLJILJILJ) {
            this.LLJIJIL.LJ(canvas);
        }
        if (this.LLJJ != null && this.LLJJI > 0 && (c20246014Ju = this.LLJJJJ) != null && (iLJFF = c20246014Ju.LJFF()) > 0) {
            this.LLJJ.setBounds(0, -this.LLJJJIL, getWidth(), iLJFF - this.LLJJJIL);
            this.LLJJ.mutate().setAlpha(this.LLJJI);
            this.LLJJ.draw(canvas);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C21536219Qa(getContext(), attributeSet);
    }

    public void setCollapsedTitleGravity(int i) {
        C21543619Sw c21543619Sw = this.LLJIJIL;
        if (c21543619Sw.LJII != i) {
            c21543619Sw.LJII = i;
            c21543619Sw.LJIIIZ();
        }
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.LLJIJIL.LJIIJ(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        C21543619Sw c21543619Sw = this.LLJIJIL;
        C19TC c19tc = c21543619Sw.LJIL;
        if (c19tc != null) {
            c19tc.LIZJ = true;
        }
        if (c21543619Sw.LJIJ != typeface) {
            c21543619Sw.LJIJ = typeface;
            c21543619Sw.LJIIIZ();
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.LLJILLL;
        if (drawable2 != drawable) {
            Drawable drawableMutate = null;
            if (drawable2 != null) {
                this.LLJILLL.setCallback(null);
            }
            if (drawable != null) {
                drawableMutate = drawable.mutate();
            }
            this.LLJILLL = drawableMutate;
            if (drawableMutate != null) {
                drawableMutate.setBounds(0, 0, getWidth(), getHeight());
                this.LLJILLL.setCallback(this);
                this.LLJILLL.setAlpha(this.LLJJI);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(C800330VaR.LIZIZ(getContext(), i));
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        C21543619Sw c21543619Sw = this.LLJIJIL;
        if (c21543619Sw.LJI != i) {
            c21543619Sw.LJI = i;
            c21543619Sw.LJIIIZ();
        }
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.LLJ = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.LLIZLLLIL = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.LLILZLL = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.LLIZ = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.LLJIJIL.LJIIL(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        C21543619Sw c21543619Sw = this.LLJIJIL;
        if (c21543619Sw.LJIIJ != colorStateList) {
            c21543619Sw.LJIIJ = colorStateList;
            c21543619Sw.LJIIIZ();
        }
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        C21543619Sw c21543619Sw = this.LLJIJIL;
        C19TC c19tc = c21543619Sw.LJIJJLI;
        if (c19tc != null) {
            c19tc.LIZJ = true;
        }
        if (c21543619Sw.LJIJI != typeface) {
            c21543619Sw.LJIJI = typeface;
            c21543619Sw.LJIIIZ();
        }
    }

    public void setMaxLines(int i) {
        C21543619Sw c21543619Sw = this.LLJIJIL;
        if (i != c21543619Sw.LJJJJLL) {
            c21543619Sw.LJJJJLL = i;
            Bitmap bitmap = c21543619Sw.LJJII;
            if (bitmap != null) {
                C786410Ut5.LJJJJ(bitmap);
                c21543619Sw.LJJII = null;
            }
            c21543619Sw.LJIIIZ();
        }
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.LLJJI) {
            if (this.LLJILLL != null && (viewGroup = this.LLILLL) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.LLJJI = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.LLJJIJIIJIL = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.LLJJIJIL != i) {
            this.LLJJIJIL = i;
            LJ();
        }
    }

    public void setScrimsShown(boolean z) {
        boolean z2;
        if (isLaidOut() && !isInEditMode()) {
            z2 = true;
        } else {
            z2 = false;
        }
        LIZJ(z, z2);
    }

    public void setStatusBarScrim(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.LLJJ;
        if (drawable2 != drawable) {
            Drawable drawableMutate = null;
            if (drawable2 != null) {
                this.LLJJ.setCallback(null);
            }
            if (drawable != null) {
                drawableMutate = drawable.mutate();
            }
            this.LLJJ = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.LLJJ.setState(getDrawableState());
                }
                C16G6.LIZIZ(this.LLJJ, getLayoutDirection());
                Drawable drawable3 = this.LLJJ;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable3.setVisible(z, false);
                this.LLJJ.setCallback(this);
                this.LLJJ.setAlpha(this.LLJJI);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(C800330VaR.LIZIZ(getContext(), i));
    }

    public void setTitle(CharSequence charSequence) {
        C21543619Sw c21543619Sw = this.LLJIJIL;
        if (charSequence == null || !TextUtils.equals(c21543619Sw.LJJ, charSequence)) {
            c21543619Sw.LJJ = charSequence;
            c21543619Sw.LJJI = null;
            Bitmap bitmap = c21543619Sw.LJJII;
            if (bitmap != null) {
                C786410Ut5.LJJJJ(bitmap);
                c21543619Sw.LJJII = null;
            }
            c21543619Sw.LJIIIZ();
        }
        setContentDescription(getTitle());
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.LLJILJIL) {
            this.LLJILJIL = z;
            setContentDescription(getTitle());
            LIZLLL();
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.LLJJ;
        if (drawable != null && drawable.isVisible() != z) {
            this.LLJJ.setVisible(z, false);
        }
        Drawable drawable2 = this.LLJILLL;
        if (drawable2 != null && drawable2.isVisible() != z) {
            this.LLJILLL.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.LLJILLL && drawable != this.LLJJ) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C21536219Qa(layoutParams);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.LLJIJIL.LJIIJJI(colorStateList);
    }

    public C21543519Sv(Context context, AttributeSet attributeSet) {
        int i;
        super(C1369550lk9.LIZ(context, attributeSet, R.attr.bi8, R.style.a2f), attributeSet, R.attr.bi8);
        this.LL = true;
        this.LLJI = new Rect();
        this.LLJJIJIL = -1;
        Context context2 = getContext();
        C21543619Sw c21543619Sw = new C21543619Sw(this);
        this.LLJIJIL = c21543619Sw;
        c21543619Sw.LJJIJIIJIL = C194V.LJ;
        c21543619Sw.LJIIIZ();
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context2, attributeSet, R$styleable.CollapsingToolbarLayout, R.attr.bi8, R.style.a2f, new int[0]);
        int i2 = typedArrayLIZLLL.getInt(R$styleable.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        if (c21543619Sw.LJI != i2) {
            c21543619Sw.LJI = i2;
            c21543619Sw.LJIIIZ();
        }
        int i3 = typedArrayLIZLLL.getInt(R$styleable.CollapsingToolbarLayout_collapsedTitleGravity, 8388627);
        if (c21543619Sw.LJII != i3) {
            c21543619Sw.LJII = i3;
            c21543619Sw.LJIIIZ();
        }
        int dimensionPixelSize = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.LLJ = dimensionPixelSize;
        this.LLIZLLLIL = dimensionPixelSize;
        this.LLIZ = dimensionPixelSize;
        this.LLILZLL = dimensionPixelSize;
        if (typedArrayLIZLLL.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.LLILZLL = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayLIZLLL.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.LLIZLLLIL = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayLIZLLL.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.LLIZ = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayLIZLLL.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.LLJ = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.LLJILJIL = typedArrayLIZLLL.getBoolean(R$styleable.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(C786410Ut5.Yd(typedArrayLIZLLL, R$styleable.CollapsingToolbarLayout_title));
        c21543619Sw.LJIIL(R.style.q2);
        c21543619Sw.LJIIJ(R.style.pc);
        if (typedArrayLIZLLL.hasValue(R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            c21543619Sw.LJIIL(typedArrayLIZLLL.getResourceId(R$styleable.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayLIZLLL.hasValue(R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            c21543619Sw.LJIIJ(typedArrayLIZLLL.getResourceId(R$styleable.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        this.LLJJIJIL = typedArrayLIZLLL.getDimensionPixelSize(R$styleable.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayLIZLLL.hasValue(R$styleable.CollapsingToolbarLayout_maxLines) && (i = typedArrayLIZLLL.getInt(R$styleable.CollapsingToolbarLayout_maxLines, 1)) != c21543619Sw.LJJJJLL) {
            c21543619Sw.LJJJJLL = i;
            Bitmap bitmap = c21543619Sw.LJJII;
            if (bitmap != null) {
                C786410Ut5.LJJJJ(bitmap);
                c21543619Sw.LJJII = null;
            }
            c21543619Sw.LJIIIZ();
        }
        this.LLJJIJIIJIL = typedArrayLIZLLL.getInt(R$styleable.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        setContentScrim(typedArrayLIZLLL.getDrawable(R$styleable.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayLIZLLL.getDrawable(R$styleable.CollapsingToolbarLayout_statusBarScrim));
        this.LLILLJJLI = typedArrayLIZLLL.getResourceId(R$styleable.CollapsingToolbarLayout_toolbarId, -1);
        typedArrayLIZLLL.recycle();
        setWillNotDraw(false);
        C14K9.LJIJJ(this, new C0TVI() { // from class: X.19TA
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
                C20246014Ju c20246014Ju2;
                C21543519Sv c21543519Sv = this.LL;
                c21543519Sv.getClass();
                if (c21543519Sv.getFitsSystemWindows()) {
                    c20246014Ju2 = c20246014Ju;
                } else {
                    c20246014Ju2 = null;
                }
                if (!Objects.equals(c21543519Sv.LLJJJJ, c20246014Ju2)) {
                    c21543519Sv.LLJJJJ = c20246014Ju2;
                    c21543519Sv.requestLayout();
                }
                return c20246014Ju.LIZ.LIZJ();
            }
        });
    }

    public void LIZJ(boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        if (this.LLJJIII != z) {
            int i = 255;
            if (z2) {
                if (!z) {
                    i = 0;
                }
                LIZ();
                ValueAnimator valueAnimator = this.LLJJIJI;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.LLJJIJI = valueAnimator2;
                    valueAnimator2.setDuration(this.LLJJIJIIJIL);
                    ValueAnimator valueAnimator3 = this.LLJJIJI;
                    if (i > this.LLJJI) {
                        timeInterpolator = C194V.LIZJ;
                    } else {
                        timeInterpolator = C194V.LIZLLL;
                    }
                    valueAnimator3.setInterpolator(timeInterpolator);
                    this.LLJJIJI.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.19Qb
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                            this.LL.setScrimAlpha(((Integer) valueAnimator4.getAnimatedValue()).intValue());
                        }
                    });
                } else if (valueAnimator.isRunning()) {
                    this.LLJJIJI.cancel();
                }
                this.LLJJIJI.setIntValues(this.LLJJI, i);
                this.LLJJIJI.start();
            } else {
                if (!z) {
                    i = 0;
                }
                setScrimAlpha(i);
            }
            this.LLJJIII = z;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int iLJFF;
        int measuredHeight;
        int measuredHeight2;
        LIZ();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        C20246014Ju c20246014Ju = this.LLJJJJ;
        if (c20246014Ju != null) {
            iLJFF = c20246014Ju.LJFF();
        } else {
            iLJFF = 0;
        }
        if (mode == 0 && iLJFF > 0) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iLJFF, 1073741824));
        }
        ViewGroup viewGroup = this.LLILLL;
        if (viewGroup != null) {
            View view = this.LLILZ;
            if (view != null && view != this) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    measuredHeight2 = view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                } else {
                    measuredHeight2 = view.getMeasuredHeight();
                }
                setMinimumHeight(measuredHeight2);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                measuredHeight = viewGroup.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
            } else {
                measuredHeight = viewGroup.getMeasuredHeight();
            }
            setMinimumHeight(measuredHeight);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.LLJILLL;
        if (drawable != null && this.LLJJI > 0 && ((view2 = this.LLILZ) == null || view2 == this ? view == this.LLILLL : view == view2)) {
            drawable.mutate().setAlpha(this.LLJJI);
            this.LLJILLL.draw(canvas);
            z = true;
        } else {
            z = false;
        }
        if (super.drawChild(canvas, view, j) || z) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.LLJILLL;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CharSequence title;
        View view;
        boolean z2;
        boolean z3;
        int titleMarginBottom;
        int titleMarginStart;
        int titleMarginEnd;
        int titleMarginTop;
        int i5;
        int i6;
        int i7;
        super.onLayout(z, i, i2, i3, i4);
        C20246014Ju c20246014Ju = this.LLJJJJ;
        if (c20246014Ju != null) {
            int iLJFF = c20246014Ju.LJFF();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iLJFF) {
                    childAt.offsetTopAndBottom(iLJFF);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            C16GV c16gvLIZIZ = LIZIZ(getChildAt(i9));
            c16gvLIZIZ.LIZIZ = c16gvLIZIZ.LIZ.getTop();
            c16gvLIZIZ.LIZJ = c16gvLIZIZ.LIZ.getLeft();
        }
        if (this.LLJILJIL && (view = this.LLILZIL) != null) {
            if (view.isAttachedToWindow() && this.LLILZIL.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LLJILJILJ = z2;
            if (z2) {
                if (getLayoutDirection() == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                View view2 = this.LLILZ;
                if (view2 == null) {
                    view2 = this.LLILLL;
                }
                int height = ((getHeight() - LIZIZ(view2).LIZIZ) - view2.getHeight()) - ((FrameLayout.LayoutParams) view2.getLayoutParams()).bottomMargin;
                C1292440jjm.LIZ(this.LLJI, this.LLILZIL, this);
                ViewGroup viewGroup = this.LLILLL;
                if (viewGroup instanceof C19V8) {
                    C19V8 c19v8 = (C19V8) viewGroup;
                    titleMarginStart = c19v8.getTitleMarginStart();
                    titleMarginEnd = c19v8.getTitleMarginEnd();
                    titleMarginTop = c19v8.getTitleMarginTop();
                    titleMarginBottom = c19v8.getTitleMarginBottom();
                } else if (Build.VERSION.SDK_INT >= 24 && (viewGroup instanceof Toolbar)) {
                    Toolbar toolbar = (Toolbar) viewGroup;
                    titleMarginStart = toolbar.getTitleMarginStart();
                    titleMarginEnd = toolbar.getTitleMarginEnd();
                    titleMarginTop = toolbar.getTitleMarginTop();
                    titleMarginBottom = toolbar.getTitleMarginBottom();
                } else {
                    titleMarginBottom = 0;
                    titleMarginStart = 0;
                    titleMarginEnd = 0;
                    titleMarginTop = 0;
                }
                C21543619Sw c21543619Sw = this.LLJIJIL;
                Rect rect = this.LLJI;
                int i10 = rect.left;
                if (z3) {
                    i5 = titleMarginEnd;
                } else {
                    i5 = titleMarginStart;
                }
                int i11 = i10 + i5;
                int i12 = rect.top + height + titleMarginTop;
                int i13 = rect.right;
                if (!z3) {
                    titleMarginStart = titleMarginEnd;
                }
                int i14 = i13 - titleMarginStart;
                int i15 = (rect.bottom + height) - titleMarginBottom;
                Rect rect2 = c21543619Sw.LJ;
                if (rect2.left != i11 || rect2.top != i12 || rect2.right != i14 || rect2.bottom != i15) {
                    rect2.set(i11, i12, i14, i15);
                    c21543619Sw.LJJIIZ = true;
                    c21543619Sw.LJIIIIZZ();
                }
                C21543619Sw c21543619Sw2 = this.LLJIJIL;
                if (z3) {
                    i6 = this.LLIZLLLIL;
                } else {
                    i6 = this.LLILZLL;
                }
                int i16 = this.LLJI.top + this.LLIZ;
                int i17 = i3 - i;
                if (z3) {
                    i7 = this.LLILZLL;
                } else {
                    i7 = this.LLIZLLLIL;
                }
                int i18 = i17 - i7;
                int i19 = (i4 - i2) - this.LLJ;
                Rect rect3 = c21543619Sw2.LIZLLL;
                if (rect3.left != i6 || rect3.top != i16 || rect3.right != i18 || rect3.bottom != i19) {
                    rect3.set(i6, i16, i18, i19);
                    c21543619Sw2.LJJIIZ = true;
                    c21543619Sw2.LJIIIIZZ();
                }
                this.LLJIJIL.LJIIIZ();
            }
        }
        if (this.LLILLL != null && this.LLJILJIL && TextUtils.isEmpty(this.LLJIJIL.LJJ)) {
            ViewGroup viewGroup2 = this.LLILLL;
            if (viewGroup2 instanceof C19V8) {
                title = ((C19V8) viewGroup2).getTitle();
            } else if (viewGroup2 instanceof Toolbar) {
                title = ((Toolbar) viewGroup2).getTitle();
            } else {
                title = null;
            }
            setTitle(title);
        }
        LJ();
        int childCount3 = getChildCount();
        for (int i20 = 0; i20 < childCount3; i20++) {
            LIZIZ(getChildAt(i20)).LIZ();
        }
    }
}
