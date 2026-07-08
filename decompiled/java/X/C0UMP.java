package X;

/* JADX INFO: renamed from: X.0UMP, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {754}, m = "fetchFavoriteEffectNew")
public final class C0UMP extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UMA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMP(C0UMA c0uma, InterfaceC1364105Vn<? super C0UMP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0uma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSource@9f2.fetchFavoriteEffectNew$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJ = this.LLILLL.LJJJJ(null, this);
        C1C7U.LIZIZ("StickerEffectDataSource@9f2.fetchFavoriteEffectNew$1");
        return objLJJJJ;
    }
}
