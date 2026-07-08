package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KyC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aiselfeffect.AimeStyleStickerHandlerV2$getStickerPanelVisibility$1", f = "AimeStyleStickerHandlerV2.kt", l = {}, m = "invokeSuspend")
public final class C534780KyC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0MJC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534780KyC(C0MJC c0mjc, InterfaceC1364105Vn<? super C534780KyC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mjc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534780KyC(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AimeStyleStickerHandlerV2@221b.getStickerPanelVisibility$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJIIZI().pp2(false, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AimeStyleStickerHandlerV2@221b.getStickerPanelVisibility$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
