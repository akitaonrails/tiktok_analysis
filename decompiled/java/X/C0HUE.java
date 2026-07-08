package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: renamed from: X.0HUE, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HUE extends LinearLayout {
    public boolean LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LinearLayout.LayoutParams(getContext(), attributeSet);
    }

    public C0HUE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GhostMusicTabFlexLayout, 0, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.GhostMusicTabFlexLayout_expectedMarginHorizontal, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.GhostMusicTabFlexLayout_expectedMarginVertical, 0);
        this.LLILZ = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.GhostMusicTabFlexLayout_expectedMaxWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        ViewGroup.MarginLayoutParams marginLayoutParams7;
        ViewGroup.MarginLayoutParams marginLayoutParams8;
        ViewGroup.MarginLayoutParams marginLayoutParams9;
        ViewGroup.MarginLayoutParams marginLayoutParams10;
        ViewGroup.MarginLayoutParams marginLayoutParams11;
        ViewGroup.MarginLayoutParams marginLayoutParams12;
        C08QU c08quLJIIIZ = C09RB.LJIIIZ(new C09RD(this), AFwS236S0000000_6.get$arr$(233));
        if (C09RB.LJFF(c08quLJIIIZ) == 2 && getLayoutParams().width == -2 && getLayoutParams().width == -2) {
            C08QT c08qt = new C08QT(c08quLJIIIZ);
            int iMax = 0;
            int iMax2 = 0;
            while (c08qt.hasNext()) {
                View view = (View) c08qt.next();
                int paddingLeft = getPaddingLeft() + getPaddingRight();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams12 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    i7 = marginLayoutParams12.leftMargin;
                } else {
                    i7 = 0;
                }
                int i15 = paddingLeft + i7;
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                    i8 = marginLayoutParams11.rightMargin;
                } else {
                    i8 = 0;
                }
                int childMeasureSpec = LinearLayout.getChildMeasureSpec(i, i15 + i8, view.getLayoutParams().width);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                    i9 = marginLayoutParams10.topMargin;
                } else {
                    i9 = 0;
                }
                int i16 = paddingTop + i9;
                ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    i10 = marginLayoutParams9.bottomMargin;
                } else {
                    i10 = 0;
                }
                view.measure(childMeasureSpec, LinearLayout.getChildMeasureSpec(i2, i16 + i10, view.getLayoutParams().height));
                int measuredWidth = view.getMeasuredWidth();
                ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                    i11 = marginLayoutParams8.leftMargin;
                } else {
                    i11 = 0;
                }
                int i17 = measuredWidth + i11;
                ViewGroup.LayoutParams layoutParams6 = view.getLayoutParams();
                if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                    i12 = marginLayoutParams7.rightMargin;
                } else {
                    i12 = 0;
                }
                iMax = Math.max(i17 + i12, iMax);
                int measuredHeight = view.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
                if ((layoutParams7 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                    i13 = marginLayoutParams6.topMargin;
                } else {
                    i13 = 0;
                }
                int i18 = measuredHeight + i13;
                ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
                if ((layoutParams8 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams8) != null) {
                    i14 = marginLayoutParams5.bottomMargin;
                } else {
                    i14 = 0;
                }
                iMax2 = Math.max(i18 + i14, iMax2);
            }
            C08QT c08qt2 = new C08QT(c08quLJIIIZ);
            while (c08qt2.hasNext()) {
                View view2 = (View) c08qt2.next();
                ViewGroup.LayoutParams layoutParams9 = view2.getLayoutParams();
                if ((layoutParams9 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams9) != null) {
                    i3 = marginLayoutParams4.leftMargin;
                } else {
                    i3 = 0;
                }
                int i19 = iMax - i3;
                ViewGroup.LayoutParams layoutParams10 = view2.getLayoutParams();
                if ((layoutParams10 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams10) != null) {
                    i4 = marginLayoutParams3.rightMargin;
                } else {
                    i4 = 0;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i4, 1073741824);
                ViewGroup.LayoutParams layoutParams11 = view2.getLayoutParams();
                if ((layoutParams11 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams11) != null) {
                    i5 = marginLayoutParams2.topMargin;
                } else {
                    i5 = 0;
                }
                int i20 = iMax2 - i5;
                ViewGroup.LayoutParams layoutParams12 = view2.getLayoutParams();
                if ((layoutParams12 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams12) != null) {
                    i6 = marginLayoutParams.bottomMargin;
                } else {
                    i6 = 0;
                }
                view2.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(i20 - i6, 1073741824));
            }
            int childCount = (getChildCount() * iMax) + getPaddingLeft() + getPaddingRight() + this.LLILLJJLI;
            int childCount2 = (getChildCount() * iMax2) + getPaddingTop() + getPaddingBottom() + this.LLILLL;
            if (this.LLILZ < childCount) {
                this.LL = false;
                setMeasuredDimension(iMax, childCount2);
                return;
            } else {
                this.LL = true;
                setMeasuredDimension(childCount, iMax2);
                return;
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        int i9;
        int i10;
        int i11;
        int i12;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        ViewGroup.MarginLayoutParams marginLayoutParams7;
        ViewGroup.MarginLayoutParams marginLayoutParams8;
        if (C09RB.LJFF(C09RB.LJIIIZ(new C09RD(this), AFwS236S0000000_6.get$arr$(232))) != 2) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        if (this.LL) {
            List listLJJII = C09RB.LJJII(C09RB.LJIIIZ(new C09RD(this), AFwS236S0000000_6.get$arr$(234)));
            int paddingLeft = getPaddingLeft();
            if (getLayoutDirection() != 0) {
                listLJJII = C13LP.LJLJJLL(listLJJII);
            }
            int i13 = 0;
            for (Object obj : listLJJII) {
                int i14 = i13 + 1;
                if (i13 >= 0) {
                    View view = (View) obj;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        i9 = marginLayoutParams8.leftMargin;
                    } else {
                        i9 = 0;
                    }
                    int i15 = paddingLeft + i9;
                    int paddingTop = getPaddingTop();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                        i10 = marginLayoutParams7.topMargin;
                    } else {
                        i10 = 0;
                    }
                    int i16 = paddingTop + i10;
                    int measuredWidth = view.getMeasuredWidth() + i15;
                    int paddingTop2 = getPaddingTop();
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                        i11 = marginLayoutParams6.topMargin;
                    } else {
                        i11 = 0;
                    }
                    view.layout(i15, i16, measuredWidth, paddingTop2 + i11 + view.getMeasuredHeight());
                    int measuredWidth2 = i15 + view.getMeasuredWidth();
                    ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
                    if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                        i12 = marginLayoutParams5.rightMargin;
                    } else {
                        i12 = 0;
                    }
                    paddingLeft = measuredWidth2 + i12;
                    if (i13 == 0) {
                        paddingLeft += this.LLILLJJLI;
                    }
                    i13 = i14;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return;
        }
        List listLJLJJLL = C13LP.LJLJJLL(C09RB.LJJII(C09RB.LJIIIZ(new C09RD(this), AFwS236S0000000_6.get$arr$(235))));
        int paddingTop3 = getPaddingTop();
        int i17 = 0;
        for (Object obj2 : listLJLJJLL) {
            int i18 = i17 + 1;
            if (i17 >= 0) {
                View view2 = (View) obj2;
                ViewGroup.LayoutParams layoutParams5 = view2.getLayoutParams();
                if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                    i5 = marginLayoutParams4.topMargin;
                } else {
                    i5 = 0;
                }
                int i19 = paddingTop3 + i5;
                int paddingLeft2 = getPaddingLeft();
                ViewGroup.LayoutParams layoutParams6 = view2.getLayoutParams();
                if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                    i6 = marginLayoutParams3.leftMargin;
                } else {
                    i6 = 0;
                }
                int i20 = paddingLeft2 + i6;
                int paddingLeft3 = getPaddingLeft();
                ViewGroup.LayoutParams layoutParams7 = view2.getLayoutParams();
                if ((layoutParams7 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                    i7 = marginLayoutParams2.leftMargin;
                } else {
                    i7 = 0;
                }
                view2.layout(i20, i19, paddingLeft3 + i7 + view2.getMeasuredWidth(), view2.getMeasuredHeight() + i19);
                int measuredHeight = i19 + view2.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams8 = view2.getLayoutParams();
                if ((layoutParams8 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams8) != null) {
                    i8 = marginLayoutParams.topMargin;
                } else {
                    i8 = 0;
                }
                paddingTop3 = measuredHeight + i8;
                if (i17 == 0) {
                    paddingTop3 += this.LLILLL;
                }
                i17 = i18;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
