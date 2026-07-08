package X;

import com.ss.android.ugc.aweme.freqcontrol.PromptUnifiedFrequencyController;

/* JADX INFO: renamed from: X.06RD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.freqcontrol.PromptUnifiedFrequencyController", f = "PromptUnifiedFrequencyController.kt", l = {80}, m = "canShow")
public final class C06RD extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PromptUnifiedFrequencyController LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06RD(PromptUnifiedFrequencyController promptUnifiedFrequencyController, InterfaceC1364105Vn<? super C06RD> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = promptUnifiedFrequencyController;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PromptUnifiedFrequencyController@1a31.canShow$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLJJLI.LJII(null, null, null, 0L, this);
        C1C7U.LIZIZ("PromptUnifiedFrequencyController@1a31.canShow$1");
        return objLJII;
    }
}
