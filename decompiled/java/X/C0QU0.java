package X;

import Y.ARunnableS21S0101000_10;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0QU0, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0QU0 {
    public final Queue<RecyclerView.ViewHolder> LIZ = new ConcurrentLinkedQueue();
    public int LIZIZ;

    public abstract RecyclerView.ViewHolder LIZ();

    public final RecyclerView.ViewHolder LIZIZ() {
        if (!this.LIZ.isEmpty()) {
            return (RecyclerView.ViewHolder) ((ConcurrentLinkedQueue) this.LIZ).poll();
        }
        return null;
    }

    public final void LIZJ(int i) {
        if (this.LIZIZ >= i) {
            return;
        }
        C823050WQl.LIZJ().execute(new ARunnableS21S0101000_10(i, this, 6));
    }
}
