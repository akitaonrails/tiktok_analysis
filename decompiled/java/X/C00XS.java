package X;

import com.bytedance.android.livesdk.gift.model.GiftIconGuideInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00XS, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00XS {
    public final List<GiftIconGuideInfo> LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00XS)) {
            return false;
        }
        C00XS c00xs = (C00XS) obj;
        return Intrinsics.LJFF(this.LIZ, c00xs.LIZ) && this.LIZIZ == c00xs.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheEntry(guideInfos=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", expireAtMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00XS(List<GiftIconGuideInfo> list, long j) {
        this.LIZ = list;
        this.LIZIZ = j;
    }
}
