package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0nD1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425890nD1 extends RecyclerView.ViewHolder {
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final /* synthetic */ C1425870nCz LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1425890nD1(C1425870nCz c1425870nCz, View view) {
        super(view);
        this.LLILZ = c1425870nCz;
        this.LL = view.findViewById(R.id.nhn);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.tv_see_more);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.lbh);
    }
}
