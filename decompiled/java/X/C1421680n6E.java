package X;

import c1b.m;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.NoticeMessage;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.Specification;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n6E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421680n6E {
    public final List<Specification> LIZ;
    public final BrickInfo LIZIZ;
    public final boolean LIZJ;
    public final m LIZLLL;
    public final boolean LJ;
    public final Function1<List<Specification>, InterfaceC1059904Cn> LJFF;
    public final NoticeMessage LJI;
    public final C1427600nFm LJII;
    public final List<String> LJIIIIZZ;
    public final Boolean LJIIIZ;
    public final Boolean LJIIJ;
    public final String LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1421680n6E)) {
            return false;
        }
        C1421680n6E c1421680n6E = (C1421680n6E) obj;
        return Intrinsics.LJFF(this.LIZ, c1421680n6E.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1421680n6E.LIZIZ) && this.LIZJ == c1421680n6E.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1421680n6E.LIZLLL) && this.LJ == c1421680n6E.LJ && Intrinsics.LJFF(this.LJFF, c1421680n6E.LJFF) && Intrinsics.LJFF(this.LJI, c1421680n6E.LJI) && Intrinsics.LJFF(this.LJII, c1421680n6E.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1421680n6E.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c1421680n6E.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1421680n6E.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1421680n6E.LJIIJJI);
    }

    public final int hashCode() {
        List<Specification> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        BrickInfo brickInfo = this.LIZIZ;
        int iHashCode2 = (((((((((iHashCode + (brickInfo == null ? 0 : brickInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + this.LJFF.hashCode()) * 31;
        NoticeMessage noticeMessage = this.LJI;
        int iHashCode3 = (iHashCode2 + (noticeMessage == null ? 0 : noticeMessage.hashCode())) * 31;
        C1427600nFm c1427600nFm = this.LJII;
        int iHashCode4 = (iHashCode3 + (c1427600nFm == null ? 0 : c1427600nFm.hashCode())) * 31;
        List<String> list2 = this.LJIIIIZZ;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.LJIIIZ;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJIIJ;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str = this.LJIIJJI;
        return iHashCode7 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ParseInfoData(specifications=" + this.LIZ + ", brick=" + this.LIZIZ + ", hasSizeChart=" + this.LIZJ + ", style=" + this.LIZLLL + ", clickedDetailViewMore=" + this.LJ + ", createSpecificationsVO=" + this.LJFF + ", noticeMessage=" + this.LJI + ", descReadTracker=" + this.LJII + ", showBrickTypes=" + this.LJIIIIZZ + ", addTitle=" + this.LJIIIZ + ", addSpecification=" + this.LJIIJ + ", pageName=" + this.LJIIJJI + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1421680n6E(List<Specification> list, BrickInfo brickInfo, boolean z, m mVar, boolean z2, Function1<? super List<Specification>, ? extends InterfaceC1059904Cn> function1, NoticeMessage noticeMessage, C1427600nFm c1427600nFm, List<String> list2, Boolean bool, Boolean bool2, String str) {
        this.LIZ = list;
        this.LIZIZ = brickInfo;
        this.LIZJ = z;
        this.LIZLLL = mVar;
        this.LJ = z2;
        this.LJFF = function1;
        this.LJI = noticeMessage;
        this.LJII = c1427600nFm;
        this.LJIIIIZZ = list2;
        this.LJIIIZ = bool;
        this.LJIIJ = bool2;
        this.LJIIJJI = str;
    }
}
