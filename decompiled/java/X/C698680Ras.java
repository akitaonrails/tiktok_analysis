package X;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ras, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698680Ras {
    public static final /* synthetic */ int LJ = 0;
    public final List<String> LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final String LIZ() {
        Map<String, Object> map = this.LIZLLL;
        Object obj = map != null ? map.get("aweme_id") : null;
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{'aid':");
        sbLIZ.append(LIZ());
        sbLIZ.append(", 'timing':");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" 'source':");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" }");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C698680Ras(List list, List list2, String str, Map map) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = str;
        this.LIZLLL = map;
    }
}
