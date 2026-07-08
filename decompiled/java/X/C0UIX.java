package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0UIX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.sticker.StickerMonitorEffectHelper", f = "StickerMonitorEffectHelper.kt", l = {158}, m = "downloadEffectIfNecessary")
public final class C0UIX extends AbstractC23140094w {
    public LiveEffect LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UIT LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UIX(C0UIT c0uit, InterfaceC1364105Vn<? super C0UIX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0uit;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerMonitorEffectHelper@a9e4.downloadEffectIfNecessary$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, this);
        C1C7U.LIZIZ("StickerMonitorEffectHelper@a9e4.downloadEffectIfNecessary$1");
        return objLIZJ;
    }
}
