package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dcC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057100dcC extends C09AY implements Function0<C1057070dc9> {
    public final /* synthetic */ C1057060dc8 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057100dcC(C1057060dc8 c1057060dc8) {
        super(0);
        this.LL = c1057060dc8;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0dc9] */
    @Override // kotlin.jvm.functions.Function0
    public final C1057070dc9 invoke() {
        final C1057060dc8 c1057060dc8 = this.LL;
        return new C1BC3() { // from class: X.0dc9
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1512850pTH c1512850pTH, C1512850pTH c1512850pTH2) {
                EnumC588020N4m enumC588020N4m;
                if (c1512850pTH2.LIZ == EnumC1006810cJ5.Low) {
                    enumC588020N4m = EnumC588020N4m.IDLE;
                } else {
                    enumC588020N4m = EnumC588020N4m.BUSY;
                }
                C1057060dc8 c1057060dc82 = c1057060dc8;
                InterfaceC1057220dcO interfaceC1057220dcO = c1057060dc82.LIZ;
                if (interfaceC1057220dcO != null) {
                    interfaceC1057220dcO.LIZ(c1057060dc82.LIZIZ, enumC588020N4m);
                }
                c1057060dc8.LIZIZ = enumC588020N4m;
            }
        };
    }
}
