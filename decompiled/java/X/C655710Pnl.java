package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.Map;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655710Pnl implements InterfaceC435460H5s, InterfaceC645880PVa {
    public final SearchMixFeed LL;
    public final Aweme LLILLJJLI;
    public final Map<String, String> LLILLL;
    public final C650430PfF LLILZ = new C650430PfF(new AwS589S0100000_10(this, 636));
    public final boolean LLILZIL = C650410PfD.LIZ();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C655710Pnl)) {
            return false;
        }
        C655710Pnl c655710Pnl = (C655710Pnl) obj;
        return Intrinsics.LJFF(this.LL, c655710Pnl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c655710Pnl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c655710Pnl.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchAdPhotoCardData(searchMixFeed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC435460H5s
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C655710Pnl(SearchMixFeed searchMixFeed, Aweme aweme, Map<String, String> map) {
        this.LL = searchMixFeed;
        this.LLILLJJLI = aweme;
        this.LLILLL = map;
    }
}
