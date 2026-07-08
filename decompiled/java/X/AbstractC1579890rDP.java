package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.0rDP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1579890rDP<ITEM> extends RecyclerView.ViewHolder {
    public abstract void I5(int i, Object obj);

    public abstract void onViewCreated(View view);

    public AbstractC1579890rDP(int i, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), i, viewGroup, false));
        onViewCreated(this.itemView);
    }
}
