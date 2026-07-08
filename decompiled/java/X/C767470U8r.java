package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;

/* JADX INFO: renamed from: X.0U8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {909}, m = "searchMoreSticker")
public final class C767470U8r extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767470U8r(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C767470U8r> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.searchMoreSticker$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objQQ2 = this.LLILLL.QQ2(this);
        C1C7U.LIZIZ("StickerEffectViewModel@d809.searchMoreSticker$1");
        return objQQ2;
    }
}
