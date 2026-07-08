package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0WLo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C821780WLo {
    public static C04PY LIZJ;
    public final InterfaceC821860WLw LIZ;
    public final Map<String, Object> LIZIZ;

    public final String toString() {
        String strLIZIZ = "data:{";
        for (Map.Entry<String, Object> entry : this.LIZIZ.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(entry.getKey());
            sbLIZ.append(':');
            sbLIZ.append(entry.getValue());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append('}');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('{');
        sbLIZ3.append(this.LIZ);
        sbLIZ3.append("; ");
        sbLIZ3.append(strLIZIZ2);
        sbLIZ3.append('}');
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public /* synthetic */ C821780WLo(InterfaceC821860WLw interfaceC821860WLw) {
        this(interfaceC821860WLw, new LinkedHashMap());
    }

    public C821780WLo(InterfaceC821860WLw interfaceC821860WLw, Map<String, Object> map) {
        this.LIZ = interfaceC821860WLw;
        this.LIZIZ = map;
    }
}
