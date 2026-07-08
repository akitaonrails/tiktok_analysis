package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C678630Qjd {
    public final InterfaceC648270Pbl LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C678630Qjd)) {
            return false;
        }
        C678630Qjd c678630Qjd = (C678630Qjd) obj;
        return Intrinsics.LJFF(this.LIZ, c678630Qjd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c678630Qjd.LIZIZ) && this.LIZJ == c678630Qjd.LIZJ && this.LIZLLL == c678630Qjd.LIZLLL && this.LJ == c678630Qjd.LJ && this.LJFF == c678630Qjd.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayableViewSnapshot(player=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", itemIndex=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isPlaying=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isVisible=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", isContinuousPlay=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C678630Qjd(InterfaceC648270Pbl interfaceC648270Pbl, String str, int i, boolean z, boolean z2, boolean z3) {
        this.LIZ = interfaceC648270Pbl;
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
    }
}
