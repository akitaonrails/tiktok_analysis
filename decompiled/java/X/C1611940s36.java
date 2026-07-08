package X;

import com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl;

/* JADX INFO: renamed from: X.0s36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl", f = "SeriesServiceImpl.kt", l = {196}, m = "loadVideoListOpt$suspendImpl")
public final class C1611940s36 extends AbstractC23140094w {
    public SeriesServiceImpl LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SeriesServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611940s36(SeriesServiceImpl seriesServiceImpl, InterfaceC1364105Vn<? super C1611940s36> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = seriesServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesServiceImpl@1551.loadVideoListOpt$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIJJ = SeriesServiceImpl.LJIJJ(this.LLILLL, null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("SeriesServiceImpl@1551.loadVideoListOpt$1");
        return objLJIJJ;
    }
}
