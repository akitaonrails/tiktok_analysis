package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0FOQ, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FOQ extends RecyclerView.ViewHolder {
    public final View LL;
    public final SmartImageView LLILLJJLI;
    public final FrameLayout LLILLL;

    public C0FOQ(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.k1_);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.l1o);
        if (C357780E0y.LIZ()) {
            frameLayout.setBackground(C800330VaR.LIZIZ(frameLayout.getRootView().getContext(), R.drawable.atv));
        }
        this.LLILLL = frameLayout;
    }
}
