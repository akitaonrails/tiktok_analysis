package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0iC6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1233120iC6 extends RecyclerView.ViewHolder {
    public final TextView LL;
    public final C197039127h LLILLJJLI;
    public final TuxIconView LLILLL;

    public C1233120iC6(View view) {
        super(view);
        this.LL = (TextView) view.findViewById(R.id.tv_response_text);
        this.LLILLJJLI = (C197039127h) view.findViewById(R.id.cmt);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.ltc);
    }
}
