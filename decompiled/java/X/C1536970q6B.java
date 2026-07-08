package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q6B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1536970q6B extends C09AY implements Function1<C1532310pyf, Unit> {
    public final /* synthetic */ C1536950q69 LL;
    public final /* synthetic */ InterfaceC1303630k1p LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1536970q6B(C1536950q69 c1536950q69, InterfaceC1303630k1p interfaceC1303630k1p) {
        super(1);
        this.LL = c1536950q69;
        this.LLILLJJLI = interfaceC1303630k1p;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1532310pyf c1532310pyf) {
        C1532310pyf c1532310pyf2 = c1532310pyf;
        byte[] bArrLJIIJ = c1532310pyf2.LJIIJ();
        if (bArrLJIIJ != null) {
            C1536950q69 c1536950q69 = this.LL;
            InterfaceC1303630k1p interfaceC1303630k1p = this.LLILLJJLI;
            c1536950q69.getClass();
            if (interfaceC1303630k1p != null) {
                C086F c086f = C086F.LIZ;
                RunnableC1303620k1o runnableC1303620k1o = new RunnableC1303620k1o(interfaceC1303630k1p, bArrLJIIJ);
                c086f.getClass();
                C086F.LJII(runnableC1303620k1o);
            }
        } else {
            C1536950q69 c1536950q692 = this.LL;
            InterfaceC1303630k1p interfaceC1303630k1p2 = this.LLILLJJLI;
            String strLIZJ = c1532310pyf2.LIZJ.LIZJ();
            c1536950q692.getClass();
            if (interfaceC1303630k1p2 != null) {
                C086F c086f2 = C086F.LIZ;
                RunnableC1303640k1q runnableC1303640k1q = new RunnableC1303640k1q(interfaceC1303630k1p2, strLIZJ);
                c086f2.getClass();
                C086F.LJII(runnableC1303640k1q);
            }
        }
        return Unit.LIZ;
    }
}
