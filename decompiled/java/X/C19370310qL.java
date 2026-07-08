package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10qL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19370310qL {
    public final Object LIZ;
    public final AbstractC2236208pU LIZIZ;
    public final Function1<Throwable, Unit> LIZJ;
    public final Object LIZLLL;
    public final Throwable LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19370310qL)) {
            return false;
        }
        C19370310qL c19370310qL = (C19370310qL) obj;
        return Intrinsics.LJFF(this.LIZ, c19370310qL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19370310qL.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c19370310qL.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c19370310qL.LIZLLL) && Intrinsics.LJFF(this.LJ, c19370310qL.LJ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC2236208pU abstractC2236208pU = this.LIZIZ;
        int iHashCode2 = (iHashCode + (abstractC2236208pU == null ? 0 : abstractC2236208pU.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Object obj2 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.LJ;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompletedContinuation(result=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cancelHandler=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onCancellation=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", idempotentResume=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", cancelCause=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C19370310qL LIZ(C19370310qL c19370310qL, AbstractC2236208pU abstractC2236208pU, Throwable th, int i) {
        Object obj;
        Function1<Throwable, Unit> function1;
        Throwable th2 = th;
        AbstractC2236208pU abstractC2236208pU2 = abstractC2236208pU;
        Object obj2 = null;
        if ((i & 1) != 0) {
            obj = c19370310qL.LIZ;
        } else {
            obj = null;
        }
        if ((i & 2) != 0) {
            abstractC2236208pU2 = c19370310qL.LIZIZ;
        }
        if ((i & 4) != 0) {
            function1 = c19370310qL.LIZJ;
        } else {
            function1 = null;
        }
        if ((i & 8) != 0) {
            obj2 = c19370310qL.LIZLLL;
        }
        if ((i & 16) != 0) {
            th2 = c19370310qL.LJ;
        }
        c19370310qL.getClass();
        return new C19370310qL(obj, abstractC2236208pU2, function1, obj2, th2);
    }

    public /* synthetic */ C19370310qL(Object obj, AbstractC2236208pU abstractC2236208pU, Function1 function1, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : abstractC2236208pU, (Function1<? super Throwable, Unit>) ((i & 4) != 0 ? null : function1), (Object) null, (i & 16) != 0 ? null : th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19370310qL(Object obj, AbstractC2236208pU abstractC2236208pU, Function1<? super Throwable, Unit> function1, Object obj2, Throwable th) {
        this.LIZ = obj;
        this.LIZIZ = abstractC2236208pU;
        this.LIZJ = function1;
        this.LIZLLL = obj2;
        this.LJ = th;
    }
}
