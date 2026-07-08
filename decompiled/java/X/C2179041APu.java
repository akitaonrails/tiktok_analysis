package X;

import com.ss.optimizer.live.sdk.dns.DnsOptimizer;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.1APu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2179041APu implements InterfaceC2179091APz<C1968707nR> {
    public final /* synthetic */ C2179031APt LIZ;
    public final /* synthetic */ DnsOptimizer LIZIZ;

    @Override // X.InterfaceC2179091APz
    public final void call(C1968707nR c1968707nR) {
        C1968707nR c1968707nR2 = c1968707nR;
        if (c1968707nR2 == null) {
            c1968707nR2 = new C1968707nR(this.LIZ.LIZ, null);
        }
        C2179031APt c2179031APt = this.LIZ;
        c2179031APt.LJ.lock();
        c2179031APt.LIZLLL = c1968707nR2;
        c2179031APt.LJ.unlock();
        c2179031APt.LIZ();
        DnsOptimizer dnsOptimizer = this.LIZIZ;
        int i = dnsOptimizer.LJIILIIL + 1;
        dnsOptimizer.LJIILIIL = i;
        Set<String> set = dnsOptimizer.LJIIIZ;
        if (set != null && i == ((HashSet) set).size()) {
            this.LIZIZ.LJI(new CallableC2178981APo(), new InterfaceC2179091APz<C2179051APv>() { // from class: X.1APw
                @Override // X.InterfaceC2179091APz
                public final void call(C2179051APv c2179051APv) {
                    this.LIZ.LIZIZ.LJII(c2179051APv);
                    this.LIZ.LIZIZ.LIZJ.removeMessages(1024);
                    DnsOptimizer dnsOptimizer2 = this.LIZ.LIZIZ;
                    C786410Ut5.LJLJJI(1024, dnsOptimizer2.LJIIJ, dnsOptimizer2.LIZJ);
                }
            });
        }
        this.LIZIZ.getClass();
    }

    public C2179041APu(DnsOptimizer dnsOptimizer, C2179031APt c2179031APt) {
        this.LIZIZ = dnsOptimizer;
        this.LIZ = c2179031APt;
    }
}
