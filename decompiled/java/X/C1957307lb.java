package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.07lb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1957307lb implements Iterable<InterfaceC798590VUj>, C03W4 {
    public final List<InterfaceC798590VUj> LL;
    public final List<InterfaceC798590VUj> LLILLJJLI = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC798590VUj> iterator() {
        List listLJIIJJI;
        synchronized (this) {
            try {
                listLJIIJJI = C1697810uHb.LJIIJJI(this.LL, this.LLILLJJLI);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return ((ArrayList) C15438062q.LJIJJLI(listLJIIJJI)).iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1957307lb(List<? extends InterfaceC798590VUj> list) {
        this.LL = list;
    }
}
