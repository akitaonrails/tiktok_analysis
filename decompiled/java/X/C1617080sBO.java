package X;

import com.bytedance.android.livesdk.iap.IapProductDetail;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sBO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1617080sBO extends AbstractC1617090sBP {
    public final HashMap<String, IapProductDetail> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1617080sBO) && Intrinsics.LJFF(this.LIZ, ((C1617080sBO) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadedSuccessful(priceMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1617080sBO(HashMap<String, IapProductDetail> map) {
        this.LIZ = map;
    }
}
