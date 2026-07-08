package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZBQ, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZBQ implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZBQ)) {
            return false;
        }
        C0ZBQ c0zbq = (C0ZBQ) obj;
        return Intrinsics.LJFF(this.LL, c0zbq.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zbq.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupInviteLinkHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZBQ(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
