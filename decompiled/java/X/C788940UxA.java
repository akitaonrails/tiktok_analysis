package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788940UxA implements InterfaceC788970UxD {
    public final C869590Y9l LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C788940UxA) && Intrinsics.LJFF(this.LIZ, ((C788940UxA) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnContentClick(message=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788940UxA(C869590Y9l c869590Y9l) {
        this.LIZ = c869590Y9l;
    }
}
