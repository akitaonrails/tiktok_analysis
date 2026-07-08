package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckServiceV2;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.VmSdkService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS278S0000000_32;
import njp.a;

/* JADX INFO: renamed from: X.17rS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckServiceV2$init$initJob$1", f = "VmSdkCheckServiceV2.kt", l = {}, m = "invokeSuspend")
public final class C21160817rS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public final /* synthetic */ VmSdkCheckServiceV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21160817rS(VmSdkCheckServiceV2 vmSdkCheckServiceV2, InterfaceC1364105Vn<? super C21160817rS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = vmSdkCheckServiceV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21160817rS(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("VmSdkCheckServiceV2@5f95.init$initJob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ = VmSdkService.LIZIZ().LIZ(C786410Ut5.M3(C7879035x.LIZ()), new C20221814Am(new InterfaceC21321018cC() { // from class: X.17rU
            @Override // X.InterfaceC21321018cC
            public final void onSuccess() {
                C21187917vp.LIZ(C21187917vp.LIZ, "VmSdkCheckServiceV2", 4);
            }
        }));
        JsWorkerWrapper jsWorkerWrapper = this.LL.LIZ;
        if (jsWorkerWrapper != null) {
            jsWorkerWrapper.LJ(AFwS278S0000000_32.get$arr$(37));
        }
        if (this.LL.LIZ != null) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("VmSdkCheckServiceV2@5f95.init$initJob$1");
        return boolValueOf;
    }
}
