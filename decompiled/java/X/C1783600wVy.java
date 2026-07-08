package X;

import com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel;

/* JADX INFO: renamed from: X.0wVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel", f = "CreatorRankingPageViewModel.kt", l = {482}, m = "maybeShowMatchRecommendNotificationConfirm")
public final class C1783600wVy extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ CreatorRankingPageViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783600wVy(CreatorRankingPageViewModel creatorRankingPageViewModel, InterfaceC1364105Vn<? super C1783600wVy> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = creatorRankingPageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingPageViewModel@3458.maybeShowMatchRecommendNotificationConfirm$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objMQ2 = this.LLILLL.MQ2(null, this);
        C1C7U.LIZIZ("CreatorRankingPageViewModel@3458.maybeShowMatchRecommendNotificationConfirm$1");
        return objMQ2;
    }
}
