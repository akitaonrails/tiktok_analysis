package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03Ed, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C809303Ed extends RecyclerView.ViewHolder {
    public final RecyclerView LL;
    public final TuxTextView LLILLJJLI;
    public final View LLILLL;
    public final ConstraintLayout LLILZ;

    public C809303Ed(View view) {
        super(view);
        this.LL = (RecyclerView) view.findViewById(R.id.us_order_submit_user_trust_container);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.us_order_submit_user_trust_title);
        this.LLILLL = view.findViewById(R.id.us_order_submit_user_trust_split_line);
        this.LLILZ = (ConstraintLayout) view.findViewById(R.id.us_order_submit_user_trust_layout);
    }
}
