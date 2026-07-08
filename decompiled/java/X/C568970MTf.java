package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MTf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C568970MTf {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final AIGCInfo LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C568970MTf)) {
            return false;
        }
        C568970MTf c568970MTf = (C568970MTf) obj;
        return Intrinsics.LJFF(this.LIZ, c568970MTf.LIZ) && this.LIZIZ == c568970MTf.LIZIZ && this.LIZJ == c568970MTf.LIZJ && Intrinsics.LJFF(this.LIZLLL, c568970MTf.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31;
        AIGCInfo aIGCInfo = this.LIZLLL;
        return iHashCode + (aIGCInfo == null ? 0 : aIGCInfo.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImageEntry(path=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", aigcInfo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C568970MTf(String str, int i, int i2, AIGCInfo aIGCInfo) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = aIGCInfo;
    }
}
