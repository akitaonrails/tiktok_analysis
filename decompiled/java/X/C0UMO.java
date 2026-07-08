package X;

/* JADX INFO: renamed from: X.0UMO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {735}, m = "getEffectFromCache")
public final class C0UMO extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0UMA LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMO(C0UMA c0uma, InterfaceC1364105Vn<? super C0UMO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0uma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSource@9f2.getEffectFromCache$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZ.LJI(null, null, null, this);
        C1C7U.LIZIZ("StickerEffectDataSource@9f2.getEffectFromCache$1");
        return objLJI;
    }
}
