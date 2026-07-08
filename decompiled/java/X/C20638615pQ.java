package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.15pQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20638615pQ {
    public final String LIZ;
    public final long LIZIZ;
    public final Function0<Long> LIZJ;
    public final Function0<Unit> LIZLLL;
    public long LJ;
    public long LJFF;
    public boolean LJI;

    public final void LIZ() {
        long jLongValue = this.LJFF + (this.LJ != -1 ? this.LIZJ.invoke().longValue() - this.LJ : 0L);
        if (this.LJI) {
            return;
        }
        long j = this.LIZIZ;
        if (j <= 0 || jLongValue < j) {
            return;
        }
        this.LJI = true;
        this.LIZLLL.invoke();
    }

    public final void LIZIZ() {
        if (this.LJ != -1) {
            this.LJFF += this.LIZJ.invoke().longValue() - this.LJ;
            this.LJ = -1L;
        }
        LIZ();
    }

    public final void LIZJ() {
        if (this.LJI || this.LJ != -1) {
            return;
        }
        this.LJ = this.LIZJ.invoke().longValue();
        LIZ();
    }

    public C20638615pQ(String str, long j, AwS575S0100000_31 awS575S0100000_31) {
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(1317);
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = aFwS187S0000000_2;
        this.LIZLLL = awS575S0100000_31;
        this.LJ = -1L;
    }
}
