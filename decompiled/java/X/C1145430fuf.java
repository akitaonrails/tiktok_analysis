package X;

import com.bytedance.android.livesdk.model.Board;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fuf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145430fuf extends AbstractC1145470fuj {
    public final Board LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1145430fuf) && Intrinsics.LJFF(this.LIZ, ((C1145430fuf) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActiveBoard(board=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1145430fuf(Board board) {
        this.LIZ = board;
    }
}
