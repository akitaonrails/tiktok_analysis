package X;

/* JADX INFO: renamed from: X.0UMt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {295}, m = "fetchEffectInCategoryFromCache")
public final class C771130UMt extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UMA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C771130UMt(C0UMA c0uma, InterfaceC1364105Vn<? super C771130UMt> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0uma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSource@9f2.fetchEffectInCategoryFromCache$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIIZ = this.LLILLL.LJIIIZ(null, null, this);
        C1C7U.LIZIZ("StickerEffectDataSource@9f2.fetchEffectInCategoryFromCache$1");
        return objLJIIIZ;
    }
}
