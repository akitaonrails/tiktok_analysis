package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Uq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1616606Uq implements InterfaceC111300bX {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1616606Uq) && Intrinsics.LJFF(this.LL, ((C1616606Uq) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ManageAdminHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1616606Uq(String str) {
        this.LL = str;
    }
}
