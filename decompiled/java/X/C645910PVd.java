package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C645910PVd implements InterfaceC645880PVa {
    public final SearchMixFeed LL;
    public final C650430PfF LLILLJJLI = new C650430PfF(AFwS241S0000000_10.get$arr$(507));

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C645910PVd) && Intrinsics.LJFF(this.LL, ((C645910PVd) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchWeakEntityRenderData(searchMixFeed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return this.LLILLJJLI;
    }

    public C645910PVd(SearchMixFeed searchMixFeed) {
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
