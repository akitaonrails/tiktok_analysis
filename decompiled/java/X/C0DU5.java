package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DU5, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DU5 {
    public final int LIZ;
    public final int LIZIZ;
    public final Function1<Context, Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DU5)) {
            return false;
        }
        C0DU5 c0du5 = (C0DU5) obj;
        return this.LIZ == c0du5.LIZ && this.LIZIZ == c0du5.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0du5.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GrowGroupAction(iconRes=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", textRes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0DU5(int i, int i2, Function1<? super Context, Unit> function1) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = function1;
    }
}
