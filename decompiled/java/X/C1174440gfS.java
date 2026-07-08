package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gfS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1174440gfS implements InterfaceC0148002o {
    public final EnumC1174570gff LL;
    public final EnumC1174300gfE LLILLJJLI;
    public final C1174450gfT LLILLL;

    public C1174440gfS() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1174440gfS)) {
            return false;
        }
        C1174440gfS c1174440gfS = (C1174440gfS) obj;
        return this.LL == c1174440gfS.LL && this.LLILLJJLI == c1174440gfS.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1174440gfS.LLILLL);
    }

    public final int hashCode() {
        EnumC1174570gff enumC1174570gff = this.LL;
        int iHashCode = (enumC1174570gff == null ? 0 : enumC1174570gff.hashCode()) * 31;
        EnumC1174300gfE enumC1174300gfE = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enumC1174300gfE == null ? 0 : enumC1174300gfE.hashCode())) * 31;
        C1174450gfT c1174450gfT = this.LLILLL;
        return iHashCode2 + (c1174450gfT != null ? c1174450gfT.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapModePageState(newUIState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newDataState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mapCategoryStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1174440gfS(EnumC1174570gff enumC1174570gff, EnumC1174300gfE enumC1174300gfE, C1174450gfT c1174450gfT) {
        this.LL = enumC1174570gff;
        this.LLILLJJLI = enumC1174300gfE;
        this.LLILLL = c1174450gfT;
    }

    public static C1174440gfS LIZ(C1174440gfS c1174440gfS, EnumC1174570gff enumC1174570gff, EnumC1174300gfE enumC1174300gfE, C1174450gfT c1174450gfT, int i) {
        if ((i & 1) != 0) {
            enumC1174570gff = c1174440gfS.LL;
        }
        if ((i & 2) != 0) {
            enumC1174300gfE = c1174440gfS.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1174450gfT = c1174440gfS.LLILLL;
        }
        c1174440gfS.getClass();
        return new C1174440gfS(enumC1174570gff, enumC1174300gfE, c1174450gfT);
    }
}
