package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h0b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1187550h0b implements InterfaceC111300bX {
    public final C734200Sr4 LL;

    public C1187550h0b() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1187550h0b) && Intrinsics.LJFF(this.LL, ((C1187550h0b) obj).LL);
    }

    public final int hashCode() {
        C734200Sr4 c734200Sr4 = this.LL;
        if (c734200Sr4 == null) {
            return 0;
        }
        return c734200Sr4.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiPostDiggHierarchyData(mobParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1187550h0b(C734200Sr4 c734200Sr4) {
        this.LL = c734200Sr4;
    }
}
