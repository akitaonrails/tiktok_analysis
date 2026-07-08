package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UPC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UPC {
    public final long LIZ;
    public final long LIZIZ;
    public final boolean LIZJ;
    public final InterfaceC20105613le LIZLLL;
    public final String LJ;

    public C0UPC() {
        this(0L, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0UPC)) {
            return false;
        }
        C0UPC c0upc = (C0UPC) obj;
        return this.LIZ == c0upc.LIZ && this.LIZIZ == c0upc.LIZIZ && this.LIZJ == c0upc.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0upc.LIZLLL) && Intrinsics.LJFF(this.LJ, c0upc.LJ);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SchedulerConfig(frameBudgetMs=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rescheduleDelayMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enableMetrics=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", schedulerLog=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0UPC(long j, C0UOV c0uov, String str, int i) {
        long j2;
        j = (i & 1) != 0 ? 4L : j;
        if ((i & 2) != 0) {
            j2 = 16;
        } else {
            j2 = 0;
        }
        InterfaceC20105613le interfaceC20105613le = (i & 8) != 0 ? new InterfaceC20105613le() { // from class: X.0UPD
            @Override // X.InterfaceC20105613le
            public final void d(String str2, String str3) {
            }

            @Override // X.InterfaceC20105613le
            public final void e(String str2, String str3) {
            }
        } : c0uov;
        str = (i & 16) != 0 ? "FramePacedScheduler" : str;
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = false;
        this.LIZLLL = interfaceC20105613le;
        this.LJ = str;
        if (j > 0) {
            if (j <= 16) {
                if (j2 >= 0) {
                    return;
                }
                "Reschedule delay must be non-negative".toString();
                throw new IllegalArgumentException("Reschedule delay must be non-negative");
            }
            "Frame budget should not exceed 16ms (one frame)".toString();
            throw new IllegalArgumentException("Frame budget should not exceed 16ms (one frame)");
        }
        "Frame budget must be positive".toString();
        throw new IllegalArgumentException("Frame budget must be positive");
    }
}
