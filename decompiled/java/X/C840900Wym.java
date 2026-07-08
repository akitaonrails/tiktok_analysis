package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wym, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840900Wym {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;
    public final Map<String, Object> LIZJ;
    public final Map<String, Object> LIZLLL;

    public C840900Wym() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C840900Wym)) {
            return false;
        }
        C840900Wym c840900Wym = (C840900Wym) obj;
        return Intrinsics.LJFF(this.LIZ, c840900Wym.LIZ) && Intrinsics.LJFF(this.LIZIZ, c840900Wym.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c840900Wym.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c840900Wym.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkReportPayload(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", categories=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", metrics=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extras=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C840900Wym(int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        this.LIZ = "pns_network";
        this.LIZIZ = linkedHashMap;
        this.LIZJ = linkedHashMap2;
        this.LIZLLL = linkedHashMap3;
    }
}
