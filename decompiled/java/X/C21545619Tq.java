package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Tq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21545619Tq extends FrameLayout {
    public boolean LL;
    public C21547719Ul LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public Drawable LLILZIL;
    public Drawable LLILZLL;
    public Drawable LLIZ;
    public final boolean LLIZLLLIL;
    public boolean LLJ;
    public final int LLJI;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.LLILZIL;
        if (drawable != null && drawable.isStateful()) {
            this.LLILZIL.setState(getDrawableState());
        }
        Drawable drawable2 = this.LLILZLL;
        if (drawable2 != null && drawable2.isStateful()) {
            this.LLILZLL.setState(getDrawableState());
        }
        Drawable drawable3 = this.LLIZ;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.LLIZ.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.LLILZIL;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.LLILZLL;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.LLIZ;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LLILLL = findViewById(R.id.a15);
        this.LLILZ = findViewById(R.id.a2u);
    }

    public View getTabContainer() {
        return this.LLILLJJLI;
    }

    public static int LIZ(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.LL && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        if (this.LLILZIL != null) {
            this.LLILZIL.setCallback(null);
            unscheduleDrawable(this.LLILZIL);
        }
        this.LLILZIL = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.LLILLL;
            if (view != null) {
                this.LLILZIL.setBounds(view.getLeft(), this.LLILLL.getTop(), this.LLILLL.getRight(), this.LLILLL.getBottom());
            }
        }
        boolean z = true;
        if (!this.LLIZLLLIL ? this.LLILZIL != null || this.LLILZLL != null : this.LLIZ != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        if (this.LLIZ != null) {
            this.LLIZ.setCallback(null);
            unscheduleDrawable(this.LLIZ);
        }
        this.LLIZ = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.LLIZLLLIL && (drawable2 = this.LLIZ) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.LLIZLLLIL ? !(this.LLILZIL != null || this.LLILZLL != null) : this.LLIZ == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2;
        if (this.LLILZLL != null) {
            this.LLILZLL.setCallback(null);
            unscheduleDrawable(this.LLILZLL);
        }
        this.LLILZLL = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.LLJ && (drawable2 = this.LLILZLL) != null) {
                drawable2.setBounds(this.LLILLJJLI.getLeft(), this.LLILLJJLI.getTop(), this.LLILLJJLI.getRight(), this.LLILLJJLI.getBottom());
            }
        }
        if (!this.LLIZLLLIL ? !(this.LLILZIL != null || this.LLILZLL != null) : this.LLIZ == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C21547719Ul c21547719Ul) {
        C21547719Ul c21547719Ul2 = this.LLILLJJLI;
        if (c21547719Ul2 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, c21547719Ul2);
            removeView(c21547719Ul2);
        }
        this.LLILLJJLI = c21547719Ul;
        if (c21547719Ul != null) {
            addView(c21547719Ul);
            ViewGroup.LayoutParams layoutParams = c21547719Ul.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c21547719Ul.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        int i;
        this.LL = z;
        if (z) {
            i = 393216;
        } else {
            i = 262144;
        }
        setDescendantFocusability(i);
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
        Drawable drawable = this.LLILZIL;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.LLILZLL;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.LLIZ;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.LLILZIL || this.LLIZLLLIL) {
            if (drawable != this.LLILZLL || !this.LLJ) {
                if ((drawable != this.LLIZ || !this.LLIZLLLIL) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public C21545619Tq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new Drawable(this) { // from class: X.19Tr
            public final C21545619Tq LIZ;

            @Override // android.graphics.drawable.Drawable
            public final int getOpacity() {
                return 0;
            }

            @Override // android.graphics.drawable.Drawable
            public final void setAlpha(int i) {
            }

            @Override // android.graphics.drawable.Drawable
            public final void setColorFilter(ColorFilter colorFilter) {
            }

            {
                this.LIZ = this;
            }

            @Override // android.graphics.drawable.Drawable
            public final void draw(Canvas canvas) {
                C21545619Tq c21545619Tq = this.LIZ;
                if (c21545619Tq.LLIZLLLIL) {
                    Drawable drawable = c21545619Tq.LLIZ;
                    if (drawable != null) {
                        drawable.draw(canvas);
                        return;
                    }
                    return;
                }
                Drawable drawable2 = c21545619Tq.LLILZIL;
                if (drawable2 != null) {
                    drawable2.draw(canvas);
                }
                C21545619Tq c21545619Tq2 = this.LIZ;
                Drawable drawable3 = c21545619Tq2.LLILZLL;
                if (drawable3 == null || !c21545619Tq2.LLJ) {
                    return;
                }
                drawable3.draw(canvas);
            }

            @Override // android.graphics.drawable.Drawable
            public final void getOutline(Outline outline) {
                C21545619Tq c21545619Tq = this.LIZ;
                if (c21545619Tq.LLIZLLLIL) {
                    if (c21545619Tq.LLIZ != null) {
                        c21545619Tq.LLILZIL.getOutline(outline);
                    }
                } else {
                    Drawable drawable = c21545619Tq.LLILZIL;
                    if (drawable == null) {
                        return;
                    }
                    drawable.getOutline(outline);
                }
            }
        });
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ActionBar);
        this.LLILZIL = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ActionBar_background);
        this.LLILZLL = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundStacked);
        this.LLJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.ActionBar_height, -1);
        boolean z = true;
        if (getId() == R.id.vv2) {
            this.LLIZLLLIL = true;
            this.LLIZ = typedArrayObtainStyledAttributes.getDrawable(R$styleable.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.LLIZLLLIL ? this.LLILZIL != null || this.LLILZLL != null : this.LLIZ != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int i3;
        if (this.LLILLL == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.LLJI) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.LLILLL == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        C21547719Ul c21547719Ul = this.LLILLJJLI;
        if (c21547719Ul != null && c21547719Ul.getVisibility() != 8 && mode != 1073741824) {
            View view = this.LLILLL;
            int iLIZ = 0;
            if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
                iLIZ = LIZ(this.LLILLL);
            } else {
                View view2 = this.LLILZ;
                if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                    iLIZ = LIZ(this.LLILZ);
                }
            }
            if (mode == Integer.MIN_VALUE) {
                size = View.MeasureSpec.getSize(i2);
            } else {
                size = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(iLIZ + LIZ(this.LLILLJJLI), size));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            super.onLayout(r8, r9, r10, r11, r12)
            X.19Ul r6 = r7.LLILLJJLI
            r1 = 8
            r3 = 0
            if (r6 == 0) goto Lbc
            int r0 = r6.getVisibility()
            if (r0 == r1) goto Lbc
            r5 = 1
        L11:
            int r0 = r6.getVisibility()
            if (r0 == r1) goto L2e
            int r4 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r6.getMeasuredHeight()
            int r1 = r4 - r0
            int r0 = r2.bottomMargin
            int r1 = r1 - r0
            int r4 = r4 - r0
            r6.layout(r9, r1, r11, r4)
        L2e:
            boolean r0 = r7.LLIZLLLIL
            if (r0 == 0) goto L45
            android.graphics.drawable.Drawable r2 = r7.LLIZ
            if (r2 == 0) goto L44
            int r1 = r7.getMeasuredWidth()
            int r0 = r7.getMeasuredHeight()
            r2.setBounds(r3, r3, r1, r0)
        L41:
            r7.invalidate()
        L44:
            return
        L45:
            android.graphics.drawable.Drawable r0 = r7.LLILZIL
            if (r0 == 0) goto L6f
            android.view.View r0 = r7.LLILLL
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L8b
            android.graphics.drawable.Drawable r4 = r7.LLILZIL
            android.view.View r0 = r7.LLILLL
            int r3 = r0.getLeft()
            android.view.View r0 = r7.LLILLL
            int r2 = r0.getTop()
            android.view.View r0 = r7.LLILLL
            int r1 = r0.getRight()
            android.view.View r0 = r7.LLILLL
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
        L6e:
            r3 = 1
        L6f:
            r7.LLJ = r5
            if (r5 == 0) goto Lb9
            android.graphics.drawable.Drawable r4 = r7.LLILZLL
            if (r4 == 0) goto Lb9
            int r3 = r6.getLeft()
            int r2 = r6.getTop()
            int r1 = r6.getRight()
            int r0 = r6.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L41
        L8b:
            android.view.View r0 = r7.LLILZ
            if (r0 == 0) goto Lb3
            int r0 = r0.getVisibility()
            if (r0 != 0) goto Lb3
            android.graphics.drawable.Drawable r4 = r7.LLILZIL
            android.view.View r0 = r7.LLILZ
            int r3 = r0.getLeft()
            android.view.View r0 = r7.LLILZ
            int r2 = r0.getTop()
            android.view.View r0 = r7.LLILZ
            int r1 = r0.getRight()
            android.view.View r0 = r7.LLILZ
            int r0 = r0.getBottom()
            r4.setBounds(r3, r2, r1, r0)
            goto L6e
        Lb3:
            android.graphics.drawable.Drawable r0 = r7.LLILZIL
            r0.setBounds(r3, r3, r3, r3)
            goto L6e
        Lb9:
            if (r3 == 0) goto L44
            goto L41
        Lbc:
            r5 = 0
            if (r6 == 0) goto L2e
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21545619Tq.onLayout(boolean, int, int, int, int):void");
    }
}
