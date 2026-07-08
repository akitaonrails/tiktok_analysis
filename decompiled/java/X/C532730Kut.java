package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Kut, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.util.SkipAIGCLoadComponent$closeScene$2$1", f = "SkipAIGCLoadComponent.kt", l = {}, m = "invokeSuspend")
public final class C532730Kut extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1625020sOC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C532730Kut(C1625020sOC c1625020sOC, InterfaceC1364105Vn<? super C532730Kut> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1625020sOC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C532730Kut(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SkipAIGCLoadComponent@d3a7.closeScene$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!Intrinsics.LJFF(this.LL.getStickerApiComponent().qr1().LJI(), true)) {
            this.LL.getCameraApiComponent().Zl0(new C1663770tOh(true, false, false));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkipAIGCLoadComponent@d3a7.closeScene$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
