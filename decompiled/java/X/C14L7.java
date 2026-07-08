package X;

import Y.AComparatorS49S0000000_30;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.14L7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14L7 extends ViewGroup {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public List<C14L9> LLILZLL;

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C14L8(-2);
    }

    public final int getMarginEndThreshold() {
        return this.LLILZ;
    }

    public final int getMarginEndValue() {
        return this.LLILZIL;
    }

    public final int getMaxLines() {
        return this.LLILLJJLI;
    }

    public final int getVerticalLayoutDirection() {
        return this.LL;
    }

    public final int getVerticalSpacing() {
        return this.LLILLL;
    }

    public static C14L8 LIZ(View view) {
        C14L8 c14l8;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C14L8) || (c14l8 = (C14L8) layoutParams) == null) {
            return new C14L8(-2);
        }
        return c14l8;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C14L8;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C14L8(getContext(), attributeSet);
    }

    public final void setMarginEndThreshold(int i) {
        if (this.LLILZ != i) {
            this.LLILZ = i;
            requestLayout();
        }
    }

    public final void setMarginEndValue(int i) {
        if (this.LLILZIL != i) {
            this.LLILZIL = i;
            requestLayout();
        }
    }

    public final void setMaxLines(int i) {
        if (this.LLILLJJLI != i) {
            this.LLILLJJLI = i;
            requestLayout();
        }
    }

    public final void setVerticalLayoutDirection(int i) {
        if (this.LL != i) {
            this.LL = i;
            requestLayout();
        }
    }

    public final void setVerticalSpacing(int i) {
        if (this.LLILLL != i) {
            this.LLILLL = i;
            requestLayout();
        }
    }

    public final void setViews(List<? extends Pair<? extends View, Integer>> list) {
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        for (Pair<? extends View, Integer> pair : list) {
            View first = pair.getFirst();
            int iIntValue = pair.getSecond().intValue();
            C14L8 c14l8 = new C14L8(-2);
            c14l8.LIZ = iIntValue;
            addView(first, c14l8);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C14L8(layoutParams);
    }

    public C14L7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLJJLI = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.BenefitsVerticalLayout, 0, 0);
        setVerticalLayoutDirection(typedArrayObtainStyledAttributes.getInt(R$styleable.BenefitsVerticalLayout_bvl_layoutDirection, 0));
        setMaxLines(typedArrayObtainStyledAttributes.getInt(R$styleable.BenefitsVerticalLayout_bvl_maxLines, -1));
        setVerticalSpacing(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.BenefitsVerticalLayout_bvl_verticalSpacing, 0));
        typedArrayObtainStyledAttributes.recycle();
        this.LLILZ = -1;
        this.LLILZLL = C13BV.INSTANCE;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4 = 0;
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, getChildCount());
        ArrayList<View> arrayList = new ArrayList();
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            View childAt = getChildAt(it2.nextInt());
            if (childAt != null) {
                arrayList.add(childAt);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        for (View view : arrayList) {
            arrayList2.add(new C14L9(LIZ(view).LIZ, view));
        }
        List<C14L9> listLJLLLL = C13LP.LJLLLL(new AComparatorS49S0000000_30(5), arrayList2);
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("total children start ======================");
        for (C14L9 c14l9 : listLJLLLL) {
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("priority: ");
            sbLIZ.append(c14l9.LIZIZ);
            sbLIZ.append(",child: ");
            sbLIZ.append(c14l9.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("total children end ======================");
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        for (Object obj : listLJLLLL) {
            C14L9 c14l92 = (C14L9) obj;
            int i6 = this.LLILLJJLI;
            if (i6 == -1 || i5 < i6) {
                if (c14l92.LIZ.getVisibility() != 8) {
                    i5++;
                    arrayList3.add(obj);
                }
            }
        }
        List<C14L9> listLJLJJLL = arrayList3;
        if (this.LL == 1) {
            listLJLJJLL = C13LP.LJLJJLL(arrayList3);
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("visible children start ======================");
        for (C14L9 c14l93 : listLJLJJLL) {
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("priority: ");
            sbLIZ2.append(c14l93.LIZIZ);
            sbLIZ2.append(",child: ");
            sbLIZ2.append(c14l93.LIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            c2341109Fh2.getClass();
            C2341109Fh.LIZ(strLIZIZ2);
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("visible children end ======================");
        this.LLILZLL = listLJLJJLL;
        int paddingTop = getPaddingTop();
        Iterator<C14L9> it3 = listLJLJJLL.iterator();
        int i7 = 0;
        int i8 = 0;
        boolean z = true;
        while (it3.hasNext()) {
            View view2 = it3.next().LIZ;
            C14L8 c14l8LIZ = LIZ(view2);
            ((ViewGroup.MarginLayoutParams) c14l8LIZ).leftMargin = i4;
            ((ViewGroup.MarginLayoutParams) c14l8LIZ).rightMargin = i4;
            c14l8LIZ.setMarginStart(i4);
            c14l8LIZ.setMarginEnd(i4);
            measureChildWithMargins(view2, i, 0, i2, 0);
            if (z) {
                i3 = 0;
            } else {
                i3 = this.LLILLL;
            }
            int i9 = ((ViewGroup.MarginLayoutParams) c14l8LIZ).topMargin + paddingTop + i3;
            c14l8LIZ.LIZIZ = i9;
            int measuredHeight = i9 + view2.getMeasuredHeight();
            int i10 = this.LLILZ;
            if (i10 != -1 && measuredHeight > i10) {
                int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
                if (size < 0) {
                    size = 0;
                }
                int i11 = this.LLILZIL;
                if (i11 <= size) {
                    size = i11;
                }
                C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("beyond marginEndThreshold, childBottom = ");
                sbLIZ3.append(measuredHeight);
                sbLIZ3.append(", marginEndThreshold = ");
                sbLIZ3.append(this.LLILZ);
                sbLIZ3.append(", set marginEnd = ");
                sbLIZ3.append(size);
                sbLIZ3.append(" (requested ");
                sbLIZ3.append(this.LLILZIL);
                sbLIZ3.append(')');
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c2341109Fh3.getClass();
                C2341109Fh.LIZJ(strLIZIZ3);
                c14l8LIZ.setMarginEnd(size);
                if (getLayoutDirection() == 1) {
                    ((ViewGroup.MarginLayoutParams) c14l8LIZ).leftMargin = size;
                } else {
                    ((ViewGroup.MarginLayoutParams) c14l8LIZ).rightMargin = size;
                }
                measureChildWithMargins(view2, i, 0, i2, 0);
            }
            int measuredHeight2 = view2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c14l8LIZ).topMargin + ((ViewGroup.MarginLayoutParams) c14l8LIZ).bottomMargin;
            int measuredWidth = view2.getMeasuredWidth() + c14l8LIZ.getMarginStart() + c14l8LIZ.getMarginEnd();
            int i12 = measuredHeight2 + i3;
            paddingTop += i12;
            i7 += i12;
            if (i8 < measuredWidth) {
                i8 = measuredWidth;
            }
            i4 = 0;
            z = false;
        }
        setMeasuredDimension(ViewGroup.resolveSize(i8 + getPaddingStart() + getPaddingEnd(), i), ViewGroup.resolveSize(i7 + getPaddingTop() + getPaddingBottom(), i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041 A[PHI: r3
      0x0041: PHI (r3v3 int) = (r3v1 int), (r3v5 int) binds: [B:15:0x005e, B:11:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r0 = r10.getLayoutDirection()
            r8 = 1
            if (r0 == r8) goto L8
            r8 = 0
        L8:
            java.util.List<X.14L9> r0 = r10.LLILZLL
            java.util.Iterator r9 = r0.iterator()
        Le:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r9.next()
            X.14L9 r0 = (X.C14L9) r0
            android.view.View r7 = r0.LIZ
            X.14L8 r6 = LIZ(r7)
            int r5 = r7.getMeasuredHeight()
            int r4 = r6.LIZIZ
            if (r8 == 0) goto L47
            int r3 = r10.getPaddingLeft()
            int r2 = r10.getPaddingRight()
            int r0 = r6.getMarginEnd()
            int r3 = r3 + r0
            int r1 = r10.getWidth()
            int r1 = r1 - r2
            int r0 = r6.getMarginStart()
            int r1 = r1 - r0
            if (r1 >= r3) goto L42
        L41:
            r1 = r3
        L42:
            int r5 = r5 + r4
            r7.layout(r3, r4, r1, r5)
            goto Le
        L47:
            int r3 = r10.getPaddingLeft()
            int r2 = r10.getPaddingRight()
            int r0 = r6.getMarginStart()
            int r3 = r3 + r0
            int r1 = r10.getWidth()
            int r1 = r1 - r2
            int r0 = r6.getMarginEnd()
            int r1 = r1 - r0
            if (r1 >= r3) goto L42
            goto L41
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14L7.onLayout(boolean, int, int, int, int):void");
    }
}
