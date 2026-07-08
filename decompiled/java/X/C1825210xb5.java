package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.optin.assem.PcsServicePlusOptinIntroAssem;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0xb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1825210xb5 extends C09AY implements Function2<UIAssem, SMBOptInQualificationResponse.ResponseData, Unit> {
    public final /* synthetic */ PcsServicePlusOptinIntroAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1825210xb5(PcsServicePlusOptinIntroAssem pcsServicePlusOptinIntroAssem) {
        super(2);
        this.LL = pcsServicePlusOptinIntroAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, SMBOptInQualificationResponse.ResponseData responseData) {
        int i;
        AbstractC21673619ry adapter;
        PcsServicePlusOptinIntroAssem pcsServicePlusOptinIntroAssem = this.LL;
        AssemVMLazy assemVMLazy = pcsServicePlusOptinIntroAssem.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsServicePlusOptinIntroAssem.LLJJJ;
        boolean z = false;
        SMBOptInQualificationResponse.ResponseData responseData2 = ((C1823670xYb) assemVMLazy.getValue().getState()).LLILLJJLI;
        if (responseData2 != null && responseData2.leadsOptInStatus == 1) {
            z = true;
        }
        pcsServicePlusOptinIntroAssem.LLJJIJIIJIL = z;
        PcsServicePlusOptinIntroAssem pcsServicePlusOptinIntroAssem2 = this.LL;
        C0H31 c0h31 = pcsServicePlusOptinIntroAssem2.LLJJIJIL;
        if (c0h31 != null) {
            boolean z2 = pcsServicePlusOptinIntroAssem2.LLJJIJIIJIL;
            pcsServicePlusOptinIntroAssem2.getContext();
            if (z2) {
                i = 2131856045;
            } else {
                i = 2131856044;
            }
            c0h31.LL = Collections.singletonList(new C0H33(i));
            C20632315oP c20632315oP = pcsServicePlusOptinIntroAssem2.LLJJIII;
            if (c20632315oP != null && (adapter = c20632315oP.getAdapter()) != null) {
                adapter.notifyDataSetChanged();
            }
        }
        return Unit.LIZ;
    }
}
