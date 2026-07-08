package X;

import com.ss.android.ugc.nearby.container.model.NearbyRevampResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hQy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1203900hQy extends AbstractC1203920hR0 {
    public final int LIZ;
    public final NearbyRevampResponse LIZIZ;
    public final C1203960hR4 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1203900hQy)) {
            return false;
        }
        C1203900hQy c1203900hQy = (C1203900hQy) obj;
        return this.LIZ == c1203900hQy.LIZ && Intrinsics.LJFF(this.LIZIZ, c1203900hQy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1203900hQy.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        C1203960hR4 c1203960hR4 = this.LIZJ;
        return iHashCode + (c1203960hR4 == null ? 0 : c1203960hR4.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChunkData(chunkIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", response=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", loadTracker=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1203900hQy(int i, NearbyRevampResponse nearbyRevampResponse, C1203960hR4 c1203960hR4) {
        this.LIZ = i;
        this.LIZIZ = nearbyRevampResponse;
        this.LIZJ = c1203960hR4;
    }
}
