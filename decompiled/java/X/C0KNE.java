package X;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KNE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KNE {
    public final HashMap<String, Object> LIZ;
    public final Map<String, String> LIZIZ;
    public long LIZJ;

    public C0KNE() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KNE)) {
            return false;
        }
        C0KNE c0kne = (C0KNE) obj;
        return Intrinsics.LJFF(this.LIZ, c0kne.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0kne.LIZIZ) && this.LIZJ == c0kne.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PurchaseParams(logMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", extRequestParamMap=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", createOrderStartTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KNE(Object obj) {
        HashMap<String, Object> map = new HashMap<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = map;
        this.LIZIZ = linkedHashMap;
        this.LIZJ = 0L;
    }
}
