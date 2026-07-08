package X;

import com.bytedance.android.live.liveinteract.multilive.social.model.RecommendedRoom;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IuN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C481450IuN extends AbstractC481570IuZ {
    public final List<RecommendedRoom> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C481450IuN)) {
            return false;
        }
        C481450IuN c481450IuN = (C481450IuN) obj;
        return Intrinsics.LJFF(this.LIZ, c481450IuN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c481450IuN.LIZIZ);
    }

    public final int hashCode() {
        List<RecommendedRoom> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StartRandomMatchSucceed(recommendedRooms=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C481450IuN(List<RecommendedRoom> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
