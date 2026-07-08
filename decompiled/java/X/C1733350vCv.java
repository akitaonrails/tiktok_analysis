package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vCv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1733350vCv {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1733350vCv)) {
            return false;
        }
        C1733350vCv c1733350vCv = (C1733350vCv) obj;
        return Intrinsics.LJFF(this.LIZ, c1733350vCv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1733350vCv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1733350vCv.LIZJ) && this.LIZLLL == c1733350vCv.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaLivePopupFragmentParams(lynxUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", popupKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showMask=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1733350vCv(String str, String str2, String str3, boolean z) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
    }
}
