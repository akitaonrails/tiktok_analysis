package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00FB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00FB {
    public final boolean LIZ = true;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00FB)) {
            return false;
        }
        C00FB c00fb = (C00FB) obj;
        return this.LIZ == c00fb.LIZ && Intrinsics.LJFF(this.LIZIZ, c00fb.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c00fb.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c00fb.LIZLLL);
    }

    public final int hashCode() {
        return (((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCGenerationDraftParams(needLoading=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mediaPathList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", coverPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", shootWay=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00FB(List list, String str, String str2) {
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
