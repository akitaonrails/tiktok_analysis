package X;

import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0rpc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedViewModel", f = "RepostFeedViewModel.kt", l = {682, 686}, m = "retryWithBackoff")
public final class C1603580rpc<T> extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public long LLILLL;
    public Function1 LLILZ;
    public Function2 LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ RepostFeedViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603580rpc(RepostFeedViewModel repostFeedViewModel, InterfaceC1364105Vn<? super C1603580rpc> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = repostFeedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostFeedViewModel@b1b9.retryWithBackoff$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLIZ.BQ2(0, null, null, this);
        C1C7U.LIZIZ("RepostFeedViewModel@b1b9.retryWithBackoff$1");
        return objBQ2;
    }
}
