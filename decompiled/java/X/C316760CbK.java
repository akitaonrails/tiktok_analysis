package X;

import com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService;

/* JADX INFO: renamed from: X.0CbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.util.HorizontalMentionMixSearchService", f = "HorizontalMentionMixSearchService.kt", l = {236}, m = "performLocalSearchWithMetrics")
public final class C316760CbK extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ HorizontalMentionMixSearchService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316760CbK(HorizontalMentionMixSearchService horizontalMentionMixSearchService, InterfaceC1364105Vn<? super C316760CbK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = horizontalMentionMixSearchService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalMentionMixSearchService@7d75.performLocalSearchWithMetrics$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(null, this);
        C1C7U.LIZIZ("HorizontalMentionMixSearchService@7d75.performLocalSearchWithMetrics$1");
        return objLIZ;
    }
}
