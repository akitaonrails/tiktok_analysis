package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07VT, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07VT implements C07VU {
    public final Context LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07VT) && Intrinsics.LJFF(this.LIZ, ((C07VT) obj).LIZ);
    }

    public final int hashCode() {
        Context context = this.LIZ;
        if (context == null) {
            return 0;
        }
        return context.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CellClick(context=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07VT(Context context) {
        this.LIZ = context;
    }
}
