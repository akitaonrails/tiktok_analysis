package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.0DPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338810DPz extends ViewGroup {
    public View LL;

    public C338810DPz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0055 A[PHI: r15
      0x0055: PHI (r15v1 int) = (r15v0 int), (r15v0 int), (r15v0 int), (r15v2 int) binds: [B:30:0x00ac, B:26:0x00a4, B:11:0x0050, B:13:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba A[EDGE_INSN: B:43:0x00ba->B:36:0x00ba BREAK  A[LOOP:0: B:3:0x001a->B:22:0x0099], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0099 A[SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C338810DPz.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i6;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        this.LL = null;
        int width = getWidth();
        int childCount = getChildCount();
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 < childCount) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        i6 = marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                    } else {
                        i6 = 0;
                    }
                    measuredWidth = childAt.getMeasuredWidth() + i6;
                    childAt.getMeasuredHeight();
                    if (measuredWidth <= (width - getPaddingLeft()) - getPaddingRight()) {
                        this.LL = childAt;
                        break;
                    }
                }
                i8++;
            } else {
                measuredWidth = 0;
                break;
            }
        }
        int paddingLeft = getPaddingLeft();
        if (C444960Hcc.LIZIZ()) {
            paddingLeft = (width - (measuredWidth + getPaddingLeft())) - getPaddingRight();
        }
        View view = this.LL;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                i5 = marginLayoutParams.leftMargin;
                i7 = marginLayoutParams.topMargin;
            } else {
                i5 = 0;
            }
            int i9 = paddingLeft + i5;
            int paddingTop = getPaddingTop() + i7;
            view.layout(i9, paddingTop, view.getMeasuredWidth() + i9, view.getMeasuredHeight() + paddingTop);
        }
    }
}
