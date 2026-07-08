package X;

/* JADX INFO: renamed from: X.0UIW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.sticker.StickerMonitorEffectHelper", f = "StickerMonitorEffectHelper.kt", l = {122, 124}, m = "fetchMonitorEffect")
public final class C0UIW extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C118300cf LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0UIT LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UIW(C0UIT c0uit, InterfaceC1364105Vn<? super C0UIW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0uit;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerMonitorEffectHelper@a9e4.fetchMonitorEffect$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, null, this);
        C1C7U.LIZIZ("StickerMonitorEffectHelper@a9e4.fetchMonitorEffect$1");
        return objLIZLLL;
    }
}
