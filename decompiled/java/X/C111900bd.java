package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C111900bd implements InterfaceC111300bX {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C111900bd) && Intrinsics.LJFF(this.LL, ((C111900bd) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DMCameraVMHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C111900bd(String str) {
        this.LL = str;
    }
}
