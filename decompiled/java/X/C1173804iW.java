package X;

import java.util.Set;

/* JADX INFO: renamed from: X.04iW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1173804iW {
    public static boolean LIZIZ;
    public final Set<String> LIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventConfig{sampledService=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAllSample=");
        sbLIZ.append(false);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1173804iW(Set<String> set) {
        this.LIZ = set;
    }

    public final boolean LIZ(String str) {
        Set<String> set;
        if (LIZIZ || (set = this.LIZ) == null || !set.contains(str)) {
            return false;
        }
        return true;
    }
}
