package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService;

/* JADX INFO: renamed from: X.17rK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService", f = "VmSdkCheckService.kt", l = {155}, m = "executeJsCheck")
public final class C21160017rK extends AbstractC23140094w {
    public C01CU LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VmSdkCheckService LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21160017rK(VmSdkCheckService vmSdkCheckService, InterfaceC1364105Vn<? super C21160017rK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = vmSdkCheckService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VmSdkCheckService@a440.executeJsCheck$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLL.LIZLLL(null, null, null, null, this);
        C1C7U.LIZIZ("VmSdkCheckService@a440.executeJsCheck$1");
        return objLIZLLL;
    }
}
