package X;

import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageComponentStateConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1DXs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractC2257541DXs implements InterfaceC2257411DXf {
    public final AdOneStopLandingPageComponentStateConfig LIZ;
    public final C1DY3 LIZIZ;
    public InterfaceC2257521DXq LIZJ;
    public int LIZLLL;

    @Override // X.InterfaceC2257411DXf
    public final void cancel() {
        this.LIZIZ.cancel();
    }

    @Override // X.InterfaceC2257411DXf
    public final void LIZIZ(InterfaceC2257521DXq interfaceC2257521DXq) {
        this.LIZJ = interfaceC2257521DXq;
    }

    @Override // X.InterfaceC2257411DXf
    public final void LIZJ(AbstractC1039890dAR abstractC1039890dAR) {
        final String strLIZIZ;
        if (abstractC1039890dAR instanceof C1040000dAc) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pct");
            sbLIZ.append((((C1040000dAc) abstractC1039890dAR).LIZIZ / 10) * 10);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = abstractC1039890dAR.LIZ;
        }
        this.LIZIZ.LIZ(new C1DY2() { // from class: X.1DXr
            @Override // X.C1DY2
            public final void LIZ() {
                AbstractC2257541DXs abstractC2257541DXs = this.LIZ;
                InterfaceC2257521DXq interfaceC2257521DXq = abstractC2257541DXs.LIZJ;
                if (interfaceC2257521DXq != null) {
                    interfaceC2257521DXq.LIZJ(strLIZIZ, abstractC2257541DXs.LIZ());
                }
            }

            @Override // X.C1DY2
            public final void LIZIZ() {
                AbstractC2257541DXs abstractC2257541DXs = this.LIZ;
                InterfaceC2257521DXq interfaceC2257521DXq = abstractC2257541DXs.LIZJ;
                if (interfaceC2257521DXq != null) {
                    interfaceC2257521DXq.LIZIZ(abstractC2257541DXs.LIZ());
                }
            }

            @Override // X.C1DY2
            public final void LIZJ() {
                AbstractC2257541DXs abstractC2257541DXs = this.LIZ;
                InterfaceC2257521DXq interfaceC2257521DXq = abstractC2257541DXs.LIZJ;
                if (interfaceC2257521DXq != null) {
                    interfaceC2257521DXq.LIZLLL(abstractC2257541DXs.LIZ());
                }
            }
        });
        this.LIZIZ.start();
    }

    @Override // X.InterfaceC2257411DXf
    public final boolean LIZLLL(AbstractC1039890dAR abstractC1039890dAR) {
        List<String> triggers;
        Integer numLJIIJJI;
        Integer numValueOf;
        int i = C1781630wSn.LIZ[LIZ().ordinal()];
        if (i != 1) {
            if (i == 2 && ((abstractC1039890dAR instanceof C1039990dAb) || (abstractC1039890dAR instanceof C1039980dAa))) {
                return true;
            }
        } else if (abstractC1039890dAR instanceof C1040010dAd) {
            return true;
        }
        if (abstractC1039890dAR instanceof C1039970dAZ) {
            List<String> triggers2 = this.LIZ.getTriggers();
            if (triggers2 == null || !triggers2.contains("fcp")) {
                return false;
            }
        } else {
            if (!(abstractC1039890dAR instanceof C1040000dAc)) {
                return false;
            }
            int i2 = this.LIZLLL;
            int i3 = ((C1040000dAc) abstractC1039890dAR).LIZIZ;
            this.LIZLLL = i3;
            if (i2 >= i3 || (triggers = this.LIZ.getTriggers()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : triggers) {
                if (u.LJJIIJZLJL(str, "pct", false) && (numLJIIJJI = C2095008Iq.LJIIJJI(a0.LJJJJZ("pct", str))) != null && (numValueOf = Integer.valueOf(numLJIIJJI.intValue())) != null) {
                    arrayList.add(numValueOf);
                }
            }
            if (!(!arrayList.isEmpty())) {
                return false;
            }
            for (Object obj : arrayList) {
                int iIntValue = ((Number) obj).intValue();
                if (i2 < iIntValue && i3 >= iIntValue) {
                    if (obj == null) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public AbstractC2257541DXs(AdOneStopLandingPageComponentStateConfig adOneStopLandingPageComponentStateConfig, C2257611DXz c2257611DXz) {
        this.LIZ = adOneStopLandingPageComponentStateConfig;
        this.LIZIZ = c2257611DXz;
    }
}
