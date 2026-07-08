package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kst, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531490Kst {
    public final String LIZ;
    public final CreativeModel LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C531490Kst)) {
            return false;
        }
        C531490Kst c531490Kst = (C531490Kst) obj;
        return Intrinsics.LJFF(this.LIZ, c531490Kst.LIZ) && Intrinsics.LJFF(this.LIZIZ, c531490Kst.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c531490Kst.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c531490Kst.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MusicDownloadIn(templateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creativeModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C531490Kst(String str, CreativeModel creativeModel, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = creativeModel;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
