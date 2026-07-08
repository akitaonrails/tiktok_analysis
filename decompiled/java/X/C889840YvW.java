package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889840YvW implements InterfaceC0148002o {
    public final List<C889910Yvd> LL;
    public final List<C880720Ygo> LLILLJJLI;
    public final Pair<FilterTabType, Boolean> LLILLL;
    public final Set<EnumC880480YgQ> LLILZ;
    public final C291001Au<Unit> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C889840YvW)) {
            return false;
        }
        C889840YvW c889840YvW = (C889840YvW) obj;
        return Intrinsics.LJFF(this.LL, c889840YvW.LL) && Intrinsics.LJFF(this.LLILLJJLI, c889840YvW.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c889840YvW.LLILLL) && Intrinsics.LJFF(this.LLILZ, c889840YvW.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c889840YvW.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILZIL;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxFilterBarState(filterTabs=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", filterOptions=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedTabType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", selectedFilterOptions=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", manualChangeFilterEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C889840YvW(List<C889910Yvd> list, List<C880720Ygo> list2, Pair<? extends FilterTabType, Boolean> pair, Set<? extends EnumC880480YgQ> set, C291001Au<Unit> c291001Au) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = pair;
        this.LLILZ = set;
        this.LLILZIL = c291001Au;
    }

    public static C889840YvW LIZ(C889840YvW c889840YvW, List list, List list2, Pair pair, Set set, C291001Au c291001Au, int i) {
        C291001Au c291001Au2 = c291001Au;
        Set set2 = set;
        Pair pair2 = pair;
        List list3 = list2;
        List list4 = list;
        if ((i & 1) != 0) {
            list4 = c889840YvW.LL;
        }
        if ((i & 2) != 0) {
            list3 = c889840YvW.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            pair2 = c889840YvW.LLILLL;
        }
        if ((i & 8) != 0) {
            set2 = c889840YvW.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au2 = c889840YvW.LLILZIL;
        }
        c889840YvW.getClass();
        return new C889840YvW(list4, list3, pair2, set2, c291001Au2);
    }
}
