package X;

import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel;

/* JADX INFO: renamed from: X.0gUB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel", f = "EditPlaylistViewModel.kt", l = {90}, m = "onLoadMore")
public final class C1167450gUB extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EditPlaylistViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167450gUB(EditPlaylistViewModel editPlaylistViewModel, InterfaceC1364105Vn<? super C1167450gUB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = editPlaylistViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditPlaylistViewModel@acb0.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(0L, this);
        C1C7U.LIZIZ("EditPlaylistViewModel@acb0.onLoadMore$1");
        return objOnLoadMore;
    }
}
