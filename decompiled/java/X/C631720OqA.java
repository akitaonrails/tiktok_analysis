package X;

import com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel;

/* JADX INFO: renamed from: X.0OqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel", f = "HighlightSelectListViewModel.kt", l = {73, 76}, m = "sendRequest")
public final class C631720OqA extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ HighlightSelectListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C631720OqA(HighlightSelectListViewModel highlightSelectListViewModel, InterfaceC1364105Vn<? super C631720OqA> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = highlightSelectListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightSelectListViewModel@f6a5.sendRequest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLJJLI.wQ2(this);
        C1C7U.LIZIZ("HighlightSelectListViewModel@f6a5.sendRequest$1");
        return objWQ2;
    }
}
