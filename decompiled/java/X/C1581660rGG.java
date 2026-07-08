package X;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rGG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1581660rGG implements C15W0 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public int LJI;
    public String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1581660rGG)) {
            return false;
        }
        C1581660rGG c1581660rGG = (C1581660rGG) obj;
        return Intrinsics.LJFF(this.LIZ, c1581660rGG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1581660rGG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1581660rGG.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1581660rGG.LIZLLL) && Intrinsics.LJFF(this.LJ, c1581660rGG.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreEtDebugET(tabName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", methodName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", currentTabName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", currentBottomTabName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stacktrace=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1581660rGG() {
        this("", "", "", "", "");
    }

    @Override // X.C15W0
    public final Map<String, String> LIZ() {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab_name", this.LIZ);
        c2344009Gk.LJIIIIZZ("method_name", this.LIZIZ);
        c2344009Gk.LJIIIIZZ("current_tab_name", this.LIZJ);
        c2344009Gk.LJIIIIZZ("current_bottom_tab", this.LIZLLL);
        c2344009Gk.LJIIIIZZ("stacktrace", this.LJ);
        c2344009Gk.LJ(Boolean.valueOf(C1583440rJ8.LIZIZ()), "is_top_tab");
        c2344009Gk.LIZJ(this.LJI, "current_top_view_pager_index");
        c2344009Gk.LJIIIIZZ("current_bottom_tab_index", this.LJII);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1581650rGF.LIZ);
        sbLIZ.append(',');
        sbLIZ.append(C1581650rGF.LIZJ);
        sbLIZ.append(',');
        sbLIZ.append(C1581650rGF.LIZLLL);
        sbLIZ.append(',');
        sbLIZ.append(C1581650rGF.LJ);
        c2344009Gk.LJIIIIZZ("create_count", C2188811AlT.LIZIZ(sbLIZ));
        c2344009Gk.LJ(C1581650rGF.LIZIZ, "mf_child_fragments");
        Map<String, String> map = c2344009Gk.LIZ;
        if (Intrinsics.LJFF(this.LIZIZ, "onCreate")) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!Intrinsics.LJFF(str, "stacktrace")) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append(" = ");
                    sbLIZ2.append(str2);
                    sbLIZ2.append("; ");
                    sb.append(C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            C1581650rGF.LIZ(sb.toString());
        }
        return map;
    }

    @Override // X.C15W0
    public final String getEventName() {
        return this.LJFF;
    }

    public C1581660rGG(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = "explore_et_debug";
        this.LJI = -1;
        this.LJII = "";
    }
}
