package X;

import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;

/* JADX INFO: renamed from: X.0h1M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM", f = "PoiPostPageShareVM.kt", l = {226, 230}, m = "onLoadMore")
public final class C1188020h1M extends AbstractC23140094w {
    public C1187510h0X LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PoiPostPageShareVM LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188020h1M(PoiPostPageShareVM poiPostPageShareVM, InterfaceC1364105Vn<? super C1188020h1M> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = poiPostPageShareVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiPostPageShareVM@c034.onLoadMore$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILZ.onLoadMore(null, this);
        C1C7U.LIZIZ("PoiPostPageShareVM@c034.onLoadMore$1");
        return objOnLoadMore;
    }
}
