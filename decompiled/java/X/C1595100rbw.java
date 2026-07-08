package X;

import com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel;

/* JADX INFO: renamed from: X.0rbw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.base.vm.FeedSkylightListViewModel", f = "FeedSkylightListViewModel.kt", l = {563}, m = "readAndAppendRemainingChunks")
public final class C1595100rbw extends AbstractC23140094w {
    public InterfaceC1455405mq LL;
    public Object LLILLJJLI;
    public C118300cf LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ FeedSkylightListViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1595100rbw(FeedSkylightListViewModel feedSkylightListViewModel, InterfaceC1364105Vn<? super C1595100rbw> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = feedSkylightListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedSkylightListViewModel@458.readAndAppendRemainingChunks$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objQQ2 = this.LLIZ.QQ2(null, 0, 0, null, this);
        C1C7U.LIZIZ("FeedSkylightListViewModel@458.readAndAppendRemainingChunks$1");
        return objQQ2;
    }
}
