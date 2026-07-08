package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Ux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1872107Ux implements InterfaceC1872207Uy {
    public final Context LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1872107Ux) && Intrinsics.LJFF(this.LIZ, ((C1872107Ux) obj).LIZ);
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

    public C1872107Ux(Context context) {
        this.LIZ = context;
    }
}
