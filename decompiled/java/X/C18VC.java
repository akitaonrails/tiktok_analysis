package X;

import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18VC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18VC implements C18VI {
    public final C18V5 LIZ;
    public final AIChatGenNode LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18VC)) {
            return false;
        }
        C18VC c18vc = (C18VC) obj;
        return Intrinsics.LJFF(this.LIZ, c18vc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c18vc.LIZIZ);
    }

    public final int hashCode() {
        C18V5 c18v5 = this.LIZ;
        int iHashCode = (c18v5 == null ? 0 : c18v5.hashCode()) * 31;
        AIChatGenNode aIChatGenNode = this.LIZIZ;
        return iHashCode + (aIChatGenNode != null ? aIChatGenNode.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PostAction(imageData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aiChatGenNode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C18VC(C18V5 c18v5, AIChatGenNode aIChatGenNode) {
        this.LIZ = c18v5;
        this.LIZIZ = aIChatGenNode;
    }
}
