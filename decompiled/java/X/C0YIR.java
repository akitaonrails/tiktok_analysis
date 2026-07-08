package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YIR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YIR extends C09AY implements Function0<C871840YIc> {
    public final /* synthetic */ C0YIP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YIR(C0YIP c0yip) {
        super(0);
        this.LL = c0yip;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C871840YIc invoke() {
        C871840YIc c871840YIc = this.LL.LIZ.LJIIIZ().LJJ;
        return c871840YIc == null ? new C871840YIc(0, 0, 0) : c871840YIc;
    }
}
