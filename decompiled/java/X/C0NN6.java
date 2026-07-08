package X;

import com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem;

/* JADX INFO: renamed from: X.0NN6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem", f = "M2BannerAssem.kt", l = {276}, m = "recordShowForExitStrategy")
public final class C0NN6 extends AbstractC23140094w {
    public C1DEV LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ M2BannerAssem LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NN6(M2BannerAssem m2BannerAssem, InterfaceC1364105Vn<? super C0NN6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = m2BannerAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("M2BannerAssem@ec5e.recordShowForExitStrategy$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objMo = this.LLILLL.mo(this);
        C1C7U.LIZIZ("M2BannerAssem@ec5e.recordShowForExitStrategy$1");
        return objMo;
    }
}
