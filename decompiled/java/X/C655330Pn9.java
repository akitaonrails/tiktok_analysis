package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pn9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655330Pn9 implements InterfaceC645880PVa, InterfaceC435460H5s, InterfaceC655340PnA {
    public final SearchMixFeed LL;
    public final Aweme LLILLJJLI;
    public final InterfaceC655070Pmj LLILLL;
    public final C650430PfF LLILZ = new C650430PfF(new AwS589S0100000_10(this, 496));

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C655330Pn9)) {
            return false;
        }
        C655330Pn9 c655330Pn9 = (C655330Pn9) obj;
        return Intrinsics.LJFF(this.LL, c655330Pn9.LL) && Intrinsics.LJFF(this.LLILLJJLI, c655330Pn9.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c655330Pn9.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        InterfaceC655070Pmj interfaceC655070Pmj = this.LLILLL;
        return iHashCode + (interfaceC655070Pmj == null ? 0 : interfaceC655070Pmj.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchLemon8PhotoCardData(searchMixFeed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", reason=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC435460H5s
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC655340PnA
    public final InterfaceC655070Pmj getReason() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C655330Pn9(SearchMixFeed searchMixFeed, Aweme aweme, C0PLP c0plp) {
        this.LL = searchMixFeed;
        this.LLILLJJLI = aweme;
        this.LLILLL = c0plp;
    }
}
