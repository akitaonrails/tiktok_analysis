package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.002t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0153002t implements InterfaceC0148002o {
    public final Object LL;

    public C0153002t() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0153002t) && Intrinsics.LJFF(this.LL, ((C0153002t) obj).LL);
    }

    public final int hashCode() {
        Object obj = this.LL;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddressIdentityState(noUse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0153002t(int i) {
        this.LL = null;
    }
}
