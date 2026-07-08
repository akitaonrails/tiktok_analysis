package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.rs.core.model.RelatedWord;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PVX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PVX implements InterfaceC1891350zJl {
    public final RelatedWord LL;
    public final SearchMixFeed LLILLJJLI;
    public final String LLILLL;
    public final Function0<C0PHT> LLILZ;

    public C0PVX() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PVX)) {
            return false;
        }
        C0PVX c0pvx = (C0PVX) obj;
        return Intrinsics.LJFF(this.LL, c0pvx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pvx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0pvx.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0pvx.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31;
        String str = this.LLILLL;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Function0<C0PHT> function0 = this.LLILZ;
        return iHashCode2 + (function0 != null ? function0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelatedSearchWordPowerItem(relatedWord=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", searchMixFeed=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", fallbackStreamRootProvider=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0PVX(RelatedWord relatedWord, SearchMixFeed searchMixFeed, String str) {
        this.LL = relatedWord;
        this.LLILLJJLI = searchMixFeed;
        this.LLILLL = str;
        this.LLILZ = null;
    }
}
