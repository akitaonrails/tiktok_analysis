package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IPZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.location.serviceimpl.LocationServiceImpl$fetchLocationNew$1$onFailed$1", f = "LocationServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0IPZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC687820QyS LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IPZ(InterfaceC687820QyS interfaceC687820QyS, InterfaceC1364105Vn<? super C0IPZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC687820QyS;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IPZ(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LocationServiceImpl@d607.fetchLocationNew$1$onFailed$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.onError(-997, "Location SDK is not available, make sure you have added it to your dependency");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocationServiceImpl@d607.fetchLocationNew$1$onFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
