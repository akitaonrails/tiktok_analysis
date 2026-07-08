package X;

import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fUn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129390fUn {
    public final int LIZ;
    public final LinkedList<AbstractC1126600fQI<? extends AnonymousClass0054>> LIZIZ;
    public final int LIZJ;
    public final C1129200fUU LIZLLL;

    public C1129390fUn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1129390fUn)) {
            return false;
        }
        C1129390fUn c1129390fUn = (C1129390fUn) obj;
        return this.LIZ == c1129390fUn.LIZ && Intrinsics.LJFF(this.LIZIZ, c1129390fUn.LIZIZ) && this.LIZJ == c1129390fUn.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1129390fUn.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        C1129200fUU c1129200fUU = this.LIZLLL;
        return iHashCode + (c1129200fUU == null ? 0 : c1129200fUU.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabPanelSnapshot(tabType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panels=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", firstExclusiveGroupItemCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", metadata=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1129390fUn(int i, LinkedList linkedList, int i2, C1129200fUU c1129200fUU, int i3) {
        i2 = (i3 & 4) != 0 ? 0 : i2;
        c1129200fUU = (i3 & 8) != 0 ? null : c1129200fUU;
        this.LIZ = i;
        this.LIZIZ = linkedList;
        this.LIZJ = i2;
        this.LIZLLL = c1129200fUU;
    }
}
