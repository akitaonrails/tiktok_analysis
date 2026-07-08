package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383380F1k {
    public final String LIZ;
    public final List<C0F26> LIZIZ;
    public final boolean LIZJ;
    public final C375830EoP<Unit> LIZLLL;

    public C383380F1k() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C383380F1k)) {
            return false;
        }
        C383380F1k c383380F1k = (C383380F1k) obj;
        return Intrinsics.LJFF(this.LIZ, c383380F1k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c383380F1k.LIZIZ) && this.LIZJ == c383380F1k.LIZJ && Intrinsics.LJFF(this.LIZLLL, c383380F1k.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        C375830EoP<Unit> c375830EoP = this.LIZLLL;
        return iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutStrokeAdjustState(resourceID=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strokeAdjustList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", panelVisible=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", scrollToSelectedColorItem=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C383380F1k(int i) {
        this("", new ArrayList(), false, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C383380F1k(String str, List<? extends C0F26> list, boolean z, C375830EoP<Unit> c375830EoP) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = c375830EoP;
    }

    public static C383380F1k LIZ(C383380F1k c383380F1k, String str, List list, boolean z, C375830EoP c375830EoP, int i) {
        if ((i & 1) != 0) {
            str = c383380F1k.LIZ;
        }
        if ((i & 2) != 0) {
            list = c383380F1k.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c383380F1k.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP = c383380F1k.LIZLLL;
        }
        c383380F1k.getClass();
        return new C383380F1k(str, list, z, c375830EoP);
    }
}
