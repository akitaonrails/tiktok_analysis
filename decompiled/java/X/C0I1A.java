package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I1A, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I1A extends C0I1F {
    public final C0I10 LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0I1A) && Intrinsics.LJFF(this.LIZ, ((C0I1A) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchKeyChanged(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I1A(C0I10 c0i10) {
        this.LIZ = c0i10;
    }
}
