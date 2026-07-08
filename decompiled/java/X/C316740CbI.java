package X;

import com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService;

/* JADX INFO: renamed from: X.0CbI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService", f = "HorizontalMentionMixSearchService.kt", l = {116}, m = "performLocalSearch")
public final class C316740CbI extends AbstractC23140094w {
    public C20612815lG LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ HorizontalMentionMixSearchService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316740CbI(HorizontalMentionMixSearchService horizontalMentionMixSearchService, InterfaceC1364105Vn<? super C316740CbI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = horizontalMentionMixSearchService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalMentionMixSearchService@7d75.performLocalSearch$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(null, null, this);
        C1C7U.LIZIZ("HorizontalMentionMixSearchService@7d75.performLocalSearch$1");
        return objLJIIJ;
    }
}
