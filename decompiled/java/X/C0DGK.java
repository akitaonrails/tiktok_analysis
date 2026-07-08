package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0DGK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DGK implements InterfaceC340040DUs {
    public final LinearLayout LL;
    public final TuxTextView LLILLJJLI;
    public final LinearLayout LLILLL;
    public final TuxTextView LLILZ;

    @Override // X.InterfaceC340040DUs
    public final /* bridge */ /* synthetic */ View getRoot() {
        return this.LL;
    }

    public static C0DGK LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.i3w, viewGroup, false);
        int i = R.id.ucp_deals_subtitle;
        TuxTextView tuxTextView = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_deals_subtitle, viewTd);
        if (tuxTextView != null) {
            i = R.id.ucp_deals_tags_container;
            LinearLayout linearLayout = (LinearLayout) C1616006Uk.LIZ(R.id.ucp_deals_tags_container, viewTd);
            if (linearLayout != null) {
                i = R.id.ucp_deals_title;
                TuxTextView tuxTextView2 = (TuxTextView) C1616006Uk.LIZ(R.id.ucp_deals_title, viewTd);
                if (tuxTextView2 != null) {
                    return new C0DGK((LinearLayout) viewTd, tuxTextView, linearLayout, tuxTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewTd.getResources().getResourceName(i)));
    }

    public C0DGK(LinearLayout linearLayout, TuxTextView tuxTextView, LinearLayout linearLayout2, TuxTextView tuxTextView2) {
        this.LL = linearLayout;
        this.LLILLJJLI = tuxTextView;
        this.LLILLL = linearLayout2;
        this.LLILZ = tuxTextView2;
    }
}
