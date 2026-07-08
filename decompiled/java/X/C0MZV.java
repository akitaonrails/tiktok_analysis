package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MZV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZV {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final AIGCInfo LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0MZV)) {
            return false;
        }
        C0MZV c0mzv = (C0MZV) obj;
        return Intrinsics.LJFF(this.LIZ, c0mzv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0mzv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0mzv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0mzv.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AIGCInfo aIGCInfo = this.LIZLLL;
        return iHashCode3 + (aIGCInfo != null ? aIGCInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCVideoGenerationRequest(selectedVideoPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", processedVideoPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", audioPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aigcInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0MZV(String str, String str2, String str3, AIGCInfo aIGCInfo) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = aIGCInfo;
    }
}
