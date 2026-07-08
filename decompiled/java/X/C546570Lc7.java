package X;

import com.ss.android.ugc.aweme.creative.model.common.UsageStatus;

/* JADX INFO: renamed from: X.0Lc7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546570Lc7 extends AbstractC546580Lc8 {
    public final UsageStatus LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C546570Lc7) && this.LIZ == ((C546570Lc7) obj).LIZ;
    }

    public final int hashCode() {
        UsageStatus usageStatus = this.LIZ;
        if (usageStatus == null) {
            return 0;
        }
        return usageStatus.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Completed(usageStatus=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C546570Lc7(UsageStatus usageStatus) {
        this.LIZ = usageStatus;
    }
}
