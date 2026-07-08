package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07Zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1884107Zn {
    public final String LIZ = "blocked_by_pns";
    public final JSONObject LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1884107Zn)) {
            return false;
        }
        C1884107Zn c1884107Zn = (C1884107Zn) obj;
        return Intrinsics.LJFF(this.LIZ, c1884107Zn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1884107Zn.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingEvent(eventName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1884107Zn(JSONObject jSONObject) {
        this.LIZIZ = jSONObject;
    }
}
