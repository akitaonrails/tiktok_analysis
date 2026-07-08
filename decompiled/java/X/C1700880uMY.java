package X;

import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uMY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1700880uMY extends AbstractC1700910uMb implements InterfaceC490060JJs {
    public final Board LIZ;
    public final Board LIZIZ;
    public final Function1<? super Boolean, Unit> LIZJ;
    public final Board LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1700880uMY)) {
            return false;
        }
        C1700880uMY c1700880uMY = (C1700880uMY) obj;
        return Intrinsics.LJFF(this.LIZ, c1700880uMY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1700880uMY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1700880uMY.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreviewBoard(previewBoard=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", previouslyActiveBoard=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", appliedCallback=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC490060JJs
    public final Board LIZIZ() {
        return this.LIZLLL;
    }

    public C1700880uMY(Board board, Board board2, Function1<? super Boolean, Unit> function1) {
        this.LIZ = board;
        this.LIZIZ = board2;
        this.LIZJ = function1;
        this.LIZLLL = board;
    }
}
