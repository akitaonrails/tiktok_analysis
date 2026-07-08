package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00tw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C225400tw {
    public final List<C20611915l7> LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final float LIZLLL;
    public final float LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C225400tw)) {
            return false;
        }
        C225400tw c225400tw = (C225400tw) obj;
        return Intrinsics.LJFF(this.LIZ, c225400tw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c225400tw.LIZIZ) && this.LIZJ == c225400tw.LIZJ && Float.compare(this.LIZLLL, c225400tw.LIZLLL) == 0 && Float.compare(this.LJ, c225400tw.LJ) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LocalSearchResultData(users=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", searchText=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", candidatesCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", matchingDurationMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", rankingDurationMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + Float.floatToIntBits(this.LJ);
    }

    public C225400tw(List<C20611915l7> list, String str, int i, float f, float f2) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = f;
        this.LJ = f2;
    }
}
