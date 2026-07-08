package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qth, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684870Qth implements InterfaceC684740QtU, InterfaceC1015900cXk {
    public final int LL;
    public final List<Aweme> LLILLJJLI;
    public final String LLILLL;
    public final boolean LLILZ;
    public final Integer LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final Integer LLIZLLLIL;
    public Float LLJ;
    public Float LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;

    public C684870Qth() {
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
        if (!(obj instanceof C684870Qth)) {
            return false;
        }
        C684870Qth c684870Qth = (C684870Qth) obj;
        return this.LL == c684870Qth.LL && Intrinsics.LJFF(this.LLILLJJLI, c684870Qth.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c684870Qth.LLILLL) && this.LLILZ == c684870Qth.LLILZ && Intrinsics.LJFF(this.LLILZIL, c684870Qth.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c684870Qth.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c684870Qth.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c684870Qth.LLIZLLLIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        Integer num = this.LLILZIL;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LLILZLL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZ;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.LLIZLLLIL;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextWithFoldDocItem(startLabelIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", videoList=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", itemId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", multiSummaryIndex=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", subTitle=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", snippet=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", displayLine=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLJI;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJIIIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC684740QtU
    public final int LJJJZ() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJJLI() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC684740QtU
    public final int LJJLIIJ() {
        return this.LL;
    }

    @Override // X.InterfaceC685020Qtw
    public final Integer LJLJLJ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC685020Qtw
    public final String getItemId() {
        return this.LLILLL;
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
        this.LLJI = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLJ = f;
    }

    @Override // X.InterfaceC685020Qtw
    public final void LJJLIIIJILLIZJL(boolean z) {
        this.LLJILJIL = z;
    }

    @Override // X.InterfaceC684740QtU
    public final void LLIIL(int i) {
        this.LLJIJIL = i;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C684900Qtk.LIZ(this, interfaceC1891350zJl);
    }

    public C684870Qth(int i, List list, Integer num, String str, String str2, Integer num2) {
        String strValueOf = String.valueOf(C321460Ciu.LIZ());
        this.LL = i;
        this.LLILLJJLI = list;
        this.LLILLL = strValueOf;
        this.LLILZ = false;
        this.LLILZIL = num;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = num2;
    }
}
