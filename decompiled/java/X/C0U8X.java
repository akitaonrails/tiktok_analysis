package X;

/* JADX INFO: renamed from: X.0U8X, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectController", f = "LiveEffectController.kt", l = {259, 261}, m = "getEffectFromCache")
public final class C0U8X extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0U8T LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U8X(C0U8T c0u8t, InterfaceC1364105Vn<? super C0U8X> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0u8t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectController@4857.getEffectFromCache$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILL = this.LLILZ.LJIILL(null, null, null, this);
        C1C7U.LIZIZ("LiveEffectController@4857.getEffectFromCache$1");
        return objLJIILL;
    }
}
