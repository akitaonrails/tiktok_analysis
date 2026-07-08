package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1091480eVe {
    public final Map<Integer, C1129390fUn> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1091480eVe) && Intrinsics.LJFF(this.LIZ, ((C1091480eVe) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelSnapshot(tabs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1091480eVe(Map<Integer, C1129390fUn> map) {
        this.LIZ = map;
    }

    public final C1129390fUn LIZ(int i) {
        return this.LIZ.get(Integer.valueOf(i));
    }
}
