package X;

import Y.ARunnableS5S0401000_33;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.1A2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172981A2m<T> {
    public static final C0JOD LJII = new Executor() { // from class: X.0JOD
        public final Handler LL = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C786410Ut5.LJJZZIII(this.LL, runnable);
        }
    };
    public final InterfaceC1891370zJn LIZ;
    public final C2173011A2p<T> LIZIZ;
    public final Executor LIZJ;
    public final List<InterfaceC2172951A2j<T>> LIZLLL;
    public List<T> LJ;
    public List<T> LJFF;
    public int LJI;

    public C2172981A2m(C2173021A2q c2173021A2q, C2173011A2p c2173011A2p) {
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LJFF = Collections.emptyList();
        this.LIZ = c2173021A2q;
        this.LIZIZ = c2173011A2p;
        this.LIZJ = LJII;
    }

    public final void LIZ(List<T> list, Runnable runnable) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC2172951A2j) it2.next()).LIZ();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void LIZIZ(List<T> list, Runnable runnable) {
        int i = this.LJI + 1;
        this.LJI = i;
        List<T> list2 = this.LJ;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.LJFF;
        if (list == null) {
            int size = list2.size();
            this.LJ = null;
            this.LJFF = Collections.emptyList();
            this.LIZ.LLIZLLLIL(0, size);
            LIZ(list3, runnable);
            return;
        }
        if (list2 == null) {
            this.LJ = list;
            this.LJFF = Collections.unmodifiableList(list);
            this.LIZ.LJZL(0, list.size());
            LIZ(list3, runnable);
            return;
        }
        this.LIZIZ.LIZ.execute(new ARunnableS5S0401000_33(this, list2, list, i, runnable, 0));
    }

    public C2172981A2m(AbstractC21673619ry abstractC21673619ry, AbstractC339510DSr<T> abstractC339510DSr) {
        this(new C2173021A2q(abstractC21673619ry), new C2172991A2n(abstractC339510DSr).LIZ());
    }
}
