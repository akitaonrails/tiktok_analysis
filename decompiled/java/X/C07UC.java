package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07UC, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07UC implements C07UD {
    public final String LIZ;

    public C07UC() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07UC) && Intrinsics.LJFF(this.LIZ, ((C07UC) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("None(empty=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07UC(int i) {
        this.LIZ = "";
    }
}
