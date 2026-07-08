package X;

import com.ss.android.ugc.aweme.base.vm.MentionListViewModel;

/* JADX INFO: renamed from: X.0Caq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.MentionListViewModel", f = "MentionListViewModel.kt", l = {295}, m = "queryDataForRecommendList")
public final class C316460Caq extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MentionListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316460Caq(MentionListViewModel mentionListViewModel, InterfaceC1364105Vn<? super C316460Caq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = mentionListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MentionListViewModel@ff55.queryDataForRecommendList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objDQ2 = this.LLILLJJLI.DQ2(this, false);
        C1C7U.LIZIZ("MentionListViewModel@ff55.queryDataForRecommendList$1");
        return objDQ2;
    }
}
