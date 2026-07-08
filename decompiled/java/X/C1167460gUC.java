package X;

import com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel;

/* JADX INFO: renamed from: X.0gUC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.mix.editplaylist.EditPlaylistViewModel", f = "EditPlaylistViewModel.kt", l = {112}, m = "onLoadLatest")
public final class C1167460gUC extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ EditPlaylistViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167460gUC(EditPlaylistViewModel editPlaylistViewModel, InterfaceC1364105Vn<? super C1167460gUC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = editPlaylistViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditPlaylistViewModel@acb0.onLoadLatest$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objZQ2 = this.LLILLJJLI.zQ2(0L, this);
        C1C7U.LIZIZ("EditPlaylistViewModel@acb0.onLoadLatest$1");
        return objZQ2;
    }
}
