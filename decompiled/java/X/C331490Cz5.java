package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cz5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331490Cz5 extends AbstractC331470Cz3 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C331490Cz5) && Intrinsics.LJFF(this.LIZ, ((C331490Cz5) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C331490Cz5(String str) {
        this.LIZ = str;
    }
}
