package X;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849050yDX {
    public static final C1849070yDZ LJII = new C1849070yDZ();
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final C1849060yDY LIZLLL;
    public final C1849060yDY LJ;
    public final long LJFF;
    public final String LJI;

    public C1849050yDX() {
        this(2, "", "", null, null, 0L, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1849050yDX)) {
            return false;
        }
        C1849050yDX c1849050yDX = (C1849050yDX) obj;
        return this.LIZ == c1849050yDX.LIZ && Intrinsics.LJFF(this.LIZIZ, c1849050yDX.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1849050yDX.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1849050yDX.LIZLLL) && Intrinsics.LJFF(this.LJ, c1849050yDX.LJ) && this.LJFF == c1849050yDX.LJFF && Intrinsics.LJFF(this.LJI, c1849050yDX.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        C1849060yDY c1849060yDY = this.LIZLLL;
        int iHashCode2 = (iHashCode + (c1849060yDY == null ? 0 : c1849060yDY.hashCode())) * 31;
        C1849060yDY c1849060yDY2 = this.LJ;
        return ((((iHashCode2 + (c1849060yDY2 != null ? c1849060yDY2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        return "StorageMigrationMetaV2(version=" + this.LIZ + ", lastBackend=" + this.LIZIZ + ", lastSuccessDirection=" + this.LIZJ + ", sourceSnapshot=" + this.LIZLLL + ", targetSnapshot=" + this.LJ + ", updatedAt=" + this.LJFF + ", lastResult=" + this.LJI + ")";
    }

    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("version", this.LIZ).put("lastBackend", this.LIZIZ).put("lastSuccessDirection", this.LIZJ);
        C1849060yDY c1849060yDY = this.LIZLLL;
        JSONObject jSONObjectPut2 = jSONObjectPut.put("sourceSnapshot", c1849060yDY != null ? c1849060yDY.LIZ() : null);
        C1849060yDY c1849060yDY2 = this.LJ;
        return jSONObjectPut2.put("targetSnapshot", c1849060yDY2 != null ? c1849060yDY2.LIZ() : null).put("updatedAt", this.LJFF).put("lastResult", this.LJI);
    }

    public C1849050yDX(int i, String str, String str2, C1849060yDY c1849060yDY, C1849060yDY c1849060yDY2, long j, String str3) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c1849060yDY;
        this.LJ = c1849060yDY2;
        this.LJFF = j;
        this.LJI = str3;
    }
}
