package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0U8G, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDynamicAdaptiveManager", f = "StickerEffectDynamicAdaptiveManager.kt", l = {164, 167}, m = "updateEffectLevel")
public final class C0U8G extends AbstractC23140094w {
    public LiveEffect LL;
    public C0U8C LLILLJJLI;
    public LiveEffect LLILLL;
    public LiveEffect LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0U8F LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U8G(C0U8F c0u8f, InterfaceC1364105Vn<? super C0U8G> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0u8f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDynamicAdaptiveManager@df67.updateEffectLevel$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILZLL.LIZLLL(null, null, this);
        C1C7U.LIZIZ("StickerEffectDynamicAdaptiveManager@df67.updateEffectLevel$1");
        return objLIZLLL;
    }
}
