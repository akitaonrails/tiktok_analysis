package X;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.039r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7977039r extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final LinearLayout LLILZ;
    public final View LLILZIL;
    public final TuxIconView LLILZLL;
    public final View LLIZ;

    public C7977039r(View view) {
        super(view);
        view.findViewById(R.id.us_order_submit_order_summary_item_container);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.psr);
        tuxTextView.setTuxFont(51);
        this.LL = tuxTextView;
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.pso);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.psq);
        tuxTextView2.setTuxFont(51);
        this.LLILLL = tuxTextView2;
        this.LLILZ = (LinearLayout) view.findViewById(R.id.psz);
        this.LLILZIL = view.findViewById(R.id.pt0);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.psm);
        this.LLIZ = view.findViewById(R.id.psn);
    }
}
