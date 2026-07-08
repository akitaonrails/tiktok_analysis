package X;

import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.List;

/* JADX INFO: renamed from: X.0ogt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482850ogt extends AbstractC1483700oiG {
    public String LIZLLL;

    @Override // X.AbstractC1483700oiG
    public final boolean LJIIL() {
        return true;
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJ(InterfaceC1479620obg interfaceC1479620obg) {
        if (interfaceC1479620obg != null) {
            interfaceC1479620obg.LJIIJ();
            SimRadar.keyScan("PlayerImpl", "play", null, interfaceC1479620obg.getKey());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VIDEO@");
            sbLIZ.append(interfaceC1479620obg.getKey());
            SimRadar.traceGroup(C2188811AlT.LIZIZ(sbLIZ)).LIZIZ("Play");
            String str = this.LIZLLL;
            if (str != null) {
                InterfaceC1472180oPg interfaceC1472180oPgTraceGroup = SimRadar.traceGroup(str);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Play:");
                interfaceC1479620obg.LJIIJ();
                sbLIZ2.append((String) null);
                interfaceC1472180oPgTraceGroup.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJJII(String str) {
        String str2 = this.LIZLLL;
        if (str2 != null) {
            SimRadar.traceGroup(str2).LIZIZ("clearPlayList");
        }
        this.LIZLLL = null;
        SimRadar.keyScan("PlayerImpl", "clearPlayList", "sceneID", str);
    }

    @Override // X.AbstractC1483700oiG, X.InterfaceC1483720oiI
    public final void LJIIIIZZ(String str, List<InterfaceC1479620obg> list) {
        this.LIZLLL = str;
        if (str != null) {
            SimRadar.traceGroup(str).LIZIZ("setPlayList");
        }
        if (list != null) {
            SimRadar.keyScan("PlayerImpl", "setPlayList", "sceneID", str, "size", Integer.valueOf(list.size()));
        }
    }
}
