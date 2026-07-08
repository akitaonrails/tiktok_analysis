package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0nD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1425880nD0 extends RecyclerView.ViewHolder {
    public final TuxTextView LL;
    public final TuxIconView LLILLJJLI;
    public final View LLILLL;
    public final /* synthetic */ C1425870nCz LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1425880nD0(C1425870nCz c1425870nCz, View view) {
        super(view);
        this.LLILZ = c1425870nCz;
        this.LL = (TuxTextView) view.findViewById(R.id.jpl);
        this.LLILLJJLI = (TuxIconView) view.findViewById(R.id.fkv);
        this.LLILLL = view.findViewById(R.id.jpk);
    }
}
