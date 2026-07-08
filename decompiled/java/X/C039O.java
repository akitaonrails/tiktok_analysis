package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.039O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039O extends RecyclerView.ViewHolder {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxTextView LLILZ;
    public final SmartImageView LLILZIL;
    public final TuxTextView LLILZLL;
    public final LinearLayout LLIZ;
    public final View LLIZLLLIL;
    public final TuxIconView LLJ;
    public final View LLJI;

    public C039O(View view) {
        super(view);
        this.LL = view;
        view.findViewById(R.id.us_order_submit_order_summary_item_container);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.psr);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.pso);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.psq);
        this.LLILZIL = (SmartImageView) view.findViewById(R.id.pst);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.psp);
        this.LLIZ = (LinearLayout) view.findViewById(R.id.psz);
        this.LLIZLLLIL = view.findViewById(R.id.pt0);
        this.LLJ = (TuxIconView) view.findViewById(R.id.psm);
        this.LLJI = view.findViewById(R.id.psn);
    }
}
