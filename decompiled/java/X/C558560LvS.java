package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558560LvS {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C558560LvS)) {
            return false;
        }
        C558560LvS c558560LvS = (C558560LvS) obj;
        return Intrinsics.LJFF(this.LIZ, c558560LvS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c558560LvS.LIZIZ) && this.LIZJ == c558560LvS.LIZJ && this.LIZLLL == c558560LvS.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DownloadImageParams(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", srcWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", srcHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C558560LvS(String str, String str2, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
