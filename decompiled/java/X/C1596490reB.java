package X;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0reB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596490reB {
    public final int LIZ;
    public final List<EnumC1597060rf6> LIZIZ;
    public final C1169404ho LIZJ;
    public final InterfaceC088400Uw LIZLLL;
    public final Map<EnumC1597060rf6, Integer> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1596490reB)) {
            return false;
        }
        C1596490reB c1596490reB = (C1596490reB) obj;
        return this.LIZ == c1596490reB.LIZ && Intrinsics.LJFF(this.LIZIZ, c1596490reB.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1596490reB.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1596490reB.LIZLLL) && Intrinsics.LJFF(this.LJ, c1596490reB.LJ);
    }

    public final int hashCode() {
        return (((((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkylightSceneConfig(scene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bizTypes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fetcherSuiteConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sortStrategy=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", bizPriorityMap=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1596490reB(int i, List list, C1169404ho c1169404ho, InterfaceC088400Uw interfaceC088400Uw) {
        this(i, list, c1169404ho, interfaceC088400Uw, C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1596490reB(int i, List<? extends EnumC1597060rf6> list, C1169404ho c1169404ho, InterfaceC088400Uw interfaceC088400Uw, Map<EnumC1597060rf6, Integer> map) {
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = c1169404ho;
        this.LIZLLL = interfaceC088400Uw;
        this.LJ = map;
    }
}
