package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.PcsServiceBioFragmentV2;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.servicebio.newui.viewmodel.PcsServiceBioVMV2;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C521300KcS extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PcsServiceBioFragmentV2 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C521300KcS(PcsServiceBioFragmentV2 pcsServiceBioFragmentV2) {
        super(0);
        this.LL = pcsServiceBioFragmentV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Integer num;
        C1822330xWR c1822330xWRNR = this.LL.NR();
        int iIntValue = (c1822330xWRNR == null || (num = c1822330xWRNR.LLJJL) == null) ? -1 : num.intValue();
        InterfaceC517590KRp interfaceC517590KRpLIZJ = C1826730xdX.LIZJ();
        if (interfaceC517590KRpLIZJ != null) {
            interfaceC517590KRpLIZJ.LJII(new C0KBP(iIntValue, new LinkedHashMap()));
        }
        AssemVMLazy assemVMLazy = this.LL.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PcsServiceBioFragmentV2.LLIZ;
        ((PcsServiceBioVMV2) assemVMLazy.getValue()).wQ2(true);
        return Unit.LIZ;
    }
}
