package X;

import android.view.View;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0zCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1886850zCV extends RecyclerView.ViewHolder {
    public final C1AHD LL;
    public final int LLILLJJLI;
    public final View LLILLL;
    public final C16F5 LLILZ;
    public final ProgressBar LLILZIL;
    public final C16F5 LLILZLL;
    public final C16F5 LLIZ;

    public C1886850zCV(View view, C1AHD c1ahd, int i) {
        super(view);
        this.LL = c1ahd;
        this.LLILLJJLI = i;
        this.LLILLL = view.findViewById(R.id.xee);
        this.LLILZ = (C16F5) view.findViewById(R.id.xeb);
        this.LLILZIL = (ProgressBar) view.findViewById(R.id.n18);
        this.LLILZLL = (C16F5) view.findViewById(R.id.n19);
        this.LLIZ = (C16F5) view.findViewById(R.id.n1_);
    }
}
