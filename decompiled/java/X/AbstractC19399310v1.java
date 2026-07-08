package X;

import Y.ACListenerS61S0101000_29;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* JADX INFO: renamed from: X.10v1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19399310v1<VH extends RecyclerView.ViewHolder> extends AbstractC21673619ry<VH> {
    public InterfaceC19399510v3 LL;

    @Override // X.AbstractC21673619ry
    public void onBindViewHolder(VH vh, int i) {
        View view = vh.itemView;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS61S0101000_29(this, i, 1), view);
        }
    }
}
