package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0UMu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSourceNew", f = "StickerEffectDataSourceNew.kt", l = {153, 158}, m = "fetchCategoryListData")
public final class C771140UMu extends AbstractC23140094w {
    public long LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UMB LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C771140UMu(C0UMB c0umb, InterfaceC1364105Vn<? super C771140UMu> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0umb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StickerEffectDataSourceNew@a057.fetchCategoryListData$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJIL = this.LLILLL.LJJIL(this);
        C1C7U.LIZIZ("StickerEffectDataSourceNew@a057.fetchCategoryListData$1");
        return objLJJIL;
    }
}
