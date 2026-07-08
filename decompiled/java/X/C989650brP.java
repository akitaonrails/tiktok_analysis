package X;

import com.ss.android.ugc.aweme.ecommerce.image.resource.EcResourceItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0brP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989650brP extends AbstractC989640brO {
    public final List<EcResourceItem> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C989650brP) && Intrinsics.LJFF(this.LIZ, ((C989650brP) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C989650brP(List<EcResourceItem> list) {
        this.LIZ = list;
    }
}
