package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.061S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C061S implements InterfaceC111300bX {
    public final C1187610h0h LL;

    public C061S() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C061S) && Intrinsics.LJFF(this.LL, ((C061S) obj).LL);
    }

    public final int hashCode() {
        C1187610h0h c1187610h0h = this.LL;
        if (c1187610h0h == null) {
            return 0;
        }
        return c1187610h0h.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiPostPageHierarchyData(dataParams=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C061S(C1187610h0h c1187610h0h) {
        this.LL = c1187610h0h;
    }
}
