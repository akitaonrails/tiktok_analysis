package X;

/* JADX INFO: renamed from: X.0UMY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSourceNew", f = "StickerEffectDataSourceNew.kt", l = {556}, m = "getEffectFromCache")
public final class C0UMY extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0UMB LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMY(C0UMB c0umb, InterfaceC1364105Vn<? super C0UMY> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0umb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSourceNew@a057.getEffectFromCache$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZ.LJI(null, null, null, this);
        C1C7U.LIZIZ("StickerEffectDataSourceNew@a057.getEffectFromCache$1");
        return objLJI;
    }
}
