package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckServiceV2;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.17rH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckServiceV2$check$checkJob$1", f = "VmSdkCheckServiceV2.kt", l = {141}, m = "invokeSuspend")
public final class C21159717rH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ VmSdkCheckServiceV2 LLILLJJLI;
    public final /* synthetic */ C01CU LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21159717rH(VmSdkCheckServiceV2 vmSdkCheckServiceV2, C01CU c01cu, String str, String str2, InterfaceC1364105Vn<? super C21159717rH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = vmSdkCheckServiceV2;
        this.LLILLL = c01cu;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C21159717rH(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VmSdkCheckServiceV2@5f95.check$checkJob$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            VmSdkCheckServiceV2 vmSdkCheckServiceV2 = this.LLILLJJLI;
            JsWorkerWrapper jsWorkerWrapper = vmSdkCheckServiceV2.LIZ;
            C01CU c01cu = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            this.LL = 1;
            obj = vmSdkCheckServiceV2.LIZLLL(jsWorkerWrapper, c01cu, str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VmSdkCheckServiceV2@5f95.check$checkJob$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VmSdkCheckServiceV2@5f95.check$checkJob$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
