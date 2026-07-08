package X;

import org.json.JSONException;

/* JADX INFO: renamed from: X.0UMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSource", f = "StickerEffectDataSource.kt", l = {177}, m = "fetchCategoryListDataFromRemote")
public final class C771100UMq extends AbstractC23140094w {
    public C0UMA LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0UMA LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C771100UMq(C0UMA c0uma, InterfaceC1364105Vn<? super C771100UMq> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0uma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("StickerEffectDataSource@9f2.fetchCategoryListDataFromRemote$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIJJLI = this.LLILLL.LJIJJLI(this);
        C1C7U.LIZIZ("StickerEffectDataSource@9f2.fetchCategoryListDataFromRemote$1");
        return objLJIJJLI;
    }
}
