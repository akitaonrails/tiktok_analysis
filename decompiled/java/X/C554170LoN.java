package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LoN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C554170LoN {
    public final AbstractC329610Cw3<Long> LIZ;
    public final List<C554260LoW> LIZIZ;
    public final C554160LoM LIZJ;

    public C554170LoN() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C554170LoN)) {
            return false;
        }
        C554170LoN c554170LoN = (C554170LoN) obj;
        return Intrinsics.LJFF(this.LIZ, c554170LoN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c554170LoN.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c554170LoN.LIZJ);
    }

    public final int hashCode() {
        AbstractC329610Cw3<Long> abstractC329610Cw3 = this.LIZ;
        int iHashCode = (abstractC329610Cw3 == null ? 0 : abstractC329610Cw3.hashCode()) * 31;
        List<C554260LoW> list = this.LIZIZ;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        C554160LoM c554160LoM = this.LIZJ;
        return iHashCode2 + (c554160LoM != null ? c554160LoM.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MentionListStates(config=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", initialList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", listCellState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C554170LoN(AbstractC329610Cw3<Long> abstractC329610Cw3, List<C554260LoW> list, C554160LoM c554160LoM) {
        this.LIZ = abstractC329610Cw3;
        this.LIZIZ = list;
        this.LIZJ = c554160LoM;
    }

    public static C554170LoN LIZ(C554170LoN c554170LoN, AbstractC329610Cw3 abstractC329610Cw3, List list, C554160LoM c554160LoM, int i) {
        if ((i & 1) != 0) {
            abstractC329610Cw3 = c554170LoN.LIZ;
        }
        if ((i & 2) != 0) {
            list = c554170LoN.LIZIZ;
        }
        if ((i & 4) != 0) {
            c554160LoM = c554170LoN.LIZJ;
        }
        c554170LoN.getClass();
        return new C554170LoN(abstractC329610Cw3, list, c554160LoM);
    }
}
