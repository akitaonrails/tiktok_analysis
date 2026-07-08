package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS21S0101000_10;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0QJV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0QJV {
    public final ConcurrentLinkedQueue<RecyclerView.ViewHolder> LIZ = new ConcurrentLinkedQueue<>();
    public volatile int LIZIZ;

    public abstract RecyclerView.ViewHolder LIZ();

    public final RecyclerView.ViewHolder LIZIZ() {
        if (!this.LIZ.isEmpty()) {
            return this.LIZ.poll();
        }
        return null;
    }

    public final void LIZJ(int i) {
        if (C0BR9.LIZ()) {
            if (this.LIZIZ >= i) {
                return;
            }
            int i2 = i - this.LIZIZ;
            for (int i3 = 0; i3 < i2; i3++) {
                C823050WQl.LIZLLL().execute(new ARunnableS110S0100000_10(this, 221));
            }
            return;
        }
        if (this.LIZIZ >= i) {
            return;
        }
        ((ExecutorService) C1516330pYt.LIZ.getValue()).execute(new ARunnableS21S0101000_10(i, this, 12));
    }
}
