package X;

import com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM;

/* JADX INFO: renamed from: X.0h1R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.post.PoiPostPageShareVM", f = "PoiPostPageShareVM.kt", l = {424}, m = "innerLoadMore")
public final class C1188070h1R extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PoiPostPageShareVM LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1188070h1R(PoiPostPageShareVM poiPostPageShareVM, InterfaceC1364105Vn<? super C1188070h1R> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = poiPostPageShareVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiPostPageShareVM@c034.innerLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objEQ2 = this.LLILLJJLI.EQ2(null, null, null, null, this);
        C1C7U.LIZIZ("PoiPostPageShareVM@c034.innerLoadMore$1");
        return objEQ2;
    }
}
