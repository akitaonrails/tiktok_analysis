package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mCH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386990mCH extends AbstractC1387030mCL {
    public final String LIZ;

    public C1386990mCH() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1386990mCH) && Intrinsics.LJFF(this.LIZ, ((C1386990mCH) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Loading(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1386990mCH(int i) {
        this.LIZ = "loading";
    }
}
