package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wPM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1779500wPM {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1779500wPM)) {
            return false;
        }
        C1779500wPM c1779500wPM = (C1779500wPM) obj;
        return this.LIZ == c1779500wPM.LIZ && Intrinsics.LJFF(this.LIZIZ, c1779500wPM.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RankTab(rankType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1779500wPM(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
