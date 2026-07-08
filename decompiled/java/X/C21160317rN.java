package X;

import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckServiceV2;

/* JADX INFO: renamed from: X.17rN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.vmsdk.VmSdkCheckServiceV2", f = "VmSdkCheckServiceV2.kt", l = {143}, m = "check")
public final class C21160317rN extends AbstractC23140094w {
    public C01CU LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VmSdkCheckServiceV2 LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21160317rN(VmSdkCheckServiceV2 vmSdkCheckServiceV2, InterfaceC1364105Vn<? super C21160317rN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = vmSdkCheckServiceV2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VmSdkCheckServiceV2@5f95.check$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLL.LIZJ(null, null, null, this);
        C1C7U.LIZIZ("VmSdkCheckServiceV2@5f95.check$1");
        return objLIZJ;
    }
}
