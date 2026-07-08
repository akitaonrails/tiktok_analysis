package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461020I6a<T> {
    public final T LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C461020I6a)) {
            return false;
        }
        C461020I6a c461020I6a = (C461020I6a) obj;
        return Intrinsics.LJFF(this.LIZ, c461020I6a.LIZ) && this.LIZIZ == c461020I6a.LIZIZ;
    }

    public final int hashCode() {
        T t = this.LIZ;
        return ((t == null ? 0 : t.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotContent(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", shouldAssemble=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C461020I6a(T t, boolean z) {
        this.LIZ = t;
        this.LIZIZ = z;
    }
}
