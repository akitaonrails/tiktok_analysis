package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ew5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380590Ew5 {
    public final boolean LIZ;
    public final C380190EvR LIZIZ;
    public final List<C380190EvR> LIZJ;
    public final EnumC378720Et4 LIZLLL;

    public C380590Ew5() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C380590Ew5)) {
            return false;
        }
        C380590Ew5 c380590Ew5 = (C380590Ew5) obj;
        return this.LIZ == c380590Ew5.LIZ && Intrinsics.LJFF(this.LIZIZ, c380590Ew5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c380590Ew5.LIZJ) && this.LIZLLL == c380590Ew5.LIZLLL;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LIZ) * 31;
        C380190EvR c380190EvR = this.LIZIZ;
        int iHashCode = (((iZ2 + (c380190EvR == null ? 0 : c380190EvR.hashCode())) * 31) + this.LIZJ.hashCode()) * 31;
        EnumC378720Et4 enumC378720Et4 = this.LIZLLL;
        return iHashCode + (enumC378720Et4 != null ? enumC378720Et4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCModelSelectState(showPanel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedModel=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", modelList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", panelUiType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C380590Ew5(int i) {
        this(null, null, C13BV.INSTANCE, false);
    }

    public C380590Ew5(C380190EvR c380190EvR, EnumC378720Et4 enumC378720Et4, List list, boolean z) {
        this.LIZ = z;
        this.LIZIZ = c380190EvR;
        this.LIZJ = list;
        this.LIZLLL = enumC378720Et4;
    }

    public static C380590Ew5 LIZ(C380590Ew5 c380590Ew5, C380190EvR c380190EvR, List list, EnumC378720Et4 enumC378720Et4, int i) {
        boolean z;
        if ((i & 1) != 0) {
            z = c380590Ew5.LIZ;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            c380190EvR = c380590Ew5.LIZIZ;
        }
        if ((i & 4) != 0) {
            list = c380590Ew5.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC378720Et4 = c380590Ew5.LIZLLL;
        }
        c380590Ew5.getClass();
        return new C380590Ew5(c380190EvR, enumC378720Et4, list, z);
    }
}
