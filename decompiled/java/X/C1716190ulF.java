package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

/* JADX INFO: renamed from: X.0ulF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716190ulF extends AbstractC1716200ulG {
    public static InterfaceC1716210ulH LIZJ(String str) {
        InterfaceC1716210ulH interfaceC1716210ulH = (InterfaceC1716210ulH) C1909107dp.LIZJ(InterfaceC1716210ulH.class, null);
        interfaceC1716210ulH.setOutcome(str);
        return interfaceC1716210ulH;
    }

    public static InterfaceC1716210ulH LIZLLL(C1716240ulK c1716240ulK) {
        InterfaceC1716180ulE interfaceC1716180ulE;
        InterfaceC1716170ulD interfaceC1716170ulD = null;
        InterfaceC1716210ulH interfaceC1716210ulH = (InterfaceC1716210ulH) C1909107dp.LIZJ(InterfaceC1716210ulH.class, null);
        interfaceC1716210ulH.setOutcome(c1716240ulK.LIZ);
        interfaceC1716210ulH.setCardNumber(c1716240ulK.LIZIZ);
        interfaceC1716210ulH.setExpireDate(c1716240ulK.LIZJ);
        interfaceC1716210ulH.setCardholderName(c1716240ulK.LIZLLL);
        C1716230ulJ c1716230ulJ = c1716240ulK.LJ;
        if (c1716230ulJ != null) {
            interfaceC1716180ulE = (InterfaceC1716180ulE) C1909107dp.LIZJ(InterfaceC1716180ulE.class, null);
            interfaceC1716180ulE.setFrontImage(c1716230ulJ.LIZ);
            interfaceC1716180ulE.setFrontImageMasked(c1716230ulJ.LIZIZ);
            interfaceC1716180ulE.setFraud(c1716230ulJ.LIZJ);
            interfaceC1716180ulE.setPhotocopy(c1716230ulJ.LIZLLL);
            interfaceC1716180ulE.setPhotocopyScore(c1716230ulJ.LJ);
            interfaceC1716180ulE.setScreen(c1716230ulJ.LJFF);
            interfaceC1716180ulE.setScreenScore(c1716230ulJ.LJI);
        } else {
            interfaceC1716180ulE = null;
        }
        interfaceC1716210ulH.setFrontCard(interfaceC1716180ulE);
        C1716230ulJ c1716230ulJ2 = c1716240ulK.LJFF;
        if (c1716230ulJ2 != null) {
            interfaceC1716170ulD = (InterfaceC1716170ulD) C1909107dp.LIZJ(InterfaceC1716170ulD.class, null);
            interfaceC1716170ulD.setBackImage(c1716230ulJ2.LIZ);
            interfaceC1716170ulD.setBackImageMasked(c1716230ulJ2.LIZIZ);
            interfaceC1716170ulD.setFraud(c1716230ulJ2.LIZJ);
            interfaceC1716170ulD.setPhotocopy(c1716230ulJ2.LIZLLL);
            interfaceC1716170ulD.setPhotocopyScore(c1716230ulJ2.LJ);
            interfaceC1716170ulD.setScreen(c1716230ulJ2.LJFF);
            interfaceC1716170ulD.setScreenScore(c1716230ulJ2.LJI);
        }
        interfaceC1716210ulH.setBackCard(interfaceC1716170ulD);
        return interfaceC1716210ulH;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C600960Nhe(completionBlock, this, (InterfaceC1716220ulI) xBaseParamModel, null), 2);
    }
}
