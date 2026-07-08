package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QtV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C684750QtV implements InterfaceC684740QtU, InterfaceC684960Qtq, InterfaceC1015900cXk {
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
    public final boolean LLJIJIL;
    public Float LLJILJIL;
    public Float LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;

    public C684750QtV() {
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
        if (!(obj instanceof C684750QtV)) {
            return false;
        }
        C684750QtV c684750QtV = (C684750QtV) obj;
        return this.LL == c684750QtV.LL && Intrinsics.LJFF(this.LLILLJJLI, c684750QtV.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c684750QtV.LLILLL) && this.LLILZ == c684750QtV.LLILZ && Intrinsics.LJFF(this.LLILZIL, c684750QtV.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c684750QtV.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c684750QtV.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c684750QtV.LLIZLLLIL) && this.LLJ == c684750QtV.LLJ && Intrinsics.LJFF(this.LLJI, c684750QtV.LLJI) && this.LLJIJIL == c684750QtV.LLJIJIL;
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
        return ((iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJIJIL);
    }

    public final String toString() {
        return "TextWithMultiDocItem(startLabelIndex=" + this.LL + ", videoList=" + this.LLILLJJLI + ", itemId=" + this.LLILLL + ", isPage=" + this.LLILZ + ", content=" + this.LLILZIL + ", subTitle=" + this.LLILZLL + ", snippet=" + this.LLIZ + ", displayLine=" + this.LLIZLLLIL + ", showSubTitle=" + this.LLJ + ", multiSummaryIndex=" + this.LLJI + ", isInVisualSearch=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC684960Qtq
    public final boolean LJ() {
        String str = this.LLILZLL;
        return !(str == null || str.length() == 0) || C684950Qtp.LIZIZ(this);
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
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJIIIZ() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC684740QtU
    public final int LJJJZ() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC685020Qtw
    public final boolean LJJLI() {
        return this.LLJJ;
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
        this.LLJILJILJ = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLJILJIL = f;
    }

    @Override // X.InterfaceC685020Qtw
    public final void LJJLIIIJILLIZJL(boolean z) {
        this.LLJJ = z;
    }

    @Override // X.InterfaceC684740QtU
    public final void LLIIL(int i) {
        this.LLJILLL = i;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (this.LLJIJIL) {
            if (interfaceC1891350zJl instanceof C684750QtV) {
                C684750QtV c684750QtV = (C684750QtV) interfaceC1891350zJl;
                if (c684750QtV.LLILLJJLI.size() == this.LLILLJJLI.size()) {
                    List<Aweme> list = c684750QtV.LLILLJJLI;
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<Aweme> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(it2.next().getAid());
                    }
                    String string = arrayList.toString();
                    List<Aweme> list2 = this.LLILLJJLI;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    Iterator<Aweme> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(it3.next().getAid());
                    }
                    if (Intrinsics.LJFF(string, arrayList2.toString())) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return C684900Qtk.LIZ(this, interfaceC1891350zJl);
    }

    public C684750QtV(int i, List list, String str, String str2, String str3, Integer num, boolean z, Integer num2, boolean z2, int i2) {
        String strValueOf;
        Float fValueOf = null;
        if ((i2 & 4) != 0) {
            strValueOf = String.valueOf(C321460Ciu.LIZ());
        } else {
            strValueOf = null;
        }
        str = (i2 & 16) != 0 ? null : str;
        str2 = (i2 & 32) != 0 ? null : str2;
        str3 = (i2 & 64) != 0 ? null : str3;
        num = (i2 & 128) != 0 ? null : num;
        z = (i2 & 256) != 0 ? true : z;
        num2 = (i2 & 512) != 0 ? null : num2;
        z2 = (i2 & 1024) != 0 ? false : z2;
        this.LL = i;
        this.LLILLJJLI = list;
        this.LLILLL = strValueOf;
        this.LLILZ = false;
        this.LLILZIL = str;
        this.LLILZLL = str2;
        this.LLIZ = str3;
        this.LLIZLLLIL = num;
        this.LLJ = z;
        this.LLJI = num2;
        this.LLJIJIL = z2;
        if (C07GH.LIZ() && !LJ()) {
            fValueOf = Float.valueOf(4.0f);
        }
        this.LLJILJIL = fValueOf;
        C1839007Ie.LIZ();
    }
}
