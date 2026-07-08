package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D6V, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D6V {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<String> LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0D6V)) {
            return false;
        }
        C0D6V c0d6v = (C0D6V) obj;
        return Intrinsics.LJFF(this.LIZ, c0d6v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0d6v.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0d6v.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0d6v.LIZLLL) && Intrinsics.LJFF(this.LJ, c0d6v.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderCardViewState(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timestampText=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", imageUrls=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", debugSourceLabel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D6V(String str, String str2, String str3, List<String> list, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
        this.LJ = str4;
    }
}
