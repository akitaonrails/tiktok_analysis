package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18FM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18FM extends C09AY implements Function0<Object> {
    public final /* synthetic */ C18DN LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18FM(C18DN c18dn) {
        super(0);
        this.LL = c18dn;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("unknownInfo = ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
