package X;

import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798210wtX {
    public final n LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1798210wtX)) {
            return false;
        }
        C1798210wtX c1798210wtX = (C1798210wtX) obj;
        return Intrinsics.LJFF(this.LIZ, c1798210wtX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1798210wtX.LIZIZ);
    }

    public final int hashCode() {
        n nVar = this.LIZ;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishableLocationControlConfig(config=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", invalidReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1798210wtX(n nVar, String str) {
        this.LIZ = nVar;
        this.LIZIZ = str;
    }
}
