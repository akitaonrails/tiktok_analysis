package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CRL, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.preload.smart.v3.SmartPreloadV3Helper$checkIsWifiStateAsync$1$1$1", f = "SmartPreloadV3Helper.kt", l = {}, m = "invokeSuspend")
public final class C0CRL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C0CRL(InterfaceC1364105Vn<? super C0CRL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRL(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartPreloadV3Helper@94ef.checkIsWifiStateAsync$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C844470XAv.LIZ.getClass();
        Boolean boolValueOf = Boolean.valueOf(C0XF1.LJ(C844470XAv.LIZ()));
        C1C7U.LIZIZ("SmartPreloadV3Helper@94ef.checkIsWifiStateAsync$1$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C0CRL(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
