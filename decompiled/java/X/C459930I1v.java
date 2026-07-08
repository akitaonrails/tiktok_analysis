package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I1v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C459930I1v implements C0I25 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C459930I1v) && Intrinsics.LJFF(this.LIZ, ((C459930I1v) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Legacy(content=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C459930I1v(String str) {
        this.LIZ = str;
    }
}
