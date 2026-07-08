package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D4E, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4E implements C0D4F {
    public final C0D4D LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D4E) && Intrinsics.LJFF(this.LIZ, ((C0D4E) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Content(pageData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0D4E(C0D4D c0d4d) {
        this.LIZ = c0d4d;
    }
}
