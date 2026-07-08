package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0n5N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421150n5N extends RecyclerView.ViewHolder {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final View LLILLL;
    public final /* synthetic */ C1421140n5M LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421150n5N(C1421140n5M c1421140n5M, View view) {
        super(view);
        this.LLILZ = c1421140n5M;
        this.LL = view;
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.tv_pov_content);
        this.LLILLL = view.findViewById(R.id.rmu);
    }
}
