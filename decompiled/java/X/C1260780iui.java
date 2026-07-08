package X;

import com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel;

/* JADX INFO: renamed from: X.0iui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.reposttab.RepostListViewModel", f = "RepostListViewModel.kt", l = {547, 550}, m = "sendRequest")
public final class C1260780iui extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RepostListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1260780iui(RepostListViewModel repostListViewModel, InterfaceC1364105Vn<? super C1260780iui> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = repostListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostListViewModel@7b6b.sendRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objIQ2 = this.LLILLJJLI.IQ2(0, 0L, 0, null, this);
        C1C7U.LIZIZ("RepostListViewModel@7b6b.sendRequest$1");
        return objIQ2;
    }
}
