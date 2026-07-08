package X;

/* JADX INFO: renamed from: X.0UML, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {120}, m = "fetchRemoteDataNew")
public final class C0UML extends AbstractC23140094w {
    public C0UMA LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UMA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UML(C0UMA c0uma, InterfaceC1364105Vn<? super C0UML> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0uma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSource@9f2.fetchRemoteDataNew$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIILL = this.LLILLL.LJIILL(null, this);
        C1C7U.LIZIZ("StickerEffectDataSource@9f2.fetchRemoteDataNew$1");
        return objLJIILL;
    }
}
