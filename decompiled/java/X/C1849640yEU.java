package X;

import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0yEU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849640yEU extends C09AY implements Function0<Unit> {
    public C1849640yEU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!((C08I9) C1849620yES.LIZ.getValue()).LIZJ.isEmpty()) {
            C01GW c01gw = C1849620yES.LIZLLL;
            if (C0XHX.LIZ[((INetworkStateService) c01gw.getValue()).getNetworkStatus().ordinal()] == 1) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1849590yEP(null), 3);
            } else if (!C1849620yES.LIZIZ) {
                ((INetworkStateService) c01gw.getValue()).observerNetworkChange(new C0CSC() { // from class: X.0yEV
                    @Override // X.C0CSC
                    public final void LIZ(EnumC325100Com enumC325100Com) {
                        if (C0XHX.LIZ[enumC325100Com.ordinal()] == 1) {
                            ((INetworkStateService) C1849620yES.LIZLLL.getValue()).removeNetworkChangeObserver(this);
                            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1849590yEP(null), 3);
                            C1849620yES.LIZIZ = false;
                        }
                    }
                });
                C1849620yES.LIZIZ = true;
            }
        }
        return Unit.LIZ;
    }
}
