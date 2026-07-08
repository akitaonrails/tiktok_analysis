package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yDY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1849060yDY {
    public static final /* synthetic */ int LJII = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1849060yDY)) {
            return false;
        }
        C1849060yDY c1849060yDY = (C1849060yDY) obj;
        return Intrinsics.LJFF(this.LIZ, c1849060yDY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1849060yDY.LIZIZ) && this.LIZJ == c1849060yDY.LIZJ && this.LIZLLL == c1849060yDY.LIZLLL && this.LJ == c1849060yDY.LJ && this.LJFF == c1849060yDY.LJFF && this.LJI == c1849060yDY.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        return "StorageMigrationSnapshot(id=" + this.LIZ + ", path=" + this.LIZIZ + ", exists=" + this.LIZJ + ", modifiedAt=" + this.LIZLLL + ", size=" + this.LJ + ", entryCount=" + this.LJFF + ", totalBytes=" + this.LJI + ")";
    }

    public final JSONObject LIZ() {
        return new JSONObject().put(FollowStatusChangeMethod.PARAM_UID, this.LIZ).put("path", this.LIZIZ).put("exists", this.LIZJ).put("modifiedAt", this.LIZLLL).put("size", this.LJ).put("entryCount", this.LJFF).put("totalBytes", this.LJI);
    }

    public C1849060yDY(int i, long j, long j2, long j3, String str, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = i;
        this.LJI = j3;
    }
}
