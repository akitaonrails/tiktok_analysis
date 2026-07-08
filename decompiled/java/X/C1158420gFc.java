package X;

import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158420gFc extends AbstractC1158440gFe {
    public final ExploreFeedRequestOverride LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1158420gFc) && Intrinsics.LJFF(this.LIZIZ, ((C1158420gFc) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RefreshWithOverride(override=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158420gFc(ExploreFeedRequestOverride exploreFeedRequestOverride) {
        this.LIZIZ = exploreFeedRequestOverride;
    }
}
