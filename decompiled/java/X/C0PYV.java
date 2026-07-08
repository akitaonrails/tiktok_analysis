package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYV, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PYV implements InterfaceC655050Pmh, InterfaceC645880PVa {
    public final SearchMixFeed LL;
    public final C650430PfF LLILLJJLI;
    public final boolean LLILLL;

    public C0PYV() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PYV) && Intrinsics.LJFF(this.LL, ((C0PYV) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        SearchMixFeed searchMixFeed = this.LL;
        if (searchMixFeed == null) {
            return 0;
        }
        return searchMixFeed.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchTakoNewBotCardData(searchMixFeed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return this.LLILLL;
    }

    public C0PYV(SearchMixFeed searchMixFeed) {
        this.LL = searchMixFeed;
        this.LLILLJJLI = new C650430PfF(new AwS589S0100000_10(this, 559));
        this.LLILLL = true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
