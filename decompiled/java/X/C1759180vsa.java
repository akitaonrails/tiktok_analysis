package X;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.jvm.internal.AwS392S0200000_26;

/* JADX INFO: renamed from: X.0vsa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759180vsa extends AbstractC1759200vsc {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        JediViewModel jediViewModel;
        SeaPdpViewModel seaPdpViewModel;
        InterfaceC1759210vsd interfaceC1759210vsd = (InterfaceC1759210vsd) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            jediViewModel = (PdpViewModel) interfaceC634840OvC.LIZIZ(PdpViewModel.class);
        } else {
            jediViewModel = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 != null) {
            seaPdpViewModel = (SeaPdpViewModel) interfaceC634840OvC2.LIZIZ(SeaPdpViewModel.class);
        } else {
            seaPdpViewModel = null;
        }
        if (jediViewModel == null) {
            jediViewModel = seaPdpViewModel;
        }
        if (jediViewModel instanceof PdpViewModel) {
            JediViewModel jediViewModel2 = jediViewModel;
            C1759590vtF c1759590vtF = new C1759590vtF(null, null);
            if (jediViewModel2 != null) {
                jediViewModel2.setState(new AwS392S0200000_26(c1759590vtF, interfaceC1759210vsd, 1));
            }
        } else if (jediViewModel instanceof SeaPdpViewModel) {
            JediViewModel jediViewModel3 = jediViewModel;
            C1759590vtF c1759590vtF2 = new C1759590vtF(null, null);
            if (jediViewModel3 != null) {
                jediViewModel3.setState(new AwS392S0200000_26(c1759590vtF2, interfaceC1759210vsd, 2));
            }
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1759300vsm.class, null), "");
    }
}
