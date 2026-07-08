package X;

import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicListViewModel;

/* JADX INFO: renamed from: X.0OPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.sharemusic.BulletinShareMusicListViewModel", f = "BulletinShareMusicListViewModel.kt", l = {61}, m = "onRefresh")
public final class C0OPZ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BulletinShareMusicListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OPZ(BulletinShareMusicListViewModel bulletinShareMusicListViewModel, InterfaceC1364105Vn<? super C0OPZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = bulletinShareMusicListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinShareMusicListViewModel@cc78.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("BulletinShareMusicListViewModel@cc78.onRefresh$1");
        return objOnRefresh;
    }
}
