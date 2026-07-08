package X;

import java.util.HashMap;

/* JADX INFO: renamed from: X.01kS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C421401kS {
    public final HashMap<String, InterfaceC420801kM> LIZ = new HashMap<>();
    public final HashMap<String, InterfaceC420801kM> LIZIZ = new HashMap<>();
    public final HashMap<String, Long> LIZJ = new HashMap<>();

    public final void LIZ(String str) {
        InterfaceC420801kM interfaceC420801kM = this.LIZIZ.get(str);
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
            this.LIZIZ.remove(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cancelRemoveMaskUiTimer, linkMicId = ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("TimerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZJ.remove(str);
    }

    public final void LIZIZ(String str) {
        InterfaceC420801kM interfaceC420801kM = this.LIZ.get(str);
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
            this.LIZ.remove(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("has remove timer, linkMicId = ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("TimerManager", C2188811AlT.LIZIZ(sbLIZ));
        }
    }
}
