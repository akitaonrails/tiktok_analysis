package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1167704hX extends AbstractC1167804hY {
    public final C1167304hT LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1167704hX) && Intrinsics.LJFF(this.LIZ, ((C1167704hX) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AppendLast(albumPickerItemData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1167704hX(C1167304hT c1167304hT) {
        this.LIZ = c1167304hT;
    }
}
