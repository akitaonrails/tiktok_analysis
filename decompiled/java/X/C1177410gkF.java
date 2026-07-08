package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gkF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.marker.PoiMapDetailMarkerGenerator$tryCreateMarkerZygote$4", f = "PoiMapDetailMarkerGenerator.kt", l = {}, m = "invokeSuspend")
public final class C1177410gkF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ C1177390gkD LL;
    public final /* synthetic */ C259800zU<C1177000gja> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1177410gkF(C1177390gkD c1177390gkD, C259800zU<C1177000gja> c259800zU, InterfaceC1364105Vn<? super C1177410gkF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1177390gkD;
        this.LLILLJJLI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1177410gkF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapDetailMarkerGenerator@3173.tryCreateMarkerZygote$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolInvoke = this.LL.LIZLLL.invoke(this.LLILLJJLI.element);
        C1C7U.LIZIZ("PoiMapDetailMarkerGenerator@3173.tryCreateMarkerZygote$4");
        return boolInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
