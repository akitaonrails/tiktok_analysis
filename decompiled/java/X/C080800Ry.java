package X;

import com.google.gson.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Ry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C080800Ry extends AbstractC399701gx {
    public final boolean LIZ;
    public final n LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C080800Ry)) {
            return false;
        }
        C080800Ry c080800Ry = (C080800Ry) obj;
        return this.LIZ == c080800Ry.LIZ && Intrinsics.LJFF(this.LIZIZ, c080800Ry.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateInteractiveEffectAction(isOpen=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", params=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C080800Ry(n nVar, boolean z) {
        this.LIZ = z;
        this.LIZIZ = nVar;
    }
}
