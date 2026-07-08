package X;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hcb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1211110hcb implements Serializable {
    public final String actionSessionId;
    public final String pageName;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1211110hcb)) {
            return false;
        }
        C1211110hcb c1211110hcb = (C1211110hcb) obj;
        return Intrinsics.LJFF(this.actionSessionId, c1211110hcb.actionSessionId) && Intrinsics.LJFF(this.pageName, c1211110hcb.pageName);
    }

    public int hashCode() {
        int iHashCode = this.actionSessionId.hashCode() * 31;
        String str = this.pageName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostPaymentContext(actionSessionId=");
        sbLIZ.append(this.actionSessionId);
        sbLIZ.append(", pageName=");
        sbLIZ.append(this.pageName);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1211110hcb(String str, String str2) {
        this.actionSessionId = str;
        this.pageName = str2;
    }
}
