package X;

import com.ss.android.ugc.aweme.model.VoucherUseStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159150gGn extends AbstractC1159090gGh {
    public final VoucherUseStatus LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159150gGn)) {
            return false;
        }
        C1159150gGn c1159150gGn = (C1159150gGn) obj;
        return this.LIZ == c1159150gGn.LIZ && Intrinsics.LJFF(this.LIZIZ, c1159150gGn.LIZIZ) && this.LIZJ == c1159150gGn.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OrderCreated(voucherStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", paidContentOrderId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", collectionId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1159090gGh
    public final long LIZ() {
        return this.LIZJ;
    }

    public C1159150gGn(VoucherUseStatus voucherUseStatus, String str, long j) {
        super(j);
        this.LIZ = voucherUseStatus;
        this.LIZIZ = str;
        this.LIZJ = j;
    }
}
