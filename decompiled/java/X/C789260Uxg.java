package X;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uxg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789260Uxg implements InterfaceC789250Uxf {
    public final View LIZ;
    public final Function0<View> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C789260Uxg)) {
            return false;
        }
        C789260Uxg c789260Uxg = (C789260Uxg) obj;
        return Intrinsics.LJFF(this.LIZ, c789260Uxg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c789260Uxg.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClonedView(originalView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", viewFactory=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C789260Uxg(View view, AwS568S0100000_24 awS568S0100000_24) {
        this.LIZ = view;
        this.LIZIZ = awS568S0100000_24;
    }
}
