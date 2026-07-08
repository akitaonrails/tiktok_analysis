package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.096G, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C096G extends C096H {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Map<String, String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C096G)) {
            return false;
        }
        C096G c096g = (C096G) obj;
        return Intrinsics.LJFF(this.LIZ, c096g.LIZ) && this.LIZIZ == c096g.LIZIZ && Intrinsics.LJFF(this.LIZJ, c096g.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c096g.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31;
        Map<String, String> map = this.LIZLLL;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnFailure(urs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", code=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", msg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C096G(String str, int i) {
        this(i, "", str, null);
    }

    public C096G(int i, String str, String str2, Map map) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
        this.LIZLLL = map;
    }
}
