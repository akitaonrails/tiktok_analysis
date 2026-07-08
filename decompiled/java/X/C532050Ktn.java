package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ktn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C532050Ktn {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C532050Ktn)) {
            return false;
        }
        C532050Ktn c532050Ktn = (C532050Ktn) obj;
        return Intrinsics.LJFF(this.LIZ, c532050Ktn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c532050Ktn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c532050Ktn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c532050Ktn.LIZLLL) && this.LJ == c532050Ktn.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadTemplateZipIn(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", creationId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isPreload=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C532050Ktn(Context context, String str, String str2, String str3, boolean z) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJ = z;
    }
}
