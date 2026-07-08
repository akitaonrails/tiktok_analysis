package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00be, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C112000be implements InterfaceC111300bX {
    public final String LL;

    public C112000be() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C112000be) && Intrinsics.LJFF(this.LL, ((C112000be) obj).LL);
    }

    public final int hashCode() {
        String str = this.LL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCollectListHierarchyData(fromPoiId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C112000be(String str) {
        this.LL = str;
    }
}
