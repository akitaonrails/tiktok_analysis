package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0n1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418990n1t extends RecyclerView.ViewHolder {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final TuxSpinner LLILLL;
    public final /* synthetic */ C1418970n1r LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418990n1t(C1418970n1r c1418970n1r, View view) {
        super(view);
        this.LLILZ = c1418970n1r;
        this.LL = view;
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.zr5);
        this.LLILLL = (TuxSpinner) view.findViewById(R.id.kt0);
    }
}
