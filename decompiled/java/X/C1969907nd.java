package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07nd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1969907nd {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Set<String> LJFF;
    public final Set<String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1969907nd)) {
            return false;
        }
        C1969907nd c1969907nd = (C1969907nd) obj;
        return Intrinsics.LJFF(this.LIZ, c1969907nd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1969907nd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1969907nd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1969907nd.LIZLLL) && Intrinsics.LJFF(this.LJ, c1969907nd.LJ) && Intrinsics.LJFF(this.LJFF, c1969907nd.LJFF) && Intrinsics.LJFF(this.LJI, c1969907nd.LJI);
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Metadata(moduleName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", projectPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", packageName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", className=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", soName=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", spiProviderProjects=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", serviceKeys=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1969907nd(String str, String str2, String str3, String str4, String str5, Set<String> set, Set<String> set2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = set;
        this.LJI = set2;
    }
}
