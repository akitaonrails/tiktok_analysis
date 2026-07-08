package X;

import java.util.LinkedList;

/* JADX INFO: renamed from: X.0ItE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C480740ItE {
    public final LinkedList<InterfaceC480510Isr> LIZ = new LinkedList<>();

    public final int LIZIZ() {
        int i = 0;
        for (InterfaceC480510Isr interfaceC480510Isr : this.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cache player index= ");
            sbLIZ.append(i);
            sbLIZ.append(", item = ");
            sbLIZ.append(interfaceC480510Isr.hashCode());
            C827750WdZ.LIZ("LivePlayControllerManager_RecyclerPlayerPool", C2188811AlT.LIZIZ(sbLIZ));
            i++;
        }
        return this.LIZ.size();
    }

    public void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clear -> clear pool player, count=");
        sbLIZ.append(LIZIZ());
        C827750WdZ.LIZ("LivePlayControllerManager_RecyclerPlayerPool", C2188811AlT.LIZIZ(sbLIZ));
        for (InterfaceC480510Isr interfaceC480510Isr : this.LIZ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("clear -> clear player ");
            sbLIZ2.append(interfaceC480510Isr.hashCode());
            C827750WdZ.LIZ("LivePlayControllerManager_RecyclerPlayerPool", C2188811AlT.LIZIZ(sbLIZ2));
            interfaceC480510Isr.LJJIJLIJ();
        }
        this.LIZ.clear();
    }

    public void LIZJ(InterfaceC480510Isr interfaceC480510Isr) {
        LinkedList<InterfaceC480510Isr> linkedList = this.LIZ;
        if (linkedList.size() < 2) {
            linkedList = null;
        }
        if (linkedList != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("putRecycledPlayer:");
            sbLIZ.append(interfaceC480510Isr.hashCode());
            sbLIZ.append(" -> over size");
            C827750WdZ.LIZ("LivePlayControllerManager_RecyclerPlayerPool", C2188811AlT.LIZIZ(sbLIZ));
            interfaceC480510Isr.LJJIJLIJ();
            return;
        }
        this.LIZ.push(interfaceC480510Isr);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("putRecycledPlayer -> ");
        sbLIZ2.append(interfaceC480510Isr.hashCode());
        sbLIZ2.append(" count=");
        sbLIZ2.append(LIZIZ());
        C827750WdZ.LIZ("LivePlayControllerManager_RecyclerPlayerPool", C2188811AlT.LIZIZ(sbLIZ2));
    }
}
