package X;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TK3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TK3 extends RecyclerView.ViewHolder {
    public final TuxTextView LL;

    public C0TK3(ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.bfu, viewGroup, false));
        this.LL = (TuxTextView) this.itemView.findViewById(R.id.tv_title);
    }
}
