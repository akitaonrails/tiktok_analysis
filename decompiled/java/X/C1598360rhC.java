package X;

/* JADX INFO: renamed from: X.0rhC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightDataFactory", f = "SkylightDataFactory.kt", l = {164}, m = "triggerPartialRefresh")
public final class C1598360rhC extends AbstractC23140094w {
    public Object LL;
    public C259800zU LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1598340rhA LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598360rhC(C1598340rhA c1598340rhA, InterfaceC1364105Vn<? super C1598360rhC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1598340rhA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightDataFactory@bc3b.triggerPartialRefresh$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILZIL.LJIIL(null, this);
        C1C7U.LIZIZ("SkylightDataFactory@bc3b.triggerPartialRefresh$1");
        return objLJIIL;
    }
}
