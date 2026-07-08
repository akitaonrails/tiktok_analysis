package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D2r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C332750D2r {
    public final C335000DBi LIZ;
    public final CommonAdData LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C332750D2r)) {
            return false;
        }
        C332750D2r c332750D2r = (C332750D2r) obj;
        return Intrinsics.LJFF(this.LIZ, c332750D2r.LIZ) && Intrinsics.LJFF(this.LIZIZ, c332750D2r.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        CommonAdData commonAdData = this.LIZIZ;
        return iHashCode + (commonAdData == null ? 0 : commonAdData.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TrackingSnapshot(ucpLogger=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rawAdData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C332750D2r(C335000DBi c335000DBi, CommonAdData commonAdData) {
        this.LIZ = c335000DBi;
        this.LIZIZ = commonAdData;
    }
}
