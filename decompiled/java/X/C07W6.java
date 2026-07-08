package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07W6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07W6 implements C07W7 {
    public final Context LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07W6)) {
            return false;
        }
        C07W6 c07w6 = (C07W6) obj;
        return Intrinsics.LJFF(this.LIZ, c07w6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c07w6.LIZIZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CellClick(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07W6(Context context, String str) {
        this.LIZ = context;
        this.LIZIZ = str;
    }
}
