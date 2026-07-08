package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZBR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBR implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZBR)) {
            return false;
        }
        C0ZBR c0zbr = (C0ZBR) obj;
        return Intrinsics.LJFF(this.LL, c0zbr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zbr.LLILLJJLI) && this.LLILLL == c0zbr.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditGroupInfoHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", descriptionIsNeed=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZBR(String str, String str2, boolean z) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
    }
}
