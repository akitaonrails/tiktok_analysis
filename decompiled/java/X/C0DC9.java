package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DC9, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DC9 implements C0DCV {
    public final C0DCA LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0DC9) && Intrinsics.LJFF(this.LIZ, ((C0DC9) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InfoCard(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DC9(C0DCA c0dca) {
        this.LIZ = c0dca;
    }
}
