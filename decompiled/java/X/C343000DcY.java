package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DcY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343000DcY implements InterfaceC1175904ir {
    public final Function1<View, Unit> LIZ;
    public final Function1<View, Boolean> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C343000DcY)) {
            return false;
        }
        C343000DcY c343000DcY = (C343000DcY) obj;
        return Intrinsics.LJFF(this.LIZ, c343000DcY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c343000DcY.LIZIZ);
    }

    public final int hashCode() {
        Function1<View, Unit> function1 = this.LIZ;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<View, Boolean> function12 = this.LIZIZ;
        return iHashCode + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InputBtnAction(onClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onLongClick=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C343000DcY(Function1<? super View, Unit> function1, Function1<? super View, Boolean> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
    }
}
