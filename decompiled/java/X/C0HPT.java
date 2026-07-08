package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HPT, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HPT implements InterfaceC1891350zJl {
    public final int LL;
    public final C0HPS LLILLJJLI;
    public final int LLILLL;
    public final C439980HNc LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HPT)) {
            return false;
        }
        C0HPT c0hpt = (C0HPT) obj;
        return this.LL == c0hpt.LL && Intrinsics.LJFF(this.LLILLJJLI, c0hpt.LLILLJJLI) && this.LLILLL == c0hpt.LLILLL && Intrinsics.LJFF(this.LLILZ, c0hpt.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HomePageElementRowPowerItem(idType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", homePageElement=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", elementsPerRow=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", elementDisplayProducer=");
        sbLIZ.append(this.LLILZ);
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

    public C0HPT(int i, C0HPS c0hps, int i2, C439980HNc c439980HNc) {
        this.LL = i;
        this.LLILLJJLI = c0hps;
        this.LLILLL = i2;
        this.LLILZ = c439980HNc;
    }
}
