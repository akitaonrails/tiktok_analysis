package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS55S1000000_4;

/* JADX INFO: renamed from: X.0D1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C332390D1h implements InterfaceC1329405Ie<InterfaceC1329505If> {
    public final C332370D1f LIZ;
    public final ConcurrentLinkedDeque<Aweme> LIZIZ = new ConcurrentLinkedDeque<>();
    public final ConcurrentHashMap<String, Aweme> LIZJ = new ConcurrentHashMap<>();
    public final AtomicInteger LIZLLL = new AtomicInteger(0);
    public final String LJ = "IMVideoPreloader";
    public final C054G LJFF = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public final String LJI = "video";
    public final C557050Lt1 LJII = new C557050Lt1(false);
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS548S0100000_4(this, 546));

    public final void LJ() {
        Aweme awemePoll;
        InterfaceC1335605Ko interfaceC1335605KoLIZIZ;
        while (this.LIZLLL.get() < LIZJ().LIZ && (!this.LIZIZ.isEmpty()) && (awemePoll = this.LIZIZ.poll()) != null) {
            if (awemePoll.getAid() != null && !this.LIZJ.containsKey(awemePoll.getAid())) {
                this.LIZJ.put(awemePoll.getAid(), awemePoll);
                this.LIZLLL.incrementAndGet();
                if (!this.LJII.LIZIZ()) {
                    C1478160oZK.LIZ().LJJI((InterfaceC1475290oUh) this.LJIIIIZZ.getValue());
                    this.LJII.LIZJ(true);
                }
                try {
                    boolean zIsCache = C1478160oZK.LIZ().isCache(C1483340ohg.LJFF(awemePoll));
                    C908140Zjw.LIZLLL.getValue().LIZIZ(awemePoll, Boolean.valueOf(zIsCache));
                    if (zIsCache) {
                        LIZLLL(awemePoll.getAid());
                    } else {
                        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpi$default(IIMPreloadService.class, false, false, false, 14, null);
                        if (iIMPreloadService != null && (interfaceC1335605KoLIZIZ = iIMPreloadService.LIZIZ()) != null) {
                            interfaceC1335605KoLIZIZ.LIZIZ(awemePoll.getAid(), LIZIZ());
                        }
                        C1483340ohg.LJIL(LIZJ().LIZLLL, awemePoll);
                        C23250099c.LIZLLL(this.LJFF, null, null, new C332380D1g(this, awemePoll, null), 3);
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZLLL(awemePoll.getAid());
                }
            }
        }
    }

    @Override // X.InterfaceC1329405Ie
    public final void reset() {
        this.LIZIZ.clear();
        this.LIZJ.clear();
        this.LIZLLL.set(0);
    }

    @Override // X.InterfaceC1329405Ie
    public final void release() {
        reset();
        if (this.LJII.LIZIZ()) {
            C1478160oZK.LIZ().LJIILIIL((InterfaceC1475290oUh) this.LJIIIIZZ.getValue());
            this.LJII.LIZJ(false);
        }
        C2296808zG.LIZJ(this.LJFF, null);
    }

    @Override // X.InterfaceC1329405Ie
    public String LIZIZ() {
        return this.LJI;
    }

    public C332370D1f LIZJ() {
        return this.LIZ;
    }

    public C332390D1h(C332370D1f c332370D1f) {
        this.LIZ = c332370D1f;
    }

    @Override // X.InterfaceC1329405Ie
    public void LIZ(List<? extends InterfaceC1329505If> list) {
        C23250099c.LIZLLL(this.LJFF, null, null, new C327330CsN(list, this, null), 3);
    }

    public final void LIZLLL(String str) {
        if (this.LIZJ.remove(str) != null) {
            this.LIZLLL.decrementAndGet();
            LJ();
        }
    }

    @Override // X.InterfaceC1329405Ie
    public final void LJJIIJ(String str) {
        C19719612Di.LJJIII(this.LIZIZ, new AwS55S1000000_4(str, 9), true);
        if (this.LIZJ.remove(str) != null) {
            this.LIZLLL.decrementAndGet();
            LJ();
        }
    }
}
