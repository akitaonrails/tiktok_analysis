package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020860cfk {
    public final C1020840cfi LIZ;
    public final JSONObject LIZIZ;
    public final Map<Integer, C1020850cfj> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1020860cfk)) {
            return false;
        }
        C1020860cfk c1020860cfk = (C1020860cfk) obj;
        return Intrinsics.LJFF(this.LIZ, c1020860cfk.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1020860cfk.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1020860cfk.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UgenOneBigThreeSmallRuntimeSnapshot(renderSnapshot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", payload=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", slotStates=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1020860cfk(C1020840cfi c1020840cfi, JSONObject jSONObject, Map<Integer, C1020850cfj> map) {
        this.LIZ = c1020840cfi;
        this.LIZIZ = jSONObject;
        this.LIZJ = map;
    }
}
