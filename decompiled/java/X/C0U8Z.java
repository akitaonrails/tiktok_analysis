package X;

/* JADX INFO: renamed from: X.0U8Z, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectController", f = "LiveEffectController.kt", l = {63, 65, 67}, m = "downloadEffect")
public final class C0U8Z extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0U8T LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U8Z(C0U8T c0u8t, InterfaceC1364105Vn<? super C0U8Z> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0u8t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectController@4857.downloadEffect$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILLJJLI.LJI(null, null, null, this);
        C1C7U.LIZIZ("LiveEffectController@4857.downloadEffect$1");
        return objLJI;
    }
}
