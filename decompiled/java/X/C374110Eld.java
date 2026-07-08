package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Eld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374110Eld extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final FrameLayout LLILLL;
    public final TuxIconView LLILZ;

    public C374110Eld(View view) {
        super(view);
        this.LL = (TuxTextView) view.findViewById(R.id.l36);
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.l2a);
        this.LLILLL = (FrameLayout) view.findViewById(R.id.l2f);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.view_dot);
    }
}
