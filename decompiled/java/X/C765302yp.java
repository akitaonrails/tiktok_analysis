package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.USPackedSku;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C765302yp implements InterfaceC729102sz {
    public final Map<String, List<USPackedSku>> LIZ;

    public C765302yp() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C765302yp) && Intrinsics.LJFF(this.LIZ, ((C765302yp) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsIneligibleItemsCompState(collapsedSkuMap=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C765302yp(int i) {
        this((Map<String, ? extends List<USPackedSku>>) C2097608Jq.LJ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C765302yp(Map<String, ? extends List<USPackedSku>> map) {
        this.LIZ = map;
    }
}
