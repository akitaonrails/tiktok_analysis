package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0buX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991590buX extends AbstractC991850bux {
    public final int LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991590buX)) {
            return false;
        }
        C991590buX c991590buX = (C991590buX) obj;
        return this.LIZ == c991590buX.LIZ && Intrinsics.LJFF(this.LIZIZ, c991590buX.LIZIZ) && this.LIZJ == c991590buX.LIZJ;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return ((i + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentRenderResult(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", failReason=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromPre=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991590buX(int i, String str, boolean z) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
