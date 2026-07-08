package X;

/* JADX INFO: renamed from: X.1BGW, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepo", f = "IMUserRepo.kt", l = {258, 261}, m = "fetchMissedUserListSync")
public final class C1BGW extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1BGR LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BGW(C1BGR c1bgr, InterfaceC1364105Vn<? super C1BGW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1bgr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserRepo@4319.fetchMissedUserListSync$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILL = this.LLILLL.LJIILL(null, null, this);
        C1C7U.LIZIZ("IMUserRepo@4319.fetchMissedUserListSync$1");
        return objLJIILL;
    }
}
