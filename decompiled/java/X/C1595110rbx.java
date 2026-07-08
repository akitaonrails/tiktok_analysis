package X;

import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel", f = "FeedSkylightListViewModel.kt", l = {308}, m = "loadSkylightListData")
public final class C1595110rbx extends AbstractC23140094w {
    public boolean LL;
    public boolean LLILLJJLI;
    public Function0 LLILLL;
    public FeedSkylightListViewModel LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ FeedSkylightListViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1595110rbx(FeedSkylightListViewModel feedSkylightListViewModel, InterfaceC1364105Vn<? super C1595110rbx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = feedSkylightListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedSkylightListViewModel@458.loadSkylightListData$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objMQ2 = this.LLILZLL.MQ2(false, null, null, false, null, this);
        C1C7U.LIZIZ("FeedSkylightListViewModel@458.loadSkylightListData$1");
        return objMQ2;
    }
}
