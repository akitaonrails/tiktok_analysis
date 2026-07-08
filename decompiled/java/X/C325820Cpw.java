package X;

import com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM;

/* JADX INFO: renamed from: X.0Cpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.detail.ai.PoiAiSummaryListSharedVM", f = "PoiAiSummaryListSharedVM.kt", l = {141}, m = "onLoadMore")
public final class C325820Cpw extends AbstractC23140094w {
    public C013C LL;
    public C259800zU LLILLJJLI;
    public Object LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ PoiAiSummaryListSharedVM LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C325820Cpw(PoiAiSummaryListSharedVM poiAiSummaryListSharedVM, InterfaceC1364105Vn<? super C325820Cpw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = poiAiSummaryListSharedVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiAiSummaryListSharedVM@694f.onLoadMore$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objCQ2 = this.LLILZIL.onLoadMore(null, this);
        C1C7U.LIZIZ("PoiAiSummaryListSharedVM@694f.onLoadMore$1");
        return objCQ2;
    }
}
