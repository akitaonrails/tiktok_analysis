package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService;

/* JADX INFO: renamed from: X.17rM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService", f = "VmSdkCheckService.kt", l = {134}, m = "check")
public final class C21160217rM extends AbstractC23140094w {
    public C01CU LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VmSdkCheckService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21160217rM(VmSdkCheckService vmSdkCheckService, InterfaceC1364105Vn<? super C21160217rM> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = vmSdkCheckService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VmSdkCheckService@a440.check$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("VmSdkCheckService@a440.check$1");
        return objLIZJ;
    }
}
