package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g8O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153940g8O implements InterfaceC111300bX {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1153940g8O) && Intrinsics.LJFF(this.LL, ((C1153940g8O) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabFragmentHierarchyData(tabKey=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153940g8O(String str) {
        this.LL = str;
    }
}
