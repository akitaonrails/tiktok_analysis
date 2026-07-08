package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0UMS, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSourceNew", f = "StickerEffectDataSourceNew.kt", l = {335}, m = "fetchEffectInCategoryFromRemote")
public final class C0UMS extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public long LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0UMB LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMS(C0UMB c0umb, InterfaceC1364105Vn<? super C0UMS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0umb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StickerEffectDataSourceNew@a057.fetchEffectInCategoryFromRemote$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJII = this.LLILZIL.LJII(null, null, null, null, this);
        C1C7U.LIZIZ("StickerEffectDataSourceNew@a057.fetchEffectInCategoryFromRemote$1");
        return objLJII;
    }
}
