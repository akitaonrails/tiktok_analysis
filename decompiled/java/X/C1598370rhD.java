package X;

/* JADX INFO: renamed from: X.0rhD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightDataFactory", f = "SkylightDataFactory.kt", l = {183}, m = "triggerActiveDataUpdate")
public final class C1598370rhD extends AbstractC23140094w {
    public AbstractC1598350rhB LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1598340rhA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1598370rhD(C1598340rhA c1598340rhA, InterfaceC1364105Vn<? super C1598370rhD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1598340rhA;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkylightDataFactory@bc3b.triggerActiveDataUpdate$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJJI = this.LLILLL.LJIIJJI(this);
        C1C7U.LIZIZ("SkylightDataFactory@bc3b.triggerActiveDataUpdate$1");
        return objLJIIJJI;
    }
}
