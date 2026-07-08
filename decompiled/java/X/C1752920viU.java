package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import com.zhiliaoapp.musically.R;
import t2b.c;

/* JADX INFO: renamed from: X.0viU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1752920viU extends RecyclerView.ViewHolder {
    public final ECBaseFragment LL;
    public final c LLILLJJLI;
    public final PdpViewModel LLILLL;
    public final String LLILZ;
    public final SmartImageView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxIconView LLIZLLLIL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1752920viU(ViewGroup viewGroup, PdpViewModel pdpViewModel, String str, ECBaseFragment eCBaseFragment, c cVar) {
        View view = (View) ((C1753740vjo) pdpViewModel.SR2().LLILLL.getValue()).LIZJ(viewGroup.getContext(), Boolean.TRUE);
        super(view == null ? new C1752430vhh(viewGroup.getContext()) : view);
        this.LL = eCBaseFragment;
        this.LLILLJJLI = cVar;
        this.LLILLL = pdpViewModel;
        this.LLILZ = str;
        this.LLILZIL = (SmartImageView) this.itemView.findViewById(R.id.rxz);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.rz2);
        this.LLIZ = (TuxTextView) this.itemView.findViewById(R.id.rzc);
        this.LLIZLLLIL = (TuxIconView) this.itemView.findViewById(R.id.af6);
    }
}
