package X;

import Y.ARunnableS21S0101000_10;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0PFI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0PFI {
    public final Queue<RecyclerView.ViewHolder> LIZ;
    public int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public abstract RecyclerView.ViewHolder LIZ();

    public final RecyclerView.ViewHolder LIZIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ.poll();
        }
        return null;
    }

    public C0PFI() {
        this.LIZ = new ConcurrentLinkedQueue();
        this.LIZIZ = 0;
        this.LIZJ = 2;
        this.LIZLLL = false;
    }

    public C0PFI(int i) {
        this.LIZ = new ConcurrentLinkedQueue();
        this.LIZIZ = 0;
        this.LIZJ = 2;
        this.LIZLLL = false;
        this.LIZJ = i;
    }

    public final void LIZJ(int i) {
        C823050WQl.LIZJ().execute(new ARunnableS21S0101000_10(i, this, 1));
    }

    public C0PFI(int i, boolean z) {
        this(i);
        this.LIZLLL = z;
    }
}
