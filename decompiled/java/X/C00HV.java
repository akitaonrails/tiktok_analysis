package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00HV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00HV implements InterfaceC0148002o {
    public final C752702wn LL;

    public C00HV() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C00HV) && Intrinsics.LJFF(this.LL, ((C00HV) obj).LL);
    }

    public final int hashCode() {
        C752702wn c752702wn = this.LL;
        if (c752702wn == null) {
            return 0;
        }
        return c752702wn.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OspAddonOrderState(addonVO=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00HV(int i) {
        this.LL = null;
    }
}
