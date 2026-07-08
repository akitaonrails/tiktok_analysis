package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18F4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18F4 extends C09AY implements Function0<Object> {
    public final /* synthetic */ C18HQ LL;
    public final /* synthetic */ C18DN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18F4(C18HQ c18hq, C18DN c18dn) {
        super(0);
        this.LL = c18hq;
        this.LLILLJJLI = c18dn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isHybridContainer = ");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(", unknownInfo = ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
