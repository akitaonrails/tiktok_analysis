package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tJM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1660460tJM {
    public final Function1<View, Unit> LIZ;
    public final Function1<View, Unit> LIZIZ;
    public final Function1<C1695920uEY, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1660460tJM)) {
            return false;
        }
        C1660460tJM c1660460tJM = (C1660460tJM) obj;
        return Intrinsics.LJFF(this.LIZ, c1660460tJM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1660460tJM.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1660460tJM.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RevealFakeDualCameraShootActions(onCaptureAnimationEnd=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requestLayoutBackground=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", requestLayoutForeground=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1660460tJM(C1660450tJL c1660450tJL, C1660490tJP c1660490tJP, C1660480tJO c1660480tJO) {
        this.LIZ = c1660450tJL;
        this.LIZIZ = c1660490tJP;
        this.LIZJ = c1660480tJO;
    }
}
