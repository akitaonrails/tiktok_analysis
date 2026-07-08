package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eqj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377270Eqj {
    public final List<C377380Equ> LIZ;
    public final List<C377380Equ> LIZIZ;
    public final List<C377380Equ> LIZJ;
    public final int LIZLLL;

    public C377270Eqj() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377270Eqj)) {
            return false;
        }
        C377270Eqj c377270Eqj = (C377270Eqj) obj;
        return Intrinsics.LJFF(this.LIZ, c377270Eqj.LIZ) && Intrinsics.LJFF(this.LIZIZ, c377270Eqj.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c377270Eqj.LIZJ) && this.LIZLLL == c377270Eqj.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncTasksStates(completedTasks=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uncompletedTasks=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", failedTasks=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", numOfProcessingTasks=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C377270Eqj(int i) {
        C13BV c13bv = C13BV.INSTANCE;
        this(c13bv, c13bv, c13bv, 0);
    }

    public C377270Eqj(List<C377380Equ> list, List<C377380Equ> list2, List<C377380Equ> list3, int i) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = i;
    }
}
