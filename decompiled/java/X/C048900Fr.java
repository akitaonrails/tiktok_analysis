package X;

import com.bytedance.android.livesdk.model.Board;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Fr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C048900Fr {
    public final Board LIZ;
    public final boolean LIZIZ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C048900Fr)) {
            return false;
        }
        C048900Fr c048900Fr = (C048900Fr) obj;
        return Intrinsics.LJFF(this.LIZ, c048900Fr.LIZ) && this.LIZIZ == c048900Fr.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DecorationJumpToItemEditorData(board=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exitAll=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C048900Fr(Board board) {
        this.LIZ = board;
    }
}
