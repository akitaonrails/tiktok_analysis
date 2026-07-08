package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JYH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JYH extends C09AY implements Function1<C0JYI, C0JYI> {
    public final /* synthetic */ C493830JYf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JYH(C493830JYf c493830JYf) {
        super(1);
        this.LL = c493830JYf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JYI invoke(C0JYI c0jyi) {
        return new C0JYI(c0jyi.LL, this.LL);
    }
}
