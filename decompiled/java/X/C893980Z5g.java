package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z5g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893980Z5g implements InterfaceC111300bX {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C893980Z5g) && Intrinsics.LJFF(this.LL, ((C893980Z5g) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupDetailHierarchyData(conversationId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C893980Z5g(String str) {
        this.LL = str;
    }
}
