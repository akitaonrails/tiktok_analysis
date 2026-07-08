package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0gqL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181190gqL {
    public final Map<String, C1181200gqM> LIZ;
    public final Map<String, List<C1180920gpu>> LIZIZ;
    public final Map<String, C1180920gpu> LIZJ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlashPageData(treeMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", containerComponentMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", attachedData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<C1180920gpu> LIZ() {
        return this.LIZIZ.get("body");
    }

    public /* synthetic */ C1181190gqL(Map map, Map map2) {
        this(map, map2, new LinkedHashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1181190gqL(Map<String, C1181200gqM> map, Map<String, ? extends List<C1180920gpu>> map2, Map<String, C1180920gpu> map3) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = map3;
    }
}
