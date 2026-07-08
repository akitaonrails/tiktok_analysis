package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464810oDn implements InterfaceC1461640o8g<C1678260tm4> {
    public final boolean LIZ;
    public final EnumC1462540oA8 LIZIZ;
    public final C1464760oDi LIZJ;
    public final VideoPublishEditModel LIZLLL;
    public final C1659490tHn LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final Unit LJII;
    public final boolean LJIIIIZZ;
    public final EnumC441770HTz LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1464810oDn)) {
            return false;
        }
        C1464810oDn c1464810oDn = (C1464810oDn) obj;
        return this.LIZ == c1464810oDn.LIZ && this.LIZIZ == c1464810oDn.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1464810oDn.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1464810oDn.LIZLLL) && Intrinsics.LJFF(this.LJ, c1464810oDn.LJ) && this.LJFF == c1464810oDn.LJFF && this.LJI == c1464810oDn.LJI && Intrinsics.LJFF(this.LJII, c1464810oDn.LJII) && this.LJIIIIZZ == c1464810oDn.LJIIIIZZ && this.LJIIIZ == c1464810oDn.LJIIIZ;
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        C1659490tHn c1659490tHn = this.LJ;
        int iHashCode = (((((iZ2 + (c1659490tHn == null ? 0 : c1659490tHn.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31;
        Unit unit = this.LJII;
        int iHashCode2 = (((iHashCode + (unit == null ? 0 : unit.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31;
        EnumC441770HTz enumC441770HTz = this.LJIIIZ;
        return iHashCode2 + (enumC441770HTz != null ? enumC441770HTz.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiLiveToolbarUiState(shouldShowBanner=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uiStyle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", model=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", progressModel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showProgressBar=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", enableProgressBar=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", enterEntranceEvent=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", selected=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", promoteViewState=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1464810oDn(boolean z, EnumC1462540oA8 enumC1462540oA8, C1464760oDi c1464760oDi, VideoPublishEditModel videoPublishEditModel, C1659490tHn c1659490tHn, boolean z2, boolean z3, Unit unit, boolean z4, EnumC441770HTz enumC441770HTz) {
        this.LIZ = z;
        this.LIZIZ = enumC1462540oA8;
        this.LIZJ = c1464760oDi;
        this.LIZLLL = videoPublishEditModel;
        this.LJ = c1659490tHn;
        this.LJFF = z2;
        this.LJI = z3;
        this.LJII = unit;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = enumC441770HTz;
    }

    public static C1464810oDn LIZ(C1464810oDn c1464810oDn, EnumC1462540oA8 enumC1462540oA8, C1464760oDi c1464760oDi, C1659490tHn c1659490tHn, boolean z, boolean z2, Unit unit, boolean z3, EnumC441770HTz enumC441770HTz, int i) {
        boolean z4;
        VideoPublishEditModel videoPublishEditModel;
        EnumC441770HTz enumC441770HTz2 = enumC441770HTz;
        boolean z5 = z3;
        Unit unit2 = unit;
        boolean z6 = z;
        C1659490tHn c1659490tHn2 = c1659490tHn;
        C1464760oDi c1464760oDi2 = c1464760oDi;
        boolean z7 = z2;
        EnumC1462540oA8 enumC1462540oA82 = enumC1462540oA8;
        if ((i & 1) != 0) {
            z4 = c1464810oDn.LIZ;
        } else {
            z4 = false;
        }
        if ((i & 2) != 0) {
            enumC1462540oA82 = c1464810oDn.LIZIZ;
        }
        if ((i & 4) != 0) {
            c1464760oDi2 = c1464810oDn.LIZJ;
        }
        if ((i & 8) != 0) {
            videoPublishEditModel = c1464810oDn.LIZLLL;
        } else {
            videoPublishEditModel = null;
        }
        if ((i & 16) != 0) {
            c1659490tHn2 = c1464810oDn.LJ;
        }
        if ((i & 32) != 0) {
            z6 = c1464810oDn.LJFF;
        }
        if ((i & 64) != 0) {
            z7 = c1464810oDn.LJI;
        }
        if ((i & 128) != 0) {
            unit2 = c1464810oDn.LJII;
        }
        if ((i & 256) != 0) {
            z5 = c1464810oDn.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            enumC441770HTz2 = c1464810oDn.LJIIIZ;
        }
        c1464810oDn.getClass();
        return new C1464810oDn(z4, enumC1462540oA82, c1464760oDi2, videoPublishEditModel, c1659490tHn2, z6, z7, unit2, z5, enumC441770HTz2);
    }
}
