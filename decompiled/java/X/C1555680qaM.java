package X;

import androidx.fragment.app.Fragment;
import java.util.Map;

/* JADX INFO: renamed from: X.0qaM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1555680qaM {
    public final C1738340vKy LIZ;
    public final Fragment LIZIZ;
    public final Map<String, Integer> LIZJ;
    public final InterfaceC1555690qaN LIZLLL;
    public final InterfaceC1555700qaO LJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AMERouterHandleInput(argsData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", host=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", actionKeys=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", callback=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", tabEventSender=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1555680qaM(C1738340vKy c1738340vKy, Fragment fragment, Map<String, Integer> map, InterfaceC1555690qaN interfaceC1555690qaN, InterfaceC1555700qaO interfaceC1555700qaO) {
        this.LIZ = c1738340vKy;
        this.LIZIZ = fragment;
        this.LIZJ = map;
        this.LIZLLL = interfaceC1555690qaN;
        this.LJ = interfaceC1555700qaO;
    }
}
