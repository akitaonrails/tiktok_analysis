package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02sy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C729002sy implements InterfaceC729102sz {
    public final Map<String, List<PackedSku>> LIZ;

    public C729002sy() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C729002sy) && Intrinsics.LJFF(this.LIZ, ((C729002sy) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaShopOrdersCompState(collapsedSkuMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C729002sy(Object obj) {
        this.LIZ = C2097608Jq.LJ();
    }
}
