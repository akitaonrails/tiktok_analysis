package X;

import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.SMBOptInQualificationResponse;

/* JADX INFO: renamed from: X.0mp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411030mp3 extends AbstractC878300Ycu {
    public final boolean LIZ;
    public final SMBOptInQualificationResponse.ResponseData LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1411030mp3)) {
            return false;
        }
        C1411030mp3 c1411030mp3 = (C1411030mp3) obj;
        return this.LIZ == c1411030mp3.LIZ && Intrinsics.LJFF(this.LIZIZ, c1411030mp3.LIZIZ) && this.LIZJ == c1411030mp3.LIZJ;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        SMBOptInQualificationResponse.ResponseData responseData = this.LIZIZ;
        return ((iZ2 + (responseData == null ? 0 : responseData.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OptInQualificationResult(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", qualification=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1411030mp3(boolean z, SMBOptInQualificationResponse.ResponseData responseData, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = responseData;
        this.LIZJ = z2;
    }
}
