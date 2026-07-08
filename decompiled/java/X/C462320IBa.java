package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C462320IBa implements InterfaceC462330IBb {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C462320IBa) && Intrinsics.LJFF(this.LIZ, ((C462320IBa) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WithNotes(repostNotes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C462320IBa(String str) {
        this.LIZ = str;
    }
}
