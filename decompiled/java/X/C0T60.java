package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T60, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T60 implements C0TBE {
    public final String LIZ;

    public C0T60() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0T60) && Intrinsics.LJFF(this.LIZ, ((C0T60) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Generation(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0T60(int i) {
        this.LIZ = "generation";
    }
}
