package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZ1, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZ1 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final UrlModel LJ;
    public final UrlModel LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZZ1)) {
            return false;
        }
        C0ZZ1 c0zz1 = (C0ZZ1) obj;
        return Intrinsics.LJFF(this.LIZ, c0zz1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0zz1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0zz1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0zz1.LIZLLL) && Intrinsics.LJFF(this.LJ, c0zz1.LJ) && Intrinsics.LJFF(this.LJFF, c0zz1.LJFF);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UrlModel urlModel = this.LJ;
        int iHashCode5 = (iHashCode4 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        UrlModel urlModel2 = this.LJFF;
        return iHashCode5 + (urlModel2 != null ? urlModel2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoomInfo(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomOwnerId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomOwnerSecId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", roomOwnerName=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", roomOwnerAvatarUrlModel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", roomCoverUrlModel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZZ1(String str, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = urlModel;
        this.LJFF = urlModel2;
    }
}
