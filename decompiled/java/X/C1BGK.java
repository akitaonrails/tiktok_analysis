package X;

/* JADX INFO: renamed from: X.1BGK, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager", f = "IMContactManager.kt", l = {745, 751}, m = "enableFetchFullList")
public final class C1BGK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1BG1 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BGK(C1BG1 c1bg1, InterfaceC1364105Vn<? super C1BGK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1bg1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactManager@fb8a.enableFetchFullList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIIIZZ = this.LLILLJJLI.LJIIIIZZ(this);
        C1C7U.LIZIZ("IMContactManager@fb8a.enableFetchFullList$1");
        return objLJIIIIZZ;
    }
}
