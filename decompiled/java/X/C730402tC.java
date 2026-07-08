package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02tC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C730402tC implements InterfaceC729102sz {
    public final Object LIZ;

    public C730402tC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C730402tC) && Intrinsics.LJFF(this.LIZ, ((C730402tC) obj).LIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaCombinedSkuShopOrdersCompState(dummy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C730402tC(int i) {
        this.LIZ = null;
    }
}
