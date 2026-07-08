package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS643S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12NV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12NV extends C1856450yPT implements InterfaceC1891350zJl {
    public final C326960Crm LLIZLLLIL;
    public final int LLJ;
    public final Function2<View, C12NV, Unit> LLJI;
    public final Function2<View, C12NV, Unit> LLJIJIL;
    public final InterfaceC665370Q7z LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12NV)) {
            return false;
        }
        C12NV c12nv = (C12NV) obj;
        return Intrinsics.LJFF(this.LLIZLLLIL, c12nv.LLIZLLLIL) && this.LLJ == c12nv.LLJ && Intrinsics.LJFF(this.LLJI, c12nv.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c12nv.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c12nv.LLJILJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LLIZLLLIL.hashCode() * 31) + this.LLJ) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLJILJIL;
        return iHashCode + (interfaceC665370Q7z == null ? 0 : interfaceC665370Q7z.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoContainerSugItem(sug=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", sugIndex=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", clickCallback=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", showCallback=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", vScope=");
        sbLIZ.append(this.LLJILJIL);
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

    public C12NV(C326960Crm c326960Crm, int i, AwS643S0100000_29 awS643S0100000_29, AwS643S0100000_29 awS643S0100000_292, InterfaceC665370Q7z interfaceC665370Q7z) {
        super(c326960Crm, i);
        this.LLIZLLLIL = c326960Crm;
        this.LLJ = i;
        this.LLJI = awS643S0100000_29;
        this.LLJIJIL = awS643S0100000_292;
        this.LLJILJIL = interfaceC665370Q7z;
    }
}
