package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Elm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374200Elm {
    public final boolean LIZ;
    public final List<C373800El8> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    public C374200Elm() {
        this(false, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C374200Elm)) {
            return false;
        }
        C374200Elm c374200Elm = (C374200Elm) obj;
        return this.LIZ == c374200Elm.LIZ && Intrinsics.LJFF(this.LIZIZ, c374200Elm.LIZIZ) && this.LIZJ == c374200Elm.LIZJ && this.LIZLLL == c374200Elm.LIZLLL && this.LJ == c374200Elm.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutToolBarNewState(panelVisible=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dataSet=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showTips=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enableShowHideAnim=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", resetBtnEnable=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C374200Elm(boolean z, int i) {
        boolean z2;
        ArrayList arrayList;
        boolean z3 = z;
        if ((i & 1) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        this(arrayList, z2, (i & 4) != 0 ? false : z3, false, false);
    }

    public C374200Elm(List list, boolean z, boolean z2, boolean z3, boolean z4) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
    }

    public static C374200Elm LIZ(C374200Elm c374200Elm, boolean z, List list, boolean z2, boolean z3, int i) {
        boolean z4;
        boolean z5 = z3;
        boolean z6 = z2;
        List list2 = list;
        boolean z7 = z;
        if ((i & 1) != 0) {
            z7 = c374200Elm.LIZ;
        }
        if ((i & 2) != 0) {
            list2 = c374200Elm.LIZIZ;
        }
        if ((i & 4) != 0) {
            z4 = c374200Elm.LIZJ;
        } else {
            z4 = false;
        }
        if ((i & 8) != 0) {
            z6 = c374200Elm.LIZLLL;
        }
        if ((i & 16) != 0) {
            z5 = c374200Elm.LJ;
        }
        c374200Elm.getClass();
        return new C374200Elm(list2, z7, z4, z6, z5);
    }
}
