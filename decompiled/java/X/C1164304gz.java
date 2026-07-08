package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1164304gz {
    public final int LIZ;
    public final int LIZIZ;
    public final Function2<? super View, ? super Integer, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164304gz)) {
            return false;
        }
        C1164304gz c1164304gz = (C1164304gz) obj;
        return this.LIZ == c1164304gz.LIZ && this.LIZIZ == c1164304gz.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1164304gz.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RegenerateAnswerActionConfig(currentAnswerIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalAnswerCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", clickCallback=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1164304gz() {
        this(0, 0, AFwS285S0000000_2.get$arr$(53));
    }

    public C1164304gz(int i, int i2, Function2<? super View, ? super Integer, Unit> function2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = function2;
    }
}
