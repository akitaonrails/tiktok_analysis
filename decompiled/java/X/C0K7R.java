package X;

import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCTemplateListData;

/* JADX INFO: renamed from: X.0K7R, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K7R {
    public Pair<C00CC<PGCTemplateListData>, PGCTemplateListData> LIZ;
    public Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> LIZIZ;
    public final Set<EnumC513480KBu> LIZJ;
    public final long LIZLLL;

    public C0K7R() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0K7R)) {
            return false;
        }
        C0K7R c0k7r = (C0K7R) obj;
        return Intrinsics.LJFF(this.LIZ, c0k7r.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0k7r.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0k7r.LIZJ) && this.LIZLLL == c0k7r.LIZLLL;
    }

    public final int hashCode() {
        Pair<C00CC<PGCTemplateListData>, PGCTemplateListData> pair = this.LIZ;
        int iHashCode = (pair == null ? 0 : pair.hashCode()) * 31;
        Map<String, ? extends List<PGCSubscriptionProductDetailWithTemplateInfo>> map = this.LIZIZ;
        return ((((iHashCode + (map != null ? map.hashCode() : 0)) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductCacheData(templateCache=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", skuCache=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", availableScenes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", timeStamp=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0K7R(Object obj) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = linkedHashSet;
        this.LIZLLL = jCurrentTimeMillis;
    }
}
