package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.004h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0193004h {
    public final C0192004g LIZ;
    public final InterfaceC0195004j LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0193004h)) {
            return false;
        }
        C0193004h c0193004h = (C0193004h) obj;
        return Intrinsics.LJFF(this.LIZ, c0193004h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0193004h.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ToolDefinition(specification=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", executor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0193004h(C0192004g c0192004g, InterfaceC0195004j interfaceC0195004j) {
        this.LIZ = c0192004g;
        this.LIZIZ = interfaceC0195004j;
    }
}
