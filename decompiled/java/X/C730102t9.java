package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02t9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C730102t9 implements InterfaceC729102sz {
    public final Object LIZ;

    public C730102t9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C730102t9) && Intrinsics.LJFF(this.LIZ, ((C730102t9) obj).LIZ);
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
        sbLIZ.append("SeaCombinedSkuBonusCompState(dummy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C730102t9(int i) {
        this.LIZ = null;
    }
}
