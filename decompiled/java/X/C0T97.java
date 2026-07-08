package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T97, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T97 implements C0TBE {
    public final String LIZ;

    public C0T97() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0T97) && Intrinsics.LJFF(this.LIZ, ((C0T97) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Transition(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0T97(int i) {
        this.LIZ = "transition";
    }
}
