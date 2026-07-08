package X;

import com.bytedance.android.livesdk.model.BoardItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556390qbV extends AbstractC1556400qbW {
    public final BoardItem LIZ;
    public final boolean LIZIZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556390qbV)) {
            return false;
        }
        C1556390qbV c1556390qbV = (C1556390qbV) obj;
        return Intrinsics.LJFF(this.LIZ, c1556390qbV.LIZ) && this.LIZIZ == c1556390qbV.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Item(boardItem=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exitAllOnBack=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1556390qbV(BoardItem boardItem) {
        this.LIZ = boardItem;
    }
}
