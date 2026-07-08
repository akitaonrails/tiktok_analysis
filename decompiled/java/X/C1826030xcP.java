package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1826030xcP extends C09AY implements Function0<C1822330xWR> {
    public final /* synthetic */ C1825920xcE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1826030xcP(C1825920xcE c1825920xcE) {
        super(0);
        this.LL = c1825920xcE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.014t, X.0xWR] */
    @Override // kotlin.jvm.functions.Function0
    public final C1822330xWR invoke() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL.LJ;
        if (interfaceC665370Q7z == null || (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C1822330xWR.class, null)) == null) {
            return null;
        }
        return interfaceC1555100qZQLIZIZ.getSource();
    }
}
