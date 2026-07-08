package X;

import Y.AgS301S0100000_20;

/* JADX INFO: renamed from: X.0k5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.recommendeffect.compose.HorizontalCarouselKt$Panel$4$1$invokeSuspend$$inlined$filter$1$2", f = "HorizontalCarousel.kt", l = {223}, m = "emit")
public final class C1306170k5v extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ AgS301S0100000_20 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1306170k5v(AgS301S0100000_20 agS301S0100000_20, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = agS301S0100000_20;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HorizontalCarouselKt@558d.Panel$4$1$invokeSuspend$$inlined$filter$1$2$1");
        this.LL = obj;
        this.LLILLJJLI |= Integer.MIN_VALUE;
        Object objEmit = this.LLILLL.emit(null, this);
        C1C7U.LIZIZ("HorizontalCarouselKt@558d.Panel$4$1$invokeSuspend$$inlined$filter$1$2$1");
        return objEmit;
    }
}
