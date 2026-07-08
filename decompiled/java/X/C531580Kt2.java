package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531580Kt2 {
    public final String LIZ;
    public final C1412390mrF LIZIZ;
    public final EnumC1412640mre LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final ShortVideoContext LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C531580Kt2)) {
            return false;
        }
        C531580Kt2 c531580Kt2 = (C531580Kt2) obj;
        return Intrinsics.LJFF(this.LIZ, c531580Kt2.LIZ) && Intrinsics.LJFF(this.LIZIZ, c531580Kt2.LIZIZ) && this.LIZJ == c531580Kt2.LIZJ && Intrinsics.LJFF(this.LIZLLL, c531580Kt2.LIZLLL) && Intrinsics.LJFF(this.LJ, c531580Kt2.LJ) && Intrinsics.LJFF(this.LJFF, c531580Kt2.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        EnumC1412640mre enumC1412640mre = this.LIZJ;
        int iHashCode2 = (iHashCode + (enumC1412640mre == null ? 0 : enumC1412640mre.hashCode())) * 31;
        String str = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShortVideoContext shortVideoContext = this.LJFF;
        return iHashCode4 + (shortVideoContext != null ? shortVideoContext.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchDetailIn(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dispatchType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", svc=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C531580Kt2(String str, C1412390mrF c1412390mrF, EnumC1412640mre enumC1412640mre, String str2, String str3, ShortVideoContext shortVideoContext) {
        this.LIZ = str;
        this.LIZIZ = c1412390mrF;
        this.LIZJ = enumC1412640mre;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = shortVideoContext;
    }
}
