package X;

import com.bytedance.android.livesdk.model.Board;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078550eAn {
    public final Board LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1078550eAn)) {
            return false;
        }
        C1078550eAn c1078550eAn = (C1078550eAn) obj;
        return Intrinsics.LJFF(this.LIZ, c1078550eAn.LIZ) && this.LIZIZ == c1078550eAn.LIZIZ;
    }

    public final int hashCode() {
        Board board = this.LIZ;
        return ((board == null ? 0 : board.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudienceDecorationWrapper(board=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1078550eAn(int i, Board board) {
        this.LIZ = board;
        this.LIZIZ = i;
    }
}
