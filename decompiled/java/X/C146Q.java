package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.146Q, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C146Q extends C09AY implements Function0<Unit> {
    public C146Q() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1BCA.LJJII(new C0CMW() { // from class: X.146O
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1603920rqA c1603920rqA, C1603920rqA c1603920rqA2) {
                C1603920rqA c1603920rqA3 = c1603920rqA2;
                if (!c1603920rqA.LIZ) {
                    if (c1603920rqA3.LIZ) {
                        C146K.LIZ = 0;
                        C146K.LIZIZ = 0L;
                        C146K.LIZ(new C146P());
                        return;
                    }
                    return;
                }
                if (c1603920rqA3.LIZ) {
                    return;
                }
                C146K.LIZ(new C146M());
            }
        });
        return Unit.LIZ;
    }
}
