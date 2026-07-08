package X;

import com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService;

/* JADX INFO: renamed from: X.0CbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService", f = "HorizontalMentionMixSearchService.kt", l = {257}, m = "performSugSearch")
public final class C316770CbL extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ HorizontalMentionMixSearchService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316770CbL(HorizontalMentionMixSearchService horizontalMentionMixSearchService, InterfaceC1364105Vn<? super C316770CbL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = horizontalMentionMixSearchService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalMentionMixSearchService@7d75.performSugSearch$3");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(0L, null, null, null, this);
        C1C7U.LIZIZ("HorizontalMentionMixSearchService@7d75.performSugSearch$3");
        return objLIZLLL;
    }
}
