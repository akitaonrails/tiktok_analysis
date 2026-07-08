package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.069c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C15606069c implements InterfaceC111300bX {
    public final C913140Zs0 LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15606069c) && Intrinsics.LJFF(this.LL, ((C15606069c) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupChatHierarchyData(groupSessionInfo=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C15606069c(C913140Zs0 c913140Zs0) {
        this.LL = c913140Zs0;
    }
}
