package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;

/* JADX INFO: renamed from: X.0D0D, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.RecommendRepository", f = "RecommendRepository.kt", l = {284}, m = "enrichUcpItem")
public final class C0D0D extends AbstractC23140094w {
    public UcpRecommendationItem LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0D0E LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0D0D(C0D0E c0d0e, InterfaceC1364105Vn<? super C0D0D> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0d0e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("RecommendRepository@cb16.enrichUcpItem$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILLL.LJFF(null, this);
        C1C7U.LIZIZ("RecommendRepository@cb16.enrichUcpItem$1");
        return objLJFF;
    }
}
