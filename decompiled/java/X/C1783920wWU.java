package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1783920wWU {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Map<String, Object> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1783920wWU)) {
            return false;
        }
        C1783920wWU c1783920wWU = (C1783920wWU) obj;
        return this.LIZ == c1783920wWU.LIZ && this.LIZIZ == c1783920wWU.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1783920wWU.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1783920wWU.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLiveLynxCardLoadParams(cardType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roleType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", globalProps=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1783920wWU(int i, String str, int i2) {
        this(i, i2, str, C2097608Jq.LJ());
    }

    public C1783920wWU(int i, int i2, String str, Map<String, ? extends Object> map) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = map;
    }
}
