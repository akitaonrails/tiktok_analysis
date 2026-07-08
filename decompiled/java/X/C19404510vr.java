package X;

import Y.ACListenerS93S0300000_29;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19404510vr extends LinearLayout {
    public final View LL;
    public final LinearLayout LLILLJJLI;
    public final LinearLayout LLILLL;
    public final View LLILZ;
    public List<C19723912Ez> LLILZIL;
    public List<C19723912Ez> LLILZLL;
    public Function1<? super View, Unit> LLIZ;

    public final List<C19723912Ez> getHorizontalSubMenuActionConfigList() {
        return this.LLILZIL;
    }

    public final Function1<View, Unit> getItemClick() {
        return this.LLIZ;
    }

    public final List<C19723912Ez> getVerticalSubMenuActionConfigList() {
        return this.LLILZLL;
    }

    public C19404510vr(Context context) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        super(context, null, 0);
        View viewSd = C786410Ut5.Sd(R.layout.fpy, C786410Ut5.ne(context), this);
        this.LL = viewSd;
        if (viewSd != null) {
            C426750GoL.LJIIL(viewSd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(getPaddingTop()), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(getPaddingBottom()), 16);
            linearLayout = (LinearLayout) viewSd.findViewById(R.id.xb8);
        } else {
            linearLayout = null;
        }
        this.LLILLJJLI = linearLayout;
        if (viewSd != null) {
            linearLayout2 = (LinearLayout) viewSd.findViewById(R.id.xb_);
        } else {
            linearLayout2 = null;
        }
        this.LLILLL = linearLayout2;
        this.LLILZ = viewSd != null ? viewSd.findViewById(R.id.xb9) : null;
    }

    private final void setHorizontalSubMenuActionConfig(List<C19723912Ez> list) {
        if (list != null && !list.isEmpty()) {
            LinearLayout linearLayout = this.LLILLL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            for (C19723912Ez c19723912Ez : list) {
                C19404210vo c19404210vo = new C19404210vo(getContext());
                c19404210vo.setTextRes(c19723912Ez.LIZJ);
                c19404210vo.setTextColorRes(Integer.valueOf(c19723912Ez.LIZLLL));
                c19404210vo.setIcon(c19723912Ez.LJ);
                C786410Ut5.mb(c19404210vo, new ACListenerS93S0300000_29(c19404210vo, this, c19723912Ez, 9));
                LinearLayout linearLayout2 = this.LLILLL;
                if (linearLayout2 != null) {
                    linearLayout2.addView(c19404210vo);
                }
            }
            return;
        }
        LinearLayout linearLayout3 = this.LLILLL;
        if (linearLayout3 != null) {
            C786410Ut5.LJZL(8, linearLayout3);
        }
        View view = this.LLILZ;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    private final void setVerticalSubMenuActionConfig(List<C19723912Ez> list) {
        boolean z;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View view = this.LLILZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        List<C19723912Ez> list2 = this.LLILZIL;
        if (list2 != null && !list2.isEmpty()) {
            View view2 = this.LLILZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
        } else {
            View view3 = this.LLILZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
        }
        for (C19723912Ez c19723912Ez : list) {
            C19404310vp c19404310vp = new C19404310vp(getContext());
            c19404310vp.setTextRes(c19723912Ez.LIZJ);
            c19404310vp.setTextColorRes(Integer.valueOf(c19723912Ez.LIZLLL));
            c19404310vp.setIcon(c19723912Ez.LJ);
            LinearLayout linearLayout = this.LLILLJJLI;
            if (linearLayout != null) {
                linearLayout.addView(c19404310vp);
            }
            Integer num = c19723912Ez.LJFF;
            if (num != null) {
                int iIntValue = num.intValue();
                Integer num2 = c19723912Ez.LJI;
                if (num2 != null) {
                    C1383370m6R.LJIILJJIL(iIntValue, num2.intValue(), c19404310vp);
                }
            }
            C786410Ut5.nb(c19404310vp, new ACListenerS93S0300000_29(c19723912Ez, c19404310vp, this, 10));
        }
    }

    public final void setHorizontalSubMenuActionConfigList(List<C19723912Ez> list) {
        setHorizontalSubMenuActionConfig(list);
        this.LLILZIL = list;
    }

    public final void setItemClick(Function1<? super View, Unit> function1) {
        this.LLIZ = function1;
    }

    public final void setVerticalSubMenuActionConfigList(List<C19723912Ez> list) {
        setVerticalSubMenuActionConfig(list);
        this.LLILZLL = list;
    }
}
