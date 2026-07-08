package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0srI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1643060srI extends RecyclerView.ViewHolder {
    public final RecyclerView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;

    public C1643060srI(View view) {
        super(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.pps);
        this.LL = recyclerView;
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.dbn);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.dbk);
        recyclerView.addItemDecoration(new C346270Dhp(1));
    }
}
