package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1781590wSj {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public C1781590wSj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1781590wSj)) {
            return false;
        }
        C1781590wSj c1781590wSj = (C1781590wSj) obj;
        return Intrinsics.LJFF(this.LIZ, c1781590wSj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1781590wSj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1781590wSj.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1781590wSj.LIZLLL) && Intrinsics.LJFF(this.LJ, c1781590wSj.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThirdPartyLinkTrackParams(userId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", thirdPartyServiceName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1781590wSj(int i) {
        this("", "", "", "", "");
    }

    public C1781590wSj(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
