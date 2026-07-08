package X;

import Y.ARunnableS87S0200000_18;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: X.0gN4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1163040gN4 {
    public abstract String LIZ();

    public abstract Map<String, Object> LIZIZ(Map<String, ? extends Object> map);

    public final void LIZJ(Map<String, ? extends Object> map) {
        if (((Boolean) C279360AxC.LIZ.getValue()).booleanValue()) {
            C1168270gVV.LIZ.getClass();
            ((ScheduledExecutorService) C1168270gVV.LJFF.getValue()).execute(new ARunnableS87S0200000_18(this, map, 21));
            return;
        }
        C1168270gVV.LIZ.getClass();
        InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
        if (interfaceC1168280gVW == null) {
            return;
        }
        String strLIZ = LIZ();
        Map<String, ? extends Object> mapLIZIZ = LIZIZ(map);
        if (mapLIZIZ == null) {
            mapLIZIZ = C2097608Jq.LJ();
        }
        interfaceC1168280gVW.LIZ(strLIZ, mapLIZIZ);
    }
}
