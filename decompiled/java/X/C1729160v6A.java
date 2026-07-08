package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveBillboardTrackParams;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v6A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1729160v6A {
    public final String LIZ;
    public final Long LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Map<String, Object> LJI;
    public final SeaLiveBillboardTrackParams LJII;

    public C1729160v6A() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1729160v6A)) {
            return false;
        }
        C1729160v6A c1729160v6A = (C1729160v6A) obj;
        return Intrinsics.LJFF(this.LIZ, c1729160v6A.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1729160v6A.LIZIZ) && this.LIZJ == c1729160v6A.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1729160v6A.LIZLLL) && Intrinsics.LJFF(this.LJ, c1729160v6A.LJ) && Intrinsics.LJFF(this.LJFF, c1729160v6A.LJFF) && Intrinsics.LJFF(this.LJI, c1729160v6A.LJI) && Intrinsics.LJFF(this.LJII, c1729160v6A.LJII);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.LJI;
        return ((iHashCode5 + (map != null ? map.hashCode() : 0)) * 31) + this.LJII.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLiveUseEffectRecord(photoId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", useTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isLiveTakeDefault=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", stickerId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", daInfo=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", trackParams=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1729160v6A(String str, Long l, boolean z, String str2, String str3, String str4, SeaLiveBillboardTrackParams seaLiveBillboardTrackParams, int i) {
        int i2 = 0;
        z = (i & 4) != 0 ? false : z;
        seaLiveBillboardTrackParams = (i & 128) != 0 ? new SeaLiveBillboardTrackParams(i2) : seaLiveBillboardTrackParams;
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = z;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = null;
        this.LJII = seaLiveBillboardTrackParams;
    }
}
