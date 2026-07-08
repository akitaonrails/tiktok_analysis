package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06o1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1717506o1 implements InterfaceC111300bX {
    public final String LL;
    public final int LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1717506o1)) {
            return false;
        }
        C1717506o1 c1717506o1 = (C1717506o1) obj;
        return Intrinsics.LJFF(this.LL, c1717506o1.LL) && this.LLILLJJLI == c1717506o1.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageGroupHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", role=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1717506o1(String str, int i) {
        this.LL = str;
        this.LLILLJJLI = i;
    }
}
