package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.profile.business.ur.school.verifyschool.EnterEmailPageAssem;

/* JADX INFO: renamed from: X.0Dhu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class ViewOnLayoutChangeListenerC346320Dhu implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC346320Dhu(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC346320Dhu viewOnLayoutChangeListenerC346320Dhu, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C21578619ce) viewOnLayoutChangeListenerC346320Dhu.l0).removeOnLayoutChangeListener(viewOnLayoutChangeListenerC346320Dhu);
        if (((C21578619ce) viewOnLayoutChangeListenerC346320Dhu.l0).canScrollVertically(1)) {
            C786410Ut5.LJLLLLLL(0, (View) viewOnLayoutChangeListenerC346320Dhu.l1);
            ViewGroup.LayoutParams layoutParams = ((View) viewOnLayoutChangeListenerC346320Dhu.l2).getLayoutParams();
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70));
            C786410Ut5.W5((View) viewOnLayoutChangeListenerC346320Dhu.l2, layoutParams);
            return;
        }
        C786410Ut5.LJLLLLLL(4, (View) viewOnLayoutChangeListenerC346320Dhu.l1);
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC346320Dhu viewOnLayoutChangeListenerC346320Dhu, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i9;
        int i10;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i11;
        int i12;
        int i13;
        int i14;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        int i15 = i4 - i2;
        if (i8 - i6 == i15) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = ((LinearLayout) viewOnLayoutChangeListenerC346320Dhu.l0).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int measuredHeight = ((LinearLayout) viewOnLayoutChangeListenerC346320Dhu.l0).getMeasuredHeight();
        int iIntValue = 0;
        if (marginLayoutParams != null) {
            i9 = marginLayoutParams.topMargin;
        } else {
            i9 = 0;
        }
        int i16 = measuredHeight + i9;
        if (marginLayoutParams != null) {
            i10 = marginLayoutParams.bottomMargin;
        } else {
            i10 = 0;
        }
        int i17 = i16 + i10;
        ViewGroup.LayoutParams layoutParams2 = ((LinearLayout) viewOnLayoutChangeListenerC346320Dhu.l1).getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        } else {
            marginLayoutParams2 = null;
        }
        int measuredHeight2 = ((LinearLayout) viewOnLayoutChangeListenerC346320Dhu.l1).getMeasuredHeight();
        if (marginLayoutParams2 != null) {
            i11 = marginLayoutParams2.topMargin;
        } else {
            i11 = 0;
        }
        int i18 = measuredHeight2 + i11;
        if (marginLayoutParams2 != null) {
            i12 = marginLayoutParams2.bottomMargin;
        } else {
            i12 = 0;
        }
        int i19 = i18 + i12;
        int paddingTop = ((EnterEmailPageAssem) viewOnLayoutChangeListenerC346320Dhu.l2).getContentView().getPaddingTop() + ((EnterEmailPageAssem) viewOnLayoutChangeListenerC346320Dhu.l2).getContentView().getPaddingBottom();
        ViewGroup.LayoutParams layoutParams3 = ((EnterEmailPageAssem) viewOnLayoutChangeListenerC346320Dhu.l2).getContentView().getLayoutParams();
        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
            i13 = marginLayoutParams6.topMargin;
        } else {
            i13 = 0;
        }
        ViewGroup.LayoutParams layoutParams4 = ((EnterEmailPageAssem) viewOnLayoutChangeListenerC346320Dhu.l2).getContentView().getLayoutParams();
        if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
            i14 = marginLayoutParams5.bottomMargin;
        } else {
            i14 = 0;
        }
        int i20 = i13 + i14;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        C1748330vb5 c1748330vb5 = ((EnterEmailPageAssem) viewOnLayoutChangeListenerC346320Dhu.l2).LLJJJJLIIL;
        if (c1748330vb5 != null && c1748330vb5.getVisibility() != 0) {
            iIntValue = ((Number) ((EnterEmailPageAssem) viewOnLayoutChangeListenerC346320Dhu.l2).LLJZ.getValue()).intValue() + iLIZIZ;
        }
        int i21 = ((((i17 + i19) + paddingTop) + i20) + iIntValue) - i15;
        if (i21 > 0) {
            C786410Ut5.hd((LinearLayout) viewOnLayoutChangeListenerC346320Dhu.l0, -i21);
            ViewGroup.LayoutParams layoutParams5 = ((LinearLayout) viewOnLayoutChangeListenerC346320Dhu.l1).getLayoutParams();
            if ((layoutParams5 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams5) != null) {
                marginLayoutParams4.bottomMargin = ((Number) ((EnterEmailPageAssem) viewOnLayoutChangeListenerC346320Dhu.l2).LLL.getValue()).intValue();
            }
            ((LinearLayout) viewOnLayoutChangeListenerC346320Dhu.l1).requestLayout();
            return;
        }
        C786410Ut5.hd((LinearLayout) viewOnLayoutChangeListenerC346320Dhu.l0, 0.0f);
        ViewGroup.LayoutParams layoutParams6 = ((LinearLayout) viewOnLayoutChangeListenerC346320Dhu.l1).getLayoutParams();
        if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
            marginLayoutParams3.bottomMargin = ((Number) ((EnterEmailPageAssem) viewOnLayoutChangeListenerC346320Dhu.l2).LLJZIJLIL.getValue()).intValue();
        }
        ((LinearLayout) viewOnLayoutChangeListenerC346320Dhu.l1).requestLayout();
    }
}
