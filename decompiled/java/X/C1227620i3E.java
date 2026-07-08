package X;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i3E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227620i3E extends C1224580hyK {
    public final boolean LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final C1224590hyL LJIIIZ;
    public final C1224590hyL LJIIJ;
    public final EnumC1224720hyY LJIIJJI;
    public final String LJIIL;
    public final C873240YNm LJIILIIL;
    public final Boolean LJIILJJIL;
    public final Function1<Integer, String> LJIILL;
    public final Function1<Integer, String> LJIILLIIL;
    public final List<String> LJIIZILJ;
    public final boolean LJIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227620i3E)) {
            return false;
        }
        C1227620i3E c1227620i3E = (C1227620i3E) obj;
        return this.LJI == c1227620i3E.LJI && Intrinsics.LJFF(this.LJII, c1227620i3E.LJII) && this.LJIIIIZZ == c1227620i3E.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1227620i3E.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1227620i3E.LJIIJ) && this.LJIIJJI == c1227620i3E.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1227620i3E.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1227620i3E.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1227620i3E.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1227620i3E.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1227620i3E.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c1227620i3E.LJIIZILJ) && this.LJIJ == c1227620i3E.LJIJ;
    }

    public final int hashCode() {
        int iZ2 = ((((((((((C786410Ut5.Z2(this.LJI) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31;
        String str = this.LJIIL;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        C873240YNm c873240YNm = this.LJIILIIL;
        int iHashCode2 = (iHashCode + (c873240YNm == null ? 0 : c873240YNm.hashCode())) * 31;
        Boolean bool = this.LJIILJJIL;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Function1<Integer, String> function1 = this.LJIILL;
        int iHashCode4 = (((iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31) + this.LJIILLIIL.hashCode()) * 31;
        List<String> list = this.LJIIZILJ;
        return ((iHashCode4 + (list != null ? list.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIJ);
    }

    public final String toString() {
        return "AddMemberButtonProtocolConfig(defaultShowWidget=" + this.LJI + ", defaultButtonHint=" + this.LJII + ", showSeparator=" + this.LJIIIIZZ + ", defaultMainButtonState=" + this.LJIIIZ + ", defaultSecondButtonState=" + this.LJIIJ + ", defaultWidgetVariant=" + this.LJIIJJI + ", conversationId=" + this.LJIIL + ", addMemberRequest=" + this.LJIILIIL + ", dismissConfirmWidgetWhenEmptySelect=" + this.LJIILJJIL + ", confirmButtonText=" + this.LJIILL + ", addMemberSuccessToast=" + this.LJIILLIIL + ", alwaysSelectedAndDisableIdList=" + this.LJIIZILJ + ", isPublicInvite=" + this.LJIJ + ')';
    }

    @Override // X.C1224580hyK
    public final String LIZ() {
        return this.LJII;
    }

    @Override // X.C1224580hyK
    public final C1224590hyL LIZIZ() {
        return this.LJIIIZ;
    }

    @Override // X.C1224580hyK
    public final C1224590hyL LIZJ() {
        return this.LJIIJ;
    }

    @Override // X.C1224580hyK
    public final boolean LIZLLL() {
        return this.LJI;
    }

    @Override // X.C1224580hyK
    public final EnumC1224720hyY LJ() {
        return this.LJIIJJI;
    }

    @Override // X.C1224580hyK
    public final boolean LJFF() {
        return this.LJIIIIZZ;
    }

    public C1227620i3E(String str, C1224590hyL c1224590hyL, C1224590hyL c1224590hyL2, EnumC1224720hyY enumC1224720hyY, String str2, C873240YNm c873240YNm, Boolean bool, Function1 function1, Function1 function12, List list, boolean z) {
        super(enumC1224720hyY, true, true, str, c1224590hyL, c1224590hyL2);
        this.LJI = true;
        this.LJII = str;
        this.LJIIIIZZ = true;
        this.LJIIIZ = c1224590hyL;
        this.LJIIJ = c1224590hyL2;
        this.LJIIJJI = enumC1224720hyY;
        this.LJIIL = str2;
        this.LJIILIIL = c873240YNm;
        this.LJIILJJIL = bool;
        this.LJIILL = function1;
        this.LJIILLIIL = function12;
        this.LJIIZILJ = list;
        this.LJIJ = z;
    }
}
