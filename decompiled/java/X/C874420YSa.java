package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YSa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C874420YSa implements InterfaceC874460YSe {
    public final C0Y8T LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C874420YSa) && Intrinsics.LJFF(this.LIZ, ((C874420YSa) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Created(conversation=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C874420YSa(C0Y8T c0y8t) {
        this.LIZ = c0y8t;
    }
}
