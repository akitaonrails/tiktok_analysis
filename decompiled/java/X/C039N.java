package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.039N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C039N extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final SmartImageView LLILZ;
    public final TuxTextView LLILZIL;
    public final LinearLayout LLILZLL;
    public final View LLIZ;
    public final TuxIconView LLIZLLLIL;
    public final View LLJ;

    public C039N(View view) {
        super(view);
        view.findViewById(R.id.us_order_submit_order_summary_item_container);
        this.LL = (TuxTextView) view.findViewById(R.id.psr);
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.pso);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.psq);
        this.LLILZ = (SmartImageView) view.findViewById(R.id.pst);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.psp);
        this.LLILZLL = (LinearLayout) view.findViewById(R.id.psz);
        this.LLIZ = view.findViewById(R.id.pt0);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.psm);
        this.LLJ = view.findViewById(R.id.psn);
    }
}
