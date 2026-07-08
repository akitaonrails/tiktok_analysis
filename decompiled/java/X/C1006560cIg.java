package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS417S0200000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cIg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006560cIg {
    public final long LIZ;
    public final Function0<Unit> LIZIZ;
    public final AtomicBoolean LIZJ;

    public C1006560cIg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1006560cIg)) {
            return false;
        }
        C1006560cIg c1006560cIg = (C1006560cIg) obj;
        return this.LIZ == c1006560cIg.LIZ && Intrinsics.LJFF(this.LIZIZ, c1006560cIg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1006560cIg.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingTask(cardId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cancelled=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1006560cIg(long j, AwS417S0200000_16 awS417S0200000_16) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.LIZ = j;
        this.LIZIZ = awS417S0200000_16;
        this.LIZJ = atomicBoolean;
    }
}
