package X;

import com.bytedance.android.livesdk.wallet.NoticesResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qcD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556830qcD {
    public final C1567120qso LIZ;
    public final List<NoticesResult.Notice> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556830qcD)) {
            return false;
        }
        C1556830qcD c1556830qcD = (C1556830qcD) obj;
        return Intrinsics.LJFF(this.LIZ, c1556830qcD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1556830qcD.LIZIZ);
    }

    public final int hashCode() {
        C1567120qso c1567120qso = this.LIZ;
        return ((c1567120qso == null ? 0 : c1567120qso.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargePanelNoticeResult(notice=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", supplementary=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556830qcD(C1567120qso c1567120qso, List<NoticesResult.Notice> list) {
        this.LIZ = c1567120qso;
        this.LIZIZ = list;
    }
}
