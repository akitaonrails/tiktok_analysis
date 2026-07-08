package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.basicui.listitem.sparklite.helper.PreloadFontHelper$preload$1", f = "PreloadFontHelper.kt", l = {}, m = "invokeSuspend")
public final class C1407870mjx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1407870mjx(InterfaceC1364105Vn<? super C1407870mjx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407870mjx(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreloadFontHelper@b80a.preload$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1546380qLM.LIZ.getClass();
        C1546380qLM.LIZJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreloadFontHelper@b80a.preload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1407870mjx(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
