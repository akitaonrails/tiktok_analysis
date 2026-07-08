package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dcN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057210dcN extends C09AY implements Function0<C1057190dcL> {
    public final /* synthetic */ C1057080dcA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057210dcN(C1057080dcA c1057080dcA) {
        super(0);
        this.LL = c1057080dcA;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0dcL] */
    @Override // kotlin.jvm.functions.Function0
    public final C1057190dcL invoke() {
        final C1057080dcA c1057080dcA = this.LL;
        return new C0CMW() { // from class: X.0dcL
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1603920rqA c1603920rqA, C1603920rqA c1603920rqA2) {
                EnumC1057160dcI enumC1057160dcI;
                if (c1603920rqA2.LIZ) {
                    enumC1057160dcI = EnumC1057160dcI.SCROLLING;
                } else {
                    enumC1057160dcI = EnumC1057160dcI.IDLE;
                }
                int value = enumC1057160dcI.getValue();
                C1057080dcA c1057080dcA2 = c1057080dcA;
                int value2 = EnumC1057160dcI.SCROLLING.getValue();
                int i = c1057080dcA2.LJ;
                c1057080dcA2.LJ(i, ((~value2) & i) + value);
            }
        };
    }
}
