package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04x0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1263604x0 {
    public final boolean LIZ;
    public final Set<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263604x0)) {
            return false;
        }
        C1263604x0 c1263604x0 = (C1263604x0) obj;
        return this.LIZ == c1263604x0.LIZ && Intrinsics.LJFF(this.LIZIZ, c1263604x0.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParsedAllowSetting(allowAll=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", allowedPages=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1263604x0(boolean z, Set<String> set) {
        this.LIZ = z;
        this.LIZIZ = set;
    }
}
