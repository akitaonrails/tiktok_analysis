package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04hA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1165404hA {
    public final Object LIZ;
    public final Function1<Throwable, Unit> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1165404hA)) {
            return false;
        }
        C1165404hA c1165404hA = (C1165404hA) obj;
        return Intrinsics.LJFF(this.LIZ, c1165404hA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1165404hA.LIZIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompletedWithCancellation(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onCancellation=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1165404hA(Function1 function1, Object obj) {
        this.LIZ = obj;
        this.LIZIZ = function1;
    }
}
