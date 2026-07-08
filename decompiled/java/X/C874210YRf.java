package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YRf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874210YRf {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C874210YRf)) {
            return false;
        }
        C874210YRf c874210YRf = (C874210YRf) obj;
        return Intrinsics.LJFF(this.LIZ, c874210YRf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c874210YRf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c874210YRf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c874210YRf.LIZLLL) && Intrinsics.LJFF(this.LJ, c874210YRf.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MediaAuthToken(accessKeyId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sessionToken=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", secretAccessKey=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", expireTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", currentTime=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C874210YRf(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
