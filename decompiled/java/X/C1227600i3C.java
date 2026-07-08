package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS70S1000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i3C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227600i3C extends C1224580hyK {
    public final boolean LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final C1224590hyL LJIIIZ;
    public final C1224590hyL LJIIJ;
    public final EnumC1224720hyY LJIIJJI;
    public final String LJIIL;
    public final C0Y8T LJIILIIL;
    public final boolean LJIILJJIL;
    public final boolean LJIILL;
    public final Function1<Integer, String> LJIILLIIL;
    public final Function1<C0Y8T, Unit> LJIIZILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227600i3C)) {
            return false;
        }
        C1227600i3C c1227600i3C = (C1227600i3C) obj;
        return this.LJI == c1227600i3C.LJI && Intrinsics.LJFF(this.LJII, c1227600i3C.LJII) && this.LJIIIIZZ == c1227600i3C.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1227600i3C.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1227600i3C.LJIIJ) && this.LJIIJJI == c1227600i3C.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1227600i3C.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c1227600i3C.LJIILIIL) && this.LJIILJJIL == c1227600i3C.LJIILJJIL && this.LJIILL == c1227600i3C.LJIILL && Intrinsics.LJFF(this.LJIILLIIL, c1227600i3C.LJIILLIIL) && Intrinsics.LJFF(this.LJIIZILJ, c1227600i3C.LJIIZILJ);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((C786410Ut5.Z2(this.LJI) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31;
        String str = this.LJIIL;
        int iHashCode = (iZ2 + (str == null ? 0 : str.hashCode())) * 31;
        C0Y8T c0y8t = this.LJIILIIL;
        int iHashCode2 = (((((iHashCode + (c0y8t == null ? 0 : c0y8t.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31;
        Function1<Integer, String> function1 = this.LJIILLIIL;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C0Y8T, Unit> function12 = this.LJIIZILJ;
        return iHashCode3 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        return "LiveInviteContactButtonProtocolConfig(defaultShowWidget=" + this.LJI + ", defaultButtonHint=" + this.LJII + ", showSeparator=" + this.LJIIIIZZ + ", defaultMainButtonState=" + this.LJIIIZ + ", defaultSecondButtonState=" + this.LJIIJ + ", defaultWidgetVariant=" + this.LJIIJJI + ", roomId=" + this.LJIIL + ", selectedConversation=" + this.LJIILIIL + ", alwaysShow=" + this.LJIILJJIL + ", needMetric=" + this.LJIILL + ", mainButtonText=" + this.LJIILLIIL + ", actionToConversation=" + this.LJIIZILJ + ')';
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

    public C1227600i3C(C1224590hyL c1224590hyL, C1224590hyL c1224590hyL2, EnumC1224720hyY enumC1224720hyY, C0Y8T c0y8t, C5183020f c5183020f, AwS70S1000000_19 awS70S1000000_19) {
        super(enumC1224720hyY, true, true, "", c1224590hyL, c1224590hyL2);
        this.LJI = true;
        this.LJII = "";
        this.LJIIIIZZ = true;
        this.LJIIIZ = c1224590hyL;
        this.LJIIJ = c1224590hyL2;
        this.LJIIJJI = enumC1224720hyY;
        this.LJIIL = "";
        this.LJIILIIL = c0y8t;
        this.LJIILJJIL = true;
        this.LJIILL = false;
        this.LJIILLIIL = c5183020f;
        this.LJIIZILJ = awS70S1000000_19;
    }
}
