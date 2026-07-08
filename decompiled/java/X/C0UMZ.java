package X;

/* JADX INFO: renamed from: X.0UMZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSourceNew", f = "StickerEffectDataSourceNew.kt", l = {567}, m = "fetchFavoriteEffect")
public final class C0UMZ extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UMB LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMZ(C0UMB c0umb, InterfaceC1364105Vn<? super C0UMZ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0umb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSourceNew@a057.fetchFavoriteEffect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJIIJZLJL = this.LLILLL.LJJIIJZLJL(null, this);
        C1C7U.LIZIZ("StickerEffectDataSourceNew@a057.fetchFavoriteEffect$1");
        return objLJJIIJZLJL;
    }
}
