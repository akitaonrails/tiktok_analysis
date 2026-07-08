package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gjT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.mapdetail.marker.PoiMapDetailMarkerRender$createMarkerZygote$2$1", f = "PoiMapDetailMarkerRender.kt", l = {}, m = "invokeSuspend")
public final class C1176930gjT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1177040gje LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1176930gjT(InterfaceC1177040gje interfaceC1177040gje, float f, InterfaceC1364105Vn<? super C1176930gjT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1177040gje;
        this.LLILLJJLI = f;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1176930gjT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PoiMapDetailMarkerRender@7f86.createMarkerZygote$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiMapDetailMarkerRender@7f86.createMarkerZygote$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
