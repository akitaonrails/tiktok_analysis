package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.assem.PcsServiceBioContentAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.viewmodel.PcsServiceBioVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wY2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1784880wY2 extends C09AY implements Function1<InterfaceC1822900xXM, Unit> {
    public final /* synthetic */ PcsServiceBioContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784880wY2(PcsServiceBioContentAssem pcsServiceBioContentAssem) {
        super(1);
        this.LL = pcsServiceBioContentAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1822900xXM interfaceC1822900xXM) {
        PcsServiceBioVM pcsServiceBioVMIp = this.LL.ip();
        C23250099c.LIZLLL(pcsServiceBioVMIp.getAssemVMScope(), null, null, new C1785250wYd(pcsServiceBioVMIp, interfaceC1822900xXM, null), 3);
        return Unit.LIZ;
    }
}
