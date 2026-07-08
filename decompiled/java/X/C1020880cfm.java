package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020880cfm {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final JSONObject LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1020880cfm)) {
            return false;
        }
        C1020880cfm c1020880cfm = (C1020880cfm) obj;
        return this.LIZ == c1020880cfm.LIZ && Intrinsics.LJFF(this.LIZIZ, c1020880cfm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1020880cfm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1020880cfm.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OneBigThreeSmallSlotTrackItem(slotIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", productId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", jumpModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1020880cfm(String str, JSONObject jSONObject, String str2, int i) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = jSONObject;
    }
}
