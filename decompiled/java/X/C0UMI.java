package X;

/* JADX INFO: renamed from: X.0UMI, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {346}, m = "fetchEffectInCategoryFromRemote")
public final class C0UMI extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0UMA LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMI(C0UMA c0uma, InterfaceC1364105Vn<? super C0UMI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0uma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSource@9f2.fetchEffectInCategoryFromRemote$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZIL.LJII(null, null, null, null, this);
        C1C7U.LIZIZ("StickerEffectDataSource@9f2.fetchEffectInCategoryFromRemote$1");
        return objLJII;
    }
}
