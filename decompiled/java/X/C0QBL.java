package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SuggestWordsViewModel;

/* JADX INFO: renamed from: X.0QBL, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SuggestWordsViewModel", f = "SuggestWordsViewModel.kt", l = {197}, m = "fetchGuessSearchData")
public final class C0QBL extends AbstractC23140094w {
    public C650960Pg6 LL;
    public C667750QHd LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ SuggestWordsViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QBL(SuggestWordsViewModel suggestWordsViewModel, InterfaceC1364105Vn<? super C0QBL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = suggestWordsViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SuggestWordsViewModel@8b07.fetchGuessSearchData$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILZLL.yQ2(null, null, null, null, null, this);
        C1C7U.LIZIZ("SuggestWordsViewModel@8b07.fetchGuessSearchData$1");
        return objYQ2;
    }
}
