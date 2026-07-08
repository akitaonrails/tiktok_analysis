package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0eXd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1092710eXd {
    public final int LIZ;
    public final List<Long> LIZIZ;
    public final JSONObject LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1092710eXd)) {
            return false;
        }
        C1092710eXd c1092710eXd = (C1092710eXd) obj;
        return this.LIZ == c1092710eXd.LIZ && Intrinsics.LJFF(this.LIZIZ, c1092710eXd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1092710eXd.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        JSONObject jSONObject = this.LIZJ;
        return iHashCode + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BusinessDependencyConfiguration(giftCheckType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", giftIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", raw=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1092710eXd() {
        this(0, C13BV.INSTANCE, null);
    }

    public C1092710eXd(int i, List<Long> list, JSONObject jSONObject) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = jSONObject;
    }
}
