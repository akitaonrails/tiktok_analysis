package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService;

/* JADX INFO: renamed from: X.17rO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckService", f = "VmSdkCheckService.kt", l = {96}, m = "init")
public final class C21160417rO extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ VmSdkCheckService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21160417rO(VmSdkCheckService vmSdkCheckService, InterfaceC1364105Vn<? super C21160417rO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = vmSdkCheckService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VmSdkCheckService@a440.init$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILLJJLI.LIZ(this);
        C1C7U.LIZIZ("VmSdkCheckService@a440.init$1");
        return objLIZ;
    }
}
