package X;

import com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem;

/* JADX INFO: renamed from: X.0NN8, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.banner.protocol.M2BannerAssem", f = "M2BannerAssem.kt", l = {276}, m = "recordClickForExitStrategy")
public final class C0NN8 extends AbstractC23140094w {
    public boolean LL;
    public C1DEV LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ M2BannerAssem LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NN8(M2BannerAssem m2BannerAssem, InterfaceC1364105Vn<? super C0NN8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = m2BannerAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("M2BannerAssem@ec5e.recordClickForExitStrategy$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLo = this.LLILZ.lo(false, this);
        C1C7U.LIZIZ("M2BannerAssem@ec5e.recordClickForExitStrategy$1");
        return objLo;
    }
}
