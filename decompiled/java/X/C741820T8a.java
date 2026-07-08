package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0T8a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741820T8a implements InterfaceC468940IaC {
    public final Map<String, C0IS1> LIZ = new ConcurrentHashMap();

    @Override // X.InterfaceC468940IaC
    public final <T> C0IS1<T> LIZ(String str) {
        return (C0IS1) ((ConcurrentHashMap) this.LIZ).get(str);
    }

    @Override // X.InterfaceC468940IaC
    public final <T> C0IS1<T> LIZIZ(C0IS3 c0is3) {
        C0IS1<T> c0is1 = (C0IS1) ((ConcurrentHashMap) this.LIZ).get(c0is3.LIZ);
        if (c0is1 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SceneStrategyService create scene:");
            sbLIZ.append(c0is3.LIZ);
            sbLIZ.append(", already created before, return. ");
            C2188811AlT.LIZIZ(sbLIZ);
            return c0is1;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SceneStrategyService create scene:");
        sbLIZ2.append(c0is3.LIZ);
        sbLIZ2.append(", already exist scenes are:");
        sbLIZ2.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1483170ohP c1483170ohP = new C1483170ohP(c0is3);
        c1483170ohP.LIZLLL = this;
        ((ConcurrentHashMap) this.LIZ).put(c0is3.LIZ, c1483170ohP);
        return c1483170ohP;
    }
}
