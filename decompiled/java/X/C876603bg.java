package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C876603bg {
    public final List<PaymentMethod> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C876603bg)) {
            return false;
        }
        C876603bg c876603bg = (C876603bg) obj;
        return Intrinsics.LJFF(this.LIZ, c876603bg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c876603bg.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RemotePageData(paymentMethods=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", materialCollectionInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C876603bg(List<PaymentMethod> list, String str) {
        this.LIZ = list;
        this.LIZIZ = str;
    }
}
