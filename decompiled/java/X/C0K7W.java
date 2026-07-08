package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K7W, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7W {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final List<Integer> LJ;
    public final int LJFF;

    public C0K7W() {
        this(null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K7W)) {
            return false;
        }
        C0K7W c0k7w = (C0K7W) obj;
        return Intrinsics.LJFF(this.LIZ, c0k7w.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k7w.LIZIZ) && this.LIZJ == c0k7w.LIZJ && this.LIZLLL == c0k7w.LIZLLL && Intrinsics.LJFF(this.LJ, c0k7w.LJ) && this.LJFF == c0k7w.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PollSpec(question=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", options=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", deadlineAt=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", allowMultiple=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", defaultSelectedIndices=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", maxSelectCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0K7W(String str, List list, int i) {
        C13BV c13bv;
        int i2;
        List list2 = list;
        String str2 = (i & 1) != 0 ? "" : str;
        list2 = (i & 2) != 0 ? C13BV.INSTANCE : list2;
        if ((i & 16) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i & 32) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this(false, 0L, i2, str2, list2, c13bv);
    }

    public C0K7W(boolean z, long j, int i, String str, List list, List list2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = j;
        this.LIZLLL = z;
        this.LJ = list2;
        this.LJFF = i;
    }
}
