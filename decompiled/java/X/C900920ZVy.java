package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZVy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900920ZVy {
    public final C0ZW2<C0ZW8> LIZ;
    public final C0ZW2<C0ZW8> LIZIZ;
    public final C0ZW2<C0ZW8> LIZJ;
    public final C0ZW2<C0ZW8> LIZLLL;

    public C900920ZVy() {
        this(null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C900920ZVy)) {
            return false;
        }
        C900920ZVy c900920ZVy = (C900920ZVy) obj;
        return Intrinsics.LJFF(this.LIZ, c900920ZVy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c900920ZVy.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c900920ZVy.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c900920ZVy.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnClickBasedOnImageLoadingState(onInit=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onLoading=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onSuccess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onFail=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C900920ZVy(C0ZW2 c0zw2, C0ZW2 c0zw22, int i) {
        C0ZW2<C0ZW8> c0zw23;
        C0ZW2<C0ZW8> c0zw24;
        if ((i & 1) != 0) {
            c0zw23 = new C0ZW2<>(Unit.LIZ, null);
        } else {
            c0zw23 = null;
        }
        if ((i & 2) != 0) {
            c0zw24 = new C0ZW2<>(Unit.LIZ, null);
        } else {
            c0zw24 = null;
        }
        c0zw2 = (i & 4) != 0 ? new C0ZW2(Unit.LIZ, null) : c0zw2;
        c0zw22 = (i & 8) != 0 ? new C0ZW2(Unit.LIZ, null) : c0zw22;
        this.LIZ = c0zw23;
        this.LIZIZ = c0zw24;
        this.LIZJ = c0zw2;
        this.LIZLLL = c0zw22;
    }
}
