package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yS2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858040yS2 extends C1856450yPT implements InterfaceC1891350zJl {
    public final C326960Crm LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final boolean LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1858040yS2)) {
            return false;
        }
        C1858040yS2 c1858040yS2 = (C1858040yS2) obj;
        return Intrinsics.LJFF(this.LLIZLLLIL, c1858040yS2.LLIZLLLIL) && this.LLJ == c1858040yS2.LLJ && this.LLJI == c1858040yS2.LLJI && this.LLJIJIL == c1858040yS2.LLJIJIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LLIZLLLIL.hashCode() * 31) + this.LLJ) * 31) + this.LLJI) * 31) + C786410Ut5.Z2(this.LLJIJIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoMiddlePageSugCardItem(sug=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", sugIndex=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", totalSugCount=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", isLoading=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858040yS2) {
            if (areItemTheSame(interfaceC1891350zJl)) {
                C1858040yS2 c1858040yS2 = (C1858040yS2) interfaceC1891350zJl;
                if (Intrinsics.LJFF(this.LLIZLLLIL, c1858040yS2.LLIZLLLIL) && this.LLJIJIL == c1858040yS2.LLJIJIL) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858040yS2) {
            if (this.LLJ == ((C1858040yS2) interfaceC1891350zJl).LLJ) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1858040yS2(C326960Crm c326960Crm, int i, int i2, boolean z) {
        super(c326960Crm, i);
        this.LLIZLLLIL = c326960Crm;
        this.LLJ = i;
        this.LLJI = i2;
        this.LLJIJIL = z;
    }
}
