package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yYZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862090yYZ extends AbstractC1862080yYY {
    public final String LIZJ = "click_close";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1862090yYZ) && Intrinsics.LJFF(this.LIZJ, ((C1862090yYZ) obj).LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickClose(value=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
