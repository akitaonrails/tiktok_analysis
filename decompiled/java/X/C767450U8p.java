package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;

/* JADX INFO: renamed from: X.0U8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {776}, m = "preloadEffect")
public final class C767450U8p extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767450U8p(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C767450U8p> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.preloadEffect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objPQ2 = this.LLILLL.PQ2(0L, null, null, this);
        C1C7U.LIZIZ("StickerEffectViewModel@d809.preloadEffect$1");
        return objPQ2;
    }
}
