package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l0V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341250l0V extends AbstractC1341290l0Z {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1341250l0V) && Intrinsics.LJFF(this.LIZ, ((C1341250l0V) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Commerce(url=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1341250l0V(String str) {
        super(0);
        this.LIZ = str;
    }
}
