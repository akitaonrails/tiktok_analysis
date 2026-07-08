package X;

import com.ss.android.ugc.aweme.relation.api.PlaceUserInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0izh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263870izh implements InterfaceC323640CmQ<String> {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final PlaceUserInfo LJ;

    public C1263870izh() {
        this(0, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1263870izh)) {
            return false;
        }
        C1263870izh c1263870izh = (C1263870izh) obj;
        return this.LIZ == c1263870izh.LIZ && this.LIZIZ == c1263870izh.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1263870izh.LIZJ) && this.LIZLLL == c1263870izh.LIZLLL && Intrinsics.LJFF(this.LJ, c1263870izh.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31;
        PlaceUserInfo placeUserInfo = this.LJ;
        return iHashCode + (placeUserInfo == null ? 0 : placeUserInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaFLoadParams(time: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", curSize: ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", nextPageToken: ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1263870izh(int i, PlaceUserInfo placeUserInfo, int i2) {
        String str;
        int i3 = i;
        if ((i2 & 4) != 0) {
            str = "";
        } else {
            str = null;
        }
        this(0, 0, str, (i2 & 8) != 0 ? 20 : i3, (i2 & 16) == 0 ? placeUserInfo : null);
    }

    public C1263870izh(int i, int i2, String str, int i3, PlaceUserInfo placeUserInfo) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = i3;
        this.LJ = placeUserInfo;
    }
}
