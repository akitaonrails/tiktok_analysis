package X;

import com.bytedance.im.core.proto.ConversationCheckInfoV2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YGA, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YGA {
    public final List<ConversationCheckInfoV2> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0YGA)) {
            return false;
        }
        C0YGA c0yga = (C0YGA) obj;
        return Intrinsics.LJFF(this.LIZ, c0yga.LIZ) && this.LIZIZ == c0yga.LIZIZ && this.LIZJ == c0yga.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationCompletenessInfo(conversationCheckInfoList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPinnedIncluded=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isDemoted=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0YGA(List<ConversationCheckInfoV2> list, boolean z, boolean z2) {
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
