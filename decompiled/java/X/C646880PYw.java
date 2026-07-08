package X;

import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C646880PYw<T> implements InterfaceC111300bX {
    public final C19EG LL;
    public final BaseSearchDynamicTabFragment<T> LLILLJJLI;
    public final C646870PYv LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C646880PYw)) {
            return false;
        }
        C646880PYw c646880PYw = (C646880PYw) obj;
        return Intrinsics.LJFF(this.LL, c646880PYw.LL) && Intrinsics.LJFF(this.LLILLJJLI, c646880PYw.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c646880PYw.LLILLL);
    }

    public final int hashCode() {
        C19EG c19eg = this.LL;
        return ((((c19eg == null ? 0 : c19eg.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchDynamicFragmentData(activity=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fragment=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", searchTabConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C646880PYw(C19EG c19eg, BaseSearchDynamicTabFragment<T> baseSearchDynamicTabFragment, C646870PYv c646870PYv) {
        this.LL = c19eg;
        this.LLILLJJLI = baseSearchDynamicTabFragment;
        this.LLILLL = c646870PYv;
    }
}
