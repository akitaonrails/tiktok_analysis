package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880810z2l extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC1883030z6L LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880810z2l(InterfaceC1883030z6L interfaceC1883030z6L, String str) {
        super(0);
        this.LL = interfaceC1883030z6L;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1883060z6O c1883060z6OLJIIJJI;
        InterfaceC1881340z3c interfaceC1881340z3cLIZJ = this.LL.LIZJ();
        if (interfaceC1881340z3cLIZJ != null && (c1883060z6OLJIIJJI = interfaceC1881340z3cLIZJ.LJIIJJI()) != null) {
            c1883060z6OLJIIJJI.LJIILLIIL(this.LLILLJJLI, true);
        }
        return Unit.LIZ;
    }
}
