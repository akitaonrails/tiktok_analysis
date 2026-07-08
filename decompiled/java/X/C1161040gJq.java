package X;

import com.bytedance.hybrid.spark.raven.data.PageInfo;
import com.bytedance.hybrid.spark.raven.model.BaseResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gJq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161040gJq extends BaseResponse {
    public final C1161090gJv LL;
    public final boolean LLILLJJLI;
    public final PageInfo LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final C1889907aj LLILZLL;
    public final Integer LLIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1161040gJq() {
        this(null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1161040gJq)) {
            return false;
        }
        C1161040gJq c1161040gJq = (C1161040gJq) obj;
        return Intrinsics.LJFF(this.LL, c1161040gJq.LL) && this.LLILLJJLI == c1161040gJq.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1161040gJq.LLILLL) && this.LLILZ == c1161040gJq.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1161040gJq.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1161040gJq.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1161040gJq.LLIZ);
    }

    public final int hashCode() {
        C1161090gJv c1161090gJv = this.LL;
        int iHashCode = (((c1161090gJv == null ? 0 : c1161090gJv.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        PageInfo pageInfo = this.LLILLL;
        int iHashCode2 = (((iHashCode + (pageInfo == null ? 0 : pageInfo.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31;
        String str = this.LLILZIL;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C1889907aj c1889907aj = this.LLILZLL;
        int iHashCode4 = (iHashCode3 + (c1889907aj == null ? 0 : c1889907aj.hashCode())) * 31;
        Integer num = this.LLIZ;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.bytedance.hybrid.spark.raven.model.BaseResponse
    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ComponentsResponse(ravenPageData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAllComponentsReady=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pageInfo=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isLoadFromServer=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", preloadFlag=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", bodyLoadMoreConfig=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", insertStartIndex=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final List<C1161140gK0> LIZ() {
        Map<String, List<C1161140gK0>> map;
        C1161090gJv c1161090gJv = this.LL;
        if (c1161090gJv == null || (map = c1161090gJv.LIZIZ) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, List<C1161140gK0>>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            C19719612Di.LJJI(it2.next().getValue(), arrayList);
        }
        return arrayList;
    }

    public final List<C1161140gK0> LIZIZ() {
        C1161090gJv c1161090gJv = this.LL;
        if (c1161090gJv != null) {
            return c1161090gJv.LIZ();
        }
        return null;
    }

    public /* synthetic */ C1161040gJq(C1161090gJv c1161090gJv, PageInfo pageInfo, boolean z, C1889907aj c1889907aj, int i) {
        this((i & 1) != 0 ? null : c1161090gJv, false, (i & 4) != 0 ? null : pageInfo, (i & 8) != 0 ? false : z, null, (i & 32) != 0 ? null : c1889907aj, null);
    }

    public C1161040gJq(C1161090gJv c1161090gJv, boolean z, PageInfo pageInfo, boolean z2, String str, C1889907aj c1889907aj, Integer num) {
        this.LL = c1161090gJv;
        this.LLILLJJLI = z;
        this.LLILLL = pageInfo;
        this.LLILZ = z2;
        this.LLILZIL = str;
        this.LLILZLL = c1889907aj;
        this.LLIZ = num;
    }

    public static C1161040gJq LIZLLL(C1161040gJq c1161040gJq, C1161090gJv c1161090gJv, boolean z, PageInfo pageInfo, boolean z2, C1889907aj c1889907aj, Integer num, int i) {
        String str;
        Integer num2 = num;
        C1889907aj c1889907aj2 = c1889907aj;
        boolean z3 = z2;
        PageInfo pageInfo2 = pageInfo;
        boolean z4 = z;
        C1161090gJv c1161090gJv2 = c1161090gJv;
        if ((i & 1) != 0) {
            c1161090gJv2 = c1161040gJq.LL;
        }
        if ((i & 2) != 0) {
            z4 = c1161040gJq.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            pageInfo2 = c1161040gJq.LLILLL;
        }
        if ((i & 8) != 0) {
            z3 = c1161040gJq.LLILZ;
        }
        if ((i & 16) != 0) {
            str = c1161040gJq.LLILZIL;
        } else {
            str = null;
        }
        if ((i & 32) != 0) {
            c1889907aj2 = c1161040gJq.LLILZLL;
        }
        if ((i & 64) != 0) {
            num2 = c1161040gJq.LLIZ;
        }
        c1161040gJq.getClass();
        return new C1161040gJq(c1161090gJv2, z4, pageInfo2, z3, str, c1889907aj2, num2);
    }
}
