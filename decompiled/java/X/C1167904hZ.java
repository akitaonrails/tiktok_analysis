package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1167904hZ extends AbstractC1167804hY {
    public final C1167304hT LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1167904hZ)) {
            return false;
        }
        C1167904hZ c1167904hZ = (C1167904hZ) obj;
        return Intrinsics.LJFF(this.LIZ, c1167904hZ.LIZ) && this.LIZIZ == c1167904hZ.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Insert(albumPickerItemData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", targetIndex=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1167904hZ(int i, C1167304hT c1167304hT) {
        this.LIZ = c1167304hT;
        this.LIZIZ = i;
    }
}
