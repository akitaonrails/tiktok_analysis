package X;

/* JADX INFO: renamed from: X.1BGX, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepo", f = "IMUserRepo.kt", l = {607}, m = "fireUserRequest")
public final class C1BGX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1BGR LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BGX(C1BGR c1bgr, InterfaceC1364105Vn<? super C1BGX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1bgr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserRepo@4319.fireUserRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLJJLI.LJIIJ(null, null, false, this);
        C1C7U.LIZIZ("IMUserRepo@4319.fireUserRequest$1");
        return objLJIIJ;
    }
}
