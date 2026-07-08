package X;

import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiFeedFilterOption;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0giZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1176370giZ implements InterfaceC0148002o {
    public final Map<C1176550gir, List<PoiFeedFilterOption>> LL;
    public final String LLILLJJLI;
    public final C291001Au<Unit> LLILLL;

    public C1176370giZ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1176370giZ)) {
            return false;
        }
        C1176370giZ c1176370giZ = (C1176370giZ) obj;
        return Intrinsics.LJFF(this.LL, c1176370giZ.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1176370giZ.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1176370giZ.LLILLL);
    }

    public final int hashCode() {
        Map<C1176550gir, List<PoiFeedFilterOption>> map = this.LL;
        int iHashCode = (((map == null ? 0 : map.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<Unit> c291001Au = this.LLILLL;
        return iHashCode + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiMapDetailFilterState(selectedPoiFeedFilterOptions=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", sortByKey=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", resetFilterEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1176370giZ(int i) {
        this(null, "sort_by_recommend", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1176370giZ(Map<C1176550gir, ? extends List<PoiFeedFilterOption>> map, String str, C291001Au<Unit> c291001Au) {
        this.LL = map;
        this.LLILLJJLI = str;
        this.LLILLL = c291001Au;
    }

    public static C1176370giZ LIZ(C1176370giZ c1176370giZ, Map map, String str, int i) {
        C291001Au<Unit> c291001Au;
        if ((i & 1) != 0) {
            map = c1176370giZ.LL;
        }
        if ((i & 2) != 0) {
            str = c1176370giZ.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c1176370giZ.LLILLL;
        } else {
            c291001Au = null;
        }
        c1176370giZ.getClass();
        return new C1176370giZ(map, str, c291001Au);
    }
}
