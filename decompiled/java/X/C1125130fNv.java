package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fNv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125130fNv {
    public final C1129080fUI LIZ;

    public C1125130fNv() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1125130fNv) && Intrinsics.LJFF(this.LIZ, ((C1125130fNv) obj).LIZ);
    }

    public final int hashCode() {
        C1129080fUI c1129080fUI = this.LIZ;
        if (c1129080fUI == null) {
            return 0;
        }
        return c1129080fUI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PanelContext(lastParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final long LIZ() {
        C1129080fUI c1129080fUI = this.LIZ;
        if (c1129080fUI != null) {
            return c1129080fUI.LIZ;
        }
        return 0L;
    }

    public C1125130fNv(C1129080fUI c1129080fUI) {
        this.LIZ = c1129080fUI;
    }
}
