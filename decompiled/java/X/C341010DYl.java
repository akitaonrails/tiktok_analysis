package X;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DYl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341010DYl implements InterfaceC910110Zn7 {
    public final float LIZ;
    public final long LIZIZ;
    public final TimeInterpolator LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C341010DYl)) {
            return false;
        }
        C341010DYl c341010DYl = (C341010DYl) obj;
        return Float.compare(this.LIZ, c341010DYl.LIZ) == 0 && this.LIZIZ == c341010DYl.LIZIZ && Intrinsics.LJFF(this.LIZJ, c341010DYl.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TranslateY(translateDpFloat=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timeInterpolator=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public C341010DYl(float f, long j) {
        Interpolator interpolatorLJIILIIL = C1619980sG4.LJIILIIL();
        this.LIZ = f;
        this.LIZIZ = j;
        this.LIZJ = interpolatorLJIILIIL;
    }
}
