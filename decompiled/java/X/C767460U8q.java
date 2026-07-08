package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.google.gson.n;

/* JADX INFO: renamed from: X.0U8q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {160}, m = "updateInteractiveEffect")
public final class C767460U8q extends AbstractC23140094w {
    public n LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767460U8q(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C767460U8q> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.updateInteractiveEffect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLL.WQ2(false, null, this);
        C1C7U.LIZIZ("StickerEffectViewModel@d809.updateInteractiveEffect$1");
        return objWQ2;
    }
}
