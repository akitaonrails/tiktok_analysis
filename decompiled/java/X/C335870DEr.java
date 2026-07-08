package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0DEr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335870DEr extends AbstractC335880DEs {
    public final JSONObject LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C335870DEr)) {
            return false;
        }
        C335870DEr c335870DEr = (C335870DEr) obj;
        return Intrinsics.LJFF(this.LIZIZ, c335870DEr.LIZIZ) && this.LIZJ == c335870DEr.LIZJ;
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JsonRpcResponse(jsonRpc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C335870DEr(JSONObject jSONObject, boolean z) {
        this.LIZIZ = jSONObject;
        this.LIZJ = z;
    }
}
