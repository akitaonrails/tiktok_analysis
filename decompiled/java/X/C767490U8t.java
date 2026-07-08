package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;

/* JADX INFO: renamed from: X.0U8t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {241, 246}, m = "sendCategoryListState")
public final class C767490U8t extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StickerEffectViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767490U8t(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C767490U8t> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = stickerEffectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.sendCategoryListState$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objTQ2 = this.LLILLJJLI.TQ2(null, this);
        C1C7U.LIZIZ("StickerEffectViewModel@d809.sendCategoryListState$1");
        return objTQ2;
    }
}
