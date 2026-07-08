package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18L9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18L9 extends ViewGroup {
    public final List<View> LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public Drawable LLILZ;
    public Integer LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public String LLJILLL;
    public int LLJJ;
    public Integer LLJJI;
    public final C444890HcV LLJJIII;

    public C18L9() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-2, -2);
    }

    public final int getVisibleViewCount() {
        return ((ArrayList) this.LL).size();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        if (this.LLILZ == null && ((str = this.LLJILLL) == null || str.length() == 0)) {
            return;
        }
        int size = ((ArrayList) this.LL).size();
        for (int i = 0; i < size; i++) {
            View view = (View) ListProtector.get(this.LL, i);
            if (i > 0) {
                int left = ((view.getLeft() - ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin) - this.LLIZLLLIL) - this.LLJ;
                if (C770702zh.LIZ(this.LLJILLL)) {
                    String str2 = this.LLJILLL;
                    if (str2 != null && str2.length() != 0) {
                        this.LLJJIII.setColor(this.LLJJ);
                        Integer num = this.LLJJI;
                        if (num != null) {
                            this.LLJJIII.LIZ(num.intValue());
                        }
                        C444890HcV c444890HcV = this.LLJJIII;
                        c444890HcV.getTextBounds(str2, 0, str2.length(), new Rect());
                        canvas.drawText(str2, left + (this.LLJ / 2.0f), (getHeight() / 2.0f) - ((r11.top + r11.bottom) / 2.0f), c444890HcV);
                    }
                } else {
                    Integer num2 = this.LLILZIL;
                    if (num2 != null && num2.intValue() == 1) {
                        Drawable drawable = this.LLILZ;
                        if (drawable != null) {
                            int paddingTop = getPaddingTop() + this.LLILZLL;
                            int height = ((getHeight() - getPaddingBottom()) - this.LLILZLL) - paddingTop;
                            int iMin = Math.min(this.LLJ - (this.LLIZ * 2), height);
                            int i2 = paddingTop + (height / 2);
                            int i3 = iMin / 2;
                            int i4 = left + this.LLIZ;
                            drawable.setBounds(i4, i2 - i3, iMin + i4, i2 + i3);
                            drawable.draw(canvas);
                        }
                    } else {
                        Drawable drawable2 = this.LLILZ;
                        if (drawable2 != null) {
                            drawable2.setBounds(this.LLIZ + left, getPaddingTop() + this.LLILZLL, (left + this.LLJ) - this.LLIZ, (getHeight() - getPaddingBottom()) - this.LLILZLL);
                        }
                        Drawable drawable3 = this.LLILZ;
                        if (drawable3 != null) {
                            drawable3.draw(canvas);
                        }
                    }
                }
            }
        }
    }

    public final void setChildHorizontalMargin(int i) {
        if (i != this.LLIZLLLIL) {
            this.LLIZLLLIL = i;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setDividerSymbol(com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.SeparatorConfig r9) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18L9.setDividerSymbol(com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.SeparatorConfig):void");
    }

    public final void setMaxTagCount(int i) {
        if (i != this.LLJIJIL) {
            this.LLJIJIL = i;
            requestLayout();
        }
    }

    public final void setVisibleDependOnOrder(boolean z) {
        if (z != this.LLJILJIL) {
            this.LLJILJIL = z;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public C18L9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = new ArrayList();
        this.LLILZIL = 0;
        this.LLJIJIL = -1;
        this.LLJILJIL = true;
        this.LLJJ = -16777216;
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.setAntiAlias(true);
        c444890HcV.setTextAlign(Paint.Align.CENTER);
        this.LLJJIII = c444890HcV;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SingleLineFlowLayout);
        int i = typedArrayObtainStyledAttributes.getInt(R$styleable.SingleLineFlowLayout_gravity, -1);
        this.LLILLJJLI = i;
        this.LLILLL = typedArrayObtainStyledAttributes.getInt(R$styleable.SingleLineFlowLayout_vertical_gravity, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R$styleable.SingleLineFlowLayout_divider);
        this.LLILZLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SingleLineFlowLayout_divider_padding_vertical, 0);
        this.LLIZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SingleLineFlowLayout_divider_padding_horizontal, 0);
        this.LLIZLLLIL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.SingleLineFlowLayout_horizontal_margin, 0);
        this.LLJIJIL = typedArrayObtainStyledAttributes.getInt(R$styleable.SingleLineFlowLayout_max_tag_count, -1);
        this.LLJILJIL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SingleLineFlowLayout_visible_depend_on_order, true);
        this.LLJILJILJ = typedArrayObtainStyledAttributes.getBoolean(R$styleable.SingleLineFlowLayout_child_must_show_all, false);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            this.LLILLJJLI = i == -1 ? 1 : -1;
        }
        LIZ(drawable, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void LIZ(Drawable drawable, Integer num) {
        if (Intrinsics.LJFF(drawable, this.LLILZ)) {
            return;
        }
        this.LLILZ = drawable;
        this.LLILZIL = num;
        this.LLJILLL = null;
        boolean z = false;
        if (drawable != null) {
            this.LLJ = drawable.getIntrinsicWidth() + (this.LLIZ * 2);
            this.LLJI = drawable.getIntrinsicHeight();
        } else {
            this.LLJ = 0;
            this.LLJI = 0;
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ec, code lost:
    
        if (r1 == (-2)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f5, code lost:
    
        if (r1 == (-2)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00f7, code lost:
    
        r15 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18L9.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int paddingTop2;
        int i6;
        ((ArrayList) this.LL).clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        int iMax = 0;
        while (true) {
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                if (((ArrayList) this.LL).isEmpty()) {
                    i6 = 0;
                } else {
                    i6 = this.LLJ + this.LLIZLLLIL;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i6;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i9 = measuredWidth + i8;
                if (i9 > (width - getPaddingLeft()) - getPaddingRight()) {
                    if (this.LLJILJIL) {
                        break;
                    }
                } else {
                    iMax = Math.max(iMax, measuredHeight);
                    ((ArrayList) this.LL).add(childAt);
                    int i10 = this.LLJIJIL;
                    if (i10 > 0 && i10 <= ((ArrayList) this.LL).size()) {
                        i8 = i9;
                        break;
                    }
                    i8 = i9;
                }
            }
            i7++;
        }
        int paddingLeft = getPaddingLeft();
        int i11 = this.LLILLJJLI;
        if (i11 != -1) {
            if (i11 != 0) {
                if (i11 == 1) {
                    paddingLeft = (width - (i8 + getPaddingLeft())) - getPaddingRight();
                    Collections.reverse(this.LL);
                }
            } else {
                paddingLeft = getPaddingLeft() + ((width - i8) / 2);
            }
        } else {
            paddingLeft = getPaddingLeft();
        }
        int size = ((ArrayList) this.LL).size();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) ListProtector.get(this.LL, i12);
            if (view.getVisibility() != 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i13 = marginLayoutParams2.leftMargin + paddingLeft;
                int i14 = this.LLILLL;
                if (i14 != 0) {
                    if (i14 != 1) {
                        paddingTop2 = getPaddingTop() + marginLayoutParams2.topMargin;
                        view.layout(i13, paddingTop2, view.getMeasuredWidth() + i13, view.getMeasuredHeight() + paddingTop2);
                        paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.LLJ + this.LLIZLLLIL;
                    } else {
                        paddingTop = (iMax - view.getMeasuredHeight()) - getPaddingBottom();
                        i5 = marginLayoutParams2.bottomMargin;
                    }
                } else {
                    paddingTop = getPaddingTop() + ((iMax - view.getMeasuredHeight()) / 2) + marginLayoutParams2.topMargin;
                    i5 = marginLayoutParams2.bottomMargin;
                }
                paddingTop2 = paddingTop - i5;
                view.layout(i13, paddingTop2, view.getMeasuredWidth() + i13, view.getMeasuredHeight() + paddingTop2);
                paddingLeft += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.LLJ + this.LLIZLLLIL;
            }
        }
        int childCount2 = getChildCount();
        for (int i15 = 0; i15 < childCount2; i15++) {
            View childAt2 = getChildAt(i15);
            if (!((ArrayList) this.LL).contains(childAt2)) {
                childAt2.layout(0, 0, 0, 0);
            }
        }
    }
}
