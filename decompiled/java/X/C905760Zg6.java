package X;

import com.ss.android.ugc.aweme.im.streaming.sugar.StreamingViewModel;

/* JADX INFO: renamed from: X.0Zg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streaming.sugar.StreamingViewModel", f = "StreamingViewModel.kt", l = {305}, m = "interruptStream-gIAlu-s")
public final class C905760Zg6 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StreamingViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C905760Zg6(StreamingViewModel streamingViewModel, InterfaceC1364105Vn<? super C905760Zg6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = streamingViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreamingViewModel@690d.interruptStream$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objTq2 = this.LLILLJJLI.Tq2(null, this);
        if (objTq2 == C099R.LJFF()) {
            C1C7U.LIZIZ("StreamingViewModel@690d.interruptStream$1");
            return objTq2;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objTq2);
        C1C7U.LIZIZ("StreamingViewModel@690d.interruptStream$1");
        return c189200o6M1boximpl;
    }
}
