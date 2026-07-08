package X;

/* JADX INFO: renamed from: X.0UMQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {945, 952}, m = "updateInteractiveEffect")
public final class C0UMQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0UMA LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMQ(C0UMA c0uma, InterfaceC1364105Vn<? super C0UMQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0uma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSource@9f2.updateInteractiveEffect$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIJI = this.LLILLJJLI.LJIJI(false, null, this);
        C1C7U.LIZIZ("StickerEffectDataSource@9f2.updateInteractiveEffect$1");
        return objLJIJI;
    }
}
