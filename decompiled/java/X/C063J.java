package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.063J, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C063J implements C063K {
    public final String LIZ = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C063J) && Intrinsics.LJFF(this.LIZ, ((C063J) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ScrollToAndHighlightItem(itemKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
