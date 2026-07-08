package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PVb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645890PVb implements InterfaceC594520NTm, InterfaceC645880PVa {
    public final SearchMixFeed LL;
    public final int LLILLJJLI = C321460Ciu.LIZ();
    public final C650430PfF LLILLL = new C650430PfF(AFwS241S0000000_10.get$arr$(491));

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC594520NTm
    public final int retrieveIncrementalId() {
        return this.LLILLJJLI;
    }

    public C645890PVb(SearchMixFeed searchMixFeed) {
        this.LL = searchMixFeed;
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
