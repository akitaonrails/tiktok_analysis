package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684940Qto implements InterfaceC684740QtU, InterfaceC1015900cXk {
    public final String LL;
    public final String LLILLJJLI;
    public final Boolean LLILLL;
    public final int LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public final List<Aweme> LLIZ;
    public final boolean LLIZLLLIL;
    public final Integer LLJ;
    public final String LLJI;
    public Float LLJIJIL;
    public Float LLJILJIL;
    public int LLJILJILJ;
    public boolean LLJILLL;

    public C684940Qto() {
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
        if (!(obj instanceof C684940Qto)) {
            return false;
        }
        C684940Qto c684940Qto = (C684940Qto) obj;
        return Intrinsics.LJFF(this.LL, c684940Qto.LL) && Intrinsics.LJFF(this.LLILLJJLI, c684940Qto.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c684940Qto.LLILLL) && this.LLILZ == c684940Qto.LLILZ && Intrinsics.LJFF(this.LLILZIL, c684940Qto.LLILZIL) && this.LLILZLL == c684940Qto.LLILZLL && Intrinsics.LJFF(this.LLIZ, c684940Qto.LLIZ) && this.LLIZLLLIL == c684940Qto.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c684940Qto.LLJ) && Intrinsics.LJFF(this.LLJI, c684940Qto.LLJI);
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
        Boolean bool = this.LLILLL;
        int iHashCode3 = (((((((((((iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LLILZ) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL) * 31) + this.LLIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31;
        Integer num = this.LLJ;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.LLJI;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FoldableSectionHeaderItem(foldId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", foldTitle=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", defaultOpen=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", sectionIndex=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", startLabelIndex=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", videoList=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", multiSummaryIndex=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJIIIZ() {
        return this.LLIZLLLIL;
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
        return this.LLILZLL;
    }

    @Override // X.InterfaceC685020Qtw
    public final Integer LJLJLJ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC685020Qtw
    public final String getItemId() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC685020Qtw
    public final String getSubTitle() {
        return this.LLJI;
    }

    @Override // X.InterfaceC684740QtU
    public final List<Aweme> getVideoList() {
        return this.LLIZ;
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

    public C684940Qto(String str, String str2, Boolean bool, int i, boolean z, Integer num, int i2) {
        String strValueOf;
        C13BV c13bv;
        i = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            strValueOf = String.valueOf(C321460Ciu.LIZ());
        } else {
            strValueOf = null;
        }
        if ((i2 & 64) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        z = (i2 & 128) != 0 ? false : z;
        num = (i2 & 256) != 0 ? null : num;
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = bool;
        this.LLILZ = i;
        this.LLILZIL = strValueOf;
        this.LLILZLL = 0;
        this.LLIZ = c13bv;
        this.LLIZLLLIL = z;
        this.LLJ = num;
        this.LLJI = null;
        this.LLJILJIL = Float.valueOf(0.0f);
    }
}
