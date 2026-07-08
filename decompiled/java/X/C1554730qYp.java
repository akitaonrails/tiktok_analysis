package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1554730qYp extends C09AY implements Function0<C1554890qZ5> {
    public final /* synthetic */ C1555410qZv LL;
    public final /* synthetic */ C19EG LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1554730qYp(C19EG c19eg, C1555410qZv c1555410qZv) {
        super(0);
        this.LL = c1555410qZv;
        this.LLILLJJLI = c19eg;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1554890qZ5 invoke() {
        C1554890qZ5 c1554890qZ5 = new C1554890qZ5(this.LL);
        C1557550qdN.LIZ("vprovider_vscope", new C1554690qYl(this.LLILLJJLI, c1554890qZ5, this.LL));
        return c1554890qZ5;
    }
}
