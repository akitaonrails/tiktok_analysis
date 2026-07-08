package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H3A, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H3A extends RecyclerView.ViewHolder {
    public final FrameLayout LL;
    public final SmartImageView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;

    public C0H3A(View view) {
        super(view);
        this.LL = (FrameLayout) view.findViewById(R.id.q_t);
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.q_v);
        this.LLILLL = (TextView) view.findViewById(R.id.q_w);
        this.LLILZ = (TextView) view.findViewById(R.id.q_u);
    }
}
