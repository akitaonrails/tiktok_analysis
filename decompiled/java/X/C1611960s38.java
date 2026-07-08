package X;

import com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl;

/* JADX INFO: renamed from: X.0s38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.common.serviceimpl.SeriesServiceImpl", f = "SeriesServiceImpl.kt", l = {225}, m = "loadPanel$suspendImpl")
public final class C1611960s38 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SeriesServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1611960s38(SeriesServiceImpl seriesServiceImpl, InterfaceC1364105Vn<? super C1611960s38> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = seriesServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeriesServiceImpl@1551.loadPanel$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIJ = SeriesServiceImpl.LJIJ(this.LLILLJJLI, 0L, this);
        C1C7U.LIZIZ("SeriesServiceImpl@1551.loadPanel$1");
        return objLJIJ;
    }
}
