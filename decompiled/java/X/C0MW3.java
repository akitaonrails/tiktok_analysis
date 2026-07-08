package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0MW3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MW3 extends RecyclerView.ViewHolder {
    public final View LL;
    public final TuxIconView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C1295960jpS LLILZ;

    public C0MW3(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.gun);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.guo);
        this.LLILZ = (C1295960jpS) view.findViewById(R.id.gup);
    }
}
