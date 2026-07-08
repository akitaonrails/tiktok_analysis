package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: X.0khR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1329430khR implements InterfaceC1328250kfX {
    public final CopyOnWriteArraySet<InterfaceC1330800kje> LIZ = new CopyOnWriteArraySet<>();

    @Override // X.InterfaceC1328250kfX
    public final void LIZ(InterfaceC1330800kje interfaceC1330800kje) {
        if (interfaceC1330800kje != null) {
            this.LIZ.add(interfaceC1330800kje);
        }
    }

    public final void LIZIZ(EnumC1330650kjP enumC1330650kjP) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trimType=");
        sbLIZ.append(enumC1330650kjP);
        sbLIZ.append(", memoryTrimmableSet.size=");
        sbLIZ.append(this.LIZ.size());
        C1330590kjJ.LIZJ("FrescoMemoryTrimmableRegistry", "trimMemory", C2188811AlT.LIZIZ(sbLIZ));
        try {
            Iterator<InterfaceC1330800kje> it2 = this.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(enumC1330650kjP);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
