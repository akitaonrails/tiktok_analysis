package X;

import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782060wTU implements InterfaceC1822900xXM {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final Long LJFF;
    public final List<InterfaceC1782170wTf> LJI;
    public final Long LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public C1782060wTU() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782060wTU)) {
            return false;
        }
        C1782060wTU c1782060wTU = (C1782060wTU) obj;
        return Intrinsics.LJFF(this.LIZ, c1782060wTU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1782060wTU.LIZIZ) && this.LIZJ == c1782060wTU.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1782060wTU.LIZLLL) && Intrinsics.LJFF(this.LJ, c1782060wTU.LJ) && Intrinsics.LJFF(this.LJFF, c1782060wTU.LJFF) && Intrinsics.LJFF(this.LJI, c1782060wTU.LJI) && Intrinsics.LJFF(this.LJII, c1782060wTU.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1782060wTU.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1782060wTU.LJIIIZ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31;
        Integer num = this.LIZLLL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LJ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LJFF;
        int iHashCode4 = (((iHashCode3 + (l == null ? 0 : l.hashCode())) * 31) + this.LJI.hashCode()) * 31;
        Long l2 = this.LJII;
        return ((((iHashCode4 + (l2 != null ? l2.hashCode() : 0)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceBioBodyItemForCalendarItem(eventTemplateId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", key=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconAttrId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", submitResId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", schema=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", formId=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", details=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", skuID=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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
        return this.LJII;
    }

    @Override // X.InterfaceC1822900xXM
    public final Long LIZIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC1822900xXM
    public final int LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1822900xXM
    public final Integer LIZLLL() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1822900xXM
    public final List<InterfaceC1782170wTf> LJFF() {
        return this.LJI;
    }

    @Override // X.InterfaceC1782150wTd
    public final String getDesc() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC1822900xXM
    public final String getKey() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1822900xXM
    public final String getSchema() {
        return this.LJ;
    }

    @Override // X.InterfaceC1782150wTd
    public final String getTitle() {
        return this.LJIIIIZZ;
    }

    public C1782060wTU(String str, Integer num, String str2, C13BV c13bv, Long l, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = "booking_calendar";
        this.LIZJ = R.attr.d09;
        this.LIZLLL = num;
        this.LJ = str2;
        this.LJFF = null;
        this.LJI = c13bv;
        this.LJII = l;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = str4;
    }
}
