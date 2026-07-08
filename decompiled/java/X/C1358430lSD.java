package X;

import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;

/* JADX INFO: renamed from: X.0lSD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel", f = "RepostInteractListViewModel.kt", l = {265}, m = "fetchInteractData")
public final class C1358430lSD extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RepostInteractListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358430lSD(RepostInteractListViewModel repostInteractListViewModel, InterfaceC1364105Vn<? super C1358430lSD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = repostInteractListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostInteractListViewModel@3304.fetchInteractData$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLJJLI.yQ2(this);
        C1C7U.LIZIZ("RepostInteractListViewModel@3304.fetchInteractData$1");
        return objYQ2;
    }
}
