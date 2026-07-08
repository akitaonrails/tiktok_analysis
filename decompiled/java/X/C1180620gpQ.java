package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.slash.data.PageInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180620gpQ extends BaseResponse {
    public final C1181190gqL LL;
    public final boolean LLILLJJLI;
    public final PageInfo LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;

    public C1180620gpQ() {
        this(null, false, null, false, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1180620gpQ)) {
            return false;
        }
        C1180620gpQ c1180620gpQ = (C1180620gpQ) obj;
        return Intrinsics.LJFF(this.LL, c1180620gpQ.LL) && this.LLILLJJLI == c1180620gpQ.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1180620gpQ.LLILLL) && this.LLILZ == c1180620gpQ.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1180620gpQ.LLILZIL);
    }

    public final int hashCode() {
        C1181190gqL c1181190gqL = this.LL;
        int iHashCode = (((c1181190gqL == null ? 0 : c1181190gqL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        PageInfo pageInfo = this.LLILLL;
        int iHashCode2 = (((iHashCode + (pageInfo == null ? 0 : pageInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        String str = this.LLILZIL;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentsResponse(slashPageData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAllComponentsReady=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isLoadFromServer=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", preloadFlag=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<C1180920gpu> LJ() {
        Map<String, List<C1180920gpu>> map;
        C1181190gqL c1181190gqL = this.LL;
        if (c1181190gqL == null || (map = c1181190gqL.LIZIZ) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<C1180920gpu>>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getValue(), arrayList);
        }
        return arrayList;
    }

    public final List<C1180920gpu> LJIILIIL() {
        C1181190gqL c1181190gqL = this.LL;
        if (c1181190gqL != null) {
            return c1181190gqL.LIZ();
        }
        return null;
    }

    public final boolean LJJIFFI() {
        C1181190gqL c1181190gqL;
        Map<String, List<C1180920gpu>> map;
        return (this.status_code == 3009009 || (c1181190gqL = this.LL) == null || (map = c1181190gqL.LIZIZ) == null || map.isEmpty()) ? false : true;
    }

    public final List<C1180920gpu> LJIL() {
        Map<String, C1181200gqM> map;
        C1181200gqM c1181200gqM;
        List<C1180920gpu> listLJIILIIL = LJIILIIL();
        if (listLJIILIIL == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C1180920gpu c1180920gpu : listLJIILIIL) {
            C1180920gpu c1180920gpu2 = c1180920gpu;
            C1181190gqL c1181190gqL = this.LL;
            if (c1181190gqL != null && (map = c1181190gqL.LIZ) != null && (c1181200gqM = map.get(c1180920gpu2.LIZ)) != null && c1181200gqM.LIZ()) {
                arrayList.add(c1180920gpu);
            }
        }
        return arrayList;
    }

    public final List<C1180920gpu> LJI(String str) {
        Map<String, List<C1180920gpu>> map;
        C1181190gqL c1181190gqL = this.LL;
        if (c1181190gqL != null && (map = c1181190gqL.LIZIZ) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Map.Entry<String, List<C1180920gpu>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(it2.next().getValue(), arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (Intrinsics.LJFF(((C1180920gpu) obj).LIZIZ.LIZ, str)) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }
        return null;
    }

    public C1180620gpQ(C1181190gqL c1181190gqL, boolean z, PageInfo pageInfo, boolean z2, String str) {
        this.LL = c1181190gqL;
        this.LLILLJJLI = z;
        this.LLILLL = pageInfo;
        this.LLILZ = z2;
        this.LLILZIL = str;
    }

    public static C1180620gpQ LJIJJLI(C1180620gpQ c1180620gpQ, C1181190gqL c1181190gqL, boolean z, boolean z2, int i) {
        PageInfo pageInfo;
        boolean z3 = z2;
        boolean z4 = z;
        C1181190gqL c1181190gqL2 = c1181190gqL;
        if ((i & 1) != 0) {
            c1181190gqL2 = c1180620gpQ.LL;
        }
        if ((i & 2) != 0) {
            z4 = c1180620gpQ.LLILLJJLI;
        }
        String str = null;
        if ((i & 4) != 0) {
            pageInfo = c1180620gpQ.LLILLL;
        } else {
            pageInfo = null;
        }
        if ((i & 8) != 0) {
            z3 = c1180620gpQ.LLILZ;
        }
        if ((i & 16) != 0) {
            str = c1180620gpQ.LLILZIL;
        }
        c1180620gpQ.getClass();
        return new C1180620gpQ(c1181190gqL2, z4, pageInfo, z3, str);
    }
}
