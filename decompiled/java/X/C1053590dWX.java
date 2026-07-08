package X;

import com.ss.android.ugc.aweme.history.AdWebHistoryViewModel;

/* JADX INFO: renamed from: X.0dWX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.history.AdWebHistoryViewModel", f = "AdWebHistoryViewModel.kt", l = {89}, m = "loadFirstPageFromLocal")
public final class C1053590dWX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AdWebHistoryViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1053590dWX(AdWebHistoryViewModel adWebHistoryViewModel, InterfaceC1364105Vn<? super C1053590dWX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = adWebHistoryViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AdWebHistoryViewModel@3f6f.loadFirstPageFromLocal$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILLJJLI.xQ2(this);
        C1C7U.LIZIZ("AdWebHistoryViewModel@3f6f.loadFirstPageFromLocal$1");
        return objXQ2;
    }
}
