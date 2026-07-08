package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07iL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1937107iL implements InterfaceC702960Rhm {
    public final C1937007iK LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1937107iL) && Intrinsics.LJFF(this.LIZ, ((C1937107iL) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BindRules(request=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1937107iL(C1937007iK c1937007iK) {
        this.LIZ = c1937007iK;
    }
}
