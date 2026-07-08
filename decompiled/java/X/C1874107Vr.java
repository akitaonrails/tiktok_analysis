package X;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07Vr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1874107Vr implements InterfaceC1874207Vs {
    public final Context LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1874107Vr) && Intrinsics.LJFF(this.LIZ, ((C1874107Vr) obj).LIZ);
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

    public C1874107Vr(Context context) {
        this.LIZ = context;
    }
}
