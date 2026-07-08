package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ghP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1175650ghP implements InterfaceC0148002o {
    public final EnumC1175790ghd LL;
    public final EnumC1176320giU LLILLJJLI;
    public final C1175660ghQ LLILLL;

    public C1175650ghP() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175650ghP)) {
            return false;
        }
        C1175650ghP c1175650ghP = (C1175650ghP) obj;
        return this.LL == c1175650ghP.LL && this.LLILLJJLI == c1175650ghP.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1175650ghP.LLILLL);
    }

    public final int hashCode() {
        EnumC1175790ghd enumC1175790ghd = this.LL;
        int iHashCode = (enumC1175790ghd == null ? 0 : enumC1175790ghd.hashCode()) * 31;
        EnumC1176320giU enumC1176320giU = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (enumC1176320giU == null ? 0 : enumC1176320giU.hashCode())) * 31;
        C1175660ghQ c1175660ghQ = this.LLILLL;
        return iHashCode2 + (c1175660ghQ != null ? c1175660ghQ.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapDetailPageState(newUIState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newDataState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", mapCategoryStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1175650ghP(EnumC1175790ghd enumC1175790ghd, EnumC1176320giU enumC1176320giU, C1175660ghQ c1175660ghQ) {
        this.LL = enumC1175790ghd;
        this.LLILLJJLI = enumC1176320giU;
        this.LLILLL = c1175660ghQ;
    }

    public static C1175650ghP LIZ(C1175650ghP c1175650ghP, EnumC1175790ghd enumC1175790ghd, EnumC1176320giU enumC1176320giU, C1175660ghQ c1175660ghQ, int i) {
        if ((i & 1) != 0) {
            enumC1175790ghd = c1175650ghP.LL;
        }
        if ((i & 2) != 0) {
            enumC1176320giU = c1175650ghP.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c1175660ghQ = c1175650ghP.LLILLL;
        }
        c1175650ghP.getClass();
        return new C1175650ghP(enumC1175790ghd, enumC1176320giU, c1175660ghQ);
    }
}
