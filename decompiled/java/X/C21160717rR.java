package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.VmSdkService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS278S0000000_32;
import njp.a;

/* JADX INFO: renamed from: X.17rR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService$init$initJob$1", f = "VmSdkCheckService.kt", l = {}, m = "invokeSuspend")
public final class C21160717rR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ VmSdkCheckService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21160717rR(VmSdkCheckService vmSdkCheckService, InterfaceC1364105Vn<? super C21160717rR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = vmSdkCheckService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21160717rR(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("VmSdkCheckService@a440.init$initJob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JsWorkerWrapper jsWorkerWrapper = this.LL.LIZ;
        if (jsWorkerWrapper != null) {
            jsWorkerWrapper.LJ(AFwS278S0000000_32.get$arr$(36));
        }
        this.LL.LIZ = VmSdkService.LIZIZ().LIZ(C786410Ut5.M3(C7879035x.LIZ()), new C20221814Am(new InterfaceC21321018cC() { // from class: X.17rT
            @Override // X.InterfaceC21321018cC
            public final void onSuccess() {
                C21187917vp.LIZ(C21187917vp.LIZ, "VmSdkCheckService", 4);
            }
        }));
        if (this.LL.LIZ != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("VmSdkCheckService@a440.init$initJob$1");
        return boolValueOf;
    }
}
