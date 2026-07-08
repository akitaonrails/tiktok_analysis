package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0UMW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDataSourceNew", f = "StickerEffectDataSourceNew.kt", l = {597}, m = "realUpdateFavoriteStickerEffect")
public final class C0UMW extends AbstractC23140094w {
    public LiveEffect LL;
    public boolean LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0UMB LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UMW(C0UMB c0umb, InterfaceC1364105Vn<? super C0UMW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0umb;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDataSourceNew@a057.realUpdateFavoriteStickerEffect$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJJIJIIJIL = this.LLILZ.LJJIJIIJIL(null, false, this);
        C1C7U.LIZIZ("StickerEffectDataSourceNew@a057.realUpdateFavoriteStickerEffect$1");
        return objLJJIJIIJIL;
    }
}
