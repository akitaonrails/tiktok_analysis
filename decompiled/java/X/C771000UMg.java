package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0UMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {317, 323}, m = "fetchSingleEffectInCategoryFromRemote")
public final class C771000UMg extends AbstractC23140094w {
    public LiveEffect LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UMA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C771000UMg(C0UMA c0uma, InterfaceC1364105Vn<? super C771000UMg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0uma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSource@9f2.fetchSingleEffectInCategoryFromRemote$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJIZL = this.LLILLL.LJJJJIZL(null, null, this);
        C1C7U.LIZIZ("StickerEffectDataSource@9f2.fetchSingleEffectInCategoryFromRemote$1");
        return objLJJJJIZL;
    }
}
