package X;

import Y.AgS202S0200000_12;

/* JADX INFO: renamed from: X.0U9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.shortcutpanel.StickerShortCutWidget$observeViewModel$1$1", f = "StickerShortCutWidget.kt", l = {419}, m = "emit")
public final class C767580U9c extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AgS202S0200000_12<T> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C767580U9c(AgS202S0200000_12<? super T> agS202S0200000_12, InterfaceC1364105Vn<? super C767580U9c> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = agS202S0200000_12;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerShortCutWidget@5ed5.observeViewModel$1$1$emit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ$0 = this.LLILLJJLI.LIZ$0(null, this);
        C1C7U.LIZIZ("StickerShortCutWidget@5ed5.observeViewModel$1$1$emit$1");
        return objLIZ$0;
    }
}
