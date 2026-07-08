package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZY {
    public static final C07ZY LIZJ = new C07ZY(C2097608Jq.LJ(), C08CX.INSTANCE);
    public final Map<String, String> LIZ;
    public final Set<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07ZY)) {
            return false;
        }
        C07ZY c07zy = (C07ZY) obj;
        return Intrinsics.LJFF(this.LIZ, c07zy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07zy.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalExtDelta(puts=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", removes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07ZY(Map<String, String> map, Set<String> set) {
        this.LIZ = map;
        this.LIZIZ = set;
    }
}
