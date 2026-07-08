package X;

import com.ss.android.ugc.aweme.compliance.api.model.Donor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tfY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674220tfY extends AbstractC1675210th9 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final List<Donor> LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final long LJIIJ;
    public final String LJIIJJI;
    public final long LJIIL;
    public final String LJIILIIL;
    public final int LJIILJJIL;
    public final boolean LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674220tfY)) {
            return false;
        }
        C1674220tfY c1674220tfY = (C1674220tfY) obj;
        return Intrinsics.LJFF(this.LIZ, c1674220tfY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1674220tfY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1674220tfY.LIZJ) && this.LIZLLL == c1674220tfY.LIZLLL && Intrinsics.LJFF(this.LJ, c1674220tfY.LJ) && Intrinsics.LJFF(this.LJFF, c1674220tfY.LJFF) && Intrinsics.LJFF(this.LJI, c1674220tfY.LJI) && Intrinsics.LJFF(this.LJII, c1674220tfY.LJII) && this.LJIIIIZZ == c1674220tfY.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1674220tfY.LJIIIZ) && this.LJIIJ == c1674220tfY.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c1674220tfY.LJIIJJI) && this.LJIIL == c1674220tfY.LJIIL && Intrinsics.LJFF(this.LJIILIIL, c1674220tfY.LJIILIIL) && this.LJIILJJIL == c1674220tfY.LJIILJJIL && this.LJIILL == c1674220tfY.LJIILL;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ.hashCode()) * 31;
        String str = this.LJFF;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31;
        String str2 = this.LJIIJJI;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + C786410Ut5.Y2(this.LJIIL)) * 31;
        String str3 = this.LJIILIIL;
        return ((((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LJIILJJIL) * 31) + C786410Ut5.Z2(this.LJIILL);
    }

    public final String toString() {
        return "Fundraiser(title=" + this.LIZ + ", creatorName=" + this.LIZIZ + ", creatorProfileImageUrl=" + this.LIZJ + ", donorCount=" + this.LIZLLL + ", donors=" + this.LJ + ", description=" + this.LJFF + ", organizationName=" + this.LJI + ", organizationIconUrl=" + this.LJII + ", organizationVerified=" + this.LJIIIIZZ + ", organizationUid=" + this.LJIIIZ + ", goalAmount=" + this.LJIIJ + ", goalAmountWithUnit=" + this.LJIIJJI + ", progress=" + this.LJIIL + ", raisedAmountWithUnit=" + this.LJIILIIL + ", donationCount=" + this.LJIILJJIL + ", showOffsiteDonationTooltip=" + this.LJIILL + ')';
    }

    public C1674220tfY(String str, String str2, String str3, int i, List<Donor> list, String str4, String str5, String str6, boolean z, String str7, long j, String str8, long j2, String str9, int i2, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = i;
        this.LJ = list;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str7;
        this.LJIIJ = j;
        this.LJIIJJI = str8;
        this.LJIIL = j2;
        this.LJIILIIL = str9;
        this.LJIILJJIL = i2;
        this.LJIILL = z2;
    }
}
