package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18FJ, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FJ extends C09AY implements Function0<Object> {
    public final /* synthetic */ C18DN LL;
    public final /* synthetic */ C21247918Dd LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FJ(C18DN c18dn, C21247918Dd c21247918Dd) {
        super(0);
        this.LL = c18dn;
        this.LLILLJJLI = c21247918Dd;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknownInfo = ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pausedInfo = ");
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
