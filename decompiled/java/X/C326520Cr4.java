package X;

import com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel;

/* JADX INFO: renamed from: X.0Cr4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.repo.TakoAIVideoFeedViewModel", f = "TakoAIVideoFeedViewModel.kt", l = {242}, m = "fetchAwemeList")
public final class C326520Cr4 extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoAIVideoFeedViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326520Cr4(TakoAIVideoFeedViewModel takoAIVideoFeedViewModel, InterfaceC1364105Vn<? super C326520Cr4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = takoAIVideoFeedViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoFeedViewModel@fa8.fetchAwemeList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLL.BQ2(0, this);
        C1C7U.LIZIZ("TakoAIVideoFeedViewModel@fa8.fetchAwemeList$1");
        return objBQ2;
    }
}
