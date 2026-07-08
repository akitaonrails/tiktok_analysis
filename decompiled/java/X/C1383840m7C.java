package X;

import com.ss.android.ugc.aweme.model.DanmakuListViewModel;

/* JADX INFO: renamed from: X.0m7C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.model.DanmakuListViewModel", f = "DanmakuListViewModel.kt", l = {133}, m = "fetchDanmakuList")
public final class C1383840m7C extends AbstractC23140094w {
    public boolean LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DanmakuListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1383840m7C(DanmakuListViewModel danmakuListViewModel, InterfaceC1364105Vn<? super C1383840m7C> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = danmakuListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DanmakuListViewModel@b5f.fetchDanmakuList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(false, null, this);
        C1C7U.LIZIZ("DanmakuListViewModel@b5f.fetchDanmakuList$1");
        return objVQ2;
    }
}
