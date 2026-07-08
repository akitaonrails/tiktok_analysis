package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicListViewModel;

/* JADX INFO: renamed from: X.0OPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicListViewModel", f = "BulletinShareMusicListViewModel.kt", l = {126}, m = "onLoadMore")
public final class C618840OPa extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinShareMusicListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C618840OPa(BulletinShareMusicListViewModel bulletinShareMusicListViewModel, InterfaceC1364105Vn<? super C618840OPa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bulletinShareMusicListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinShareMusicListViewModel@cc78.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLJJLI.onLoadMore(0, this);
        C1C7U.LIZIZ("BulletinShareMusicListViewModel@cc78.onLoadMore$1");
        return objOnLoadMore;
    }
}
