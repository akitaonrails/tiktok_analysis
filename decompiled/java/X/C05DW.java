package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;

/* JADX INFO: renamed from: X.05DW, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel", f = "VibeFeedConsumeViewModel.kt", l = {385}, m = "internalFetchSummaryStat")
public final class C05DW extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ VibeFeedConsumeViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05DW(VibeFeedConsumeViewModel vibeFeedConsumeViewModel, InterfaceC1364105Vn<? super C05DW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = vibeFeedConsumeViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VibeFeedConsumeViewModel@bb27.internalFetchSummaryStat$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLJJLI.vQ2(this);
        C1C7U.LIZIZ("VibeFeedConsumeViewModel@bb27.internalFetchSummaryStat$1");
        return objVQ2;
    }
}
