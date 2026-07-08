package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C510601yq extends AbstractC401801hI {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final JSONObject LIZJ;
    public final JSONObject LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public final int LJI;
    public final Throwable LJII;

    public C510601yq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C510601yq)) {
            return false;
        }
        C510601yq c510601yq = (C510601yq) obj;
        return this.LIZ == c510601yq.LIZ && this.LIZIZ == c510601yq.LIZIZ && Intrinsics.LJFF(this.LIZJ, c510601yq.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c510601yq.LIZLLL) && Intrinsics.LJFF(this.LJ, c510601yq.LJ) && Intrinsics.LJFF(this.LJFF, c510601yq.LJFF) && this.LJI == c510601yq.LJI && Intrinsics.LJFF(this.LJII, c510601yq.LJII);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31;
        JSONObject jSONObject = this.LIZJ;
        int iHashCode = (iZ2 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        JSONObject jSONObject2 = this.LIZLLL;
        int iHashCode2 = (iHashCode + (jSONObject2 == null ? 0 : jSONObject2.hashCode())) * 31;
        List<String> list = this.LJ;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.LJFF;
        int iHashCode4 = (((iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.LJI) * 31;
        Throwable th = this.LJII;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIBeautyRespState(shouldContinue=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSuc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", beautyParam=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", cameraParams=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", suggest=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", suggestTitle=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", errorState=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C510601yq(boolean z, JSONObject jSONObject, JSONObject jSONObject2, List list, List list2, int i, Throwable th, int i2) {
        jSONObject = (i2 & 4) != 0 ? null : jSONObject;
        jSONObject2 = (i2 & 8) != 0 ? null : jSONObject2;
        list = (i2 & 16) != 0 ? null : list;
        list2 = (i2 & 32) != 0 ? null : list2;
        i = (i2 & 64) != 0 ? 1 : i;
        th = (i2 & 128) != 0 ? null : th;
        this.LIZ = false;
        this.LIZIZ = z;
        this.LIZJ = jSONObject;
        this.LIZLLL = jSONObject2;
        this.LJ = list;
        this.LJFF = list2;
        this.LJI = i;
        this.LJII = th;
    }
}
