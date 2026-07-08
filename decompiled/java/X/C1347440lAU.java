package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lAU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1347440lAU {
    public final Aweme LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public final boolean LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1347440lAU)) {
            return false;
        }
        C1347440lAU c1347440lAU = (C1347440lAU) obj;
        return Intrinsics.LJFF(this.LIZ, c1347440lAU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1347440lAU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1347440lAU.LIZJ) && this.LIZLLL == c1347440lAU.LIZLLL && Intrinsics.LJFF(this.LJ, c1347440lAU.LJ);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        return ((((((((aweme == null ? 0 : aweme.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateImageMobParams(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterAIChatMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", step=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", selectPhoto=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1347440lAU(Aweme aweme, String str, String str2, String str3, boolean z) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = z;
        this.LJ = str3;
    }
}
