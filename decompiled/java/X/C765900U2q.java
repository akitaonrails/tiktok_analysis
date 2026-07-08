package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: X.0U2q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C765900U2q<T> {
    public static final ExecutorC587480N2k LJII = new Executor() { // from class: X.0N2k
        public final BPEAHandler LL = new BPEAHandler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C786410Ut5.LJJZZIII(this.LL, runnable);
        }
    };
    public final InterfaceC1891370zJn LIZ;
    public final C765890U2p<T> LIZIZ;
    public final Executor LIZJ;
    public final List<InterfaceC765950U2v<T>> LIZLLL;
    public List<T> LJ;
    public List<T> LJFF;
    public int LJI;

    public C765900U2q(AbstractC21673619ry abstractC21673619ry, AbstractC765930U2t<T> abstractC765930U2t) {
        C2173021A2q c2173021A2q = new C2173021A2q(abstractC21673619ry);
        C765920U2s c765920U2s = new C765920U2s(abstractC765930U2t);
        if (c765920U2s.LIZ == null) {
            synchronized (C765920U2s.LIZIZ) {
                try {
                    if (C765920U2s.LIZJ == null) {
                        C765920U2s.LIZJ = C786410Ut5.d4(2);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c765920U2s.LIZ = C765920U2s.LIZJ;
        }
        C765890U2p<T> c765890U2p = new C765890U2p<>(c765920U2s.LIZ, abstractC765930U2t);
        this.LIZLLL = new CopyOnWriteArrayList();
        this.LJFF = Collections.emptyList();
        this.LIZ = c2173021A2q;
        this.LIZIZ = c765890U2p;
        this.LIZJ = LJII;
    }

    public final void LIZ(List<T> list, Runnable runnable) {
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZLLL).iterator();
        while (it2.hasNext()) {
            ((InterfaceC765950U2v) it2.next()).LIZ();
        }
        if (runnable != null) {
            runnable.run();
        }
    }
}
