package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mp1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411010mp1 extends AbstractC878300Ycu {
    public final boolean LIZ;
    public final List<SMBOptInStep> LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1411010mp1)) {
            return false;
        }
        C1411010mp1 c1411010mp1 = (C1411010mp1) obj;
        return this.LIZ == c1411010mp1.LIZ && Intrinsics.LJFF(this.LIZIZ, c1411010mp1.LIZIZ) && this.LIZJ == c1411010mp1.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OptInProgressResult(isSuccess=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", optInSteps=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1411010mp1(boolean z, List<SMBOptInStep> list, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = z2;
    }
}
