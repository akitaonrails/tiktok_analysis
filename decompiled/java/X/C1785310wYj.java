package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785310wYj {
    public final C861890XrX LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;
    public final boolean LIZLLL;

    public C1785310wYj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785310wYj)) {
            return false;
        }
        C1785310wYj c1785310wYj = (C1785310wYj) obj;
        return Intrinsics.LJFF(this.LIZ, c1785310wYj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1785310wYj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1785310wYj.LIZJ) && this.LIZLLL == c1785310wYj.LIZLLL;
    }

    public final int hashCode() {
        C861890XrX c861890XrX = this.LIZ;
        int iHashCode = (c861890XrX == null ? 0 : c861890XrX.hashCode()) * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.LIZJ;
        return ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InitialFocusHighlightRuntime(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rank=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", active=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1785310wYj(int i) {
        this(null, null, null, false);
    }

    public C1785310wYj(C861890XrX c861890XrX, Long l, Long l2, boolean z) {
        this.LIZ = c861890XrX;
        this.LIZIZ = l;
        this.LIZJ = l2;
        this.LIZLLL = z;
    }
}
