package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.HighlightListViewModel;

/* JADX INFO: renamed from: X.0xrr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylistv2.tabs.highlight.vm.HighlightListViewModel", f = "HighlightListVM.kt", l = {60}, m = "fetchPage")
public final class C1835610xrr extends AbstractC23140094w {
    public long LL;
    public int LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ HighlightListViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1835610xrr(HighlightListViewModel highlightListViewModel, InterfaceC1364105Vn<? super C1835610xrr> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = highlightListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightListViewModel@a851.fetchPage$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZIL.vQ2(0L, this);
        C1C7U.LIZIZ("HighlightListViewModel@a851.fetchPage$1");
        return objVQ2;
    }
}
