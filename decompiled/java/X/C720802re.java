package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02re, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C720802re implements InterfaceC0148002o {
    public final C719502rR LL;

    public C720802re() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C720802re) && Intrinsics.LJFF(this.LL, ((C720802re) obj).LL);
    }

    public final int hashCode() {
        C719502rR c719502rR = this.LL;
        if (c719502rR == null) {
            return 0;
        }
        return c719502rR.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspShopState(shopVO=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C720802re(int i) {
        this.LL = null;
    }
}
