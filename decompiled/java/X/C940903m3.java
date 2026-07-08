package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.ccdc.IPipoCcdcService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03m3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentSdkProcess$init$3", f = "PaymentSdkProcess.kt", l = {}, m = "invokeSuspend")
public final class C940903m3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C940903m3(InterfaceC1364105Vn<? super C940903m3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C940903m3(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentSdkProcess@9b34.init$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IPipoCcdcService iPipoCcdcService = (IPipoCcdcService) PluggableExtentionKt.pluggableSpi$default(IPipoCcdcService.class, false, false, false, 14, null);
        if (iPipoCcdcService != null) {
            Boolean.valueOf(iPipoCcdcService.LJIIJ("tts"));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentSdkProcess@9b34.init$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C940903m3(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
