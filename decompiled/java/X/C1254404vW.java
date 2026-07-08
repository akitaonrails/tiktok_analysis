package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04vW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1254404vW extends AbstractC1254204vU {
    public final Map<String, Object> LIZ;
    public final Map<String, Object> LIZIZ;
    public final String LIZJ;

    public C1254404vW() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1254404vW)) {
            return false;
        }
        C1254404vW c1254404vW = (C1254404vW) obj;
        return Intrinsics.LJFF(this.LIZ, c1254404vW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1254404vW.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1254404vW.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReportResponseTraffic(networkInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", featureInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", stackName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1254404vW(Map map, Map map2) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = "ttnet";
    }
}
