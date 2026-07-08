package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZVi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900760ZVi implements InterfaceC900840ZVq {
    public final C1622006Ws<Function1<View, Unit>> LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C900760ZVi) && Intrinsics.LJFF(this.LIZ, ((C900760ZVi) obj).LIZ);
    }

    public final int hashCode() {
        this.LIZ.getClass();
        return 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoSwapReceiveMask(onRevealClick=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C900760ZVi(C1622006Ws<Function1<View, Unit>> c1622006Ws) {
        this.LIZ = c1622006Ws;
    }
}
