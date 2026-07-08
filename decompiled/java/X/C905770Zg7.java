package X;

import com.ss.android.ugc.aweme.im.streaming.sugar.StreamingViewModel;

/* JADX INFO: renamed from: X.0Zg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.sugar.StreamingViewModel", f = "StreamingViewModel.kt", l = {328}, m = "retryFromScratch")
public final class C905770Zg7 extends AbstractC23140094w {
    public C869590Y9l LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ StreamingViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C905770Zg7(StreamingViewModel streamingViewModel, InterfaceC1364105Vn<? super C905770Zg7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = streamingViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamingViewModel@690d.retryFromScratch$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objX51 = this.LLILZ.x51(null, this);
        C1C7U.LIZIZ("StreamingViewModel@690d.retryFromScratch$1");
        return objX51;
    }
}
