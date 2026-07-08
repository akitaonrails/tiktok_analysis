package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DGM, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DGM implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C0DGM LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i3z, viewGroup, false);
        int i = R.id.ucp_checkout_summary_row_amount;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_summary_row_amount, viewTd);
        if (tuxTextView != null) {
            i = R.id.ucp_checkout_summary_row_title;
            TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_checkout_summary_row_title, viewTd);
            if (tuxTextView2 != null) {
                return new C0DGM((LinearLayout) viewTd, tuxTextView, tuxTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public C0DGM(LinearLayout linearLayout, TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        this.LL = linearLayout;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = tuxTextView2;
    }
}
