package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentBreakdown;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.zhiliaoapp.musically.R;
import g1c.AjS60S0100000_1;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03ZT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03ZT {
    public static void LIZ(C03ZU c03zu) {
        if (C03ZS.LIZ[c03zu.getDisplayMode().ordinal()] == 1) {
            GridLayout gridInstallmentPlanContainer = c03zu.getGridInstallmentPlanContainer();
            gridInstallmentPlanContainer.setColumnCount(2);
            C12ES.LJIILL(0, gridInstallmentPlanContainer);
            C786410Ut5.LJJJJJ(gridInstallmentPlanContainer);
            return;
        }
        LinearLayout linearInstallmentPlanContainer = c03zu.getLinearInstallmentPlanContainer();
        C12ES.LJIILL(0, linearInstallmentPlanContainer);
        C786410Ut5.LJJJJJL(linearInstallmentPlanContainer);
    }

    public static InstallmentPlan LIZJ(C03ZU c03zu, List<InstallmentPlan> list) {
        InstallmentPlan next;
        InstallmentPlan installmentPlan = null;
        if (C03ZS.LIZ[c03zu.getDisplayMode().ordinal()] == 1) {
            if (list != null) {
                Iterator<InstallmentPlan> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(next.isDefault, Boolean.TRUE)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InstallmentPlan installmentPlan2 = next;
                installmentPlan = (InstallmentPlan) C13LP.LJJJLL(list);
                if (installmentPlan2 != null) {
                    return installmentPlan2;
                }
            }
        } else if (list != null) {
            return (InstallmentPlan) C13LP.LJJJLL(list);
        }
        return installmentPlan;
    }

    public static void LIZIZ(C03ZU c03zu, C03ZF c03zf, int i) {
        if (C03ZS.LIZ[c03zu.getDisplayMode().ordinal()] == 1) {
            GridLayout gridInstallmentPlanContainer = c03zu.getGridInstallmentPlanContainer();
            GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
            layoutParams.width = 0;
            layoutParams.columnSpec = GridLayout.spec(Integer.MIN_VALUE, 1.0f);
            layoutParams.rowSpec = GridLayout.spec(Integer.MIN_VALUE, -2.0f);
            C786410Ut5.r7(c03zf, layoutParams);
            c03zu.LIZIZ(c03zf, i);
            ConstraintLayout constraintLayout = (ConstraintLayout) c03zf.findViewById(R.id.kt_);
            ViewGroup.LayoutParams layoutParams2 = constraintLayout.getLayoutParams();
            C19ME c19me = null;
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
            } else {
                layoutParams2 = null;
            }
            C786410Ut5.m6(constraintLayout, layoutParams2);
            LinearLayout linearLayout = (LinearLayout) c03zf.findViewById(R.id.euc);
            ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            if ((layoutParams3 instanceof C19ME) && (c19me = (C19ME) layoutParams3) != null) {
                c19me.verticalBias = 0.0f;
            }
            C786410Ut5.d6(linearLayout, c19me);
            TextView textView = (TextView) c03zf.findViewById(R.id.z5d);
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            TextView textView2 = (TextView) c03zf.findViewById(R.id.z3w);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            gridInstallmentPlanContainer.addView(c03zf);
            return;
        }
        c03zu.LIZIZ(c03zf, i);
        c03zu.getLinearInstallmentPlanContainer().addView(c03zf);
    }

    public static void LIZLLL(C03ZU c03zu, InstallmentInfo installmentInfo, Function0<Unit> function0) {
        List<InstallmentPlan> list;
        InstallmentPlan installmentPlan;
        InstallmentBreakdown installmentBreakdown;
        String str;
        if (C03ZS.LIZ[c03zu.getDisplayMode().ordinal()] == 1) {
            if (installmentInfo != null && (list = installmentInfo.installmentPlans) != null && (installmentPlan = (InstallmentPlan) C13LP.LJJJLL(list)) != null && (installmentBreakdown = installmentPlan.breakdown) != null && (str = installmentBreakdown.linkName) != null && str.length() > 0) {
                LinearLayout breakdownContainer = c03zu.getBreakdownContainer();
                C12ES.LJIILL(0, breakdownContainer);
                ((TextView) breakdownContainer.findViewById(R.id.z2o)).setText(str);
                C786410Ut5.I7(new AjS60S0100000_1((Function0) function0, 1), breakdownContainer);
                return;
            }
            C0H1U.LIZIZ(c03zu.getBreakdownContainer());
            return;
        }
        C0H1U.LIZIZ(c03zu.getBreakdownContainer());
    }
}
