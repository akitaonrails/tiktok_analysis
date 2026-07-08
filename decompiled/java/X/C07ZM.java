package X;

import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZM {
    public final Set<String> LIZ;
    public final Map<String, C07ZM> LIZIZ;
    public final C07ZM LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07ZM)) {
            return false;
        }
        C07ZM c07zm = (C07ZM) obj;
        return Intrinsics.LJFF(this.LIZ, c07zm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07zm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c07zm.LIZJ) && this.LIZLLL == c07zm.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C07ZM c07zm = this.LIZJ;
        int iHashCode2 = (iHashCode + (c07zm == null ? 0 : c07zm.hashCode())) * 31;
        boolean z = this.LIZLLL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return iHashCode2 + r0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BlockPoint(blockKeyNameList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", blockKeyNameSubPointDict=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", arrayItemPoint=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", killSelf=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07ZM(Set<String> set, Map<String, C07ZM> map, C07ZM c07zm, boolean z) {
        this.LIZ = set;
        this.LIZIZ = map;
        this.LIZJ = c07zm;
        this.LIZLLL = z;
    }
}
