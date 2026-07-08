package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EtS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C378960EtS {
    public final C380190EvR LIZ;
    public final EnumC378720Et4 LIZIZ;
    public final List<C379170Etn> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C378960EtS() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C378960EtS)) {
            return false;
        }
        C378960EtS c378960EtS = (C378960EtS) obj;
        return Intrinsics.LJFF(this.LIZ, c378960EtS.LIZ) && this.LIZIZ == c378960EtS.LIZIZ && Intrinsics.LJFF(this.LIZJ, c378960EtS.LIZJ);
    }

    public final int hashCode() {
        C380190EvR c380190EvR = this.LIZ;
        int iHashCode = (c380190EvR == null ? 0 : c380190EvR.hashCode()) * 31;
        EnumC378720Et4 enumC378720Et4 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (enumC378720Et4 == null ? 0 : enumC378720Et4.hashCode())) * 31;
        List<C379170Etn> list = this.LIZJ;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GenTaskConstraint(modelSelected=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panelUIType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaSelectedList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C378960EtS(C380190EvR c380190EvR, EnumC378720Et4 enumC378720Et4, List<C379170Etn> list) {
        this.LIZ = c380190EvR;
        this.LIZIZ = enumC378720Et4;
        this.LIZJ = list;
    }

    public /* synthetic */ C378960EtS(C380190EvR c380190EvR, EnumC378720Et4 enumC378720Et4, List list, int i) {
        this((i & 1) != 0 ? null : c380190EvR, (i & 2) != 0 ? null : enumC378720Et4, (i & 4) != 0 ? null : list);
    }
}
