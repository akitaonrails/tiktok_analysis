package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;

/* JADX INFO: renamed from: X.0U8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {317, 320, 326, 330, 331, 340, 342, 346}, m = "fetchCategoryList")
public final class C767420U8m extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public int LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ StickerEffectViewModel LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767420U8m(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C767420U8m> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = stickerEffectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.fetchCategoryList$3");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objHQ2 = this.LLIZ.HQ2(null, null, this);
        C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchCategoryList$3");
        return objHQ2;
    }
}
