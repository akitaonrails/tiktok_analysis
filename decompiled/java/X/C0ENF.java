package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ENF, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ENF {
    public final List<C0EN8> LIZ;
    public final C375830EoP<Unit> LIZIZ;
    public final boolean LIZJ;

    public C0ENF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ENF)) {
            return false;
        }
        C0ENF c0enf = (C0ENF) obj;
        return Intrinsics.LJFF(this.LIZ, c0enf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0enf.LIZIZ) && this.LIZJ == c0enf.LIZJ;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C375830EoP<Unit> c375830EoP = this.LIZIZ;
        return ((iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MaskResourceListSceneState(dataSet=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scrollToSelectedPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enabled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0ENF(int i) {
        this(new ArrayList(), null, true);
    }

    public C0ENF(List<C0EN8> list, C375830EoP<Unit> c375830EoP, boolean z) {
        this.LIZ = list;
        this.LIZIZ = c375830EoP;
        this.LIZJ = z;
    }

    public static C0ENF LIZ(C0ENF c0enf, List list, C375830EoP c375830EoP, boolean z, int i) {
        if ((i & 1) != 0) {
            list = c0enf.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP = c0enf.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c0enf.LIZJ;
        }
        c0enf.getClass();
        return new C0ENF(list, c375830EoP, z);
    }
}
