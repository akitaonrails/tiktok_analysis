package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08mX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2217908mX {
    public final C553220Lmq LIZ;
    public final InterfaceC1902607cm LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2217908mX)) {
            return false;
        }
        C2217908mX c2217908mX = (C2217908mX) obj;
        return Intrinsics.LJFF(this.LIZ, c2217908mX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2217908mX.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowPluginEvent(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2217908mX(C553220Lmq c553220Lmq, InterfaceC1902607cm interfaceC1902607cm) {
        this.LIZ = c553220Lmq;
        this.LIZIZ = interfaceC1902607cm;
    }
}
