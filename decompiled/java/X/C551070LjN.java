package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LjN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551070LjN {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C551070LjN)) {
            return false;
        }
        C551070LjN c551070LjN = (C551070LjN) obj;
        return Intrinsics.LJFF(this.LIZ, c551070LjN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c551070LjN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c551070LjN.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c551070LjN.LIZLLL) && Intrinsics.LJFF(this.LJ, c551070LjN.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCOfflineEffectPostProcessingInput(templateType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", templateResourceId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", templateImg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", resourceId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", triggerType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C551070LjN() {
        this("", "", "", "", "");
    }

    public C551070LjN(String str, String str2, String str3, String str4, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
    }
}
