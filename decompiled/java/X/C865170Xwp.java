package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C865170Xwp {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C865170Xwp)) {
            return false;
        }
        C865170Xwp c865170Xwp = (C865170Xwp) obj;
        return Intrinsics.LJFF(this.LIZ, c865170Xwp.LIZ) && this.LIZIZ == c865170Xwp.LIZIZ && this.LIZJ == c865170Xwp.LIZJ && this.LIZLLL == c865170Xwp.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetchConversationInfoInput(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationShortId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", conversationType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", force=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C865170Xwp(int i, long j, String str) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
    }
}
