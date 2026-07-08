package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS472S0200000_2;

/* JADX INFO: renamed from: X.05pD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1470105pD extends AbstractC1469605p8 {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        ISeaPdpCommunicationService iSeaPdpCommunicationService;
        InterfaceC1469805pA interfaceC1469805pA = (InterfaceC1469805pA) xBaseParamModel;
        if (interfaceC1469805pA.getName().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, 0, "empty event name", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null) {
            C2382909Vj.LIZ(completionBlock, 0, "bridge context is empty", null, 4);
            return;
        }
        C1757320vpa c1757320vpa = (C1757320vpa) interfaceC634840OvC.LIZIZ(C1757320vpa.class);
        PdpViewModel pdpViewModel = (PdpViewModel) interfaceC634840OvC.LIZIZ(PdpViewModel.class);
        InterfaceC599480NfG interfaceC599480NfG = (InterfaceC599480NfG) interfaceC634840OvC.LIZIZ(InterfaceC599480NfG.class);
        if (c1757320vpa != null) {
            WeakReference<ISeaPdpCommunicationService> weakReference = c1757320vpa.LIZLLL;
            if (weakReference == null || (iSeaPdpCommunicationService = weakReference.get()) == null) {
                return;
            }
            iSeaPdpCommunicationService.hc1(interfaceC1469805pA.getName(), interfaceC1469805pA.getData(), c1757320vpa, new AwS472S0200000_2(completionBlock, (CompletionBlock<InterfaceC1469505p7>) this, (C1470105pD) 0));
            return;
        }
        if (pdpViewModel != null) {
            pdpViewModel.LLIZLLLIL.LIZLLL(interfaceC1469805pA.getName(), interfaceC1469805pA.getData(), null, new InterfaceC599180Nem() { // from class: X.05p4
                @Override // X.InterfaceC599180Nem
                public final void LIZ(C1470005pC c1470005pC) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1469105p3(completionBlock, c1470005pC, null), 3);
                }

                @Override // X.InterfaceC599180Nem
                public final void LIZIZ(C1470305pF c1470305pF) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1469305p5(completionBlock, this, c1470305pF, null), 3);
                }
            });
        } else if (interfaceC599480NfG != null) {
            interfaceC599480NfG.LIZLLL(interfaceC1469805pA.getName(), interfaceC1469805pA.getData(), null, new InterfaceC599180Nem() { // from class: X.05p4
                @Override // X.InterfaceC599180Nem
                public final void LIZ(C1470005pC c1470005pC) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1469105p3(completionBlock, c1470005pC, null), 3);
                }

                @Override // X.InterfaceC599180Nem
                public final void LIZIZ(C1470305pF c1470305pF) {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1469305p5(completionBlock, this, c1470305pF, null), 3);
                }
            });
        } else {
            C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_CROSS_MODULE_COMMUNICATION_ERROR, new RuntimeException("lack region context"), null);
            C2382909Vj.LIZ(completionBlock, 0, "lack region context", null, 4);
        }
    }
}
