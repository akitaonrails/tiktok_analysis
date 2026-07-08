package X;

import android.app.Activity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i3D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227610i3D extends C1224580hyK {
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
    public final InterfaceC1631620sYq<Activity, String, List<C0YAE>, Unit> LJIJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227610i3D)) {
            return false;
        }
        C1227610i3D c1227610i3D = (C1227610i3D) obj;
        return this.LJI == c1227610i3D.LJI && Intrinsics.LJFF(this.LJII, c1227610i3D.LJII) && this.LJIIIIZZ == c1227610i3D.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1227610i3D.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1227610i3D.LJIIJ) && this.LJIIJJI == c1227610i3D.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1227610i3D.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1227610i3D.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c1227610i3D.LJIILJJIL) && Intrinsics.LJFF(this.LJIILL, c1227610i3D.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1227610i3D.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c1227610i3D.LJIIZILJ) && this.LJIJ == c1227610i3D.LJIJ && Intrinsics.LJFF(this.LJIJI, c1227610i3D.LJIJI);
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
        int iHashCode5 = (((iHashCode4 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LJIJ)) * 31;
        InterfaceC1631620sYq<Activity, String, List<C0YAE>, Unit> interfaceC1631620sYq = this.LJIJI;
        return iHashCode5 + (interfaceC1631620sYq != null ? interfaceC1631620sYq.hashCode() : 0);
    }

    public final String toString() {
        return "LiveInviteButtonProtocolConfig(defaultShowWidget=" + this.LJI + ", defaultButtonHint=" + this.LJII + ", showSeparator=" + this.LJIIIIZZ + ", defaultMainButtonState=" + this.LJIIIZ + ", defaultSecondButtonState=" + this.LJIIJ + ", defaultWidgetVariant=" + this.LJIIJJI + ", conversationId=" + this.LJIIL + ", addMemberRequest=" + this.LJIILIIL + ", dismissConfirmWidgetWhenEmptySelect=" + this.LJIILJJIL + ", confirmButtonText=" + this.LJIILL + ", addMemberSuccessToast=" + this.LJIILLIIL + ", alwaysSelectedAndDisableIdList=" + this.LJIIZILJ + ", isPublicInvite=" + this.LJIJ + ", onAddMemberSuccess=" + this.LJIJI + ')';
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

    public C1227610i3D(C1224590hyL c1224590hyL, C1224590hyL c1224590hyL2, EnumC1224720hyY enumC1224720hyY, String str, C873240YNm c873240YNm, Boolean bool, Function1 function1, Function1 function12, List list, boolean z, InterfaceC1631620sYq interfaceC1631620sYq) {
        super(enumC1224720hyY, true, true, "", c1224590hyL, c1224590hyL2);
        this.LJI = true;
        this.LJII = "";
        this.LJIIIIZZ = true;
        this.LJIIIZ = c1224590hyL;
        this.LJIIJ = c1224590hyL2;
        this.LJIIJJI = enumC1224720hyY;
        this.LJIIL = str;
        this.LJIILIIL = c873240YNm;
        this.LJIILJJIL = bool;
        this.LJIILL = function1;
        this.LJIILLIIL = function12;
        this.LJIIZILJ = list;
        this.LJIJ = z;
        this.LJIJI = interfaceC1631620sYq;
    }
}
