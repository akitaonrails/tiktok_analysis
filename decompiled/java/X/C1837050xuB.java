package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: renamed from: X.0xuB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837050xuB extends AbstractC1837070xuD {
    public final GetSMBCourseDetailResponse.Data LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1837050xuB) && Intrinsics.LJFF(this.LIZ, ((C1837050xuB) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PageDataFetched(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1837050xuB(GetSMBCourseDetailResponse.Data data) {
        this.LIZ = data;
    }
}
