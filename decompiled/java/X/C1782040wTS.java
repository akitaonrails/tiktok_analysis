package X;

import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.ServiceInfo;

/* JADX INFO: renamed from: X.0wTS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1782040wTS implements InterfaceC1822900xXM {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final Integer LJ;
    public final String LJFF;
    public final Long LJI;
    public final List<InterfaceC1782170wTf> LJII;
    public final Long LJIIIIZZ;
    public final ServiceInfo LJIIIZ;
    public final long LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final long LJIILJJIL;
    public final String LJIILL;

    public C1782040wTS() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1782040wTS)) {
            return false;
        }
        C1782040wTS c1782040wTS = (C1782040wTS) obj;
        return Intrinsics.LJFF(this.LIZ, c1782040wTS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1782040wTS.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1782040wTS.LIZJ) && this.LIZLLL == c1782040wTS.LIZLLL && Intrinsics.LJFF(this.LJ, c1782040wTS.LJ) && Intrinsics.LJFF(this.LJFF, c1782040wTS.LJFF) && Intrinsics.LJFF(this.LJI, c1782040wTS.LJI) && Intrinsics.LJFF(this.LJII, c1782040wTS.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1782040wTS.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1782040wTS.LJIIIZ) && this.LJIIJ == c1782040wTS.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c1782040wTS.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1782040wTS.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1782040wTS.LJIILIIL) && this.LJIILJJIL == c1782040wTS.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c1782040wTS.LJIILL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31;
        Integer num = this.LJ;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.LJI;
        int iHashCode4 = (((iHashCode3 + (l == null ? 0 : l.hashCode())) * 31) + this.LJII.hashCode()) * 31;
        Long l2 = this.LJIIIIZZ;
        int iHashCode5 = (iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        ServiceInfo serviceInfo = this.LJIIIZ;
        return ((((((((((((iHashCode5 + (serviceInfo != null ? serviceInfo.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJIIJ)) * 31) + this.LJIIJJI.hashCode()) * 31) + this.LJIIL.hashCode()) * 31) + this.LJIILIIL.hashCode()) * 31) + C786410Ut5.Y2(this.LJIILJJIL)) * 31) + this.LJIILL.hashCode();
    }

    public final String toString() {
        return "PcsServiceBioBodyThirdPartyLinkItem(key=" + this.LIZ + ", title=" + this.LIZIZ + ", desc=" + this.LIZJ + ", iconAttrId=" + this.LIZLLL + ", submitResId=" + this.LJ + ", schema=" + this.LJFF + ", formId=" + this.LJI + ", details=" + this.LJII + ", skuID=" + this.LJIIIIZZ + ", serviceInfo=" + this.LJIIIZ + ", linkId=" + this.LJIIJ + ", targetUrl=" + this.LJIIJJI + ", platformName=" + this.LJIIL + ", iconUrl=" + this.LJIILIIL + ", expiresAt=" + this.LJIILJJIL + ", platformKey=" + this.LJIILL + ')';
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
    public final Integer LIZLLL() {
        return this.LJ;
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

    public C1782040wTS(String str, String str2, Integer num, String str3, C13BV c13bv, Long l, ServiceInfo serviceInfo, long j, String str4, String str5, String str6, long j2, String str7) {
        this.LIZ = "third_party_link";
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = R.attr.emx;
        this.LJ = num;
        this.LJFF = str3;
        this.LJI = null;
        this.LJII = c13bv;
        this.LJIIIIZZ = l;
        this.LJIIIZ = serviceInfo;
        this.LJIIJ = j;
        this.LJIIJJI = str4;
        this.LJIIL = str5;
        this.LJIILIIL = str6;
        this.LJIILJJIL = j2;
        this.LJIILL = str7;
    }
}
