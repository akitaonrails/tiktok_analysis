package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782050wTT implements InterfaceC1822900xXM {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final Long LJI;
    public final List<InterfaceC1782170wTf> LJII;
    public final Long LJIIIIZZ;

    public C1782050wTT() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782050wTT)) {
            return false;
        }
        C1782050wTT c1782050wTT = (C1782050wTT) obj;
        return Intrinsics.LJFF(this.LIZ, c1782050wTT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1782050wTT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1782050wTT.LIZJ) && this.LIZLLL == c1782050wTT.LIZLLL && this.LJ == c1782050wTT.LJ && Intrinsics.LJFF(this.LJFF, c1782050wTT.LJFF) && Intrinsics.LJFF(this.LJI, c1782050wTT.LJI) && Intrinsics.LJFF(this.LJII, c1782050wTT.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1782050wTT.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LJI;
        int iHashCode3 = (((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31) + this.LJII.hashCode()) * 31;
        Long l2 = this.LJIIIIZZ;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceBioBodyItem(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iconAttrId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", submitResId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", formId=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", details=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", skuID=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1822900xXM
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1822900xXM
    public final C1782070wTV LJ() {
        if (this instanceof C1782070wTV) {
            return (C1782070wTV) this;
        }
        return null;
    }

    @Override // X.InterfaceC1822900xXM
    public final Long LIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1822900xXM
    public final Long LIZIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC1822900xXM
    public final int LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1822900xXM
    public final List<InterfaceC1782170wTf> LJFF() {
        return this.LJII;
    }

    @Override // X.InterfaceC1782150wTd
    public final String getDesc() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1822900xXM
    public final String getKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1822900xXM
    public final String getSchema() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1782150wTd
    public final String getTitle() {
        return this.LIZIZ;
    }

    public C1782050wTT(String str, String str2, String str3, int i, int i2, String str4, Long l, List list, Long l2, int i3) {
        str4 = (i3 & 32) != 0 ? null : str4;
        l = (i3 & 64) != 0 ? null : l;
        list = (i3 & 128) != 0 ? C13BV.INSTANCE : list;
        l2 = (i3 & 256) != 0 ? null : l2;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = str4;
        this.LJI = l;
        this.LJII = list;
        this.LJIIIIZZ = l2;
    }
}
