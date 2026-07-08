package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0WVN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.appsflyer.AppsflyerImpl$fetchGoogleAttributionInfo$1", f = "AppsflyerImpl.kt", l = {}, m = "invokeSuspend")
public final class C0WVN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0WVN(InterfaceC1364105Vn<? super C0WVN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WVN(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AppsflyerImpl@ad01.fetchGoogleAttributionInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C10UP.LIZ.getClass();
        C10UP.LIZ(true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AppsflyerImpl@ad01.fetchGoogleAttributionInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0WVN(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
