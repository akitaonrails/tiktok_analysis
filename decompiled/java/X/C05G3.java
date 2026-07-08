package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05G3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pgc.hybrid.xbridge.impl.StudioGetStudioInappSettings$getAutoDubbingAuthorizationSetting$1", f = "StudioGetStudioInappSettings.kt", l = {}, m = "invokeSuspend")
public final class C05G3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C05G3(InterfaceC1364105Vn<? super C05G3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05G3(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StudioGetStudioInappSettings@cfa9.getAutoDubbingAuthorizationSetting$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(C746760TRa.LIZ().LJJJJJL());
        C1C7U.LIZIZ("StudioGetStudioInappSettings@cfa9.getAutoDubbingAuthorizationSetting$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C05G3(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
