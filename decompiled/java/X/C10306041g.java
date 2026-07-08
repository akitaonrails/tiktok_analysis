package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BnplInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.041g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10306041g {
    public final BnplInfo LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10306041g)) {
            return false;
        }
        C10306041g c10306041g = (C10306041g) obj;
        return Intrinsics.LJFF(this.LIZ, c10306041g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c10306041g.LIZIZ);
    }

    public final int hashCode() {
        BnplInfo bnplInfo = this.LIZ;
        int iHashCode = (bnplInfo == null ? 0 : bnplInfo.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentModuleVO(bnplInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pdpDaInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C10306041g(BnplInfo bnplInfo, String str) {
        this.LIZ = bnplInfo;
        this.LIZIZ = str;
    }
}
