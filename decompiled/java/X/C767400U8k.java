package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;

/* JADX INFO: renamed from: X.0U8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {421, 427, 432, 433, 450, 452, 456}, m = "fetchNormalCategoryList")
public final class C767400U8k extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ StickerEffectViewModel LLJ;
    public int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767400U8k(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C767400U8k> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJ = stickerEffectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.fetchNormalCategoryList$1");
        this.LLIZLLLIL = obj;
        this.LLJI |= Integer.MIN_VALUE;
        Object objJQ2 = this.LLJ.JQ2(null, this);
        C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchNormalCategoryList$1");
        return objJQ2;
    }
}
