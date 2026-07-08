package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a0Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918360a0Q {
    public final Function0<Unit> LIZ;
    public final Function1<C918610a0p, Unit> LIZIZ;
    public final Function1<C918230a0D, Unit> LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C918360a0Q() {
        this(7, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C918360a0Q)) {
            return false;
        }
        C918360a0Q c918360a0Q = (C918360a0Q) obj;
        return Intrinsics.LJFF(this.LIZ, c918360a0Q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c918360a0Q.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c918360a0Q.LIZJ);
    }

    public final int hashCode() {
        Function0<Unit> function0 = this.LIZ;
        int iHashCode = (function0 == null ? 0 : function0.hashCode()) * 31;
        Function1<C918610a0p, Unit> function1 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function1<C918230a0D, Unit> function12 = this.LIZJ;
        return iHashCode2 + (function12 != null ? function12.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteCallbacks(onPreCheckPassed=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onPreCheckCompleted=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onExecuteResult=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C918360a0Q LIZ(C918360a0Q c918360a0Q, Function1 function1) {
        Function0<Unit> function0 = c918360a0Q.LIZ;
        Function1<C918610a0p, Unit> function12 = c918360a0Q.LIZIZ;
        c918360a0Q.getClass();
        return new C918360a0Q(function0, function12, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C918360a0Q(Function0<Unit> function0, Function1<? super C918610a0p, Unit> function1, Function1<? super C918230a0D, Unit> function12) {
        this.LIZ = function0;
        this.LIZIZ = function1;
        this.LIZJ = function12;
    }

    public /* synthetic */ C918360a0Q(int i, Function0 function0, Function1 function1, Function1 function12) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function1, (i & 4) != 0 ? null : function12);
    }
}
