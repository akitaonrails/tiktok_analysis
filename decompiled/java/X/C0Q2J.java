package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q2J, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q2J implements InterfaceC111300bX {
    public final C189W LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Q2J) && Intrinsics.LJFF(this.LL, ((C0Q2J) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DynamicCardConfigHierarchyData(config=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Q2J(C189W c189w) {
        this.LL = c189w;
    }
}
