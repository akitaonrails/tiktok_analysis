package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.smb.GetSMBCourseDetailResponse;

/* JADX INFO: renamed from: X.0xuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837040xuA extends AbstractC1837070xuD {
    public final GetSMBCourseDetailResponse.Data LIZ;
    public final C518160KTu LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1837040xuA)) {
            return false;
        }
        C1837040xuA c1837040xuA = (C1837040xuA) obj;
        return Intrinsics.LJFF(this.LIZ, c1837040xuA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1837040xuA.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GpIapInfoFetched(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", gpFetchProductResult=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1837040xuA(GetSMBCourseDetailResponse.Data data, C518160KTu c518160KTu) {
        this.LIZ = data;
        this.LIZIZ = c518160KTu;
    }
}
