package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0DGT, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DGT extends RecyclerView.ViewHolder {
    public final List<View> LL;

    public C0DGT(View view) {
        super(view);
        this.LL = C1697810uHb.LJIIJJI(view.findViewById(R.id.viewSkeletonImage), view.findViewById(R.id.viewSkeletonTitle), view.findViewById(R.id.viewSkeletonMeta), view.findViewById(R.id.viewSkeletonPrice));
    }
}
