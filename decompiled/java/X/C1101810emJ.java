package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0emJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1101810emJ {
    public final InterfaceC1102010emd LIZ;
    public final Map<AbstractC1101760emE, AbstractC1098520eh0> LIZIZ = new LinkedHashMap();

    public C1101810emJ(InterfaceC1102010emd interfaceC1102010emd) {
        this.LIZ = interfaceC1102010emd;
    }

    public final void LIZ(DataChannel dataChannel, AbstractC1101760emE abstractC1101760emE, InterfaceC1101980ema interfaceC1101980ema) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show touch: ");
        sbLIZ.append(abstractC1101760emE.LJIILL());
        C20441214yg.LIZIZ("PreviewCardShowManager", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1102010emd interfaceC1102010emd = this.LIZ;
        if (interfaceC1102010emd != null) {
            interfaceC1102010emd.O0(abstractC1101760emE, new C1101840emM(interfaceC1101980ema, abstractC1101760emE, this, dataChannel));
        }
    }
}
