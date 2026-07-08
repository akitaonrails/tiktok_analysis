package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;

/* JADX INFO: renamed from: X.1BGU, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.IMUserRepo", f = "IMUserRepo.kt", l = {526}, m = "decorateBizInfoForUser")
public final class C1BGU extends AbstractC23140094w {
    public IMUser LL;
    public IMUser LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1BGR LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BGU(C1BGR c1bgr, InterfaceC1364105Vn<? super C1BGU> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c1bgr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUserRepo@4319.decorateBizInfoForUser$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILZ.LJIILJJIL(null, this);
        C1C7U.LIZIZ("IMUserRepo@4319.decorateBizInfoForUser$1");
        return objLJIILJJIL;
    }
}
