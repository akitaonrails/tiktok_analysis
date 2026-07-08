package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0u0R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687170u0R {
    public final AIGCEntranceInfo LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    public C1687170u0R() {
        this((AIGCEntranceInfo) null, (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), (String) (0 == true ? 1 : 0), 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1687170u0R)) {
            return false;
        }
        C1687170u0R c1687170u0R = (C1687170u0R) obj;
        return Intrinsics.LJFF(this.LIZ, c1687170u0R.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1687170u0R.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1687170u0R.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1687170u0R.LIZLLL) && Intrinsics.LJFF(this.LJ, c1687170u0R.LJ) && Intrinsics.LJFF(this.LJFF, c1687170u0R.LJFF);
    }

    public final int hashCode() {
        AIGCEntranceInfo aIGCEntranceInfo = this.LIZ;
        int iHashCode = (aIGCEntranceInfo == null ? 0 : aIGCEntranceInfo.hashCode()) * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJ;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJFF;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPortraitEditProfileEntranceParams(entranceInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sceneName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", textType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", eventPage=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", cameoCreationId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1687170u0R(AIGCEntranceInfo aIGCEntranceInfo, String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? null : aIGCEntranceInfo, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (String) null);
    }

    public C1687170u0R(AIGCEntranceInfo aIGCEntranceInfo, String str, String str2, String str3, String str4, String str5) {
        this.LIZ = aIGCEntranceInfo;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
    }
}
