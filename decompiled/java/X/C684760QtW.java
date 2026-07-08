package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QtW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684760QtW implements InterfaceC684740QtU, InterfaceC684960Qtq, InterfaceC1015900cXk {
    public final int LL;
    public final List<Aweme> LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final Integer LLIZLLLIL;
    public final boolean LLJ;
    public final Integer LLJI;
    public Float LLJIJIL;
    public Float LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;

    public C684760QtW() {
        throw null;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C684760QtW)) {
            return false;
        }
        C684760QtW c684760QtW = (C684760QtW) obj;
        return this.LL == c684760QtW.LL && Intrinsics.LJFF(this.LLILLJJLI, c684760QtW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c684760QtW.LLILLL) && this.LLILZ == c684760QtW.LLILZ && Intrinsics.LJFF(this.LLILZIL, c684760QtW.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c684760QtW.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c684760QtW.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c684760QtW.LLIZLLLIL) && this.LLJ == c684760QtW.LLJ && Intrinsics.LJFF(this.LLJI, c684760QtW.LLJI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        String str = this.LLILZIL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LLIZLLLIL;
        int iHashCode5 = (((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        Integer num2 = this.LLJI;
        return iHashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MarkdownWithMultiDocItem(startLabelIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", videoList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", snippet=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", displayLine=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", showSubTitle=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", multiSummaryIndex=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC684960Qtq
    public final boolean LJ() {
        return C684950Qtp.LIZIZ(this);
    }

    @Override // X.InterfaceC684960Qtq
    public final C1263404wy LJJIIJ() {
        return C684950Qtp.LIZ();
    }

    @Override // X.InterfaceC684960Qtq
    public final boolean LIZLLL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJIIIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC684740QtU
    public final int LJJJZ() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJJLI() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC684740QtU
    public final int LJJLIIJ() {
        return this.LL;
    }

    @Override // X.InterfaceC685020Qtw
    public final Integer LJLJLJ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC684960Qtq
    public final String getContent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC684960Qtq
    public final Integer getDisplayLine() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC685020Qtw
    public final String getItemId() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC684960Qtq
    public final String getSnippet() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC685020Qtw
    public final String getSubTitle() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC684740QtU
    public final List<Aweme> getVideoList() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLJILJIL = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLJIJIL = f;
    }

    @Override // X.InterfaceC685020Qtw
    public final void LJJLIIIJILLIZJL(boolean z) {
        this.LLJILLL = z;
    }

    @Override // X.InterfaceC684740QtU
    public final void LLIIL(int i) {
        this.LLJILJILJ = i;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C684900Qtk.LIZ(this, interfaceC1891350zJl);
    }

    public C684760QtW(int i, List list, String str, boolean z, String str2, String str3, String str4, Integer num, boolean z2, Integer num2, int i2) {
        str = (i2 & 4) != 0 ? String.valueOf(C321460Ciu.LIZ()) : str;
        z = (i2 & 8) != 0 ? false : z;
        Float fValueOf = null;
        str2 = (i2 & 16) != 0 ? null : str2;
        str3 = (i2 & 32) != 0 ? null : str3;
        str4 = (i2 & 64) != 0 ? null : str4;
        num = (i2 & 128) != 0 ? null : num;
        z2 = (i2 & 256) != 0 ? true : z2;
        num2 = (i2 & 512) != 0 ? null : num2;
        this.LL = i;
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = num;
        this.LLJ = z2;
        this.LLJI = num2;
        if (C07GH.LIZ() && !C684950Qtp.LIZIZ(this)) {
            fValueOf = Float.valueOf(4.0f);
        }
        this.LLJIJIL = fValueOf;
        C1839007Ie.LIZ();
    }
}
