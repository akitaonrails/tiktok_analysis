package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R91, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R91 implements InterfaceC0148002o {
    public final C291001Au<C703800Rj8> LL;

    public C0R91() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0R91) && Intrinsics.LJFF(this.LL, ((C0R91) obj).LL);
    }

    public final int hashCode() {
        C291001Au<C703800Rj8> c291001Au = this.LL;
        if (c291001Au == null) {
            return 0;
        }
        return c291001Au.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoAntiAddictionState(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0R91(C291001Au<C703800Rj8> c291001Au) {
        this.LL = c291001Au;
    }
}
