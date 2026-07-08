package X;

import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04pR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1216704pR {
    public final GMTBaseModel LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1216704pR)) {
            return false;
        }
        C1216704pR c1216704pR = (C1216704pR) obj;
        return Intrinsics.LJFF(this.LIZ, c1216704pR.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1216704pR.LIZIZ);
    }

    public final int hashCode() {
        GMTBaseModel gMTBaseModel = this.LIZ;
        int iHashCode = (gMTBaseModel == null ? 0 : gMTBaseModel.hashCode()) * 31;
        Object obj = this.LIZIZ;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RewardCountdownSceneData(gmtBaseModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hostModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1216704pR(GMTBaseModel gMTBaseModel, Object obj) {
        this.LIZ = gMTBaseModel;
        this.LIZIZ = obj;
    }
}
