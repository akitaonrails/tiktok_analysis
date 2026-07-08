package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546290Lbf {
    public final Source LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C546290Lbf)) {
            return false;
        }
        C546290Lbf c546290Lbf = (C546290Lbf) obj;
        return this.LIZ == c546290Lbf.LIZ && Intrinsics.LJFF(this.LIZIZ, c546290Lbf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c546290Lbf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c546290Lbf.LIZLLL) && Intrinsics.LJFF(this.LJ, c546290Lbf.LJ) && this.LJFF == c546290Lbf.LJFF;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        String str = this.LJ;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WorkflowConfig(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", jobType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", remixJobType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", algoReqKey=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", newAIGCArchFramework=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C546290Lbf(Source source, String str, String str2, String str3, String str4, boolean z) {
        this.LIZ = source;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = z;
    }
}
