package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1920507ff {
    public static final C1920507ff LJ = new C1920507ff(null, null, false, 15);
    public final C1920407fe LIZ;
    public final C1914507eh LIZIZ;
    public final boolean LIZJ;
    public final C1914507eh LIZLLL;

    public C1920507ff() {
        this(null, null, false, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1920507ff)) {
            return false;
        }
        C1920507ff c1920507ff = (C1920507ff) obj;
        return Intrinsics.LJFF(this.LIZ, c1920507ff.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1920507ff.LIZIZ) && this.LIZJ == c1920507ff.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1920507ff.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        C1914507eh c1914507eh = this.LIZLLL;
        return iHashCode + (c1914507eh == null ? 0 : c1914507eh.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NimbleVideoListUiConfig(spacing=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", itemStyle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", weakStyle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", weakItemStyle=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1920507ff(C1920407fe c1920407fe, C1914507eh c1914507eh, boolean z, int i) {
        c1920407fe = (i & 1) != 0 ? new C1920407fe(0) : c1920407fe;
        c1914507eh = (i & 2) != 0 ? new C1914507eh(0) : c1914507eh;
        z = (i & 4) != 0 ? false : z;
        this.LIZ = c1920407fe;
        this.LIZIZ = c1914507eh;
        this.LIZJ = z;
        this.LIZLLL = null;
    }
}
