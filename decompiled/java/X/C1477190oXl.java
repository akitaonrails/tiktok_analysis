package X;

import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1477190oXl implements InterfaceC1477240oXq {
    public static final C1477190oXl LIZIZ = new C1477190oXl();

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ C1477210oXn LIZ(C1477250oXr c1477250oXr) {
        return C1477960oZ0.LIZ(c1477250oXr);
    }

    @Override // X.InterfaceC1477240oXq
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ C1477210oXn LIZJ(InterfaceC1477990oZ3 interfaceC1477990oZ3) {
        return C1477960oZ0.LIZIZ(interfaceC1477990oZ3);
    }

    @Override // X.InterfaceC1477240oXq
    public final String getName() {
        return "PreferredResolutionHook";
    }

    @Override // X.InterfaceC1477240oXq
    public final /* synthetic */ boolean isValid() {
        return true;
    }

    @Override // X.InterfaceC1477240oXq
    public final C1477210oXn LIZLLL(C1477250oXr c1477250oXr) {
        SimVideoUrlModel simVideoUrlModel;
        List<SimBitRate> bitRate;
        Boolean boolValueOf;
        C1477270oXt c1477270oXt = c1477250oXr.LIZIZ;
        if (c1477270oXt != null && (simVideoUrlModel = c1477270oXt.LIZ) != null) {
            if (simVideoUrlModel.getPreferredResolution() != null && simVideoUrlModel.getPreferredResolution().getResolutionInt() != 0 && (bitRate = simVideoUrlModel.getBitRate()) != null && !bitRate.isEmpty()) {
                String strValueOf = String.valueOf(simVideoUrlModel.getPreferredResolution().getResolutionInt());
                List<SimBitRate> bitRate2 = simVideoUrlModel.getBitRate();
                if (bitRate2 != null) {
                    for (SimBitRate simBitRate : bitRate2) {
                        if (a0.LJJIIZI(simBitRate.getGearName(), strValueOf, false)) {
                            C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
                            String sourceId = simVideoUrlModel.getSourceId();
                            C1476840oXC c1476840oXC = new C1476840oXC();
                            c1476840oXC.LL = simBitRate;
                            c1477400oY6.LJJIJLIJ(sourceId, c1476840oXC);
                            C1477190oXl c1477190oXl = LIZIZ;
                            List<String> urlList = simVideoUrlModel.getUrlList();
                            C1477270oXt c1477270oXt2 = c1477250oXr.LIZIZ;
                            if (c1477270oXt2 != null) {
                                boolValueOf = Boolean.valueOf(c1477270oXt2.LIZLLL);
                            } else {
                                boolValueOf = null;
                            }
                            return C1477150oXh.LIZ(c1477190oXl, urlList, simVideoUrlModel, simBitRate, boolValueOf);
                        }
                    }
                }
            } else {
                return c1477250oXr.LIZLLL(c1477250oXr.LIZIZ);
            }
        }
        return c1477250oXr.LIZLLL(c1477250oXr.LIZIZ);
    }
}
