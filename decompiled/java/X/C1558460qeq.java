package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qeq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558460qeq extends C09AY implements Function0<C1554890qZ5> {
    public final /* synthetic */ C1558450qep LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1558460qeq(C1558450qep c1558450qep) {
        super(0);
        this.LL = c1558450qep;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1554890qZ5 invoke() {
        C1554890qZ5 c1554890qZ5 = new C1554890qZ5(this.LL);
        this.LL.lazyVScopeTree = c1554890qZ5;
        return c1554890qZ5;
    }
}
