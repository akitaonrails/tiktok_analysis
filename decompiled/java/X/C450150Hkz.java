package X;

/* JADX INFO: renamed from: X.0Hkz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sticker.basic.repo.BasicStickerRepository", f = "BasicStickerRepository.kt", l = {289}, m = "loadMoreFavouriteStickers")
public final class C450150Hkz extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C450100Hku LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C450150Hkz(C450100Hku c450100Hku, InterfaceC1364105Vn<? super C450150Hkz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c450100Hku;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BasicStickerRepository@45d8.loadMoreFavouriteStickers$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLoadMoreFavouriteStickers = this.LLILLJJLI.loadMoreFavouriteStickers(null, this);
        C1C7U.LIZIZ("BasicStickerRepository@45d8.loadMoreFavouriteStickers$1");
        return objLoadMoreFavouriteStickers;
    }
}
