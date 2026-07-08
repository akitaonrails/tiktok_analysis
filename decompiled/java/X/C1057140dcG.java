package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dcG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057140dcG extends C09AY implements Function0<C1057150dcH> {
    public final /* synthetic */ C1057080dcA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057140dcG(C1057080dcA c1057080dcA) {
        super(0);
        this.LL = c1057080dcA;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0dcH] */
    @Override // kotlin.jvm.functions.Function0
    public final C1057150dcH invoke() {
        final C1057080dcA c1057080dcA = this.LL;
        return new InterfaceC1702110uOX() { // from class: X.0dcH
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1512840pTG c1512840pTG, C1512840pTG c1512840pTG2) {
                EnumC1057160dcI enumC1057160dcI;
                if (c1512840pTG2.LIZ == EnumC1006810cJ5.Low) {
                    enumC1057160dcI = EnumC1057160dcI.IDLE;
                } else {
                    enumC1057160dcI = EnumC1057160dcI.CPU_BUSY;
                }
                int value = enumC1057160dcI.getValue();
                C1057080dcA c1057080dcA2 = c1057080dcA;
                int value2 = EnumC1057160dcI.CPU_BUSY.getValue();
                int i = c1057080dcA2.LJ;
                c1057080dcA2.LJ(i, ((~value2) & i) + value);
            }
        };
    }
}
