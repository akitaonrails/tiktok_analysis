package X;

import com.tiktok.ttm.ttmparam.container.TTMContainer;
import kotlin.jvm.internal.AwS17S1100100_35;
import kotlin.jvm.internal.AwS1S1100010_35;
import kotlin.jvm.internal.AwS40S1101000_35;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DYZ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DYZ extends TTMContainer {
    public C1DYZ() {
        super(false);
    }

    public final String toString() {
        String str;
        Object objTryCatch = tryCatch(new AwS579S0100000_35(this, 186));
        return (!(objTryCatch instanceof String) || (str = (String) objTryCatch) == null) ? "{}" : str;
    }

    public C1DYZ(long j) {
        super(j, false);
    }

    public final double LIZ(String str, double d) {
        Object objTryCatch = tryCatch(new AwS1S1100010_35(this, str, d, 0));
        if (objTryCatch == null) {
            objTryCatch = Double.valueOf(d);
        }
        return ((Double) objTryCatch).doubleValue();
    }

    public final int LIZIZ(String str, int i) {
        return (int) LIZJ(str, i);
    }

    public final long LIZJ(String str, long j) {
        Object objTryCatch = tryCatch(new AwS17S1100100_35(this, str, j, 0));
        if (objTryCatch == null) {
            objTryCatch = Long.valueOf(j);
        }
        return ((Long) objTryCatch).longValue();
    }

    public final void LIZLLL(String str, double d) {
        tryCatch(new AwS1S1100010_35(this, str, d, 1));
    }

    public final void LJ(String str, int i) {
        tryCatch(new AwS40S1101000_35(this, str, i, 1));
    }
}
