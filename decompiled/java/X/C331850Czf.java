package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Czf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C331850Czf {
    public final C0D0F LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C331850Czf) && Intrinsics.LJFF(this.LIZ, ((C331850Czf) obj).LIZ);
    }

    public final int hashCode() {
        C0D0F c0d0f = this.LIZ;
        if (c0d0f == null) {
            return 0;
        }
        return c0d0f.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Completion(resolved=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C331850Czf(C0D0F c0d0f) {
        this.LIZ = c0d0f;
    }
}
