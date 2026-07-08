package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: renamed from: X.0U8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {606, 608, 613, 619, 625, 629}, m = "getEffect")
public final class C767390U8j extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public LiveEffect LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ StickerEffectViewModel LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767390U8j(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C767390U8j> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.getEffect$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objMQ2 = this.LLIZLLLIL.MQ2(null, null, null, this);
        C1C7U.LIZIZ("StickerEffectViewModel@d809.getEffect$1");
        return objMQ2;
    }
}
