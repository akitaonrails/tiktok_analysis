package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lL4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1354000lL4 implements InterfaceC1353990lL3 {
    public final Aweme LL;
    public final Boolean LLILLJJLI;
    public final Boolean LLILLL;
    public final int LLILZ;
    public InterfaceC665370Q7z LLILZIL;
    public final boolean LLILZLL;
    public final boolean LLIZ;
    public final boolean LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final String LLJIJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1354000lL4)) {
            return false;
        }
        C1354000lL4 c1354000lL4 = (C1354000lL4) obj;
        return Intrinsics.LJFF(this.LL, c1354000lL4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1354000lL4.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1354000lL4.LLILLL) && this.LLILZ == c1354000lL4.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1354000lL4.LLILZIL) && this.LLILZLL == c1354000lL4.LLILZLL && this.LLIZ == c1354000lL4.LLIZ && this.LLIZLLLIL == c1354000lL4.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c1354000lL4.LLJ) && Intrinsics.LJFF(this.LLJI, c1354000lL4.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c1354000lL4.LLJIJIL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Boolean bool = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLILLL;
        int iHashCode3 = (((iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.LLILZ) * 31;
        InterfaceC665370Q7z interfaceC665370Q7z = this.LLILZIL;
        int iHashCode4 = (((((((((iHashCode3 + (interfaceC665370Q7z == null ? 0 : interfaceC665370Q7z.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZLL)) * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Z2(this.LLIZLLLIL)) * 31) + this.LLJ.hashCode()) * 31;
        String str = this.LLJI;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLJIJIL;
        return iHashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "NowImageItem(aweme=" + this.LL + ", isEmptyCellItem=" + this.LLILLJJLI + ", isMyPostLoading=" + this.LLILLL + ", nowFeedType=" + this.LLILZ + ", scope=" + this.LLILZIL + ", isAggregatedChild=" + this.LLILZLL + ", isFakeItem=" + this.LLIZ + ", isInFeedViewHolder=" + this.LLIZLLLIL + ", recommendPosition=" + this.LLJ + ", insertItemEnterFrom=" + this.LLJI + ", insertItemEnterPosition=" + this.LLJIJIL + ')';
    }

    @Override // X.InterfaceC1353990lL3
    public final boolean LJJZZI() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1353860lKq
    public final String LJLLI() {
        return this.LLJI;
    }

    @Override // X.InterfaceC1353990lL3
    public final boolean LJLLLLLL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1353990lL3
    public final String LLF() {
        return this.LLJ;
    }

    @Override // X.InterfaceC1353860lKq
    public final String LLIIII() {
        return this.LLJIJIL;
    }

    @Override // X.InterfaceC1353860lKq
    public final Boolean LLILLJJLI() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1353990lL3
    public final boolean LLJIJIL() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1353990lL3
    public final Boolean LLJJLIIIJLLLLLLLZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1353860lKq
    public final int LLJLLL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1353860lKq, X.C0OB8
    public final Aweme getAweme() {
        return this.LL;
    }

    @Override // X.InterfaceC1353990lL3
    public final InterfaceC665370Q7z getScope() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1353990lL3
    public final void LJL(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLILZIL = null;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1353980lL2.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1353980lL2.LIZIZ(this, interfaceC1891350zJl);
    }

    public C1354000lL4(Aweme aweme, Boolean bool, Boolean bool2, int i, InterfaceC665370Q7z interfaceC665370Q7z, boolean z, boolean z2, boolean z3, String str, String str2, String str3) {
        this.LL = aweme;
        this.LLILLJJLI = bool;
        this.LLILLL = bool2;
        this.LLILZ = i;
        this.LLILZIL = interfaceC665370Q7z;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = z3;
        this.LLJ = str;
        this.LLJI = str2;
        this.LLJIJIL = str3;
    }
}
