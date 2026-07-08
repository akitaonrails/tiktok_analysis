package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0U8l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {1098, 1104, 1109}, m = "setEffect")
public final class C767410U8l extends AbstractC23140094w {
    public Object LL;
    public C259800zU LLILLJJLI;
    public LiveEffect LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ StickerEffectViewModel LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767410U8l(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C767410U8l> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.setEffect$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objUQ2 = this.LLILZIL.UQ2(null, null, this);
        C1C7U.LIZIZ("StickerEffectViewModel@d809.setEffect$1");
        return objUQ2;
    }
}
