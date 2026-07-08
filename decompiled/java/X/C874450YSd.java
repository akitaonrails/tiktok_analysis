package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874450YSd implements InterfaceC874460YSe {
    public final C0Y8T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C874450YSd) && Intrinsics.LJFF(this.LIZ, ((C874450YSd) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Left(conversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C874450YSd(C0Y8T c0y8t) {
        this.LIZ = c0y8t;
    }
}
