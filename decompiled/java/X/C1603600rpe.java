package X;

import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel;

/* JADX INFO: renamed from: X.0rpe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel", f = "RepostFeedViewModel.kt", l = {128}, m = "whenRefresh")
public final class C1603600rpe extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ RepostFeedViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603600rpe(RepostFeedViewModel repostFeedViewModel, InterfaceC1364105Vn<? super C1603600rpe> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = repostFeedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostFeedViewModel@b1b9.whenRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWhenRefresh = this.LLILLJJLI.whenRefresh(this);
        C1C7U.LIZIZ("RepostFeedViewModel@b1b9.whenRefresh$1");
        return objWhenRefresh;
    }
}
