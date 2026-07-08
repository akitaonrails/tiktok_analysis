package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wTV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782070wTV implements InterfaceC1822900xXM {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final Long LJI;
    public final List<InterfaceC1782170wTf> LJII;
    public final Long LJIIIIZZ;
    public final long LJIIIZ;
    public final int LJIIJ;
    public final boolean LJIIJJI;
    public final int LJIIL;

    @Override // X.InterfaceC1822900xXM
    public final C1782070wTV LJ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782070wTV)) {
            return false;
        }
        C1782070wTV c1782070wTV = (C1782070wTV) obj;
        return Intrinsics.LJFF(this.LIZ, c1782070wTV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1782070wTV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1782070wTV.LIZJ) && this.LIZLLL == c1782070wTV.LIZLLL && this.LJ == c1782070wTV.LJ && Intrinsics.LJFF(this.LJFF, c1782070wTV.LJFF) && Intrinsics.LJFF(this.LJI, c1782070wTV.LJI) && Intrinsics.LJFF(this.LJII, c1782070wTV.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1782070wTV.LJIIIIZZ) && this.LJIIIZ == c1782070wTV.LJIIIZ && this.LJIIJ == c1782070wTV.LJIIJ && this.LJIIJJI == c1782070wTV.LJIIJJI && this.LJIIL == c1782070wTV.LJIIL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LJI;
        int iHashCode3 = (((iHashCode2 + (l == null ? 0 : l.hashCode())) * 31) + this.LJII.hashCode()) * 31;
        Long l2 = this.LJIIIIZZ;
        return ((((((((iHashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIIIZ)) * 31) + this.LJIIJ) * 31) + C786410Ut5.Z2(this.LJIIJJI)) * 31) + this.LJIIL;
    }

    public final String toString() {
        return "PcsServiceBioBodyCourseItem(key=" + this.LIZ + ", title=" + this.LIZIZ + ", desc=" + this.LIZJ + ", iconAttrId=" + this.LIZLLL + ", submitResId=" + this.LJ + ", schema=" + this.LJFF + ", formId=" + this.LJI + ", details=" + this.LJII + ", skuID=" + this.LJIIIIZZ + ", courseId=" + this.LJIIIZ + ", actualTotalItem=" + this.LJIIJ + ", isCoursePurchased=" + this.LJIIJJI + ", courseIndex=" + this.LJIIL + ')';
    }

    @Override // X.InterfaceC1822900xXM
    public final Integer LIZLLL() {
        return Integer.valueOf(this.LJ);
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

    /* JADX WARN: Multi-variable type inference failed */
    public C1782070wTV(String str, String str2, String str3, int i, int i2, String str4, Long l, List<? extends InterfaceC1782170wTf> list, Long l2, long j, int i3, boolean z, int i4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = str4;
        this.LJI = l;
        this.LJII = list;
        this.LJIIIIZZ = l2;
        this.LJIIIZ = j;
        this.LJIIJ = i3;
        this.LJIIJJI = z;
        this.LJIIL = i4;
    }
}
