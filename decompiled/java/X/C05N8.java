package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05N8, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05N8 implements InterfaceC0148002o {
    public final List<StoryHighlightCollection> LL;
    public final Map<String, Aweme> LLILLJJLI;
    public final boolean LLILLL;
    public final List<String> LLILZ;

    public C05N8() {
        this(null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05N8)) {
            return false;
        }
        C05N8 c05n8 = (C05N8) obj;
        return Intrinsics.LJFF(this.LL, c05n8.LL) && Intrinsics.LJFF(this.LLILLJJLI, c05n8.LLILLJJLI) && this.LLILLL == c05n8.LLILLL && Intrinsics.LJFF(this.LLILZ, c05n8.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryHighlightsOtherProfileVMState(collectionList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", cachedCollectionAwemeMap=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isRequestingCache=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pendingCacheCollectionIds=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C05N8(C13BV c13bv, int i) {
        Map mapLJ;
        c13bv = (i & 1) != 0 ? C13BV.INSTANCE : c13bv;
        if ((i & 2) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        this(false, c13bv, (i & 8) != 0 ? C13BV.INSTANCE : null, mapLJ);
    }

    public C05N8(boolean z, List list, List list2, Map map) {
        this.LL = list;
        this.LLILLJJLI = map;
        this.LLILLL = z;
        this.LLILZ = list2;
    }

    public static C05N8 LIZ(C05N8 c05n8, List list, Map map, boolean z, List list2, int i) {
        if ((i & 1) != 0) {
            list = c05n8.LL;
        }
        if ((i & 2) != 0) {
            map = c05n8.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c05n8.LLILLL;
        }
        if ((i & 8) != 0) {
            list2 = c05n8.LLILZ;
        }
        c05n8.getClass();
        return new C05N8(z, list, list2, map);
    }
}
