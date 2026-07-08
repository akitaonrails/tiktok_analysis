package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0shS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636960shS {
    public String LIZ = "";
    public String LIZIZ = "";
    public final Map<String, String> LIZJ = new LinkedHashMap();

    public final String toString() {
        StringBuilder sb = new StringBuilder("ICreateTabFillScreenAdapter.ShowParams(");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("eventName = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("hashKey = ");
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append(", ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("eventValueMap = ");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(this.LIZJ);
        sbLIZ3.append(linkedHashMap);
        sbLIZ3.append(", ");
        sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        sb.append(")");
        return sb.toString();
    }
}
