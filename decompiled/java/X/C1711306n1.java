package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06n1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1711306n1 {
    public final Long LIZ;
    public final C0Y8T LIZIZ;
    public final C0YMW LIZJ;
    public final C742250T9r LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1711306n1)) {
            return false;
        }
        C1711306n1 c1711306n1 = (C1711306n1) obj;
        return Intrinsics.LJFF(this.LIZ, c1711306n1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1711306n1.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1711306n1.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1711306n1.LIZLLL);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        C0Y8T c0y8t = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c0y8t == null ? 0 : c0y8t.hashCode())) * 31;
        C0YMW c0ymw = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (c0ymw == null ? 0 : c0ymw.hashCode())) * 31;
        C742250T9r c742250T9r = this.LIZLLL;
        return iHashCode3 + (c742250T9r != null ? c742250T9r.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationSyncEvent(assignedConvShortId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", requestTracker=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1711306n1(Long l, C0Y8T c0y8t, C0YMW c0ymw, C742250T9r c742250T9r) {
        this.LIZ = l;
        this.LIZIZ = c0y8t;
        this.LIZJ = c0ymw;
        this.LIZLLL = c742250T9r;
    }
}
