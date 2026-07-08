package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: X.11D3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C11D3 implements C11D7 {
    public boolean LIZ;
    public View LIZIZ;
    public RecyclerView.ViewHolder LIZJ;

    public final void LJ() {
        RecyclerView.ViewHolder viewHolder = this.LIZJ;
        if (viewHolder != null) {
            viewHolder.setIsRecyclable(false);
        }
        LIZLLL(null);
        this.LIZ = false;
        LIZIZ(getViewType() + 1);
    }

    public int LIZJ() {
        return isEnable() ? 1 : 0;
    }

    public final void LIZLLL(RecyclerView.ViewHolder viewHolder) {
        View view;
        this.LIZJ = viewHolder;
        if (viewHolder != null) {
            view = viewHolder.itemView;
        } else {
            view = null;
        }
        this.LIZIZ = view;
    }
}
