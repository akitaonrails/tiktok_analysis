package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07VH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07VH implements C07VI {
    public final Context LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07VH) && Intrinsics.LJFF(this.LIZ, ((C07VH) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CellClick(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07VH(Context context) {
        this.LIZ = context;
    }
}
