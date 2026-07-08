package X;

import com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaNetworkApiServiceImpl;

/* JADX INFO: renamed from: X.0s3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.common.serviceimpl.MiniDramaNetworkApiServiceImpl", f = "MiniDramaNetworkApiServiceImpl.kt", l = {71}, m = "loadPanel")
public final class C1612290s3f extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MiniDramaNetworkApiServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1612290s3f(MiniDramaNetworkApiServiceImpl miniDramaNetworkApiServiceImpl, InterfaceC1364105Vn<? super C1612290s3f> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = miniDramaNetworkApiServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MiniDramaNetworkApiServiceImpl@2a59.loadPanel$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        C1C7U.LIZIZ("MiniDramaNetworkApiServiceImpl@2a59.loadPanel$1");
        return objLIZJ;
    }
}
