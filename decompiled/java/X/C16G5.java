package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.16G5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C16G5 extends LinearLayoutCompat {
    public static int LJIIIIZZ(View view) {
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return LJIIIIZZ(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public C16G5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int iCombineMeasuredStates;
        int iLJIIIIZZ;
        int measuredHeight;
        int measuredHeight2;
        int iMakeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == R.id.y97) {
                    view = childAt;
                } else if (id == R.id.d6w) {
                    view2 = childAt;
                } else if ((id == R.id.eub || id == R.id.fbx) && view3 == null) {
                    view3 = childAt;
                } else {
                    super.onMeasure(i, i2);
                    return;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i, 0);
            iLJIIIIZZ = LJIIIIZZ(view2);
            measuredHeight = view2.getMeasuredHeight() - iLJIIIIZZ;
            paddingTop += iLJIIIIZZ;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iLJIIIIZZ = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                iMakeMeasureSpec = 0;
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
            }
            view3.measure(i, iMakeMeasureSpec);
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i4 = size - paddingTop;
        if (view2 != null) {
            int i5 = paddingTop - iLJIIIIZZ;
            int iMin = Math.min(i4, measuredHeight);
            if (iMin > 0) {
                i4 -= iMin;
                iLJIIIIZZ += iMin;
            }
            view2.measure(i, View.MeasureSpec.makeMeasureSpec(iLJIIIIZZ, 1073741824));
            paddingTop = i5 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i4 > 0) {
            view3.measure(i, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i4, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i2, 0));
        if (mode2 != 1073741824) {
            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt3 = getChildAt(i7);
                if (childAt3.getVisibility() != 8) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt3.getLayoutParams();
                    if (layoutParams.width == -1) {
                        int i8 = layoutParams.height;
                        layoutParams.height = childAt3.getMeasuredHeight();
                        measureChildWithMargins(childAt3, iMakeMeasureSpec2, 0, i2, 0);
                        layoutParams.height = i8;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r14, int r15, int r16, int r17, int r18) {
        /*
            r13 = this;
            int r12 = r13.getPaddingLeft()
            int r17 = r17 - r15
            int r0 = r13.getPaddingRight()
            int r11 = r17 - r0
            int r17 = r17 - r12
            int r0 = r13.getPaddingRight()
            int r17 = r17 - r0
            int r2 = r13.getMeasuredHeight()
            int r3 = r13.getChildCount()
            int r10 = r13.getGravity()
            r1 = r10 & 112(0x70, float:1.57E-43)
            r0 = 8388615(0x800007, float:1.1754953E-38)
            r10 = r10 & r0
            r0 = 16
            if (r1 == r0) goto La7
            r0 = 80
            if (r1 == r0) goto L9d
            int r1 = r13.getPaddingTop()
        L32:
            android.graphics.drawable.Drawable r0 = r13.getDividerDrawable()
            r6 = 0
            if (r0 != 0) goto L98
            r9 = 0
        L3a:
            if (r6 >= r3) goto Lb3
            android.view.View r7 = r13.getChildAt(r6)
            if (r7 == 0) goto L84
            int r2 = r7.getVisibility()
            r0 = 8
            if (r2 == r0) goto L84
            int r5 = r7.getMeasuredWidth()
            int r8 = r7.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            int r2 = r4.gravity
            if (r2 >= 0) goto L5d
            r2 = r10
        L5d:
            int r0 = r13.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r2, r0)
            r2 = r0 & 7
            r0 = 1
            if (r2 == r0) goto L8c
            r0 = 5
            if (r2 == r0) goto L87
            int r2 = r4.leftMargin
            int r2 = r2 + r12
        L70:
            boolean r0 = r13.LJII(r6)
            if (r0 == 0) goto L77
            int r1 = r1 + r9
        L77:
            int r0 = r4.topMargin
            int r1 = r1 + r0
            int r5 = r5 + r2
            int r0 = r8 + r1
            r7.layout(r2, r1, r5, r0)
            int r0 = r4.bottomMargin
            int r8 = r8 + r0
            int r1 = r1 + r8
        L84:
            int r6 = r6 + 1
            goto L3a
        L87:
            int r2 = r11 - r5
            int r0 = r4.rightMargin
            goto L96
        L8c:
            int r0 = r17 - r5
            int r2 = r0 / 2
            int r2 = r2 + r12
            int r0 = r4.leftMargin
            int r2 = r2 + r0
            int r0 = r4.rightMargin
        L96:
            int r2 = r2 - r0
            goto L70
        L98:
            int r9 = r0.getIntrinsicHeight()
            goto L3a
        L9d:
            int r1 = r13.getPaddingTop()
            int r1 = r1 + r18
            int r1 = r1 - r16
            int r1 = r1 - r2
            goto L32
        La7:
            int r1 = r13.getPaddingTop()
            int r18 = r18 - r16
            int r18 = r18 - r2
            int r0 = r18 / 2
            int r1 = r1 + r0
            goto L32
        Lb3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16G5.onLayout(boolean, int, int, int, int):void");
    }
}
