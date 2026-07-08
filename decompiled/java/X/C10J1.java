package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10J1, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10J1 implements C10J2, C10J0 {
    public final Function1<Boolean, Unit> LIZ;
    public final Function1<View, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10J1)) {
            return false;
        }
        C10J1 c10j1 = (C10J1) obj;
        return Intrinsics.LJFF(this.LIZ, c10j1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c10j1.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Function1<View, Unit> function1 = this.LIZIZ;
        return iHashCode + (function1 == null ? 0 : function1.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DisclosureCellPublishOptionActions(onClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onOptionShow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C10J0
    public final Function1<View, Unit> LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C10J2
    public final Function1<Boolean, Unit> LJIILJJIL() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10J1(Function1<? super Boolean, Unit> function1, Function1<? super View, Unit> function12) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        new AwS572S0100000_28(this, 704);
    }
}
