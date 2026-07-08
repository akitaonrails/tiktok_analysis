package X;

import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777410wLz {
    public final String LIZ;
    public final String LIZIZ;
    public final RankTypeV2 LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777410wLz)) {
            return false;
        }
        C1777410wLz c1777410wLz = (C1777410wLz) obj;
        return Intrinsics.LJFF(this.LIZ, c1777410wLz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1777410wLz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1777410wLz.LIZJ) && this.LIZLLL == c1777410wLz.LIZLLL && this.LJ == c1777410wLz.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBarTrackingContext(buttonType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rankName=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rankType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", giftEnabled=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isCreator=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        RankTypeV2 rankTypeV2 = this.LIZJ;
        return ((((iHashCode + (rankTypeV2 == null ? 0 : rankTypeV2.type)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public C1777410wLz(String str, String str2, RankTypeV2 rankTypeV2, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = rankTypeV2;
        this.LIZLLL = z;
        this.LJ = z2;
    }
}
