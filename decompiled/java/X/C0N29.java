package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N29, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N29 implements C0N28 {
    public final String LIZ = "general_search_outflow";
    public final String LIZIZ = "general_search";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0N29)) {
            return false;
        }
        C0N29 c0n29 = (C0N29) obj;
        return Intrinsics.LJFF(this.LIZ, c0n29.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0n29.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MeasurementSceneInOutFlow(outflowType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inflowType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
