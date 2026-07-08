package X;

import com.ss.android.ugc.aweme.ad.preload.prewarm.LandPageWarmExperiment;
import com.ss.android.ugc.aweme.ad.preload.prewarm.LandPageWarmV2Experiment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0d5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1037030d5p extends C09AY implements Function0<List<InterfaceC1037120d5y>> {
    public C1037030d5p() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<InterfaceC1037120d5y> invoke() {
        ArrayList arrayList = new ArrayList();
        if (LandPageWarmV2Experiment.LIZ().enablePreWarmClass) {
            arrayList.add(new InterfaceC1037120d5y() { // from class: X.0cBi
                public boolean LIZ;

                @Override // X.InterfaceC1037120d5y
                public final String getTag() {
                    return "IABPreWarm_PreloadClass";
                }

                public final String toString() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("IABPreWarmClassTask(hasPreload=");
                    sbLIZ.append(this.LIZ);
                    sbLIZ.append(')');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }

                @Override // X.InterfaceC1037120d5y
                public final C0CFU getType() {
                    return C0CFU.COMMON;
                }

                @Override // X.InterfaceC1037120d5y
                public final EnumC1002230cBh LIZ(C1037110d5x c1037110d5x) {
                    if (this.LIZ) {
                        return EnumC1002230cBh.DONE;
                    }
                    return EnumC1002230cBh.READY;
                }

                @Override // X.InterfaceC1037120d5y
                public final String LIZIZ(C1037110d5x c1037110d5x) {
                    if (this.LIZ) {
                        return "";
                    }
                    this.LIZ = true;
                    C1035940d44.LIZ.getClass();
                    C1035940d44.LIZIZ = true;
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05QL(this, null), 3);
                    return "IABPreWarm_PreloadClass";
                }
            });
        }
        if (((Boolean) LandPageWarmV2Experiment.LIZJ.getValue()).booleanValue() || ((Boolean) LandPageWarmV2Experiment.LIZLLL.getValue()).booleanValue()) {
            arrayList.add(C1043080dFa.LIZ);
        }
        C1037010d5n.LIZ.getClass();
        if (LandPageWarmExperiment.LIZIZ().enablePreWarmThirdParty) {
            arrayList.add(C1037010d5n.LIZ(true));
        }
        if (LandPageWarmExperiment.LIZIZ().enablePreWarmFirstParty) {
            arrayList.add(C1037010d5n.LIZ(false));
        }
        if (LandPageWarmV2Experiment.LIZ().enablePreWarmContainer) {
            C1037070d5t c1037070d5t = new C1037070d5t();
            C1037010d5n.LJFF = c1037070d5t;
            arrayList.add(c1037070d5t);
        }
        return arrayList;
    }
}
