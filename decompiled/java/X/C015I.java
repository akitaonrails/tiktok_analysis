package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.015I, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C015I extends C015J {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C015I)) {
            return false;
        }
        C015I c015i = (C015I) obj;
        return Intrinsics.LJFF(this.LIZ, c015i.LIZ) && Intrinsics.LJFF(this.LIZIZ, c015i.LIZIZ) && this.LIZJ == c015i.LIZJ && this.LIZLLL == c015i.LIZLLL && Intrinsics.LJFF(this.LJ, c015i.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        String str = this.LJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ModelUsage(engineName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", modelName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", success=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final Pair<String, Map<String, String>> LIZ(Map<String, String> map) {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("engine", this.LIZ);
        pairArr[1] = new Pair("model", this.LIZIZ);
        pairArr[2] = new Pair("duration", String.valueOf(this.LIZJ));
        pairArr[3] = new Pair("success", String.valueOf(this.LIZLLL));
        String str = this.LJ;
        if (str == null) {
            str = "";
        }
        pairArr[4] = new Pair("message", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        if (map == null) {
            map = C2097608Jq.LJ();
        }
        return new Pair<>("device_llm_model_metric", C2097608Jq.LJIIL(mapLJIIIIZZ, map));
    }

    public C015I(long j, String str, boolean z, String str2, String str3) {
        super(0);
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = str3;
    }
}
