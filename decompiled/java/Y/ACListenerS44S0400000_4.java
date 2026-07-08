package Y;

import X.C0DHZ;
import X.C0DOU;
import X.C1389890mGx;
import X.C1390920mIc;
import X.C1619980sG4;
import X.C1671006gW;
import X.C724240Sb0;
import X.C786410Ut5;
import android.animation.TimeInterpolator;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.EditCampusPageAssem;
import com.ss.android.ugc.profile.business.ur.school.modifyschool.GraduationYearPickerSheetFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public class ACListenerS44S0400000_4 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS44S0400000_4 aCListenerS44S0400000_4, View view) {
        FragmentManager childFragmentManager;
        int i;
        if (((C0DHZ) aCListenerS44S0400000_4.l0) == null) {
            C1389890mGx c1389890mGx = new C1389890mGx((C0DOU) aCListenerS44S0400000_4.l1);
            if (((EditCampusPageAssem) aCListenerS44S0400000_4.l2).LLLFF) {
                i = 2131846906;
            } else {
                i = 2131846907;
            }
            c1389890mGx.LJIIIZ(i);
            c1389890mGx.LJIIJJI();
            return;
        }
        EditCampusPageAssem editCampusPageAssem = (EditCampusPageAssem) aCListenerS44S0400000_4.l2;
        Integer num = (Integer) aCListenerS44S0400000_4.l3;
        editCampusPageAssem.getClass();
        Fragment fragmentLJI = C724240Sb0.LJI(editCampusPageAssem);
        if (fragmentLJI == null || (childFragmentManager = fragmentLJI.getChildFragmentManager()) == null) {
            return;
        }
        GraduationYearPickerSheetFragment graduationYearPickerSheetFragment = new GraduationYearPickerSheetFragment(false, false);
        if (num != null) {
            int iIntValue = num.intValue();
            Bundle bundle = new Bundle();
            bundle.putInt("GraduationYearInputChosenYear", iIntValue);
            graduationYearPickerSheetFragment.setArguments(bundle);
        }
        TuxSheet tuxSheet = new C1390920mIc(false, 0).LIZ;
        tuxSheet.LLJJIJI = graduationYearPickerSheetFragment;
        tuxSheet.show(childFragmentManager, "EditSchoolPage_GraduationYearPopup");
    }

    public static final void onClick$1(ACListenerS44S0400000_4 aCListenerS44S0400000_4, View view) {
        int top;
        Object parent;
        int paddingTop;
        ViewGroup.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        View view2;
        ((Function1) aCListenerS44S0400000_4.l0).invoke(Boolean.FALSE);
        C1671006gW c1671006gW = (C1671006gW) aCListenerS44S0400000_4.l1;
        TuxIconView tuxIconView = (TuxIconView) aCListenerS44S0400000_4.l2;
        TuxTextView tuxTextView = (TuxTextView) aCListenerS44S0400000_4.l3;
        Function1 function1 = (Function1) aCListenerS44S0400000_4.l0;
        TuxIconView tuxIconView2 = c1671006gW.LLILZLL;
        if (tuxIconView2 != null) {
            top = tuxIconView2.getTop();
        } else {
            top = 0;
        }
        TuxIconView tuxIconView3 = c1671006gW.LLILZLL;
        if (tuxIconView3 != null) {
            parent = tuxIconView3.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof View) && (view2 = (View) parent) != null) {
            paddingTop = view2.getPaddingTop();
        } else {
            paddingTop = 0;
        }
        int i = top - paddingTop;
        TuxIconView tuxIconView4 = c1671006gW.LLILZLL;
        if (tuxIconView4 != null) {
            layoutParams = tuxIconView4.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof LinearLayout.LayoutParams) && (layoutParams3 = (LinearLayout.LayoutParams) layoutParams) != null) {
            layoutParams3.gravity = 48;
            layoutParams3.topMargin = i;
        }
        ViewGroup.LayoutParams layoutParams4 = tuxIconView.getLayoutParams();
        if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) != null) {
            layoutParams2.gravity = 8388661;
            layoutParams2.topMargin = i;
        }
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(200L);
        autoTransition.setInterpolator((TimeInterpolator) C1619980sG4.LJIILIIL());
        TransitionManager.beginDelayedTransition(c1671006gW, autoTransition);
        if (tuxTextView != null) {
            tuxTextView.setMaxLines(10);
            tuxTextView.setEllipsize(null);
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        TuxIconView tuxIconView5 = c1671006gW.LLJ;
        if (tuxIconView5 != null) {
            tuxIconView5.setIconRes(R.raw.icon_x_mark_small);
            C786410Ut5.LLLLLLZZ(tuxIconView5, 0);
            C786410Ut5.a9(tuxIconView5, new ACListenerS106S0200000_2(function1, c1671006gW, 9));
        }
    }

    public ACListenerS44S0400000_4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj4;
        this.l1 = obj3;
        this.l2 = obj;
        this.l3 = obj2;
    }
}
