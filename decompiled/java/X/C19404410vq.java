package X;

import Y.ACListenerS93S0300000_29;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10vq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19404410vq extends LinearLayout {
    public final View LL;
    public final View LLILLJJLI;
    public final LinearLayout LLILLL;
    public List<C19723912Ez> LLILZ;
    public Function1<? super View, Unit> LLILZIL;

    public final Function1<View, Unit> getItemClick() {
        return this.LLILZIL;
    }

    public final List<C19723912Ez> getVerticalSubMenuActionConfigList() {
        return this.LLILZ;
    }

    public C19404410vq(Context context) {
        View viewFindViewById;
        super(context, null, 0);
        View viewSd = C786410Ut5.Sd(R.layout.fq0, C786410Ut5.ne(context), this);
        this.LL = viewSd;
        if (viewSd != null) {
            C426750GoL.LJIIL(viewSd, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(getPaddingTop()), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6))), Integer.valueOf(getPaddingBottom()), 16);
            viewFindViewById = viewSd.findViewById(R.id.xba);
        } else {
            viewFindViewById = null;
        }
        this.LLILLJJLI = viewFindViewById;
        if (viewFindViewById != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.33d))));
            c384050F3z.LJFF = Integer.valueOf(R.attr.a02);
            viewFindViewById.setBackground(c384050F3z.LIZ(context));
        }
        this.LLILLL = viewSd != null ? (LinearLayout) viewSd.findViewById(R.id.xb8) : null;
    }

    private final void setVerticalSubMenuActionConfig(List<C19723912Ez> list) {
        if (list != null && !list.isEmpty()) {
            for (C19723912Ez c19723912Ez : list) {
                C19404310vp c19404310vp = new C19404310vp(getContext());
                c19404310vp.setTextRes(c19723912Ez.LIZJ);
                c19404310vp.setTextColorRes(Integer.valueOf(c19723912Ez.LIZLLL));
                c19404310vp.setIcon(c19723912Ez.LJ);
                LinearLayout linearLayout = this.LLILLL;
                if (linearLayout != null) {
                    linearLayout.addView(c19404310vp);
                }
                Integer num = c19723912Ez.LJFF;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Integer num2 = c19723912Ez.LJI;
                    if (num2 != null) {
                        int iIntValue2 = num2.intValue();
                        View view = c19404310vp.LLILLJJLI;
                        if (view != null) {
                            C1383370m6R.LJIILJJIL(iIntValue, iIntValue2, view);
                        }
                    }
                }
                C786410Ut5.nb(c19404310vp, new ACListenerS93S0300000_29(c19723912Ez, c19404310vp, this, 6));
            }
        }
    }

    public final void setItemClick(Function1<? super View, Unit> function1) {
        this.LLILZIL = function1;
    }

    public final void setVerticalSubMenuActionConfigList(List<C19723912Ez> list) {
        setVerticalSubMenuActionConfig(list);
        this.LLILZ = list;
    }
}
