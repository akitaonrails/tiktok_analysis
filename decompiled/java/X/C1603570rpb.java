package X;

import com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0rpb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.repostfeed.viewmodel.RepostFeedDetailViewModel", f = "RepostFeedDetailViewModel.kt", l = {701, 705}, m = "retryWithBackoff")
public final class C1603570rpb<T> extends AbstractC23140094w {
    public int LL;
    public int LLILLJJLI;
    public long LLILLL;
    public Function1 LLILZ;
    public Function2 LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ RepostFeedDetailViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1603570rpb(RepostFeedDetailViewModel repostFeedDetailViewModel, InterfaceC1364105Vn<? super C1603570rpb> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = repostFeedDetailViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostFeedDetailViewModel@279b.retryWithBackoff$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objIQ2 = this.LLIZ.IQ2(0, null, null, this);
        C1C7U.LIZIZ("RepostFeedDetailViewModel@279b.retryWithBackoff$1");
        return objIQ2;
    }
}
