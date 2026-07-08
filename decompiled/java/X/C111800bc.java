package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C111800bc implements InterfaceC111300bX {
    public final String LL;

    public C111800bc() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C111800bc) && Intrinsics.LJFF(this.LL, ((C111800bc) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EmptyHierarchyData(key=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C111800bc(int i) {
        this.LL = "";
    }
}
