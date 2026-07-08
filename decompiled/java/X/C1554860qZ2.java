package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qZ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554860qZ2 extends C09AY implements Function0<String> {
    public final /* synthetic */ C1554890qZ5 LL;
    public final /* synthetic */ InterfaceC1555100qZQ<?> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554860qZ2(C1554890qZ5 c1554890qZ5, InterfaceC1555100qZQ<?> interfaceC1555100qZQ) {
        super(0);
        this.LL = c1554890qZ5;
        this.LLILLJJLI = interfaceC1555100qZQ;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("find cache provide,this: ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", provider: ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
