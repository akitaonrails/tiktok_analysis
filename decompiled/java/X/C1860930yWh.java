package X;

import android.view.View;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS178S0400000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860930yWh implements InterfaceC1891350zJl {
    public final int LL;
    public final String LLILLJJLI;
    public final long LLILLL;
    public final List<String> LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final Function2<Integer, View, Unit> LLIZ;
    public final Integer LLIZLLLIL;
    public final boolean LLJ;
    public final String LLJI;
    public final Integer LLJIJIL;
    public final TakoVideoItem LLJILJIL;
    public final C1920507ff LLJILJILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1860930yWh)) {
            return false;
        }
        C1860930yWh c1860930yWh = (C1860930yWh) obj;
        return this.LL == c1860930yWh.LL && Intrinsics.LJFF(this.LLILLJJLI, c1860930yWh.LLILLJJLI) && this.LLILLL == c1860930yWh.LLILLL && Intrinsics.LJFF(this.LLILZ, c1860930yWh.LLILZ) && this.LLILZIL == c1860930yWh.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c1860930yWh.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1860930yWh.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1860930yWh.LLIZLLLIL) && this.LLJ == c1860930yWh.LLJ && Intrinsics.LJFF(this.LLJI, c1860930yWh.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1860930yWh.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c1860930yWh.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, c1860930yWh.LLJILJILJ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LL * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Y2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        String str = this.LLILZLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Function2<Integer, View, Unit> function2 = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (function2 == null ? 0 : function2.hashCode())) * 31;
        Integer num = this.LLIZLLLIL;
        int iHashCode4 = (((iHashCode3 + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        String str2 = this.LLJI;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.LLJIJIL;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        TakoVideoItem takoVideoItem = this.LLJILJIL;
        int iHashCode7 = (iHashCode6 + (takoVideoItem == null ? 0 : takoVideoItem.hashCode())) * 31;
        C1920507ff c1920507ff = this.LLJILJILJ;
        return iHashCode7 + (c1920507ff != null ? c1920507ff.hashCode() : 0);
    }

    public final String toString() {
        return "NimbleVideoPowerItem(index=" + this.LL + ", awemeId=" + this.LLILLJJLI + ", diggCount=" + this.LLILLL + ", coverUrlList=" + this.LLILZ + ", showPlayIcon=" + this.LLILZIL + ", placeholderSourceId=" + this.LLILZLL + ", itemClickCallback=" + this.LLIZ + ", videoCount=" + this.LLIZLLLIL + ", showSup=" + this.LLJ + ", videoTag=" + this.LLJI + ", awemeType=" + this.LLJIJIL + ", data=" + this.LLJILJIL + ", uiConfig=" + this.LLJILJILJ + ')';
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1860930yWh(int i, String str, long j, List list, boolean z, String str2, AwS178S0400000_27 awS178S0400000_27, Integer num, boolean z2, String str3, Integer num2, TakoVideoItem takoVideoItem, C1920507ff c1920507ff) {
        this.LL = i;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = list;
        this.LLILZIL = z;
        this.LLILZLL = str2;
        this.LLIZ = awS178S0400000_27;
        this.LLIZLLLIL = num;
        this.LLJ = z2;
        this.LLJI = str3;
        this.LLJIJIL = num2;
        this.LLJILJIL = takoVideoItem;
        this.LLJILJILJ = c1920507ff;
    }
}
