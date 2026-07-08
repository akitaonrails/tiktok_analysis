package X;

/* JADX INFO: renamed from: X.0O5H, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteRepository$operator$1$mutateFavorite$$inlined$map$1$2", f = "VideoFavoriteRepository.kt", l = {227, 223}, m = "emit")
public final class C0O5H extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public InterfaceC346701Wf LLILLL;
    public final /* synthetic */ C0O5G LLILZ;
    public C0O7A LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0O5H(C0O5G c0o5g, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0o5g;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoFavoriteRepository@a69d.operator$1$mutateFavorite$$inlined$map$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILZ.emit(null, this);
        C1C7U.LIZIZ("VideoFavoriteRepository@a69d.operator$1$mutateFavorite$$inlined$map$1$2$1");
        return objEmit;
    }
}
