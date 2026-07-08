package X;

/* JADX INFO: renamed from: X.0UMa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {748}, m = "fetchFavoriteEffect")
public final class C770940UMa extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0UMA LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770940UMa(C0UMA c0uma, InterfaceC1364105Vn<? super C770940UMa> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0uma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSource@9f2.fetchFavoriteEffect$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIIJZLJL = this.LLILLJJLI.LJJIIJZLJL(null, this);
        C1C7U.LIZIZ("StickerEffectDataSource@9f2.fetchFavoriteEffect$1");
        return objLJJIIJZLJL;
    }
}
