package X;

import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YUX, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YUX extends AbstractC875020YUi {
    public final RankListV2Response LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0YUX) && Intrinsics.LJFF(this.LIZ, ((C0YUX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(response=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YUX(RankListV2Response rankListV2Response) {
        this.LIZ = rankListV2Response;
    }
}
