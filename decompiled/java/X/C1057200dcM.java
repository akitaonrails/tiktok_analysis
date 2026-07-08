package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057200dcM extends C09AY implements Function0<C1057180dcK> {
    public final /* synthetic */ C1057080dcA LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057200dcM(C1057080dcA c1057080dcA) {
        super(0);
        this.LL = c1057080dcA;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0dcK] */
    @Override // kotlin.jvm.functions.Function0
    public final C1057180dcK invoke() {
        final C1057080dcA c1057080dcA = this.LL;
        return new C1BC6() { // from class: X.0dcK
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1514210pVT c1514210pVT, C1514210pVT c1514210pVT2) {
                EnumC1057160dcI enumC1057160dcI;
                if (c1514210pVT2.LIZ) {
                    enumC1057160dcI = EnumC1057160dcI.IDLE;
                } else {
                    enumC1057160dcI = EnumC1057160dcI.MAIN_THREAD_BUSY;
                }
                int value = enumC1057160dcI.getValue();
                C1057080dcA c1057080dcA2 = c1057080dcA;
                int value2 = EnumC1057160dcI.MAIN_THREAD_BUSY.getValue();
                int i = c1057080dcA2.LJ;
                c1057080dcA2.LJ(i, ((~value2) & i) + value);
            }
        };
    }
}
