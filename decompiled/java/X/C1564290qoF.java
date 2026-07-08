package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.powerlist.PowerAdapter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0qoF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564290qoF {
    public final RecyclerView LIZ;
    public final C11PQ<C20603715jn> LIZIZ;
    public final LifecycleOwner LIZJ;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> LIZLLL;
    public C1563030qmD LJ;
    public C344380Dem LJFF;
    public C11JF LJI;
    public final C01GW LJII;

    public C1564290qoF() {
        throw null;
    }

    public C1564290qoF(RecyclerView recyclerView, C11PQ c11pq, PowerAdapter powerAdapter) {
        ConcurrentHashMap<Integer, CopyOnWriteArrayList<RecyclerView.ViewHolder>> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZ = recyclerView;
        this.LIZIZ = c11pq;
        this.LIZJ = powerAdapter;
        this.LIZLLL = concurrentHashMap;
        this.LJII = C452501pT.LIZIZ(new C587630N2z());
    }
}
