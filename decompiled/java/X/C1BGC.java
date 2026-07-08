package X;

/* JADX INFO: renamed from: X.1BGC, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager", f = "IMContactManager.kt", l = {650, 651, 652}, m = "deleteIMContact")
public final class C1BGC extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1BG1 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BGC(C1BG1 c1bg1, InterfaceC1364105Vn<? super C1BGC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1bg1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMContactManager@fb8a.deleteIMContact$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, this);
        C1C7U.LIZIZ("IMContactManager@fb8a.deleteIMContact$1");
        return objLIZLLL;
    }
}
