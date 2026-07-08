package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0UMH, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {535, 543}, m = "fetchMoreEffectInCategoryFromRemote")
public final class C0UMH extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public boolean LLILLL;
    public long LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C0UMA LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMH(C0UMA c0uma, InterfaceC1364105Vn<? super C0UMH> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c0uma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StickerEffectDataSource@9f2.fetchMoreEffectInCategoryFromRemote$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJJIIZ = this.LLILZLL.LJJIIZ(null, null, null, null, false, false, this);
        C1C7U.LIZIZ("StickerEffectDataSource@9f2.fetchMoreEffectInCategoryFromRemote$1");
        return objLJJIIZ;
    }
}
