package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0042, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0042 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AnonymousClass0042) && Intrinsics.LJFF(this.LIZ, ((AnonymousClass0042) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Section(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0042(String str) {
        this.LIZ = str;
    }
}
