package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C187100nl implements InterfaceC187200nm {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C187100nl) && Intrinsics.LJFF(this.LIZ, ((C187100nl) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Text(text=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C187100nl(String str) {
        this.LIZ = str;
    }
}
