package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.strategy.track.ISCPTrackService;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Zmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C909970Zmt implements ISCPTrackService {
    public static final C01GW<C909970Zmt> LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(262));
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(264));
    public final C01GW LIZIZ;
    public final boolean LIZJ;

    public C909970Zmt() {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(263));
        this.LIZIZ = c01gwLIZIZ;
        this.LIZJ = ((Keva) c01gwLIZIZ.getValue()).getBoolean("im_strategy_platform_tracker_service_switch", false);
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.track.ISCPTrackService
    public final boolean LIZIZ() {
        return this.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.track.ISCPTrackService
    public final void LIZ(AbstractC909800Zmc abstractC909800Zmc) {
        if (!this.LIZJ) {
            return;
        }
        Iterator it2 = ((Set) this.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC909980Zmu) it2.next()).LIZ(abstractC909800Zmc);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.strategy.track.ISCPTrackService
    public final void LIZJ(C909960Zms c909960Zms) {
        ((Set) this.LIZ.getValue()).add(c909960Zms);
    }
}
