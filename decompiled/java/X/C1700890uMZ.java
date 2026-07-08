package X;

import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uMZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700890uMZ extends AbstractC1700910uMb implements InterfaceC490060JJs {
    public final Board LIZ;
    public final Function1<? super Boolean, Unit> LIZIZ;
    public final Board LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1700890uMZ)) {
            return false;
        }
        C1700890uMZ c1700890uMZ = (C1700890uMZ) obj;
        return Intrinsics.LJFF(this.LIZ, c1700890uMZ.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1700890uMZ.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActiveBoard(board=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", appliedCallback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC490060JJs
    public final Board LIZIZ() {
        return this.LIZJ;
    }

    public /* synthetic */ C1700890uMZ(Board board) {
        this(board, AFwS231S0000000_3.get$arr$(295));
    }

    public C1700890uMZ(Board board, Function1<? super Boolean, Unit> function1) {
        this.LIZ = board;
        this.LIZIZ = function1;
        this.LIZJ = board;
    }
}
