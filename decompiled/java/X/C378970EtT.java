package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EtT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378970EtT {
    public final C380190EvR LIZ;
    public final EnumC378720Et4 LIZIZ;
    public final C378940EtQ LIZJ;
    public final List<C379170Etn> LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378970EtT)) {
            return false;
        }
        C378970EtT c378970EtT = (C378970EtT) obj;
        return Intrinsics.LJFF(this.LIZ, c378970EtT.LIZ) && this.LIZIZ == c378970EtT.LIZIZ && Intrinsics.LJFF(this.LIZJ, c378970EtT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c378970EtT.LIZLLL) && this.LJ == c378970EtT.LJ && this.LJFF == c378970EtT.LJFF;
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ResolvedGenTask(model=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panelUIType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", genTask=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", mediaSelectedList=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isCreateTemplate=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showModelPanel=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C378970EtT(C380190EvR c380190EvR, EnumC378720Et4 enumC378720Et4, C378940EtQ c378940EtQ, List<C379170Etn> list, boolean z, boolean z2) {
        this.LIZ = c380190EvR;
        this.LIZIZ = enumC378720Et4;
        this.LIZJ = c378940EtQ;
        this.LIZLLL = list;
        this.LJ = z;
        this.LJFF = z2;
    }
}
