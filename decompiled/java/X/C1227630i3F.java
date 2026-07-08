package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i3F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227630i3F extends C1224580hyK {
    public final boolean LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final C1224590hyL LJIIIZ;
    public final C1224590hyL LJIIJ;
    public final EnumC1224720hyY LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;
    public final Function1<Integer, String> LJIILL;
    public final Function1<C0Y8T, Unit> LJIILLIIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1227630i3F)) {
            return false;
        }
        C1227630i3F c1227630i3F = (C1227630i3F) obj;
        return this.LJI == c1227630i3F.LJI && Intrinsics.LJFF(this.LJII, c1227630i3F.LJII) && this.LJIIIIZZ == c1227630i3F.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c1227630i3F.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c1227630i3F.LJIIJ) && this.LJIIJJI == c1227630i3F.LJIIJJI && Intrinsics.LJFF(this.LJIIL, c1227630i3F.LJIIL) && this.LJIILIIL == c1227630i3F.LJIILIIL && this.LJIILJJIL == c1227630i3F.LJIILJJIL && Intrinsics.LJFF(this.LJIILL, c1227630i3F.LJIILL) && Intrinsics.LJFF(this.LJIILLIIL, c1227630i3F.LJIILLIIL);
    }

    public final int hashCode() {
        int iZ2 = ((((((((((C786410Ut5.Z2(this.LJI) * 31) + this.LJII.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIIZZ)) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31;
        String str = this.LJIIL;
        int iHashCode = (((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + C786410Ut5.Z2(this.LJIILJJIL)) * 31;
        Function1<Integer, String> function1 = this.LJIILL;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C0Y8T, Unit> function12 = this.LJIILLIIL;
        return iHashCode2 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        return "LiveCreateChatButtonProtocolConfig(defaultShowWidget=" + this.LJI + ", defaultButtonHint=" + this.LJII + ", showSeparator=" + this.LJIIIIZZ + ", defaultMainButtonState=" + this.LJIIIZ + ", defaultSecondButtonState=" + this.LJIIJ + ", defaultWidgetVariant=" + this.LJIIJJI + ", roomId=" + this.LJIIL + ", alwaysShow=" + this.LJIILIIL + ", needMetric=" + this.LJIILJJIL + ", mainButtonText=" + this.LJIILL + ", actionToConversation=" + this.LJIILLIIL + ')';
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

    public C1227630i3F(C1224590hyL c1224590hyL, C1224590hyL c1224590hyL2, EnumC1224720hyY enumC1224720hyY, AwS598S0100000_19 awS598S0100000_19, Function1 function1) {
        super(enumC1224720hyY, false, true, "", c1224590hyL, c1224590hyL2);
        this.LJI = false;
        this.LJII = "";
        this.LJIIIIZZ = true;
        this.LJIIIZ = c1224590hyL;
        this.LJIIJ = c1224590hyL2;
        this.LJIIJJI = enumC1224720hyY;
        this.LJIIL = "";
        this.LJIILIIL = true;
        this.LJIILJJIL = false;
        this.LJIILL = awS598S0100000_19;
        this.LJIILLIIL = function1;
    }
}
