package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0aRd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C935230aRd extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final TextView LLILLJJLI;
    public final C1841350y17 LLILLL;

    public C935230aRd(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.tv_select_revenue_share_ratio_title);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.tv_select_revenue_share_ratio_des);
        C1841350y17 c1841350y17 = (C1841350y17) view.findViewById(R.id.tv_select_revenue_share_ratio);
        c1841350y17.setSize(EnumC1841290y11.Medium);
        this.LLILLL = c1841350y17;
    }
}
