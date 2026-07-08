package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07V9, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07V9 implements C07VA {
    public final Context LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C07V9) && Intrinsics.LJFF(this.LIZ, ((C07V9) obj).LIZ);
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

    public C07V9(Context context) {
        this.LIZ = context;
    }
}
