package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.199A, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C199A extends C199R {
    public final Class<? extends InterfaceC214902198i> LIZ;
    public final C214932199m LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C199A)) {
            return false;
        }
        C199A c199a = (C199A) obj;
        return Intrinsics.LJFF(this.LIZ, c199a.LIZ) && Intrinsics.LJFF(this.LIZIZ, c199a.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(fragmentClass=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dynamicParentScene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C199A(Class<? extends InterfaceC214902198i> cls, C214932199m c214932199m) {
        this.LIZ = cls;
        this.LIZIZ = c214932199m;
    }
}
