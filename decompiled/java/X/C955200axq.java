package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0axq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955200axq {
    public final String LIZ;
    public final String LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955200axq)) {
            return false;
        }
        C955200axq c955200axq = (C955200axq) obj;
        return Intrinsics.LJFF(this.LIZ, c955200axq.LIZ) && Intrinsics.LJFF(this.LIZIZ, c955200axq.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c955200axq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c955200axq.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakeStageAnimationParams(effectId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", effectPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", effectExtraInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955200axq(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = jSONObject;
        this.LIZLLL = jSONObject2;
    }
}
