package X;

import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r0k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1572040r0k implements InterfaceC0148002o {
    public final boolean LL;
    public final Map<EffectCategoryResponse, List<FilterBean>> LLILLJJLI;
    public final FilterBean LLILLL;
    public final C291001Au<C1572050r0l> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1572040r0k)) {
            return false;
        }
        C1572040r0k c1572040r0k = (C1572040r0k) obj;
        return this.LL == c1572040r0k.LL && Intrinsics.LJFF(this.LLILLJJLI, c1572040r0k.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1572040r0k.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1572040r0k.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        FilterBean filterBean = this.LLILLL;
        int iHashCode = (iZ2 + (filterBean == null ? 0 : filterBean.hashCode())) * 31;
        C291001Au<C1572050r0l> c291001Au = this.LLILZ;
        return iHashCode + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FilterPanelState(showPanel=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", data=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedFilter=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", filterSwitchEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1572040r0k(boolean z, Map<EffectCategoryResponse, ? extends List<? extends FilterBean>> map, FilterBean filterBean, C291001Au<C1572050r0l> c291001Au) {
        this.LL = z;
        this.LLILLJJLI = map;
        this.LLILLL = filterBean;
        this.LLILZ = c291001Au;
    }

    public static C1572040r0k LIZ(C1572040r0k c1572040r0k, boolean z, Map map, FilterBean filterBean, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            z = c1572040r0k.LL;
        }
        if ((i & 2) != 0) {
            map = c1572040r0k.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            filterBean = c1572040r0k.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au = c1572040r0k.LLILZ;
        }
        c1572040r0k.getClass();
        return new C1572040r0k(z, map, filterBean, c291001Au);
    }
}
