package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel;

/* JADX INFO: renamed from: X.0xKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardspanel.assems.viewmodel.LiveBoardsPageViewModel", f = "LiveBoardsPageViewModel.kt", l = {149, 153}, m = "onLoadMore$suspendImpl")
public final class C1815070xKj extends AbstractC23140094w {
    public LiveBoardsPageViewModel LL;
    public LiveBoardsPageViewModel LLILLJJLI;
    public Object LLILLL;
    public LiveBoardsPageViewModel LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ LiveBoardsPageViewModel LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815070xKj(LiveBoardsPageViewModel liveBoardsPageViewModel, InterfaceC1364105Vn<? super C1815070xKj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = liveBoardsPageViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveBoardsPageViewModel@b609.onLoadMore$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objFQ2 = LiveBoardsPageViewModel.FQ2(this.LLIZLLLIL, 0, this);
        C1C7U.LIZIZ("LiveBoardsPageViewModel@b609.onLoadMore$1");
        return objFQ2;
    }
}
