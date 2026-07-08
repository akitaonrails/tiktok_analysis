package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.0MW2, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MW2 extends RecyclerView.ViewHolder {
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;

    public C0MW2(View view) {
        super(view);
        this.LL = (TuxIconView) view.findViewById(R.id.gun);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.guo);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.gum);
        q0.LJIJ(view, new C581300Mr2(this, 1));
    }
}
