package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C570070MXl implements InterfaceC0148002o {
    public final C291001Au<C570060MXk> LL;

    public C570070MXl() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C570070MXl) && Intrinsics.LJFF(this.LL, ((C570070MXl) obj).LL);
    }

    public final int hashCode() {
        C291001Au<C570060MXk> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatePassingState(anyAssemShow=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C570070MXl(C291001Au<C570060MXk> c291001Au) {
        this.LL = c291001Au;
    }
}
