package X;

import com.bytedance.im.core.proto.MessageCheckInfoV2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YGB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YGB {
    public final List<MessageCheckInfoV2> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YGB)) {
            return false;
        }
        C0YGB c0ygb = (C0YGB) obj;
        return Intrinsics.LJFF(this.LIZ, c0ygb.LIZ) && this.LIZIZ == c0ygb.LIZIZ && this.LIZJ == c0ygb.LIZJ && this.LIZLLL == c0ygb.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageCompletenessInfo(msgCheckInfoList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isDemoted=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isRequestSuccess=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YGB(List<MessageCheckInfoV2> list, int i, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
