package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03Ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C850403Ty {
    public final C03U7 LIZ;
    public final View LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C850403Ty)) {
            return false;
        }
        C850403Ty c850403Ty = (C850403Ty) obj;
        return this.LIZ == c850403Ty.LIZ && Intrinsics.LJFF(this.LIZIZ, c850403Ty.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        View view = this.LIZIZ;
        return iHashCode + (view == null ? 0 : view.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FinishOspInfo(reason=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", view=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C850403Ty(C03U7 c03u7, View view) {
        this.LIZ = c03u7;
        this.LIZIZ = view;
    }
}
