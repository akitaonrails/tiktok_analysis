package X;

import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;

/* JADX INFO: renamed from: X.0h1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM", f = "PoiPostPageShareVM.kt", l = {331, 367}, m = "tryLoadMoreByTag")
public final class C1188030h1N extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PoiPostPageShareVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188030h1N(PoiPostPageShareVM poiPostPageShareVM, InterfaceC1364105Vn<? super C1188030h1N> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = poiPostPageShareVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiPostPageShareVM@c034.tryLoadMoreByTag$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objMQ2 = this.LLILLL.MQ2(null, null, this);
        C1C7U.LIZIZ("PoiPostPageShareVM@c034.tryLoadMoreByTag$1");
        return objMQ2;
    }
}
