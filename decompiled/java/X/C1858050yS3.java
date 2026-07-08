package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858050yS3 extends C1856450yPT implements InterfaceC1891350zJl {
    public final C326960Crm LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1858050yS3)) {
            return false;
        }
        C1858050yS3 c1858050yS3 = (C1858050yS3) obj;
        return Intrinsics.LJFF(this.LLIZLLLIL, c1858050yS3.LLIZLLLIL) && this.LLJ == c1858050yS3.LLJ && this.LLJI == c1858050yS3.LLJI && this.LLJIJIL == c1858050yS3.LLJIJIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LLIZLLLIL.hashCode() * 31) + this.LLJ) * 31) + this.LLJI) * 31) + this.LLJIJIL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoSugCardItem(sug=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", sugIndex=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", totalSugCount=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", sugStyle=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858050yS3) {
            if (areItemTheSame(interfaceC1891350zJl) && Intrinsics.LJFF(this.LLIZLLLIL, ((C1858050yS3) interfaceC1891350zJl).LLIZLLLIL)) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1858050yS3) {
            if (this.LLJ == ((C1858050yS3) interfaceC1891350zJl).LLJ) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1858050yS3(C326960Crm c326960Crm, int i, int i2, int i3) {
        super(c326960Crm, i);
        this.LLIZLLLIL = c326960Crm;
        this.LLJ = i;
        this.LLJI = i2;
        this.LLJIJIL = i3;
    }
}
