package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684770QtX implements InterfaceC684960Qtq, InterfaceC685020Qtw, InterfaceC1015900cXk {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final Integer LLILZ;
    public final boolean LLILZIL;
    public final boolean LLILZLL;
    public final Integer LLIZ;
    public Float LLIZLLLIL;
    public Float LLJ;
    public final long LLJI;
    public final String LLJIJIL;
    public boolean LLJILJIL;

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C684770QtX)) {
            return false;
        }
        C684770QtX c684770QtX = (C684770QtX) obj;
        return Intrinsics.LJFF(this.LL, c684770QtX.LL) && Intrinsics.LJFF(this.LLILLJJLI, c684770QtX.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c684770QtX.LLILLL) && Intrinsics.LJFF(this.LLILZ, c684770QtX.LLILZ) && this.LLILZIL == c684770QtX.LLILZIL && this.LLILZLL == c684770QtX.LLILZLL && Intrinsics.LJFF(this.LLIZ, c684770QtX.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c684770QtX.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c684770QtX.LLJ) && this.LLJI == c684770QtX.LLJI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LLILZ;
        int iHashCode4 = (((((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31;
        Integer num2 = this.LLIZ;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f = this.LLIZLLLIL;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.LLJ;
        return ((iHashCode6 + (f2 != null ? f2.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LLJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarkDownItem(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", snippet=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", displayLine=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", showSubTitle=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", multiSummaryIndex=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", topSpaceDP=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", bottomSpaceDP=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", cardVersionId=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC684960Qtq
    public final C1263404wy LJJIIJ() {
        return C684950Qtp.LIZ();
    }

    @Override // X.InterfaceC684960Qtq
    public final boolean LIZLLL() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJIIIZ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJJLI() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC685020Qtw
    public final Integer LJLJLJ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC684960Qtq
    public final String getContent() {
        return this.LL;
    }

    @Override // X.InterfaceC684960Qtq
    public final Integer getDisplayLine() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC685020Qtw
    public final String getItemId() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC684960Qtq
    public final String getSnippet() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC685020Qtw
    public final String getSubTitle() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLJ = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLIZLLLIL = f;
    }

    @Override // X.InterfaceC685020Qtw
    public final void LJJLIIIJILLIZJL(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (Intrinsics.LJFF(interfaceC1891350zJl, this) && (interfaceC1891350zJl instanceof C684770QtX) && ((C684770QtX) interfaceC1891350zJl).LLJI == this.LLJI) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C684770QtX) && Intrinsics.LJFF(this.LLIZ, ((C684770QtX) interfaceC1891350zJl).LLIZ)) {
            return true;
        }
        return false;
    }

    public C684770QtX(String str, String str2, String str3, Integer num, boolean z, boolean z2, Integer num2, Float f, Float f2, long j, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        num = (i & 8) != 0 ? null : num;
        z = (i & 16) != 0 ? false : z;
        z2 = (i & 32) != 0 ? true : z2;
        num2 = (i & 64) != 0 ? null : num2;
        f = (i & 128) != 0 ? null : f;
        f2 = (i & 256) != 0 ? null : f2;
        j = (i & 512) != 0 ? 0L : j;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = num;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = num2;
        this.LLIZLLLIL = f;
        this.LLJ = f2;
        this.LLJI = j;
        this.LLJIJIL = String.valueOf(C321460Ciu.LIZ());
        C1839007Ie.LIZ();
    }
}
