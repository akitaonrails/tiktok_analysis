package X;

import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import kotlin.jvm.internal.AwS605S0100000_26;

/* JADX INFO: renamed from: X.0vsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1759340vsq extends AbstractC1759350vsr {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        JediViewModel jediViewModel;
        SeaPdpViewModel seaPdpViewModel;
        InterfaceC1759360vss interfaceC1759360vss = (InterfaceC1759360vss) xBaseParamModel;
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
        C1759590vtF c1759590vtF = new C1759590vtF(interfaceC1759360vss.getSchema(), interfaceC1759360vss.getTemplateData());
        if (interfaceC1759360vss.getDelayMs() != null) {
            if (jediViewModel != null) {
                C948503nH.LJFF(jediViewModel, C23271099x.INSTANCE, new C1759330vsp(interfaceC1759360vss, jediViewModel, this, c1759590vtF, null));
            }
        } else if (jediViewModel instanceof PdpViewModel) {
            jediViewModel.setState(new AwS605S0100000_26(c1759590vtF, 19));
        } else if (jediViewModel instanceof SeaPdpViewModel) {
            jediViewModel.setState(new AwS605S0100000_26(c1759590vtF, 20));
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1759370vst.class, null), "");
    }
}
