package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bN6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C970860bN6 extends AbstractC970850bN5 {
    public final C982460bfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C970860bN6) && Intrinsics.LJFF(this.LIZ, ((C970860bN6) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Competition(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C970860bN6(C982460bfo c982460bfo) {
        this.LIZ = c982460bfo;
    }
}
