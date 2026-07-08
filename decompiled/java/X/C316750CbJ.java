package X;

import com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService;

/* JADX INFO: renamed from: X.0CbJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService", f = "HorizontalMentionMixSearchService.kt", l = {247}, m = "performRelationSearch")
public final class C316750CbJ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ HorizontalMentionMixSearchService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316750CbJ(HorizontalMentionMixSearchService horizontalMentionMixSearchService, InterfaceC1364105Vn<? super C316750CbJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = horizontalMentionMixSearchService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("HorizontalMentionMixSearchService@7d75.performRelationSearch$3");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(0L, null, this);
        C1C7U.LIZIZ("HorizontalMentionMixSearchService@7d75.performRelationSearch$3");
        return objLIZJ;
    }
}
