package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS384S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1192680h8s {
    public final View LIZ;
    public final Function1<String, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1192680h8s)) {
            return false;
        }
        C1192680h8s c1192680h8s = (C1192680h8s) obj;
        return Intrinsics.LJFF(this.LIZ, c1192680h8s.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1192680h8s.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SummaryViewNode(renderingView=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", summaryUpdateCallback=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1192680h8s(C1193380hA0 c1193380hA0, AwS384S0200000_18 awS384S0200000_18) {
        this.LIZ = c1193380hA0;
        this.LIZIZ = awS384S0200000_18;
    }
}
