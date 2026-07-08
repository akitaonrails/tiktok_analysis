package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SU7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SU7 implements InterfaceC111300bX {
    public final C0RJN LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0SU7) && Intrinsics.LJFF(this.LL, ((C0SU7) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RootPanelComponentData(panelContext=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0SU7(C0RJN c0rjn) {
        this.LL = c0rjn;
    }
}
