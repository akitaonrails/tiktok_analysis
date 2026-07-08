package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AFN, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AFN extends C09AY implements Function0<String> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AFN(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        C1AXM c1axm = this.LL;
        return c1axm.LL.LJIIIIZZ ? "anchor" : c1axm.LJL() ? "guest" : "audience";
    }
}
