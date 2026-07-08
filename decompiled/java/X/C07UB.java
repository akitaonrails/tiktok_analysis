package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07UB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07UB {
    public final long LIZ;
    public final List<ImageModel> LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07UB)) {
            return false;
        }
        C07UB c07ub = (C07UB) obj;
        return this.LIZ == c07ub.LIZ && Intrinsics.LJFF(this.LIZIZ, c07ub.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c07ub.LIZJ) && this.LIZLLL == c07ub.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendRankMatchSuggestionPayload(toAnchorId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", avatarThumbs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", firstUserNickName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", totalInteractNum=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07UB(long j, long j2, String str, List list) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = j2;
    }
}
