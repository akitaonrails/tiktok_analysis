package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1911820zqm extends RecyclerView.ViewHolder {
    public final View LL;
    public final TextView LLILLJJLI;
    public final ImageView LLILLL;

    public C1911820zqm(View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.dxi);
        this.LL = viewFindViewById;
        this.LLILLJJLI = (TextView) view.findViewById(R.id.zya);
        this.LLILLL = (ImageView) view.findViewById(R.id.jw0);
        viewFindViewById.setForeground(C800330VaR.LIZIZ(viewFindViewById.getContext(), R.drawable.dd5));
    }
}
