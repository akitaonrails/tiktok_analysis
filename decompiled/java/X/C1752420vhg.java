package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import t2b.c;

/* JADX INFO: renamed from: X.0vhg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752420vhg extends RecyclerView.ViewHolder {
    public final ECBaseFragment LL;
    public final c LLILLJJLI;
    public final PdpViewModel LLILLL;
    public final String LLILZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1752420vhg(ViewGroup viewGroup, PdpViewModel pdpViewModel, String str, ECBaseFragment eCBaseFragment, c cVar) {
        View view = (View) ((C1753740vjo) pdpViewModel.SR2().LLILLJJLI.getValue()).LIZJ(viewGroup.getContext(), Boolean.TRUE);
        super(view == null ? new C1752430vhh(viewGroup.getContext()) : view);
        this.LL = eCBaseFragment;
        this.LLILLJJLI = cVar;
        this.LLILLL = pdpViewModel;
        this.LLILZ = str;
    }
}
