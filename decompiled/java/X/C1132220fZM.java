package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftFullInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftUpdateInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fZM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132220fZM extends AbstractC1132210fZL {
    public final String LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final CollabGiftBaseInfo LIZLLL;
    public final CollabGiftActiveInfo LJ;
    public final CollabGiftUpdateInfo LJFF;
    public final CollabGiftFullInfo LJI;
    public final AssetsModel LJII;
    public final boolean LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1132220fZM)) {
            return false;
        }
        C1132220fZM c1132220fZM = (C1132220fZM) obj;
        return Intrinsics.LJFF(this.LIZ, c1132220fZM.LIZ) && this.LIZIZ == c1132220fZM.LIZIZ && this.LIZJ == c1132220fZM.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1132220fZM.LIZLLL) && Intrinsics.LJFF(this.LJ, c1132220fZM.LJ) && Intrinsics.LJFF(this.LJFF, c1132220fZM.LJFF) && Intrinsics.LJFF(this.LJI, c1132220fZM.LJI) && Intrinsics.LJFF(this.LJII, c1132220fZM.LJII) && this.LJIIIIZZ == c1132220fZM.LJIIIIZZ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        CollabGiftUpdateInfo collabGiftUpdateInfo = this.LJFF;
        int iHashCode2 = (iHashCode + (collabGiftUpdateInfo == null ? 0 : collabGiftUpdateInfo.hashCode())) * 31;
        CollabGiftFullInfo collabGiftFullInfo = this.LJI;
        int iHashCode3 = (iHashCode2 + (collabGiftFullInfo == null ? 0 : collabGiftFullInfo.hashCode())) * 31;
        AssetsModel assetsModel = this.LJII;
        return ((iHashCode3 + (assetsModel != null ? assetsModel.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIIIIZZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Running(sessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isNewSession=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", countdownSecond=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", baseInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", activeInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", updateInfo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fullInfo=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", finishAssetsModel=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", isFromServer=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1132220fZM(String str, boolean z, long j, CollabGiftBaseInfo collabGiftBaseInfo, CollabGiftActiveInfo collabGiftActiveInfo, CollabGiftUpdateInfo collabGiftUpdateInfo, CollabGiftFullInfo collabGiftFullInfo, AssetsModel assetsModel, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = collabGiftBaseInfo;
        this.LJ = collabGiftActiveInfo;
        this.LJFF = collabGiftUpdateInfo;
        this.LJI = collabGiftFullInfo;
        this.LJII = assetsModel;
        this.LJIIIIZZ = z2;
    }

    public static C1132220fZM LIZ(C1132220fZM c1132220fZM, long j, CollabGiftBaseInfo collabGiftBaseInfo, CollabGiftActiveInfo collabGiftActiveInfo, CollabGiftUpdateInfo collabGiftUpdateInfo, CollabGiftFullInfo collabGiftFullInfo, AssetsModel assetsModel, boolean z, int i) {
        String str;
        boolean z2;
        boolean z3 = z;
        AssetsModel assetsModel2 = assetsModel;
        CollabGiftFullInfo collabGiftFullInfo2 = collabGiftFullInfo;
        long j2 = j;
        CollabGiftUpdateInfo collabGiftUpdateInfo2 = collabGiftUpdateInfo;
        CollabGiftActiveInfo collabGiftActiveInfo2 = collabGiftActiveInfo;
        CollabGiftBaseInfo collabGiftBaseInfo2 = collabGiftBaseInfo;
        if ((i & 1) != 0) {
            str = c1132220fZM.LIZ;
        } else {
            str = null;
        }
        if ((i & 2) != 0) {
            z2 = c1132220fZM.LIZIZ;
        } else {
            z2 = false;
        }
        if ((i & 4) != 0) {
            j2 = c1132220fZM.LIZJ;
        }
        if ((i & 8) != 0) {
            collabGiftBaseInfo2 = c1132220fZM.LIZLLL;
        }
        if ((i & 16) != 0) {
            collabGiftActiveInfo2 = c1132220fZM.LJ;
        }
        if ((i & 32) != 0) {
            collabGiftUpdateInfo2 = c1132220fZM.LJFF;
        }
        if ((i & 64) != 0) {
            collabGiftFullInfo2 = c1132220fZM.LJI;
        }
        if ((i & 128) != 0) {
            assetsModel2 = c1132220fZM.LJII;
        }
        if ((i & 256) != 0) {
            z3 = c1132220fZM.LJIIIIZZ;
        }
        return new C1132220fZM(str, z2, j2, collabGiftBaseInfo2, collabGiftActiveInfo2, collabGiftUpdateInfo2, collabGiftFullInfo2, assetsModel2, z3);
    }
}
