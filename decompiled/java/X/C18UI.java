package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18UI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18UI {
    public final String LIZ;
    public final C21288318Sr LIZIZ;
    public final Map<String, Integer> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18UI)) {
            return false;
        }
        C18UI c18ui = (C18UI) obj;
        return Intrinsics.LJFF(this.LIZ, c18ui.LIZ) && Intrinsics.LJFF(this.LIZIZ, c18ui.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c18ui.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        Map<String, Integer> map = this.LIZJ;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputSessionData(uuid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panelData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imageOpsLog=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C18UI(C21288318Sr c21288318Sr, Map map) {
        String strLIZ = C1017903yT.LIZ();
        strLIZ.toString();
        this(c21288318Sr, strLIZ, map);
    }

    public C18UI(C21288318Sr c21288318Sr, String str, Map map) {
        this.LIZ = str;
        this.LIZIZ = c21288318Sr;
        this.LIZJ = map;
    }
}
