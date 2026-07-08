package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0U8U, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectController", f = "LiveEffectController.kt", l = {194, 197, 206, 208, 213, 216, 219}, m = "getEffect")
public final class C0U8U extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public LiveEffect LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0U8T LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U8U(C0U8T c0u8t, InterfaceC1364105Vn<? super C0U8U> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0u8t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectController@4857.getEffect$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJIIL = this.LLILZLL.LJIIL(null, null, null, this);
        C1C7U.LIZIZ("LiveEffectController@4857.getEffect$1");
        return objLJIIL;
    }
}
