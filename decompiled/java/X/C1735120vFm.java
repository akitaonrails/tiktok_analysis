package X;

import com.ss.android.ugc.aweme.ecommerce.compliance.EcComplianceConfigModel;
import com.ss.android.ugc.aweme.ecommerce.compliance.ScenesConfig;

/* JADX INFO: renamed from: X.0vFm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.manager.ComplianceManager", f = "ComplianceManager.kt", l = {42}, m = "awaitCheck")
public final class C1735120vFm extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public EcComplianceConfigModel LLILLL;
    public ScenesConfig LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1735100vFk LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1735120vFm(C1735100vFk c1735100vFk, InterfaceC1364105Vn<? super C1735120vFm> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1735100vFk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComplianceManager@dbc7.awaitCheck$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZLL.LIZ(null, null, null, null, null, this);
        C1C7U.LIZIZ("ComplianceManager@dbc7.awaitCheck$1");
        return objLIZ;
    }
}
