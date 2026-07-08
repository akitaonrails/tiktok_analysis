package X;

import com.ss.android.ugc.aweme.minidrama.common.component.topfeed.common.arch.SeriesFeedResp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0r8T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.series.innerfeed.recommend.InnerFeedRecommendManagerImpl$loadData$result$1", f = "InnerFeedRecommendManagerImpl.kt", l = {}, m = "invokeSuspend")
public final class C1576830r8T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SeriesFeedResp>, Object> {
    public final /* synthetic */ C1576820r8S<T> LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1576830r8T(C1576820r8S<T> c1576820r8S, String str, InterfaceC1364105Vn<? super C1576830r8T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1576820r8S;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1576830r8T(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InnerFeedRecommendManagerImpl@c31a.loadData$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1576820r8S<T> c1576820r8S = this.LL;
        SeriesFeedResp seriesFeedRespLIZ = c1576820r8S.LIZIZ.LIZ(c1576820r8S.LIZ, c1576820r8S.LIZJ, this.LLILLJJLI);
        if (seriesFeedRespLIZ != null) {
            C1C7U.LIZIZ("InnerFeedRecommendManagerImpl@c31a.loadData$result$1");
            return seriesFeedRespLIZ;
        }
        throw new IllegalStateException("result is null");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SeriesFeedResp> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
