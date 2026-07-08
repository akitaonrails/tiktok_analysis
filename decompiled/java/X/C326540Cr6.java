package X;

import com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel;

/* JADX INFO: renamed from: X.0Cr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel", f = "TakoAIVideoFeedViewModel.kt", l = {270, 271}, m = "loadVideo")
public final class C326540Cr6 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoAIVideoFeedViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326540Cr6(TakoAIVideoFeedViewModel takoAIVideoFeedViewModel, InterfaceC1364105Vn<? super C326540Cr6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = takoAIVideoFeedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoFeedViewModel@fa8.loadVideo$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objEQ2 = this.LLILLJJLI.EQ2(false, this);
        C1C7U.LIZIZ("TakoAIVideoFeedViewModel@fa8.loadVideo$1");
        return objEQ2;
    }
}
