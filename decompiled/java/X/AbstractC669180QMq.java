package X;

import Y.ARunnableS21S0101000_10;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: renamed from: X.0QMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC669180QMq {
    public final Queue<RecyclerView.ViewHolder> LIZ = new LinkedList();
    public int LIZIZ;

    public abstract RecyclerView.ViewHolder LIZ();

    public final RecyclerView.ViewHolder LIZIZ() {
        if (!this.LIZ.isEmpty()) {
            return (RecyclerView.ViewHolder) ((LinkedList) this.LIZ).poll();
        }
        return null;
    }

    public final void LIZJ(int i) {
        if (this.LIZIZ >= i) {
            return;
        }
        C823050WQl.LIZJ().execute(new ARunnableS21S0101000_10(i, this, 0));
    }
}
