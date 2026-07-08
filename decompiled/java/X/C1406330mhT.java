package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mhT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406330mhT extends AbstractC1406770miB {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1406330mhT) && Intrinsics.LJFF(this.LIZ, ((C1406330mhT) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClearPropSearchText(panelUnfold=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1406330mhT(String str) {
        this.LIZ = str;
    }
}
