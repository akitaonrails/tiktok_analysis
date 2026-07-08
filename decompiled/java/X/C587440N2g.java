package X;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587440N2g {
    public final Function0<View> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C587440N2g)) {
            return false;
        }
        C587440N2g c587440N2g = (C587440N2g) obj;
        return Intrinsics.LJFF(this.LIZ, c587440N2g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c587440N2g.LIZIZ) && this.LIZJ == c587440N2g.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeleteConfig(activeDeleteViewProvider=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", canDeleteProvider=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mobOperationBeforeDeleteReport=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C587440N2g(Function0<? extends View> function0, Function0<Boolean> function02, boolean z) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = z;
    }
}
