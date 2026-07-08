package X;

/* JADX INFO: renamed from: X.0U8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectController", f = "LiveEffectController.kt", l = {274}, m = "getEffectFromLocal")
public final class C767300U8a extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C0U8T LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767300U8a(C0U8T c0u8t, InterfaceC1364105Vn<? super C767300U8a> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c0u8t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectController@4857.getEffectFromLocal$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("LiveEffectController@4857.getEffectFromLocal$1");
        return objLIZJ;
    }
}
