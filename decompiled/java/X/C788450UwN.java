package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788450UwN {
    public final View LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788450UwN)) {
            return false;
        }
        C788450UwN c788450UwN = (C788450UwN) obj;
        return Intrinsics.LJFF(this.LIZ, c788450UwN.LIZ) && Intrinsics.LJFF(this.LIZIZ, c788450UwN.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OuterCellSharedElementTarget(view=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", contentAid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788450UwN(View view, String str) {
        this.LIZ = view;
        this.LIZIZ = str;
    }
}
