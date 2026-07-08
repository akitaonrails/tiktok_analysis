package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS464S0200000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12NU, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12NU extends C1856450yPT implements InterfaceC1891350zJl {
    public final C326960Crm LLIZLLLIL;
    public final int LLJ;
    public final Function2<View, C12NU, Unit> LLJI;
    public final Function2<View, C12NU, Unit> LLJIJIL;
    public final InterfaceC665370Q7z LLJILJIL;
    public final boolean LLJILJILJ;

    public C12NU() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12NU)) {
            return false;
        }
        C12NU c12nu = (C12NU) obj;
        return Intrinsics.LJFF(this.LLIZLLLIL, c12nu.LLIZLLLIL) && this.LLJ == c12nu.LLJ && Intrinsics.LJFF(this.LLJI, c12nu.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c12nu.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c12nu.LLJILJIL) && this.LLJILJILJ == c12nu.LLJILJILJ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LLIZLLLIL.hashCode() * 31) + this.LLJ) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLJILJIL;
        return ((iHashCode + (interfaceC665370Q7z == null ? 0 : interfaceC665370Q7z.hashCode())) * 31) + C786410Ut5.Z2(this.LLJILJILJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMixCardSugItem(sug=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", sugIndex=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", clickCallback=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", showCallback=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", vScope=");
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(", showIcon=");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C12NU(C326960Crm c326960Crm, int i, AwS464S0200000_29 awS464S0200000_29, AwS464S0200000_29 awS464S0200000_292, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(c326960Crm, i);
        this.LLIZLLLIL = c326960Crm;
        this.LLJ = i;
        this.LLJI = awS464S0200000_29;
        this.LLJIJIL = awS464S0200000_292;
        this.LLJILJIL = interfaceC665370Q7z;
        this.LLJILJILJ = true;
    }
}
