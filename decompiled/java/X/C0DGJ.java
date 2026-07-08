package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DGJ implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final LinearLayout LLILLJJLI;
    public final LinearLayout LLILLL;
    public final TuxTextView LLILZ;
    public final LinearLayout LLILZIL;
    public final LinearLayout LLILZLL;
    public final TuxTextView LLIZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C0DGJ LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i3y, viewGroup, false);
        int i = R.id.ucp_checkout_order_summary_rows;
        LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_checkout_order_summary_rows, viewTd);
        if (linearLayout != null) {
            i = R.id.ucp_checkout_order_summary_skeleton;
            LinearLayout linearLayout2 = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_checkout_order_summary_skeleton, viewTd);
            if (linearLayout2 != null) {
                i = R.id.ucp_checkout_order_summary_title;
                TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_order_summary_title, viewTd);
                if (tuxTextView != null) {
                    i = R.id.ucp_checkout_order_total_container;
                    LinearLayout linearLayout3 = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_checkout_order_total_container, viewTd);
                    if (linearLayout3 != null) {
                        i = R.id.ucp_checkout_order_total_skeleton;
                        LinearLayout linearLayout4 = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_checkout_order_total_skeleton, viewTd);
                        if (linearLayout4 != null) {
                            i = R.id.ucp_checkout_order_total_value;
                            TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_order_total_value, viewTd);
                            if (tuxTextView2 != null) {
                                return new C0DGJ((LinearLayout) viewTd, linearLayout, linearLayout2, tuxTextView, linearLayout3, linearLayout4, tuxTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public C0DGJ(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TuxTextView tuxTextView, LinearLayout linearLayout4, LinearLayout linearLayout5, TuxTextView tuxTextView2) {
        this.LL = linearLayout;
        this.LLILLJJLI = linearLayout2;
        this.LLILLL = linearLayout3;
        this.LLILZ = tuxTextView;
        this.LLILZIL = linearLayout4;
        this.LLILZLL = linearLayout5;
        this.LLIZ = tuxTextView2;
    }
}
