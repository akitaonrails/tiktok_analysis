package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0btl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991110btl {
    public final boolean LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991110btl)) {
            return false;
        }
        C991110btl c991110btl = (C991110btl) obj;
        return this.LIZ == c991110btl.LIZ && Intrinsics.LJFF(this.LIZIZ, c991110btl.LIZIZ) && this.LIZJ == c991110btl.LIZJ && this.LIZLLL == c991110btl.LIZLLL;
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPMusicRecommendRefreshState(shouldForceRefresh=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", currentTag=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableDynamicLoadRecommend=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableLoadRecommendSync=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991110btl(boolean z, String str, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = z2;
        this.LIZLLL = z3;
    }
}
