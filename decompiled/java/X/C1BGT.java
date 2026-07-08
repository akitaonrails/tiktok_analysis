package X;

/* JADX INFO: renamed from: X.1BGT, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepo", f = "IMUserRepo.kt", l = {184, 201, 221}, m = "getUserListByUids")
public final class C1BGT extends AbstractC23140094w {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public Object LLIZ;
    public Object LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ C1BGR LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BGT(C1BGR c1bgr, InterfaceC1364105Vn<? super C1BGT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = c1bgr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserRepo@4319.getUserListByUids$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLJI.LJIILIIL(null, null, this, false, false, false);
        C1C7U.LIZIZ("IMUserRepo@4319.getUserListByUids$1");
        return objLJIILIIL;
    }
}
