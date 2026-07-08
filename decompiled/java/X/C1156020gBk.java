package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gBk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156020gBk implements InterfaceC111300bX {
    public final String LL;
    public final C1241040iOs LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1156020gBk)) {
            return false;
        }
        C1156020gBk c1156020gBk = (C1156020gBk) obj;
        return Intrinsics.LJFF(this.LL, c1156020gBk.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1156020gBk.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HistorySearchHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", analyticsParam=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1156020gBk(String str, C1241040iOs c1241040iOs) {
        this.LL = str;
        this.LLILLJJLI = c1241040iOs;
    }
}
