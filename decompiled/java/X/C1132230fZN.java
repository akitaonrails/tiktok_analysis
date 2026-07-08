package X;

import com.bytedance.android.livesdk.model.message.CollabGiftActiveInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftBaseInfo;
import com.bytedance.android.livesdk.model.message.CollabGiftFullInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fZN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1132230fZN extends AbstractC1132210fZL {
    public final String LIZ;
    public final int LIZIZ;
    public final CollabGiftBaseInfo LIZJ;
    public final CollabGiftActiveInfo LIZLLL;
    public final CollabGiftFullInfo LJ;
    public final long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1132230fZN)) {
            return false;
        }
        C1132230fZN c1132230fZN = (C1132230fZN) obj;
        return Intrinsics.LJFF(this.LIZ, c1132230fZN.LIZ) && this.LIZIZ == c1132230fZN.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1132230fZN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1132230fZN.LIZLLL) && Intrinsics.LJFF(this.LJ, c1132230fZN.LJ) && this.LJFF == c1132230fZN.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31;
        CollabGiftBaseInfo collabGiftBaseInfo = this.LIZJ;
        int iHashCode2 = (iHashCode + (collabGiftBaseInfo == null ? 0 : collabGiftBaseInfo.hashCode())) * 31;
        CollabGiftActiveInfo collabGiftActiveInfo = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (collabGiftActiveInfo == null ? 0 : collabGiftActiveInfo.hashCode())) * 31;
        CollabGiftFullInfo collabGiftFullInfo = this.LJ;
        return ((iHashCode3 + (collabGiftFullInfo != null ? collabGiftFullInfo.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Finished(sessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", finishReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", baseInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", activeInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fullInfo=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", finishEffectId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1132230fZN(String str, int i, CollabGiftBaseInfo collabGiftBaseInfo, CollabGiftActiveInfo collabGiftActiveInfo, CollabGiftFullInfo collabGiftFullInfo, long j) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = collabGiftBaseInfo;
        this.LIZLLL = collabGiftActiveInfo;
        this.LJ = collabGiftFullInfo;
        this.LJFF = j;
    }
}
