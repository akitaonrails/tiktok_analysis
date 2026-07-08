package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lus, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558200Lus extends AbstractC558210Lut {
    public final boolean LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;
    public final String LLJI;
    public final String LLJIJIL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C558200Lus() {
        String str = null;
        this(str, str, str, str, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C558200Lus)) {
            return false;
        }
        C558200Lus c558200Lus = (C558200Lus) obj;
        return this.LLILZLL == c558200Lus.LLILZLL && Intrinsics.LJFF(this.LLIZ, c558200Lus.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c558200Lus.LLIZLLLIL) && this.LLJ == c558200Lus.LLJ && Intrinsics.LJFF(this.LLJI, c558200Lus.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c558200Lus.LLJIJIL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LLILZLL) * 31;
        String str = this.LLIZ;
        int iHashCode = (((((iZ2 + (str == null ? 0 : str.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        String str2 = this.LLJI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJIJIL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text2ImageItem(isSelected=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", uri=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", textKey=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isDefault=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", aiTaskId=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC558210Lut
    public final String LIZIZ() {
        return this.LLJI;
    }

    @Override // X.AbstractC558210Lut
    public final String LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC558210Lut
    public final String LJ() {
        return this.LLIZ;
    }

    @Override // X.AbstractC558210Lut
    public final boolean LJI() {
        return this.LLJ;
    }

    @Override // X.AbstractC558210Lut
    public final boolean isSelected() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC558210Lut
    public final AbstractC558210Lut LIZ(boolean z) {
        return new C558200Lus(this.LLIZ, this.LLIZLLLIL, this.LLJI, this.LLJIJIL, z, this.LLJ);
    }

    @Override // X.AbstractC558210Lut, X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C558200Lus)) {
            return false;
        }
        C558200Lus c558200Lus = (C558200Lus) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c558200Lus.LLIZ, this.LLIZ) || c558200Lus.LLILZLL != this.LLILZLL || !Intrinsics.LJFF(c558200Lus.LLIZLLLIL, this.LLIZLLLIL) || !Intrinsics.LJFF(c558200Lus.LLJI, this.LLJI) || !Intrinsics.LJFF(c558200Lus.LLJIJIL, this.LLJIJIL)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC558210Lut, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C558200Lus)) {
            return false;
        }
        C558200Lus c558200Lus = (C558200Lus) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(c558200Lus.LLIZ, this.LLIZ) || !Intrinsics.LJFF(c558200Lus.LLJI, this.LLJI) || !Intrinsics.LJFF(c558200Lus.LLJIJIL, this.LLJIJIL)) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC558210Lut, X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C558190Lur) {
            return new Object() { // from class: X.0Luw
            };
        }
        return null;
    }

    public /* synthetic */ C558200Lus(String str, String str2, String str3, String str4, int i) {
        this((i & 2) != 0 ? null : str, (i & 4) != 0 ? "" : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null, false, false);
    }

    public C558200Lus(String str, String str2, String str3, String str4, boolean z, boolean z2) {
        super(0);
        this.LLILZLL = z;
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = z2;
        this.LLJI = str3;
        this.LLJIJIL = str4;
    }
}
