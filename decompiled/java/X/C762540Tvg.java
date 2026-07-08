package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Tvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C762540Tvg extends RecyclerView.ViewHolder {
    public final boolean LL;
    public final TuxSpinner LLILLJJLI;

    public final void I5(boolean z) {
        if (z) {
            C500260Jjc.LLFFF(this.itemView);
            C500260Jjc.LJJZ((int) C497740JfY.LIZIZ(48.0f), this.itemView);
            C500260Jjc.LLFFF(this.LLILLJJLI);
            return;
        }
        C500260Jjc.LJIILIIL(this.itemView);
        C500260Jjc.LJJZ(0, this.itemView);
        C500260Jjc.LJIILLIIL(this.LLILLJJLI);
    }

    public C762540Tvg(View view, boolean z) {
        super(view);
        this.LL = z;
        this.LLILLJJLI = (TuxSpinner) view.findViewById(R.id.nnp);
    }
}
