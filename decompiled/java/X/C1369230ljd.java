package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ljd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1369230ljd implements InterfaceC1367540lgu {
    public static final /* synthetic */ int LIZJ = 0;
    public final String LIZ;
    public final Map<String, Object> LIZIZ;

    @Override // X.InterfaceC1367540lgu
    public final Map<String, Object> LIZIZ() {
        return C2097608Jq.LJIIL(C2097908Jt.LIZJ(new Pair("type", "share_panel_relation_search")), this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelSearchDebugMatcher(");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1367540lgu
    public final Map<String, Object> getEventTracking() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1367540lgu
    public final C1369340ljo LIZ(String str, String str2) {
        return C1369240lje.LIZ.LIZ(str, str2);
    }

    public C1369230ljd(String str, String str2, String str3, String str4, int i) {
        String strLJJLIIIJ;
        if (Intrinsics.LJFF(str, "relation")) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(C1697810uHb.LJIIJJI("relation", String.valueOf(i)), "|", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(C13LQ.LJIJI(new String[]{str, str2, str3, str4, String.valueOf(i)}), "|", null, null, 0, null, null, 62);
        }
        this.LIZ = strLJJLIIIJ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("search_source", str), new Pair("debug_label", strLJJLIIIJ), new Pair("affinity_score", Integer.valueOf(i)));
        if (str2 != null) {
            mapLJIIJ.put("relation", str2);
        }
        if (str3 != null) {
            mapLJIIJ.put("match_type", str3);
        }
        if (str4 != null) {
            mapLJIIJ.put("match_string", str4);
        }
        this.LIZIZ = C2097608Jq.LJIIZILJ(mapLJIIJ);
    }
}
