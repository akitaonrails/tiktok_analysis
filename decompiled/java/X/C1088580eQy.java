package X;

import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livestrategy.ILiveFeatureCenterService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0eQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1088580eQy extends AbstractC467020ITc {
    public final DataChannel LIZ;
    public Pair<? extends InterfaceC1100800ekg, C1101180elI> LIZJ;
    public final List<InterfaceC1088570eQx<Pair<InterfaceC1100800ekg, C1101180elI>>> LIZIZ = new ArrayList();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(395));

    public C1088580eQy(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.AbstractC467020ITc, X.InterfaceC1101120elC
    public final void LJIIIZ(InterfaceC1100800ekg interfaceC1100800ekg) {
        boolean z;
        C1101180elI c1101180elI;
        C1100750ekb c1100750ekbJM;
        long jLongValue = InterfaceC1094160eZy.e2.LIZIZ().longValue();
        if (jLongValue != 0 && System.currentTimeMillis() - jLongValue < ((Number) this.LIZLLL.getValue()).longValue()) {
            z = true;
        } else {
            z = false;
        }
        if (z && (c1100750ekbJM = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).jM()) != null) {
            c1101180elI = c1100750ekbJM.LIZ;
        } else {
            c1101180elI = null;
        }
        Pair<? extends InterfaceC1100800ekg, C1101180elI> pair = new Pair<>(interfaceC1100800ekg, c1101180elI);
        this.LIZJ = pair;
        Iterator it2 = ((ArrayList) this.LIZIZ).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1088570eQx) it2.next()).LIZJ(pair);
        }
    }

    @Override // X.AbstractC467020ITc, X.InterfaceC1101120elC
    public final void LIZJ(InterfaceC1100800ekg interfaceC1100800ekg, C1100750ekb c1100750ekb) {
        Pair<? extends InterfaceC1100800ekg, C1101180elI> pair = new Pair<>(interfaceC1100800ekg, c1100750ekb.LIZJ);
        for (InterfaceC1088570eQx interfaceC1088570eQx : (ArrayList) this.LIZIZ) {
            this.LIZJ = pair;
            interfaceC1088570eQx.LIZJ(pair);
        }
        InterfaceC1094160eZy.e2.LJFF(Long.valueOf(System.currentTimeMillis()));
        C0J0Q c0j0q = C0J0Q.LIVE;
        if (C500260Jjc.LJIIZILJ(this.LIZ)) {
            c0j0q = C0J0Q.ANCHOR;
        }
        C1101180elI c1101180elI = c1100750ekb.LIZJ;
        if (c1101180elI != null) {
            ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).MG1(c0j0q, "totalScore", String.valueOf(c1101180elI.LIZIZ));
            ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).zG1(c0j0q, "realtime_performance_score", String.valueOf(c1101180elI.LIZIZ), "performance");
            ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).MG1(c0j0q, "itemScores", c1101180elI.LIZJ.toString());
            ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).MG1(c0j0q, "deviceScore", String.valueOf(c1101180elI.LIZ));
            ((ILiveFeatureCenterService) C1161920gLG.LIZJ(ILiveFeatureCenterService.class)).MG1(c0j0q, "level", c1101180elI.LIZLLL.toString());
        }
    }
}
