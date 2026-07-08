package X;

/* JADX INFO: renamed from: X.0rhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightDataFactory", f = "SkylightDataFactory.kt", l = {131}, m = "triggerRefresh")
public final class C1598400rhG extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1598340rhA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598400rhG(C1598340rhA c1598340rhA, InterfaceC1364105Vn<? super C1598400rhG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1598340rhA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightDataFactory@bc3b.triggerRefresh$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILLL.LJIILIIL(this);
        C1C7U.LIZIZ("SkylightDataFactory@bc3b.triggerRefresh$1");
        return objLJIILIIL;
    }
}
