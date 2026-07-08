package X;

import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListRequest;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i2O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227100i2O extends C1223510hwb {
    public final C20603715jn LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final List<String> LJI;
    public final GroupInviteListRequest LJII;
    public final C1227810i3X LJIIIIZZ;
    public final EnumC1224830hyj LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227100i2O)) {
            return false;
        }
        C1227100i2O c1227100i2O = (C1227100i2O) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1227100i2O.LIZLLL) && this.LJ == c1227100i2O.LJ && this.LJFF == c1227100i2O.LJFF && Intrinsics.LJFF(this.LJI, c1227100i2O.LJI) && Intrinsics.LJFF(this.LJII, c1227100i2O.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1227100i2O.LJIIIIZZ) && this.LJIIIZ == c1227100i2O.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1227100i2O.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c1227100i2O.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1227100i2O.LJIIL) && this.LJIILIIL == c1227100i2O.LJIILIIL;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZLLL.hashCode() * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31;
        List<String> list = this.LJI;
        int iHashCode2 = (((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31;
        String str = this.LJIIJJI;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.LJIIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILIIL);
    }

    public final String toString() {
        return "LiveInviteCTDSProtocolConfig(paginationConfig=" + this.LIZLLL + ", needReorder=" + this.LJ + ", showLoadingStatus=" + this.LJFF + ", alwaysSelectedAndDisableIdList=" + this.LJI + ", groupInviteListRequest=" + this.LJII + ", emptyStatusInfo=" + this.LJIIIIZZ + ", variant=" + this.LJIIIZ + ", conversationId=" + this.LJIIJ + ", firstSelectorIndexString=" + this.LJIIJJI + ", chatType=" + this.LJIIL + ", needLogInvitePeoplePageShow=" + this.LJIILIIL + ')';
    }

    @Override // X.C1223510hwb
    public final boolean LIZ() {
        return this.LJ;
    }

    @Override // X.C1223510hwb
    public final C20603715jn LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C1223510hwb
    public final boolean LIZJ() {
        return this.LJFF;
    }

    public C1227100i2O(C20603715jn c20603715jn, List list, GroupInviteListRequest groupInviteListRequest, C1227810i3X c1227810i3X, EnumC1224830hyj enumC1224830hyj, String str, String str2, String str3, boolean z) {
        super(c20603715jn, false, true);
        this.LIZLLL = c20603715jn;
        this.LJ = false;
        this.LJFF = true;
        this.LJI = list;
        this.LJII = groupInviteListRequest;
        this.LJIIIIZZ = c1227810i3X;
        this.LJIIIZ = enumC1224830hyj;
        this.LJIIJ = str;
        this.LJIIJJI = str2;
        this.LJIIL = str3;
        this.LJIILIIL = z;
    }
}
