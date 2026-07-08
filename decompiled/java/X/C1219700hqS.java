package X;

/* JADX INFO: renamed from: X.0hqS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepository", f = "IMUserRepository.kt", l = {73}, m = "getUserListByUids")
public final class C1219700hqS extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1BGS LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1219700hqS(C1BGS c1bgs, InterfaceC1364105Vn<? super C1219700hqS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1bgs;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserRepository@4cbc.getUserListByUids$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIILIIL = this.LLILLJJLI.LJIILIIL(null, null, this, false, false, false);
        C1C7U.LIZIZ("IMUserRepository@4cbc.getUserListByUids$1");
        return objLJIILIIL;
    }
}
