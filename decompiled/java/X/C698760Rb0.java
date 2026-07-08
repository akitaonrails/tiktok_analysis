package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C698760Rb0 {
    public final Object LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final C699810Rch LIZLLL;
    public final C699390Rc1 LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C698760Rb0)) {
            return false;
        }
        C698760Rb0 c698760Rb0 = (C698760Rb0) obj;
        return Intrinsics.LJFF(this.LIZ, c698760Rb0.LIZ) && Intrinsics.LJFF(this.LIZIZ, c698760Rb0.LIZIZ) && this.LIZJ == c698760Rb0.LIZJ && Intrinsics.LJFF(this.LIZLLL, c698760Rb0.LIZLLL) && Intrinsics.LJFF(this.LJ, c698760Rb0.LJ) && this.LJFF == c698760Rb0.LJFF;
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        return ((((((((((obj == null ? 0 : obj.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingSlotAddOperation(owner=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slotId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", revision=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", node=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", operation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", suppressRuntimeDispatch=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C698760Rb0(Object obj, String str, long j, C699810Rch c699810Rch, C699390Rc1 c699390Rc1, boolean z) {
        this.LIZ = obj;
        this.LIZIZ = str;
        this.LIZJ = j;
        this.LIZLLL = c699810Rch;
        this.LJ = c699390Rc1;
        this.LJFF = z;
    }
}
