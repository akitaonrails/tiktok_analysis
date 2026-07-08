package X;

import Y.AgS290S0100000_9;

/* JADX INFO: renamed from: X.0O6K, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.business.playlist.PlaylistCollectionVM$onPrepared$1$invokeSuspend$$inlined$filter$1$2", f = "PlaylistCollectionVM.kt", l = {223}, m = "emit")
public final class C0O6K extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS290S0100000_9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O6K(AgS290S0100000_9 agS290S0100000_9, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS290S0100000_9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlaylistCollectionVM@b453.onPrepared$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("PlaylistCollectionVM@b453.onPrepared$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
