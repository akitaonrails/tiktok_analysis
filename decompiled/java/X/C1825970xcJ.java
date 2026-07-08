package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.powerlist.cells.ServiceBioThirdPartyLinkAssem;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xcJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825970xcJ extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ ServiceBioThirdPartyLinkAssem LL;
    public final /* synthetic */ C1782030wTR LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825970xcJ(ServiceBioThirdPartyLinkAssem serviceBioThirdPartyLinkAssem, C1782030wTR c1782030wTR) {
        super(2);
        this.LL = serviceBioThirdPartyLinkAssem;
        this.LLILLJJLI = c1782030wTR;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        ServiceBioThirdPartyLinkAssem serviceBioThirdPartyLinkAssem = this.LL;
        ((PcsServiceBioVMV2) serviceBioThirdPartyLinkAssem.LLJL.getValue(serviceBioThirdPartyLinkAssem, ServiceBioThirdPartyLinkAssem.LLJLL[0])).xQ2(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
