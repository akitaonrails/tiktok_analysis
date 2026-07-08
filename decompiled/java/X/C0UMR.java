package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0UMR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSourceNew", f = "StickerEffectDataSourceNew.kt", l = {372, 379}, m = "fetchMoreEffectInCategoryFromRemote")
public final class C0UMR extends AbstractC23140094w {
    public Object LL;
    public boolean LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0UMB LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMR(C0UMB c0umb, InterfaceC1364105Vn<? super C0UMR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0umb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StickerEffectDataSourceNew@a057.fetchMoreEffectInCategoryFromRemote$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJJIIZ = this.LLILZIL.LJJIIZ(null, null, null, null, false, false, this);
        C1C7U.LIZIZ("StickerEffectDataSourceNew@a057.fetchMoreEffectInCategoryFromRemote$1");
        return objLJJIIZ;
    }
}
