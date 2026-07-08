package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18VD, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18VD implements C18VI {
    public final C18V5 LIZ;
    public final AIChatGenNode LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18VD)) {
            return false;
        }
        C18VD c18vd = (C18VD) obj;
        return Intrinsics.LJFF(this.LIZ, c18vd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c18vd.LIZIZ);
    }

    public final int hashCode() {
        C18V5 c18v5 = this.LIZ;
        int iHashCode = (c18v5 == null ? 0 : c18v5.hashCode()) * 31;
        AIChatGenNode aIChatGenNode = this.LIZIZ;
        return iHashCode + (aIChatGenNode != null ? aIChatGenNode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SaveImageAction(imageData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aiChatGenNode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C18VD(C18V5 c18v5, AIChatGenNode aIChatGenNode) {
        this.LIZ = c18v5;
        this.LIZIZ = aIChatGenNode;
    }
}
